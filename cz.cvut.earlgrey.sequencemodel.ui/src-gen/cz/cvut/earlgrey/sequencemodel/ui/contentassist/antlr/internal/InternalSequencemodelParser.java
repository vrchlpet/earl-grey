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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_OPERATOR", "RULE_ANY_OTHER", "RULE_WS", "RULE_STRING", "RULE_BOOLEAN", "RULE_NULL", "RULE_NATURAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'e'", "'E'", "'+'", "'-'", "'import'", "'sequence'", "'end'", "','", "'if'", "'then'", "'elsif'", "'else'", "'foreach'", "'do'", "'while'", "'assert'", "'break'", "'next'", "'calls'", "'.'", "'('", "')'", "'creates'", "'returns'", "'destroys'", "':'", "'['", "']'", "'in'", "'..'", "'@'"
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:154:1: ruleParticipant : ( ( rule__Participant__NameAssignment ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:158:2: ( ( ( rule__Participant__NameAssignment ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:159:1: ( ( rule__Participant__NameAssignment ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:159:1: ( ( rule__Participant__NameAssignment ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:160:1: ( rule__Participant__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getNameAssignment()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:161:1: ( rule__Participant__NameAssignment )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:161:2: rule__Participant__NameAssignment
            {
            pushFollow(FOLLOW_rule__Participant__NameAssignment_in_ruleParticipant280);
            rule__Participant__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getNameAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:201:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:202:1: ( ruleFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:203:1: ruleFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment367);
            ruleFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment374); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:210:1: ruleFragment : ( ( rule__Fragment__Alternatives ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:214:2: ( ( ( rule__Fragment__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:215:1: ( ( rule__Fragment__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:215:1: ( ( rule__Fragment__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:216:1: ( rule__Fragment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFragmentAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:217:1: ( rule__Fragment__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:217:2: rule__Fragment__Alternatives
            {
            pushFollow(FOLLOW_rule__Fragment__Alternatives_in_ruleFragment400);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:229:1: entryRuleIfElseFragment : ruleIfElseFragment EOF ;
    public final void entryRuleIfElseFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:230:1: ( ruleIfElseFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:231:1: ruleIfElseFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment427);
            ruleIfElseFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseFragment434); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:238:1: ruleIfElseFragment : ( ( rule__IfElseFragment__Group__0 ) ) ;
    public final void ruleIfElseFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:242:2: ( ( ( rule__IfElseFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:243:1: ( ( rule__IfElseFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:243:1: ( ( rule__IfElseFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:244:1: ( rule__IfElseFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:245:1: ( rule__IfElseFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:245:2: rule__IfElseFragment__Group__0
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__0_in_ruleIfElseFragment460);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:257:1: entryRuleForeachFragment : ruleForeachFragment EOF ;
    public final void entryRuleForeachFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:258:1: ( ruleForeachFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:259:1: ruleForeachFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment487);
            ruleForeachFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachFragment494); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:266:1: ruleForeachFragment : ( ( rule__ForeachFragment__Group__0 ) ) ;
    public final void ruleForeachFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:270:2: ( ( ( rule__ForeachFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:271:1: ( ( rule__ForeachFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:271:1: ( ( rule__ForeachFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:272:1: ( rule__ForeachFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:273:1: ( rule__ForeachFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:273:2: rule__ForeachFragment__Group__0
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__0_in_ruleForeachFragment520);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:285:1: entryRuleLoopFragment : ruleLoopFragment EOF ;
    public final void entryRuleLoopFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:286:1: ( ruleLoopFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:287:1: ruleLoopFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment547);
            ruleLoopFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopFragment554); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:294:1: ruleLoopFragment : ( ( rule__LoopFragment__Group__0 ) ) ;
    public final void ruleLoopFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:298:2: ( ( ( rule__LoopFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:299:1: ( ( rule__LoopFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:299:1: ( ( rule__LoopFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:300:1: ( rule__LoopFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:301:1: ( rule__LoopFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:301:2: rule__LoopFragment__Group__0
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__0_in_ruleLoopFragment580);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:313:1: entryRuleAssertFragment : ruleAssertFragment EOF ;
    public final void entryRuleAssertFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:314:1: ( ruleAssertFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:315:1: ruleAssertFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment607);
            ruleAssertFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertFragment614); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:322:1: ruleAssertFragment : ( ( rule__AssertFragment__Group__0 ) ) ;
    public final void ruleAssertFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:326:2: ( ( ( rule__AssertFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:327:1: ( ( rule__AssertFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:327:1: ( ( rule__AssertFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:328:1: ( rule__AssertFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:329:1: ( rule__AssertFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:329:2: rule__AssertFragment__Group__0
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__0_in_ruleAssertFragment640);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:341:1: entryRuleBreakFragment : ruleBreakFragment EOF ;
    public final void entryRuleBreakFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:342:1: ( ruleBreakFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:343:1: ruleBreakFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment667);
            ruleBreakFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakFragment674); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:350:1: ruleBreakFragment : ( ( rule__BreakFragment__Group__0 ) ) ;
    public final void ruleBreakFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:354:2: ( ( ( rule__BreakFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:355:1: ( ( rule__BreakFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:355:1: ( ( rule__BreakFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:356:1: ( rule__BreakFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:357:1: ( rule__BreakFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:357:2: rule__BreakFragment__Group__0
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group__0_in_ruleBreakFragment700);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:369:1: entryRuleNextFragment : ruleNextFragment EOF ;
    public final void entryRuleNextFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:370:1: ( ruleNextFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:371:1: ruleNextFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleNextFragment_in_entryRuleNextFragment727);
            ruleNextFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextFragment734); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:378:1: ruleNextFragment : ( ( rule__NextFragment__Group__0 ) ) ;
    public final void ruleNextFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:382:2: ( ( ( rule__NextFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:383:1: ( ( rule__NextFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:383:1: ( ( rule__NextFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:384:1: ( rule__NextFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:385:1: ( rule__NextFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:385:2: rule__NextFragment__Group__0
            {
            pushFollow(FOLLOW_rule__NextFragment__Group__0_in_ruleNextFragment760);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:397:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:398:1: ( ruleMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:399:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage787);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage794); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:406:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:410:2: ( ( ( rule__Message__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:411:1: ( ( rule__Message__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:411:1: ( ( rule__Message__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:412:1: ( rule__Message__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:413:1: ( rule__Message__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:413:2: rule__Message__Alternatives
            {
            pushFollow(FOLLOW_rule__Message__Alternatives_in_ruleMessage820);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:425:1: entryRuleCallMessage : ruleCallMessage EOF ;
    public final void entryRuleCallMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:426:1: ( ruleCallMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:427:1: ruleCallMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageRule()); 
            }
            pushFollow(FOLLOW_ruleCallMessage_in_entryRuleCallMessage847);
            ruleCallMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallMessage854); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:434:1: ruleCallMessage : ( ( rule__CallMessage__Group__0 ) ) ;
    public final void ruleCallMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:438:2: ( ( ( rule__CallMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:439:1: ( ( rule__CallMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:439:1: ( ( rule__CallMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:440:1: ( rule__CallMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:441:1: ( rule__CallMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:441:2: rule__CallMessage__Group__0
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__0_in_ruleCallMessage880);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:453:1: entryRuleNewMessage : ruleNewMessage EOF ;
    public final void entryRuleNewMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:454:1: ( ruleNewMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:455:1: ruleNewMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageRule()); 
            }
            pushFollow(FOLLOW_ruleNewMessage_in_entryRuleNewMessage907);
            ruleNewMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMessage914); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:462:1: ruleNewMessage : ( ( rule__NewMessage__Group__0 ) ) ;
    public final void ruleNewMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:466:2: ( ( ( rule__NewMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:467:1: ( ( rule__NewMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:467:1: ( ( rule__NewMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:468:1: ( rule__NewMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:469:1: ( rule__NewMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:469:2: rule__NewMessage__Group__0
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__0_in_ruleNewMessage940);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:481:1: entryRuleReturnMessage : ruleReturnMessage EOF ;
    public final void entryRuleReturnMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:482:1: ( ruleReturnMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:483:1: ruleReturnMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageRule()); 
            }
            pushFollow(FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage967);
            ruleReturnMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnMessage974); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:490:1: ruleReturnMessage : ( ( rule__ReturnMessage__Group__0 ) ) ;
    public final void ruleReturnMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:494:2: ( ( ( rule__ReturnMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:495:1: ( ( rule__ReturnMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:495:1: ( ( rule__ReturnMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:496:1: ( rule__ReturnMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:497:1: ( rule__ReturnMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:497:2: rule__ReturnMessage__Group__0
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__0_in_ruleReturnMessage1000);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:509:1: entryRuleDeleteMessage : ruleDeleteMessage EOF ;
    public final void entryRuleDeleteMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:510:1: ( ruleDeleteMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:511:1: ruleDeleteMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage1027);
            ruleDeleteMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteMessage1034); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:518:1: ruleDeleteMessage : ( ( rule__DeleteMessage__Group__0 ) ) ;
    public final void ruleDeleteMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:522:2: ( ( ( rule__DeleteMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:523:1: ( ( rule__DeleteMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:523:1: ( ( rule__DeleteMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:524:1: ( rule__DeleteMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:525:1: ( rule__DeleteMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:525:2: rule__DeleteMessage__Group__0
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__0_in_ruleDeleteMessage1060);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:537:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:538:1: ( ruleParameter EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:539:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1087);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1094); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:546:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:550:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:551:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:551:1: ( ( rule__Parameter__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:552:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:553:1: ( rule__Parameter__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:553:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1120);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:565:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:566:1: ( ruleReference EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:567:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1147);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1154); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:574:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:578:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:579:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:579:1: ( ( rule__Reference__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:580:1: ( rule__Reference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:581:1: ( rule__Reference__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:581:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1180);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:593:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:594:1: ( ruleArray EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:595:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1207);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1214); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:602:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:606:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:607:1: ( ( rule__Array__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:607:1: ( ( rule__Array__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:608:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:609:1: ( rule__Array__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:609:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray1240);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:621:1: entryRuleForeachExpression : ruleForeachExpression EOF ;
    public final void entryRuleForeachExpression() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:625:1: ( ruleForeachExpression EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:626:1: ruleForeachExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression1272);
            ruleForeachExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachExpression1279); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:636:1: ruleForeachExpression : ( ( rule__ForeachExpression__Group__0 ) ) ;
    public final void ruleForeachExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:641:2: ( ( ( rule__ForeachExpression__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:642:1: ( ( rule__ForeachExpression__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:642:1: ( ( rule__ForeachExpression__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:643:1: ( rule__ForeachExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:644:1: ( rule__ForeachExpression__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:644:2: rule__ForeachExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group__0_in_ruleForeachExpression1309);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:657:1: entryRuleValueWithSpaces : ruleValueWithSpaces EOF ;
    public final void entryRuleValueWithSpaces() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:661:1: ( ruleValueWithSpaces EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:662:1: ruleValueWithSpaces EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueWithSpacesRule()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces1341);
            ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueWithSpacesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueWithSpaces1348); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:672:1: ruleValueWithSpaces : ( ( rule__ValueWithSpaces__Alternatives )* ) ;
    public final void ruleValueWithSpaces() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:677:2: ( ( ( rule__ValueWithSpaces__Alternatives )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:678:1: ( ( rule__ValueWithSpaces__Alternatives )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:678:1: ( ( rule__ValueWithSpaces__Alternatives )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:679:1: ( rule__ValueWithSpaces__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueWithSpacesAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:680:1: ( rule__ValueWithSpaces__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NATURAL)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:680:2: rule__ValueWithSpaces__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__ValueWithSpaces__Alternatives_in_ruleValueWithSpaces1378);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:693:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:694:1: ( ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:695:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1406);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1413); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:702:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:706:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:707:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:707:1: ( ( rule__Annotation__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:708:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:709:1: ( rule__Annotation__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:709:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1439);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:725:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:726:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:727:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1470);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1477); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:734:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:738:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:739:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:739:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:740:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:741:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:741:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1503);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:753:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:754:1: ( ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:755:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID1530);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID1537); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:762:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:766:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:767:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:767:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:768:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:769:1: ( rule__ExtendedID__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:769:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1563);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:783:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:784:1: ( ruleReal EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:785:1: ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal1592);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal1599); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:792:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:796:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:797:1: ( ( rule__Real__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:797:1: ( ( rule__Real__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:798:1: ( rule__Real__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:799:1: ( rule__Real__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:799:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal1625);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:811:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:812:1: ( ruleInteger EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:813:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger1652);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger1659); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:820:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:824:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:825:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:825:1: ( ( rule__Integer__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:826:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:827:1: ( rule__Integer__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:827:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger1685);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:839:1: rule__Transition__Alternatives : ( ( ruleMessage ) | ( ruleFragment ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:843:1: ( ( ruleMessage ) | ( ruleFragment ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==32||LA2_0==36||LA2_0==38) ) {
                alt2=1;
            }
            else if ( (LA2_0==22||LA2_0==26||(LA2_0>=28 && LA2_0<=31)) ) {
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:844:1: ( ruleMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:844:1: ( ruleMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:845:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__Transition__Alternatives1721);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:850:6: ( ruleFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:850:6: ( ruleFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:851:1: ruleFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getFragmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFragment_in_rule__Transition__Alternatives1738);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:861:1: rule__Fragment__Alternatives : ( ( ruleIfElseFragment ) | ( ruleForeachFragment ) | ( ruleAssertFragment ) | ( ruleLoopFragment ) | ( ruleBreakFragment ) | ( ruleNextFragment ) );
    public final void rule__Fragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:865:1: ( ( ruleIfElseFragment ) | ( ruleForeachFragment ) | ( ruleAssertFragment ) | ( ruleLoopFragment ) | ( ruleBreakFragment ) | ( ruleNextFragment ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 30:
                {
                alt3=5;
                }
                break;
            case 31:
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:866:1: ( ruleIfElseFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:866:1: ( ruleIfElseFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:867:1: ruleIfElseFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getIfElseFragmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIfElseFragment_in_rule__Fragment__Alternatives1770);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:872:6: ( ruleForeachFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:872:6: ( ruleForeachFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:873:1: ruleForeachFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getForeachFragmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleForeachFragment_in_rule__Fragment__Alternatives1787);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:878:6: ( ruleAssertFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:878:6: ( ruleAssertFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:879:1: ruleAssertFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getAssertFragmentParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAssertFragment_in_rule__Fragment__Alternatives1804);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:884:6: ( ruleLoopFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:884:6: ( ruleLoopFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:885:1: ruleLoopFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getLoopFragmentParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleLoopFragment_in_rule__Fragment__Alternatives1821);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:890:6: ( ruleBreakFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:890:6: ( ruleBreakFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:891:1: ruleBreakFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getBreakFragmentParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleBreakFragment_in_rule__Fragment__Alternatives1838);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:896:6: ( ruleNextFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:896:6: ( ruleNextFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:897:1: ruleNextFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getNextFragmentParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleNextFragment_in_rule__Fragment__Alternatives1855);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:907:1: rule__Message__Alternatives : ( ( ruleCallMessage ) | ( ruleNewMessage ) | ( ruleDeleteMessage ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:911:1: ( ( ruleCallMessage ) | ( ruleNewMessage ) | ( ruleDeleteMessage ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt4=3;
                    }
                    break;
                case 32:
                    {
                    alt4=1;
                    }
                    break;
                case 36:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 32:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 38:
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:912:1: ( ruleCallMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:912:1: ( ruleCallMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:913:1: ruleCallMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getCallMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCallMessage_in_rule__Message__Alternatives1887);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:918:6: ( ruleNewMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:918:6: ( ruleNewMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:919:1: ruleNewMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getNewMessageParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNewMessage_in_rule__Message__Alternatives1904);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:924:6: ( ruleDeleteMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:924:6: ( ruleDeleteMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:925:1: ruleDeleteMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getDeleteMessageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleDeleteMessage_in_rule__Message__Alternatives1921);
                    ruleDeleteMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageAccess().getDeleteMessageParserRuleCall_2()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:935:1: rule__ForeachExpression__Alternatives_2 : ( ( ( rule__ForeachExpression__Group_2_0__0 ) ) | ( RULE_ID ) );
    public final void rule__ForeachExpression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:939:1: ( ( ( rule__ForeachExpression__Group_2_0__0 ) ) | ( RULE_ID ) )
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:940:1: ( ( rule__ForeachExpression__Group_2_0__0 ) )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:940:1: ( ( rule__ForeachExpression__Group_2_0__0 ) )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:941:1: ( rule__ForeachExpression__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForeachExpressionAccess().getGroup_2_0()); 
                    }
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:942:1: ( rule__ForeachExpression__Group_2_0__0 )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:942:2: rule__ForeachExpression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__0_in_rule__ForeachExpression__Alternatives_21953);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:946:6: ( RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:946:6: ( RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:947:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_2_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForeachExpression__Alternatives_21971); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:957:1: rule__ValueWithSpaces__Alternatives : ( ( RULE_OPERATOR ) | ( ruleValue ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) );
    public final void rule__ValueWithSpaces__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:961:1: ( ( RULE_OPERATOR ) | ( ruleValue ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) )
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:962:1: ( RULE_OPERATOR )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:962:1: ( RULE_OPERATOR )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:963:1: RULE_OPERATOR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueWithSpacesAccess().getOPERATORTerminalRuleCall_0()); 
                    }
                    match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_rule__ValueWithSpaces__Alternatives2003); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueWithSpacesAccess().getOPERATORTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:968:6: ( ruleValue )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:968:6: ( ruleValue )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:969:1: ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueWithSpacesAccess().getValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValue_in_rule__ValueWithSpaces__Alternatives2020);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:974:6: ( RULE_ANY_OTHER )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:974:6: ( RULE_ANY_OTHER )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:975:1: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueWithSpacesAccess().getANY_OTHERTerminalRuleCall_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ValueWithSpaces__Alternatives2037); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueWithSpacesAccess().getANY_OTHERTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:980:6: ( RULE_WS )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:980:6: ( RULE_WS )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:981:1: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueWithSpacesAccess().getWSTerminalRuleCall_3()); 
                    }
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ValueWithSpaces__Alternatives2054); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:991:1: rule__Value__Alternatives : ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:995:1: ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_NATURAL) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_NATURAL)||LA7_2==17||LA7_2==23||LA7_2==27) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==33) ) {
                        alt7=6;
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

                if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_NATURAL)||LA7_2==17||LA7_2==23||LA7_2==27) ) {
                    alt7=1;
                }
                else if ( (LA7_2==33) ) {
                    alt7=6;
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:996:1: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:996:1: ( ruleInteger )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:997:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__Value__Alternatives2086);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1002:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1002:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1003:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives2103); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1008:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1008:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1009:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives2120);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1014:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1014:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1015:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives2137); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1020:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1020:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1021:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives2154); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1026:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1026:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1027:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__Value__Alternatives2171);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1038:1: rule__Real__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1042:1: ( ( 'e' ) | ( 'E' ) )
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1043:1: ( 'e' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1043:1: ( 'e' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1044:1: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Real__Alternatives_4_02205); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1051:6: ( 'E' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1051:6: ( 'E' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1052:1: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Real__Alternatives_4_02225); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1064:1: rule__Real__Alternatives_4_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1068:1: ( ( '+' ) | ( '-' ) )
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1069:1: ( '+' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1069:1: ( '+' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1070:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Real__Alternatives_4_12260); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1077:6: ( '-' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1077:6: ( '-' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1078:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Real__Alternatives_4_12280); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1092:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1096:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1097:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02312);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02315);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1104:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1108:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1109:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1109:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1110:1: ( rule__Model__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1111:1: ( rule__Model__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1111:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2342);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1121:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1125:1: ( rule__Model__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1126:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12373);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1132:1: rule__Model__Group__1__Impl : ( ( rule__Model__SequenceAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1136:1: ( ( ( rule__Model__SequenceAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1137:1: ( ( rule__Model__SequenceAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1137:1: ( ( rule__Model__SequenceAssignment_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1138:1: ( rule__Model__SequenceAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSequenceAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1139:1: ( rule__Model__SequenceAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19||LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1139:2: rule__Model__SequenceAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__SequenceAssignment_1_in_rule__Model__Group__1__Impl2400);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1153:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1157:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1158:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02435);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02438);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1165:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1169:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1170:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1170:1: ( 'import' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1171:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl2466); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1184:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1188:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1189:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12497);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1195:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1199:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1200:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1200:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1201:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1202:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1202:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2524);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1216:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1220:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1221:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02558);
            rule__Sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02561);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1228:1: rule__Sequence__Group__0__Impl : ( ( rule__Sequence__AnnotationAssignment_0 )* ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1232:1: ( ( ( rule__Sequence__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1233:1: ( ( rule__Sequence__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1233:1: ( ( rule__Sequence__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1234:1: ( rule__Sequence__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1235:1: ( rule__Sequence__AnnotationAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==44) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1235:2: rule__Sequence__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__AnnotationAssignment_0_in_rule__Sequence__Group__0__Impl2588);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1245:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1249:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1250:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12619);
            rule__Sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12622);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1257:1: rule__Sequence__Group__1__Impl : ( ( 'sequence' ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1261:1: ( ( ( 'sequence' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1262:1: ( ( 'sequence' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1262:1: ( ( 'sequence' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1263:1: ( 'sequence' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getSequenceKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1264:1: ( 'sequence' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1265:2: 'sequence'
            {
            match(input,19,FOLLOW_19_in_rule__Sequence__Group__1__Impl2651); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1276:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1280:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1281:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22683);
            rule__Sequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22686);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1288:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__NameAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1292:1: ( ( ( rule__Sequence__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1293:1: ( ( rule__Sequence__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1293:1: ( ( rule__Sequence__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1294:1: ( rule__Sequence__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1295:1: ( rule__Sequence__NameAssignment_2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1295:2: rule__Sequence__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_2_in_rule__Sequence__Group__2__Impl2713);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1305:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1309:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1310:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32743);
            rule__Sequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32746);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1317:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__ParticipantAssignment_3 ) ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1321:1: ( ( ( rule__Sequence__ParticipantAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1322:1: ( ( rule__Sequence__ParticipantAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1322:1: ( ( rule__Sequence__ParticipantAssignment_3 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1323:1: ( rule__Sequence__ParticipantAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getParticipantAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1324:1: ( rule__Sequence__ParticipantAssignment_3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1324:2: rule__Sequence__ParticipantAssignment_3
            {
            pushFollow(FOLLOW_rule__Sequence__ParticipantAssignment_3_in_rule__Sequence__Group__3__Impl2773);
            rule__Sequence__ParticipantAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1334:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl rule__Sequence__Group__5 ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1338:1: ( rule__Sequence__Group__4__Impl rule__Sequence__Group__5 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1339:2: rule__Sequence__Group__4__Impl rule__Sequence__Group__5
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42803);
            rule__Sequence__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__42806);
            rule__Sequence__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1346:1: rule__Sequence__Group__4__Impl : ( ( rule__Sequence__Group_4__0 )* ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1350:1: ( ( ( rule__Sequence__Group_4__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1351:1: ( ( rule__Sequence__Group_4__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1351:1: ( ( rule__Sequence__Group_4__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1352:1: ( rule__Sequence__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1353:1: ( rule__Sequence__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1353:2: rule__Sequence__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__Group_4__0_in_rule__Sequence__Group__4__Impl2833);
            	    rule__Sequence__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getGroup_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Sequence__Group__5"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1363:1: rule__Sequence__Group__5 : rule__Sequence__Group__5__Impl rule__Sequence__Group__6 ;
    public final void rule__Sequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1367:1: ( rule__Sequence__Group__5__Impl rule__Sequence__Group__6 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1368:2: rule__Sequence__Group__5__Impl rule__Sequence__Group__6
            {
            pushFollow(FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__52864);
            rule__Sequence__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__6_in_rule__Sequence__Group__52867);
            rule__Sequence__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__5"


    // $ANTLR start "rule__Sequence__Group__5__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1375:1: rule__Sequence__Group__5__Impl : ( ( rule__Sequence__TransitionAssignment_5 )* ) ;
    public final void rule__Sequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1379:1: ( ( ( rule__Sequence__TransitionAssignment_5 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1380:1: ( ( rule__Sequence__TransitionAssignment_5 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1380:1: ( ( rule__Sequence__TransitionAssignment_5 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1381:1: ( rule__Sequence__TransitionAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getTransitionAssignment_5()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1382:1: ( rule__Sequence__TransitionAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==22||LA14_0==26||(LA14_0>=28 && LA14_0<=32)||LA14_0==36||LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1382:2: rule__Sequence__TransitionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__TransitionAssignment_5_in_rule__Sequence__Group__5__Impl2894);
            	    rule__Sequence__TransitionAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getTransitionAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__5__Impl"


    // $ANTLR start "rule__Sequence__Group__6"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1392:1: rule__Sequence__Group__6 : rule__Sequence__Group__6__Impl ;
    public final void rule__Sequence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1396:1: ( rule__Sequence__Group__6__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1397:2: rule__Sequence__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__6__Impl_in_rule__Sequence__Group__62925);
            rule__Sequence__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__6"


    // $ANTLR start "rule__Sequence__Group__6__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1403:1: rule__Sequence__Group__6__Impl : ( 'end' ) ;
    public final void rule__Sequence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1407:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1408:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1408:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1409:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getEndKeyword_6()); 
            }
            match(input,20,FOLLOW_20_in_rule__Sequence__Group__6__Impl2953); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getEndKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__6__Impl"


    // $ANTLR start "rule__Sequence__Group_4__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1436:1: rule__Sequence__Group_4__0 : rule__Sequence__Group_4__0__Impl rule__Sequence__Group_4__1 ;
    public final void rule__Sequence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1440:1: ( rule__Sequence__Group_4__0__Impl rule__Sequence__Group_4__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1441:2: rule__Sequence__Group_4__0__Impl rule__Sequence__Group_4__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_4__0__Impl_in_rule__Sequence__Group_4__02998);
            rule__Sequence__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group_4__1_in_rule__Sequence__Group_4__03001);
            rule__Sequence__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__0"


    // $ANTLR start "rule__Sequence__Group_4__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1448:1: rule__Sequence__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Sequence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1452:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1453:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1453:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1454:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getCommaKeyword_4_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Sequence__Group_4__0__Impl3029); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__0__Impl"


    // $ANTLR start "rule__Sequence__Group_4__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1467:1: rule__Sequence__Group_4__1 : rule__Sequence__Group_4__1__Impl ;
    public final void rule__Sequence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1471:1: ( rule__Sequence__Group_4__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1472:2: rule__Sequence__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_4__1__Impl_in_rule__Sequence__Group_4__13060);
            rule__Sequence__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__1"


    // $ANTLR start "rule__Sequence__Group_4__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1478:1: rule__Sequence__Group_4__1__Impl : ( ( rule__Sequence__ParticipantAssignment_4_1 ) ) ;
    public final void rule__Sequence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1482:1: ( ( ( rule__Sequence__ParticipantAssignment_4_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1483:1: ( ( rule__Sequence__ParticipantAssignment_4_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1483:1: ( ( rule__Sequence__ParticipantAssignment_4_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1484:1: ( rule__Sequence__ParticipantAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getParticipantAssignment_4_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1485:1: ( rule__Sequence__ParticipantAssignment_4_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1485:2: rule__Sequence__ParticipantAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Sequence__ParticipantAssignment_4_1_in_rule__Sequence__Group_4__1__Impl3087);
            rule__Sequence__ParticipantAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getParticipantAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_4__1__Impl"


    // $ANTLR start "rule__IfElseFragment__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1499:1: rule__IfElseFragment__Group__0 : rule__IfElseFragment__Group__0__Impl rule__IfElseFragment__Group__1 ;
    public final void rule__IfElseFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1503:1: ( rule__IfElseFragment__Group__0__Impl rule__IfElseFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1504:2: rule__IfElseFragment__Group__0__Impl rule__IfElseFragment__Group__1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__0__Impl_in_rule__IfElseFragment__Group__03121);
            rule__IfElseFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__1_in_rule__IfElseFragment__Group__03124);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1511:1: rule__IfElseFragment__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfElseFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1515:1: ( ( 'if' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1516:1: ( 'if' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1516:1: ( 'if' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1517:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getIfKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__IfElseFragment__Group__0__Impl3152); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1530:1: rule__IfElseFragment__Group__1 : rule__IfElseFragment__Group__1__Impl rule__IfElseFragment__Group__2 ;
    public final void rule__IfElseFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1534:1: ( rule__IfElseFragment__Group__1__Impl rule__IfElseFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1535:2: rule__IfElseFragment__Group__1__Impl rule__IfElseFragment__Group__2
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__1__Impl_in_rule__IfElseFragment__Group__13183);
            rule__IfElseFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__2_in_rule__IfElseFragment__Group__13186);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1542:1: rule__IfElseFragment__Group__1__Impl : ( ( rule__IfElseFragment__ExprAssignment_1 ) ) ;
    public final void rule__IfElseFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1546:1: ( ( ( rule__IfElseFragment__ExprAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1547:1: ( ( rule__IfElseFragment__ExprAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1547:1: ( ( rule__IfElseFragment__ExprAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1548:1: ( rule__IfElseFragment__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getExprAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1549:1: ( rule__IfElseFragment__ExprAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1549:2: rule__IfElseFragment__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__ExprAssignment_1_in_rule__IfElseFragment__Group__1__Impl3213);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1559:1: rule__IfElseFragment__Group__2 : rule__IfElseFragment__Group__2__Impl rule__IfElseFragment__Group__3 ;
    public final void rule__IfElseFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1563:1: ( rule__IfElseFragment__Group__2__Impl rule__IfElseFragment__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1564:2: rule__IfElseFragment__Group__2__Impl rule__IfElseFragment__Group__3
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__2__Impl_in_rule__IfElseFragment__Group__23243);
            rule__IfElseFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__3_in_rule__IfElseFragment__Group__23246);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1571:1: rule__IfElseFragment__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfElseFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1575:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1576:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1576:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1577:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getThenKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__IfElseFragment__Group__2__Impl3274); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1590:1: rule__IfElseFragment__Group__3 : rule__IfElseFragment__Group__3__Impl rule__IfElseFragment__Group__4 ;
    public final void rule__IfElseFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1594:1: ( rule__IfElseFragment__Group__3__Impl rule__IfElseFragment__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1595:2: rule__IfElseFragment__Group__3__Impl rule__IfElseFragment__Group__4
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__3__Impl_in_rule__IfElseFragment__Group__33305);
            rule__IfElseFragment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__4_in_rule__IfElseFragment__Group__33308);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1602:1: rule__IfElseFragment__Group__3__Impl : ( ( rule__IfElseFragment__TransitionAssignment_3 )* ) ;
    public final void rule__IfElseFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1606:1: ( ( ( rule__IfElseFragment__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1607:1: ( ( rule__IfElseFragment__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1607:1: ( ( rule__IfElseFragment__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1608:1: ( rule__IfElseFragment__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1609:1: ( rule__IfElseFragment__TransitionAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==22||LA15_0==26||(LA15_0>=28 && LA15_0<=32)||LA15_0==36||LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1609:2: rule__IfElseFragment__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__IfElseFragment__TransitionAssignment_3_in_rule__IfElseFragment__Group__3__Impl3335);
            	    rule__IfElseFragment__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1619:1: rule__IfElseFragment__Group__4 : rule__IfElseFragment__Group__4__Impl rule__IfElseFragment__Group__5 ;
    public final void rule__IfElseFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1623:1: ( rule__IfElseFragment__Group__4__Impl rule__IfElseFragment__Group__5 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1624:2: rule__IfElseFragment__Group__4__Impl rule__IfElseFragment__Group__5
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__4__Impl_in_rule__IfElseFragment__Group__43366);
            rule__IfElseFragment__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__5_in_rule__IfElseFragment__Group__43369);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1631:1: rule__IfElseFragment__Group__4__Impl : ( ( rule__IfElseFragment__Group_4__0 )* ) ;
    public final void rule__IfElseFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1635:1: ( ( ( rule__IfElseFragment__Group_4__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1636:1: ( ( rule__IfElseFragment__Group_4__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1636:1: ( ( rule__IfElseFragment__Group_4__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1637:1: ( rule__IfElseFragment__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1638:1: ( rule__IfElseFragment__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1638:2: rule__IfElseFragment__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__IfElseFragment__Group_4__0_in_rule__IfElseFragment__Group__4__Impl3396);
            	    rule__IfElseFragment__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1648:1: rule__IfElseFragment__Group__5 : rule__IfElseFragment__Group__5__Impl rule__IfElseFragment__Group__6 ;
    public final void rule__IfElseFragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1652:1: ( rule__IfElseFragment__Group__5__Impl rule__IfElseFragment__Group__6 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1653:2: rule__IfElseFragment__Group__5__Impl rule__IfElseFragment__Group__6
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__5__Impl_in_rule__IfElseFragment__Group__53427);
            rule__IfElseFragment__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__6_in_rule__IfElseFragment__Group__53430);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1660:1: rule__IfElseFragment__Group__5__Impl : ( ( rule__IfElseFragment__Group_5__0 )? ) ;
    public final void rule__IfElseFragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1664:1: ( ( ( rule__IfElseFragment__Group_5__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1665:1: ( ( rule__IfElseFragment__Group_5__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1665:1: ( ( rule__IfElseFragment__Group_5__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1666:1: ( rule__IfElseFragment__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getGroup_5()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1667:1: ( rule__IfElseFragment__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1667:2: rule__IfElseFragment__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IfElseFragment__Group_5__0_in_rule__IfElseFragment__Group__5__Impl3457);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1677:1: rule__IfElseFragment__Group__6 : rule__IfElseFragment__Group__6__Impl ;
    public final void rule__IfElseFragment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1681:1: ( rule__IfElseFragment__Group__6__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1682:2: rule__IfElseFragment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__6__Impl_in_rule__IfElseFragment__Group__63488);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1688:1: rule__IfElseFragment__Group__6__Impl : ( 'end' ) ;
    public final void rule__IfElseFragment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1692:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1693:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1693:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1694:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getEndKeyword_6()); 
            }
            match(input,20,FOLLOW_20_in_rule__IfElseFragment__Group__6__Impl3516); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1721:1: rule__IfElseFragment__Group_4__0 : rule__IfElseFragment__Group_4__0__Impl rule__IfElseFragment__Group_4__1 ;
    public final void rule__IfElseFragment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1725:1: ( rule__IfElseFragment__Group_4__0__Impl rule__IfElseFragment__Group_4__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1726:2: rule__IfElseFragment__Group_4__0__Impl rule__IfElseFragment__Group_4__1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__0__Impl_in_rule__IfElseFragment__Group_4__03561);
            rule__IfElseFragment__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__1_in_rule__IfElseFragment__Group_4__03564);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1733:1: rule__IfElseFragment__Group_4__0__Impl : ( ( 'elsif' ) ) ;
    public final void rule__IfElseFragment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1737:1: ( ( ( 'elsif' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1738:1: ( ( 'elsif' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1738:1: ( ( 'elsif' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1739:1: ( 'elsif' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElsifKeyword_4_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1740:1: ( 'elsif' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1741:2: 'elsif'
            {
            match(input,24,FOLLOW_24_in_rule__IfElseFragment__Group_4__0__Impl3593); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1752:1: rule__IfElseFragment__Group_4__1 : rule__IfElseFragment__Group_4__1__Impl rule__IfElseFragment__Group_4__2 ;
    public final void rule__IfElseFragment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1756:1: ( rule__IfElseFragment__Group_4__1__Impl rule__IfElseFragment__Group_4__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1757:2: rule__IfElseFragment__Group_4__1__Impl rule__IfElseFragment__Group_4__2
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__1__Impl_in_rule__IfElseFragment__Group_4__13625);
            rule__IfElseFragment__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__2_in_rule__IfElseFragment__Group_4__13628);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1764:1: rule__IfElseFragment__Group_4__1__Impl : ( ( rule__IfElseFragment__ElseIfExprAssignment_4_1 ) ) ;
    public final void rule__IfElseFragment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1768:1: ( ( ( rule__IfElseFragment__ElseIfExprAssignment_4_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1769:1: ( ( rule__IfElseFragment__ElseIfExprAssignment_4_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1769:1: ( ( rule__IfElseFragment__ElseIfExprAssignment_4_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1770:1: ( rule__IfElseFragment__ElseIfExprAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseIfExprAssignment_4_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1771:1: ( rule__IfElseFragment__ElseIfExprAssignment_4_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1771:2: rule__IfElseFragment__ElseIfExprAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__ElseIfExprAssignment_4_1_in_rule__IfElseFragment__Group_4__1__Impl3655);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1781:1: rule__IfElseFragment__Group_4__2 : rule__IfElseFragment__Group_4__2__Impl rule__IfElseFragment__Group_4__3 ;
    public final void rule__IfElseFragment__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1785:1: ( rule__IfElseFragment__Group_4__2__Impl rule__IfElseFragment__Group_4__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1786:2: rule__IfElseFragment__Group_4__2__Impl rule__IfElseFragment__Group_4__3
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__2__Impl_in_rule__IfElseFragment__Group_4__23685);
            rule__IfElseFragment__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__3_in_rule__IfElseFragment__Group_4__23688);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1793:1: rule__IfElseFragment__Group_4__2__Impl : ( 'then' ) ;
    public final void rule__IfElseFragment__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1797:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1798:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1798:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1799:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getThenKeyword_4_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__IfElseFragment__Group_4__2__Impl3716); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1812:1: rule__IfElseFragment__Group_4__3 : rule__IfElseFragment__Group_4__3__Impl ;
    public final void rule__IfElseFragment__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1816:1: ( rule__IfElseFragment__Group_4__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1817:2: rule__IfElseFragment__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__3__Impl_in_rule__IfElseFragment__Group_4__33747);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1823:1: rule__IfElseFragment__Group_4__3__Impl : ( ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )* ) ;
    public final void rule__IfElseFragment__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1827:1: ( ( ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1828:1: ( ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1828:1: ( ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1829:1: ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseIftransitionAssignment_4_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1830:1: ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==22||LA18_0==26||(LA18_0>=28 && LA18_0<=32)||LA18_0==36||LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1830:2: rule__IfElseFragment__ElseIftransitionAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__IfElseFragment__ElseIftransitionAssignment_4_3_in_rule__IfElseFragment__Group_4__3__Impl3774);
            	    rule__IfElseFragment__ElseIftransitionAssignment_4_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1848:1: rule__IfElseFragment__Group_5__0 : rule__IfElseFragment__Group_5__0__Impl rule__IfElseFragment__Group_5__1 ;
    public final void rule__IfElseFragment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1852:1: ( rule__IfElseFragment__Group_5__0__Impl rule__IfElseFragment__Group_5__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1853:2: rule__IfElseFragment__Group_5__0__Impl rule__IfElseFragment__Group_5__1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_5__0__Impl_in_rule__IfElseFragment__Group_5__03813);
            rule__IfElseFragment__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group_5__1_in_rule__IfElseFragment__Group_5__03816);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1860:1: rule__IfElseFragment__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__IfElseFragment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1864:1: ( ( ( 'else' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1865:1: ( ( 'else' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1865:1: ( ( 'else' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1866:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseKeyword_5_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1867:1: ( 'else' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1868:2: 'else'
            {
            match(input,25,FOLLOW_25_in_rule__IfElseFragment__Group_5__0__Impl3845); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1879:1: rule__IfElseFragment__Group_5__1 : rule__IfElseFragment__Group_5__1__Impl ;
    public final void rule__IfElseFragment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1883:1: ( rule__IfElseFragment__Group_5__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1884:2: rule__IfElseFragment__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_5__1__Impl_in_rule__IfElseFragment__Group_5__13877);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1890:1: rule__IfElseFragment__Group_5__1__Impl : ( ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )* ) ;
    public final void rule__IfElseFragment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1894:1: ( ( ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1895:1: ( ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1895:1: ( ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1896:1: ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseTransitionAssignment_5_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1897:1: ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==22||LA19_0==26||(LA19_0>=28 && LA19_0<=32)||LA19_0==36||LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1897:2: rule__IfElseFragment__ElseTransitionAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__IfElseFragment__ElseTransitionAssignment_5_1_in_rule__IfElseFragment__Group_5__1__Impl3904);
            	    rule__IfElseFragment__ElseTransitionAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1911:1: rule__ForeachFragment__Group__0 : rule__ForeachFragment__Group__0__Impl rule__ForeachFragment__Group__1 ;
    public final void rule__ForeachFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1915:1: ( rule__ForeachFragment__Group__0__Impl rule__ForeachFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1916:2: rule__ForeachFragment__Group__0__Impl rule__ForeachFragment__Group__1
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__0__Impl_in_rule__ForeachFragment__Group__03939);
            rule__ForeachFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachFragment__Group__1_in_rule__ForeachFragment__Group__03942);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1923:1: rule__ForeachFragment__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForeachFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1927:1: ( ( 'foreach' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1928:1: ( 'foreach' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1928:1: ( 'foreach' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1929:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getForeachKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__ForeachFragment__Group__0__Impl3970); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1942:1: rule__ForeachFragment__Group__1 : rule__ForeachFragment__Group__1__Impl rule__ForeachFragment__Group__2 ;
    public final void rule__ForeachFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1946:1: ( rule__ForeachFragment__Group__1__Impl rule__ForeachFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1947:2: rule__ForeachFragment__Group__1__Impl rule__ForeachFragment__Group__2
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__1__Impl_in_rule__ForeachFragment__Group__14001);
            rule__ForeachFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachFragment__Group__2_in_rule__ForeachFragment__Group__14004);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1954:1: rule__ForeachFragment__Group__1__Impl : ( ( rule__ForeachFragment__ExprAssignment_1 ) ) ;
    public final void rule__ForeachFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1958:1: ( ( ( rule__ForeachFragment__ExprAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1959:1: ( ( rule__ForeachFragment__ExprAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1959:1: ( ( rule__ForeachFragment__ExprAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1960:1: ( rule__ForeachFragment__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getExprAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1961:1: ( rule__ForeachFragment__ExprAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1961:2: rule__ForeachFragment__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__ForeachFragment__ExprAssignment_1_in_rule__ForeachFragment__Group__1__Impl4031);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1971:1: rule__ForeachFragment__Group__2 : rule__ForeachFragment__Group__2__Impl rule__ForeachFragment__Group__3 ;
    public final void rule__ForeachFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1975:1: ( rule__ForeachFragment__Group__2__Impl rule__ForeachFragment__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1976:2: rule__ForeachFragment__Group__2__Impl rule__ForeachFragment__Group__3
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__2__Impl_in_rule__ForeachFragment__Group__24061);
            rule__ForeachFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachFragment__Group__3_in_rule__ForeachFragment__Group__24064);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1983:1: rule__ForeachFragment__Group__2__Impl : ( 'do' ) ;
    public final void rule__ForeachFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1987:1: ( ( 'do' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1988:1: ( 'do' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1988:1: ( 'do' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1989:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getDoKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__ForeachFragment__Group__2__Impl4092); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2002:1: rule__ForeachFragment__Group__3 : rule__ForeachFragment__Group__3__Impl rule__ForeachFragment__Group__4 ;
    public final void rule__ForeachFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2006:1: ( rule__ForeachFragment__Group__3__Impl rule__ForeachFragment__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2007:2: rule__ForeachFragment__Group__3__Impl rule__ForeachFragment__Group__4
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__3__Impl_in_rule__ForeachFragment__Group__34123);
            rule__ForeachFragment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachFragment__Group__4_in_rule__ForeachFragment__Group__34126);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2014:1: rule__ForeachFragment__Group__3__Impl : ( ( rule__ForeachFragment__TransitionAssignment_3 )* ) ;
    public final void rule__ForeachFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2018:1: ( ( ( rule__ForeachFragment__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2019:1: ( ( rule__ForeachFragment__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2019:1: ( ( rule__ForeachFragment__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2020:1: ( rule__ForeachFragment__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2021:1: ( rule__ForeachFragment__TransitionAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==22||LA20_0==26||(LA20_0>=28 && LA20_0<=32)||LA20_0==36||LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2021:2: rule__ForeachFragment__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ForeachFragment__TransitionAssignment_3_in_rule__ForeachFragment__Group__3__Impl4153);
            	    rule__ForeachFragment__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2031:1: rule__ForeachFragment__Group__4 : rule__ForeachFragment__Group__4__Impl ;
    public final void rule__ForeachFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2035:1: ( rule__ForeachFragment__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2036:2: rule__ForeachFragment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__4__Impl_in_rule__ForeachFragment__Group__44184);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2042:1: rule__ForeachFragment__Group__4__Impl : ( 'end' ) ;
    public final void rule__ForeachFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2046:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2047:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2047:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2048:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__ForeachFragment__Group__4__Impl4212); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2071:1: rule__LoopFragment__Group__0 : rule__LoopFragment__Group__0__Impl rule__LoopFragment__Group__1 ;
    public final void rule__LoopFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2075:1: ( rule__LoopFragment__Group__0__Impl rule__LoopFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2076:2: rule__LoopFragment__Group__0__Impl rule__LoopFragment__Group__1
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__0__Impl_in_rule__LoopFragment__Group__04253);
            rule__LoopFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopFragment__Group__1_in_rule__LoopFragment__Group__04256);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2083:1: rule__LoopFragment__Group__0__Impl : ( 'while' ) ;
    public final void rule__LoopFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2087:1: ( ( 'while' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2088:1: ( 'while' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2088:1: ( 'while' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2089:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getWhileKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__LoopFragment__Group__0__Impl4284); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2102:1: rule__LoopFragment__Group__1 : rule__LoopFragment__Group__1__Impl rule__LoopFragment__Group__2 ;
    public final void rule__LoopFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2106:1: ( rule__LoopFragment__Group__1__Impl rule__LoopFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2107:2: rule__LoopFragment__Group__1__Impl rule__LoopFragment__Group__2
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__1__Impl_in_rule__LoopFragment__Group__14315);
            rule__LoopFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopFragment__Group__2_in_rule__LoopFragment__Group__14318);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2114:1: rule__LoopFragment__Group__1__Impl : ( ( rule__LoopFragment__ExprAssignment_1 ) ) ;
    public final void rule__LoopFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2118:1: ( ( ( rule__LoopFragment__ExprAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2119:1: ( ( rule__LoopFragment__ExprAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2119:1: ( ( rule__LoopFragment__ExprAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2120:1: ( rule__LoopFragment__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getExprAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2121:1: ( rule__LoopFragment__ExprAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2121:2: rule__LoopFragment__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__LoopFragment__ExprAssignment_1_in_rule__LoopFragment__Group__1__Impl4345);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2131:1: rule__LoopFragment__Group__2 : rule__LoopFragment__Group__2__Impl rule__LoopFragment__Group__3 ;
    public final void rule__LoopFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2135:1: ( rule__LoopFragment__Group__2__Impl rule__LoopFragment__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2136:2: rule__LoopFragment__Group__2__Impl rule__LoopFragment__Group__3
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__2__Impl_in_rule__LoopFragment__Group__24375);
            rule__LoopFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopFragment__Group__3_in_rule__LoopFragment__Group__24378);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2143:1: rule__LoopFragment__Group__2__Impl : ( 'do' ) ;
    public final void rule__LoopFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2147:1: ( ( 'do' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2148:1: ( 'do' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2148:1: ( 'do' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2149:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getDoKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__LoopFragment__Group__2__Impl4406); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2162:1: rule__LoopFragment__Group__3 : rule__LoopFragment__Group__3__Impl rule__LoopFragment__Group__4 ;
    public final void rule__LoopFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2166:1: ( rule__LoopFragment__Group__3__Impl rule__LoopFragment__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2167:2: rule__LoopFragment__Group__3__Impl rule__LoopFragment__Group__4
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__3__Impl_in_rule__LoopFragment__Group__34437);
            rule__LoopFragment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopFragment__Group__4_in_rule__LoopFragment__Group__34440);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2174:1: rule__LoopFragment__Group__3__Impl : ( ( rule__LoopFragment__TransitionAssignment_3 )* ) ;
    public final void rule__LoopFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2178:1: ( ( ( rule__LoopFragment__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2179:1: ( ( rule__LoopFragment__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2179:1: ( ( rule__LoopFragment__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2180:1: ( rule__LoopFragment__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2181:1: ( rule__LoopFragment__TransitionAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==22||LA21_0==26||(LA21_0>=28 && LA21_0<=32)||LA21_0==36||LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2181:2: rule__LoopFragment__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__LoopFragment__TransitionAssignment_3_in_rule__LoopFragment__Group__3__Impl4467);
            	    rule__LoopFragment__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2191:1: rule__LoopFragment__Group__4 : rule__LoopFragment__Group__4__Impl ;
    public final void rule__LoopFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2195:1: ( rule__LoopFragment__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2196:2: rule__LoopFragment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__4__Impl_in_rule__LoopFragment__Group__44498);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2202:1: rule__LoopFragment__Group__4__Impl : ( 'end' ) ;
    public final void rule__LoopFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2206:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2207:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2207:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2208:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__LoopFragment__Group__4__Impl4526); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2231:1: rule__AssertFragment__Group__0 : rule__AssertFragment__Group__0__Impl rule__AssertFragment__Group__1 ;
    public final void rule__AssertFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2235:1: ( rule__AssertFragment__Group__0__Impl rule__AssertFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2236:2: rule__AssertFragment__Group__0__Impl rule__AssertFragment__Group__1
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__0__Impl_in_rule__AssertFragment__Group__04567);
            rule__AssertFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssertFragment__Group__1_in_rule__AssertFragment__Group__04570);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2243:1: rule__AssertFragment__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2247:1: ( ( 'assert' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2248:1: ( 'assert' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2248:1: ( 'assert' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2249:1: 'assert'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getAssertKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__AssertFragment__Group__0__Impl4598); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2262:1: rule__AssertFragment__Group__1 : rule__AssertFragment__Group__1__Impl rule__AssertFragment__Group__2 ;
    public final void rule__AssertFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2266:1: ( rule__AssertFragment__Group__1__Impl rule__AssertFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2267:2: rule__AssertFragment__Group__1__Impl rule__AssertFragment__Group__2
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__1__Impl_in_rule__AssertFragment__Group__14629);
            rule__AssertFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssertFragment__Group__2_in_rule__AssertFragment__Group__14632);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2274:1: rule__AssertFragment__Group__1__Impl : ( ( rule__AssertFragment__ExprAssignment_1 ) ) ;
    public final void rule__AssertFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2278:1: ( ( ( rule__AssertFragment__ExprAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2279:1: ( ( rule__AssertFragment__ExprAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2279:1: ( ( rule__AssertFragment__ExprAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2280:1: ( rule__AssertFragment__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getExprAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2281:1: ( rule__AssertFragment__ExprAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2281:2: rule__AssertFragment__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__AssertFragment__ExprAssignment_1_in_rule__AssertFragment__Group__1__Impl4659);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2291:1: rule__AssertFragment__Group__2 : rule__AssertFragment__Group__2__Impl rule__AssertFragment__Group__3 ;
    public final void rule__AssertFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2295:1: ( rule__AssertFragment__Group__2__Impl rule__AssertFragment__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2296:2: rule__AssertFragment__Group__2__Impl rule__AssertFragment__Group__3
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__2__Impl_in_rule__AssertFragment__Group__24689);
            rule__AssertFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssertFragment__Group__3_in_rule__AssertFragment__Group__24692);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2303:1: rule__AssertFragment__Group__2__Impl : ( 'then' ) ;
    public final void rule__AssertFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2307:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2308:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2308:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2309:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getThenKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__AssertFragment__Group__2__Impl4720); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2322:1: rule__AssertFragment__Group__3 : rule__AssertFragment__Group__3__Impl rule__AssertFragment__Group__4 ;
    public final void rule__AssertFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2326:1: ( rule__AssertFragment__Group__3__Impl rule__AssertFragment__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2327:2: rule__AssertFragment__Group__3__Impl rule__AssertFragment__Group__4
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__3__Impl_in_rule__AssertFragment__Group__34751);
            rule__AssertFragment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssertFragment__Group__4_in_rule__AssertFragment__Group__34754);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2334:1: rule__AssertFragment__Group__3__Impl : ( ( rule__AssertFragment__TransitionAssignment_3 )* ) ;
    public final void rule__AssertFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2338:1: ( ( ( rule__AssertFragment__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2339:1: ( ( rule__AssertFragment__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2339:1: ( ( rule__AssertFragment__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2340:1: ( rule__AssertFragment__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2341:1: ( rule__AssertFragment__TransitionAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==22||LA22_0==26||(LA22_0>=28 && LA22_0<=32)||LA22_0==36||LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2341:2: rule__AssertFragment__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__AssertFragment__TransitionAssignment_3_in_rule__AssertFragment__Group__3__Impl4781);
            	    rule__AssertFragment__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2351:1: rule__AssertFragment__Group__4 : rule__AssertFragment__Group__4__Impl ;
    public final void rule__AssertFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2355:1: ( rule__AssertFragment__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2356:2: rule__AssertFragment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__4__Impl_in_rule__AssertFragment__Group__44812);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2362:1: rule__AssertFragment__Group__4__Impl : ( 'end' ) ;
    public final void rule__AssertFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2366:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2367:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2367:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2368:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__AssertFragment__Group__4__Impl4840); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2391:1: rule__BreakFragment__Group__0 : rule__BreakFragment__Group__0__Impl rule__BreakFragment__Group__1 ;
    public final void rule__BreakFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2395:1: ( rule__BreakFragment__Group__0__Impl rule__BreakFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2396:2: rule__BreakFragment__Group__0__Impl rule__BreakFragment__Group__1
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group__0__Impl_in_rule__BreakFragment__Group__04881);
            rule__BreakFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group__1_in_rule__BreakFragment__Group__04884);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2403:1: rule__BreakFragment__Group__0__Impl : ( () ) ;
    public final void rule__BreakFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2407:1: ( ( () ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2408:1: ( () )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2408:1: ( () )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2409:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getBreakFragmentAction_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2410:1: ()
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2412:1: 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2422:1: rule__BreakFragment__Group__1 : rule__BreakFragment__Group__1__Impl rule__BreakFragment__Group__2 ;
    public final void rule__BreakFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2426:1: ( rule__BreakFragment__Group__1__Impl rule__BreakFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2427:2: rule__BreakFragment__Group__1__Impl rule__BreakFragment__Group__2
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group__1__Impl_in_rule__BreakFragment__Group__14942);
            rule__BreakFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group__2_in_rule__BreakFragment__Group__14945);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2434:1: rule__BreakFragment__Group__1__Impl : ( 'break' ) ;
    public final void rule__BreakFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2438:1: ( ( 'break' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2439:1: ( 'break' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2439:1: ( 'break' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2440:1: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getBreakKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__BreakFragment__Group__1__Impl4973); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2453:1: rule__BreakFragment__Group__2 : rule__BreakFragment__Group__2__Impl ;
    public final void rule__BreakFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2457:1: ( rule__BreakFragment__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2458:2: rule__BreakFragment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group__2__Impl_in_rule__BreakFragment__Group__25004);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2464:1: rule__BreakFragment__Group__2__Impl : ( ( rule__BreakFragment__Group_2__0 )? ) ;
    public final void rule__BreakFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2468:1: ( ( ( rule__BreakFragment__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2469:1: ( ( rule__BreakFragment__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2469:1: ( ( rule__BreakFragment__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2470:1: ( rule__BreakFragment__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2471:1: ( rule__BreakFragment__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_OPERATOR && LA23_0<=RULE_NATURAL)||LA23_0==17||LA23_0==23) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                int LA23_2 = input.LA(2);

                if ( ((LA23_2>=RULE_ID && LA23_2<=RULE_NATURAL)||LA23_2==17||LA23_2==23||LA23_2==33) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2471:2: rule__BreakFragment__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BreakFragment__Group_2__0_in_rule__BreakFragment__Group__2__Impl5031);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2487:1: rule__BreakFragment__Group_2__0 : rule__BreakFragment__Group_2__0__Impl rule__BreakFragment__Group_2__1 ;
    public final void rule__BreakFragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2491:1: ( rule__BreakFragment__Group_2__0__Impl rule__BreakFragment__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2492:2: rule__BreakFragment__Group_2__0__Impl rule__BreakFragment__Group_2__1
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__0__Impl_in_rule__BreakFragment__Group_2__05068);
            rule__BreakFragment__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__1_in_rule__BreakFragment__Group_2__05071);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2499:1: rule__BreakFragment__Group_2__0__Impl : ( ( rule__BreakFragment__ExprAssignment_2_0 ) ) ;
    public final void rule__BreakFragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2503:1: ( ( ( rule__BreakFragment__ExprAssignment_2_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2504:1: ( ( rule__BreakFragment__ExprAssignment_2_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2504:1: ( ( rule__BreakFragment__ExprAssignment_2_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2505:1: ( rule__BreakFragment__ExprAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getExprAssignment_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2506:1: ( rule__BreakFragment__ExprAssignment_2_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2506:2: rule__BreakFragment__ExprAssignment_2_0
            {
            pushFollow(FOLLOW_rule__BreakFragment__ExprAssignment_2_0_in_rule__BreakFragment__Group_2__0__Impl5098);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2516:1: rule__BreakFragment__Group_2__1 : rule__BreakFragment__Group_2__1__Impl rule__BreakFragment__Group_2__2 ;
    public final void rule__BreakFragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2520:1: ( rule__BreakFragment__Group_2__1__Impl rule__BreakFragment__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2521:2: rule__BreakFragment__Group_2__1__Impl rule__BreakFragment__Group_2__2
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__1__Impl_in_rule__BreakFragment__Group_2__15128);
            rule__BreakFragment__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__2_in_rule__BreakFragment__Group_2__15131);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2528:1: rule__BreakFragment__Group_2__1__Impl : ( 'then' ) ;
    public final void rule__BreakFragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2532:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2533:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2533:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2534:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getThenKeyword_2_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__BreakFragment__Group_2__1__Impl5159); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2547:1: rule__BreakFragment__Group_2__2 : rule__BreakFragment__Group_2__2__Impl rule__BreakFragment__Group_2__3 ;
    public final void rule__BreakFragment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2551:1: ( rule__BreakFragment__Group_2__2__Impl rule__BreakFragment__Group_2__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2552:2: rule__BreakFragment__Group_2__2__Impl rule__BreakFragment__Group_2__3
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__2__Impl_in_rule__BreakFragment__Group_2__25190);
            rule__BreakFragment__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__3_in_rule__BreakFragment__Group_2__25193);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2559:1: rule__BreakFragment__Group_2__2__Impl : ( ( rule__BreakFragment__TransitionAssignment_2_2 )* ) ;
    public final void rule__BreakFragment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2563:1: ( ( ( rule__BreakFragment__TransitionAssignment_2_2 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2564:1: ( ( rule__BreakFragment__TransitionAssignment_2_2 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2564:1: ( ( rule__BreakFragment__TransitionAssignment_2_2 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2565:1: ( rule__BreakFragment__TransitionAssignment_2_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getTransitionAssignment_2_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2566:1: ( rule__BreakFragment__TransitionAssignment_2_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==22||LA24_0==26||(LA24_0>=28 && LA24_0<=32)||LA24_0==36||LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2566:2: rule__BreakFragment__TransitionAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__BreakFragment__TransitionAssignment_2_2_in_rule__BreakFragment__Group_2__2__Impl5220);
            	    rule__BreakFragment__TransitionAssignment_2_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2576:1: rule__BreakFragment__Group_2__3 : rule__BreakFragment__Group_2__3__Impl ;
    public final void rule__BreakFragment__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2580:1: ( rule__BreakFragment__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2581:2: rule__BreakFragment__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__3__Impl_in_rule__BreakFragment__Group_2__35251);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2587:1: rule__BreakFragment__Group_2__3__Impl : ( 'end' ) ;
    public final void rule__BreakFragment__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2591:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2592:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2592:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2593:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getEndKeyword_2_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__BreakFragment__Group_2__3__Impl5279); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2614:1: rule__NextFragment__Group__0 : rule__NextFragment__Group__0__Impl rule__NextFragment__Group__1 ;
    public final void rule__NextFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2618:1: ( rule__NextFragment__Group__0__Impl rule__NextFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2619:2: rule__NextFragment__Group__0__Impl rule__NextFragment__Group__1
            {
            pushFollow(FOLLOW_rule__NextFragment__Group__0__Impl_in_rule__NextFragment__Group__05318);
            rule__NextFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group__1_in_rule__NextFragment__Group__05321);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2626:1: rule__NextFragment__Group__0__Impl : ( () ) ;
    public final void rule__NextFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2630:1: ( ( () ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2631:1: ( () )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2631:1: ( () )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2632:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getNextFragmentAction_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2633:1: ()
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2635:1: 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2645:1: rule__NextFragment__Group__1 : rule__NextFragment__Group__1__Impl rule__NextFragment__Group__2 ;
    public final void rule__NextFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2649:1: ( rule__NextFragment__Group__1__Impl rule__NextFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2650:2: rule__NextFragment__Group__1__Impl rule__NextFragment__Group__2
            {
            pushFollow(FOLLOW_rule__NextFragment__Group__1__Impl_in_rule__NextFragment__Group__15379);
            rule__NextFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group__2_in_rule__NextFragment__Group__15382);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2657:1: rule__NextFragment__Group__1__Impl : ( 'next' ) ;
    public final void rule__NextFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2661:1: ( ( 'next' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2662:1: ( 'next' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2662:1: ( 'next' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2663:1: 'next'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getNextKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__NextFragment__Group__1__Impl5410); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2676:1: rule__NextFragment__Group__2 : rule__NextFragment__Group__2__Impl ;
    public final void rule__NextFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2680:1: ( rule__NextFragment__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2681:2: rule__NextFragment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NextFragment__Group__2__Impl_in_rule__NextFragment__Group__25441);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2687:1: rule__NextFragment__Group__2__Impl : ( ( rule__NextFragment__Group_2__0 )? ) ;
    public final void rule__NextFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2691:1: ( ( ( rule__NextFragment__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2692:1: ( ( rule__NextFragment__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2692:1: ( ( rule__NextFragment__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2693:1: ( rule__NextFragment__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2694:1: ( rule__NextFragment__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_OPERATOR && LA25_0<=RULE_NATURAL)||LA25_0==17||LA25_0==23) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                int LA25_2 = input.LA(2);

                if ( ((LA25_2>=RULE_ID && LA25_2<=RULE_NATURAL)||LA25_2==17||LA25_2==23||LA25_2==33) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2694:2: rule__NextFragment__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NextFragment__Group_2__0_in_rule__NextFragment__Group__2__Impl5468);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2710:1: rule__NextFragment__Group_2__0 : rule__NextFragment__Group_2__0__Impl rule__NextFragment__Group_2__1 ;
    public final void rule__NextFragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2714:1: ( rule__NextFragment__Group_2__0__Impl rule__NextFragment__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2715:2: rule__NextFragment__Group_2__0__Impl rule__NextFragment__Group_2__1
            {
            pushFollow(FOLLOW_rule__NextFragment__Group_2__0__Impl_in_rule__NextFragment__Group_2__05505);
            rule__NextFragment__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group_2__1_in_rule__NextFragment__Group_2__05508);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2722:1: rule__NextFragment__Group_2__0__Impl : ( ( rule__NextFragment__ExprAssignment_2_0 ) ) ;
    public final void rule__NextFragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2726:1: ( ( ( rule__NextFragment__ExprAssignment_2_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2727:1: ( ( rule__NextFragment__ExprAssignment_2_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2727:1: ( ( rule__NextFragment__ExprAssignment_2_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2728:1: ( rule__NextFragment__ExprAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getExprAssignment_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2729:1: ( rule__NextFragment__ExprAssignment_2_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2729:2: rule__NextFragment__ExprAssignment_2_0
            {
            pushFollow(FOLLOW_rule__NextFragment__ExprAssignment_2_0_in_rule__NextFragment__Group_2__0__Impl5535);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2739:1: rule__NextFragment__Group_2__1 : rule__NextFragment__Group_2__1__Impl rule__NextFragment__Group_2__2 ;
    public final void rule__NextFragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2743:1: ( rule__NextFragment__Group_2__1__Impl rule__NextFragment__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2744:2: rule__NextFragment__Group_2__1__Impl rule__NextFragment__Group_2__2
            {
            pushFollow(FOLLOW_rule__NextFragment__Group_2__1__Impl_in_rule__NextFragment__Group_2__15565);
            rule__NextFragment__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group_2__2_in_rule__NextFragment__Group_2__15568);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2751:1: rule__NextFragment__Group_2__1__Impl : ( 'then' ) ;
    public final void rule__NextFragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2755:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2756:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2756:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2757:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getThenKeyword_2_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__NextFragment__Group_2__1__Impl5596); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2770:1: rule__NextFragment__Group_2__2 : rule__NextFragment__Group_2__2__Impl rule__NextFragment__Group_2__3 ;
    public final void rule__NextFragment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2774:1: ( rule__NextFragment__Group_2__2__Impl rule__NextFragment__Group_2__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2775:2: rule__NextFragment__Group_2__2__Impl rule__NextFragment__Group_2__3
            {
            pushFollow(FOLLOW_rule__NextFragment__Group_2__2__Impl_in_rule__NextFragment__Group_2__25627);
            rule__NextFragment__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group_2__3_in_rule__NextFragment__Group_2__25630);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2782:1: rule__NextFragment__Group_2__2__Impl : ( ( rule__NextFragment__TransitionAssignment_2_2 )* ) ;
    public final void rule__NextFragment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2786:1: ( ( ( rule__NextFragment__TransitionAssignment_2_2 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2787:1: ( ( rule__NextFragment__TransitionAssignment_2_2 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2787:1: ( ( rule__NextFragment__TransitionAssignment_2_2 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2788:1: ( rule__NextFragment__TransitionAssignment_2_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getTransitionAssignment_2_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2789:1: ( rule__NextFragment__TransitionAssignment_2_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==22||LA26_0==26||(LA26_0>=28 && LA26_0<=32)||LA26_0==36||LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2789:2: rule__NextFragment__TransitionAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__NextFragment__TransitionAssignment_2_2_in_rule__NextFragment__Group_2__2__Impl5657);
            	    rule__NextFragment__TransitionAssignment_2_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2799:1: rule__NextFragment__Group_2__3 : rule__NextFragment__Group_2__3__Impl ;
    public final void rule__NextFragment__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2803:1: ( rule__NextFragment__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2804:2: rule__NextFragment__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__NextFragment__Group_2__3__Impl_in_rule__NextFragment__Group_2__35688);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2810:1: rule__NextFragment__Group_2__3__Impl : ( 'end' ) ;
    public final void rule__NextFragment__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2814:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2815:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2815:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2816:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getEndKeyword_2_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__NextFragment__Group_2__3__Impl5716); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2837:1: rule__CallMessage__Group__0 : rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1 ;
    public final void rule__CallMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2841:1: ( rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2842:2: rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__0__Impl_in_rule__CallMessage__Group__05755);
            rule__CallMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__1_in_rule__CallMessage__Group__05758);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2849:1: rule__CallMessage__Group__0__Impl : ( ( rule__CallMessage__SourceParticipantAssignment_0 )? ) ;
    public final void rule__CallMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2853:1: ( ( ( rule__CallMessage__SourceParticipantAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2854:1: ( ( rule__CallMessage__SourceParticipantAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2854:1: ( ( rule__CallMessage__SourceParticipantAssignment_0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2855:1: ( rule__CallMessage__SourceParticipantAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getSourceParticipantAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2856:1: ( rule__CallMessage__SourceParticipantAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2856:2: rule__CallMessage__SourceParticipantAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__SourceParticipantAssignment_0_in_rule__CallMessage__Group__0__Impl5785);
                    rule__CallMessage__SourceParticipantAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getSourceParticipantAssignment_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2866:1: rule__CallMessage__Group__1 : rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2 ;
    public final void rule__CallMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2870:1: ( rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2871:2: rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__1__Impl_in_rule__CallMessage__Group__15816);
            rule__CallMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__2_in_rule__CallMessage__Group__15819);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2878:1: rule__CallMessage__Group__1__Impl : ( 'calls' ) ;
    public final void rule__CallMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2882:1: ( ( 'calls' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2883:1: ( 'calls' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2883:1: ( 'calls' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2884:1: 'calls'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getCallsKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__CallMessage__Group__1__Impl5847); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getCallsKeyword_1()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2897:1: rule__CallMessage__Group__2 : rule__CallMessage__Group__2__Impl rule__CallMessage__Group__3 ;
    public final void rule__CallMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2901:1: ( rule__CallMessage__Group__2__Impl rule__CallMessage__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2902:2: rule__CallMessage__Group__2__Impl rule__CallMessage__Group__3
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__2__Impl_in_rule__CallMessage__Group__25878);
            rule__CallMessage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__3_in_rule__CallMessage__Group__25881);
            rule__CallMessage__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2909:1: rule__CallMessage__Group__2__Impl : ( ( rule__CallMessage__Group_2__0 )? ) ;
    public final void rule__CallMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2913:1: ( ( ( rule__CallMessage__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2914:1: ( ( rule__CallMessage__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2914:1: ( ( rule__CallMessage__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2915:1: ( rule__CallMessage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2916:1: ( rule__CallMessage__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==33) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2916:2: rule__CallMessage__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__Group_2__0_in_rule__CallMessage__Group__2__Impl5908);
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


    // $ANTLR start "rule__CallMessage__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2926:1: rule__CallMessage__Group__3 : rule__CallMessage__Group__3__Impl rule__CallMessage__Group__4 ;
    public final void rule__CallMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2930:1: ( rule__CallMessage__Group__3__Impl rule__CallMessage__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2931:2: rule__CallMessage__Group__3__Impl rule__CallMessage__Group__4
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__3__Impl_in_rule__CallMessage__Group__35939);
            rule__CallMessage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__4_in_rule__CallMessage__Group__35942);
            rule__CallMessage__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group__3"


    // $ANTLR start "rule__CallMessage__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2938:1: rule__CallMessage__Group__3__Impl : ( ( rule__CallMessage__NameAssignment_3 ) ) ;
    public final void rule__CallMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2942:1: ( ( ( rule__CallMessage__NameAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2943:1: ( ( rule__CallMessage__NameAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2943:1: ( ( rule__CallMessage__NameAssignment_3 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2944:1: ( rule__CallMessage__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getNameAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2945:1: ( rule__CallMessage__NameAssignment_3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2945:2: rule__CallMessage__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__CallMessage__NameAssignment_3_in_rule__CallMessage__Group__3__Impl5969);
            rule__CallMessage__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group__3__Impl"


    // $ANTLR start "rule__CallMessage__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2955:1: rule__CallMessage__Group__4 : rule__CallMessage__Group__4__Impl rule__CallMessage__Group__5 ;
    public final void rule__CallMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2959:1: ( rule__CallMessage__Group__4__Impl rule__CallMessage__Group__5 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2960:2: rule__CallMessage__Group__4__Impl rule__CallMessage__Group__5
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__4__Impl_in_rule__CallMessage__Group__45999);
            rule__CallMessage__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__5_in_rule__CallMessage__Group__46002);
            rule__CallMessage__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group__4"


    // $ANTLR start "rule__CallMessage__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2967:1: rule__CallMessage__Group__4__Impl : ( ( rule__CallMessage__Group_4__0 )? ) ;
    public final void rule__CallMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2971:1: ( ( ( rule__CallMessage__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2972:1: ( ( rule__CallMessage__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2972:1: ( ( rule__CallMessage__Group_4__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2973:1: ( rule__CallMessage__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2974:1: ( rule__CallMessage__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2974:2: rule__CallMessage__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__Group_4__0_in_rule__CallMessage__Group__4__Impl6029);
                    rule__CallMessage__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group__4__Impl"


    // $ANTLR start "rule__CallMessage__Group__5"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2984:1: rule__CallMessage__Group__5 : rule__CallMessage__Group__5__Impl ;
    public final void rule__CallMessage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2988:1: ( rule__CallMessage__Group__5__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2989:2: rule__CallMessage__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__5__Impl_in_rule__CallMessage__Group__56060);
            rule__CallMessage__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group__5"


    // $ANTLR start "rule__CallMessage__Group__5__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2995:1: rule__CallMessage__Group__5__Impl : ( ( rule__CallMessage__ReturnAssignment_5 )? ) ;
    public final void rule__CallMessage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2999:1: ( ( ( rule__CallMessage__ReturnAssignment_5 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3000:1: ( ( rule__CallMessage__ReturnAssignment_5 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3000:1: ( ( rule__CallMessage__ReturnAssignment_5 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3001:1: ( rule__CallMessage__ReturnAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getReturnAssignment_5()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3002:1: ( rule__CallMessage__ReturnAssignment_5 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3002:2: rule__CallMessage__ReturnAssignment_5
                    {
                    pushFollow(FOLLOW_rule__CallMessage__ReturnAssignment_5_in_rule__CallMessage__Group__5__Impl6087);
                    rule__CallMessage__ReturnAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getReturnAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group__5__Impl"


    // $ANTLR start "rule__CallMessage__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3024:1: rule__CallMessage__Group_2__0 : rule__CallMessage__Group_2__0__Impl rule__CallMessage__Group_2__1 ;
    public final void rule__CallMessage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3028:1: ( rule__CallMessage__Group_2__0__Impl rule__CallMessage__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3029:2: rule__CallMessage__Group_2__0__Impl rule__CallMessage__Group_2__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2__0__Impl_in_rule__CallMessage__Group_2__06130);
            rule__CallMessage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_2__1_in_rule__CallMessage__Group_2__06133);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3036:1: rule__CallMessage__Group_2__0__Impl : ( ( rule__CallMessage__TargetParticipantAssignment_2_0 ) ) ;
    public final void rule__CallMessage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3040:1: ( ( ( rule__CallMessage__TargetParticipantAssignment_2_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3041:1: ( ( rule__CallMessage__TargetParticipantAssignment_2_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3041:1: ( ( rule__CallMessage__TargetParticipantAssignment_2_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3042:1: ( rule__CallMessage__TargetParticipantAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getTargetParticipantAssignment_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3043:1: ( rule__CallMessage__TargetParticipantAssignment_2_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3043:2: rule__CallMessage__TargetParticipantAssignment_2_0
            {
            pushFollow(FOLLOW_rule__CallMessage__TargetParticipantAssignment_2_0_in_rule__CallMessage__Group_2__0__Impl6160);
            rule__CallMessage__TargetParticipantAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getTargetParticipantAssignment_2_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3053:1: rule__CallMessage__Group_2__1 : rule__CallMessage__Group_2__1__Impl ;
    public final void rule__CallMessage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3057:1: ( rule__CallMessage__Group_2__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3058:2: rule__CallMessage__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2__1__Impl_in_rule__CallMessage__Group_2__16190);
            rule__CallMessage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3064:1: rule__CallMessage__Group_2__1__Impl : ( '.' ) ;
    public final void rule__CallMessage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3068:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3069:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3069:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3070:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getFullStopKeyword_2_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__CallMessage__Group_2__1__Impl6218); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getFullStopKeyword_2_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__CallMessage__Group_4__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3087:1: rule__CallMessage__Group_4__0 : rule__CallMessage__Group_4__0__Impl rule__CallMessage__Group_4__1 ;
    public final void rule__CallMessage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3091:1: ( rule__CallMessage__Group_4__0__Impl rule__CallMessage__Group_4__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3092:2: rule__CallMessage__Group_4__0__Impl rule__CallMessage__Group_4__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_4__0__Impl_in_rule__CallMessage__Group_4__06253);
            rule__CallMessage__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_4__1_in_rule__CallMessage__Group_4__06256);
            rule__CallMessage__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4__0"


    // $ANTLR start "rule__CallMessage__Group_4__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3099:1: rule__CallMessage__Group_4__0__Impl : ( ( '(' ) ) ;
    public final void rule__CallMessage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3103:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3104:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3104:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3105:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_4_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3106:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3107:2: '('
            {
            match(input,34,FOLLOW_34_in_rule__CallMessage__Group_4__0__Impl6285); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_4__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3118:1: rule__CallMessage__Group_4__1 : rule__CallMessage__Group_4__1__Impl rule__CallMessage__Group_4__2 ;
    public final void rule__CallMessage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3122:1: ( rule__CallMessage__Group_4__1__Impl rule__CallMessage__Group_4__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3123:2: rule__CallMessage__Group_4__1__Impl rule__CallMessage__Group_4__2
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_4__1__Impl_in_rule__CallMessage__Group_4__16317);
            rule__CallMessage__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_4__2_in_rule__CallMessage__Group_4__16320);
            rule__CallMessage__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4__1"


    // $ANTLR start "rule__CallMessage__Group_4__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3130:1: rule__CallMessage__Group_4__1__Impl : ( ( rule__CallMessage__Group_4_1__0 )? ) ;
    public final void rule__CallMessage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3134:1: ( ( ( rule__CallMessage__Group_4_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3135:1: ( ( rule__CallMessage__Group_4_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3135:1: ( ( rule__CallMessage__Group_4_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3136:1: ( rule__CallMessage__Group_4_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_4_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3137:1: ( rule__CallMessage__Group_4_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3137:2: rule__CallMessage__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__Group_4_1__0_in_rule__CallMessage__Group_4__1__Impl6347);
                    rule__CallMessage__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4__1__Impl"


    // $ANTLR start "rule__CallMessage__Group_4__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3147:1: rule__CallMessage__Group_4__2 : rule__CallMessage__Group_4__2__Impl ;
    public final void rule__CallMessage__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3151:1: ( rule__CallMessage__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3152:2: rule__CallMessage__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_4__2__Impl_in_rule__CallMessage__Group_4__26378);
            rule__CallMessage__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4__2"


    // $ANTLR start "rule__CallMessage__Group_4__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3158:1: rule__CallMessage__Group_4__2__Impl : ( ')' ) ;
    public final void rule__CallMessage__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3162:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3163:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3163:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3164:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__CallMessage__Group_4__2__Impl6406); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4__2__Impl"


    // $ANTLR start "rule__CallMessage__Group_4_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3183:1: rule__CallMessage__Group_4_1__0 : rule__CallMessage__Group_4_1__0__Impl rule__CallMessage__Group_4_1__1 ;
    public final void rule__CallMessage__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3187:1: ( rule__CallMessage__Group_4_1__0__Impl rule__CallMessage__Group_4_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3188:2: rule__CallMessage__Group_4_1__0__Impl rule__CallMessage__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_4_1__0__Impl_in_rule__CallMessage__Group_4_1__06443);
            rule__CallMessage__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_4_1__1_in_rule__CallMessage__Group_4_1__06446);
            rule__CallMessage__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4_1__0"


    // $ANTLR start "rule__CallMessage__Group_4_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3195:1: rule__CallMessage__Group_4_1__0__Impl : ( ( rule__CallMessage__ParameterAssignment_4_1_0 ) ) ;
    public final void rule__CallMessage__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3199:1: ( ( ( rule__CallMessage__ParameterAssignment_4_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3200:1: ( ( rule__CallMessage__ParameterAssignment_4_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3200:1: ( ( rule__CallMessage__ParameterAssignment_4_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3201:1: ( rule__CallMessage__ParameterAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParameterAssignment_4_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3202:1: ( rule__CallMessage__ParameterAssignment_4_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3202:2: rule__CallMessage__ParameterAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__CallMessage__ParameterAssignment_4_1_0_in_rule__CallMessage__Group_4_1__0__Impl6473);
            rule__CallMessage__ParameterAssignment_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParameterAssignment_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4_1__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_4_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3212:1: rule__CallMessage__Group_4_1__1 : rule__CallMessage__Group_4_1__1__Impl ;
    public final void rule__CallMessage__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3216:1: ( rule__CallMessage__Group_4_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3217:2: rule__CallMessage__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_4_1__1__Impl_in_rule__CallMessage__Group_4_1__16503);
            rule__CallMessage__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4_1__1"


    // $ANTLR start "rule__CallMessage__Group_4_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3223:1: rule__CallMessage__Group_4_1__1__Impl : ( ( rule__CallMessage__Group_4_1_1__0 )* ) ;
    public final void rule__CallMessage__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3227:1: ( ( ( rule__CallMessage__Group_4_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3228:1: ( ( rule__CallMessage__Group_4_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3228:1: ( ( rule__CallMessage__Group_4_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3229:1: ( rule__CallMessage__Group_4_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_4_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3230:1: ( rule__CallMessage__Group_4_1_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3230:2: rule__CallMessage__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CallMessage__Group_4_1_1__0_in_rule__CallMessage__Group_4_1__1__Impl6530);
            	    rule__CallMessage__Group_4_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4_1__1__Impl"


    // $ANTLR start "rule__CallMessage__Group_4_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3244:1: rule__CallMessage__Group_4_1_1__0 : rule__CallMessage__Group_4_1_1__0__Impl rule__CallMessage__Group_4_1_1__1 ;
    public final void rule__CallMessage__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3248:1: ( rule__CallMessage__Group_4_1_1__0__Impl rule__CallMessage__Group_4_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3249:2: rule__CallMessage__Group_4_1_1__0__Impl rule__CallMessage__Group_4_1_1__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_4_1_1__0__Impl_in_rule__CallMessage__Group_4_1_1__06565);
            rule__CallMessage__Group_4_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_4_1_1__1_in_rule__CallMessage__Group_4_1_1__06568);
            rule__CallMessage__Group_4_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4_1_1__0"


    // $ANTLR start "rule__CallMessage__Group_4_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3256:1: rule__CallMessage__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__CallMessage__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3260:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3261:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3261:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3262:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getCommaKeyword_4_1_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__CallMessage__Group_4_1_1__0__Impl6596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getCommaKeyword_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_4_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3275:1: rule__CallMessage__Group_4_1_1__1 : rule__CallMessage__Group_4_1_1__1__Impl ;
    public final void rule__CallMessage__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3279:1: ( rule__CallMessage__Group_4_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3280:2: rule__CallMessage__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_4_1_1__1__Impl_in_rule__CallMessage__Group_4_1_1__16627);
            rule__CallMessage__Group_4_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4_1_1__1"


    // $ANTLR start "rule__CallMessage__Group_4_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3286:1: rule__CallMessage__Group_4_1_1__1__Impl : ( ( rule__CallMessage__ParameterAssignment_4_1_1_1 ) ) ;
    public final void rule__CallMessage__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3290:1: ( ( ( rule__CallMessage__ParameterAssignment_4_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3291:1: ( ( rule__CallMessage__ParameterAssignment_4_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3291:1: ( ( rule__CallMessage__ParameterAssignment_4_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3292:1: ( rule__CallMessage__ParameterAssignment_4_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParameterAssignment_4_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3293:1: ( rule__CallMessage__ParameterAssignment_4_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3293:2: rule__CallMessage__ParameterAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_rule__CallMessage__ParameterAssignment_4_1_1_1_in_rule__CallMessage__Group_4_1_1__1__Impl6654);
            rule__CallMessage__ParameterAssignment_4_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParameterAssignment_4_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__NewMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3307:1: rule__NewMessage__Group__0 : rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1 ;
    public final void rule__NewMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3311:1: ( rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3312:2: rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__0__Impl_in_rule__NewMessage__Group__06688);
            rule__NewMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group__1_in_rule__NewMessage__Group__06691);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3319:1: rule__NewMessage__Group__0__Impl : ( ( rule__NewMessage__SourceParticipantAssignment_0 )? ) ;
    public final void rule__NewMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3323:1: ( ( ( rule__NewMessage__SourceParticipantAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3324:1: ( ( rule__NewMessage__SourceParticipantAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3324:1: ( ( rule__NewMessage__SourceParticipantAssignment_0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3325:1: ( rule__NewMessage__SourceParticipantAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getSourceParticipantAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3326:1: ( rule__NewMessage__SourceParticipantAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3326:2: rule__NewMessage__SourceParticipantAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NewMessage__SourceParticipantAssignment_0_in_rule__NewMessage__Group__0__Impl6718);
                    rule__NewMessage__SourceParticipantAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getSourceParticipantAssignment_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3336:1: rule__NewMessage__Group__1 : rule__NewMessage__Group__1__Impl rule__NewMessage__Group__2 ;
    public final void rule__NewMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3340:1: ( rule__NewMessage__Group__1__Impl rule__NewMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3341:2: rule__NewMessage__Group__1__Impl rule__NewMessage__Group__2
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__1__Impl_in_rule__NewMessage__Group__16749);
            rule__NewMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group__2_in_rule__NewMessage__Group__16752);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3348:1: rule__NewMessage__Group__1__Impl : ( 'creates' ) ;
    public final void rule__NewMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3352:1: ( ( 'creates' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3353:1: ( 'creates' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3353:1: ( 'creates' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3354:1: 'creates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getCreatesKeyword_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__NewMessage__Group__1__Impl6780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getCreatesKeyword_1()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3367:1: rule__NewMessage__Group__2 : rule__NewMessage__Group__2__Impl rule__NewMessage__Group__3 ;
    public final void rule__NewMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3371:1: ( rule__NewMessage__Group__2__Impl rule__NewMessage__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3372:2: rule__NewMessage__Group__2__Impl rule__NewMessage__Group__3
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__2__Impl_in_rule__NewMessage__Group__26811);
            rule__NewMessage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group__3_in_rule__NewMessage__Group__26814);
            rule__NewMessage__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3379:1: rule__NewMessage__Group__2__Impl : ( ( rule__NewMessage__TargetParticipantAssignment_2 ) ) ;
    public final void rule__NewMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3383:1: ( ( ( rule__NewMessage__TargetParticipantAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3384:1: ( ( rule__NewMessage__TargetParticipantAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3384:1: ( ( rule__NewMessage__TargetParticipantAssignment_2 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3385:1: ( rule__NewMessage__TargetParticipantAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getTargetParticipantAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3386:1: ( rule__NewMessage__TargetParticipantAssignment_2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3386:2: rule__NewMessage__TargetParticipantAssignment_2
            {
            pushFollow(FOLLOW_rule__NewMessage__TargetParticipantAssignment_2_in_rule__NewMessage__Group__2__Impl6841);
            rule__NewMessage__TargetParticipantAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getTargetParticipantAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__NewMessage__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3396:1: rule__NewMessage__Group__3 : rule__NewMessage__Group__3__Impl ;
    public final void rule__NewMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3400:1: ( rule__NewMessage__Group__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3401:2: rule__NewMessage__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__3__Impl_in_rule__NewMessage__Group__36871);
            rule__NewMessage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group__3"


    // $ANTLR start "rule__NewMessage__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3407:1: rule__NewMessage__Group__3__Impl : ( ( rule__NewMessage__Group_3__0 )? ) ;
    public final void rule__NewMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3411:1: ( ( ( rule__NewMessage__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3412:1: ( ( rule__NewMessage__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3412:1: ( ( rule__NewMessage__Group_3__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3413:1: ( rule__NewMessage__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3414:1: ( rule__NewMessage__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3414:2: rule__NewMessage__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NewMessage__Group_3__0_in_rule__NewMessage__Group__3__Impl6898);
                    rule__NewMessage__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group__3__Impl"


    // $ANTLR start "rule__NewMessage__Group_3__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3432:1: rule__NewMessage__Group_3__0 : rule__NewMessage__Group_3__0__Impl rule__NewMessage__Group_3__1 ;
    public final void rule__NewMessage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3436:1: ( rule__NewMessage__Group_3__0__Impl rule__NewMessage__Group_3__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3437:2: rule__NewMessage__Group_3__0__Impl rule__NewMessage__Group_3__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_3__0__Impl_in_rule__NewMessage__Group_3__06937);
            rule__NewMessage__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group_3__1_in_rule__NewMessage__Group_3__06940);
            rule__NewMessage__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3__0"


    // $ANTLR start "rule__NewMessage__Group_3__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3444:1: rule__NewMessage__Group_3__0__Impl : ( ( '(' ) ) ;
    public final void rule__NewMessage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3448:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3449:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3449:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3450:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getLeftParenthesisKeyword_3_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3451:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3452:2: '('
            {
            match(input,34,FOLLOW_34_in_rule__NewMessage__Group_3__0__Impl6969); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3__0__Impl"


    // $ANTLR start "rule__NewMessage__Group_3__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3463:1: rule__NewMessage__Group_3__1 : rule__NewMessage__Group_3__1__Impl rule__NewMessage__Group_3__2 ;
    public final void rule__NewMessage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3467:1: ( rule__NewMessage__Group_3__1__Impl rule__NewMessage__Group_3__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3468:2: rule__NewMessage__Group_3__1__Impl rule__NewMessage__Group_3__2
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_3__1__Impl_in_rule__NewMessage__Group_3__17001);
            rule__NewMessage__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group_3__2_in_rule__NewMessage__Group_3__17004);
            rule__NewMessage__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3__1"


    // $ANTLR start "rule__NewMessage__Group_3__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3475:1: rule__NewMessage__Group_3__1__Impl : ( ( rule__NewMessage__Group_3_1__0 )? ) ;
    public final void rule__NewMessage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3479:1: ( ( ( rule__NewMessage__Group_3_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3480:1: ( ( rule__NewMessage__Group_3_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3480:1: ( ( rule__NewMessage__Group_3_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3481:1: ( rule__NewMessage__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup_3_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3482:1: ( rule__NewMessage__Group_3_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3482:2: rule__NewMessage__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__NewMessage__Group_3_1__0_in_rule__NewMessage__Group_3__1__Impl7031);
                    rule__NewMessage__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3__1__Impl"


    // $ANTLR start "rule__NewMessage__Group_3__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3492:1: rule__NewMessage__Group_3__2 : rule__NewMessage__Group_3__2__Impl ;
    public final void rule__NewMessage__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3496:1: ( rule__NewMessage__Group_3__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3497:2: rule__NewMessage__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_3__2__Impl_in_rule__NewMessage__Group_3__27062);
            rule__NewMessage__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3__2"


    // $ANTLR start "rule__NewMessage__Group_3__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3503:1: rule__NewMessage__Group_3__2__Impl : ( ')' ) ;
    public final void rule__NewMessage__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3507:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3508:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3508:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3509:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__NewMessage__Group_3__2__Impl7090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3__2__Impl"


    // $ANTLR start "rule__NewMessage__Group_3_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3528:1: rule__NewMessage__Group_3_1__0 : rule__NewMessage__Group_3_1__0__Impl rule__NewMessage__Group_3_1__1 ;
    public final void rule__NewMessage__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3532:1: ( rule__NewMessage__Group_3_1__0__Impl rule__NewMessage__Group_3_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3533:2: rule__NewMessage__Group_3_1__0__Impl rule__NewMessage__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_3_1__0__Impl_in_rule__NewMessage__Group_3_1__07127);
            rule__NewMessage__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group_3_1__1_in_rule__NewMessage__Group_3_1__07130);
            rule__NewMessage__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3_1__0"


    // $ANTLR start "rule__NewMessage__Group_3_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3540:1: rule__NewMessage__Group_3_1__0__Impl : ( ( rule__NewMessage__ParameterAssignment_3_1_0 ) ) ;
    public final void rule__NewMessage__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3544:1: ( ( ( rule__NewMessage__ParameterAssignment_3_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3545:1: ( ( rule__NewMessage__ParameterAssignment_3_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3545:1: ( ( rule__NewMessage__ParameterAssignment_3_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3546:1: ( rule__NewMessage__ParameterAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParameterAssignment_3_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3547:1: ( rule__NewMessage__ParameterAssignment_3_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3547:2: rule__NewMessage__ParameterAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__NewMessage__ParameterAssignment_3_1_0_in_rule__NewMessage__Group_3_1__0__Impl7157);
            rule__NewMessage__ParameterAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParameterAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3_1__0__Impl"


    // $ANTLR start "rule__NewMessage__Group_3_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3557:1: rule__NewMessage__Group_3_1__1 : rule__NewMessage__Group_3_1__1__Impl ;
    public final void rule__NewMessage__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3561:1: ( rule__NewMessage__Group_3_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3562:2: rule__NewMessage__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_3_1__1__Impl_in_rule__NewMessage__Group_3_1__17187);
            rule__NewMessage__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3_1__1"


    // $ANTLR start "rule__NewMessage__Group_3_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3568:1: rule__NewMessage__Group_3_1__1__Impl : ( ( rule__NewMessage__Group_3_1_1__0 )* ) ;
    public final void rule__NewMessage__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3572:1: ( ( ( rule__NewMessage__Group_3_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3573:1: ( ( rule__NewMessage__Group_3_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3573:1: ( ( rule__NewMessage__Group_3_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3574:1: ( rule__NewMessage__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup_3_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3575:1: ( rule__NewMessage__Group_3_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3575:2: rule__NewMessage__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NewMessage__Group_3_1_1__0_in_rule__NewMessage__Group_3_1__1__Impl7214);
            	    rule__NewMessage__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getGroup_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3_1__1__Impl"


    // $ANTLR start "rule__NewMessage__Group_3_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3589:1: rule__NewMessage__Group_3_1_1__0 : rule__NewMessage__Group_3_1_1__0__Impl rule__NewMessage__Group_3_1_1__1 ;
    public final void rule__NewMessage__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3593:1: ( rule__NewMessage__Group_3_1_1__0__Impl rule__NewMessage__Group_3_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3594:2: rule__NewMessage__Group_3_1_1__0__Impl rule__NewMessage__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_3_1_1__0__Impl_in_rule__NewMessage__Group_3_1_1__07249);
            rule__NewMessage__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group_3_1_1__1_in_rule__NewMessage__Group_3_1_1__07252);
            rule__NewMessage__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3_1_1__0"


    // $ANTLR start "rule__NewMessage__Group_3_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3601:1: rule__NewMessage__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__NewMessage__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3605:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3606:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3606:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3607:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__NewMessage__Group_3_1_1__0__Impl7280); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getCommaKeyword_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__NewMessage__Group_3_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3620:1: rule__NewMessage__Group_3_1_1__1 : rule__NewMessage__Group_3_1_1__1__Impl ;
    public final void rule__NewMessage__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3624:1: ( rule__NewMessage__Group_3_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3625:2: rule__NewMessage__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_3_1_1__1__Impl_in_rule__NewMessage__Group_3_1_1__17311);
            rule__NewMessage__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3_1_1__1"


    // $ANTLR start "rule__NewMessage__Group_3_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3631:1: rule__NewMessage__Group_3_1_1__1__Impl : ( ( rule__NewMessage__ParameterAssignment_3_1_1_1 ) ) ;
    public final void rule__NewMessage__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3635:1: ( ( ( rule__NewMessage__ParameterAssignment_3_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3636:1: ( ( rule__NewMessage__ParameterAssignment_3_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3636:1: ( ( rule__NewMessage__ParameterAssignment_3_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3637:1: ( rule__NewMessage__ParameterAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParameterAssignment_3_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3638:1: ( rule__NewMessage__ParameterAssignment_3_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3638:2: rule__NewMessage__ParameterAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__NewMessage__ParameterAssignment_3_1_1_1_in_rule__NewMessage__Group_3_1_1__1__Impl7338);
            rule__NewMessage__ParameterAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParameterAssignment_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3652:1: rule__ReturnMessage__Group__0 : rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 ;
    public final void rule__ReturnMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3656:1: ( rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3657:2: rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__0__Impl_in_rule__ReturnMessage__Group__07372);
            rule__ReturnMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group__1_in_rule__ReturnMessage__Group__07375);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3664:1: rule__ReturnMessage__Group__0__Impl : ( 'returns' ) ;
    public final void rule__ReturnMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3668:1: ( ( 'returns' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3669:1: ( 'returns' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3669:1: ( 'returns' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3670:1: 'returns'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getReturnsKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ReturnMessage__Group__0__Impl7403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getReturnsKeyword_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3683:1: rule__ReturnMessage__Group__1 : rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 ;
    public final void rule__ReturnMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3687:1: ( rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3688:2: rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__1__Impl_in_rule__ReturnMessage__Group__17434);
            rule__ReturnMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group__2_in_rule__ReturnMessage__Group__17437);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3695:1: rule__ReturnMessage__Group__1__Impl : ( ( rule__ReturnMessage__NameAssignment_1 ) ) ;
    public final void rule__ReturnMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3699:1: ( ( ( rule__ReturnMessage__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3700:1: ( ( rule__ReturnMessage__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3700:1: ( ( rule__ReturnMessage__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3701:1: ( rule__ReturnMessage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3702:1: ( rule__ReturnMessage__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3702:2: rule__ReturnMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__NameAssignment_1_in_rule__ReturnMessage__Group__1__Impl7464);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3712:1: rule__ReturnMessage__Group__2 : rule__ReturnMessage__Group__2__Impl ;
    public final void rule__ReturnMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3716:1: ( rule__ReturnMessage__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3717:2: rule__ReturnMessage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__2__Impl_in_rule__ReturnMessage__Group__27494);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3723:1: rule__ReturnMessage__Group__2__Impl : ( ( rule__ReturnMessage__Group_2__0 )? ) ;
    public final void rule__ReturnMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3727:1: ( ( ( rule__ReturnMessage__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3728:1: ( ( rule__ReturnMessage__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3728:1: ( ( rule__ReturnMessage__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3729:1: ( rule__ReturnMessage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3730:1: ( rule__ReturnMessage__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3730:2: rule__ReturnMessage__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ReturnMessage__Group_2__0_in_rule__ReturnMessage__Group__2__Impl7521);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3746:1: rule__ReturnMessage__Group_2__0 : rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1 ;
    public final void rule__ReturnMessage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3750:1: ( rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3751:2: rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__0__Impl_in_rule__ReturnMessage__Group_2__07558);
            rule__ReturnMessage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__1_in_rule__ReturnMessage__Group_2__07561);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3758:1: rule__ReturnMessage__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__ReturnMessage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3762:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3763:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3763:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3764:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3765:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3766:2: '('
            {
            match(input,34,FOLLOW_34_in_rule__ReturnMessage__Group_2__0__Impl7590); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3777:1: rule__ReturnMessage__Group_2__1 : rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2 ;
    public final void rule__ReturnMessage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3781:1: ( rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3782:2: rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__1__Impl_in_rule__ReturnMessage__Group_2__17622);
            rule__ReturnMessage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__2_in_rule__ReturnMessage__Group_2__17625);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3789:1: rule__ReturnMessage__Group_2__1__Impl : ( ( rule__ReturnMessage__Group_2_1__0 )? ) ;
    public final void rule__ReturnMessage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3793:1: ( ( ( rule__ReturnMessage__Group_2_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3794:1: ( ( rule__ReturnMessage__Group_2_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3794:1: ( ( rule__ReturnMessage__Group_2_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3795:1: ( rule__ReturnMessage__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3796:1: ( rule__ReturnMessage__Group_2_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3796:2: rule__ReturnMessage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__0_in_rule__ReturnMessage__Group_2__1__Impl7652);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3806:1: rule__ReturnMessage__Group_2__2 : rule__ReturnMessage__Group_2__2__Impl ;
    public final void rule__ReturnMessage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3810:1: ( rule__ReturnMessage__Group_2__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3811:2: rule__ReturnMessage__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__2__Impl_in_rule__ReturnMessage__Group_2__27683);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3817:1: rule__ReturnMessage__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ReturnMessage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3821:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3822:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3822:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3823:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__ReturnMessage__Group_2__2__Impl7711); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3842:1: rule__ReturnMessage__Group_2_1__0 : rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1 ;
    public final void rule__ReturnMessage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3846:1: ( rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3847:2: rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__0__Impl_in_rule__ReturnMessage__Group_2_1__07748);
            rule__ReturnMessage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__1_in_rule__ReturnMessage__Group_2_1__07751);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3854:1: rule__ReturnMessage__Group_2_1__0__Impl : ( ( rule__ReturnMessage__ParameterAssignment_2_1_0 ) ) ;
    public final void rule__ReturnMessage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3858:1: ( ( ( rule__ReturnMessage__ParameterAssignment_2_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3859:1: ( ( rule__ReturnMessage__ParameterAssignment_2_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3859:1: ( ( rule__ReturnMessage__ParameterAssignment_2_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3860:1: ( rule__ReturnMessage__ParameterAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParameterAssignment_2_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3861:1: ( rule__ReturnMessage__ParameterAssignment_2_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3861:2: rule__ReturnMessage__ParameterAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__ReturnMessage__ParameterAssignment_2_1_0_in_rule__ReturnMessage__Group_2_1__0__Impl7778);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3871:1: rule__ReturnMessage__Group_2_1__1 : rule__ReturnMessage__Group_2_1__1__Impl ;
    public final void rule__ReturnMessage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3875:1: ( rule__ReturnMessage__Group_2_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3876:2: rule__ReturnMessage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__1__Impl_in_rule__ReturnMessage__Group_2_1__17808);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3882:1: rule__ReturnMessage__Group_2_1__1__Impl : ( ( rule__ReturnMessage__Group_2_1_1__0 )* ) ;
    public final void rule__ReturnMessage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3886:1: ( ( ( rule__ReturnMessage__Group_2_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3887:1: ( ( rule__ReturnMessage__Group_2_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3887:1: ( ( rule__ReturnMessage__Group_2_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3888:1: ( rule__ReturnMessage__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3889:1: ( rule__ReturnMessage__Group_2_1_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==21) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3889:2: rule__ReturnMessage__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__0_in_rule__ReturnMessage__Group_2_1__1__Impl7835);
            	    rule__ReturnMessage__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3903:1: rule__ReturnMessage__Group_2_1_1__0 : rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1 ;
    public final void rule__ReturnMessage__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3907:1: ( rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3908:2: rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__0__Impl_in_rule__ReturnMessage__Group_2_1_1__07870);
            rule__ReturnMessage__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__1_in_rule__ReturnMessage__Group_2_1_1__07873);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3915:1: rule__ReturnMessage__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__ReturnMessage__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3919:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3920:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3920:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3921:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__ReturnMessage__Group_2_1_1__0__Impl7901); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3934:1: rule__ReturnMessage__Group_2_1_1__1 : rule__ReturnMessage__Group_2_1_1__1__Impl ;
    public final void rule__ReturnMessage__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3938:1: ( rule__ReturnMessage__Group_2_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3939:2: rule__ReturnMessage__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__1__Impl_in_rule__ReturnMessage__Group_2_1_1__17932);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3945:1: rule__ReturnMessage__Group_2_1_1__1__Impl : ( ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 ) ) ;
    public final void rule__ReturnMessage__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3949:1: ( ( ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3950:1: ( ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3950:1: ( ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3951:1: ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParameterAssignment_2_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3952:1: ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3952:2: rule__ReturnMessage__ParameterAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__ParameterAssignment_2_1_1_1_in_rule__ReturnMessage__Group_2_1_1__1__Impl7959);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3966:1: rule__DeleteMessage__Group__0 : rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 ;
    public final void rule__DeleteMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3970:1: ( rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3971:2: rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__0__Impl_in_rule__DeleteMessage__Group__07993);
            rule__DeleteMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group__1_in_rule__DeleteMessage__Group__07996);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3978:1: rule__DeleteMessage__Group__0__Impl : ( ( rule__DeleteMessage__SourceParticipantAssignment_0 )? ) ;
    public final void rule__DeleteMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3982:1: ( ( ( rule__DeleteMessage__SourceParticipantAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3983:1: ( ( rule__DeleteMessage__SourceParticipantAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3983:1: ( ( rule__DeleteMessage__SourceParticipantAssignment_0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3984:1: ( rule__DeleteMessage__SourceParticipantAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getSourceParticipantAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3985:1: ( rule__DeleteMessage__SourceParticipantAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3985:2: rule__DeleteMessage__SourceParticipantAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DeleteMessage__SourceParticipantAssignment_0_in_rule__DeleteMessage__Group__0__Impl8023);
                    rule__DeleteMessage__SourceParticipantAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getSourceParticipantAssignment_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3995:1: rule__DeleteMessage__Group__1 : rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 ;
    public final void rule__DeleteMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3999:1: ( rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4000:2: rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__1__Impl_in_rule__DeleteMessage__Group__18054);
            rule__DeleteMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group__2_in_rule__DeleteMessage__Group__18057);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4007:1: rule__DeleteMessage__Group__1__Impl : ( 'destroys' ) ;
    public final void rule__DeleteMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4011:1: ( ( 'destroys' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4012:1: ( 'destroys' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4012:1: ( 'destroys' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4013:1: 'destroys'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getDestroysKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__DeleteMessage__Group__1__Impl8085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getDestroysKeyword_1()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4026:1: rule__DeleteMessage__Group__2 : rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3 ;
    public final void rule__DeleteMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4030:1: ( rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4031:2: rule__DeleteMessage__Group__2__Impl rule__DeleteMessage__Group__3
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__2__Impl_in_rule__DeleteMessage__Group__28116);
            rule__DeleteMessage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group__3_in_rule__DeleteMessage__Group__28119);
            rule__DeleteMessage__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4038:1: rule__DeleteMessage__Group__2__Impl : ( ( rule__DeleteMessage__TargetParticipantAssignment_2 ) ) ;
    public final void rule__DeleteMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4042:1: ( ( ( rule__DeleteMessage__TargetParticipantAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4043:1: ( ( rule__DeleteMessage__TargetParticipantAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4043:1: ( ( rule__DeleteMessage__TargetParticipantAssignment_2 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4044:1: ( rule__DeleteMessage__TargetParticipantAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getTargetParticipantAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4045:1: ( rule__DeleteMessage__TargetParticipantAssignment_2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4045:2: rule__DeleteMessage__TargetParticipantAssignment_2
            {
            pushFollow(FOLLOW_rule__DeleteMessage__TargetParticipantAssignment_2_in_rule__DeleteMessage__Group__2__Impl8146);
            rule__DeleteMessage__TargetParticipantAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getTargetParticipantAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__DeleteMessage__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4055:1: rule__DeleteMessage__Group__3 : rule__DeleteMessage__Group__3__Impl ;
    public final void rule__DeleteMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4059:1: ( rule__DeleteMessage__Group__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4060:2: rule__DeleteMessage__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__3__Impl_in_rule__DeleteMessage__Group__38176);
            rule__DeleteMessage__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__3"


    // $ANTLR start "rule__DeleteMessage__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4066:1: rule__DeleteMessage__Group__3__Impl : ( ( rule__DeleteMessage__Group_3__0 )? ) ;
    public final void rule__DeleteMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4070:1: ( ( ( rule__DeleteMessage__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4071:1: ( ( rule__DeleteMessage__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4071:1: ( ( rule__DeleteMessage__Group_3__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4072:1: ( rule__DeleteMessage__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4073:1: ( rule__DeleteMessage__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==34) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4073:2: rule__DeleteMessage__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DeleteMessage__Group_3__0_in_rule__DeleteMessage__Group__3__Impl8203);
                    rule__DeleteMessage__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group__3__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_3__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4091:1: rule__DeleteMessage__Group_3__0 : rule__DeleteMessage__Group_3__0__Impl rule__DeleteMessage__Group_3__1 ;
    public final void rule__DeleteMessage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4095:1: ( rule__DeleteMessage__Group_3__0__Impl rule__DeleteMessage__Group_3__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4096:2: rule__DeleteMessage__Group_3__0__Impl rule__DeleteMessage__Group_3__1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3__0__Impl_in_rule__DeleteMessage__Group_3__08242);
            rule__DeleteMessage__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3__1_in_rule__DeleteMessage__Group_3__08245);
            rule__DeleteMessage__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3__0"


    // $ANTLR start "rule__DeleteMessage__Group_3__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4103:1: rule__DeleteMessage__Group_3__0__Impl : ( ( '(' ) ) ;
    public final void rule__DeleteMessage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4107:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4108:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4108:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4109:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getLeftParenthesisKeyword_3_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4110:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4111:2: '('
            {
            match(input,34,FOLLOW_34_in_rule__DeleteMessage__Group_3__0__Impl8274); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_3__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4122:1: rule__DeleteMessage__Group_3__1 : rule__DeleteMessage__Group_3__1__Impl rule__DeleteMessage__Group_3__2 ;
    public final void rule__DeleteMessage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4126:1: ( rule__DeleteMessage__Group_3__1__Impl rule__DeleteMessage__Group_3__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4127:2: rule__DeleteMessage__Group_3__1__Impl rule__DeleteMessage__Group_3__2
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3__1__Impl_in_rule__DeleteMessage__Group_3__18306);
            rule__DeleteMessage__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3__2_in_rule__DeleteMessage__Group_3__18309);
            rule__DeleteMessage__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3__1"


    // $ANTLR start "rule__DeleteMessage__Group_3__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4134:1: rule__DeleteMessage__Group_3__1__Impl : ( ( rule__DeleteMessage__Group_3_1__0 )? ) ;
    public final void rule__DeleteMessage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4138:1: ( ( ( rule__DeleteMessage__Group_3_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4139:1: ( ( rule__DeleteMessage__Group_3_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4139:1: ( ( rule__DeleteMessage__Group_3_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4140:1: ( rule__DeleteMessage__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getGroup_3_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4141:1: ( rule__DeleteMessage__Group_3_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4141:2: rule__DeleteMessage__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__DeleteMessage__Group_3_1__0_in_rule__DeleteMessage__Group_3__1__Impl8336);
                    rule__DeleteMessage__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3__1__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_3__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4151:1: rule__DeleteMessage__Group_3__2 : rule__DeleteMessage__Group_3__2__Impl ;
    public final void rule__DeleteMessage__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4155:1: ( rule__DeleteMessage__Group_3__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4156:2: rule__DeleteMessage__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3__2__Impl_in_rule__DeleteMessage__Group_3__28367);
            rule__DeleteMessage__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3__2"


    // $ANTLR start "rule__DeleteMessage__Group_3__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4162:1: rule__DeleteMessage__Group_3__2__Impl : ( ')' ) ;
    public final void rule__DeleteMessage__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4166:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4167:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4167:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4168:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__DeleteMessage__Group_3__2__Impl8395); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3__2__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_3_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4187:1: rule__DeleteMessage__Group_3_1__0 : rule__DeleteMessage__Group_3_1__0__Impl rule__DeleteMessage__Group_3_1__1 ;
    public final void rule__DeleteMessage__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4191:1: ( rule__DeleteMessage__Group_3_1__0__Impl rule__DeleteMessage__Group_3_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4192:2: rule__DeleteMessage__Group_3_1__0__Impl rule__DeleteMessage__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3_1__0__Impl_in_rule__DeleteMessage__Group_3_1__08432);
            rule__DeleteMessage__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3_1__1_in_rule__DeleteMessage__Group_3_1__08435);
            rule__DeleteMessage__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3_1__0"


    // $ANTLR start "rule__DeleteMessage__Group_3_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4199:1: rule__DeleteMessage__Group_3_1__0__Impl : ( ( rule__DeleteMessage__ParameterAssignment_3_1_0 ) ) ;
    public final void rule__DeleteMessage__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4203:1: ( ( ( rule__DeleteMessage__ParameterAssignment_3_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4204:1: ( ( rule__DeleteMessage__ParameterAssignment_3_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4204:1: ( ( rule__DeleteMessage__ParameterAssignment_3_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4205:1: ( rule__DeleteMessage__ParameterAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getParameterAssignment_3_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4206:1: ( rule__DeleteMessage__ParameterAssignment_3_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4206:2: rule__DeleteMessage__ParameterAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__DeleteMessage__ParameterAssignment_3_1_0_in_rule__DeleteMessage__Group_3_1__0__Impl8462);
            rule__DeleteMessage__ParameterAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getParameterAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3_1__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_3_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4216:1: rule__DeleteMessage__Group_3_1__1 : rule__DeleteMessage__Group_3_1__1__Impl ;
    public final void rule__DeleteMessage__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4220:1: ( rule__DeleteMessage__Group_3_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4221:2: rule__DeleteMessage__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3_1__1__Impl_in_rule__DeleteMessage__Group_3_1__18492);
            rule__DeleteMessage__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3_1__1"


    // $ANTLR start "rule__DeleteMessage__Group_3_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4227:1: rule__DeleteMessage__Group_3_1__1__Impl : ( ( rule__DeleteMessage__Group_3_1_1__0 )* ) ;
    public final void rule__DeleteMessage__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4231:1: ( ( ( rule__DeleteMessage__Group_3_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4232:1: ( ( rule__DeleteMessage__Group_3_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4232:1: ( ( rule__DeleteMessage__Group_3_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4233:1: ( rule__DeleteMessage__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getGroup_3_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4234:1: ( rule__DeleteMessage__Group_3_1_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==21) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4234:2: rule__DeleteMessage__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DeleteMessage__Group_3_1_1__0_in_rule__DeleteMessage__Group_3_1__1__Impl8519);
            	    rule__DeleteMessage__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getGroup_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3_1__1__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_3_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4248:1: rule__DeleteMessage__Group_3_1_1__0 : rule__DeleteMessage__Group_3_1_1__0__Impl rule__DeleteMessage__Group_3_1_1__1 ;
    public final void rule__DeleteMessage__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4252:1: ( rule__DeleteMessage__Group_3_1_1__0__Impl rule__DeleteMessage__Group_3_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4253:2: rule__DeleteMessage__Group_3_1_1__0__Impl rule__DeleteMessage__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3_1_1__0__Impl_in_rule__DeleteMessage__Group_3_1_1__08554);
            rule__DeleteMessage__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3_1_1__1_in_rule__DeleteMessage__Group_3_1_1__08557);
            rule__DeleteMessage__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3_1_1__0"


    // $ANTLR start "rule__DeleteMessage__Group_3_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4260:1: rule__DeleteMessage__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__DeleteMessage__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4264:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4265:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4265:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4266:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__DeleteMessage__Group_3_1_1__0__Impl8585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getCommaKeyword_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_3_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4279:1: rule__DeleteMessage__Group_3_1_1__1 : rule__DeleteMessage__Group_3_1_1__1__Impl ;
    public final void rule__DeleteMessage__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4283:1: ( rule__DeleteMessage__Group_3_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4284:2: rule__DeleteMessage__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_3_1_1__1__Impl_in_rule__DeleteMessage__Group_3_1_1__18616);
            rule__DeleteMessage__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3_1_1__1"


    // $ANTLR start "rule__DeleteMessage__Group_3_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4290:1: rule__DeleteMessage__Group_3_1_1__1__Impl : ( ( rule__DeleteMessage__ParameterAssignment_3_1_1_1 ) ) ;
    public final void rule__DeleteMessage__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4294:1: ( ( ( rule__DeleteMessage__ParameterAssignment_3_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4295:1: ( ( rule__DeleteMessage__ParameterAssignment_3_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4295:1: ( ( rule__DeleteMessage__ParameterAssignment_3_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4296:1: ( rule__DeleteMessage__ParameterAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getParameterAssignment_3_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4297:1: ( rule__DeleteMessage__ParameterAssignment_3_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4297:2: rule__DeleteMessage__ParameterAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__ParameterAssignment_3_1_1_1_in_rule__DeleteMessage__Group_3_1_1__1__Impl8643);
            rule__DeleteMessage__ParameterAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getParameterAssignment_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4311:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4315:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4316:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__08677);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__08680);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4323:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4327:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4328:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4328:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4329:1: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4330:1: ( rule__Parameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4330:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl8707);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4340:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4344:1: ( rule__Parameter__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4345:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__18737);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4351:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Group_1__0 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4355:1: ( ( ( rule__Parameter__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4356:1: ( ( rule__Parameter__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4356:1: ( ( rule__Parameter__Group_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4357:1: ( rule__Parameter__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4358:1: ( rule__Parameter__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4358:2: rule__Parameter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_1__0_in_rule__Parameter__Group__1__Impl8764);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4372:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4376:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4377:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1__0__Impl_in_rule__Parameter__Group_1__08799);
            rule__Parameter__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_1__1_in_rule__Parameter__Group_1__08802);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4384:1: rule__Parameter__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4388:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4389:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4389:1: ( ':' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4390:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Parameter__Group_1__0__Impl8830); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4403:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4407:1: ( rule__Parameter__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4408:2: rule__Parameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1__1__Impl_in_rule__Parameter__Group_1__18861);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4414:1: rule__Parameter__Group_1__1__Impl : ( ( rule__Parameter__TypeAssignment_1_1 ) ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4418:1: ( ( ( rule__Parameter__TypeAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4419:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4419:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4420:1: ( rule__Parameter__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4421:1: ( rule__Parameter__TypeAssignment_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4421:2: rule__Parameter__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_1_in_rule__Parameter__Group_1__1__Impl8888);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4435:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4439:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4440:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08922);
            rule__Reference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08925);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4447:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__TypeAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4451:1: ( ( ( rule__Reference__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4452:1: ( ( rule__Reference__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4452:1: ( ( rule__Reference__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4453:1: ( rule__Reference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4454:1: ( rule__Reference__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4454:2: rule__Reference__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl8952);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4464:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4468:1: ( rule__Reference__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4469:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18982);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4475:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ArrayAssignment_1 )* ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4479:1: ( ( ( rule__Reference__ArrayAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4480:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4480:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4481:1: ( rule__Reference__ArrayAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4482:1: ( rule__Reference__ArrayAssignment_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==40) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4482:2: rule__Reference__ArrayAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl9009);
            	    rule__Reference__ArrayAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4496:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4500:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4501:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__09044);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__09047);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4508:1: rule__Array__Group__0__Impl : ( () ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4512:1: ( ( () ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4513:1: ( () )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4513:1: ( () )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4514:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getArrayAction_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4515:1: ()
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4517:1: 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4527:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4531:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4532:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19105);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19108);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4539:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4543:1: ( ( '[' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4544:1: ( '[' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4544:1: ( '[' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4545:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Array__Group__1__Impl9136); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4558:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4562:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4563:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29167);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__29170);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4570:1: rule__Array__Group__2__Impl : ( ( rule__Array__SizeAssignment_2 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4574:1: ( ( ( rule__Array__SizeAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4575:1: ( ( rule__Array__SizeAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4575:1: ( ( rule__Array__SizeAssignment_2 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4576:1: ( rule__Array__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4577:1: ( rule__Array__SizeAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_NATURAL) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4577:2: rule__Array__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl9197);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4587:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4591:1: ( rule__Array__Group__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4592:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__39228);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4598:1: rule__Array__Group__3__Impl : ( ']' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4602:1: ( ( ']' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4603:1: ( ']' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4603:1: ( ']' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4604:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__Array__Group__3__Impl9256); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4625:1: rule__ForeachExpression__Group__0 : rule__ForeachExpression__Group__0__Impl rule__ForeachExpression__Group__1 ;
    public final void rule__ForeachExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4629:1: ( rule__ForeachExpression__Group__0__Impl rule__ForeachExpression__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4630:2: rule__ForeachExpression__Group__0__Impl rule__ForeachExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group__0__Impl_in_rule__ForeachExpression__Group__09295);
            rule__ForeachExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachExpression__Group__1_in_rule__ForeachExpression__Group__09298);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4637:1: rule__ForeachExpression__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ForeachExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4641:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4642:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4642:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4643:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForeachExpression__Group__0__Impl9325); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4654:1: rule__ForeachExpression__Group__1 : rule__ForeachExpression__Group__1__Impl rule__ForeachExpression__Group__2 ;
    public final void rule__ForeachExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4658:1: ( rule__ForeachExpression__Group__1__Impl rule__ForeachExpression__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4659:2: rule__ForeachExpression__Group__1__Impl rule__ForeachExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group__1__Impl_in_rule__ForeachExpression__Group__19354);
            rule__ForeachExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachExpression__Group__2_in_rule__ForeachExpression__Group__19357);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4666:1: rule__ForeachExpression__Group__1__Impl : ( 'in' ) ;
    public final void rule__ForeachExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4670:1: ( ( 'in' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4671:1: ( 'in' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4671:1: ( 'in' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4672:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getInKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ForeachExpression__Group__1__Impl9385); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4685:1: rule__ForeachExpression__Group__2 : rule__ForeachExpression__Group__2__Impl ;
    public final void rule__ForeachExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4689:1: ( rule__ForeachExpression__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4690:2: rule__ForeachExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group__2__Impl_in_rule__ForeachExpression__Group__29416);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4696:1: rule__ForeachExpression__Group__2__Impl : ( ( rule__ForeachExpression__Alternatives_2 ) ) ;
    public final void rule__ForeachExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4700:1: ( ( ( rule__ForeachExpression__Alternatives_2 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4701:1: ( ( rule__ForeachExpression__Alternatives_2 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4701:1: ( ( rule__ForeachExpression__Alternatives_2 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4702:1: ( rule__ForeachExpression__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getAlternatives_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4703:1: ( rule__ForeachExpression__Alternatives_2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4703:2: rule__ForeachExpression__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Alternatives_2_in_rule__ForeachExpression__Group__2__Impl9443);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4719:1: rule__ForeachExpression__Group_2_0__0 : rule__ForeachExpression__Group_2_0__0__Impl rule__ForeachExpression__Group_2_0__1 ;
    public final void rule__ForeachExpression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4723:1: ( rule__ForeachExpression__Group_2_0__0__Impl rule__ForeachExpression__Group_2_0__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4724:2: rule__ForeachExpression__Group_2_0__0__Impl rule__ForeachExpression__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__0__Impl_in_rule__ForeachExpression__Group_2_0__09479);
            rule__ForeachExpression__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__1_in_rule__ForeachExpression__Group_2_0__09482);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4731:1: rule__ForeachExpression__Group_2_0__0__Impl : ( RULE_NATURAL ) ;
    public final void rule__ForeachExpression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4735:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4736:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4736:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4737:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__ForeachExpression__Group_2_0__0__Impl9509); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4748:1: rule__ForeachExpression__Group_2_0__1 : rule__ForeachExpression__Group_2_0__1__Impl rule__ForeachExpression__Group_2_0__2 ;
    public final void rule__ForeachExpression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4752:1: ( rule__ForeachExpression__Group_2_0__1__Impl rule__ForeachExpression__Group_2_0__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4753:2: rule__ForeachExpression__Group_2_0__1__Impl rule__ForeachExpression__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__1__Impl_in_rule__ForeachExpression__Group_2_0__19538);
            rule__ForeachExpression__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__2_in_rule__ForeachExpression__Group_2_0__19541);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4760:1: rule__ForeachExpression__Group_2_0__1__Impl : ( '..' ) ;
    public final void rule__ForeachExpression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4764:1: ( ( '..' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4765:1: ( '..' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4765:1: ( '..' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4766:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getFullStopFullStopKeyword_2_0_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__ForeachExpression__Group_2_0__1__Impl9569); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4779:1: rule__ForeachExpression__Group_2_0__2 : rule__ForeachExpression__Group_2_0__2__Impl ;
    public final void rule__ForeachExpression__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4783:1: ( rule__ForeachExpression__Group_2_0__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4784:2: rule__ForeachExpression__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__2__Impl_in_rule__ForeachExpression__Group_2_0__29600);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4790:1: rule__ForeachExpression__Group_2_0__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__ForeachExpression__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4794:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4795:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4795:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4796:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__ForeachExpression__Group_2_0__2__Impl9627); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4813:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4817:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4818:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__09662);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__09665);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4825:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4829:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4830:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4830:1: ( '@' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4831:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Annotation__Group__0__Impl9693); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4844:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4848:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4849:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__19724);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__19727);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4856:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4860:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4861:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4861:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4862:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4863:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4863:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl9754);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4873:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4877:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4878:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__29784);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4884:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4888:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4889:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4889:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4890:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4891:1: ( rule__Annotation__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4891:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl9811);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4907:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4911:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4912:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__09848);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__09851);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4919:1: rule__Annotation__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4923:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4924:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4924:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4925:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4926:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4927:2: '('
            {
            match(input,34,FOLLOW_34_in_rule__Annotation__Group_2__0__Impl9880); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4938:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4942:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4943:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__19912);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__19915);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4950:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4954:1: ( ( ( rule__Annotation__ParameterAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4955:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4955:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4956:1: ( rule__Annotation__ParameterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4957:1: ( rule__Annotation__ParameterAssignment_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4957:2: rule__Annotation__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl9942);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4967:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4971:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4972:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__29972);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__29975);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4979:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4983:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4984:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4984:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4985:1: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4986:1: ( rule__Annotation__Group_2_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==21) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4986:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl10002);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4996:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5000:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5001:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__310033);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5007:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5011:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5012:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5012:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5013:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__Annotation__Group_2__3__Impl10061); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5034:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5038:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5039:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__010100);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__010103);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5046:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5050:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5051:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5051:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5052:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Annotation__Group_2_2__0__Impl10131); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5065:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5069:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5070:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__110162);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5076:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5080:1: ( ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5081:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5081:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5082:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5083:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5083:2: rule__Annotation__ParameterAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl10189);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5098:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5102:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5103:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010224);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010227);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5110:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5114:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5115:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5115:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5116:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10254); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5127:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5131:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5132:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110283);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5138:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5142:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5143:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5143:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5144:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5145:1: ( rule__ExtendedID__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==33) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5145:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10310);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5159:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5163:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5164:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010345);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010348);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5171:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5175:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5176:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5176:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5177:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__ExtendedID__Group_1__0__Impl10376); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5190:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5194:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5195:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110407);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5201:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5205:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5206:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5206:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5207:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl10434); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5222:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5226:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5227:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__010467);
            rule__Real__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__010470);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5234:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5238:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5239:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5239:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5240:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5241:1: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==17) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5242:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Real__Group__0__Impl10499); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5253:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5257:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5258:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__110532);
            rule__Real__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__110535);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5265:1: rule__Real__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5269:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5270:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5270:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5271:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl10562); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5282:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5286:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5287:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__210591);
            rule__Real__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__3_in_rule__Real__Group__210594);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5294:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5298:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5299:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5299:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5300:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Real__Group__2__Impl10622); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5313:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5317:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5318:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__310653);
            rule__Real__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__4_in_rule__Real__Group__310656);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5325:1: rule__Real__Group__3__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5329:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5330:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5330:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5331:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl10683); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5342:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5346:1: ( rule__Real__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5347:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__410712);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5353:1: rule__Real__Group__4__Impl : ( ( rule__Real__Group_4__0 )? ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5357:1: ( ( ( rule__Real__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5358:1: ( ( rule__Real__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5358:1: ( ( rule__Real__Group_4__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5359:1: ( rule__Real__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5360:1: ( rule__Real__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=14 && LA51_0<=15)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5360:2: rule__Real__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl10739);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5380:1: rule__Real__Group_4__0 : rule__Real__Group_4__0__Impl rule__Real__Group_4__1 ;
    public final void rule__Real__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5384:1: ( rule__Real__Group_4__0__Impl rule__Real__Group_4__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5385:2: rule__Real__Group_4__0__Impl rule__Real__Group_4__1
            {
            pushFollow(FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__010780);
            rule__Real__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__010783);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5392:1: rule__Real__Group_4__0__Impl : ( ( rule__Real__Alternatives_4_0 ) ) ;
    public final void rule__Real__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5396:1: ( ( ( rule__Real__Alternatives_4_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5397:1: ( ( rule__Real__Alternatives_4_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5397:1: ( ( rule__Real__Alternatives_4_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5398:1: ( rule__Real__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5399:1: ( rule__Real__Alternatives_4_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5399:2: rule__Real__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl10810);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5409:1: rule__Real__Group_4__1 : rule__Real__Group_4__1__Impl rule__Real__Group_4__2 ;
    public final void rule__Real__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5413:1: ( rule__Real__Group_4__1__Impl rule__Real__Group_4__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5414:2: rule__Real__Group_4__1__Impl rule__Real__Group_4__2
            {
            pushFollow(FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__110840);
            rule__Real__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__110843);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5421:1: rule__Real__Group_4__1__Impl : ( ( rule__Real__Alternatives_4_1 ) ) ;
    public final void rule__Real__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5425:1: ( ( ( rule__Real__Alternatives_4_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5426:1: ( ( rule__Real__Alternatives_4_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5426:1: ( ( rule__Real__Alternatives_4_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5427:1: ( rule__Real__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5428:1: ( rule__Real__Alternatives_4_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5428:2: rule__Real__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl10870);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5438:1: rule__Real__Group_4__2 : rule__Real__Group_4__2__Impl ;
    public final void rule__Real__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5442:1: ( rule__Real__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5443:2: rule__Real__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__210900);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5449:1: rule__Real__Group_4__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5453:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5454:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5454:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5455:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl10927); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5472:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5476:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5477:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__010962);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__010965);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5484:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5488:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5489:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5489:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5490:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5491:1: ( '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==17) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5492:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Integer__Group__0__Impl10994); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5503:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5507:1: ( rule__Integer__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5508:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__111027);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5514:1: rule__Integer__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5518:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5519:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5519:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5520:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl11054); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5536:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5540:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5541:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5541:1: ( ruleImport )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5542:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_011092);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5551:1: rule__Model__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Model__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5555:1: ( ( ruleSequence ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5556:1: ( ruleSequence )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5556:1: ( ruleSequence )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:1: ruleSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSequenceSequenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSequence_in_rule__Model__SequenceAssignment_111123);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5566:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5570:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5571:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5571:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5572:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111154); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5581:1: rule__Sequence__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Sequence__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5585:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5586:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5586:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5587:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Sequence__AnnotationAssignment_011185);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5596:1: rule__Sequence__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5600:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5601:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5601:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5602:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_211216); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5611:1: rule__Sequence__ParticipantAssignment_3 : ( ruleParticipant ) ;
    public final void rule__Sequence__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5615:1: ( ( ruleParticipant ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5616:1: ( ruleParticipant )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5616:1: ( ruleParticipant )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5617:1: ruleParticipant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleParticipant_in_rule__Sequence__ParticipantAssignment_311247);
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


    // $ANTLR start "rule__Sequence__ParticipantAssignment_4_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5626:1: rule__Sequence__ParticipantAssignment_4_1 : ( ruleParticipant ) ;
    public final void rule__Sequence__ParticipantAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5630:1: ( ( ruleParticipant ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5631:1: ( ruleParticipant )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5631:1: ( ruleParticipant )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5632:1: ruleParticipant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleParticipant_in_rule__Sequence__ParticipantAssignment_4_111278);
            ruleParticipant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__ParticipantAssignment_4_1"


    // $ANTLR start "rule__Sequence__TransitionAssignment_5"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5641:1: rule__Sequence__TransitionAssignment_5 : ( ruleTransition ) ;
    public final void rule__Sequence__TransitionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5645:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5646:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5646:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5647:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getTransitionTransitionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__Sequence__TransitionAssignment_511309);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getTransitionTransitionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__TransitionAssignment_5"


    // $ANTLR start "rule__Participant__NameAssignment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5656:1: rule__Participant__NameAssignment : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5660:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5661:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5661:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5662:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Participant__NameAssignment11340); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__NameAssignment"


    // $ANTLR start "rule__IfElseFragment__ExprAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5671:1: rule__IfElseFragment__ExprAssignment_1 : ( ruleValueWithSpaces ) ;
    public final void rule__IfElseFragment__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5675:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5676:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5676:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5677:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__IfElseFragment__ExprAssignment_111371);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5686:1: rule__IfElseFragment__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__IfElseFragment__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5690:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5691:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5691:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5692:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__IfElseFragment__TransitionAssignment_311402);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5701:1: rule__IfElseFragment__ElseIfExprAssignment_4_1 : ( ruleValueWithSpaces ) ;
    public final void rule__IfElseFragment__ElseIfExprAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5705:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5706:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5706:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5707:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseIfExprValueWithSpacesParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__IfElseFragment__ElseIfExprAssignment_4_111433);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5716:1: rule__IfElseFragment__ElseIftransitionAssignment_4_3 : ( ruleTransition ) ;
    public final void rule__IfElseFragment__ElseIftransitionAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5720:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5721:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5721:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5722:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseIftransitionTransitionParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__IfElseFragment__ElseIftransitionAssignment_4_311464);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5731:1: rule__IfElseFragment__ElseTransitionAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__IfElseFragment__ElseTransitionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5735:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5736:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5736:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5737:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseTransitionTransitionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__IfElseFragment__ElseTransitionAssignment_5_111495);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5746:1: rule__ForeachFragment__ExprAssignment_1 : ( ruleForeachExpression ) ;
    public final void rule__ForeachFragment__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5750:1: ( ( ruleForeachExpression ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5751:1: ( ruleForeachExpression )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5751:1: ( ruleForeachExpression )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5752:1: ruleForeachExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getExprForeachExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_rule__ForeachFragment__ExprAssignment_111526);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5761:1: rule__ForeachFragment__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__ForeachFragment__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5765:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5766:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5766:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5767:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__ForeachFragment__TransitionAssignment_311557);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5776:1: rule__LoopFragment__ExprAssignment_1 : ( ruleValueWithSpaces ) ;
    public final void rule__LoopFragment__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5780:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5781:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5781:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5782:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__LoopFragment__ExprAssignment_111588);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5791:1: rule__LoopFragment__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__LoopFragment__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5795:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5796:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5796:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5797:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__LoopFragment__TransitionAssignment_311619);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5806:1: rule__AssertFragment__ExprAssignment_1 : ( ruleValueWithSpaces ) ;
    public final void rule__AssertFragment__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5810:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5811:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5811:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5812:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__AssertFragment__ExprAssignment_111650);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5821:1: rule__AssertFragment__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__AssertFragment__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5825:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5826:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5826:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5827:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__AssertFragment__TransitionAssignment_311681);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5836:1: rule__BreakFragment__ExprAssignment_2_0 : ( ruleValueWithSpaces ) ;
    public final void rule__BreakFragment__ExprAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5840:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5841:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5841:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5842:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__BreakFragment__ExprAssignment_2_011712);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5851:1: rule__BreakFragment__TransitionAssignment_2_2 : ( ruleTransition ) ;
    public final void rule__BreakFragment__TransitionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5855:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5856:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5856:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5857:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__BreakFragment__TransitionAssignment_2_211743);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5866:1: rule__NextFragment__ExprAssignment_2_0 : ( ruleValueWithSpaces ) ;
    public final void rule__NextFragment__ExprAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5870:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5871:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5871:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5872:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__NextFragment__ExprAssignment_2_011774);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5881:1: rule__NextFragment__TransitionAssignment_2_2 : ( ruleTransition ) ;
    public final void rule__NextFragment__TransitionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5885:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5886:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5886:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5887:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__NextFragment__TransitionAssignment_2_211805);
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


    // $ANTLR start "rule__CallMessage__SourceParticipantAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5896:1: rule__CallMessage__SourceParticipantAssignment_0 : ( RULE_ID ) ;
    public final void rule__CallMessage__SourceParticipantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5900:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5901:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5901:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5902:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__SourceParticipantAssignment_011836); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__SourceParticipantAssignment_0"


    // $ANTLR start "rule__CallMessage__TargetParticipantAssignment_2_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5911:1: rule__CallMessage__TargetParticipantAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__CallMessage__TargetParticipantAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5915:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5916:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5916:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5917:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__TargetParticipantAssignment_2_011867); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__TargetParticipantAssignment_2_0"


    // $ANTLR start "rule__CallMessage__NameAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5926:1: rule__CallMessage__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CallMessage__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5930:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5931:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5931:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5932:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__NameAssignment_311898); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__NameAssignment_3"


    // $ANTLR start "rule__CallMessage__ParameterAssignment_4_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5941:1: rule__CallMessage__ParameterAssignment_4_1_0 : ( ruleParameter ) ;
    public final void rule__CallMessage__ParameterAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5945:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5946:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5946:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5947:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_4_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__CallMessage__ParameterAssignment_4_1_011929);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_4_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__ParameterAssignment_4_1_0"


    // $ANTLR start "rule__CallMessage__ParameterAssignment_4_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5956:1: rule__CallMessage__ParameterAssignment_4_1_1_1 : ( ruleParameter ) ;
    public final void rule__CallMessage__ParameterAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5960:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5961:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5961:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5962:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_4_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__CallMessage__ParameterAssignment_4_1_1_111960);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_4_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__ParameterAssignment_4_1_1_1"


    // $ANTLR start "rule__CallMessage__ReturnAssignment_5"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5971:1: rule__CallMessage__ReturnAssignment_5 : ( ruleReturnMessage ) ;
    public final void rule__CallMessage__ReturnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5975:1: ( ( ruleReturnMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5976:1: ( ruleReturnMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5976:1: ( ruleReturnMessage )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5977:1: ruleReturnMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getReturnReturnMessageParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleReturnMessage_in_rule__CallMessage__ReturnAssignment_511991);
            ruleReturnMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getReturnReturnMessageParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMessage__ReturnAssignment_5"


    // $ANTLR start "rule__NewMessage__SourceParticipantAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5986:1: rule__NewMessage__SourceParticipantAssignment_0 : ( RULE_ID ) ;
    public final void rule__NewMessage__SourceParticipantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5990:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5991:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5991:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5992:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMessage__SourceParticipantAssignment_012022); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__SourceParticipantAssignment_0"


    // $ANTLR start "rule__NewMessage__TargetParticipantAssignment_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6001:1: rule__NewMessage__TargetParticipantAssignment_2 : ( RULE_ID ) ;
    public final void rule__NewMessage__TargetParticipantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6005:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6006:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6006:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6007:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMessage__TargetParticipantAssignment_212053); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__TargetParticipantAssignment_2"


    // $ANTLR start "rule__NewMessage__ParameterAssignment_3_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6016:1: rule__NewMessage__ParameterAssignment_3_1_0 : ( ruleParameter ) ;
    public final void rule__NewMessage__ParameterAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6020:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6021:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6021:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6022:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__NewMessage__ParameterAssignment_3_1_012084);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__ParameterAssignment_3_1_0"


    // $ANTLR start "rule__NewMessage__ParameterAssignment_3_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6031:1: rule__NewMessage__ParameterAssignment_3_1_1_1 : ( ruleParameter ) ;
    public final void rule__NewMessage__ParameterAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6035:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6036:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6036:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6037:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__NewMessage__ParameterAssignment_3_1_1_112115);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMessage__ParameterAssignment_3_1_1_1"


    // $ANTLR start "rule__ReturnMessage__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6046:1: rule__ReturnMessage__NameAssignment_1 : ( ruleReference ) ;
    public final void rule__ReturnMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6050:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6051:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6051:1: ( ruleReference )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6052:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getNameReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__ReturnMessage__NameAssignment_112146);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6061:1: rule__ReturnMessage__ParameterAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__ReturnMessage__ParameterAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6065:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6066:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6066:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6067:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReturnMessage__ParameterAssignment_2_1_012177);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6076:1: rule__ReturnMessage__ParameterAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__ReturnMessage__ParameterAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6080:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6081:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6081:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6082:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReturnMessage__ParameterAssignment_2_1_1_112208);
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


    // $ANTLR start "rule__DeleteMessage__SourceParticipantAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6091:1: rule__DeleteMessage__SourceParticipantAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeleteMessage__SourceParticipantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6095:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6096:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6096:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6097:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeleteMessage__SourceParticipantAssignment_012239); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__SourceParticipantAssignment_0"


    // $ANTLR start "rule__DeleteMessage__TargetParticipantAssignment_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6106:1: rule__DeleteMessage__TargetParticipantAssignment_2 : ( RULE_ID ) ;
    public final void rule__DeleteMessage__TargetParticipantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6110:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6111:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6111:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6112:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeleteMessage__TargetParticipantAssignment_212270); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__TargetParticipantAssignment_2"


    // $ANTLR start "rule__DeleteMessage__ParameterAssignment_3_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6121:1: rule__DeleteMessage__ParameterAssignment_3_1_0 : ( ruleParameter ) ;
    public final void rule__DeleteMessage__ParameterAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6125:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6126:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6126:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6127:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__DeleteMessage__ParameterAssignment_3_1_012301);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__ParameterAssignment_3_1_0"


    // $ANTLR start "rule__DeleteMessage__ParameterAssignment_3_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6136:1: rule__DeleteMessage__ParameterAssignment_3_1_1_1 : ( ruleParameter ) ;
    public final void rule__DeleteMessage__ParameterAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6140:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6141:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6141:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6142:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__DeleteMessage__ParameterAssignment_3_1_1_112332);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteMessage__ParameterAssignment_3_1_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6151:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6155:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6156:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6156:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6157:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012363); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6166:1: rule__Parameter__TypeAssignment_1_1 : ( ruleReference ) ;
    public final void rule__Parameter__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6170:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6171:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6171:1: ( ruleReference )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6172:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_1_112394);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6181:1: rule__Reference__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Reference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6185:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6186:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6186:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6187:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__TypeAssignment_012425); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6196:1: rule__Reference__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__Reference__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6200:1: ( ( ruleArray ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6201:1: ( ruleArray )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6201:1: ( ruleArray )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6202:1: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_112456);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6211:1: rule__Array__SizeAssignment_2 : ( RULE_NATURAL ) ;
    public final void rule__Array__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6215:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6216:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6216:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6217:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeNATURALTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Array__SizeAssignment_212487); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6226:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6230:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6231:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6231:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6232:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_112518);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6241:1: rule__Annotation__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6245:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6246:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6246:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6247:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_112549);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6256:1: rule__Annotation__ParameterAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6260:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6261:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6261:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6262:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_112580);
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
    public static final BitSet FOLLOW_rule__Participant__NameAssignment_in_ruleParticipant280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_in_ruleTransition340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fragment__Alternatives_in_ruleFragment400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseFragment434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__0_in_ruleIfElseFragment460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachFragment494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__0_in_ruleForeachFragment520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopFragment554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__0_in_ruleLoopFragment580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertFragment614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__0_in_ruleAssertFragment640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakFragment674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__0_in_ruleBreakFragment700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_entryRuleNextFragment727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextFragment734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__0_in_ruleNextFragment760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Alternatives_in_ruleMessage820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_entryRuleCallMessage847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallMessage854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__0_in_ruleCallMessage880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_entryRuleNewMessage907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMessage914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__0_in_ruleNewMessage940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnMessage974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__0_in_ruleReturnMessage1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteMessage1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__0_in_ruleDeleteMessage1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachExpression1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__0_in_ruleForeachExpression1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueWithSpaces1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueWithSpaces__Alternatives_in_ruleValueWithSpaces1378 = new BitSet(new long[]{0x0000000000020FF2L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Transition__Alternatives1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_rule__Transition__Alternatives1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_rule__Fragment__Alternatives1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_rule__Fragment__Alternatives1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_rule__Fragment__Alternatives1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_rule__Fragment__Alternatives1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_rule__Fragment__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_rule__Fragment__Alternatives1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_rule__Message__Alternatives1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_rule__Message__Alternatives1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_rule__Message__Alternatives1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__0_in_rule__ForeachExpression__Alternatives_21953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForeachExpression__Alternatives_21971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_rule__ValueWithSpaces__Alternatives2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ValueWithSpaces__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ValueWithSpaces__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ValueWithSpaces__Alternatives2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Value__Alternatives2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__Alternatives2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Real__Alternatives_4_02205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Real__Alternatives_4_02225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Alternatives_4_12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Alternatives_4_12280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02312 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2342 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SequenceAssignment_1_in_rule__Model__Group__1__Impl2400 = new BitSet(new long[]{0x0000100000080002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02435 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02558 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__AnnotationAssignment_0_in_rule__Sequence__Group__0__Impl2588 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sequence__Group__1__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_2_in_rule__Sequence__Group__2__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32743 = new BitSet(new long[]{0x00000051F4700010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ParticipantAssignment_3_in_rule__Sequence__Group__3__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42803 = new BitSet(new long[]{0x00000051F4700010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__42806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_4__0_in_rule__Sequence__Group__4__Impl2833 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__52864 = new BitSet(new long[]{0x00000051F4700010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__6_in_rule__Sequence__Group__52867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__TransitionAssignment_5_in_rule__Sequence__Group__5__Impl2894 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__Sequence__Group__6__Impl_in_rule__Sequence__Group__62925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sequence__Group__6__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_4__0__Impl_in_rule__Sequence__Group_4__02998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group_4__1_in_rule__Sequence__Group_4__03001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sequence__Group_4__0__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_4__1__Impl_in_rule__Sequence__Group_4__13060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ParticipantAssignment_4_1_in_rule__Sequence__Group_4__1__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__0__Impl_in_rule__IfElseFragment__Group__03121 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__1_in_rule__IfElseFragment__Group__03124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IfElseFragment__Group__0__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__1__Impl_in_rule__IfElseFragment__Group__13183 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__2_in_rule__IfElseFragment__Group__13186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__ExprAssignment_1_in_rule__IfElseFragment__Group__1__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__2__Impl_in_rule__IfElseFragment__Group__23243 = new BitSet(new long[]{0x00000051F7500010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__3_in_rule__IfElseFragment__Group__23246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IfElseFragment__Group__2__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__3__Impl_in_rule__IfElseFragment__Group__33305 = new BitSet(new long[]{0x00000051F7500010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__4_in_rule__IfElseFragment__Group__33308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__TransitionAssignment_3_in_rule__IfElseFragment__Group__3__Impl3335 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__4__Impl_in_rule__IfElseFragment__Group__43366 = new BitSet(new long[]{0x00000051F7500010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__5_in_rule__IfElseFragment__Group__43369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__0_in_rule__IfElseFragment__Group__4__Impl3396 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__5__Impl_in_rule__IfElseFragment__Group__53427 = new BitSet(new long[]{0x00000051F7500010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__6_in_rule__IfElseFragment__Group__53430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_5__0_in_rule__IfElseFragment__Group__5__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__6__Impl_in_rule__IfElseFragment__Group__63488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IfElseFragment__Group__6__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__0__Impl_in_rule__IfElseFragment__Group_4__03561 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__1_in_rule__IfElseFragment__Group_4__03564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IfElseFragment__Group_4__0__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__1__Impl_in_rule__IfElseFragment__Group_4__13625 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__2_in_rule__IfElseFragment__Group_4__13628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__ElseIfExprAssignment_4_1_in_rule__IfElseFragment__Group_4__1__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__2__Impl_in_rule__IfElseFragment__Group_4__23685 = new BitSet(new long[]{0x00000051F4400010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__3_in_rule__IfElseFragment__Group_4__23688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IfElseFragment__Group_4__2__Impl3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__3__Impl_in_rule__IfElseFragment__Group_4__33747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__ElseIftransitionAssignment_4_3_in_rule__IfElseFragment__Group_4__3__Impl3774 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_5__0__Impl_in_rule__IfElseFragment__Group_5__03813 = new BitSet(new long[]{0x00000051F4400010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_5__1_in_rule__IfElseFragment__Group_5__03816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IfElseFragment__Group_5__0__Impl3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_5__1__Impl_in_rule__IfElseFragment__Group_5__13877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__ElseTransitionAssignment_5_1_in_rule__IfElseFragment__Group_5__1__Impl3904 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__0__Impl_in_rule__ForeachFragment__Group__03939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__1_in_rule__ForeachFragment__Group__03942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ForeachFragment__Group__0__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__1__Impl_in_rule__ForeachFragment__Group__14001 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__2_in_rule__ForeachFragment__Group__14004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__ExprAssignment_1_in_rule__ForeachFragment__Group__1__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__2__Impl_in_rule__ForeachFragment__Group__24061 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__3_in_rule__ForeachFragment__Group__24064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ForeachFragment__Group__2__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__3__Impl_in_rule__ForeachFragment__Group__34123 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__4_in_rule__ForeachFragment__Group__34126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__TransitionAssignment_3_in_rule__ForeachFragment__Group__3__Impl4153 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__4__Impl_in_rule__ForeachFragment__Group__44184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ForeachFragment__Group__4__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__0__Impl_in_rule__LoopFragment__Group__04253 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__1_in_rule__LoopFragment__Group__04256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LoopFragment__Group__0__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__1__Impl_in_rule__LoopFragment__Group__14315 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__2_in_rule__LoopFragment__Group__14318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__ExprAssignment_1_in_rule__LoopFragment__Group__1__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__2__Impl_in_rule__LoopFragment__Group__24375 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__3_in_rule__LoopFragment__Group__24378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LoopFragment__Group__2__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__3__Impl_in_rule__LoopFragment__Group__34437 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__4_in_rule__LoopFragment__Group__34440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__TransitionAssignment_3_in_rule__LoopFragment__Group__3__Impl4467 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__4__Impl_in_rule__LoopFragment__Group__44498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LoopFragment__Group__4__Impl4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__0__Impl_in_rule__AssertFragment__Group__04567 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__1_in_rule__AssertFragment__Group__04570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AssertFragment__Group__0__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__1__Impl_in_rule__AssertFragment__Group__14629 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__2_in_rule__AssertFragment__Group__14632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__ExprAssignment_1_in_rule__AssertFragment__Group__1__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__2__Impl_in_rule__AssertFragment__Group__24689 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__3_in_rule__AssertFragment__Group__24692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AssertFragment__Group__2__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__3__Impl_in_rule__AssertFragment__Group__34751 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__4_in_rule__AssertFragment__Group__34754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__TransitionAssignment_3_in_rule__AssertFragment__Group__3__Impl4781 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__4__Impl_in_rule__AssertFragment__Group__44812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AssertFragment__Group__4__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__0__Impl_in_rule__BreakFragment__Group__04881 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__1_in_rule__BreakFragment__Group__04884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__1__Impl_in_rule__BreakFragment__Group__14942 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__2_in_rule__BreakFragment__Group__14945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BreakFragment__Group__1__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__2__Impl_in_rule__BreakFragment__Group__25004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__0_in_rule__BreakFragment__Group__2__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__0__Impl_in_rule__BreakFragment__Group_2__05068 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__1_in_rule__BreakFragment__Group_2__05071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__ExprAssignment_2_0_in_rule__BreakFragment__Group_2__0__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__1__Impl_in_rule__BreakFragment__Group_2__15128 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__2_in_rule__BreakFragment__Group_2__15131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BreakFragment__Group_2__1__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__2__Impl_in_rule__BreakFragment__Group_2__25190 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__3_in_rule__BreakFragment__Group_2__25193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__TransitionAssignment_2_2_in_rule__BreakFragment__Group_2__2__Impl5220 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__3__Impl_in_rule__BreakFragment__Group_2__35251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BreakFragment__Group_2__3__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__0__Impl_in_rule__NextFragment__Group__05318 = new BitSet(new long[]{0x00000051F4400010L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__1_in_rule__NextFragment__Group__05321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__1__Impl_in_rule__NextFragment__Group__15379 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__2_in_rule__NextFragment__Group__15382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NextFragment__Group__1__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__2__Impl_in_rule__NextFragment__Group__25441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__0_in_rule__NextFragment__Group__2__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__0__Impl_in_rule__NextFragment__Group_2__05505 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__1_in_rule__NextFragment__Group_2__05508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__ExprAssignment_2_0_in_rule__NextFragment__Group_2__0__Impl5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__1__Impl_in_rule__NextFragment__Group_2__15565 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__2_in_rule__NextFragment__Group_2__15568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NextFragment__Group_2__1__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__2__Impl_in_rule__NextFragment__Group_2__25627 = new BitSet(new long[]{0x00000051F4500010L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__3_in_rule__NextFragment__Group_2__25630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__TransitionAssignment_2_2_in_rule__NextFragment__Group_2__2__Impl5657 = new BitSet(new long[]{0x00000051F4400012L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__3__Impl_in_rule__NextFragment__Group_2__35688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NextFragment__Group_2__3__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__0__Impl_in_rule__CallMessage__Group__05755 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__1_in_rule__CallMessage__Group__05758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__SourceParticipantAssignment_0_in_rule__CallMessage__Group__0__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__1__Impl_in_rule__CallMessage__Group__15816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__2_in_rule__CallMessage__Group__15819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CallMessage__Group__1__Impl5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__2__Impl_in_rule__CallMessage__Group__25878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__3_in_rule__CallMessage__Group__25881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__0_in_rule__CallMessage__Group__2__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__3__Impl_in_rule__CallMessage__Group__35939 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__4_in_rule__CallMessage__Group__35942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__NameAssignment_3_in_rule__CallMessage__Group__3__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__4__Impl_in_rule__CallMessage__Group__45999 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__5_in_rule__CallMessage__Group__46002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4__0_in_rule__CallMessage__Group__4__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__5__Impl_in_rule__CallMessage__Group__56060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ReturnAssignment_5_in_rule__CallMessage__Group__5__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__0__Impl_in_rule__CallMessage__Group_2__06130 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__1_in_rule__CallMessage__Group_2__06133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__TargetParticipantAssignment_2_0_in_rule__CallMessage__Group_2__0__Impl6160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__1__Impl_in_rule__CallMessage__Group_2__16190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CallMessage__Group_2__1__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4__0__Impl_in_rule__CallMessage__Group_4__06253 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4__1_in_rule__CallMessage__Group_4__06256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CallMessage__Group_4__0__Impl6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4__1__Impl_in_rule__CallMessage__Group_4__16317 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4__2_in_rule__CallMessage__Group_4__16320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4_1__0_in_rule__CallMessage__Group_4__1__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4__2__Impl_in_rule__CallMessage__Group_4__26378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CallMessage__Group_4__2__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4_1__0__Impl_in_rule__CallMessage__Group_4_1__06443 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4_1__1_in_rule__CallMessage__Group_4_1__06446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParameterAssignment_4_1_0_in_rule__CallMessage__Group_4_1__0__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4_1__1__Impl_in_rule__CallMessage__Group_4_1__16503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4_1_1__0_in_rule__CallMessage__Group_4_1__1__Impl6530 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4_1_1__0__Impl_in_rule__CallMessage__Group_4_1_1__06565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4_1_1__1_in_rule__CallMessage__Group_4_1_1__06568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CallMessage__Group_4_1_1__0__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_4_1_1__1__Impl_in_rule__CallMessage__Group_4_1_1__16627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParameterAssignment_4_1_1_1_in_rule__CallMessage__Group_4_1_1__1__Impl6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__0__Impl_in_rule__NewMessage__Group__06688 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__1_in_rule__NewMessage__Group__06691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__SourceParticipantAssignment_0_in_rule__NewMessage__Group__0__Impl6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__1__Impl_in_rule__NewMessage__Group__16749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__2_in_rule__NewMessage__Group__16752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__NewMessage__Group__1__Impl6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__2__Impl_in_rule__NewMessage__Group__26811 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__3_in_rule__NewMessage__Group__26814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__TargetParticipantAssignment_2_in_rule__NewMessage__Group__2__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__3__Impl_in_rule__NewMessage__Group__36871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3__0_in_rule__NewMessage__Group__3__Impl6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3__0__Impl_in_rule__NewMessage__Group_3__06937 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3__1_in_rule__NewMessage__Group_3__06940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NewMessage__Group_3__0__Impl6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3__1__Impl_in_rule__NewMessage__Group_3__17001 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3__2_in_rule__NewMessage__Group_3__17004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3_1__0_in_rule__NewMessage__Group_3__1__Impl7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3__2__Impl_in_rule__NewMessage__Group_3__27062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NewMessage__Group_3__2__Impl7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3_1__0__Impl_in_rule__NewMessage__Group_3_1__07127 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3_1__1_in_rule__NewMessage__Group_3_1__07130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__ParameterAssignment_3_1_0_in_rule__NewMessage__Group_3_1__0__Impl7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3_1__1__Impl_in_rule__NewMessage__Group_3_1__17187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3_1_1__0_in_rule__NewMessage__Group_3_1__1__Impl7214 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3_1_1__0__Impl_in_rule__NewMessage__Group_3_1_1__07249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3_1_1__1_in_rule__NewMessage__Group_3_1_1__07252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NewMessage__Group_3_1_1__0__Impl7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_3_1_1__1__Impl_in_rule__NewMessage__Group_3_1_1__17311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__ParameterAssignment_3_1_1_1_in_rule__NewMessage__Group_3_1_1__1__Impl7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__0__Impl_in_rule__ReturnMessage__Group__07372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__1_in_rule__ReturnMessage__Group__07375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ReturnMessage__Group__0__Impl7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__1__Impl_in_rule__ReturnMessage__Group__17434 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__2_in_rule__ReturnMessage__Group__17437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__NameAssignment_1_in_rule__ReturnMessage__Group__1__Impl7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__2__Impl_in_rule__ReturnMessage__Group__27494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__0_in_rule__ReturnMessage__Group__2__Impl7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__0__Impl_in_rule__ReturnMessage__Group_2__07558 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__1_in_rule__ReturnMessage__Group_2__07561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ReturnMessage__Group_2__0__Impl7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__1__Impl_in_rule__ReturnMessage__Group_2__17622 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__2_in_rule__ReturnMessage__Group_2__17625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__0_in_rule__ReturnMessage__Group_2__1__Impl7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__2__Impl_in_rule__ReturnMessage__Group_2__27683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ReturnMessage__Group_2__2__Impl7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__0__Impl_in_rule__ReturnMessage__Group_2_1__07748 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__1_in_rule__ReturnMessage__Group_2_1__07751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__ParameterAssignment_2_1_0_in_rule__ReturnMessage__Group_2_1__0__Impl7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__1__Impl_in_rule__ReturnMessage__Group_2_1__17808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__0_in_rule__ReturnMessage__Group_2_1__1__Impl7835 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__0__Impl_in_rule__ReturnMessage__Group_2_1_1__07870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__1_in_rule__ReturnMessage__Group_2_1_1__07873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReturnMessage__Group_2_1_1__0__Impl7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__1__Impl_in_rule__ReturnMessage__Group_2_1_1__17932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__ParameterAssignment_2_1_1_1_in_rule__ReturnMessage__Group_2_1_1__1__Impl7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__0__Impl_in_rule__DeleteMessage__Group__07993 = new BitSet(new long[]{0x0000005100000010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__1_in_rule__DeleteMessage__Group__07996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__SourceParticipantAssignment_0_in_rule__DeleteMessage__Group__0__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__1__Impl_in_rule__DeleteMessage__Group__18054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__2_in_rule__DeleteMessage__Group__18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DeleteMessage__Group__1__Impl8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__2__Impl_in_rule__DeleteMessage__Group__28116 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__3_in_rule__DeleteMessage__Group__28119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__TargetParticipantAssignment_2_in_rule__DeleteMessage__Group__2__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__3__Impl_in_rule__DeleteMessage__Group__38176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3__0_in_rule__DeleteMessage__Group__3__Impl8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3__0__Impl_in_rule__DeleteMessage__Group_3__08242 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3__1_in_rule__DeleteMessage__Group_3__08245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DeleteMessage__Group_3__0__Impl8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3__1__Impl_in_rule__DeleteMessage__Group_3__18306 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3__2_in_rule__DeleteMessage__Group_3__18309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3_1__0_in_rule__DeleteMessage__Group_3__1__Impl8336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3__2__Impl_in_rule__DeleteMessage__Group_3__28367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DeleteMessage__Group_3__2__Impl8395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3_1__0__Impl_in_rule__DeleteMessage__Group_3_1__08432 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3_1__1_in_rule__DeleteMessage__Group_3_1__08435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__ParameterAssignment_3_1_0_in_rule__DeleteMessage__Group_3_1__0__Impl8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3_1__1__Impl_in_rule__DeleteMessage__Group_3_1__18492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3_1_1__0_in_rule__DeleteMessage__Group_3_1__1__Impl8519 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3_1_1__0__Impl_in_rule__DeleteMessage__Group_3_1_1__08554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3_1_1__1_in_rule__DeleteMessage__Group_3_1_1__08557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DeleteMessage__Group_3_1_1__0__Impl8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_3_1_1__1__Impl_in_rule__DeleteMessage__Group_3_1_1__18616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__ParameterAssignment_3_1_1_1_in_rule__DeleteMessage__Group_3_1_1__1__Impl8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__08677 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__08680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__18737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__0_in_rule__Parameter__Group__1__Impl8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__0__Impl_in_rule__Parameter__Group_1__08799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__1_in_rule__Parameter__Group_1__08802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Parameter__Group_1__0__Impl8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__1__Impl_in_rule__Parameter__Group_1__18861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_1_in_rule__Parameter__Group_1__1__Impl8888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08922 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl9009 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__09044 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__09047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19105 = new BitSet(new long[]{0x0000020000000800L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Array__Group__1__Impl9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29167 = new BitSet(new long[]{0x0000020000000800L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__29170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__39228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Array__Group__3__Impl9256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__0__Impl_in_rule__ForeachExpression__Group__09295 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__1_in_rule__ForeachExpression__Group__09298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForeachExpression__Group__0__Impl9325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__1__Impl_in_rule__ForeachExpression__Group__19354 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__2_in_rule__ForeachExpression__Group__19357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ForeachExpression__Group__1__Impl9385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__2__Impl_in_rule__ForeachExpression__Group__29416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Alternatives_2_in_rule__ForeachExpression__Group__2__Impl9443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__0__Impl_in_rule__ForeachExpression__Group_2_0__09479 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__1_in_rule__ForeachExpression__Group_2_0__09482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__ForeachExpression__Group_2_0__0__Impl9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__1__Impl_in_rule__ForeachExpression__Group_2_0__19538 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__2_in_rule__ForeachExpression__Group_2_0__19541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ForeachExpression__Group_2_0__1__Impl9569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__2__Impl_in_rule__ForeachExpression__Group_2_0__29600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__ForeachExpression__Group_2_0__2__Impl9627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__09662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__09665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Annotation__Group__0__Impl9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__19724 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__19727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__29784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl9811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__09848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__09851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Annotation__Group_2__0__Impl9880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__19912 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__19915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl9942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__29972 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__29975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl10002 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__310033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Annotation__Group_2__3__Impl10061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__010100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__010103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Annotation__Group_2_2__0__Impl10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__110162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl10189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010224 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10310 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExtendedID__Group_1__0__Impl10376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl10434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__010467 = new BitSet(new long[]{0x0000000000020F10L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__010470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Group__0__Impl10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__110532 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__110535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__210591 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Real__Group__3_in_rule__Real__Group__210594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Real__Group__2__Impl10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__310653 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Real__Group__4_in_rule__Real__Group__310656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl10683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__410712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl10739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__010780 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__010783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl10810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__110840 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__110843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl10870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__210900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__010962 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__010965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Integer__Group__0__Impl10994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__111027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl11054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_011092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Model__SequenceAssignment_111123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Sequence__AnnotationAssignment_011185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_211216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_rule__Sequence__ParticipantAssignment_311247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_rule__Sequence__ParticipantAssignment_4_111278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Sequence__TransitionAssignment_511309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Participant__NameAssignment11340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__IfElseFragment__ExprAssignment_111371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__IfElseFragment__TransitionAssignment_311402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__IfElseFragment__ElseIfExprAssignment_4_111433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__IfElseFragment__ElseIftransitionAssignment_4_311464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__IfElseFragment__ElseTransitionAssignment_5_111495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_rule__ForeachFragment__ExprAssignment_111526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__ForeachFragment__TransitionAssignment_311557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__LoopFragment__ExprAssignment_111588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__LoopFragment__TransitionAssignment_311619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__AssertFragment__ExprAssignment_111650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__AssertFragment__TransitionAssignment_311681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__BreakFragment__ExprAssignment_2_011712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__BreakFragment__TransitionAssignment_2_211743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__NextFragment__ExprAssignment_2_011774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__NextFragment__TransitionAssignment_2_211805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__SourceParticipantAssignment_011836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__TargetParticipantAssignment_2_011867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__NameAssignment_311898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CallMessage__ParameterAssignment_4_1_011929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CallMessage__ParameterAssignment_4_1_1_111960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_rule__CallMessage__ReturnAssignment_511991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMessage__SourceParticipantAssignment_012022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMessage__TargetParticipantAssignment_212053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__NewMessage__ParameterAssignment_3_1_012084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__NewMessage__ParameterAssignment_3_1_1_112115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__ReturnMessage__NameAssignment_112146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReturnMessage__ParameterAssignment_2_1_012177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReturnMessage__ParameterAssignment_2_1_1_112208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeleteMessage__SourceParticipantAssignment_012239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeleteMessage__TargetParticipantAssignment_212270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DeleteMessage__ParameterAssignment_3_1_012301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DeleteMessage__ParameterAssignment_3_1_1_112332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_1_112394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__TypeAssignment_012425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_112456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Array__SizeAssignment_212487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_112518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_112549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_112580 = new BitSet(new long[]{0x0000000000000002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'sequence'", "'{'", "'}'", "':'", "'call'", "'.'", "'reply'", "'self'", "'create'", "'destroy'", "'('", "')'", "', '", "'actor'"
    };
    public static final int RULE_ID=4;
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


    // $ANTLR start "entryRuleIdentifier"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:117:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:118:1: ( ruleIdentifier EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:119:1: ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier187);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier194); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:126:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:130:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:131:1: ( ( rule__Identifier__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:131:1: ( ( rule__Identifier__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:132:1: ( rule__Identifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:133:1: ( rule__Identifier__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:133:2: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier220);
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


    // $ANTLR start "entryRuleSequence"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:145:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:146:1: ( ruleSequence EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:147:1: ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence247);
            ruleSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence254); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:154:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:158:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:159:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:159:1: ( ( rule__Sequence__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:160:1: ( rule__Sequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:161:1: ( rule__Sequence__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:161:2: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0_in_ruleSequence280);
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


    // $ANTLR start "entryRuleLifelineName"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:173:1: entryRuleLifelineName : ruleLifelineName EOF ;
    public final void entryRuleLifelineName() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:174:1: ( ruleLifelineName EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:175:1: ruleLifelineName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineNameRule()); 
            }
            pushFollow(FOLLOW_ruleLifelineName_in_entryRuleLifelineName307);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLifelineName314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLifelineName"


    // $ANTLR start "ruleLifelineName"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:182:1: ruleLifelineName : ( RULE_ID ) ;
    public final void ruleLifelineName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:186:2: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:187:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:187:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:188:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineNameAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLifelineName340); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineNameAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLifelineName"


    // $ANTLR start "entryRuleLifeline"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:201:1: entryRuleLifeline : ruleLifeline EOF ;
    public final void entryRuleLifeline() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:202:1: ( ruleLifeline EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:203:1: ruleLifeline EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineRule()); 
            }
            pushFollow(FOLLOW_ruleLifeline_in_entryRuleLifeline366);
            ruleLifeline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLifeline373); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLifeline"


    // $ANTLR start "ruleLifeline"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:210:1: ruleLifeline : ( ( rule__Lifeline__Group__0 ) ) ;
    public final void ruleLifeline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:214:2: ( ( ( rule__Lifeline__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:215:1: ( ( rule__Lifeline__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:215:1: ( ( rule__Lifeline__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:216:1: ( rule__Lifeline__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:217:1: ( rule__Lifeline__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:217:2: rule__Lifeline__Group__0
            {
            pushFollow(FOLLOW_rule__Lifeline__Group__0_in_ruleLifeline399);
            rule__Lifeline__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLifeline"


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:229:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:230:1: ( ruleTransition EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:231:1: ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition426);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition433); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:238:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:242:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:243:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:243:1: ( ( rule__Transition__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:244:1: ( rule__Transition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:245:1: ( rule__Transition__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:245:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition459);
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


    // $ANTLR start "entryRuleStatement"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:257:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:258:1: ( ruleStatement EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:259:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement486);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement493); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:266:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:270:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:271:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:271:1: ( ( rule__Statement__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:272:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:273:1: ( rule__Statement__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:273:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement519);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCall"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:285:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:286:1: ( ruleCall EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:287:1: ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall546);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall553); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:294:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:298:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:299:1: ( ( rule__Call__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:299:1: ( ( rule__Call__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:300:1: ( rule__Call__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:301:1: ( rule__Call__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:301:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall579);
            rule__Call__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleReply"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:313:1: entryRuleReply : ruleReply EOF ;
    public final void entryRuleReply() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:314:1: ( ruleReply EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:315:1: ruleReply EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyRule()); 
            }
            pushFollow(FOLLOW_ruleReply_in_entryRuleReply606);
            ruleReply();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReply613); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReply"


    // $ANTLR start "ruleReply"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:322:1: ruleReply : ( ( rule__Reply__Group__0 ) ) ;
    public final void ruleReply() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:326:2: ( ( ( rule__Reply__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:327:1: ( ( rule__Reply__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:327:1: ( ( rule__Reply__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:328:1: ( rule__Reply__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:329:1: ( rule__Reply__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:329:2: rule__Reply__Group__0
            {
            pushFollow(FOLLOW_rule__Reply__Group__0_in_ruleReply639);
            rule__Reply__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReply"


    // $ANTLR start "entryRuleSelf"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:341:1: entryRuleSelf : ruleSelf EOF ;
    public final void entryRuleSelf() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:342:1: ( ruleSelf EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:343:1: ruleSelf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfRule()); 
            }
            pushFollow(FOLLOW_ruleSelf_in_entryRuleSelf666);
            ruleSelf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelf673); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSelf"


    // $ANTLR start "ruleSelf"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:350:1: ruleSelf : ( ( rule__Self__Group__0 ) ) ;
    public final void ruleSelf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:354:2: ( ( ( rule__Self__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:355:1: ( ( rule__Self__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:355:1: ( ( rule__Self__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:356:1: ( rule__Self__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:357:1: ( rule__Self__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:357:2: rule__Self__Group__0
            {
            pushFollow(FOLLOW_rule__Self__Group__0_in_ruleSelf699);
            rule__Self__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelf"


    // $ANTLR start "entryRuleCreate"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:369:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:370:1: ( ruleCreate EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:371:1: ruleCreate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCreateRule()); 
            }
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate726);
            ruleCreate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCreateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate733); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:378:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:382:2: ( ( ( rule__Create__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:383:1: ( ( rule__Create__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:383:1: ( ( rule__Create__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:384:1: ( rule__Create__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCreateAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:385:1: ( rule__Create__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:385:2: rule__Create__Group__0
            {
            pushFollow(FOLLOW_rule__Create__Group__0_in_ruleCreate759);
            rule__Create__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCreateAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleDestroy"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:397:1: entryRuleDestroy : ruleDestroy EOF ;
    public final void entryRuleDestroy() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:398:1: ( ruleDestroy EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:399:1: ruleDestroy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestroyRule()); 
            }
            pushFollow(FOLLOW_ruleDestroy_in_entryRuleDestroy786);
            ruleDestroy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestroyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestroy793); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDestroy"


    // $ANTLR start "ruleDestroy"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:406:1: ruleDestroy : ( ( rule__Destroy__Group__0 ) ) ;
    public final void ruleDestroy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:410:2: ( ( ( rule__Destroy__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:411:1: ( ( rule__Destroy__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:411:1: ( ( rule__Destroy__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:412:1: ( rule__Destroy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestroyAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:413:1: ( rule__Destroy__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:413:2: rule__Destroy__Group__0
            {
            pushFollow(FOLLOW_rule__Destroy__Group__0_in_ruleDestroy819);
            rule__Destroy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestroyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestroy"


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
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage846);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage853); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:434:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:438:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:439:1: ( ( rule__Message__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:439:1: ( ( rule__Message__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:440:1: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:441:1: ( rule__Message__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:441:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage879);
            rule__Message__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:453:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:454:1: ( ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:455:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName906);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName913); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:462:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:466:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:467:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:467:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:468:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:469:1: ( rule__QualifiedName__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:469:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName939);
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


    // $ANTLR start "rule__Identifier__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:481:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:485:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:486:1: ( RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:486:1: ( RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:487:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__Alternatives975); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:492:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:492:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:493:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives992); if (state.failed) return ;
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


    // $ANTLR start "rule__Statement__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:503:1: rule__Statement__Alternatives : ( ( ruleCall ) | ( ruleReply ) | ( ruleSelf ) | ( ruleCreate ) | ( ruleDestroy ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:507:1: ( ( ruleCall ) | ( ruleReply ) | ( ruleSelf ) | ( ruleCreate ) | ( ruleDestroy ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:508:1: ( ruleCall )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:508:1: ( ruleCall )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:509:1: ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getCallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCall_in_rule__Statement__Alternatives1024);
                    ruleCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getCallParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:514:6: ( ruleReply )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:514:6: ( ruleReply )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:515:1: ruleReply
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getReplyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReply_in_rule__Statement__Alternatives1041);
                    ruleReply();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getReplyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:520:6: ( ruleSelf )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:520:6: ( ruleSelf )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:521:1: ruleSelf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSelfParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSelf_in_rule__Statement__Alternatives1058);
                    ruleSelf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getSelfParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:526:6: ( ruleCreate )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:526:6: ( ruleCreate )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:527:1: ruleCreate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getCreateParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleCreate_in_rule__Statement__Alternatives1075);
                    ruleCreate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getCreateParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:532:6: ( ruleDestroy )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:532:6: ( ruleDestroy )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:533:1: ruleDestroy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDestroyParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleDestroy_in_rule__Statement__Alternatives1092);
                    ruleDestroy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDestroyParserRuleCall_4()); 
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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Sequencemodel__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:545:1: rule__Sequencemodel__Group__0 : rule__Sequencemodel__Group__0__Impl rule__Sequencemodel__Group__1 ;
    public final void rule__Sequencemodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:549:1: ( rule__Sequencemodel__Group__0__Impl rule__Sequencemodel__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:550:2: rule__Sequencemodel__Group__0__Impl rule__Sequencemodel__Group__1
            {
            pushFollow(FOLLOW_rule__Sequencemodel__Group__0__Impl_in_rule__Sequencemodel__Group__01122);
            rule__Sequencemodel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequencemodel__Group__1_in_rule__Sequencemodel__Group__01125);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:557:1: rule__Sequencemodel__Group__0__Impl : ( ( rule__Sequencemodel__ImportsAssignment_0 )* ) ;
    public final void rule__Sequencemodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:561:1: ( ( ( rule__Sequencemodel__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:562:1: ( ( rule__Sequencemodel__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:562:1: ( ( rule__Sequencemodel__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:563:1: ( rule__Sequencemodel__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:564:1: ( rule__Sequencemodel__ImportsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:564:2: rule__Sequencemodel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Sequencemodel__ImportsAssignment_0_in_rule__Sequencemodel__Group__0__Impl1152);
            	    rule__Sequencemodel__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:574:1: rule__Sequencemodel__Group__1 : rule__Sequencemodel__Group__1__Impl ;
    public final void rule__Sequencemodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:578:1: ( rule__Sequencemodel__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:579:2: rule__Sequencemodel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequencemodel__Group__1__Impl_in_rule__Sequencemodel__Group__11183);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:585:1: rule__Sequencemodel__Group__1__Impl : ( ( rule__Sequencemodel__SequenceAssignment_1 )* ) ;
    public final void rule__Sequencemodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:589:1: ( ( ( rule__Sequencemodel__SequenceAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:590:1: ( ( rule__Sequencemodel__SequenceAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:590:1: ( ( rule__Sequencemodel__SequenceAssignment_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:591:1: ( rule__Sequencemodel__SequenceAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getSequenceAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:592:1: ( rule__Sequencemodel__SequenceAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:592:2: rule__Sequencemodel__SequenceAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Sequencemodel__SequenceAssignment_1_in_rule__Sequencemodel__Group__1__Impl1210);
            	    rule__Sequencemodel__SequenceAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:606:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:610:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:611:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01245);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01248);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:618:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:622:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:623:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:623:1: ( 'import' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:624:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__Import__Group__0__Impl1276); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:637:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:641:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:642:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11307);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:648:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:652:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:653:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:653:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:654:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:655:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:655:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1334);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:669:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:673:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:674:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01368);
            rule__Sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01371);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:681:1: rule__Sequence__Group__0__Impl : ( 'sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:685:1: ( ( 'sequence' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:686:1: ( 'sequence' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:686:1: ( 'sequence' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:687:1: 'sequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            }
            match(input,12,FOLLOW_12_in_rule__Sequence__Group__0__Impl1399); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:700:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:704:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:705:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11430);
            rule__Sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11433);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:712:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__NameAssignment_1 ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:716:1: ( ( ( rule__Sequence__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:717:1: ( ( rule__Sequence__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:717:1: ( ( rule__Sequence__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:718:1: ( rule__Sequence__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:719:1: ( rule__Sequence__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:719:2: rule__Sequence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1460);
            rule__Sequence__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:729:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:733:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:734:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21490);
            rule__Sequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21493);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:741:1: rule__Sequence__Group__2__Impl : ( '{' ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:745:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:746:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:746:1: ( '{' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:747:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,13,FOLLOW_13_in_rule__Sequence__Group__2__Impl1521); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:760:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:764:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:765:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__31552);
            rule__Sequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__31555);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:772:1: rule__Sequence__Group__3__Impl : ( ( ( rule__Sequence__LifelineAssignment_3 ) ) ( ( rule__Sequence__LifelineAssignment_3 )* ) ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:776:1: ( ( ( ( rule__Sequence__LifelineAssignment_3 ) ) ( ( rule__Sequence__LifelineAssignment_3 )* ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:777:1: ( ( ( rule__Sequence__LifelineAssignment_3 ) ) ( ( rule__Sequence__LifelineAssignment_3 )* ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:777:1: ( ( ( rule__Sequence__LifelineAssignment_3 ) ) ( ( rule__Sequence__LifelineAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:778:1: ( ( rule__Sequence__LifelineAssignment_3 ) ) ( ( rule__Sequence__LifelineAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:778:1: ( ( rule__Sequence__LifelineAssignment_3 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:779:1: ( rule__Sequence__LifelineAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getLifelineAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:780:1: ( rule__Sequence__LifelineAssignment_3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:780:2: rule__Sequence__LifelineAssignment_3
            {
            pushFollow(FOLLOW_rule__Sequence__LifelineAssignment_3_in_rule__Sequence__Group__3__Impl1584);
            rule__Sequence__LifelineAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getLifelineAssignment_3()); 
            }

            }

            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:783:1: ( ( rule__Sequence__LifelineAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:784:1: ( rule__Sequence__LifelineAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getLifelineAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:785:1: ( rule__Sequence__LifelineAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==15) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:785:2: rule__Sequence__LifelineAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__LifelineAssignment_3_in_rule__Sequence__Group__3__Impl1596);
            	    rule__Sequence__LifelineAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getLifelineAssignment_3()); 
            }

            }


            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:796:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl rule__Sequence__Group__5 ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:800:1: ( rule__Sequence__Group__4__Impl rule__Sequence__Group__5 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:801:2: rule__Sequence__Group__4__Impl rule__Sequence__Group__5
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__41629);
            rule__Sequence__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__41632);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:808:1: rule__Sequence__Group__4__Impl : ( ( rule__Sequence__TransitionAssignment_4 )* ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:812:1: ( ( ( rule__Sequence__TransitionAssignment_4 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:813:1: ( ( rule__Sequence__TransitionAssignment_4 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:813:1: ( ( rule__Sequence__TransitionAssignment_4 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:814:1: ( rule__Sequence__TransitionAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getTransitionAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:815:1: ( rule__Sequence__TransitionAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:815:2: rule__Sequence__TransitionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__TransitionAssignment_4_in_rule__Sequence__Group__4__Impl1659);
            	    rule__Sequence__TransitionAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getTransitionAssignment_4()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:825:1: rule__Sequence__Group__5 : rule__Sequence__Group__5__Impl ;
    public final void rule__Sequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:829:1: ( rule__Sequence__Group__5__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:830:2: rule__Sequence__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__51690);
            rule__Sequence__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:836:1: rule__Sequence__Group__5__Impl : ( '}' ) ;
    public final void rule__Sequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:840:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:841:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:841:1: ( '}' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:842:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,14,FOLLOW_14_in_rule__Sequence__Group__5__Impl1718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Lifeline__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:867:1: rule__Lifeline__Group__0 : rule__Lifeline__Group__0__Impl rule__Lifeline__Group__1 ;
    public final void rule__Lifeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:871:1: ( rule__Lifeline__Group__0__Impl rule__Lifeline__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:872:2: rule__Lifeline__Group__0__Impl rule__Lifeline__Group__1
            {
            pushFollow(FOLLOW_rule__Lifeline__Group__0__Impl_in_rule__Lifeline__Group__01761);
            rule__Lifeline__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Lifeline__Group__1_in_rule__Lifeline__Group__01764);
            rule__Lifeline__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__0"


    // $ANTLR start "rule__Lifeline__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:879:1: rule__Lifeline__Group__0__Impl : ( ( rule__Lifeline__ActorAssignment_0 )? ) ;
    public final void rule__Lifeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:883:1: ( ( ( rule__Lifeline__ActorAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:884:1: ( ( rule__Lifeline__ActorAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:884:1: ( ( rule__Lifeline__ActorAssignment_0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:885:1: ( rule__Lifeline__ActorAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getActorAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:886:1: ( rule__Lifeline__ActorAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:886:2: rule__Lifeline__ActorAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Lifeline__ActorAssignment_0_in_rule__Lifeline__Group__0__Impl1791);
                    rule__Lifeline__ActorAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getActorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__0__Impl"


    // $ANTLR start "rule__Lifeline__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:896:1: rule__Lifeline__Group__1 : rule__Lifeline__Group__1__Impl rule__Lifeline__Group__2 ;
    public final void rule__Lifeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:900:1: ( rule__Lifeline__Group__1__Impl rule__Lifeline__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:901:2: rule__Lifeline__Group__1__Impl rule__Lifeline__Group__2
            {
            pushFollow(FOLLOW_rule__Lifeline__Group__1__Impl_in_rule__Lifeline__Group__11822);
            rule__Lifeline__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Lifeline__Group__2_in_rule__Lifeline__Group__11825);
            rule__Lifeline__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__1"


    // $ANTLR start "rule__Lifeline__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:908:1: rule__Lifeline__Group__1__Impl : ( ( rule__Lifeline__NameAssignment_1 ) ) ;
    public final void rule__Lifeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:912:1: ( ( ( rule__Lifeline__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:913:1: ( ( rule__Lifeline__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:913:1: ( ( rule__Lifeline__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:914:1: ( rule__Lifeline__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:915:1: ( rule__Lifeline__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:915:2: rule__Lifeline__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Lifeline__NameAssignment_1_in_rule__Lifeline__Group__1__Impl1852);
            rule__Lifeline__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__1__Impl"


    // $ANTLR start "rule__Lifeline__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:925:1: rule__Lifeline__Group__2 : rule__Lifeline__Group__2__Impl rule__Lifeline__Group__3 ;
    public final void rule__Lifeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:929:1: ( rule__Lifeline__Group__2__Impl rule__Lifeline__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:930:2: rule__Lifeline__Group__2__Impl rule__Lifeline__Group__3
            {
            pushFollow(FOLLOW_rule__Lifeline__Group__2__Impl_in_rule__Lifeline__Group__21882);
            rule__Lifeline__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Lifeline__Group__3_in_rule__Lifeline__Group__21885);
            rule__Lifeline__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__2"


    // $ANTLR start "rule__Lifeline__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:937:1: rule__Lifeline__Group__2__Impl : ( ':' ) ;
    public final void rule__Lifeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:941:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:942:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:942:1: ( ':' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:943:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getColonKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Lifeline__Group__2__Impl1913); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__2__Impl"


    // $ANTLR start "rule__Lifeline__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:956:1: rule__Lifeline__Group__3 : rule__Lifeline__Group__3__Impl ;
    public final void rule__Lifeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:960:1: ( rule__Lifeline__Group__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:961:2: rule__Lifeline__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Lifeline__Group__3__Impl_in_rule__Lifeline__Group__31944);
            rule__Lifeline__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__3"


    // $ANTLR start "rule__Lifeline__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:967:1: rule__Lifeline__Group__3__Impl : ( ( rule__Lifeline__EntityAssignment_3 ) ) ;
    public final void rule__Lifeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:971:1: ( ( ( rule__Lifeline__EntityAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:972:1: ( ( rule__Lifeline__EntityAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:972:1: ( ( rule__Lifeline__EntityAssignment_3 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:973:1: ( rule__Lifeline__EntityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getEntityAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:974:1: ( rule__Lifeline__EntityAssignment_3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:974:2: rule__Lifeline__EntityAssignment_3
            {
            pushFollow(FOLLOW_rule__Lifeline__EntityAssignment_3_in_rule__Lifeline__Group__3__Impl1971);
            rule__Lifeline__EntityAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getEntityAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:992:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:996:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:997:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02009);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02012);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1004:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__CallerAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1008:1: ( ( ( rule__Transition__CallerAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1009:1: ( ( rule__Transition__CallerAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1009:1: ( ( rule__Transition__CallerAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1010:1: ( rule__Transition__CallerAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getCallerAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1011:1: ( rule__Transition__CallerAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1011:2: rule__Transition__CallerAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__CallerAssignment_0_in_rule__Transition__Group__0__Impl2039);
            rule__Transition__CallerAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getCallerAssignment_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1021:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1025:1: ( rule__Transition__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1026:2: rule__Transition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12069);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1032:1: rule__Transition__Group__1__Impl : ( ( ( rule__Transition__StatementAssignment_1 ) ) ( ( rule__Transition__StatementAssignment_1 )* ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1036:1: ( ( ( ( rule__Transition__StatementAssignment_1 ) ) ( ( rule__Transition__StatementAssignment_1 )* ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1037:1: ( ( ( rule__Transition__StatementAssignment_1 ) ) ( ( rule__Transition__StatementAssignment_1 )* ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1037:1: ( ( ( rule__Transition__StatementAssignment_1 ) ) ( ( rule__Transition__StatementAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1038:1: ( ( rule__Transition__StatementAssignment_1 ) ) ( ( rule__Transition__StatementAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1038:1: ( ( rule__Transition__StatementAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1039:1: ( rule__Transition__StatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStatementAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1040:1: ( rule__Transition__StatementAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1040:2: rule__Transition__StatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__StatementAssignment_1_in_rule__Transition__Group__1__Impl2098);
            rule__Transition__StatementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getStatementAssignment_1()); 
            }

            }

            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1043:1: ( ( rule__Transition__StatementAssignment_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1044:1: ( rule__Transition__StatementAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStatementAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1045:1: ( rule__Transition__StatementAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16||(LA8_0>=18 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1045:2: rule__Transition__StatementAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Transition__StatementAssignment_1_in_rule__Transition__Group__1__Impl2110);
            	    rule__Transition__StatementAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getStatementAssignment_1()); 
            }

            }


            }


            }

        }
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


    // $ANTLR start "rule__Call__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1060:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1064:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1065:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__02147);
            rule__Call__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__02150);
            rule__Call__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1072:1: rule__Call__Group__0__Impl : ( 'call' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1076:1: ( ( 'call' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1077:1: ( 'call' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1077:1: ( 'call' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1078:1: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCallKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Call__Group__0__Impl2178); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCallKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1091:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1095:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1096:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__12209);
            rule__Call__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__12212);
            rule__Call__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1103:1: rule__Call__Group__1__Impl : ( ( rule__Call__CalledAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1107:1: ( ( ( rule__Call__CalledAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1108:1: ( ( rule__Call__CalledAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1108:1: ( ( rule__Call__CalledAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1109:1: ( rule__Call__CalledAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCalledAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1110:1: ( rule__Call__CalledAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1110:2: rule__Call__CalledAssignment_1
            {
            pushFollow(FOLLOW_rule__Call__CalledAssignment_1_in_rule__Call__Group__1__Impl2239);
            rule__Call__CalledAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCalledAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Call__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1120:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1124:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1125:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__22269);
            rule__Call__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__22272);
            rule__Call__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2"


    // $ANTLR start "rule__Call__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1132:1: rule__Call__Group__2__Impl : ( ( rule__Call__Group_2__0 ) ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1136:1: ( ( ( rule__Call__Group_2__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1137:1: ( ( rule__Call__Group_2__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1137:1: ( ( rule__Call__Group_2__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1138:1: ( rule__Call__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1139:1: ( rule__Call__Group_2__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1139:2: rule__Call__Group_2__0
            {
            pushFollow(FOLLOW_rule__Call__Group_2__0_in_rule__Call__Group__2__Impl2299);
            rule__Call__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2__Impl"


    // $ANTLR start "rule__Call__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1149:1: rule__Call__Group__3 : rule__Call__Group__3__Impl ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1153:1: ( rule__Call__Group__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1154:2: rule__Call__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__32329);
            rule__Call__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__3"


    // $ANTLR start "rule__Call__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1160:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )? ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1164:1: ( ( ( rule__Call__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1165:1: ( ( rule__Call__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1165:1: ( ( rule__Call__Group_3__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1166:1: ( rule__Call__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1167:1: ( rule__Call__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1167:2: rule__Call__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl2356);
                    rule__Call__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__3__Impl"


    // $ANTLR start "rule__Call__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1185:1: rule__Call__Group_2__0 : rule__Call__Group_2__0__Impl rule__Call__Group_2__1 ;
    public final void rule__Call__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1189:1: ( rule__Call__Group_2__0__Impl rule__Call__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1190:2: rule__Call__Group_2__0__Impl rule__Call__Group_2__1
            {
            pushFollow(FOLLOW_rule__Call__Group_2__0__Impl_in_rule__Call__Group_2__02395);
            rule__Call__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group_2__1_in_rule__Call__Group_2__02398);
            rule__Call__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_2__0"


    // $ANTLR start "rule__Call__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1197:1: rule__Call__Group_2__0__Impl : ( ( '.' ) ) ;
    public final void rule__Call__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1201:1: ( ( ( '.' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1202:1: ( ( '.' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1202:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1203:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getFullStopKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1204:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1205:2: '.'
            {
            match(input,17,FOLLOW_17_in_rule__Call__Group_2__0__Impl2427); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getFullStopKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_2__0__Impl"


    // $ANTLR start "rule__Call__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1216:1: rule__Call__Group_2__1 : rule__Call__Group_2__1__Impl ;
    public final void rule__Call__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1220:1: ( rule__Call__Group_2__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1221:2: rule__Call__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_2__1__Impl_in_rule__Call__Group_2__12459);
            rule__Call__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_2__1"


    // $ANTLR start "rule__Call__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1227:1: rule__Call__Group_2__1__Impl : ( ( rule__Call__MessageAssignment_2_1 ) ) ;
    public final void rule__Call__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1231:1: ( ( ( rule__Call__MessageAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1232:1: ( ( rule__Call__MessageAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1232:1: ( ( rule__Call__MessageAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1233:1: ( rule__Call__MessageAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getMessageAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1234:1: ( rule__Call__MessageAssignment_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1234:2: rule__Call__MessageAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Call__MessageAssignment_2_1_in_rule__Call__Group_2__1__Impl2486);
            rule__Call__MessageAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getMessageAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_2__1__Impl"


    // $ANTLR start "rule__Call__Group_3__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1248:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1252:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1253:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__02520);
            rule__Call__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__02523);
            rule__Call__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__0"


    // $ANTLR start "rule__Call__Group_3__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1260:1: rule__Call__Group_3__0__Impl : ( ( ':' ) ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1264:1: ( ( ( ':' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1265:1: ( ( ':' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1265:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1266:1: ( ':' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getColonKeyword_3_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1267:1: ( ':' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1268:2: ':'
            {
            match(input,15,FOLLOW_15_in_rule__Call__Group_3__0__Impl2552); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getColonKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__0__Impl"


    // $ANTLR start "rule__Call__Group_3__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1279:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1283:1: ( rule__Call__Group_3__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1284:2: rule__Call__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__12584);
            rule__Call__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__1"


    // $ANTLR start "rule__Call__Group_3__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1290:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__ReplyAssignment_3_1 ) ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1294:1: ( ( ( rule__Call__ReplyAssignment_3_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1295:1: ( ( rule__Call__ReplyAssignment_3_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1295:1: ( ( rule__Call__ReplyAssignment_3_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1296:1: ( rule__Call__ReplyAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getReplyAssignment_3_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1297:1: ( rule__Call__ReplyAssignment_3_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1297:2: rule__Call__ReplyAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Call__ReplyAssignment_3_1_in_rule__Call__Group_3__1__Impl2611);
            rule__Call__ReplyAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getReplyAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__1__Impl"


    // $ANTLR start "rule__Reply__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1311:1: rule__Reply__Group__0 : rule__Reply__Group__0__Impl rule__Reply__Group__1 ;
    public final void rule__Reply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1315:1: ( rule__Reply__Group__0__Impl rule__Reply__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1316:2: rule__Reply__Group__0__Impl rule__Reply__Group__1
            {
            pushFollow(FOLLOW_rule__Reply__Group__0__Impl_in_rule__Reply__Group__02645);
            rule__Reply__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reply__Group__1_in_rule__Reply__Group__02648);
            rule__Reply__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group__0"


    // $ANTLR start "rule__Reply__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1323:1: rule__Reply__Group__0__Impl : ( 'reply' ) ;
    public final void rule__Reply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1327:1: ( ( 'reply' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1328:1: ( 'reply' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1328:1: ( 'reply' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1329:1: 'reply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getReplyKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Reply__Group__0__Impl2676); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getReplyKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group__0__Impl"


    // $ANTLR start "rule__Reply__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1342:1: rule__Reply__Group__1 : rule__Reply__Group__1__Impl rule__Reply__Group__2 ;
    public final void rule__Reply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1346:1: ( rule__Reply__Group__1__Impl rule__Reply__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1347:2: rule__Reply__Group__1__Impl rule__Reply__Group__2
            {
            pushFollow(FOLLOW_rule__Reply__Group__1__Impl_in_rule__Reply__Group__12707);
            rule__Reply__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reply__Group__2_in_rule__Reply__Group__12710);
            rule__Reply__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group__1"


    // $ANTLR start "rule__Reply__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1354:1: rule__Reply__Group__1__Impl : ( ( rule__Reply__CalledAssignment_1 ) ) ;
    public final void rule__Reply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1358:1: ( ( ( rule__Reply__CalledAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1359:1: ( ( rule__Reply__CalledAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1359:1: ( ( rule__Reply__CalledAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1360:1: ( rule__Reply__CalledAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getCalledAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1361:1: ( rule__Reply__CalledAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1361:2: rule__Reply__CalledAssignment_1
            {
            pushFollow(FOLLOW_rule__Reply__CalledAssignment_1_in_rule__Reply__Group__1__Impl2737);
            rule__Reply__CalledAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getCalledAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group__1__Impl"


    // $ANTLR start "rule__Reply__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1371:1: rule__Reply__Group__2 : rule__Reply__Group__2__Impl ;
    public final void rule__Reply__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1375:1: ( rule__Reply__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1376:2: rule__Reply__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Reply__Group__2__Impl_in_rule__Reply__Group__22767);
            rule__Reply__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group__2"


    // $ANTLR start "rule__Reply__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1382:1: rule__Reply__Group__2__Impl : ( ( rule__Reply__Group_2__0 )? ) ;
    public final void rule__Reply__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1386:1: ( ( ( rule__Reply__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1387:1: ( ( rule__Reply__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1387:1: ( ( rule__Reply__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1388:1: ( rule__Reply__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1389:1: ( rule__Reply__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1389:2: rule__Reply__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Reply__Group_2__0_in_rule__Reply__Group__2__Impl2794);
                    rule__Reply__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group__2__Impl"


    // $ANTLR start "rule__Reply__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1405:1: rule__Reply__Group_2__0 : rule__Reply__Group_2__0__Impl rule__Reply__Group_2__1 ;
    public final void rule__Reply__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1409:1: ( rule__Reply__Group_2__0__Impl rule__Reply__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1410:2: rule__Reply__Group_2__0__Impl rule__Reply__Group_2__1
            {
            pushFollow(FOLLOW_rule__Reply__Group_2__0__Impl_in_rule__Reply__Group_2__02831);
            rule__Reply__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reply__Group_2__1_in_rule__Reply__Group_2__02834);
            rule__Reply__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group_2__0"


    // $ANTLR start "rule__Reply__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1417:1: rule__Reply__Group_2__0__Impl : ( ( ':' ) ) ;
    public final void rule__Reply__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1421:1: ( ( ( ':' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1422:1: ( ( ':' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1422:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1423:1: ( ':' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getColonKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1424:1: ( ':' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1425:2: ':'
            {
            match(input,15,FOLLOW_15_in_rule__Reply__Group_2__0__Impl2863); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group_2__0__Impl"


    // $ANTLR start "rule__Reply__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1436:1: rule__Reply__Group_2__1 : rule__Reply__Group_2__1__Impl ;
    public final void rule__Reply__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1440:1: ( rule__Reply__Group_2__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1441:2: rule__Reply__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Reply__Group_2__1__Impl_in_rule__Reply__Group_2__12895);
            rule__Reply__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group_2__1"


    // $ANTLR start "rule__Reply__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1447:1: rule__Reply__Group_2__1__Impl : ( ( rule__Reply__ReplyAssignment_2_1 ) ) ;
    public final void rule__Reply__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1451:1: ( ( ( rule__Reply__ReplyAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1452:1: ( ( rule__Reply__ReplyAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1452:1: ( ( rule__Reply__ReplyAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1453:1: ( rule__Reply__ReplyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getReplyAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1454:1: ( rule__Reply__ReplyAssignment_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1454:2: rule__Reply__ReplyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Reply__ReplyAssignment_2_1_in_rule__Reply__Group_2__1__Impl2922);
            rule__Reply__ReplyAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getReplyAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__Group_2__1__Impl"


    // $ANTLR start "rule__Self__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1468:1: rule__Self__Group__0 : rule__Self__Group__0__Impl rule__Self__Group__1 ;
    public final void rule__Self__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1472:1: ( rule__Self__Group__0__Impl rule__Self__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1473:2: rule__Self__Group__0__Impl rule__Self__Group__1
            {
            pushFollow(FOLLOW_rule__Self__Group__0__Impl_in_rule__Self__Group__02956);
            rule__Self__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Self__Group__1_in_rule__Self__Group__02959);
            rule__Self__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__0"


    // $ANTLR start "rule__Self__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1480:1: rule__Self__Group__0__Impl : ( 'self' ) ;
    public final void rule__Self__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1484:1: ( ( 'self' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1485:1: ( 'self' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1485:1: ( 'self' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1486:1: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getSelfKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Self__Group__0__Impl2987); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getSelfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__0__Impl"


    // $ANTLR start "rule__Self__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1499:1: rule__Self__Group__1 : rule__Self__Group__1__Impl rule__Self__Group__2 ;
    public final void rule__Self__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1503:1: ( rule__Self__Group__1__Impl rule__Self__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1504:2: rule__Self__Group__1__Impl rule__Self__Group__2
            {
            pushFollow(FOLLOW_rule__Self__Group__1__Impl_in_rule__Self__Group__13018);
            rule__Self__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Self__Group__2_in_rule__Self__Group__13021);
            rule__Self__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__1"


    // $ANTLR start "rule__Self__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1511:1: rule__Self__Group__1__Impl : ( ( rule__Self__MessageAssignment_1 ) ) ;
    public final void rule__Self__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1515:1: ( ( ( rule__Self__MessageAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1516:1: ( ( rule__Self__MessageAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1516:1: ( ( rule__Self__MessageAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1517:1: ( rule__Self__MessageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getMessageAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1518:1: ( rule__Self__MessageAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1518:2: rule__Self__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Self__MessageAssignment_1_in_rule__Self__Group__1__Impl3048);
            rule__Self__MessageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getMessageAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__1__Impl"


    // $ANTLR start "rule__Self__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1528:1: rule__Self__Group__2 : rule__Self__Group__2__Impl ;
    public final void rule__Self__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1532:1: ( rule__Self__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1533:2: rule__Self__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Self__Group__2__Impl_in_rule__Self__Group__23078);
            rule__Self__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__2"


    // $ANTLR start "rule__Self__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1539:1: rule__Self__Group__2__Impl : ( ( rule__Self__Group_2__0 )? ) ;
    public final void rule__Self__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1543:1: ( ( ( rule__Self__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1544:1: ( ( rule__Self__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1544:1: ( ( rule__Self__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1545:1: ( rule__Self__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1546:1: ( rule__Self__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1546:2: rule__Self__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Self__Group_2__0_in_rule__Self__Group__2__Impl3105);
                    rule__Self__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group__2__Impl"


    // $ANTLR start "rule__Self__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1562:1: rule__Self__Group_2__0 : rule__Self__Group_2__0__Impl rule__Self__Group_2__1 ;
    public final void rule__Self__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1566:1: ( rule__Self__Group_2__0__Impl rule__Self__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1567:2: rule__Self__Group_2__0__Impl rule__Self__Group_2__1
            {
            pushFollow(FOLLOW_rule__Self__Group_2__0__Impl_in_rule__Self__Group_2__03142);
            rule__Self__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Self__Group_2__1_in_rule__Self__Group_2__03145);
            rule__Self__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group_2__0"


    // $ANTLR start "rule__Self__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1574:1: rule__Self__Group_2__0__Impl : ( ( ':' ) ) ;
    public final void rule__Self__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1578:1: ( ( ( ':' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1579:1: ( ( ':' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1579:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1580:1: ( ':' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getColonKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1581:1: ( ':' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1582:2: ':'
            {
            match(input,15,FOLLOW_15_in_rule__Self__Group_2__0__Impl3174); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group_2__0__Impl"


    // $ANTLR start "rule__Self__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1593:1: rule__Self__Group_2__1 : rule__Self__Group_2__1__Impl ;
    public final void rule__Self__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1597:1: ( rule__Self__Group_2__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1598:2: rule__Self__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Self__Group_2__1__Impl_in_rule__Self__Group_2__13206);
            rule__Self__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group_2__1"


    // $ANTLR start "rule__Self__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1604:1: rule__Self__Group_2__1__Impl : ( ( rule__Self__ReplyAssignment_2_1 ) ) ;
    public final void rule__Self__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1608:1: ( ( ( rule__Self__ReplyAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1609:1: ( ( rule__Self__ReplyAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1609:1: ( ( rule__Self__ReplyAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1610:1: ( rule__Self__ReplyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getReplyAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1611:1: ( rule__Self__ReplyAssignment_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1611:2: rule__Self__ReplyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Self__ReplyAssignment_2_1_in_rule__Self__Group_2__1__Impl3233);
            rule__Self__ReplyAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getReplyAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__Group_2__1__Impl"


    // $ANTLR start "rule__Create__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1625:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1629:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1630:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__03267);
            rule__Create__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Create__Group__1_in_rule__Create__Group__03270);
            rule__Create__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__0"


    // $ANTLR start "rule__Create__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1637:1: rule__Create__Group__0__Impl : ( 'create' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1641:1: ( ( 'create' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1642:1: ( 'create' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1642:1: ( 'create' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1643:1: 'create'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCreateAccess().getCreateKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Create__Group__0__Impl3298); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCreateAccess().getCreateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__0__Impl"


    // $ANTLR start "rule__Create__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1656:1: rule__Create__Group__1 : rule__Create__Group__1__Impl ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1660:1: ( rule__Create__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1661:2: rule__Create__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__13329);
            rule__Create__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__1"


    // $ANTLR start "rule__Create__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1667:1: rule__Create__Group__1__Impl : ( ( rule__Create__CalledAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1671:1: ( ( ( rule__Create__CalledAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1672:1: ( ( rule__Create__CalledAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1672:1: ( ( rule__Create__CalledAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1673:1: ( rule__Create__CalledAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCreateAccess().getCalledAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1674:1: ( rule__Create__CalledAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1674:2: rule__Create__CalledAssignment_1
            {
            pushFollow(FOLLOW_rule__Create__CalledAssignment_1_in_rule__Create__Group__1__Impl3356);
            rule__Create__CalledAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCreateAccess().getCalledAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__1__Impl"


    // $ANTLR start "rule__Destroy__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1688:1: rule__Destroy__Group__0 : rule__Destroy__Group__0__Impl rule__Destroy__Group__1 ;
    public final void rule__Destroy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1692:1: ( rule__Destroy__Group__0__Impl rule__Destroy__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1693:2: rule__Destroy__Group__0__Impl rule__Destroy__Group__1
            {
            pushFollow(FOLLOW_rule__Destroy__Group__0__Impl_in_rule__Destroy__Group__03390);
            rule__Destroy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Destroy__Group__1_in_rule__Destroy__Group__03393);
            rule__Destroy__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destroy__Group__0"


    // $ANTLR start "rule__Destroy__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1700:1: rule__Destroy__Group__0__Impl : ( 'destroy' ) ;
    public final void rule__Destroy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1704:1: ( ( 'destroy' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1705:1: ( 'destroy' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1705:1: ( 'destroy' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1706:1: 'destroy'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestroyAccess().getDestroyKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Destroy__Group__0__Impl3421); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestroyAccess().getDestroyKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destroy__Group__0__Impl"


    // $ANTLR start "rule__Destroy__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1719:1: rule__Destroy__Group__1 : rule__Destroy__Group__1__Impl ;
    public final void rule__Destroy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1723:1: ( rule__Destroy__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1724:2: rule__Destroy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Destroy__Group__1__Impl_in_rule__Destroy__Group__13452);
            rule__Destroy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destroy__Group__1"


    // $ANTLR start "rule__Destroy__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1730:1: rule__Destroy__Group__1__Impl : ( ( rule__Destroy__CalledAssignment_1 ) ) ;
    public final void rule__Destroy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1734:1: ( ( ( rule__Destroy__CalledAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1735:1: ( ( rule__Destroy__CalledAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1735:1: ( ( rule__Destroy__CalledAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1736:1: ( rule__Destroy__CalledAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestroyAccess().getCalledAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1737:1: ( rule__Destroy__CalledAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1737:2: rule__Destroy__CalledAssignment_1
            {
            pushFollow(FOLLOW_rule__Destroy__CalledAssignment_1_in_rule__Destroy__Group__1__Impl3479);
            rule__Destroy__CalledAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestroyAccess().getCalledAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destroy__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1751:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1755:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1756:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03513);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03516);
            rule__Message__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1763:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1767:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1768:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1768:1: ( ( rule__Message__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1769:1: ( rule__Message__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1770:1: ( rule__Message__NameAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1770:2: rule__Message__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3543);
            rule__Message__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1780:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1784:1: ( rule__Message__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1785:2: rule__Message__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13573);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1791:1: rule__Message__Group__1__Impl : ( ( rule__Message__Group_1__0 )? ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1795:1: ( ( ( rule__Message__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1796:1: ( ( rule__Message__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1796:1: ( ( rule__Message__Group_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1797:1: ( rule__Message__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1798:1: ( rule__Message__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1798:2: rule__Message__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Message__Group_1__0_in_rule__Message__Group__1__Impl3600);
                    rule__Message__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1812:1: rule__Message__Group_1__0 : rule__Message__Group_1__0__Impl rule__Message__Group_1__1 ;
    public final void rule__Message__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1816:1: ( rule__Message__Group_1__0__Impl rule__Message__Group_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1817:2: rule__Message__Group_1__0__Impl rule__Message__Group_1__1
            {
            pushFollow(FOLLOW_rule__Message__Group_1__0__Impl_in_rule__Message__Group_1__03635);
            rule__Message__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group_1__1_in_rule__Message__Group_1__03638);
            rule__Message__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__0"


    // $ANTLR start "rule__Message__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1824:1: rule__Message__Group_1__0__Impl : ( ( '(' ) ) ;
    public final void rule__Message__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1828:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1829:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1829:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1830:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1831:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1832:2: '('
            {
            match(input,22,FOLLOW_22_in_rule__Message__Group_1__0__Impl3667); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__0__Impl"


    // $ANTLR start "rule__Message__Group_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1843:1: rule__Message__Group_1__1 : rule__Message__Group_1__1__Impl rule__Message__Group_1__2 ;
    public final void rule__Message__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1847:1: ( rule__Message__Group_1__1__Impl rule__Message__Group_1__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1848:2: rule__Message__Group_1__1__Impl rule__Message__Group_1__2
            {
            pushFollow(FOLLOW_rule__Message__Group_1__1__Impl_in_rule__Message__Group_1__13699);
            rule__Message__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group_1__2_in_rule__Message__Group_1__13702);
            rule__Message__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__1"


    // $ANTLR start "rule__Message__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1855:1: rule__Message__Group_1__1__Impl : ( ( rule__Message__Group_1_1__0 )? ) ;
    public final void rule__Message__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1859:1: ( ( ( rule__Message__Group_1_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1860:1: ( ( rule__Message__Group_1_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1860:1: ( ( rule__Message__Group_1_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1861:1: ( rule__Message__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1862:1: ( rule__Message__Group_1_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1862:2: rule__Message__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Message__Group_1_1__0_in_rule__Message__Group_1__1__Impl3729);
                    rule__Message__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__1__Impl"


    // $ANTLR start "rule__Message__Group_1__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1872:1: rule__Message__Group_1__2 : rule__Message__Group_1__2__Impl ;
    public final void rule__Message__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1876:1: ( rule__Message__Group_1__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1877:2: rule__Message__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group_1__2__Impl_in_rule__Message__Group_1__23760);
            rule__Message__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__2"


    // $ANTLR start "rule__Message__Group_1__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1883:1: rule__Message__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Message__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1887:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1888:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1888:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1889:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Message__Group_1__2__Impl3788); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__2__Impl"


    // $ANTLR start "rule__Message__Group_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1908:1: rule__Message__Group_1_1__0 : rule__Message__Group_1_1__0__Impl rule__Message__Group_1_1__1 ;
    public final void rule__Message__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1912:1: ( rule__Message__Group_1_1__0__Impl rule__Message__Group_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1913:2: rule__Message__Group_1_1__0__Impl rule__Message__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Message__Group_1_1__0__Impl_in_rule__Message__Group_1_1__03825);
            rule__Message__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group_1_1__1_in_rule__Message__Group_1_1__03828);
            rule__Message__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1_1__0"


    // $ANTLR start "rule__Message__Group_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1920:1: rule__Message__Group_1_1__0__Impl : ( ( rule__Message__ParamAssignment_1_1_0 ) ) ;
    public final void rule__Message__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1924:1: ( ( ( rule__Message__ParamAssignment_1_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1925:1: ( ( rule__Message__ParamAssignment_1_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1925:1: ( ( rule__Message__ParamAssignment_1_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1926:1: ( rule__Message__ParamAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getParamAssignment_1_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1927:1: ( rule__Message__ParamAssignment_1_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1927:2: rule__Message__ParamAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Message__ParamAssignment_1_1_0_in_rule__Message__Group_1_1__0__Impl3855);
            rule__Message__ParamAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getParamAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1_1__0__Impl"


    // $ANTLR start "rule__Message__Group_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1937:1: rule__Message__Group_1_1__1 : rule__Message__Group_1_1__1__Impl ;
    public final void rule__Message__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1941:1: ( rule__Message__Group_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1942:2: rule__Message__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group_1_1__1__Impl_in_rule__Message__Group_1_1__13885);
            rule__Message__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1_1__1"


    // $ANTLR start "rule__Message__Group_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1948:1: rule__Message__Group_1_1__1__Impl : ( ( rule__Message__Group_1_1_1__0 )* ) ;
    public final void rule__Message__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1952:1: ( ( ( rule__Message__Group_1_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1953:1: ( ( rule__Message__Group_1_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1953:1: ( ( rule__Message__Group_1_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1954:1: ( rule__Message__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1955:1: ( rule__Message__Group_1_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1955:2: rule__Message__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Message__Group_1_1_1__0_in_rule__Message__Group_1_1__1__Impl3912);
            	    rule__Message__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1_1__1__Impl"


    // $ANTLR start "rule__Message__Group_1_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1969:1: rule__Message__Group_1_1_1__0 : rule__Message__Group_1_1_1__0__Impl rule__Message__Group_1_1_1__1 ;
    public final void rule__Message__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1973:1: ( rule__Message__Group_1_1_1__0__Impl rule__Message__Group_1_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1974:2: rule__Message__Group_1_1_1__0__Impl rule__Message__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Message__Group_1_1_1__0__Impl_in_rule__Message__Group_1_1_1__03947);
            rule__Message__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group_1_1_1__1_in_rule__Message__Group_1_1_1__03950);
            rule__Message__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1_1_1__0"


    // $ANTLR start "rule__Message__Group_1_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1981:1: rule__Message__Group_1_1_1__0__Impl : ( ( ', ' ) ) ;
    public final void rule__Message__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1985:1: ( ( ( ', ' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1986:1: ( ( ', ' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1986:1: ( ( ', ' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1987:1: ( ', ' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getCommaSpaceKeyword_1_1_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1988:1: ( ', ' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1989:2: ', '
            {
            match(input,24,FOLLOW_24_in_rule__Message__Group_1_1_1__0__Impl3979); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getCommaSpaceKeyword_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Message__Group_1_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2000:1: rule__Message__Group_1_1_1__1 : rule__Message__Group_1_1_1__1__Impl ;
    public final void rule__Message__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2004:1: ( rule__Message__Group_1_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2005:2: rule__Message__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group_1_1_1__1__Impl_in_rule__Message__Group_1_1_1__14011);
            rule__Message__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1_1_1__1"


    // $ANTLR start "rule__Message__Group_1_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2011:1: rule__Message__Group_1_1_1__1__Impl : ( ( rule__Message__ParamAssignment_1_1_1_1 ) ) ;
    public final void rule__Message__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2015:1: ( ( ( rule__Message__ParamAssignment_1_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2016:1: ( ( rule__Message__ParamAssignment_1_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2016:1: ( ( rule__Message__ParamAssignment_1_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2017:1: ( rule__Message__ParamAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getParamAssignment_1_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2018:1: ( rule__Message__ParamAssignment_1_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2018:2: rule__Message__ParamAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Message__ParamAssignment_1_1_1_1_in_rule__Message__Group_1_1_1__1__Impl4038);
            rule__Message__ParamAssignment_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getParamAssignment_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2032:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2036:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2037:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04072);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04075);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2044:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2048:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2049:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2049:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2050:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4102); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2061:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2065:1: ( rule__QualifiedName__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2066:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14131);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2072:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2076:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2077:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2077:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2078:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2079:1: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2079:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4158);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2093:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2097:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2098:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04193);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04196);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2105:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2109:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2110:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2110:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2111:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__QualifiedName__Group_1__0__Impl4224); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2124:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2128:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2129:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14255);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2135:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2139:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2140:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2140:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2141:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4282); if (state.failed) return ;
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


    // $ANTLR start "rule__Sequencemodel__ImportsAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2157:1: rule__Sequencemodel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Sequencemodel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2161:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2162:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2162:1: ( ruleImport )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2163:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Sequencemodel__ImportsAssignment_04320);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2172:1: rule__Sequencemodel__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Sequencemodel__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2176:1: ( ( ruleSequence ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2177:1: ( ruleSequence )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2177:1: ( ruleSequence )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2178:1: ruleSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getSequenceSequenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSequence_in_rule__Sequencemodel__SequenceAssignment_14351);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2187:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2191:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2192:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2192:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2193:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14382); if (state.failed) return ;
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


    // $ANTLR start "rule__Sequence__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2202:1: rule__Sequence__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Sequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2206:1: ( ( ruleIdentifier ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2207:1: ( ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2207:1: ( ruleIdentifier )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2208:1: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getNameIdentifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Sequence__NameAssignment_14413);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getNameIdentifierParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__NameAssignment_1"


    // $ANTLR start "rule__Sequence__LifelineAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2217:1: rule__Sequence__LifelineAssignment_3 : ( ruleLifeline ) ;
    public final void rule__Sequence__LifelineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2221:1: ( ( ruleLifeline ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2222:1: ( ruleLifeline )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2222:1: ( ruleLifeline )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2223:1: ruleLifeline
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getLifelineLifelineParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLifeline_in_rule__Sequence__LifelineAssignment_34444);
            ruleLifeline();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getLifelineLifelineParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__LifelineAssignment_3"


    // $ANTLR start "rule__Sequence__TransitionAssignment_4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2232:1: rule__Sequence__TransitionAssignment_4 : ( ruleTransition ) ;
    public final void rule__Sequence__TransitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2236:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2237:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2237:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2238:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getTransitionTransitionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__Sequence__TransitionAssignment_44475);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getTransitionTransitionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__TransitionAssignment_4"


    // $ANTLR start "rule__Lifeline__ActorAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2247:1: rule__Lifeline__ActorAssignment_0 : ( ( 'actor' ) ) ;
    public final void rule__Lifeline__ActorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2251:1: ( ( ( 'actor' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2252:1: ( ( 'actor' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2252:1: ( ( 'actor' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2253:1: ( 'actor' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getActorActorKeyword_0_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2254:1: ( 'actor' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2255:1: 'actor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getActorActorKeyword_0_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Lifeline__ActorAssignment_04511); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getActorActorKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getActorActorKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__ActorAssignment_0"


    // $ANTLR start "rule__Lifeline__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2270:1: rule__Lifeline__NameAssignment_1 : ( ruleLifelineName ) ;
    public final void rule__Lifeline__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2274:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2275:1: ( ruleLifelineName )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2275:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2276:1: ruleLifelineName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getNameLifelineNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLifelineName_in_rule__Lifeline__NameAssignment_14550);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getNameLifelineNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__NameAssignment_1"


    // $ANTLR start "rule__Lifeline__EntityAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2285:1: rule__Lifeline__EntityAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Lifeline__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2289:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2290:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2290:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2291:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getEntityEntityCrossReference_3_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2292:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2293:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifelineAccess().getEntityEntityQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Lifeline__EntityAssignment_34585);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getEntityEntityQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifelineAccess().getEntityEntityCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lifeline__EntityAssignment_3"


    // $ANTLR start "rule__Transition__CallerAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2304:1: rule__Transition__CallerAssignment_0 : ( ( ruleLifelineName ) ) ;
    public final void rule__Transition__CallerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2308:1: ( ( ( ruleLifelineName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2309:1: ( ( ruleLifelineName ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2309:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2310:1: ( ruleLifelineName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getCallerLifelineCrossReference_0_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2311:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2312:1: ruleLifelineName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getCallerLifelineLifelineNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleLifelineName_in_rule__Transition__CallerAssignment_04624);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getCallerLifelineLifelineNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getCallerLifelineCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__CallerAssignment_0"


    // $ANTLR start "rule__Transition__StatementAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2323:1: rule__Transition__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Transition__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2327:1: ( ( ruleStatement ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2328:1: ( ruleStatement )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2328:1: ( ruleStatement )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2329:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Transition__StatementAssignment_14659);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getStatementStatementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StatementAssignment_1"


    // $ANTLR start "rule__Call__CalledAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2338:1: rule__Call__CalledAssignment_1 : ( ( ruleLifelineName ) ) ;
    public final void rule__Call__CalledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2342:1: ( ( ( ruleLifelineName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2343:1: ( ( ruleLifelineName ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2343:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2344:1: ( ruleLifelineName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCalledLifelineCrossReference_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2345:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2346:1: ruleLifelineName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleLifelineName_in_rule__Call__CalledAssignment_14694);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCalledLifelineCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__CalledAssignment_1"


    // $ANTLR start "rule__Call__MessageAssignment_2_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2357:1: rule__Call__MessageAssignment_2_1 : ( ruleMessage ) ;
    public final void rule__Call__MessageAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2361:1: ( ( ruleMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2362:1: ( ruleMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2362:1: ( ruleMessage )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2363:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getMessageMessageParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__Call__MessageAssignment_2_14729);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getMessageMessageParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__MessageAssignment_2_1"


    // $ANTLR start "rule__Call__ReplyAssignment_3_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2372:1: rule__Call__ReplyAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Call__ReplyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2376:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2377:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2377:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2378:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getReplyIDTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Call__ReplyAssignment_3_14760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getReplyIDTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__ReplyAssignment_3_1"


    // $ANTLR start "rule__Reply__CalledAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2387:1: rule__Reply__CalledAssignment_1 : ( ( ruleLifelineName ) ) ;
    public final void rule__Reply__CalledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2391:1: ( ( ( ruleLifelineName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2392:1: ( ( ruleLifelineName ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2392:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2393:1: ( ruleLifelineName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getCalledLifelineCrossReference_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2394:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2395:1: ruleLifelineName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleLifelineName_in_rule__Reply__CalledAssignment_14795);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getCalledLifelineCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__CalledAssignment_1"


    // $ANTLR start "rule__Reply__ReplyAssignment_2_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2406:1: rule__Reply__ReplyAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Reply__ReplyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2410:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2411:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2411:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2412:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReplyAccess().getReplyIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reply__ReplyAssignment_2_14830); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReplyAccess().getReplyIDTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reply__ReplyAssignment_2_1"


    // $ANTLR start "rule__Self__MessageAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2421:1: rule__Self__MessageAssignment_1 : ( ruleMessage ) ;
    public final void rule__Self__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2425:1: ( ( ruleMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2426:1: ( ruleMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2426:1: ( ruleMessage )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2427:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getMessageMessageParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__Self__MessageAssignment_14861);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getMessageMessageParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__MessageAssignment_1"


    // $ANTLR start "rule__Self__ReplyAssignment_2_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2436:1: rule__Self__ReplyAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Self__ReplyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2440:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2441:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2441:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2442:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAccess().getReplyIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Self__ReplyAssignment_2_14892); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAccess().getReplyIDTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Self__ReplyAssignment_2_1"


    // $ANTLR start "rule__Create__CalledAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2451:1: rule__Create__CalledAssignment_1 : ( ( ruleLifelineName ) ) ;
    public final void rule__Create__CalledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2455:1: ( ( ( ruleLifelineName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2456:1: ( ( ruleLifelineName ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2456:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2457:1: ( ruleLifelineName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCreateAccess().getCalledLifelineCrossReference_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2458:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2459:1: ruleLifelineName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCreateAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleLifelineName_in_rule__Create__CalledAssignment_14927);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCreateAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCreateAccess().getCalledLifelineCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__CalledAssignment_1"


    // $ANTLR start "rule__Destroy__CalledAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2470:1: rule__Destroy__CalledAssignment_1 : ( ( ruleLifelineName ) ) ;
    public final void rule__Destroy__CalledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2474:1: ( ( ( ruleLifelineName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2475:1: ( ( ruleLifelineName ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2475:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2476:1: ( ruleLifelineName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestroyAccess().getCalledLifelineCrossReference_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2477:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2478:1: ruleLifelineName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestroyAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleLifelineName_in_rule__Destroy__CalledAssignment_14966);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestroyAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestroyAccess().getCalledLifelineCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destroy__CalledAssignment_1"


    // $ANTLR start "rule__Message__NameAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2489:1: rule__Message__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2493:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2494:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2494:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2495:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_05001); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_0"


    // $ANTLR start "rule__Message__ParamAssignment_1_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2504:1: rule__Message__ParamAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__Message__ParamAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2508:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2509:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2509:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2510:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getParamIDTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__ParamAssignment_1_1_05032); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getParamIDTerminalRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ParamAssignment_1_1_0"


    // $ANTLR start "rule__Message__ParamAssignment_1_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2519:1: rule__Message__ParamAssignment_1_1_1_1 : ( RULE_ID ) ;
    public final void rule__Message__ParamAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2523:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2524:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2524:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2525:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getParamIDTerminalRuleCall_1_1_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__ParamAssignment_1_1_1_15063); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getParamIDTerminalRuleCall_1_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ParamAssignment_1_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSequencemodel_in_entryRuleSequencemodel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencemodel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__Group__0_in_ruleSequencemodel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_entryRuleLifelineName307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLifelineName314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLifelineName340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifeline_in_entryRuleLifeline366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLifeline373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lifeline__Group__0_in_ruleLifeline399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReply_in_entryRuleReply606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReply613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__Group__0_in_ruleReply639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelf_in_entryRuleSelf666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelf673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__Group__0_in_ruleSelf699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0_in_ruleCreate759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroy_in_entryRuleDestroy786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestroy793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destroy__Group__0_in_ruleDestroy819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Alternatives975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__Statement__Alternatives1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReply_in_rule__Statement__Alternatives1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelf_in_rule__Statement__Alternatives1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_rule__Statement__Alternatives1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroy_in_rule__Statement__Alternatives1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__Group__0__Impl_in_rule__Sequencemodel__Group__01122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Sequencemodel__Group__1_in_rule__Sequencemodel__Group__01125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__ImportsAssignment_0_in_rule__Sequencemodel__Group__0__Impl1152 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Sequencemodel__Group__1__Impl_in_rule__Sequencemodel__Group__11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__SequenceAssignment_1_in_rule__Sequencemodel__Group__1__Impl1210 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import__Group__0__Impl1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01368 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sequence__Group__0__Impl1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11430 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21490 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sequence__Group__2__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__31552 = new BitSet(new long[]{0x0000000002004010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__31555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__LifelineAssignment_3_in_rule__Sequence__Group__3__Impl1584 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__Sequence__LifelineAssignment_3_in_rule__Sequence__Group__3__Impl1596 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__41629 = new BitSet(new long[]{0x0000000002004010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__41632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__TransitionAssignment_4_in_rule__Sequence__Group__4__Impl1659 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__51690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Sequence__Group__5__Impl1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lifeline__Group__0__Impl_in_rule__Lifeline__Group__01761 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Lifeline__Group__1_in_rule__Lifeline__Group__01764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lifeline__ActorAssignment_0_in_rule__Lifeline__Group__0__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lifeline__Group__1__Impl_in_rule__Lifeline__Group__11822 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Lifeline__Group__2_in_rule__Lifeline__Group__11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lifeline__NameAssignment_1_in_rule__Lifeline__Group__1__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lifeline__Group__2__Impl_in_rule__Lifeline__Group__21882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Lifeline__Group__3_in_rule__Lifeline__Group__21885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Lifeline__Group__2__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lifeline__Group__3__Impl_in_rule__Lifeline__Group__31944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lifeline__EntityAssignment_3_in_rule__Lifeline__Group__3__Impl1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02009 = new BitSet(new long[]{0x00000000003D0000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__CallerAssignment_0_in_rule__Transition__Group__0__Impl2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StatementAssignment_1_in_rule__Transition__Group__1__Impl2098 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_rule__Transition__StatementAssignment_1_in_rule__Transition__Group__1__Impl2110 = new BitSet(new long[]{0x00000000003D0002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__02147 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__02150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Call__Group__0__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__12209 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__12212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__CalledAssignment_1_in_rule__Call__Group__1__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__22269 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__22272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_2__0_in_rule__Call__Group__2__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__32329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_2__0__Impl_in_rule__Call__Group_2__02395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Call__Group_2__1_in_rule__Call__Group_2__02398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Call__Group_2__0__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_2__1__Impl_in_rule__Call__Group_2__12459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__MessageAssignment_2_1_in_rule__Call__Group_2__1__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__02520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__02523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Call__Group_3__0__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__12584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ReplyAssignment_3_1_in_rule__Call__Group_3__1__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__Group__0__Impl_in_rule__Reply__Group__02645 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Reply__Group__1_in_rule__Reply__Group__02648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Reply__Group__0__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__Group__1__Impl_in_rule__Reply__Group__12707 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Reply__Group__2_in_rule__Reply__Group__12710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__CalledAssignment_1_in_rule__Reply__Group__1__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__Group__2__Impl_in_rule__Reply__Group__22767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__Group_2__0_in_rule__Reply__Group__2__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__Group_2__0__Impl_in_rule__Reply__Group_2__02831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reply__Group_2__1_in_rule__Reply__Group_2__02834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Reply__Group_2__0__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__Group_2__1__Impl_in_rule__Reply__Group_2__12895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reply__ReplyAssignment_2_1_in_rule__Reply__Group_2__1__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__Group__0__Impl_in_rule__Self__Group__02956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Self__Group__1_in_rule__Self__Group__02959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Self__Group__0__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__Group__1__Impl_in_rule__Self__Group__13018 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Self__Group__2_in_rule__Self__Group__13021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__MessageAssignment_1_in_rule__Self__Group__1__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__Group__2__Impl_in_rule__Self__Group__23078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__Group_2__0_in_rule__Self__Group__2__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__Group_2__0__Impl_in_rule__Self__Group_2__03142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Self__Group_2__1_in_rule__Self__Group_2__03145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Self__Group_2__0__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__Group_2__1__Impl_in_rule__Self__Group_2__13206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Self__ReplyAssignment_2_1_in_rule__Self__Group_2__1__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__0__Impl_in_rule__Create__Group__03267 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Create__Group__1_in_rule__Create__Group__03270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Create__Group__0__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__Group__1__Impl_in_rule__Create__Group__13329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Create__CalledAssignment_1_in_rule__Create__Group__1__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destroy__Group__0__Impl_in_rule__Destroy__Group__03390 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Destroy__Group__1_in_rule__Destroy__Group__03393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Destroy__Group__0__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destroy__Group__1__Impl_in_rule__Destroy__Group__13452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Destroy__CalledAssignment_1_in_rule__Destroy__Group__1__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03513 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__0_in_rule__Message__Group__1__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__0__Impl_in_rule__Message__Group_1__03635 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Message__Group_1__1_in_rule__Message__Group_1__03638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Message__Group_1__0__Impl3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__1__Impl_in_rule__Message__Group_1__13699 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Message__Group_1__2_in_rule__Message__Group_1__13702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1_1__0_in_rule__Message__Group_1__1__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__2__Impl_in_rule__Message__Group_1__23760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Message__Group_1__2__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1_1__0__Impl_in_rule__Message__Group_1_1__03825 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Message__Group_1_1__1_in_rule__Message__Group_1_1__03828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ParamAssignment_1_1_0_in_rule__Message__Group_1_1__0__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1_1__1__Impl_in_rule__Message__Group_1_1__13885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1_1_1__0_in_rule__Message__Group_1_1__1__Impl3912 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1_1_1__0__Impl_in_rule__Message__Group_1_1_1__03947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group_1_1_1__1_in_rule__Message__Group_1_1_1__03950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Message__Group_1_1_1__0__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1_1_1__1__Impl_in_rule__Message__Group_1_1_1__14011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ParamAssignment_1_1_1_1_in_rule__Message__Group_1_1_1__1__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04072 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4158 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QualifiedName__Group_1__0__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Sequencemodel__ImportsAssignment_04320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Sequencemodel__SequenceAssignment_14351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Sequence__NameAssignment_14413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifeline_in_rule__Sequence__LifelineAssignment_34444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Sequence__TransitionAssignment_44475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Lifeline__ActorAssignment_04511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_rule__Lifeline__NameAssignment_14550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Lifeline__EntityAssignment_34585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_rule__Transition__CallerAssignment_04624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Transition__StatementAssignment_14659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_rule__Call__CalledAssignment_14694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Call__MessageAssignment_2_14729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Call__ReplyAssignment_3_14760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_rule__Reply__CalledAssignment_14795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reply__ReplyAssignment_2_14830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Self__MessageAssignment_14861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Self__ReplyAssignment_2_14892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_rule__Create__CalledAssignment_14927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_rule__Destroy__CalledAssignment_14966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_05001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__ParamAssignment_1_1_05032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__ParamAssignment_1_1_1_15063 = new BitSet(new long[]{0x0000000000000002L});

}
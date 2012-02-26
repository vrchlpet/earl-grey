package cz.cvut.earlgrey.annotation.ui.contentassist.antlr.internal; 

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
import cz.cvut.earlgrey.annotation.services.AnnotationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAnnotationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_NULL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'('", "')'", "','", "'='", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=8;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_NULL=7;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators


        public InternalAnnotationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationParser.tokenNames; }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g"; }


     
     	private AnnotationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AnnotationGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleAnnotation"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:61:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:62:1: ( ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:63:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation67);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation74); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:70:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:74:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:75:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:75:1: ( ( rule__Annotation__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:76:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:77:1: ( rule__Annotation__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:77:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation100);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:89:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:90:1: ( ruleParameter EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:91:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter127);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter134); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:98:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:102:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:103:1: ( ( rule__Parameter__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:103:1: ( ( rule__Parameter__Alternatives ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:104:1: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:105:1: ( rule__Parameter__Alternatives )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:105:2: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_rule__Parameter__Alternatives_in_ruleParameter160);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:117:1: entryRuleAssignParameter : ruleAssignParameter EOF ;
    public final void entryRuleAssignParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:118:1: ( ruleAssignParameter EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:119:1: ruleAssignParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterRule()); 
            }
            pushFollow(FOLLOW_ruleAssignParameter_in_entryRuleAssignParameter187);
            ruleAssignParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignParameter194); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:126:1: ruleAssignParameter : ( ( rule__AssignParameter__Group__0 ) ) ;
    public final void ruleAssignParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:130:2: ( ( ( rule__AssignParameter__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:131:1: ( ( rule__AssignParameter__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:131:1: ( ( rule__AssignParameter__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:132:1: ( rule__AssignParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:133:1: ( rule__AssignParameter__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:133:2: rule__AssignParameter__Group__0
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__0_in_ruleAssignParameter220);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:145:1: entryRuleValueParameter : ruleValueParameter EOF ;
    public final void entryRuleValueParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:146:1: ( ruleValueParameter EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:147:1: ruleValueParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueParameterRule()); 
            }
            pushFollow(FOLLOW_ruleValueParameter_in_entryRuleValueParameter247);
            ruleValueParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueParameter254); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:154:1: ruleValueParameter : ( ( rule__ValueParameter__ValueAssignment ) ) ;
    public final void ruleValueParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:158:2: ( ( ( rule__ValueParameter__ValueAssignment ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:159:1: ( ( rule__ValueParameter__ValueAssignment ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:159:1: ( ( rule__ValueParameter__ValueAssignment ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:160:1: ( rule__ValueParameter__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueParameterAccess().getValueAssignment()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:161:1: ( rule__ValueParameter__ValueAssignment )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:161:2: rule__ValueParameter__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ValueParameter__ValueAssignment_in_ruleValueParameter280);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:173:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:174:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:175:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue307);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue314); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:182:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:186:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:187:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:187:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:188:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:189:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:189:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue340);
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


    // $ANTLR start "entryRuleDouble"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:201:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:202:1: ( ruleDouble EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:203:1: ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble367);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:210:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:214:2: ( ( ( rule__Double__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:215:1: ( ( rule__Double__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:215:1: ( ( rule__Double__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:216:1: ( rule__Double__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:217:1: ( rule__Double__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:217:2: rule__Double__Group__0
            {
            pushFollow(FOLLOW_rule__Double__Group__0_in_ruleDouble400);
            rule__Double__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleExtendedID"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:229:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:230:1: ( ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:231:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID427);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID434); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:238:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:242:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:243:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:243:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:244:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:245:1: ( rule__ExtendedID__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:245:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID460);
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


    // $ANTLR start "rule__Parameter__Alternatives"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:257:1: rule__Parameter__Alternatives : ( ( ruleAssignParameter ) | ( ruleValueParameter ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:261:1: ( ( ruleAssignParameter ) | ( ruleValueParameter ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:262:1: ( ruleAssignParameter )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:262:1: ( ruleAssignParameter )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:263:1: ruleAssignParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getAssignParameterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAssignParameter_in_rule__Parameter__Alternatives496);
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:268:6: ( ruleValueParameter )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:268:6: ( ruleValueParameter )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:269:1: ruleValueParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getValueParameterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValueParameter_in_rule__Parameter__Alternatives513);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:279:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleDouble ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:283:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleDouble ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=15 && LA2_1<=16)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==18) ) {
                    alt2=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt2=4;
                }
                break;
            case RULE_NULL:
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:284:1: ( RULE_INT )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:284:1: ( RULE_INT )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:285:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Value__Alternatives545); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:290:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:290:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:291:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives562); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:296:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:296:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:297:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives579);
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:302:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:302:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:303:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives596); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:308:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:308:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:309:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives613); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:314:6: ( ruleDouble )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:314:6: ( ruleDouble )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:315:1: ruleDouble
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getDoubleParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleDouble_in_rule__Value__Alternatives630);
                    ruleDouble();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getDoubleParserRuleCall_5()); 
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


    // $ANTLR start "rule__Annotation__Group__0"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:327:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:331:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:332:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__0660);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__0663);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:339:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:343:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:344:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:344:1: ( '@' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:345:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Annotation__Group__0__Impl691); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:358:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:362:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:363:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__1722);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__1725);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:370:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:374:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:375:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:375:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:376:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:377:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:377:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl752);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:387:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:391:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:392:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__2782);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:398:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:402:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:403:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:403:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:404:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:405:1: ( rule__Annotation__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:405:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl809);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:421:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:425:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:426:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__0846);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__0849);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:433:1: rule__Annotation__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:437:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:438:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:438:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:439:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:440:1: ( '(' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:441:2: '('
            {
            match(input,14,FOLLOW_14_in_rule__Annotation__Group_2__0__Impl878); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:452:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:456:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:457:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__1910);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__1913);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:464:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:468:1: ( ( ( rule__Annotation__ParameterAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:469:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:469:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:470:1: ( rule__Annotation__ParameterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:471:1: ( rule__Annotation__ParameterAssignment_2_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:471:2: rule__Annotation__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl940);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:481:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:485:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:486:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__2970);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__2973);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:493:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:497:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:498:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:498:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:499:1: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:500:1: ( rule__Annotation__Group_2_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:500:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl1000);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:510:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:514:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:515:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__31031);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:521:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:525:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:526:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:526:1: ( ')' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:527:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__Annotation__Group_2__3__Impl1059); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:548:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:552:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:553:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__01098);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__01101);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:560:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:564:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:565:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:565:1: ( ',' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:566:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Annotation__Group_2_2__0__Impl1129); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:579:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:583:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:584:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__11160);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:590:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:594:1: ( ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:595:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:595:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:596:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:597:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:597:2: rule__Annotation__ParameterAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl1187);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:611:1: rule__AssignParameter__Group__0 : rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1 ;
    public final void rule__AssignParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:615:1: ( rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:616:2: rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__0__Impl_in_rule__AssignParameter__Group__01221);
            rule__AssignParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignParameter__Group__1_in_rule__AssignParameter__Group__01224);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:623:1: rule__AssignParameter__Group__0__Impl : ( ( rule__AssignParameter__NameAssignment_0 ) ) ;
    public final void rule__AssignParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:627:1: ( ( ( rule__AssignParameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:628:1: ( ( rule__AssignParameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:628:1: ( ( rule__AssignParameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:629:1: ( rule__AssignParameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:630:1: ( rule__AssignParameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:630:2: rule__AssignParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignParameter__NameAssignment_0_in_rule__AssignParameter__Group__0__Impl1251);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:640:1: rule__AssignParameter__Group__1 : rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2 ;
    public final void rule__AssignParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:644:1: ( rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:645:2: rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__1__Impl_in_rule__AssignParameter__Group__11281);
            rule__AssignParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignParameter__Group__2_in_rule__AssignParameter__Group__11284);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:652:1: rule__AssignParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__AssignParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:656:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:657:1: ( '=' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:657:1: ( '=' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:658:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__AssignParameter__Group__1__Impl1312); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:671:1: rule__AssignParameter__Group__2 : rule__AssignParameter__Group__2__Impl ;
    public final void rule__AssignParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:675:1: ( rule__AssignParameter__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:676:2: rule__AssignParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__2__Impl_in_rule__AssignParameter__Group__21343);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:682:1: rule__AssignParameter__Group__2__Impl : ( ( rule__AssignParameter__ValueAssignment_2 ) ) ;
    public final void rule__AssignParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:686:1: ( ( ( rule__AssignParameter__ValueAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:687:1: ( ( rule__AssignParameter__ValueAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:687:1: ( ( rule__AssignParameter__ValueAssignment_2 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:688:1: ( rule__AssignParameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getValueAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:689:1: ( rule__AssignParameter__ValueAssignment_2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:689:2: rule__AssignParameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AssignParameter__ValueAssignment_2_in_rule__AssignParameter__Group__2__Impl1370);
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


    // $ANTLR start "rule__Double__Group__0"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:705:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:709:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:710:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_rule__Double__Group__0__Impl_in_rule__Double__Group__01406);
            rule__Double__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Double__Group__1_in_rule__Double__Group__01409);
            rule__Double__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:717:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:721:1: ( ( RULE_INT ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:722:1: ( RULE_INT )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:722:1: ( RULE_INT )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:723:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Group__0__Impl1436); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:734:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:738:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:739:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_rule__Double__Group__1__Impl_in_rule__Double__Group__11465);
            rule__Double__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Double__Group__2_in_rule__Double__Group__11468);
            rule__Double__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:746:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:750:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:751:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:751:1: ( '.' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:752:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__Double__Group__1__Impl1496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:765:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:769:1: ( rule__Double__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:770:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Double__Group__2__Impl_in_rule__Double__Group__21527);
            rule__Double__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:776:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:780:1: ( ( RULE_INT ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:781:1: ( RULE_INT )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:781:1: ( RULE_INT )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:782:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Group__2__Impl1554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__ExtendedID__Group__0"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:799:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:803:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:804:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__01589);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__01592);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:811:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:815:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:816:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:816:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:817:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl1619); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:828:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:832:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:833:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__11648);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:839:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:843:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:844:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:844:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:845:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:846:1: ( rule__ExtendedID__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:846:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl1675);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:860:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:864:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:865:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__01710);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__01713);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:872:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:876:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:877:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:877:1: ( '.' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:878:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__ExtendedID__Group_1__0__Impl1741); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:891:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:895:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:896:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__11772);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:902:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:906:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:907:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:907:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:908:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl1799); if (state.failed) return ;
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


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:924:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:928:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:929:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:929:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:930:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_11837);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:939:1: rule__Annotation__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:943:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:944:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:944:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:945:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_11868);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:954:1: rule__Annotation__ParameterAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:958:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:959:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:959:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:960:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_11899);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:969:1: rule__AssignParameter__NameAssignment_0 : ( ruleExtendedID ) ;
    public final void rule__AssignParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:973:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:974:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:974:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:975:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getNameExtendedIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__AssignParameter__NameAssignment_01930);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:984:1: rule__AssignParameter__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__AssignParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:988:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:989:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:989:1: ( ruleValue )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:990:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__AssignParameter__ValueAssignment_21961);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:999:1: rule__ValueParameter__ValueAssignment : ( ruleValue ) ;
    public final void rule__ValueParameter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1003:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1004:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1004:1: ( ruleValue )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1005:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueParameterAccess().getValueValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ValueParameter__ValueAssignment1992);
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\6\uffff";
    static final String DFA1_eofS =
        "\1\uffff\1\2\3\uffff\1\2";
    static final String DFA1_minS =
        "\1\4\1\17\1\uffff\1\10\1\uffff\1\17";
    static final String DFA1_maxS =
        "\1\10\1\22\1\uffff\1\10\1\uffff\1\22";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\4\2\1\1",
            "\2\2\1\4\1\3",
            "",
            "\1\5",
            "",
            "\2\2\1\4\1\3"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "257:1: rule__Parameter__Alternatives : ( ( ruleAssignParameter ) | ( ruleValueParameter ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Alternatives_in_ruleParameter160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignParameter_in_entryRuleAssignParameter187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignParameter194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__0_in_ruleAssignParameter220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueParameter_in_entryRuleValueParameter247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueParameter254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueParameter__ValueAssignment_in_ruleValueParameter280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__0_in_ruleDouble400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignParameter_in_rule__Parameter__Alternatives496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueParameter_in_rule__Parameter__Alternatives513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Value__Alternatives545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__Value__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__0660 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__0663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Annotation__Group__0__Impl691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__1722 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__0846 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__0849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Annotation__Group_2__0__Impl878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__1910 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__2970 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl1000 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__31031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Annotation__Group_2__3__Impl1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__01098 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__01101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Annotation__Group_2_2__0__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__0__Impl_in_rule__AssignParameter__Group__01221 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__1_in_rule__AssignParameter__Group__01224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__NameAssignment_0_in_rule__AssignParameter__Group__0__Impl1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__1__Impl_in_rule__AssignParameter__Group__11281 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__2_in_rule__AssignParameter__Group__11284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AssignParameter__Group__1__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__2__Impl_in_rule__AssignParameter__Group__21343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__ValueAssignment_2_in_rule__AssignParameter__Group__2__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__0__Impl_in_rule__Double__Group__01406 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Double__Group__1_in_rule__Double__Group__01409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Group__0__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__1__Impl_in_rule__Double__Group__11465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Double__Group__2_in_rule__Double__Group__11468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Double__Group__1__Impl1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__2__Impl_in_rule__Double__Group__21527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Group__2__Impl1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__01589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__01592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__11648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl1675 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__01710 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__01713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExtendedID__Group_1__0__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_11868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_11899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__AssignParameter__NameAssignment_01930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__AssignParameter__ValueAssignment_21961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ValueParameter__ValueAssignment1992 = new BitSet(new long[]{0x0000000000000002L});

}
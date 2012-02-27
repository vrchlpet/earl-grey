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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_NULL", "RULE_ID", "RULE_NATURAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'e'", "'E'", "'+'", "'-'", "'@'", "'('", "')'", "','", "'='", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
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


    // $ANTLR start "entryRuleExtendedID"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:201:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:202:1: ( ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:203:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID367);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID374); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:210:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:214:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:215:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:215:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:216:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:217:1: ( rule__ExtendedID__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:217:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID400);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:229:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:230:1: ( ruleReal EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:231:1: ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal427);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal434); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:238:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:242:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:243:1: ( ( rule__Real__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:243:1: ( ( rule__Real__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:244:1: ( rule__Real__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:245:1: ( rule__Real__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:245:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal460);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:257:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:258:1: ( ruleInteger EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:259:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger487);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger494); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:266:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:270:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:271:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:271:1: ( ( rule__Integer__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:272:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:273:1: ( rule__Integer__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:273:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger520);
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


    // $ANTLR start "rule__Parameter__Alternatives"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:285:1: rule__Parameter__Alternatives : ( ( ruleAssignParameter ) | ( ruleValueParameter ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:289:1: ( ( ruleAssignParameter ) | ( ruleValueParameter ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:290:1: ( ruleAssignParameter )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:290:1: ( ruleAssignParameter )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:291:1: ruleAssignParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getAssignParameterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAssignParameter_in_rule__Parameter__Alternatives556);
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:296:6: ( ruleValueParameter )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:296:6: ( ruleValueParameter )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:297:1: ruleValueParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getValueParameterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValueParameter_in_rule__Parameter__Alternatives573);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:307:1: rule__Value__Alternatives : ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:311:1: ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_NATURAL) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==EOF||(LA2_2>=19 && LA2_2<=20)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==22) ) {
                        alt2=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||(LA2_2>=19 && LA2_2<=20)) ) {
                    alt2=1;
                }
                else if ( (LA2_2==22) ) {
                    alt2=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:312:1: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:312:1: ( ruleInteger )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:313:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__Value__Alternatives605);
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:318:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:318:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:319:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives622); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:324:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:324:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:325:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives639);
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:330:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:330:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:331:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives656); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:336:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:336:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:337:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives673); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:342:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:342:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:343:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__Value__Alternatives690);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:353:1: rule__Real__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:357:1: ( ( 'e' ) | ( 'E' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:358:1: ( 'e' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:358:1: ( 'e' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:359:1: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Real__Alternatives_4_0723); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:366:6: ( 'E' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:366:6: ( 'E' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:367:1: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Real__Alternatives_4_0743); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:379:1: rule__Real__Alternatives_4_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:383:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:384:1: ( '+' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:384:1: ( '+' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:385:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Real__Alternatives_4_1778); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:392:6: ( '-' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:392:6: ( '-' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:393:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Real__Alternatives_4_1798); if (state.failed) return ;
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


    // $ANTLR start "rule__Annotation__Group__0"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:407:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:411:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:412:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__0830);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__0833);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:419:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:423:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:424:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:424:1: ( '@' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:425:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Annotation__Group__0__Impl861); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:438:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:442:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:443:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__1892);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__1895);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:450:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:454:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:455:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:455:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:456:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:457:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:457:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl922);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:467:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:471:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:472:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__2952);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:478:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:482:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:483:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:483:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:484:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:485:1: ( rule__Annotation__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:485:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl979);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:501:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:505:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:506:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__01016);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__01019);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:513:1: rule__Annotation__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:517:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:518:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:518:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:519:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:520:1: ( '(' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:521:2: '('
            {
            match(input,18,FOLLOW_18_in_rule__Annotation__Group_2__0__Impl1048); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:532:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:536:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:537:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__11080);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__11083);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:544:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:548:1: ( ( ( rule__Annotation__ParameterAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:549:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:549:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:550:1: ( rule__Annotation__ParameterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:551:1: ( rule__Annotation__ParameterAssignment_2_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:551:2: rule__Annotation__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl1110);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:561:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:565:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:566:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__21140);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__21143);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:573:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:577:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:578:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:578:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:579:1: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:580:1: ( rule__Annotation__Group_2_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:580:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl1170);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:590:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:594:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:595:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__31201);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:601:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:605:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:606:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:606:1: ( ')' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:607:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__Annotation__Group_2__3__Impl1229); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:628:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:632:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:633:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__01268);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__01271);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:640:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:644:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:645:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:645:1: ( ',' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:646:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Annotation__Group_2_2__0__Impl1299); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:659:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:663:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:664:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__11330);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:670:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:674:1: ( ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:675:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:675:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:676:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:677:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:677:2: rule__Annotation__ParameterAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl1357);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:691:1: rule__AssignParameter__Group__0 : rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1 ;
    public final void rule__AssignParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:695:1: ( rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:696:2: rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__0__Impl_in_rule__AssignParameter__Group__01391);
            rule__AssignParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignParameter__Group__1_in_rule__AssignParameter__Group__01394);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:703:1: rule__AssignParameter__Group__0__Impl : ( ( rule__AssignParameter__NameAssignment_0 ) ) ;
    public final void rule__AssignParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:707:1: ( ( ( rule__AssignParameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:708:1: ( ( rule__AssignParameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:708:1: ( ( rule__AssignParameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:709:1: ( rule__AssignParameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:710:1: ( rule__AssignParameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:710:2: rule__AssignParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignParameter__NameAssignment_0_in_rule__AssignParameter__Group__0__Impl1421);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:720:1: rule__AssignParameter__Group__1 : rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2 ;
    public final void rule__AssignParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:724:1: ( rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:725:2: rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__1__Impl_in_rule__AssignParameter__Group__11451);
            rule__AssignParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignParameter__Group__2_in_rule__AssignParameter__Group__11454);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:732:1: rule__AssignParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__AssignParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:736:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:737:1: ( '=' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:737:1: ( '=' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:738:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__AssignParameter__Group__1__Impl1482); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:751:1: rule__AssignParameter__Group__2 : rule__AssignParameter__Group__2__Impl ;
    public final void rule__AssignParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:755:1: ( rule__AssignParameter__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:756:2: rule__AssignParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__2__Impl_in_rule__AssignParameter__Group__21513);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:762:1: rule__AssignParameter__Group__2__Impl : ( ( rule__AssignParameter__ValueAssignment_2 ) ) ;
    public final void rule__AssignParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:766:1: ( ( ( rule__AssignParameter__ValueAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:767:1: ( ( rule__AssignParameter__ValueAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:767:1: ( ( rule__AssignParameter__ValueAssignment_2 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:768:1: ( rule__AssignParameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getValueAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:769:1: ( rule__AssignParameter__ValueAssignment_2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:769:2: rule__AssignParameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AssignParameter__ValueAssignment_2_in_rule__AssignParameter__Group__2__Impl1540);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:785:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:789:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:790:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__01576);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__01579);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:797:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:801:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:802:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:802:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:803:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl1606); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:814:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:818:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:819:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__11635);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:825:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:829:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:830:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:830:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:831:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:832:1: ( rule__ExtendedID__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:832:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl1662);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:846:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:850:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:851:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__01697);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__01700);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:858:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:862:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:863:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:863:1: ( '.' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:864:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__ExtendedID__Group_1__0__Impl1728); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:877:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:881:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:882:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__11759);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:888:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:892:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:893:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:893:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:894:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl1786); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:909:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:913:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:914:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__01819);
            rule__Real__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__01822);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:921:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:925:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:926:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:926:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:927:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:928:1: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:929:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__Real__Group__0__Impl1851); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:940:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:944:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:945:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__11884);
            rule__Real__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__11887);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:952:1: rule__Real__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:956:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:957:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:957:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:958:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl1914); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:969:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:973:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:974:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__21943);
            rule__Real__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__3_in_rule__Real__Group__21946);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:981:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:985:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:986:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:986:1: ( '.' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:987:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Real__Group__2__Impl1974); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1000:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1004:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1005:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__32005);
            rule__Real__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__4_in_rule__Real__Group__32008);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1012:1: rule__Real__Group__3__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1016:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1017:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1017:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1018:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl2035); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1029:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1033:1: ( rule__Real__Group__4__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1034:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__42064);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1040:1: rule__Real__Group__4__Impl : ( ( rule__Real__Group_4__0 )? ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1044:1: ( ( ( rule__Real__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1045:1: ( ( rule__Real__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1045:1: ( ( rule__Real__Group_4__0 )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1046:1: ( rule__Real__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1047:1: ( rule__Real__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=14)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1047:2: rule__Real__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl2091);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1067:1: rule__Real__Group_4__0 : rule__Real__Group_4__0__Impl rule__Real__Group_4__1 ;
    public final void rule__Real__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1071:1: ( rule__Real__Group_4__0__Impl rule__Real__Group_4__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1072:2: rule__Real__Group_4__0__Impl rule__Real__Group_4__1
            {
            pushFollow(FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__02132);
            rule__Real__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__02135);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1079:1: rule__Real__Group_4__0__Impl : ( ( rule__Real__Alternatives_4_0 ) ) ;
    public final void rule__Real__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1083:1: ( ( ( rule__Real__Alternatives_4_0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1084:1: ( ( rule__Real__Alternatives_4_0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1084:1: ( ( rule__Real__Alternatives_4_0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1085:1: ( rule__Real__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1086:1: ( rule__Real__Alternatives_4_0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1086:2: rule__Real__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl2162);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1096:1: rule__Real__Group_4__1 : rule__Real__Group_4__1__Impl rule__Real__Group_4__2 ;
    public final void rule__Real__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1100:1: ( rule__Real__Group_4__1__Impl rule__Real__Group_4__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1101:2: rule__Real__Group_4__1__Impl rule__Real__Group_4__2
            {
            pushFollow(FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__12192);
            rule__Real__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__12195);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1108:1: rule__Real__Group_4__1__Impl : ( ( rule__Real__Alternatives_4_1 ) ) ;
    public final void rule__Real__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1112:1: ( ( ( rule__Real__Alternatives_4_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1113:1: ( ( rule__Real__Alternatives_4_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1113:1: ( ( rule__Real__Alternatives_4_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1114:1: ( rule__Real__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1115:1: ( rule__Real__Alternatives_4_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1115:2: rule__Real__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl2222);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1125:1: rule__Real__Group_4__2 : rule__Real__Group_4__2__Impl ;
    public final void rule__Real__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1129:1: ( rule__Real__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1130:2: rule__Real__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__22252);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1136:1: rule__Real__Group_4__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1140:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1141:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1141:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1142:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl2279); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1159:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1163:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1164:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__02314);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__02317);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1171:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1175:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1176:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1176:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1177:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1178:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1179:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__Integer__Group__0__Impl2346); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1190:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1194:1: ( rule__Integer__Group__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1195:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__12379);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1201:1: rule__Integer__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1205:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1206:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1206:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1207:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl2406); if (state.failed) return ;
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


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1223:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1227:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1228:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1228:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1229:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_12444);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1238:1: rule__Annotation__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1242:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1243:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1243:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1244:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_12475);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1253:1: rule__Annotation__ParameterAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1257:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1258:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1258:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1259:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_12506);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1268:1: rule__AssignParameter__NameAssignment_0 : ( ruleExtendedID ) ;
    public final void rule__AssignParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1272:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1273:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1273:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1274:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getNameExtendedIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__AssignParameter__NameAssignment_02537);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1283:1: rule__AssignParameter__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__AssignParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1287:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1288:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1288:1: ( ruleValue )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1289:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__AssignParameter__ValueAssignment_22568);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1298:1: rule__ValueParameter__ValueAssignment : ( ruleValue ) ;
    public final void rule__ValueParameter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1302:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1303:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1303:1: ( ruleValue )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1304:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueParameterAccess().getValueValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ValueParameter__ValueAssignment2599);
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
        "\1\4\1\23\1\uffff\1\7\1\uffff\1\23";
    static final String DFA1_maxS =
        "\1\20\1\26\1\uffff\1\7\1\uffff\1\26";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\3\2\1\1\1\2\7\uffff\1\2",
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
            return "285:1: rule__Parameter__Alternatives : ( ( ruleAssignParameter ) | ( ruleValueParameter ) );";
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
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignParameter_in_rule__Parameter__Alternatives556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueParameter_in_rule__Parameter__Alternatives573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Value__Alternatives605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__Alternatives690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Real__Alternatives_4_0723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Real__Alternatives_4_0743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Real__Alternatives_4_1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Alternatives_4_1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__0830 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__0833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Annotation__Group__0__Impl861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__1892 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__01016 = new BitSet(new long[]{0x00000000000101F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__01019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Annotation__Group_2__0__Impl1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__11080 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__21140 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__21143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl1170 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__31201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Annotation__Group_2__3__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__01268 = new BitSet(new long[]{0x00000000000101F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__01271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Annotation__Group_2_2__0__Impl1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__0__Impl_in_rule__AssignParameter__Group__01391 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__1_in_rule__AssignParameter__Group__01394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__NameAssignment_0_in_rule__AssignParameter__Group__0__Impl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__1__Impl_in_rule__AssignParameter__Group__11451 = new BitSet(new long[]{0x00000000000101F0L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__2_in_rule__AssignParameter__Group__11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AssignParameter__Group__1__Impl1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__2__Impl_in_rule__AssignParameter__Group__21513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__ValueAssignment_2_in_rule__AssignParameter__Group__2__Impl1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__01576 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__01579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__11635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl1662 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__01697 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__01700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ExtendedID__Group_1__0__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__11759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__01819 = new BitSet(new long[]{0x00000000000101F0L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__01822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Group__0__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__11884 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__21943 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Real__Group__3_in_rule__Real__Group__21946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Real__Group__2__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__32005 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Real__Group__4_in_rule__Real__Group__32008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__42064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__02132 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__12192 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__12195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__22252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__02314 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__02317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Integer__Group__0__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__12379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_12444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__AssignParameter__NameAssignment_02537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__AssignParameter__ValueAssignment_22568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ValueParameter__ValueAssignment2599 = new BitSet(new long[]{0x0000000000000002L});

}
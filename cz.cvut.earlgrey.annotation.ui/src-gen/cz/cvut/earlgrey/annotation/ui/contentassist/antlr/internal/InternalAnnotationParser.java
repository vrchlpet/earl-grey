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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_NULL", "RULE_ID", "RULE_NATURAL", "RULE_OPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'e'", "'E'", "'+'", "'-'", "'@'", "'('", "')'", "','", "'='", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_NULL=6;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_OPERATOR=9;
    public static final int RULE_WS=12;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:233:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:234:1: ( ruleReal EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:235:1: ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal431);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal438); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:242:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:246:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:247:1: ( ( rule__Real__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:247:1: ( ( rule__Real__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:248:1: ( rule__Real__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:249:1: ( rule__Real__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:249:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal464);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:261:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:262:1: ( ruleInteger EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:263:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger491);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger498); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:270:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:274:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:275:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:275:1: ( ( rule__Integer__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:276:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:277:1: ( rule__Integer__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:277:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger524);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:289:1: rule__Parameter__Alternatives : ( ( ruleAssignParameter ) | ( ruleValueParameter ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:293:1: ( ( ruleAssignParameter ) | ( ruleValueParameter ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:294:1: ( ruleAssignParameter )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:294:1: ( ruleAssignParameter )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:295:1: ruleAssignParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getAssignParameterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAssignParameter_in_rule__Parameter__Alternatives560);
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:300:6: ( ruleValueParameter )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:300:6: ( ruleValueParameter )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:301:1: ruleValueParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getValueParameterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValueParameter_in_rule__Parameter__Alternatives577);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:311:1: rule__Value__Alternatives : ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:315:1: ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_NATURAL) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==EOF||(LA2_2>=20 && LA2_2<=21)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==23) ) {
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

                if ( (LA2_2==EOF||(LA2_2>=20 && LA2_2<=21)) ) {
                    alt2=1;
                }
                else if ( (LA2_2==23) ) {
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:316:1: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:316:1: ( ruleInteger )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:317:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__Value__Alternatives609);
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:322:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:322:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:323:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives626); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:328:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:328:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:329:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives643);
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:334:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:334:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:335:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives660); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:340:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:340:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:341:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives677); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:346:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:346:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:347:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__Value__Alternatives694);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:359:1: rule__Real__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:363:1: ( ( 'e' ) | ( 'E' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:364:1: ( 'e' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:364:1: ( 'e' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:365:1: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Real__Alternatives_4_0729); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:372:6: ( 'E' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:372:6: ( 'E' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:373:1: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Real__Alternatives_4_0749); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:385:1: rule__Real__Alternatives_4_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:389:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
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
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:390:1: ( '+' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:390:1: ( '+' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:391:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Real__Alternatives_4_1784); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:398:6: ( '-' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:398:6: ( '-' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:399:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Real__Alternatives_4_1804); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:413:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:417:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:418:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__0836);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__0839);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:425:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:429:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:430:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:430:1: ( '@' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:431:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Annotation__Group__0__Impl867); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:444:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:448:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:449:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__1898);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__1901);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:456:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:460:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:461:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:461:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:462:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:463:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:463:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl928);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:473:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:477:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:478:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__2958);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:484:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:488:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:489:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:489:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:490:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:491:1: ( rule__Annotation__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:491:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl985);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:507:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:511:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:512:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__01022);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__01025);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:519:1: rule__Annotation__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:523:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:524:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:524:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:525:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:526:1: ( '(' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:527:2: '('
            {
            match(input,19,FOLLOW_19_in_rule__Annotation__Group_2__0__Impl1054); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:538:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:542:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__11086);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__11089);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:550:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:554:1: ( ( ( rule__Annotation__ParameterAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:555:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:555:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:556:1: ( rule__Annotation__ParameterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:557:1: ( rule__Annotation__ParameterAssignment_2_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:557:2: rule__Annotation__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl1116);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:567:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:571:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:572:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__21146);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__21149);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:579:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:583:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:584:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:584:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:585:1: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:586:1: ( rule__Annotation__Group_2_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:586:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl1176);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:596:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:600:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:601:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__31207);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:607:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:611:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:612:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:612:1: ( ')' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:613:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__Annotation__Group_2__3__Impl1235); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:634:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:638:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:639:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__01274);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__01277);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:646:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:650:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:651:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:651:1: ( ',' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:652:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Annotation__Group_2_2__0__Impl1305); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:665:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:669:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:670:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__11336);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:676:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:680:1: ( ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:681:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:681:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:682:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:683:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:683:2: rule__Annotation__ParameterAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl1363);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:697:1: rule__AssignParameter__Group__0 : rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1 ;
    public final void rule__AssignParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:701:1: ( rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:702:2: rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__0__Impl_in_rule__AssignParameter__Group__01397);
            rule__AssignParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignParameter__Group__1_in_rule__AssignParameter__Group__01400);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:709:1: rule__AssignParameter__Group__0__Impl : ( ( rule__AssignParameter__NameAssignment_0 ) ) ;
    public final void rule__AssignParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:713:1: ( ( ( rule__AssignParameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:714:1: ( ( rule__AssignParameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:714:1: ( ( rule__AssignParameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:715:1: ( rule__AssignParameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:716:1: ( rule__AssignParameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:716:2: rule__AssignParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignParameter__NameAssignment_0_in_rule__AssignParameter__Group__0__Impl1427);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:726:1: rule__AssignParameter__Group__1 : rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2 ;
    public final void rule__AssignParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:730:1: ( rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:731:2: rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__1__Impl_in_rule__AssignParameter__Group__11457);
            rule__AssignParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignParameter__Group__2_in_rule__AssignParameter__Group__11460);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:738:1: rule__AssignParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__AssignParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:742:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:743:1: ( '=' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:743:1: ( '=' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:744:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__AssignParameter__Group__1__Impl1488); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:757:1: rule__AssignParameter__Group__2 : rule__AssignParameter__Group__2__Impl ;
    public final void rule__AssignParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:761:1: ( rule__AssignParameter__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:762:2: rule__AssignParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__2__Impl_in_rule__AssignParameter__Group__21519);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:768:1: rule__AssignParameter__Group__2__Impl : ( ( rule__AssignParameter__ValueAssignment_2 ) ) ;
    public final void rule__AssignParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:772:1: ( ( ( rule__AssignParameter__ValueAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:773:1: ( ( rule__AssignParameter__ValueAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:773:1: ( ( rule__AssignParameter__ValueAssignment_2 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:774:1: ( rule__AssignParameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getValueAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:775:1: ( rule__AssignParameter__ValueAssignment_2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:775:2: rule__AssignParameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AssignParameter__ValueAssignment_2_in_rule__AssignParameter__Group__2__Impl1546);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:791:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:795:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:796:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__01582);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__01585);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:803:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:807:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:808:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:808:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:809:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl1612); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:820:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:824:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:825:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__11641);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:831:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:835:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:836:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:836:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:837:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:838:1: ( rule__ExtendedID__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:838:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl1668);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:852:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:856:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:857:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__01703);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__01706);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:864:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:868:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:869:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:869:1: ( '.' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:870:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__ExtendedID__Group_1__0__Impl1734); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:883:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:887:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:888:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__11765);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:894:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:898:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:899:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:899:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:900:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl1792); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:915:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:919:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:920:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__01825);
            rule__Real__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__01828);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:927:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:931:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:932:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:932:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:933:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:934:1: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:935:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Real__Group__0__Impl1857); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:946:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:950:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:951:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__11890);
            rule__Real__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__11893);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:958:1: rule__Real__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:962:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:963:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:963:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:964:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl1920); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:975:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:979:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:980:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__21949);
            rule__Real__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__3_in_rule__Real__Group__21952);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:987:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:991:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:992:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:992:1: ( '.' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:993:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Real__Group__2__Impl1980); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1006:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1010:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1011:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__32011);
            rule__Real__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__4_in_rule__Real__Group__32014);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1018:1: rule__Real__Group__3__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1022:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1023:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1023:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1024:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl2041); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1035:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1039:1: ( rule__Real__Group__4__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1040:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__42070);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1046:1: rule__Real__Group__4__Impl : ( ( rule__Real__Group_4__0 )? ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1050:1: ( ( ( rule__Real__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1051:1: ( ( rule__Real__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1051:1: ( ( rule__Real__Group_4__0 )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1052:1: ( rule__Real__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1053:1: ( rule__Real__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=15)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1053:2: rule__Real__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl2097);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1073:1: rule__Real__Group_4__0 : rule__Real__Group_4__0__Impl rule__Real__Group_4__1 ;
    public final void rule__Real__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1077:1: ( rule__Real__Group_4__0__Impl rule__Real__Group_4__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1078:2: rule__Real__Group_4__0__Impl rule__Real__Group_4__1
            {
            pushFollow(FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__02138);
            rule__Real__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__02141);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1085:1: rule__Real__Group_4__0__Impl : ( ( rule__Real__Alternatives_4_0 ) ) ;
    public final void rule__Real__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1089:1: ( ( ( rule__Real__Alternatives_4_0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1090:1: ( ( rule__Real__Alternatives_4_0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1090:1: ( ( rule__Real__Alternatives_4_0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1091:1: ( rule__Real__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1092:1: ( rule__Real__Alternatives_4_0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1092:2: rule__Real__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl2168);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1102:1: rule__Real__Group_4__1 : rule__Real__Group_4__1__Impl rule__Real__Group_4__2 ;
    public final void rule__Real__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1106:1: ( rule__Real__Group_4__1__Impl rule__Real__Group_4__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1107:2: rule__Real__Group_4__1__Impl rule__Real__Group_4__2
            {
            pushFollow(FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__12198);
            rule__Real__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__12201);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1114:1: rule__Real__Group_4__1__Impl : ( ( rule__Real__Alternatives_4_1 ) ) ;
    public final void rule__Real__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1118:1: ( ( ( rule__Real__Alternatives_4_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1119:1: ( ( rule__Real__Alternatives_4_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1119:1: ( ( rule__Real__Alternatives_4_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1120:1: ( rule__Real__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_1()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1121:1: ( rule__Real__Alternatives_4_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1121:2: rule__Real__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl2228);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1131:1: rule__Real__Group_4__2 : rule__Real__Group_4__2__Impl ;
    public final void rule__Real__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1135:1: ( rule__Real__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1136:2: rule__Real__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__22258);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1142:1: rule__Real__Group_4__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1146:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1147:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1147:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1148:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl2285); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1165:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1169:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1170:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__02320);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__02323);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1177:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1181:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1182:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1182:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1183:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1184:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1185:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Integer__Group__0__Impl2352); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1196:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1200:1: ( rule__Integer__Group__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1201:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__12385);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1207:1: rule__Integer__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1211:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1212:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1212:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1213:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl2412); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1229:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1233:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1234:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1234:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1235:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_12450);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1244:1: rule__Annotation__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1248:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1249:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1249:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1250:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_12481);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1259:1: rule__Annotation__ParameterAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1263:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1264:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1264:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1265:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_12512);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1274:1: rule__AssignParameter__NameAssignment_0 : ( ruleExtendedID ) ;
    public final void rule__AssignParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1278:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1279:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1279:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1280:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getNameExtendedIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__AssignParameter__NameAssignment_02543);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1289:1: rule__AssignParameter__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__AssignParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1293:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1294:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1294:1: ( ruleValue )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1295:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__AssignParameter__ValueAssignment_22574);
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1304:1: rule__ValueParameter__ValueAssignment : ( ruleValue ) ;
    public final void rule__ValueParameter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1308:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1309:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1309:1: ( ruleValue )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1310:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueParameterAccess().getValueValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ValueParameter__ValueAssignment2605);
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
        "\1\4\1\24\1\uffff\1\7\1\uffff\1\24";
    static final String DFA1_maxS =
        "\1\21\1\27\1\uffff\1\7\1\uffff\1\27";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\3\2\1\1\1\2\10\uffff\1\2",
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
            return "289:1: rule__Parameter__Alternatives : ( ( ruleAssignParameter ) | ( ruleValueParameter ) );";
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
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignParameter_in_rule__Parameter__Alternatives560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueParameter_in_rule__Parameter__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Value__Alternatives609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__Alternatives694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Real__Alternatives_4_0729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Real__Alternatives_4_0749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Alternatives_4_1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Alternatives_4_1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__0836 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__0839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Annotation__Group__0__Impl867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__1898 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__01022 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__01025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Annotation__Group_2__0__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__11086 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__11089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__21146 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__21149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl1176 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__31207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Annotation__Group_2__3__Impl1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__01274 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__01277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Annotation__Group_2_2__0__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__0__Impl_in_rule__AssignParameter__Group__01397 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__1_in_rule__AssignParameter__Group__01400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__NameAssignment_0_in_rule__AssignParameter__Group__0__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__1__Impl_in_rule__AssignParameter__Group__11457 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__2_in_rule__AssignParameter__Group__11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AssignParameter__Group__1__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__2__Impl_in_rule__AssignParameter__Group__21519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__ValueAssignment_2_in_rule__AssignParameter__Group__2__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__01582 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__01585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__11641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl1668 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__01703 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__01706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ExtendedID__Group_1__0__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__11765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__01825 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__01828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Group__0__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__11890 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__11893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__21949 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Real__Group__3_in_rule__Real__Group__21952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Real__Group__2__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__32011 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Real__Group__4_in_rule__Real__Group__32014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__42070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__02138 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__02141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__12198 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__12201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__22258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__02320 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__02323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Integer__Group__0__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__12385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_12481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__AssignParameter__NameAssignment_02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__AssignParameter__ValueAssignment_22574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ValueParameter__ValueAssignment2605 = new BitSet(new long[]{0x0000000000000002L});

}
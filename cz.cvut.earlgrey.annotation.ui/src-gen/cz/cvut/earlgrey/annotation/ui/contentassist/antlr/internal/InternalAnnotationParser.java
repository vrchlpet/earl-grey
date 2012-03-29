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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:60:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:61:1: ( ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:62:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation61);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation68); 

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:69:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:73:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:74:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:74:1: ( ( rule__Annotation__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:75:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:76:1: ( rule__Annotation__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:76:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation94);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleProperty"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:88:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:89:1: ( ruleProperty EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:90:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty121);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty128); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:97:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:101:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:102:1: ( ( rule__Property__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:102:1: ( ( rule__Property__Alternatives ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:103:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:104:1: ( rule__Property__Alternatives )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:104:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty154);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssignProperty"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:116:1: entryRuleAssignProperty : ruleAssignProperty EOF ;
    public final void entryRuleAssignProperty() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:117:1: ( ruleAssignProperty EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:118:1: ruleAssignProperty EOF
            {
             before(grammarAccess.getAssignPropertyRule()); 
            pushFollow(FOLLOW_ruleAssignProperty_in_entryRuleAssignProperty181);
            ruleAssignProperty();

            state._fsp--;

             after(grammarAccess.getAssignPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignProperty188); 

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
    // $ANTLR end "entryRuleAssignProperty"


    // $ANTLR start "ruleAssignProperty"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:125:1: ruleAssignProperty : ( ( rule__AssignProperty__Group__0 ) ) ;
    public final void ruleAssignProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:129:2: ( ( ( rule__AssignProperty__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:130:1: ( ( rule__AssignProperty__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:130:1: ( ( rule__AssignProperty__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:131:1: ( rule__AssignProperty__Group__0 )
            {
             before(grammarAccess.getAssignPropertyAccess().getGroup()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:132:1: ( rule__AssignProperty__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:132:2: rule__AssignProperty__Group__0
            {
            pushFollow(FOLLOW_rule__AssignProperty__Group__0_in_ruleAssignProperty214);
            rule__AssignProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignProperty"


    // $ANTLR start "entryRuleValueProperty"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:144:1: entryRuleValueProperty : ruleValueProperty EOF ;
    public final void entryRuleValueProperty() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:145:1: ( ruleValueProperty EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:146:1: ruleValueProperty EOF
            {
             before(grammarAccess.getValuePropertyRule()); 
            pushFollow(FOLLOW_ruleValueProperty_in_entryRuleValueProperty241);
            ruleValueProperty();

            state._fsp--;

             after(grammarAccess.getValuePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueProperty248); 

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
    // $ANTLR end "entryRuleValueProperty"


    // $ANTLR start "ruleValueProperty"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:153:1: ruleValueProperty : ( ( rule__ValueProperty__ValueAssignment ) ) ;
    public final void ruleValueProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:157:2: ( ( ( rule__ValueProperty__ValueAssignment ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:158:1: ( ( rule__ValueProperty__ValueAssignment ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:158:1: ( ( rule__ValueProperty__ValueAssignment ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:159:1: ( rule__ValueProperty__ValueAssignment )
            {
             before(grammarAccess.getValuePropertyAccess().getValueAssignment()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:160:1: ( rule__ValueProperty__ValueAssignment )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:160:2: rule__ValueProperty__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ValueProperty__ValueAssignment_in_ruleValueProperty274);
            rule__ValueProperty__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValuePropertyAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueProperty"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:172:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:173:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:174:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue301);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue308); 

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:181:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:185:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:186:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:186:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:187:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:188:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:188:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue334);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:200:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:201:1: ( ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:202:1: ruleExtendedID EOF
            {
             before(grammarAccess.getExtendedIDRule()); 
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID361);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getExtendedIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID368); 

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:209:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:213:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:214:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:214:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:215:1: ( rule__ExtendedID__Group__0 )
            {
             before(grammarAccess.getExtendedIDAccess().getGroup()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:216:1: ( rule__ExtendedID__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:216:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID394);
            rule__ExtendedID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedIDAccess().getGroup()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:232:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:233:1: ( ruleReal EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:234:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal425);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal432); 

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:241:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:245:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:246:1: ( ( rule__Real__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:246:1: ( ( rule__Real__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:247:1: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:248:1: ( rule__Real__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:248:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal458);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:260:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:261:1: ( ruleInteger EOF )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:262:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger485);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger492); 

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:269:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:273:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:274:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:274:1: ( ( rule__Integer__Group__0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:275:1: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:276:1: ( rule__Integer__Group__0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:276:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger518);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__Property__Alternatives"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:288:1: rule__Property__Alternatives : ( ( ruleAssignProperty ) | ( ruleValueProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:292:1: ( ( ruleAssignProperty ) | ( ruleValueProperty ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:293:1: ( ruleAssignProperty )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:293:1: ( ruleAssignProperty )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:294:1: ruleAssignProperty
                    {
                     before(grammarAccess.getPropertyAccess().getAssignPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAssignProperty_in_rule__Property__Alternatives554);
                    ruleAssignProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAssignPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:299:6: ( ruleValueProperty )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:299:6: ( ruleValueProperty )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:300:1: ruleValueProperty
                    {
                     before(grammarAccess.getPropertyAccess().getValuePropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleValueProperty_in_rule__Property__Alternatives571);
                    ruleValueProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getValuePropertyParserRuleCall_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:310:1: rule__Value__Alternatives : ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:314:1: ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_NATURAL) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==23) ) {
                        alt2=6;
                    }
                    else if ( (LA2_2==EOF||(LA2_2>=20 && LA2_2<=21)) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==23) ) {
                    alt2=6;
                }
                else if ( (LA2_2==EOF||(LA2_2>=20 && LA2_2<=21)) ) {
                    alt2=1;
                }
                else {
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
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:315:1: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:315:1: ( ruleInteger )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:316:1: ruleInteger
                    {
                     before(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInteger_in_rule__Value__Alternatives603);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:321:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:321:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:322:1: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives620); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:327:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:327:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:328:1: ruleExtendedID
                    {
                     before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives637);
                    ruleExtendedID();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:333:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:333:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:334:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives654); 
                     after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:339:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:339:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:340:1: RULE_NULL
                    {
                     before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives671); 
                     after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:345:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:345:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:346:1: ruleReal
                    {
                     before(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleReal_in_rule__Value__Alternatives688);
                    ruleReal();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:358:1: rule__Real__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:362:1: ( ( 'e' ) | ( 'E' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:363:1: ( 'e' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:363:1: ( 'e' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:364:1: 'e'
                    {
                     before(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Real__Alternatives_4_0723); 
                     after(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:371:6: ( 'E' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:371:6: ( 'E' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:372:1: 'E'
                    {
                     before(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Real__Alternatives_4_0743); 
                     after(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:384:1: rule__Real__Alternatives_4_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:388:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:389:1: ( '+' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:389:1: ( '+' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:390:1: '+'
                    {
                     before(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    match(input,16,FOLLOW_16_in_rule__Real__Alternatives_4_1778); 
                     after(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:397:6: ( '-' )
                    {
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:397:6: ( '-' )
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:398:1: '-'
                    {
                     before(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__Real__Alternatives_4_1798); 
                     after(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 

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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:412:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:416:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:417:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__0830);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__0833);
            rule__Annotation__Group__1();

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:424:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:428:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:429:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:429:1: ( '@' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:430:1: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Annotation__Group__0__Impl861); 
             after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:443:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:447:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:448:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__1892);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__1895);
            rule__Annotation__Group__2();

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:455:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:459:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:460:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:460:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:461:1: ( rule__Annotation__NameAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:462:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:462:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl922);
            rule__Annotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:472:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:476:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:477:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__2952);
            rule__Annotation__Group__2__Impl();

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
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:483:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:487:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:488:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:488:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:489:1: ( rule__Annotation__Group_2__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:490:1: ( rule__Annotation__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:490:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl979);
                    rule__Annotation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_2()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:506:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:510:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:511:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__01016);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__01019);
            rule__Annotation__Group_2__1();

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
    // $ANTLR end "rule__Annotation__Group_2__0"


    // $ANTLR start "rule__Annotation__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:518:1: rule__Annotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:522:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:523:1: ( '(' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:523:1: ( '(' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:524:1: '('
            {
             before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Annotation__Group_2__0__Impl1047); 
             after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:537:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:541:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:542:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__11078);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__11081);
            rule__Annotation__Group_2__2();

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
    // $ANTLR end "rule__Annotation__Group_2__1"


    // $ANTLR start "rule__Annotation__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:549:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__PropertyAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:553:1: ( ( ( rule__Annotation__PropertyAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:554:1: ( ( rule__Annotation__PropertyAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:554:1: ( ( rule__Annotation__PropertyAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:555:1: ( rule__Annotation__PropertyAssignment_2_1 )
            {
             before(grammarAccess.getAnnotationAccess().getPropertyAssignment_2_1()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:556:1: ( rule__Annotation__PropertyAssignment_2_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:556:2: rule__Annotation__PropertyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__PropertyAssignment_2_1_in_rule__Annotation__Group_2__1__Impl1108);
            rule__Annotation__PropertyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getPropertyAssignment_2_1()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:566:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:570:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:571:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__21138);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__21141);
            rule__Annotation__Group_2__3();

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
    // $ANTLR end "rule__Annotation__Group_2__2"


    // $ANTLR start "rule__Annotation__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:578:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:582:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:583:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:583:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:584:1: ( rule__Annotation__Group_2_2__0 )*
            {
             before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:585:1: ( rule__Annotation__Group_2_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:585:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl1168);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAnnotationAccess().getGroup_2_2()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:595:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:599:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:600:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__31199);
            rule__Annotation__Group_2__3__Impl();

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
    // $ANTLR end "rule__Annotation__Group_2__3"


    // $ANTLR start "rule__Annotation__Group_2__3__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:606:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:610:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:611:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:611:1: ( ')' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:612:1: ')'
            {
             before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            match(input,20,FOLLOW_20_in_rule__Annotation__Group_2__3__Impl1227); 
             after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:633:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:637:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:638:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__01266);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__01269);
            rule__Annotation__Group_2_2__1();

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
    // $ANTLR end "rule__Annotation__Group_2_2__0"


    // $ANTLR start "rule__Annotation__Group_2_2__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:645:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:649:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:650:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:650:1: ( ',' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:651:1: ','
            {
             before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Annotation__Group_2_2__0__Impl1297); 
             after(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:664:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:668:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:669:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__11328);
            rule__Annotation__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group_2_2__1"


    // $ANTLR start "rule__Annotation__Group_2_2__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:675:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__PropertyAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:679:1: ( ( ( rule__Annotation__PropertyAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:680:1: ( ( rule__Annotation__PropertyAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:680:1: ( ( rule__Annotation__PropertyAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:681:1: ( rule__Annotation__PropertyAssignment_2_2_1 )
            {
             before(grammarAccess.getAnnotationAccess().getPropertyAssignment_2_2_1()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:682:1: ( rule__Annotation__PropertyAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:682:2: rule__Annotation__PropertyAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__PropertyAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl1355);
            rule__Annotation__PropertyAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getPropertyAssignment_2_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssignProperty__Group__0"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:696:1: rule__AssignProperty__Group__0 : rule__AssignProperty__Group__0__Impl rule__AssignProperty__Group__1 ;
    public final void rule__AssignProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:700:1: ( rule__AssignProperty__Group__0__Impl rule__AssignProperty__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:701:2: rule__AssignProperty__Group__0__Impl rule__AssignProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AssignProperty__Group__0__Impl_in_rule__AssignProperty__Group__01389);
            rule__AssignProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssignProperty__Group__1_in_rule__AssignProperty__Group__01392);
            rule__AssignProperty__Group__1();

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
    // $ANTLR end "rule__AssignProperty__Group__0"


    // $ANTLR start "rule__AssignProperty__Group__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:708:1: rule__AssignProperty__Group__0__Impl : ( ( rule__AssignProperty__NameAssignment_0 ) ) ;
    public final void rule__AssignProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:712:1: ( ( ( rule__AssignProperty__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:713:1: ( ( rule__AssignProperty__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:713:1: ( ( rule__AssignProperty__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:714:1: ( rule__AssignProperty__NameAssignment_0 )
            {
             before(grammarAccess.getAssignPropertyAccess().getNameAssignment_0()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:715:1: ( rule__AssignProperty__NameAssignment_0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:715:2: rule__AssignProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignProperty__NameAssignment_0_in_rule__AssignProperty__Group__0__Impl1419);
            rule__AssignProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignProperty__Group__0__Impl"


    // $ANTLR start "rule__AssignProperty__Group__1"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:725:1: rule__AssignProperty__Group__1 : rule__AssignProperty__Group__1__Impl rule__AssignProperty__Group__2 ;
    public final void rule__AssignProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:729:1: ( rule__AssignProperty__Group__1__Impl rule__AssignProperty__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:730:2: rule__AssignProperty__Group__1__Impl rule__AssignProperty__Group__2
            {
            pushFollow(FOLLOW_rule__AssignProperty__Group__1__Impl_in_rule__AssignProperty__Group__11449);
            rule__AssignProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssignProperty__Group__2_in_rule__AssignProperty__Group__11452);
            rule__AssignProperty__Group__2();

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
    // $ANTLR end "rule__AssignProperty__Group__1"


    // $ANTLR start "rule__AssignProperty__Group__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:737:1: rule__AssignProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__AssignProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:741:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:742:1: ( '=' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:742:1: ( '=' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:743:1: '='
            {
             before(grammarAccess.getAssignPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__AssignProperty__Group__1__Impl1480); 
             after(grammarAccess.getAssignPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignProperty__Group__1__Impl"


    // $ANTLR start "rule__AssignProperty__Group__2"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:756:1: rule__AssignProperty__Group__2 : rule__AssignProperty__Group__2__Impl ;
    public final void rule__AssignProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:760:1: ( rule__AssignProperty__Group__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:761:2: rule__AssignProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignProperty__Group__2__Impl_in_rule__AssignProperty__Group__21511);
            rule__AssignProperty__Group__2__Impl();

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
    // $ANTLR end "rule__AssignProperty__Group__2"


    // $ANTLR start "rule__AssignProperty__Group__2__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:767:1: rule__AssignProperty__Group__2__Impl : ( ( rule__AssignProperty__ValueAssignment_2 ) ) ;
    public final void rule__AssignProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:771:1: ( ( ( rule__AssignProperty__ValueAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:772:1: ( ( rule__AssignProperty__ValueAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:772:1: ( ( rule__AssignProperty__ValueAssignment_2 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:773:1: ( rule__AssignProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignPropertyAccess().getValueAssignment_2()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:774:1: ( rule__AssignProperty__ValueAssignment_2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:774:2: rule__AssignProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AssignProperty__ValueAssignment_2_in_rule__AssignProperty__Group__2__Impl1538);
            rule__AssignProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignProperty__Group__2__Impl"


    // $ANTLR start "rule__ExtendedID__Group__0"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:790:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:794:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:795:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__01574);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__01577);
            rule__ExtendedID__Group__1();

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
    // $ANTLR end "rule__ExtendedID__Group__0"


    // $ANTLR start "rule__ExtendedID__Group__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:802:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:806:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:807:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:807:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:808:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl1604); 
             after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:819:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:823:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:824:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__11633);
            rule__ExtendedID__Group__1__Impl();

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
    // $ANTLR end "rule__ExtendedID__Group__1"


    // $ANTLR start "rule__ExtendedID__Group__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:830:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:834:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:835:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:835:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:836:1: ( rule__ExtendedID__Group_1__0 )*
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:837:1: ( rule__ExtendedID__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:837:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl1660);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getExtendedIDAccess().getGroup_1()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:851:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:855:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:856:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__01695);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__01698);
            rule__ExtendedID__Group_1__1();

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
    // $ANTLR end "rule__ExtendedID__Group_1__0"


    // $ANTLR start "rule__ExtendedID__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:863:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:867:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:868:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:868:1: ( '.' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:869:1: '.'
            {
             before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ExtendedID__Group_1__0__Impl1726); 
             after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:882:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:886:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:887:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__11757);
            rule__ExtendedID__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExtendedID__Group_1__1"


    // $ANTLR start "rule__ExtendedID__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:893:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:897:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:898:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:898:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:899:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl1784); 
             after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:914:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:918:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:919:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__01817);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__01820);
            rule__Real__Group__1();

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
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:926:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:930:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:931:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:931:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:932:1: ( '-' )?
            {
             before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:933:1: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:934:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Real__Group__0__Impl1849); 

                    }
                    break;

            }

             after(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:945:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:949:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:950:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__11882);
            rule__Real__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__11885);
            rule__Real__Group__2();

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
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:957:1: rule__Real__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:961:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:962:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:962:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:963:1: RULE_NATURAL
            {
             before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl1912); 
             after(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:974:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:978:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:979:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__21941);
            rule__Real__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group__3_in_rule__Real__Group__21944);
            rule__Real__Group__3();

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
    // $ANTLR end "rule__Real__Group__2"


    // $ANTLR start "rule__Real__Group__2__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:986:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:990:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:991:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:991:1: ( '.' )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:992:1: '.'
            {
             before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Real__Group__2__Impl1972); 
             after(grammarAccess.getRealAccess().getFullStopKeyword_2()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1005:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1009:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1010:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__32003);
            rule__Real__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group__4_in_rule__Real__Group__32006);
            rule__Real__Group__4();

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
    // $ANTLR end "rule__Real__Group__3"


    // $ANTLR start "rule__Real__Group__3__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1017:1: rule__Real__Group__3__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1021:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1022:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1022:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1023:1: RULE_NATURAL
            {
             before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl2033); 
             after(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1034:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1038:1: ( rule__Real__Group__4__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1039:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__42062);
            rule__Real__Group__4__Impl();

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
    // $ANTLR end "rule__Real__Group__4"


    // $ANTLR start "rule__Real__Group__4__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1045:1: rule__Real__Group__4__Impl : ( ( rule__Real__Group_4__0 )? ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1049:1: ( ( ( rule__Real__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1050:1: ( ( rule__Real__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1050:1: ( ( rule__Real__Group_4__0 )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1051:1: ( rule__Real__Group_4__0 )?
            {
             before(grammarAccess.getRealAccess().getGroup_4()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1052:1: ( rule__Real__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=15)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1052:2: rule__Real__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl2089);
                    rule__Real__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRealAccess().getGroup_4()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1072:1: rule__Real__Group_4__0 : rule__Real__Group_4__0__Impl rule__Real__Group_4__1 ;
    public final void rule__Real__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1076:1: ( rule__Real__Group_4__0__Impl rule__Real__Group_4__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1077:2: rule__Real__Group_4__0__Impl rule__Real__Group_4__1
            {
            pushFollow(FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__02130);
            rule__Real__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__02133);
            rule__Real__Group_4__1();

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
    // $ANTLR end "rule__Real__Group_4__0"


    // $ANTLR start "rule__Real__Group_4__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1084:1: rule__Real__Group_4__0__Impl : ( ( rule__Real__Alternatives_4_0 ) ) ;
    public final void rule__Real__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1088:1: ( ( ( rule__Real__Alternatives_4_0 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1089:1: ( ( rule__Real__Alternatives_4_0 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1089:1: ( ( rule__Real__Alternatives_4_0 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1090:1: ( rule__Real__Alternatives_4_0 )
            {
             before(grammarAccess.getRealAccess().getAlternatives_4_0()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1091:1: ( rule__Real__Alternatives_4_0 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1091:2: rule__Real__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl2160);
            rule__Real__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getAlternatives_4_0()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1101:1: rule__Real__Group_4__1 : rule__Real__Group_4__1__Impl rule__Real__Group_4__2 ;
    public final void rule__Real__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1105:1: ( rule__Real__Group_4__1__Impl rule__Real__Group_4__2 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1106:2: rule__Real__Group_4__1__Impl rule__Real__Group_4__2
            {
            pushFollow(FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__12190);
            rule__Real__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__12193);
            rule__Real__Group_4__2();

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
    // $ANTLR end "rule__Real__Group_4__1"


    // $ANTLR start "rule__Real__Group_4__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1113:1: rule__Real__Group_4__1__Impl : ( ( rule__Real__Alternatives_4_1 ) ) ;
    public final void rule__Real__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1117:1: ( ( ( rule__Real__Alternatives_4_1 ) ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1118:1: ( ( rule__Real__Alternatives_4_1 ) )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1118:1: ( ( rule__Real__Alternatives_4_1 ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1119:1: ( rule__Real__Alternatives_4_1 )
            {
             before(grammarAccess.getRealAccess().getAlternatives_4_1()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1120:1: ( rule__Real__Alternatives_4_1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1120:2: rule__Real__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl2220);
            rule__Real__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getAlternatives_4_1()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1130:1: rule__Real__Group_4__2 : rule__Real__Group_4__2__Impl ;
    public final void rule__Real__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1134:1: ( rule__Real__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1135:2: rule__Real__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__22250);
            rule__Real__Group_4__2__Impl();

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
    // $ANTLR end "rule__Real__Group_4__2"


    // $ANTLR start "rule__Real__Group_4__2__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1141:1: rule__Real__Group_4__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1145:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1146:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1146:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1147:1: RULE_NATURAL
            {
             before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl2277); 
             after(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1164:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1168:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1169:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__02312);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__02315);
            rule__Integer__Group__1();

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
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1176:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1180:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1181:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1181:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1182:1: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1183:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1184:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Integer__Group__0__Impl2344); 

                    }
                    break;

            }

             after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1195:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1199:1: ( rule__Integer__Group__1__Impl )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1200:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__12377);
            rule__Integer__Group__1__Impl();

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
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1206:1: rule__Integer__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1210:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1211:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1211:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1212:1: RULE_NATURAL
            {
             before(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl2404); 
             after(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1228:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1232:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1233:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1233:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1234:1: ruleExtendedID
            {
             before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_12442);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Annotation__PropertyAssignment_2_1"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1243:1: rule__Annotation__PropertyAssignment_2_1 : ( ruleProperty ) ;
    public final void rule__Annotation__PropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1247:1: ( ( ruleProperty ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1248:1: ( ruleProperty )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1248:1: ( ruleProperty )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1249:1: ruleProperty
            {
             before(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Annotation__PropertyAssignment_2_12473);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__PropertyAssignment_2_1"


    // $ANTLR start "rule__Annotation__PropertyAssignment_2_2_1"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1258:1: rule__Annotation__PropertyAssignment_2_2_1 : ( ruleProperty ) ;
    public final void rule__Annotation__PropertyAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1262:1: ( ( ruleProperty ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1263:1: ( ruleProperty )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1263:1: ( ruleProperty )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1264:1: ruleProperty
            {
             before(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Annotation__PropertyAssignment_2_2_12504);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__PropertyAssignment_2_2_1"


    // $ANTLR start "rule__AssignProperty__NameAssignment_0"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1273:1: rule__AssignProperty__NameAssignment_0 : ( ruleExtendedID ) ;
    public final void rule__AssignProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1277:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1278:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1278:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1279:1: ruleExtendedID
            {
             before(grammarAccess.getAssignPropertyAccess().getNameExtendedIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExtendedID_in_rule__AssignProperty__NameAssignment_02535);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getAssignPropertyAccess().getNameExtendedIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignProperty__NameAssignment_0"


    // $ANTLR start "rule__AssignProperty__ValueAssignment_2"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1288:1: rule__AssignProperty__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__AssignProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1292:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1293:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1293:1: ( ruleValue )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1294:1: ruleValue
            {
             before(grammarAccess.getAssignPropertyAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__AssignProperty__ValueAssignment_22566);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssignPropertyAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignProperty__ValueAssignment_2"


    // $ANTLR start "rule__ValueProperty__ValueAssignment"
    // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1303:1: rule__ValueProperty__ValueAssignment : ( ruleValue ) ;
    public final void rule__ValueProperty__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1307:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1308:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1308:1: ( ruleValue )
            // ../cz.cvut.earlgrey.annotation.ui/src-gen/cz/cvut/earlgrey/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1309:1: ruleValue
            {
             before(grammarAccess.getValuePropertyAccess().getValueValueParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__ValueProperty__ValueAssignment2597);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValuePropertyAccess().getValueValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueProperty__ValueAssignment"

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
            return "288:1: rule__Property__Alternatives : ( ( ruleAssignProperty ) | ( ruleValueProperty ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignProperty_in_entryRuleAssignProperty181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignProperty188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignProperty__Group__0_in_ruleAssignProperty214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_entryRuleValueProperty241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueProperty248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueProperty__ValueAssignment_in_ruleValueProperty274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignProperty_in_rule__Property__Alternatives554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_rule__Property__Alternatives571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Value__Alternatives603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Real__Alternatives_4_0723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Real__Alternatives_4_0743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Alternatives_4_1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Alternatives_4_1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__0830 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__0833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Annotation__Group__0__Impl861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__1892 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__01016 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__01019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Annotation__Group_2__0__Impl1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__11078 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__11081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__PropertyAssignment_2_1_in_rule__Annotation__Group_2__1__Impl1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__21138 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__21141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl1168 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__31199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Annotation__Group_2__3__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__01266 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__01269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Annotation__Group_2_2__0__Impl1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__PropertyAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignProperty__Group__0__Impl_in_rule__AssignProperty__Group__01389 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AssignProperty__Group__1_in_rule__AssignProperty__Group__01392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignProperty__NameAssignment_0_in_rule__AssignProperty__Group__0__Impl1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignProperty__Group__1__Impl_in_rule__AssignProperty__Group__11449 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_rule__AssignProperty__Group__2_in_rule__AssignProperty__Group__11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AssignProperty__Group__1__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignProperty__Group__2__Impl_in_rule__AssignProperty__Group__21511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignProperty__ValueAssignment_2_in_rule__AssignProperty__Group__2__Impl1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__01574 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__01577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl1660 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__01695 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__01698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ExtendedID__Group_1__0__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__01817 = new BitSet(new long[]{0x00000000000201F0L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__01820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Group__0__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__11882 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__11885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__21941 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Real__Group__3_in_rule__Real__Group__21944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Real__Group__2__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__32003 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Real__Group__4_in_rule__Real__Group__32006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__42062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__02130 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__02133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__12190 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__12193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__22250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__02312 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__02315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Integer__Group__0__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__12377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_12442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Annotation__PropertyAssignment_2_12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Annotation__PropertyAssignment_2_2_12504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__AssignProperty__NameAssignment_02535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__AssignProperty__ValueAssignment_22566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ValueProperty__ValueAssignment2597 = new BitSet(new long[]{0x0000000000000002L});

}
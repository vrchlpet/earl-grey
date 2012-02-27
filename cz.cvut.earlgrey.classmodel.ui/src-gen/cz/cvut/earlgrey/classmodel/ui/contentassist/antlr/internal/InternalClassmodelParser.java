package cz.cvut.earlgrey.classmodel.ui.contentassist.antlr.internal; 

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
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalClassmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NATURAL", "RULE_NULL", "RULE_BOOLEAN", "RULE_STRING", "RULE_ID", "RULE_CONSTRAINT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'e'", "'E'", "'+'", "'-'", "'association'", "'depency'", "'generalization'", "'realization'", "'aggregation'", "'composition'", "'#'", "'~'", "'import'", "'datatype'", "'package'", "'end'", "'class'", "'isA'", "','", "'enum'", "'='", "'..'", "'('", "')'", "':'", "'['", "']'", "'@'", "'.'", "'navigable'", "'static'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=4;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_CONSTRAINT=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_NULL=5;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalClassmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClassmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClassmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g"; }


     
     	private ClassmodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ClassmodelGrammarAccess grammarAccess) {
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:62:1: ( ruleModel EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:63:1: ruleModel EOF
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:77:1: ( rule__Model__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:77:2: rule__Model__Group__0
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:90:1: ( ruleImport EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:91:1: ruleImport EOF
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:105:1: ( rule__Import__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:105:2: rule__Import__Group__0
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


    // $ANTLR start "entryRuleElement"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:117:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:118:1: ( ruleElement EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:119:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement187);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement194); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:126:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:130:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:131:1: ( ( rule__Element__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:131:1: ( ( rule__Element__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:132:1: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:133:1: ( rule__Element__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:133:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement220);
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


    // $ANTLR start "entryRuleDatatype"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:145:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:146:1: ( ruleDatatype EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:147:1: ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype247);
            ruleDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:154:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:158:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:159:1: ( ( rule__Datatype__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:159:1: ( ( rule__Datatype__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:160:1: ( rule__Datatype__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:161:1: ( rule__Datatype__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:161:2: rule__Datatype__Group__0
            {
            pushFollow(FOLLOW_rule__Datatype__Group__0_in_ruleDatatype280);
            rule__Datatype__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRulePackage"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:173:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:174:1: ( rulePackage EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:175:1: rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage307);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage314); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:182:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:186:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:187:1: ( ( rule__Package__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:187:1: ( ( rule__Package__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:188:1: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:189:1: ( rule__Package__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:189:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage340);
            rule__Package__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleClassifier"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:201:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:202:1: ( ruleClassifier EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:203:1: ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier367);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:210:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:214:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:215:1: ( ( rule__Classifier__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:215:1: ( ( rule__Classifier__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:216:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:217:1: ( rule__Classifier__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:217:2: rule__Classifier__Group__0
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0_in_ruleClassifier400);
            rule__Classifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleGeneralization"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:229:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:230:1: ( ruleGeneralization EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:231:1: ruleGeneralization EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneralization_in_entryRuleGeneralization427);
            ruleGeneralization();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralization434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:238:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:242:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:243:1: ( ( rule__Generalization__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:243:1: ( ( rule__Generalization__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:244:1: ( rule__Generalization__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:245:1: ( rule__Generalization__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:245:2: rule__Generalization__Group__0
            {
            pushFollow(FOLLOW_rule__Generalization__Group__0_in_ruleGeneralization460);
            rule__Generalization__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleType"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:257:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:258:1: ( ruleType EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:259:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType487);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:266:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:270:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:271:1: ( ( rule__Type__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:271:1: ( ( rule__Type__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:272:1: ( rule__Type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:273:1: ( rule__Type__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:273:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType520);
            rule__Type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFeature"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:285:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:286:1: ( ruleFeature EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:287:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature547);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:294:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:298:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:299:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:299:1: ( ( rule__Feature__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:300:1: ( rule__Feature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:301:1: ( rule__Feature__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:301:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature580);
            rule__Feature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEnumeration"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:313:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:314:1: ( ruleEnumeration EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:315:1: ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration607);
            ruleEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:322:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:326:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:327:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:327:1: ( ( rule__Enumeration__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:328:1: ( rule__Enumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:329:1: ( rule__Enumeration__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:329:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration640);
            rule__Enumeration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerator"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:341:1: entryRuleEnumerator : ruleEnumerator EOF ;
    public final void entryRuleEnumerator() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:342:1: ( ruleEnumerator EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:343:1: ruleEnumerator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerator_in_entryRuleEnumerator667);
            ruleEnumerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerator674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumerator"


    // $ANTLR start "ruleEnumerator"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:350:1: ruleEnumerator : ( ( rule__Enumerator__Group__0 ) ) ;
    public final void ruleEnumerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:354:2: ( ( ( rule__Enumerator__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:355:1: ( ( rule__Enumerator__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:355:1: ( ( rule__Enumerator__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:356:1: ( rule__Enumerator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:357:1: ( rule__Enumerator__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:357:2: rule__Enumerator__Group__0
            {
            pushFollow(FOLLOW_rule__Enumerator__Group__0_in_ruleEnumerator700);
            rule__Enumerator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerator"


    // $ANTLR start "entryRuleRelationship"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:369:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:370:1: ( ruleRelationship EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:371:1: ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship727);
            ruleRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:378:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:382:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:383:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:383:1: ( ( rule__Relationship__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:384:1: ( rule__Relationship__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:385:1: ( rule__Relationship__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:385:2: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0_in_ruleRelationship760);
            rule__Relationship__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleMultiplicity"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:397:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:398:1: ( ruleMultiplicity EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:399:1: ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity787);
            ruleMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:406:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:410:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:411:1: ( ( rule__Multiplicity__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:411:1: ( ( rule__Multiplicity__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:412:1: ( rule__Multiplicity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:413:1: ( rule__Multiplicity__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:413:2: rule__Multiplicity__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__0_in_ruleMultiplicity820);
            rule__Multiplicity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleMultiplicityValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:425:1: entryRuleMultiplicityValue : ruleMultiplicityValue EOF ;
    public final void entryRuleMultiplicityValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:426:1: ( ruleMultiplicityValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:427:1: ruleMultiplicityValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue847);
            ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityValue854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplicityValue"


    // $ANTLR start "ruleMultiplicityValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:434:1: ruleMultiplicityValue : ( ( rule__MultiplicityValue__Alternatives ) ) ;
    public final void ruleMultiplicityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:438:2: ( ( ( rule__MultiplicityValue__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:439:1: ( ( rule__MultiplicityValue__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:439:1: ( ( rule__MultiplicityValue__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:440:1: ( rule__MultiplicityValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:441:1: ( rule__MultiplicityValue__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:441:2: rule__MultiplicityValue__Alternatives
            {
            pushFollow(FOLLOW_rule__MultiplicityValue__Alternatives_in_ruleMultiplicityValue880);
            rule__MultiplicityValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicityValue"


    // $ANTLR start "entryRuleConstant"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:453:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:454:1: ( ruleConstant EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:455:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant907);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:462:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:466:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:467:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:467:1: ( ( rule__Constant__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:468:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:469:1: ( rule__Constant__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:469:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant940);
            rule__Constant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleOperation"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:481:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:482:1: ( ruleOperation EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:483:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation967);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:490:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:494:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:495:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:495:1: ( ( rule__Operation__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:496:1: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:497:1: ( rule__Operation__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:497:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation1000);
            rule__Operation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:509:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:510:1: ( ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:511:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1027);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1034); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:518:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:522:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:523:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:523:1: ( ( rule__Parameter__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:524:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:525:1: ( rule__Parameter__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:525:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1060);
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


    // $ANTLR start "entryRuleAttribute"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:537:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:538:1: ( ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:539:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1087);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:546:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:550:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:551:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:551:1: ( ( rule__Attribute__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:552:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:553:1: ( rule__Attribute__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:553:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1120);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:565:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:566:1: ( ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:567:1: ruleReference EOF
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:574:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:578:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:579:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:579:1: ( ( rule__Reference__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:580:1: ( rule__Reference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:581:1: ( rule__Reference__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:581:2: rule__Reference__Group__0
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:593:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:594:1: ( ruleArray EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:595:1: ruleArray EOF
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:602:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:606:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:607:1: ( ( rule__Array__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:607:1: ( ( rule__Array__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:608:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:609:1: ( rule__Array__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:609:2: rule__Array__Group__0
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


    // $ANTLR start "entryRuleImplicitValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:621:1: entryRuleImplicitValue : ruleImplicitValue EOF ;
    public final void entryRuleImplicitValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:622:1: ( ruleImplicitValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:623:1: ruleImplicitValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicitValueRule()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue1267);
            ruleImplicitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicitValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitValue1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImplicitValue"


    // $ANTLR start "ruleImplicitValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:630:1: ruleImplicitValue : ( ( rule__ImplicitValue__Alternatives ) ) ;
    public final void ruleImplicitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:634:2: ( ( ( rule__ImplicitValue__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:635:1: ( ( rule__ImplicitValue__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:635:1: ( ( rule__ImplicitValue__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:636:1: ( rule__ImplicitValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicitValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:637:1: ( rule__ImplicitValue__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:637:2: rule__ImplicitValue__Alternatives
            {
            pushFollow(FOLLOW_rule__ImplicitValue__Alternatives_in_ruleImplicitValue1300);
            rule__ImplicitValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicitValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplicitValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:649:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:650:1: ( ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:651:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1327);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1334); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:658:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:662:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:663:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:663:1: ( ( rule__Annotation__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:664:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:665:1: ( rule__Annotation__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:665:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1360);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:681:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:682:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:683:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1391);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1398); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:690:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:694:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:695:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:695:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:696:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:697:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:697:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1424);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:709:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:710:1: ( ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:711:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID1451);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID1458); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:718:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:722:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:723:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:723:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:724:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:725:1: ( rule__ExtendedID__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:725:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1484);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:737:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:738:1: ( ruleReal EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:739:1: ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal1511);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal1518); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:746:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:750:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:751:1: ( ( rule__Real__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:751:1: ( ( rule__Real__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:752:1: ( rule__Real__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:753:1: ( rule__Real__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:753:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal1544);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:765:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:766:1: ( ruleInteger EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:767:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger1571);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger1578); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:774:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:778:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:779:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:779:1: ( ( rule__Integer__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:780:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:781:1: ( rule__Integer__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:781:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger1604);
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


    // $ANTLR start "ruleRelationshipType"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:794:1: ruleRelationshipType : ( ( rule__RelationshipType__Alternatives ) ) ;
    public final void ruleRelationshipType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:798:1: ( ( ( rule__RelationshipType__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:799:1: ( ( rule__RelationshipType__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:799:1: ( ( rule__RelationshipType__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:800:1: ( rule__RelationshipType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:801:1: ( rule__RelationshipType__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:801:2: rule__RelationshipType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationshipType__Alternatives_in_ruleRelationshipType1641);
            rule__RelationshipType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "ruleVisibility"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:813:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:817:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:818:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:818:1: ( ( rule__Visibility__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:819:1: ( rule__Visibility__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:820:1: ( rule__Visibility__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:820:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1677);
            rule__Visibility__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisibilityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__Element__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:831:1: rule__Element__Alternatives : ( ( ruleRelationship ) | ( ruleClassifier ) | ( rulePackage ) | ( ruleDatatype ) | ( ruleEnumeration ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:835:1: ( ( ruleRelationship ) | ( ruleClassifier ) | ( rulePackage ) | ( ruleDatatype ) | ( ruleEnumeration ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:836:1: ( ruleRelationship )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:836:1: ( ruleRelationship )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:837:1: ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getRelationshipParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRelationship_in_rule__Element__Alternatives1712);
                    ruleRelationship();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getRelationshipParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:842:6: ( ruleClassifier )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:842:6: ( ruleClassifier )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:843:1: ruleClassifier
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getClassifierParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleClassifier_in_rule__Element__Alternatives1729);
                    ruleClassifier();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getClassifierParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:848:6: ( rulePackage )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:848:6: ( rulePackage )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:849:1: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getPackageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_rulePackage_in_rule__Element__Alternatives1746);
                    rulePackage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getPackageParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:854:6: ( ruleDatatype )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:854:6: ( ruleDatatype )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:855:1: ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getDatatypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_rule__Element__Alternatives1763);
                    ruleDatatype();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getDatatypeParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:860:6: ( ruleEnumeration )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:860:6: ( ruleEnumeration )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:861:1: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Element__Alternatives1780);
                    ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4()); 
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


    // $ANTLR start "rule__Feature__Alternatives_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:871:1: rule__Feature__Alternatives_0 : ( ( ruleAttribute ) | ( ruleOperation ) | ( ruleConstant ) );
    public final void rule__Feature__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:875:1: ( ( ruleAttribute ) | ( ruleOperation ) | ( ruleConstant ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:876:1: ( ruleAttribute )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:876:1: ( ruleAttribute )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:877:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Feature__Alternatives_01812);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:882:6: ( ruleOperation )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:882:6: ( ruleOperation )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:883:1: ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getOperationParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleOperation_in_rule__Feature__Alternatives_01829);
                    ruleOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getOperationParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:888:6: ( ruleConstant )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:888:6: ( ruleConstant )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:889:1: ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getConstantParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleConstant_in_rule__Feature__Alternatives_01846);
                    ruleConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getConstantParserRuleCall_0_2()); 
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
    // $ANTLR end "rule__Feature__Alternatives_0"


    // $ANTLR start "rule__MultiplicityValue__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:899:1: rule__MultiplicityValue__Alternatives : ( ( RULE_NATURAL ) | ( '*' ) );
    public final void rule__MultiplicityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:903:1: ( ( RULE_NATURAL ) | ( '*' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NATURAL) ) {
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:904:1: ( RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:904:1: ( RULE_NATURAL )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:905:1: RULE_NATURAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityValueAccess().getNATURALTerminalRuleCall_0()); 
                    }
                    match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__MultiplicityValue__Alternatives1878); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityValueAccess().getNATURALTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:910:6: ( '*' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:910:6: ( '*' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:911:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityValueAccess().getAsteriskKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__MultiplicityValue__Alternatives1896); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityValueAccess().getAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__MultiplicityValue__Alternatives"


    // $ANTLR start "rule__ImplicitValue__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:923:1: rule__ImplicitValue__Alternatives : ( ( RULE_NULL ) | ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleReal ) | ( RULE_ID ) );
    public final void rule__ImplicitValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:927:1: ( ( RULE_NULL ) | ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleReal ) | ( RULE_ID ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_NULL:
                {
                alt4=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==RULE_NATURAL) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==43) ) {
                        alt4=5;
                    }
                    else if ( (LA4_5==EOF||(LA4_5>=RULE_ID && LA4_5<=RULE_CONSTRAINT)||(LA4_5>=17 && LA4_5<=18)||(LA4_5>=25 && LA4_5<=26)||LA4_5==30||LA4_5==33||LA4_5==38||LA4_5==45) ) {
                        alt4=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==43) ) {
                    alt4=5;
                }
                else if ( (LA4_5==EOF||(LA4_5>=RULE_ID && LA4_5<=RULE_CONSTRAINT)||(LA4_5>=17 && LA4_5<=18)||(LA4_5>=25 && LA4_5<=26)||LA4_5==30||LA4_5==33||LA4_5==38||LA4_5==45) ) {
                    alt4=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt4=6;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:928:1: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:928:1: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:929:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getNULLTerminalRuleCall_0()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__ImplicitValue__Alternatives1930); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getNULLTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:934:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:934:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:935:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getBOOLEANTerminalRuleCall_1()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ImplicitValue__Alternatives1947); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getBOOLEANTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:940:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:940:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:941:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImplicitValue__Alternatives1964); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:946:6: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:946:6: ( ruleInteger )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:947:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getIntegerParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__ImplicitValue__Alternatives1981);
                    ruleInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getIntegerParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:952:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:952:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:953:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getRealParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__ImplicitValue__Alternatives1998);
                    ruleReal();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getRealParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:958:6: ( RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:958:6: ( RULE_ID )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:959:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getIDTerminalRuleCall_5()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImplicitValue__Alternatives2015); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getIDTerminalRuleCall_5()); 
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
    // $ANTLR end "rule__ImplicitValue__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:969:1: rule__Value__Alternatives : ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:973:1: ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_NATURAL) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==EOF) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==43) ) {
                        alt5=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF) ) {
                    alt5=1;
                }
                else if ( (LA5_2==43) ) {
                    alt5=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt5=4;
                }
                break;
            case RULE_NULL:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:974:1: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:974:1: ( ruleInteger )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:975:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__Value__Alternatives2047);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:980:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:980:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:981:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives2064); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:986:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:986:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:987:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives2081);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:992:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:992:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:993:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives2098); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:998:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:998:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:999:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives2115); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1004:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1004:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1005:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__Value__Alternatives2132);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1015:1: rule__Real__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1019:1: ( ( 'e' ) | ( 'E' ) )
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1020:1: ( 'e' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1020:1: ( 'e' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1021:1: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Real__Alternatives_4_02165); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1028:6: ( 'E' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1028:6: ( 'E' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1029:1: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Real__Alternatives_4_02185); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1041:1: rule__Real__Alternatives_4_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1045:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1046:1: ( '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1046:1: ( '+' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1047:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Real__Alternatives_4_12220); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1054:6: ( '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1054:6: ( '-' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1055:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Real__Alternatives_4_12240); if (state.failed) return ;
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


    // $ANTLR start "rule__RelationshipType__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1067:1: rule__RelationshipType__Alternatives : ( ( ( 'association' ) ) | ( ( 'depency' ) ) | ( ( 'generalization' ) ) | ( ( 'realization' ) ) | ( ( 'aggregation' ) ) | ( ( 'composition' ) ) );
    public final void rule__RelationshipType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1071:1: ( ( ( 'association' ) ) | ( ( 'depency' ) ) | ( ( 'generalization' ) ) | ( ( 'realization' ) ) | ( ( 'aggregation' ) ) | ( ( 'composition' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1072:1: ( ( 'association' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1072:1: ( ( 'association' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1073:1: ( 'association' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1074:1: ( 'association' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1074:3: 'association'
                    {
                    match(input,19,FOLLOW_19_in_rule__RelationshipType__Alternatives2275); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1079:6: ( ( 'depency' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1079:6: ( ( 'depency' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1080:1: ( 'depency' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1081:1: ( 'depency' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1081:3: 'depency'
                    {
                    match(input,20,FOLLOW_20_in_rule__RelationshipType__Alternatives2296); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1086:6: ( ( 'generalization' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1086:6: ( ( 'generalization' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1087:1: ( 'generalization' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1088:1: ( 'generalization' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1088:3: 'generalization'
                    {
                    match(input,21,FOLLOW_21_in_rule__RelationshipType__Alternatives2317); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1093:6: ( ( 'realization' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1093:6: ( ( 'realization' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1094:1: ( 'realization' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1095:1: ( 'realization' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1095:3: 'realization'
                    {
                    match(input,22,FOLLOW_22_in_rule__RelationshipType__Alternatives2338); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1100:6: ( ( 'aggregation' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1100:6: ( ( 'aggregation' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1101:1: ( 'aggregation' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1102:1: ( 'aggregation' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1102:3: 'aggregation'
                    {
                    match(input,23,FOLLOW_23_in_rule__RelationshipType__Alternatives2359); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1107:6: ( ( 'composition' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1107:6: ( ( 'composition' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1108:1: ( 'composition' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1109:1: ( 'composition' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1109:3: 'composition'
                    {
                    match(input,24,FOLLOW_24_in_rule__RelationshipType__Alternatives2380); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__RelationshipType__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1119:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1123:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1124:1: ( ( '+' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1124:1: ( ( '+' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1125:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1126:1: ( '+' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1126:3: '+'
                    {
                    match(input,17,FOLLOW_17_in_rule__Visibility__Alternatives2416); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1131:6: ( ( '-' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1131:6: ( ( '-' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1132:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1133:1: ( '-' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1133:3: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__Visibility__Alternatives2437); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1138:6: ( ( '#' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1138:6: ( ( '#' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1139:1: ( '#' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1140:1: ( '#' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1140:3: '#'
                    {
                    match(input,25,FOLLOW_25_in_rule__Visibility__Alternatives2458); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1145:6: ( ( '~' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1145:6: ( ( '~' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1146:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1147:1: ( '~' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1147:3: '~'
                    {
                    match(input,26,FOLLOW_26_in_rule__Visibility__Alternatives2479); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3()); 
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
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1159:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1163:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1164:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02512);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02515);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1171:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1175:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1176:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1176:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1177:1: ( rule__Model__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1178:1: ( rule__Model__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1178:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2542);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1188:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1192:1: ( rule__Model__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1193:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12573);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1199:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1203:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1204:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1204:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1205:1: ( rule__Model__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1206:1: ( rule__Model__ElementsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=24)||(LA11_0>=28 && LA11_0<=29)||LA11_0==31||LA11_0==34||LA11_0==42) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1206:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl2600);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1220:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1224:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1225:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02635);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02638);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1232:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1236:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1237:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1237:1: ( 'import' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1238:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Import__Group__0__Impl2666); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1251:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1255:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1256:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12697);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1262:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1266:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1267:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1267:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1268:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1269:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1269:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2724);
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


    // $ANTLR start "rule__Datatype__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1283:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1287:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1288:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group__0__Impl_in_rule__Datatype__Group__02758);
            rule__Datatype__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Datatype__Group__1_in_rule__Datatype__Group__02761);
            rule__Datatype__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__0"


    // $ANTLR start "rule__Datatype__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1295:1: rule__Datatype__Group__0__Impl : ( ( rule__Datatype__AnnotationAssignment_0 )* ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1299:1: ( ( ( rule__Datatype__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1300:1: ( ( rule__Datatype__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1300:1: ( ( rule__Datatype__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1301:1: ( rule__Datatype__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1302:1: ( rule__Datatype__AnnotationAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1302:2: rule__Datatype__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Datatype__AnnotationAssignment_0_in_rule__Datatype__Group__0__Impl2788);
            	    rule__Datatype__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getAnnotationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__0__Impl"


    // $ANTLR start "rule__Datatype__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1312:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1316:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1317:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_rule__Datatype__Group__1__Impl_in_rule__Datatype__Group__12819);
            rule__Datatype__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Datatype__Group__2_in_rule__Datatype__Group__12822);
            rule__Datatype__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__1"


    // $ANTLR start "rule__Datatype__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1324:1: rule__Datatype__Group__1__Impl : ( ( 'datatype' ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1328:1: ( ( ( 'datatype' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1329:1: ( ( 'datatype' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1329:1: ( ( 'datatype' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1330:1: ( 'datatype' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1331:1: ( 'datatype' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1332:2: 'datatype'
            {
            match(input,28,FOLLOW_28_in_rule__Datatype__Group__1__Impl2851); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getDatatypeKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__1__Impl"


    // $ANTLR start "rule__Datatype__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1343:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1347:1: ( rule__Datatype__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1348:2: rule__Datatype__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group__2__Impl_in_rule__Datatype__Group__22883);
            rule__Datatype__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__2"


    // $ANTLR start "rule__Datatype__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1354:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__NameAssignment_2 ) ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1358:1: ( ( ( rule__Datatype__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1359:1: ( ( rule__Datatype__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1359:1: ( ( rule__Datatype__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1360:1: ( rule__Datatype__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1361:1: ( rule__Datatype__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1361:2: rule__Datatype__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Datatype__NameAssignment_2_in_rule__Datatype__Group__2__Impl2910);
            rule__Datatype__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1377:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1381:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1382:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02946);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02949);
            rule__Package__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1389:1: rule__Package__Group__0__Impl : ( ( rule__Package__AnnotationAssignment_0 )* ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1393:1: ( ( ( rule__Package__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1394:1: ( ( rule__Package__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1394:1: ( ( rule__Package__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1395:1: ( rule__Package__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1396:1: ( rule__Package__AnnotationAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1396:2: rule__Package__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Package__AnnotationAssignment_0_in_rule__Package__Group__0__Impl2976);
            	    rule__Package__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getAnnotationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1406:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1410:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1411:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__13007);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__13010);
            rule__Package__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1418:1: rule__Package__Group__1__Impl : ( ( 'package' ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1422:1: ( ( ( 'package' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1423:1: ( ( 'package' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1423:1: ( ( 'package' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1424:1: ( 'package' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1425:1: ( 'package' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1426:2: 'package'
            {
            match(input,29,FOLLOW_29_in_rule__Package__Group__1__Impl3039); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1437:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1441:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1442:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__23071);
            rule__Package__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__23074);
            rule__Package__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1449:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1453:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1454:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1454:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1455:1: ( rule__Package__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1456:1: ( rule__Package__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1456:2: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl3101);
            rule__Package__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1466:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1470:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1471:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__33131);
            rule__Package__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__33134);
            rule__Package__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1478:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1482:1: ( ( ( rule__Package__ElementAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1483:1: ( ( rule__Package__ElementAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1483:1: ( ( rule__Package__ElementAssignment_3 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1484:1: ( rule__Package__ElementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1485:1: ( rule__Package__ElementAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=24)||(LA14_0>=28 && LA14_0<=29)||LA14_0==31||LA14_0==34||LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1485:2: rule__Package__ElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__ElementAssignment_3_in_rule__Package__Group__3__Impl3161);
            	    rule__Package__ElementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1495:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1499:1: ( rule__Package__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1500:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__43192);
            rule__Package__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1506:1: rule__Package__Group__4__Impl : ( 'end' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1510:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1511:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1511:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1512:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getEndKeyword_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__Package__Group__4__Impl3220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getEndKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Classifier__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1535:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1539:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1540:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__03261);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__03264);
            rule__Classifier__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__0"


    // $ANTLR start "rule__Classifier__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1547:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__AnnotationAssignment_0 )* ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1551:1: ( ( ( rule__Classifier__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1552:1: ( ( rule__Classifier__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1552:1: ( ( rule__Classifier__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1553:1: ( rule__Classifier__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1554:1: ( rule__Classifier__AnnotationAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1554:2: rule__Classifier__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Classifier__AnnotationAssignment_0_in_rule__Classifier__Group__0__Impl3291);
            	    rule__Classifier__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getAnnotationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__0__Impl"


    // $ANTLR start "rule__Classifier__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1564:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl rule__Classifier__Group__2 ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1568:1: ( rule__Classifier__Group__1__Impl rule__Classifier__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1569:2: rule__Classifier__Group__1__Impl rule__Classifier__Group__2
            {
            pushFollow(FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__13322);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__13325);
            rule__Classifier__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__1"


    // $ANTLR start "rule__Classifier__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1576:1: rule__Classifier__Group__1__Impl : ( ( 'class' ) ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1580:1: ( ( ( 'class' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1581:1: ( ( 'class' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1581:1: ( ( 'class' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1582:1: ( 'class' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1583:1: ( 'class' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1584:2: 'class'
            {
            match(input,31,FOLLOW_31_in_rule__Classifier__Group__1__Impl3354); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getClassKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__1__Impl"


    // $ANTLR start "rule__Classifier__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1595:1: rule__Classifier__Group__2 : rule__Classifier__Group__2__Impl rule__Classifier__Group__3 ;
    public final void rule__Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1599:1: ( rule__Classifier__Group__2__Impl rule__Classifier__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1600:2: rule__Classifier__Group__2__Impl rule__Classifier__Group__3
            {
            pushFollow(FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__23386);
            rule__Classifier__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__3_in_rule__Classifier__Group__23389);
            rule__Classifier__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__2"


    // $ANTLR start "rule__Classifier__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1607:1: rule__Classifier__Group__2__Impl : ( ( rule__Classifier__NameAssignment_2 ) ) ;
    public final void rule__Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1611:1: ( ( ( rule__Classifier__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1612:1: ( ( rule__Classifier__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1612:1: ( ( rule__Classifier__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1613:1: ( rule__Classifier__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1614:1: ( rule__Classifier__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1614:2: rule__Classifier__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Classifier__NameAssignment_2_in_rule__Classifier__Group__2__Impl3416);
            rule__Classifier__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__2__Impl"


    // $ANTLR start "rule__Classifier__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1624:1: rule__Classifier__Group__3 : rule__Classifier__Group__3__Impl rule__Classifier__Group__4 ;
    public final void rule__Classifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1628:1: ( rule__Classifier__Group__3__Impl rule__Classifier__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1629:2: rule__Classifier__Group__3__Impl rule__Classifier__Group__4
            {
            pushFollow(FOLLOW_rule__Classifier__Group__3__Impl_in_rule__Classifier__Group__33446);
            rule__Classifier__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__4_in_rule__Classifier__Group__33449);
            rule__Classifier__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__3"


    // $ANTLR start "rule__Classifier__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1636:1: rule__Classifier__Group__3__Impl : ( ( rule__Classifier__GeneralizationAssignment_3 )? ) ;
    public final void rule__Classifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1640:1: ( ( ( rule__Classifier__GeneralizationAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1641:1: ( ( rule__Classifier__GeneralizationAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1641:1: ( ( rule__Classifier__GeneralizationAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1642:1: ( rule__Classifier__GeneralizationAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGeneralizationAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1643:1: ( rule__Classifier__GeneralizationAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1643:2: rule__Classifier__GeneralizationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Classifier__GeneralizationAssignment_3_in_rule__Classifier__Group__3__Impl3476);
                    rule__Classifier__GeneralizationAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getGeneralizationAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__3__Impl"


    // $ANTLR start "rule__Classifier__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1653:1: rule__Classifier__Group__4 : rule__Classifier__Group__4__Impl rule__Classifier__Group__5 ;
    public final void rule__Classifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1657:1: ( rule__Classifier__Group__4__Impl rule__Classifier__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1658:2: rule__Classifier__Group__4__Impl rule__Classifier__Group__5
            {
            pushFollow(FOLLOW_rule__Classifier__Group__4__Impl_in_rule__Classifier__Group__43507);
            rule__Classifier__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__5_in_rule__Classifier__Group__43510);
            rule__Classifier__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__4"


    // $ANTLR start "rule__Classifier__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1665:1: rule__Classifier__Group__4__Impl : ( ( rule__Classifier__ConstraintAssignment_4 )? ) ;
    public final void rule__Classifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1669:1: ( ( ( rule__Classifier__ConstraintAssignment_4 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1670:1: ( ( rule__Classifier__ConstraintAssignment_4 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1670:1: ( ( rule__Classifier__ConstraintAssignment_4 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1671:1: ( rule__Classifier__ConstraintAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getConstraintAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1672:1: ( rule__Classifier__ConstraintAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_CONSTRAINT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1672:2: rule__Classifier__ConstraintAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Classifier__ConstraintAssignment_4_in_rule__Classifier__Group__4__Impl3537);
                    rule__Classifier__ConstraintAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getConstraintAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__4__Impl"


    // $ANTLR start "rule__Classifier__Group__5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1682:1: rule__Classifier__Group__5 : rule__Classifier__Group__5__Impl rule__Classifier__Group__6 ;
    public final void rule__Classifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1686:1: ( rule__Classifier__Group__5__Impl rule__Classifier__Group__6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1687:2: rule__Classifier__Group__5__Impl rule__Classifier__Group__6
            {
            pushFollow(FOLLOW_rule__Classifier__Group__5__Impl_in_rule__Classifier__Group__53568);
            rule__Classifier__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__6_in_rule__Classifier__Group__53571);
            rule__Classifier__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__5"


    // $ANTLR start "rule__Classifier__Group__5__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1694:1: rule__Classifier__Group__5__Impl : ( ( rule__Classifier__FeatureAssignment_5 )* ) ;
    public final void rule__Classifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1698:1: ( ( ( rule__Classifier__FeatureAssignment_5 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1699:1: ( ( rule__Classifier__FeatureAssignment_5 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1699:1: ( ( rule__Classifier__FeatureAssignment_5 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1700:1: ( rule__Classifier__FeatureAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFeatureAssignment_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1701:1: ( rule__Classifier__FeatureAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=17 && LA18_0<=18)||(LA18_0>=25 && LA18_0<=26)||LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1701:2: rule__Classifier__FeatureAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Classifier__FeatureAssignment_5_in_rule__Classifier__Group__5__Impl3598);
            	    rule__Classifier__FeatureAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getFeatureAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__5__Impl"


    // $ANTLR start "rule__Classifier__Group__6"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1711:1: rule__Classifier__Group__6 : rule__Classifier__Group__6__Impl ;
    public final void rule__Classifier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1715:1: ( rule__Classifier__Group__6__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1716:2: rule__Classifier__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group__6__Impl_in_rule__Classifier__Group__63629);
            rule__Classifier__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__6"


    // $ANTLR start "rule__Classifier__Group__6__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1722:1: rule__Classifier__Group__6__Impl : ( 'end' ) ;
    public final void rule__Classifier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1726:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1727:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1727:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1728:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getEndKeyword_6()); 
            }
            match(input,30,FOLLOW_30_in_rule__Classifier__Group__6__Impl3657); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getEndKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__6__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1755:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1759:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1760:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_rule__Generalization__Group__0__Impl_in_rule__Generalization__Group__03702);
            rule__Generalization__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generalization__Group__1_in_rule__Generalization__Group__03705);
            rule__Generalization__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0"


    // $ANTLR start "rule__Generalization__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1767:1: rule__Generalization__Group__0__Impl : ( 'isA' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1771:1: ( ( 'isA' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1772:1: ( 'isA' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1772:1: ( 'isA' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1773:1: 'isA'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getIsAKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Generalization__Group__0__Impl3733); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationAccess().getIsAKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0__Impl"


    // $ANTLR start "rule__Generalization__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1786:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1790:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1791:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_rule__Generalization__Group__1__Impl_in_rule__Generalization__Group__13764);
            rule__Generalization__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generalization__Group__2_in_rule__Generalization__Group__13767);
            rule__Generalization__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1"


    // $ANTLR start "rule__Generalization__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1798:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__ClassifierAssignment_1 ) ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1802:1: ( ( ( rule__Generalization__ClassifierAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1803:1: ( ( rule__Generalization__ClassifierAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1803:1: ( ( rule__Generalization__ClassifierAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1804:1: ( rule__Generalization__ClassifierAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getClassifierAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1805:1: ( rule__Generalization__ClassifierAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1805:2: rule__Generalization__ClassifierAssignment_1
            {
            pushFollow(FOLLOW_rule__Generalization__ClassifierAssignment_1_in_rule__Generalization__Group__1__Impl3794);
            rule__Generalization__ClassifierAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationAccess().getClassifierAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1__Impl"


    // $ANTLR start "rule__Generalization__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1815:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1819:1: ( rule__Generalization__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1820:2: rule__Generalization__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Generalization__Group__2__Impl_in_rule__Generalization__Group__23824);
            rule__Generalization__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__2"


    // $ANTLR start "rule__Generalization__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1826:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__Group_2__0 )* ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1830:1: ( ( ( rule__Generalization__Group_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1831:1: ( ( rule__Generalization__Group_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1831:1: ( ( rule__Generalization__Group_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1832:1: ( rule__Generalization__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1833:1: ( rule__Generalization__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1833:2: rule__Generalization__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generalization__Group_2__0_in_rule__Generalization__Group__2__Impl3851);
            	    rule__Generalization__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__2__Impl"


    // $ANTLR start "rule__Generalization__Group_2__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1849:1: rule__Generalization__Group_2__0 : rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1 ;
    public final void rule__Generalization__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1853:1: ( rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1854:2: rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1
            {
            pushFollow(FOLLOW_rule__Generalization__Group_2__0__Impl_in_rule__Generalization__Group_2__03888);
            rule__Generalization__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generalization__Group_2__1_in_rule__Generalization__Group_2__03891);
            rule__Generalization__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group_2__0"


    // $ANTLR start "rule__Generalization__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1861:1: rule__Generalization__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Generalization__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1865:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1866:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1866:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1867:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getCommaKeyword_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Generalization__Group_2__0__Impl3919); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group_2__0__Impl"


    // $ANTLR start "rule__Generalization__Group_2__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1880:1: rule__Generalization__Group_2__1 : rule__Generalization__Group_2__1__Impl ;
    public final void rule__Generalization__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1884:1: ( rule__Generalization__Group_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1885:2: rule__Generalization__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generalization__Group_2__1__Impl_in_rule__Generalization__Group_2__13950);
            rule__Generalization__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group_2__1"


    // $ANTLR start "rule__Generalization__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1891:1: rule__Generalization__Group_2__1__Impl : ( ( rule__Generalization__ClassifierAssignment_2_1 ) ) ;
    public final void rule__Generalization__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1895:1: ( ( ( rule__Generalization__ClassifierAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1896:1: ( ( rule__Generalization__ClassifierAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1896:1: ( ( rule__Generalization__ClassifierAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1897:1: ( rule__Generalization__ClassifierAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getClassifierAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1898:1: ( rule__Generalization__ClassifierAssignment_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1898:2: rule__Generalization__ClassifierAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Generalization__ClassifierAssignment_2_1_in_rule__Generalization__Group_2__1__Impl3977);
            rule__Generalization__ClassifierAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationAccess().getClassifierAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1912:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1916:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1917:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04011);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04014);
            rule__Type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1924:1: rule__Type__Group__0__Impl : ( ( rule__Type__VisibilityAssignment_0 )? ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1928:1: ( ( ( rule__Type__VisibilityAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1929:1: ( ( rule__Type__VisibilityAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1929:1: ( ( rule__Type__VisibilityAssignment_0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1930:1: ( rule__Type__VisibilityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getVisibilityAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1931:1: ( rule__Type__VisibilityAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=17 && LA20_0<=18)||(LA20_0>=25 && LA20_0<=26)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1931:2: rule__Type__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__VisibilityAssignment_0_in_rule__Type__Group__0__Impl4041);
                    rule__Type__VisibilityAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getVisibilityAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1941:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1945:1: ( rule__Type__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1946:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14072);
            rule__Type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1952:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1956:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1957:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1957:1: ( ( rule__Type__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1958:1: ( rule__Type__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1959:1: ( rule__Type__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1959:2: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_1_in_rule__Type__Group__1__Impl4099);
            rule__Type__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1973:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1977:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1978:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04133);
            rule__Feature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04136);
            rule__Feature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1985:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__Alternatives_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1989:1: ( ( ( rule__Feature__Alternatives_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1990:1: ( ( rule__Feature__Alternatives_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1990:1: ( ( rule__Feature__Alternatives_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1991:1: ( rule__Feature__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1992:1: ( rule__Feature__Alternatives_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1992:2: rule__Feature__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_0_in_rule__Feature__Group__0__Impl4163);
            rule__Feature__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2002:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2006:1: ( rule__Feature__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2007:2: rule__Feature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14193);
            rule__Feature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2013:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConstraintAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2017:1: ( ( ( rule__Feature__ConstraintAssignment_1 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2018:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2018:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2019:1: ( rule__Feature__ConstraintAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getConstraintAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2020:1: ( rule__Feature__ConstraintAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_CONSTRAINT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2020:2: rule__Feature__ConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4220);
                    rule__Feature__ConstraintAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2034:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2038:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2039:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__04255);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__04258);
            rule__Enumeration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2046:1: rule__Enumeration__Group__0__Impl : ( ( rule__Enumeration__AnnotationAssignment_0 )* ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2050:1: ( ( ( rule__Enumeration__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2051:1: ( ( rule__Enumeration__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2051:1: ( ( rule__Enumeration__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2052:1: ( rule__Enumeration__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2053:1: ( rule__Enumeration__AnnotationAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2053:2: rule__Enumeration__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__AnnotationAssignment_0_in_rule__Enumeration__Group__0__Impl4285);
            	    rule__Enumeration__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getAnnotationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2063:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2067:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2068:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__14316);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__14319);
            rule__Enumeration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2075:1: rule__Enumeration__Group__1__Impl : ( ( 'enum' ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2079:1: ( ( ( 'enum' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2080:1: ( ( 'enum' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2080:1: ( ( 'enum' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2081:1: ( 'enum' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2082:1: ( 'enum' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2083:2: 'enum'
            {
            match(input,34,FOLLOW_34_in_rule__Enumeration__Group__1__Impl4348); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getEnumKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2094:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2098:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2099:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__24380);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__24383);
            rule__Enumeration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2106:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2110:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2111:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2111:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2112:1: ( rule__Enumeration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2113:1: ( rule__Enumeration__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2113:2: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__2__Impl4410);
            rule__Enumeration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2123:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2127:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2128:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__34440);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__34443);
            rule__Enumeration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2135:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__ConstraintAssignment_3 )? ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2139:1: ( ( ( rule__Enumeration__ConstraintAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2140:1: ( ( rule__Enumeration__ConstraintAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2140:1: ( ( rule__Enumeration__ConstraintAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2141:1: ( rule__Enumeration__ConstraintAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getConstraintAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2142:1: ( rule__Enumeration__ConstraintAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_CONSTRAINT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2142:2: rule__Enumeration__ConstraintAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Enumeration__ConstraintAssignment_3_in_rule__Enumeration__Group__3__Impl4470);
                    rule__Enumeration__ConstraintAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getConstraintAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2152:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2156:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2157:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__44501);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__44504);
            rule__Enumeration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2164:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__EnumeratorAssignment_4 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2168:1: ( ( ( rule__Enumeration__EnumeratorAssignment_4 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2169:1: ( ( rule__Enumeration__EnumeratorAssignment_4 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2169:1: ( ( rule__Enumeration__EnumeratorAssignment_4 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2170:1: ( rule__Enumeration__EnumeratorAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumeratorAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2171:1: ( rule__Enumeration__EnumeratorAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2171:2: rule__Enumeration__EnumeratorAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumeratorAssignment_4_in_rule__Enumeration__Group__4__Impl4531);
            	    rule__Enumeration__EnumeratorAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getEnumeratorAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2181:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2185:1: ( rule__Enumeration__Group__5__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2186:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__54562);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2192:1: rule__Enumeration__Group__5__Impl : ( 'end' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2196:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2197:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2197:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2198:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEndKeyword_5()); 
            }
            match(input,30,FOLLOW_30_in_rule__Enumeration__Group__5__Impl4590); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getEndKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumerator__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2223:1: rule__Enumerator__Group__0 : rule__Enumerator__Group__0__Impl rule__Enumerator__Group__1 ;
    public final void rule__Enumerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2227:1: ( rule__Enumerator__Group__0__Impl rule__Enumerator__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2228:2: rule__Enumerator__Group__0__Impl rule__Enumerator__Group__1
            {
            pushFollow(FOLLOW_rule__Enumerator__Group__0__Impl_in_rule__Enumerator__Group__04633);
            rule__Enumerator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumerator__Group__1_in_rule__Enumerator__Group__04636);
            rule__Enumerator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group__0"


    // $ANTLR start "rule__Enumerator__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2235:1: rule__Enumerator__Group__0__Impl : ( ( rule__Enumerator__NameAssignment_0 ) ) ;
    public final void rule__Enumerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2239:1: ( ( ( rule__Enumerator__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2240:1: ( ( rule__Enumerator__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2240:1: ( ( rule__Enumerator__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2241:1: ( rule__Enumerator__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2242:1: ( rule__Enumerator__NameAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2242:2: rule__Enumerator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Enumerator__NameAssignment_0_in_rule__Enumerator__Group__0__Impl4663);
            rule__Enumerator__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group__0__Impl"


    // $ANTLR start "rule__Enumerator__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2252:1: rule__Enumerator__Group__1 : rule__Enumerator__Group__1__Impl rule__Enumerator__Group__2 ;
    public final void rule__Enumerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2256:1: ( rule__Enumerator__Group__1__Impl rule__Enumerator__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2257:2: rule__Enumerator__Group__1__Impl rule__Enumerator__Group__2
            {
            pushFollow(FOLLOW_rule__Enumerator__Group__1__Impl_in_rule__Enumerator__Group__14693);
            rule__Enumerator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumerator__Group__2_in_rule__Enumerator__Group__14696);
            rule__Enumerator__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group__1"


    // $ANTLR start "rule__Enumerator__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2264:1: rule__Enumerator__Group__1__Impl : ( ( rule__Enumerator__Group_1__0 )? ) ;
    public final void rule__Enumerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2268:1: ( ( ( rule__Enumerator__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2269:1: ( ( rule__Enumerator__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2269:1: ( ( rule__Enumerator__Group_1__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2270:1: ( rule__Enumerator__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2271:1: ( rule__Enumerator__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2271:2: rule__Enumerator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Enumerator__Group_1__0_in_rule__Enumerator__Group__1__Impl4723);
                    rule__Enumerator__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group__1__Impl"


    // $ANTLR start "rule__Enumerator__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2281:1: rule__Enumerator__Group__2 : rule__Enumerator__Group__2__Impl ;
    public final void rule__Enumerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2285:1: ( rule__Enumerator__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2286:2: rule__Enumerator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Enumerator__Group__2__Impl_in_rule__Enumerator__Group__24754);
            rule__Enumerator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group__2"


    // $ANTLR start "rule__Enumerator__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2292:1: rule__Enumerator__Group__2__Impl : ( ( rule__Enumerator__ConstraintAssignment_2 )? ) ;
    public final void rule__Enumerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2296:1: ( ( ( rule__Enumerator__ConstraintAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2297:1: ( ( rule__Enumerator__ConstraintAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2297:1: ( ( rule__Enumerator__ConstraintAssignment_2 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2298:1: ( rule__Enumerator__ConstraintAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getConstraintAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2299:1: ( rule__Enumerator__ConstraintAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_CONSTRAINT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2299:2: rule__Enumerator__ConstraintAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Enumerator__ConstraintAssignment_2_in_rule__Enumerator__Group__2__Impl4781);
                    rule__Enumerator__ConstraintAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getConstraintAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group__2__Impl"


    // $ANTLR start "rule__Enumerator__Group_1__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2315:1: rule__Enumerator__Group_1__0 : rule__Enumerator__Group_1__0__Impl rule__Enumerator__Group_1__1 ;
    public final void rule__Enumerator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2319:1: ( rule__Enumerator__Group_1__0__Impl rule__Enumerator__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2320:2: rule__Enumerator__Group_1__0__Impl rule__Enumerator__Group_1__1
            {
            pushFollow(FOLLOW_rule__Enumerator__Group_1__0__Impl_in_rule__Enumerator__Group_1__04818);
            rule__Enumerator__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumerator__Group_1__1_in_rule__Enumerator__Group_1__04821);
            rule__Enumerator__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group_1__0"


    // $ANTLR start "rule__Enumerator__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2327:1: rule__Enumerator__Group_1__0__Impl : ( ( '=' ) ) ;
    public final void rule__Enumerator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2331:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2332:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2332:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2333:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2334:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2335:2: '='
            {
            match(input,35,FOLLOW_35_in_rule__Enumerator__Group_1__0__Impl4850); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group_1__0__Impl"


    // $ANTLR start "rule__Enumerator__Group_1__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2346:1: rule__Enumerator__Group_1__1 : rule__Enumerator__Group_1__1__Impl ;
    public final void rule__Enumerator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2350:1: ( rule__Enumerator__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2351:2: rule__Enumerator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Enumerator__Group_1__1__Impl_in_rule__Enumerator__Group_1__14882);
            rule__Enumerator__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group_1__1"


    // $ANTLR start "rule__Enumerator__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2357:1: rule__Enumerator__Group_1__1__Impl : ( ( rule__Enumerator__ValueAssignment_1_1 ) ) ;
    public final void rule__Enumerator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2361:1: ( ( ( rule__Enumerator__ValueAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2362:1: ( ( rule__Enumerator__ValueAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2362:1: ( ( rule__Enumerator__ValueAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2363:1: ( rule__Enumerator__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getValueAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2364:1: ( rule__Enumerator__ValueAssignment_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2364:2: rule__Enumerator__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Enumerator__ValueAssignment_1_1_in_rule__Enumerator__Group_1__1__Impl4909);
            rule__Enumerator__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__Group_1__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2378:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2382:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2383:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04943);
            rule__Relationship__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04946);
            rule__Relationship__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2390:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__AnnotationAssignment_0 )* ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2394:1: ( ( ( rule__Relationship__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2395:1: ( ( rule__Relationship__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2395:1: ( ( rule__Relationship__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2396:1: ( rule__Relationship__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2397:1: ( rule__Relationship__AnnotationAssignment_0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2397:2: rule__Relationship__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Relationship__AnnotationAssignment_0_in_rule__Relationship__Group__0__Impl4973);
            	    rule__Relationship__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getAnnotationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2407:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2411:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2412:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__15004);
            rule__Relationship__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__15007);
            rule__Relationship__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2419:1: rule__Relationship__Group__1__Impl : ( ( rule__Relationship__TypeAssignment_1 ) ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2423:1: ( ( ( rule__Relationship__TypeAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2424:1: ( ( rule__Relationship__TypeAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2424:1: ( ( rule__Relationship__TypeAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2425:1: ( rule__Relationship__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTypeAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2426:1: ( rule__Relationship__TypeAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2426:2: rule__Relationship__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Relationship__TypeAssignment_1_in_rule__Relationship__Group__1__Impl5034);
            rule__Relationship__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2436:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2440:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2441:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__25064);
            rule__Relationship__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__25067);
            rule__Relationship__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2448:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__LabelAssignment_2 )? ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2452:1: ( ( ( rule__Relationship__LabelAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2453:1: ( ( rule__Relationship__LabelAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2453:1: ( ( rule__Relationship__LabelAssignment_2 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2454:1: ( rule__Relationship__LabelAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLabelAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2455:1: ( rule__Relationship__LabelAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2455:2: rule__Relationship__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Relationship__LabelAssignment_2_in_rule__Relationship__Group__2__Impl5094);
                    rule__Relationship__LabelAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2465:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2469:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2470:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__35125);
            rule__Relationship__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__35128);
            rule__Relationship__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2477:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__HeadNavigableAssignment_3 )? ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2481:1: ( ( ( rule__Relationship__HeadNavigableAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2482:1: ( ( rule__Relationship__HeadNavigableAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2482:1: ( ( rule__Relationship__HeadNavigableAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2483:1: ( rule__Relationship__HeadNavigableAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadNavigableAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2484:1: ( rule__Relationship__HeadNavigableAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2484:2: rule__Relationship__HeadNavigableAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Relationship__HeadNavigableAssignment_3_in_rule__Relationship__Group__3__Impl5155);
                    rule__Relationship__HeadNavigableAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadNavigableAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2494:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2498:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2499:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__45186);
            rule__Relationship__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__45189);
            rule__Relationship__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2506:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__HeadMultiplicityAssignment_4 )? ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2510:1: ( ( ( rule__Relationship__HeadMultiplicityAssignment_4 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2511:1: ( ( rule__Relationship__HeadMultiplicityAssignment_4 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2511:1: ( ( rule__Relationship__HeadMultiplicityAssignment_4 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2512:1: ( rule__Relationship__HeadMultiplicityAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadMultiplicityAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2513:1: ( rule__Relationship__HeadMultiplicityAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_NATURAL||LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2513:2: rule__Relationship__HeadMultiplicityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Relationship__HeadMultiplicityAssignment_4_in_rule__Relationship__Group__4__Impl5216);
                    rule__Relationship__HeadMultiplicityAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadMultiplicityAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2523:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2527:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2528:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__55247);
            rule__Relationship__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__55250);
            rule__Relationship__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2535:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__HeadAssignment_5 ) ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2539:1: ( ( ( rule__Relationship__HeadAssignment_5 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2540:1: ( ( rule__Relationship__HeadAssignment_5 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2540:1: ( ( rule__Relationship__HeadAssignment_5 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2541:1: ( rule__Relationship__HeadAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadAssignment_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2542:1: ( rule__Relationship__HeadAssignment_5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2542:2: rule__Relationship__HeadAssignment_5
            {
            pushFollow(FOLLOW_rule__Relationship__HeadAssignment_5_in_rule__Relationship__Group__5__Impl5277);
            rule__Relationship__HeadAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Relationship__Group__6"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2552:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl rule__Relationship__Group__7 ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2556:1: ( rule__Relationship__Group__6__Impl rule__Relationship__Group__7 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2557:2: rule__Relationship__Group__6__Impl rule__Relationship__Group__7
            {
            pushFollow(FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__65307);
            rule__Relationship__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__65310);
            rule__Relationship__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6"


    // $ANTLR start "rule__Relationship__Group__6__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2564:1: rule__Relationship__Group__6__Impl : ( ( rule__Relationship__HeadLabelAssignment_6 )? ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2568:1: ( ( ( rule__Relationship__HeadLabelAssignment_6 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2569:1: ( ( rule__Relationship__HeadLabelAssignment_6 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2569:1: ( ( rule__Relationship__HeadLabelAssignment_6 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2570:1: ( rule__Relationship__HeadLabelAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadLabelAssignment_6()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2571:1: ( rule__Relationship__HeadLabelAssignment_6 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2571:2: rule__Relationship__HeadLabelAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Relationship__HeadLabelAssignment_6_in_rule__Relationship__Group__6__Impl5337);
                    rule__Relationship__HeadLabelAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadLabelAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6__Impl"


    // $ANTLR start "rule__Relationship__Group__7"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2581:1: rule__Relationship__Group__7 : rule__Relationship__Group__7__Impl rule__Relationship__Group__8 ;
    public final void rule__Relationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2585:1: ( rule__Relationship__Group__7__Impl rule__Relationship__Group__8 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2586:2: rule__Relationship__Group__7__Impl rule__Relationship__Group__8
            {
            pushFollow(FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__75368);
            rule__Relationship__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__8_in_rule__Relationship__Group__75371);
            rule__Relationship__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__7"


    // $ANTLR start "rule__Relationship__Group__7__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2593:1: rule__Relationship__Group__7__Impl : ( ( rule__Relationship__TailNavigableAssignment_7 )? ) ;
    public final void rule__Relationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2597:1: ( ( ( rule__Relationship__TailNavigableAssignment_7 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2598:1: ( ( rule__Relationship__TailNavigableAssignment_7 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2598:1: ( ( rule__Relationship__TailNavigableAssignment_7 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2599:1: ( rule__Relationship__TailNavigableAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailNavigableAssignment_7()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2600:1: ( rule__Relationship__TailNavigableAssignment_7 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2600:2: rule__Relationship__TailNavigableAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Relationship__TailNavigableAssignment_7_in_rule__Relationship__Group__7__Impl5398);
                    rule__Relationship__TailNavigableAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailNavigableAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__7__Impl"


    // $ANTLR start "rule__Relationship__Group__8"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2610:1: rule__Relationship__Group__8 : rule__Relationship__Group__8__Impl rule__Relationship__Group__9 ;
    public final void rule__Relationship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2614:1: ( rule__Relationship__Group__8__Impl rule__Relationship__Group__9 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2615:2: rule__Relationship__Group__8__Impl rule__Relationship__Group__9
            {
            pushFollow(FOLLOW_rule__Relationship__Group__8__Impl_in_rule__Relationship__Group__85429);
            rule__Relationship__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__9_in_rule__Relationship__Group__85432);
            rule__Relationship__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__8"


    // $ANTLR start "rule__Relationship__Group__8__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2622:1: rule__Relationship__Group__8__Impl : ( ( rule__Relationship__TailMultiplicityAssignment_8 )? ) ;
    public final void rule__Relationship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2626:1: ( ( ( rule__Relationship__TailMultiplicityAssignment_8 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2627:1: ( ( rule__Relationship__TailMultiplicityAssignment_8 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2627:1: ( ( rule__Relationship__TailMultiplicityAssignment_8 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2628:1: ( rule__Relationship__TailMultiplicityAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailMultiplicityAssignment_8()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2629:1: ( rule__Relationship__TailMultiplicityAssignment_8 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_NATURAL||LA33_0==14) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2629:2: rule__Relationship__TailMultiplicityAssignment_8
                    {
                    pushFollow(FOLLOW_rule__Relationship__TailMultiplicityAssignment_8_in_rule__Relationship__Group__8__Impl5459);
                    rule__Relationship__TailMultiplicityAssignment_8();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailMultiplicityAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__8__Impl"


    // $ANTLR start "rule__Relationship__Group__9"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2639:1: rule__Relationship__Group__9 : rule__Relationship__Group__9__Impl rule__Relationship__Group__10 ;
    public final void rule__Relationship__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2643:1: ( rule__Relationship__Group__9__Impl rule__Relationship__Group__10 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2644:2: rule__Relationship__Group__9__Impl rule__Relationship__Group__10
            {
            pushFollow(FOLLOW_rule__Relationship__Group__9__Impl_in_rule__Relationship__Group__95490);
            rule__Relationship__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__10_in_rule__Relationship__Group__95493);
            rule__Relationship__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__9"


    // $ANTLR start "rule__Relationship__Group__9__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2651:1: rule__Relationship__Group__9__Impl : ( ( rule__Relationship__TailAssignment_9 ) ) ;
    public final void rule__Relationship__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2655:1: ( ( ( rule__Relationship__TailAssignment_9 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2656:1: ( ( rule__Relationship__TailAssignment_9 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2656:1: ( ( rule__Relationship__TailAssignment_9 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2657:1: ( rule__Relationship__TailAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailAssignment_9()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2658:1: ( rule__Relationship__TailAssignment_9 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2658:2: rule__Relationship__TailAssignment_9
            {
            pushFollow(FOLLOW_rule__Relationship__TailAssignment_9_in_rule__Relationship__Group__9__Impl5520);
            rule__Relationship__TailAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__9__Impl"


    // $ANTLR start "rule__Relationship__Group__10"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2668:1: rule__Relationship__Group__10 : rule__Relationship__Group__10__Impl rule__Relationship__Group__11 ;
    public final void rule__Relationship__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2672:1: ( rule__Relationship__Group__10__Impl rule__Relationship__Group__11 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2673:2: rule__Relationship__Group__10__Impl rule__Relationship__Group__11
            {
            pushFollow(FOLLOW_rule__Relationship__Group__10__Impl_in_rule__Relationship__Group__105550);
            rule__Relationship__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__11_in_rule__Relationship__Group__105553);
            rule__Relationship__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__10"


    // $ANTLR start "rule__Relationship__Group__10__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2680:1: rule__Relationship__Group__10__Impl : ( ( rule__Relationship__TailLabelAssignment_10 )? ) ;
    public final void rule__Relationship__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2684:1: ( ( ( rule__Relationship__TailLabelAssignment_10 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2685:1: ( ( rule__Relationship__TailLabelAssignment_10 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2685:1: ( ( rule__Relationship__TailLabelAssignment_10 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2686:1: ( rule__Relationship__TailLabelAssignment_10 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailLabelAssignment_10()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2687:1: ( rule__Relationship__TailLabelAssignment_10 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2687:2: rule__Relationship__TailLabelAssignment_10
                    {
                    pushFollow(FOLLOW_rule__Relationship__TailLabelAssignment_10_in_rule__Relationship__Group__10__Impl5580);
                    rule__Relationship__TailLabelAssignment_10();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailLabelAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__10__Impl"


    // $ANTLR start "rule__Relationship__Group__11"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2697:1: rule__Relationship__Group__11 : rule__Relationship__Group__11__Impl ;
    public final void rule__Relationship__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2701:1: ( rule__Relationship__Group__11__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2702:2: rule__Relationship__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__11__Impl_in_rule__Relationship__Group__115611);
            rule__Relationship__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__11"


    // $ANTLR start "rule__Relationship__Group__11__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2708:1: rule__Relationship__Group__11__Impl : ( 'end' ) ;
    public final void rule__Relationship__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2712:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2713:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2713:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2714:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getEndKeyword_11()); 
            }
            match(input,30,FOLLOW_30_in_rule__Relationship__Group__11__Impl5639); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getEndKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__11__Impl"


    // $ANTLR start "rule__Multiplicity__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2751:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2755:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2756:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__0__Impl_in_rule__Multiplicity__Group__05694);
            rule__Multiplicity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplicity__Group__1_in_rule__Multiplicity__Group__05697);
            rule__Multiplicity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__0"


    // $ANTLR start "rule__Multiplicity__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2763:1: rule__Multiplicity__Group__0__Impl : ( ( rule__Multiplicity__UpperAssignment_0 ) ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2767:1: ( ( ( rule__Multiplicity__UpperAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2768:1: ( ( rule__Multiplicity__UpperAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2768:1: ( ( rule__Multiplicity__UpperAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2769:1: ( rule__Multiplicity__UpperAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getUpperAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2770:1: ( rule__Multiplicity__UpperAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2770:2: rule__Multiplicity__UpperAssignment_0
            {
            pushFollow(FOLLOW_rule__Multiplicity__UpperAssignment_0_in_rule__Multiplicity__Group__0__Impl5724);
            rule__Multiplicity__UpperAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityAccess().getUpperAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2780:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2784:1: ( rule__Multiplicity__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2785:2: rule__Multiplicity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__1__Impl_in_rule__Multiplicity__Group__15754);
            rule__Multiplicity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__1"


    // $ANTLR start "rule__Multiplicity__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2791:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__Group_1__0 )? ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2795:1: ( ( ( rule__Multiplicity__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2796:1: ( ( rule__Multiplicity__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2796:1: ( ( rule__Multiplicity__Group_1__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2797:1: ( rule__Multiplicity__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2798:1: ( rule__Multiplicity__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2798:2: rule__Multiplicity__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicity__Group_1__0_in_rule__Multiplicity__Group__1__Impl5781);
                    rule__Multiplicity__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2812:1: rule__Multiplicity__Group_1__0 : rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 ;
    public final void rule__Multiplicity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2816:1: ( rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2817:2: rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__0__Impl_in_rule__Multiplicity__Group_1__05816);
            rule__Multiplicity__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__1_in_rule__Multiplicity__Group_1__05819);
            rule__Multiplicity__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__0"


    // $ANTLR start "rule__Multiplicity__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2824:1: rule__Multiplicity__Group_1__0__Impl : ( ( '..' ) ) ;
    public final void rule__Multiplicity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2828:1: ( ( ( '..' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2829:1: ( ( '..' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2829:1: ( ( '..' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2830:1: ( '..' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2831:1: ( '..' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2832:2: '..'
            {
            match(input,36,FOLLOW_36_in_rule__Multiplicity__Group_1__0__Impl5848); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2843:1: rule__Multiplicity__Group_1__1 : rule__Multiplicity__Group_1__1__Impl ;
    public final void rule__Multiplicity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2847:1: ( rule__Multiplicity__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2848:2: rule__Multiplicity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__1__Impl_in_rule__Multiplicity__Group_1__15880);
            rule__Multiplicity__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__1"


    // $ANTLR start "rule__Multiplicity__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2854:1: rule__Multiplicity__Group_1__1__Impl : ( ( rule__Multiplicity__LowerAssignment_1_1 ) ) ;
    public final void rule__Multiplicity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2858:1: ( ( ( rule__Multiplicity__LowerAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2859:1: ( ( rule__Multiplicity__LowerAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2859:1: ( ( rule__Multiplicity__LowerAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2860:1: ( rule__Multiplicity__LowerAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getLowerAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2861:1: ( rule__Multiplicity__LowerAssignment_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2861:2: rule__Multiplicity__LowerAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplicity__LowerAssignment_1_1_in_rule__Multiplicity__Group_1__1__Impl5907);
            rule__Multiplicity__LowerAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityAccess().getLowerAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2875:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2879:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2880:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__05941);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__05944);
            rule__Constant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2887:1: rule__Constant__Group__0__Impl : ( ( rule__Constant__VisibilityAssignment_0 )? ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2891:1: ( ( ( rule__Constant__VisibilityAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2892:1: ( ( rule__Constant__VisibilityAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2892:1: ( ( rule__Constant__VisibilityAssignment_0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2893:1: ( rule__Constant__VisibilityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getVisibilityAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2894:1: ( rule__Constant__VisibilityAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=17 && LA36_0<=18)||(LA36_0>=25 && LA36_0<=26)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2894:2: rule__Constant__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Constant__VisibilityAssignment_0_in_rule__Constant__Group__0__Impl5971);
                    rule__Constant__VisibilityAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getVisibilityAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2904:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2908:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2909:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__16002);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__16005);
            rule__Constant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2916:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2920:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2921:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2921:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2922:1: ( rule__Constant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2923:1: ( rule__Constant__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2923:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl6032);
            rule__Constant__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2933:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2937:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2938:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__26062);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__26065);
            rule__Constant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2945:1: rule__Constant__Group__2__Impl : ( '=' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2949:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2950:1: ( '=' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2950:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2951:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Constant__Group__2__Impl6093); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2964:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2968:1: ( rule__Constant__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2969:2: rule__Constant__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__36124);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2975:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ValueAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2979:1: ( ( ( rule__Constant__ValueAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2980:1: ( ( rule__Constant__ValueAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2980:1: ( ( rule__Constant__ValueAssignment_3 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2981:1: ( rule__Constant__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2982:1: ( rule__Constant__ValueAssignment_3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2982:2: rule__Constant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl6151);
            rule__Constant__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3000:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3004:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3005:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__06189);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__06192);
            rule__Operation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3012:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__UnorderedGroup_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3016:1: ( ( ( rule__Operation__UnorderedGroup_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3017:1: ( ( rule__Operation__UnorderedGroup_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3017:1: ( ( rule__Operation__UnorderedGroup_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3018:1: ( rule__Operation__UnorderedGroup_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getUnorderedGroup_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3019:1: ( rule__Operation__UnorderedGroup_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3019:2: rule__Operation__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0_in_rule__Operation__Group__0__Impl6219);
            rule__Operation__UnorderedGroup_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getUnorderedGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3029:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3033:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3034:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__16249);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__16252);
            rule__Operation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3041:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3045:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3046:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3046:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3047:1: ( rule__Operation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3048:1: ( rule__Operation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3048:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl6279);
            rule__Operation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3058:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3062:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3063:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__26309);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__26312);
            rule__Operation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3070:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3074:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3075:1: ( '(' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3075:1: ( '(' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3076:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Operation__Group__2__Impl6340); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3089:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3093:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3094:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__36371);
            rule__Operation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__36374);
            rule__Operation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3101:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3105:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3106:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3106:1: ( ( rule__Operation__Group_3__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3107:1: ( rule__Operation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3108:1: ( rule__Operation__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3108:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl6401);
                    rule__Operation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3118:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3122:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3123:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__46432);
            rule__Operation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__46435);
            rule__Operation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3130:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3134:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3135:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3135:1: ( ')' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3136:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,38,FOLLOW_38_in_rule__Operation__Group__4__Impl6463); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3149:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3153:1: ( rule__Operation__Group__5__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3154:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__56494);
            rule__Operation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3160:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3164:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3165:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3165:1: ( ( rule__Operation__Group_5__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3166:1: ( rule__Operation__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3167:1: ( rule__Operation__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3167:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl6521);
                    rule__Operation__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group_3__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3189:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3193:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3194:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__06564);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__06567);
            rule__Operation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0"


    // $ANTLR start "rule__Operation__Group_3__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3201:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__ParameterAssignment_3_0 ) ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3205:1: ( ( ( rule__Operation__ParameterAssignment_3_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3206:1: ( ( rule__Operation__ParameterAssignment_3_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3206:1: ( ( rule__Operation__ParameterAssignment_3_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3207:1: ( rule__Operation__ParameterAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParameterAssignment_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3208:1: ( rule__Operation__ParameterAssignment_3_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3208:2: rule__Operation__ParameterAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Operation__ParameterAssignment_3_0_in_rule__Operation__Group_3__0__Impl6594);
            rule__Operation__ParameterAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParameterAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3218:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3222:1: ( rule__Operation__Group_3__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3223:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__16624);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1"


    // $ANTLR start "rule__Operation__Group_3__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3229:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__Group_3_1__0 )* ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3233:1: ( ( ( rule__Operation__Group_3_1__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3234:1: ( ( rule__Operation__Group_3_1__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3234:1: ( ( rule__Operation__Group_3_1__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3235:1: ( rule__Operation__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3236:1: ( rule__Operation__Group_3_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==33) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3236:2: rule__Operation__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl6651);
            	    rule__Operation__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_3_1__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3250:1: rule__Operation__Group_3_1__0 : rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 ;
    public final void rule__Operation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3254:1: ( rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3255:2: rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__06686);
            rule__Operation__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__06689);
            rule__Operation__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_1__0"


    // $ANTLR start "rule__Operation__Group_3_1__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3262:1: rule__Operation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3266:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3267:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3267:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3268:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Operation__Group_3_1__0__Impl6717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_3_1__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3281:1: rule__Operation__Group_3_1__1 : rule__Operation__Group_3_1__1__Impl ;
    public final void rule__Operation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3285:1: ( rule__Operation__Group_3_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3286:2: rule__Operation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__16748);
            rule__Operation__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_1__1"


    // $ANTLR start "rule__Operation__Group_3_1__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3292:1: rule__Operation__Group_3_1__1__Impl : ( ( rule__Operation__ParameterAssignment_3_1_1 ) ) ;
    public final void rule__Operation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3296:1: ( ( ( rule__Operation__ParameterAssignment_3_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3297:1: ( ( rule__Operation__ParameterAssignment_3_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3297:1: ( ( rule__Operation__ParameterAssignment_3_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3298:1: ( rule__Operation__ParameterAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParameterAssignment_3_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3299:1: ( rule__Operation__ParameterAssignment_3_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3299:2: rule__Operation__ParameterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ParameterAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl6775);
            rule__Operation__ParameterAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParameterAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_1__1__Impl"


    // $ANTLR start "rule__Operation__Group_5__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3313:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3317:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3318:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__06809);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__06812);
            rule__Operation__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3325:1: rule__Operation__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3329:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3330:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3330:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3331:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_5_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Operation__Group_5__0__Impl6840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getColonKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3344:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3348:1: ( rule__Operation__Group_5__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3349:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__16871);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3355:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__ReturnAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3359:1: ( ( ( rule__Operation__ReturnAssignment_5_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3360:1: ( ( rule__Operation__ReturnAssignment_5_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3360:1: ( ( rule__Operation__ReturnAssignment_5_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3361:1: ( rule__Operation__ReturnAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnAssignment_5_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3362:1: ( rule__Operation__ReturnAssignment_5_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3362:2: rule__Operation__ReturnAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Operation__ReturnAssignment_5_1_in_rule__Operation__Group_5__1__Impl6898);
            rule__Operation__ReturnAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getReturnAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3376:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3380:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3381:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06932);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06935);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3388:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3392:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3393:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3393:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3394:1: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3395:1: ( rule__Parameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3395:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl6962);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3405:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3409:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3410:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16992);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16995);
            rule__Parameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3417:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3421:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3422:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3422:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3423:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Parameter__Group__1__Impl7023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3436:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3440:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3441:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__27054);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__27057);
            rule__Parameter__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3448:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3452:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3453:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3453:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3454:1: ( rule__Parameter__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3455:1: ( rule__Parameter__TypeAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3455:2: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl7084);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3465:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3469:1: ( rule__Parameter__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3470:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__37114);
            rule__Parameter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3476:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3480:1: ( ( ( rule__Parameter__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3481:1: ( ( rule__Parameter__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3481:1: ( ( rule__Parameter__Group_3__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3482:1: ( rule__Parameter__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3483:1: ( rule__Parameter__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3483:2: rule__Parameter__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Group__3__Impl7141);
                    rule__Parameter__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group_3__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3501:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3505:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3506:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__07180);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__07183);
            rule__Parameter__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__0"


    // $ANTLR start "rule__Parameter__Group_3__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3513:1: rule__Parameter__Group_3__0__Impl : ( ( '=' ) ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3517:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3518:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3518:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3519:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3520:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3521:2: '='
            {
            match(input,35,FOLLOW_35_in_rule__Parameter__Group_3__0__Impl7212); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3532:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2 ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3536:1: ( rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3537:2: rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__17244);
            rule__Parameter__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3__2_in_rule__Parameter__Group_3__17247);
            rule__Parameter__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__1"


    // $ANTLR start "rule__Parameter__Group_3__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3544:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__ImplicitAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3548:1: ( ( ( rule__Parameter__ImplicitAssignment_3_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3549:1: ( ( rule__Parameter__ImplicitAssignment_3_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3549:1: ( ( rule__Parameter__ImplicitAssignment_3_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3550:1: ( rule__Parameter__ImplicitAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitAssignment_3_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3551:1: ( rule__Parameter__ImplicitAssignment_3_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3551:2: rule__Parameter__ImplicitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Parameter__ImplicitAssignment_3_1_in_rule__Parameter__Group_3__1__Impl7274);
            rule__Parameter__ImplicitAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getImplicitAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3561:1: rule__Parameter__Group_3__2 : rule__Parameter__Group_3__2__Impl ;
    public final void rule__Parameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3565:1: ( rule__Parameter__Group_3__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3566:2: rule__Parameter__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__2__Impl_in_rule__Parameter__Group_3__27304);
            rule__Parameter__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__2"


    // $ANTLR start "rule__Parameter__Group_3__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3572:1: rule__Parameter__Group_3__2__Impl : ( ( rule__Parameter__Group_3_2__0 )* ) ;
    public final void rule__Parameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3576:1: ( ( ( rule__Parameter__Group_3_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3577:1: ( ( rule__Parameter__Group_3_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3577:1: ( ( rule__Parameter__Group_3_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3578:1: ( rule__Parameter__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_3_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3579:1: ( rule__Parameter__Group_3_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==33) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==RULE_ID) ) {
                        int LA41_3 = input.LA(3);

                        if ( (LA41_3==EOF||LA41_3==33||LA41_3==38) ) {
                            alt41=1;
                        }


                    }
                    else if ( ((LA41_2>=RULE_NATURAL && LA41_2<=RULE_STRING)||LA41_2==18) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3579:2: rule__Parameter__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__Group_3__2__Impl7331);
            	    rule__Parameter__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__2__Impl"


    // $ANTLR start "rule__Parameter__Group_3_2__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3595:1: rule__Parameter__Group_3_2__0 : rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 ;
    public final void rule__Parameter__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3599:1: ( rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3600:2: rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__07368);
            rule__Parameter__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__07371);
            rule__Parameter__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_2__0"


    // $ANTLR start "rule__Parameter__Group_3_2__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3607:1: rule__Parameter__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Parameter__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3611:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3612:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3612:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3613:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Parameter__Group_3_2__0__Impl7399); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3_2__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3626:1: rule__Parameter__Group_3_2__1 : rule__Parameter__Group_3_2__1__Impl ;
    public final void rule__Parameter__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3630:1: ( rule__Parameter__Group_3_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3631:2: rule__Parameter__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__17430);
            rule__Parameter__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_2__1"


    // $ANTLR start "rule__Parameter__Group_3_2__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3637:1: rule__Parameter__Group_3_2__1__Impl : ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) ) ;
    public final void rule__Parameter__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3641:1: ( ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3642:1: ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3642:1: ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3643:1: ( rule__Parameter__ImplicitAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitAssignment_3_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3644:1: ( rule__Parameter__ImplicitAssignment_3_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3644:2: rule__Parameter__ImplicitAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__ImplicitAssignment_3_2_1_in_rule__Parameter__Group_3_2__1__Impl7457);
            rule__Parameter__ImplicitAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getImplicitAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3658:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3662:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3663:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__07491);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07494);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3670:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__UnorderedGroup_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3674:1: ( ( ( rule__Attribute__UnorderedGroup_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3675:1: ( ( rule__Attribute__UnorderedGroup_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3675:1: ( ( rule__Attribute__UnorderedGroup_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3676:1: ( rule__Attribute__UnorderedGroup_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getUnorderedGroup_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3677:1: ( rule__Attribute__UnorderedGroup_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3677:2: rule__Attribute__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0_in_rule__Attribute__Group__0__Impl7521);
            rule__Attribute__UnorderedGroup_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getUnorderedGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3687:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3691:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3692:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__17551);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17554);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3699:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3703:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3704:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3704:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3705:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3706:1: ( rule__Attribute__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3706:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl7581);
            rule__Attribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3716:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3720:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3721:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__27611);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27614);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3728:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3732:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3733:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3733:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3734:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__Attribute__Group__2__Impl7642); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3747:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3751:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3752:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__37673);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37676);
            rule__Attribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3759:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3763:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3764:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3764:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3765:1: ( rule__Attribute__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3766:1: ( rule__Attribute__TypeAssignment_3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3766:2: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl7703);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3776:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3780:1: ( rule__Attribute__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3781:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__47733);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3787:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3791:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3792:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3792:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3793:1: ( rule__Attribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3794:1: ( rule__Attribute__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3794:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl7760);
                    rule__Attribute__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3814:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3818:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3819:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__07801);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__07804);
            rule__Attribute__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3826:1: rule__Attribute__Group_4__0__Impl : ( ( '=' ) ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3830:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3831:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3831:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3832:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3833:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3834:2: '='
            {
            match(input,35,FOLLOW_35_in_rule__Attribute__Group_4__0__Impl7833); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3845:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3849:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3850:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__17865);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__17868);
            rule__Attribute__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3857:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__ImplicitAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3861:1: ( ( ( rule__Attribute__ImplicitAssignment_4_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3862:1: ( ( rule__Attribute__ImplicitAssignment_4_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3862:1: ( ( rule__Attribute__ImplicitAssignment_4_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3863:1: ( rule__Attribute__ImplicitAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitAssignment_4_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3864:1: ( rule__Attribute__ImplicitAssignment_4_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3864:2: rule__Attribute__ImplicitAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attribute__ImplicitAssignment_4_1_in_rule__Attribute__Group_4__1__Impl7895);
            rule__Attribute__ImplicitAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getImplicitAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3874:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3878:1: ( rule__Attribute__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3879:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__27925);
            rule__Attribute__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2"


    // $ANTLR start "rule__Attribute__Group_4__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3885:1: rule__Attribute__Group_4__2__Impl : ( ( rule__Attribute__Group_4_2__0 )* ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3889:1: ( ( ( rule__Attribute__Group_4_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3890:1: ( ( rule__Attribute__Group_4_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3890:1: ( ( rule__Attribute__Group_4_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3891:1: ( rule__Attribute__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3892:1: ( rule__Attribute__Group_4_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==33) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3892:2: rule__Attribute__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__Group_4_2__0_in_rule__Attribute__Group_4__2__Impl7952);
            	    rule__Attribute__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3908:1: rule__Attribute__Group_4_2__0 : rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 ;
    public final void rule__Attribute__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3912:1: ( rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3913:2: rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__0__Impl_in_rule__Attribute__Group_4_2__07989);
            rule__Attribute__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__1_in_rule__Attribute__Group_4_2__07992);
            rule__Attribute__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__0"


    // $ANTLR start "rule__Attribute__Group_4_2__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3920:1: rule__Attribute__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3924:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3925:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3925:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3926:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Attribute__Group_4_2__0__Impl8020); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3939:1: rule__Attribute__Group_4_2__1 : rule__Attribute__Group_4_2__1__Impl ;
    public final void rule__Attribute__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3943:1: ( rule__Attribute__Group_4_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3944:2: rule__Attribute__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__1__Impl_in_rule__Attribute__Group_4_2__18051);
            rule__Attribute__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__1"


    // $ANTLR start "rule__Attribute__Group_4_2__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3950:1: rule__Attribute__Group_4_2__1__Impl : ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) ) ;
    public final void rule__Attribute__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3954:1: ( ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3955:1: ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3955:1: ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3956:1: ( rule__Attribute__ImplicitAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitAssignment_4_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3957:1: ( rule__Attribute__ImplicitAssignment_4_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3957:2: rule__Attribute__ImplicitAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__ImplicitAssignment_4_2_1_in_rule__Attribute__Group_4_2__1__Impl8078);
            rule__Attribute__ImplicitAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getImplicitAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3971:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3975:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3976:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08112);
            rule__Reference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08115);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3983:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__TypeAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3987:1: ( ( ( rule__Reference__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3988:1: ( ( rule__Reference__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3988:1: ( ( rule__Reference__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3989:1: ( rule__Reference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3990:1: ( rule__Reference__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3990:2: rule__Reference__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl8142);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4000:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4004:1: ( rule__Reference__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4005:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18172);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4011:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ArrayAssignment_1 )* ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4015:1: ( ( ( rule__Reference__ArrayAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4016:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4016:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4017:1: ( rule__Reference__ArrayAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4018:1: ( rule__Reference__ArrayAssignment_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==40) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4018:2: rule__Reference__ArrayAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl8199);
            	    rule__Reference__ArrayAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4032:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4036:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4037:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__08234);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__08237);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4044:1: rule__Array__Group__0__Impl : ( () ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4048:1: ( ( () ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4049:1: ( () )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4049:1: ( () )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4050:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getArrayAction_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4051:1: ()
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4053:1: 
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4063:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4067:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4068:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__18295);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__18298);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4075:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4079:1: ( ( '[' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4080:1: ( '[' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4080:1: ( '[' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4081:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Array__Group__1__Impl8326); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4094:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4098:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4099:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__28357);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__28360);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4106:1: rule__Array__Group__2__Impl : ( ( rule__Array__SizeAssignment_2 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4110:1: ( ( ( rule__Array__SizeAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4111:1: ( ( rule__Array__SizeAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4111:1: ( ( rule__Array__SizeAssignment_2 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4112:1: ( rule__Array__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4113:1: ( rule__Array__SizeAssignment_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_NATURAL) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4113:2: rule__Array__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl8387);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4123:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4127:1: ( rule__Array__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4128:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__38418);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4134:1: rule__Array__Group__3__Impl : ( ']' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4138:1: ( ( ']' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4139:1: ( ']' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4139:1: ( ']' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4140:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__Array__Group__3__Impl8446); if (state.failed) return ;
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


    // $ANTLR start "rule__Annotation__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4161:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4165:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4166:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__08485);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__08488);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4173:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4177:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4178:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4178:1: ( '@' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4179:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Annotation__Group__0__Impl8516); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4192:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4196:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4197:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__18547);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__18550);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4204:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4208:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4209:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4209:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4210:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4211:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4211:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl8577);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4221:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4225:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4226:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__28607);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4232:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4236:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4237:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4237:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4238:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4239:1: ( rule__Annotation__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4239:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl8634);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4255:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4259:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4260:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__08671);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__08674);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4267:1: rule__Annotation__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4271:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4272:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4272:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4273:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4274:1: ( '(' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4275:2: '('
            {
            match(input,37,FOLLOW_37_in_rule__Annotation__Group_2__0__Impl8703); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4286:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4290:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4291:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__18735);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__18738);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4298:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4302:1: ( ( ( rule__Annotation__ParameterAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4303:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4303:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4304:1: ( rule__Annotation__ParameterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4305:1: ( rule__Annotation__ParameterAssignment_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4305:2: rule__Annotation__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl8765);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4315:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4319:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4320:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__28795);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__28798);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4327:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4331:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4332:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4332:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4333:1: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4334:1: ( rule__Annotation__Group_2_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==33) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4334:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl8825);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4344:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4348:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4349:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__38856);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4355:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4359:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4360:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4360:1: ( ')' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4361:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,38,FOLLOW_38_in_rule__Annotation__Group_2__3__Impl8884); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4382:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4386:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4387:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__08923);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__08926);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4394:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4398:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4399:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4399:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4400:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Annotation__Group_2_2__0__Impl8954); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4413:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4417:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4418:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__18985);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4424:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4428:1: ( ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4429:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4429:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4430:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4431:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4431:2: rule__Annotation__ParameterAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl9012);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4446:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4450:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4451:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09047);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09050);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4458:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4462:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4463:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4463:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4464:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9077); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4475:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4479:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4480:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19106);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4486:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4490:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4491:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4491:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4492:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4493:1: ( rule__ExtendedID__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==43) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4493:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9133);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4507:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4511:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4512:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__09168);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__09171);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4519:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4523:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4524:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4524:1: ( '.' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4525:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__ExtendedID__Group_1__0__Impl9199); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4538:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4542:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4543:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__19230);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4549:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4553:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4554:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4554:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4555:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl9257); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4570:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4574:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4575:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__09290);
            rule__Real__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__09293);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4582:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4586:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4587:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4587:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4588:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4589:1: ( '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==18) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4590:2: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__Real__Group__0__Impl9322); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4601:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4605:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4606:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__19355);
            rule__Real__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__19358);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4613:1: rule__Real__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4617:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4618:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4618:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4619:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl9385); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4630:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4634:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4635:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__29414);
            rule__Real__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__3_in_rule__Real__Group__29417);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4642:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4646:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4647:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4647:1: ( '.' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4648:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__Real__Group__2__Impl9445); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4661:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4665:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4666:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__39476);
            rule__Real__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__4_in_rule__Real__Group__39479);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4673:1: rule__Real__Group__3__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4677:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4678:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4678:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4679:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl9506); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4690:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4694:1: ( rule__Real__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4695:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__49535);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4701:1: rule__Real__Group__4__Impl : ( ( rule__Real__Group_4__0 )? ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4705:1: ( ( ( rule__Real__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4706:1: ( ( rule__Real__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4706:1: ( ( rule__Real__Group_4__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4707:1: ( rule__Real__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4708:1: ( rule__Real__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=15 && LA50_0<=16)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4708:2: rule__Real__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl9562);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4728:1: rule__Real__Group_4__0 : rule__Real__Group_4__0__Impl rule__Real__Group_4__1 ;
    public final void rule__Real__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4732:1: ( rule__Real__Group_4__0__Impl rule__Real__Group_4__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4733:2: rule__Real__Group_4__0__Impl rule__Real__Group_4__1
            {
            pushFollow(FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__09603);
            rule__Real__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__09606);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4740:1: rule__Real__Group_4__0__Impl : ( ( rule__Real__Alternatives_4_0 ) ) ;
    public final void rule__Real__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4744:1: ( ( ( rule__Real__Alternatives_4_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4745:1: ( ( rule__Real__Alternatives_4_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4745:1: ( ( rule__Real__Alternatives_4_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4746:1: ( rule__Real__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4747:1: ( rule__Real__Alternatives_4_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4747:2: rule__Real__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl9633);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4757:1: rule__Real__Group_4__1 : rule__Real__Group_4__1__Impl rule__Real__Group_4__2 ;
    public final void rule__Real__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4761:1: ( rule__Real__Group_4__1__Impl rule__Real__Group_4__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4762:2: rule__Real__Group_4__1__Impl rule__Real__Group_4__2
            {
            pushFollow(FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__19663);
            rule__Real__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__19666);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4769:1: rule__Real__Group_4__1__Impl : ( ( rule__Real__Alternatives_4_1 ) ) ;
    public final void rule__Real__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4773:1: ( ( ( rule__Real__Alternatives_4_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4774:1: ( ( rule__Real__Alternatives_4_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4774:1: ( ( rule__Real__Alternatives_4_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4775:1: ( rule__Real__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4776:1: ( rule__Real__Alternatives_4_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4776:2: rule__Real__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl9693);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4786:1: rule__Real__Group_4__2 : rule__Real__Group_4__2__Impl ;
    public final void rule__Real__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4790:1: ( rule__Real__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4791:2: rule__Real__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__29723);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4797:1: rule__Real__Group_4__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4801:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4802:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4802:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4803:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl9750); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4820:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4824:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4825:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__09785);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__09788);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4832:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4836:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4837:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4837:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4838:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4839:1: ( '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4840:2: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__Integer__Group__0__Impl9817); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4851:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4855:1: ( rule__Integer__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4856:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__19850);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4862:1: rule__Integer__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4866:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4867:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4867:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4868:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl9877); if (state.failed) return ;
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


    // $ANTLR start "rule__Operation__UnorderedGroup_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4884:1: rule__Operation__UnorderedGroup_0 : ( rule__Operation__UnorderedGroup_0__0 )? ;
    public final void rule__Operation__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4889:1: ( ( rule__Operation__UnorderedGroup_0__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4890:2: ( rule__Operation__UnorderedGroup_0__0 )?
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4890:2: ( rule__Operation__UnorderedGroup_0__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Operation__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__0_in_rule__Operation__UnorderedGroup_09911);
                    rule__Operation__UnorderedGroup_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__UnorderedGroup_0"


    // $ANTLR start "rule__Operation__UnorderedGroup_0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4900:1: rule__Operation__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) ) ;
    public final void rule__Operation__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4905:1: ( ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4906:3: ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4906:3: ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4908:4: ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4908:4: ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4909:5: {...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Operation__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4909:106: ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4910:6: ( ( rule__Operation__VisibilityAssignment_0_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4916:6: ( ( rule__Operation__VisibilityAssignment_0_0 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4918:7: ( rule__Operation__VisibilityAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getVisibilityAssignment_0_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4919:7: ( rule__Operation__VisibilityAssignment_0_0 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4919:8: rule__Operation__VisibilityAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Operation__VisibilityAssignment_0_0_in_rule__Operation__UnorderedGroup_0__Impl9998);
                    rule__Operation__VisibilityAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getVisibilityAssignment_0_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4925:4: ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4925:4: ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4926:5: {...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Operation__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4926:106: ( ( ( rule__Operation__StaticAssignment_0_1 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4927:6: ( ( rule__Operation__StaticAssignment_0_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4933:6: ( ( rule__Operation__StaticAssignment_0_1 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4935:7: ( rule__Operation__StaticAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getStaticAssignment_0_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4936:7: ( rule__Operation__StaticAssignment_0_1 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4936:8: rule__Operation__StaticAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Operation__StaticAssignment_0_1_in_rule__Operation__UnorderedGroup_0__Impl10089);
                    rule__Operation__StaticAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getStaticAssignment_0_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__Operation__UnorderedGroup_0__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4951:1: rule__Operation__UnorderedGroup_0__0 : rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )? ;
    public final void rule__Operation__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4955:1: ( rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4956:2: rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__010148);
            rule__Operation__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4957:2: ( rule__Operation__UnorderedGroup_0__1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Operation__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__1_in_rule__Operation__UnorderedGroup_0__010151);
                    rule__Operation__UnorderedGroup_0__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__UnorderedGroup_0__0"


    // $ANTLR start "rule__Operation__UnorderedGroup_0__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4964:1: rule__Operation__UnorderedGroup_0__1 : rule__Operation__UnorderedGroup_0__Impl ;
    public final void rule__Operation__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4968:1: ( rule__Operation__UnorderedGroup_0__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4969:2: rule__Operation__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__110176);
            rule__Operation__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__UnorderedGroup_0__1"


    // $ANTLR start "rule__Attribute__UnorderedGroup_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4980:1: rule__Attribute__UnorderedGroup_0 : ( rule__Attribute__UnorderedGroup_0__0 )? ;
    public final void rule__Attribute__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4985:1: ( ( rule__Attribute__UnorderedGroup_0__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4986:2: ( rule__Attribute__UnorderedGroup_0__0 )?
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4986:2: ( rule__Attribute__UnorderedGroup_0__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Attribute__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_rule__Attribute__UnorderedGroup_010204);
                    rule__Attribute__UnorderedGroup_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_0"


    // $ANTLR start "rule__Attribute__UnorderedGroup_0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4996:1: rule__Attribute__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5001:1: ( ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5002:3: ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5002:3: ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5004:4: ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5004:4: ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5005:5: {...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5005:106: ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5006:6: ( ( rule__Attribute__VisibilityAssignment_0_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5012:6: ( ( rule__Attribute__VisibilityAssignment_0_0 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5014:7: ( rule__Attribute__VisibilityAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5015:7: ( rule__Attribute__VisibilityAssignment_0_0 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5015:8: rule__Attribute__VisibilityAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__VisibilityAssignment_0_0_in_rule__Attribute__UnorderedGroup_0__Impl10291);
                    rule__Attribute__VisibilityAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getVisibilityAssignment_0_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5021:4: ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5021:4: ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5022:5: {...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5022:106: ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5023:6: ( ( rule__Attribute__StaticAssignment_0_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5029:6: ( ( rule__Attribute__StaticAssignment_0_1 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5031:7: ( rule__Attribute__StaticAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getStaticAssignment_0_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5032:7: ( rule__Attribute__StaticAssignment_0_1 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5032:8: rule__Attribute__StaticAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__StaticAssignment_0_1_in_rule__Attribute__UnorderedGroup_0__Impl10382);
                    rule__Attribute__StaticAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getStaticAssignment_0_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__Attribute__UnorderedGroup_0__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5047:1: rule__Attribute__UnorderedGroup_0__0 : rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )? ;
    public final void rule__Attribute__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5051:1: ( rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5052:2: rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__010441);
            rule__Attribute__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5053:2: ( rule__Attribute__UnorderedGroup_0__1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Attribute__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_rule__Attribute__UnorderedGroup_0__010444);
                    rule__Attribute__UnorderedGroup_0__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_0__0"


    // $ANTLR start "rule__Attribute__UnorderedGroup_0__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5060:1: rule__Attribute__UnorderedGroup_0__1 : rule__Attribute__UnorderedGroup_0__Impl ;
    public final void rule__Attribute__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5064:1: ( rule__Attribute__UnorderedGroup_0__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5065:2: rule__Attribute__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__110469);
            rule__Attribute__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__UnorderedGroup_0__1"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5076:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5080:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5081:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5081:1: ( ruleImport )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5082:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_010501);
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


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5091:1: rule__Model__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5095:1: ( ( ruleElement ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5096:1: ( ruleElement )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5096:1: ( ruleElement )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5097:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_110532);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5106:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5110:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5111:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5111:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5112:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_110563); if (state.failed) return ;
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


    // $ANTLR start "rule__Datatype__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5121:1: rule__Datatype__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Datatype__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5125:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5126:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5126:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5127:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Datatype__AnnotationAssignment_010594);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__AnnotationAssignment_0"


    // $ANTLR start "rule__Datatype__NameAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5136:1: rule__Datatype__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5140:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5141:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5141:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5142:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Datatype__NameAssignment_210625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__NameAssignment_2"


    // $ANTLR start "rule__Package__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5151:1: rule__Package__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Package__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5155:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5156:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5156:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5157:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Package__AnnotationAssignment_010656);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AnnotationAssignment_0"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5166:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5170:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5171:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5171:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5172:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_210687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__ElementAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5181:1: rule__Package__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__Package__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5185:1: ( ( ruleElement ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5186:1: ( ruleElement )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5186:1: ( ruleElement )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5187:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Package__ElementAssignment_310718);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementAssignment_3"


    // $ANTLR start "rule__Classifier__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5196:1: rule__Classifier__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Classifier__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5200:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5201:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5201:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5202:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Classifier__AnnotationAssignment_010749);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__AnnotationAssignment_0"


    // $ANTLR start "rule__Classifier__NameAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5211:1: rule__Classifier__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Classifier__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5215:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5216:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5216:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5217:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__NameAssignment_210780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__NameAssignment_2"


    // $ANTLR start "rule__Classifier__GeneralizationAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5226:1: rule__Classifier__GeneralizationAssignment_3 : ( ruleGeneralization ) ;
    public final void rule__Classifier__GeneralizationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5230:1: ( ( ruleGeneralization ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5231:1: ( ruleGeneralization )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5231:1: ( ruleGeneralization )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5232:1: ruleGeneralization
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGeneralizationGeneralizationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGeneralization_in_rule__Classifier__GeneralizationAssignment_310811);
            ruleGeneralization();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getGeneralizationGeneralizationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__GeneralizationAssignment_3"


    // $ANTLR start "rule__Classifier__ConstraintAssignment_4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5241:1: rule__Classifier__ConstraintAssignment_4 : ( RULE_CONSTRAINT ) ;
    public final void rule__Classifier__ConstraintAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5245:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5246:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5246:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5247:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Classifier__ConstraintAssignment_410842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__ConstraintAssignment_4"


    // $ANTLR start "rule__Classifier__FeatureAssignment_5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5256:1: rule__Classifier__FeatureAssignment_5 : ( ruleFeature ) ;
    public final void rule__Classifier__FeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5260:1: ( ( ruleFeature ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5261:1: ( ruleFeature )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5261:1: ( ruleFeature )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5262:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFeatureFeatureParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_rule__Classifier__FeatureAssignment_510873);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getFeatureFeatureParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__FeatureAssignment_5"


    // $ANTLR start "rule__Generalization__ClassifierAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5271:1: rule__Generalization__ClassifierAssignment_1 : ( ruleType ) ;
    public final void rule__Generalization__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5275:1: ( ( ruleType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5276:1: ( ruleType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5276:1: ( ruleType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5277:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Generalization__ClassifierAssignment_110904);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__ClassifierAssignment_1"


    // $ANTLR start "rule__Generalization__ClassifierAssignment_2_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5286:1: rule__Generalization__ClassifierAssignment_2_1 : ( ruleType ) ;
    public final void rule__Generalization__ClassifierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5290:1: ( ( ruleType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5291:1: ( ruleType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5291:1: ( ruleType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5292:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Generalization__ClassifierAssignment_2_110935);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__ClassifierAssignment_2_1"


    // $ANTLR start "rule__Type__VisibilityAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5301:1: rule__Type__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Type__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5305:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5306:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5306:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5307:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Type__VisibilityAssignment_010966);
            ruleVisibility();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__VisibilityAssignment_0"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5316:1: rule__Type__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5320:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5321:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5321:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5322:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Type__NameAssignment_110997);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Feature__ConstraintAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5331:1: rule__Feature__ConstraintAssignment_1 : ( RULE_CONSTRAINT ) ;
    public final void rule__Feature__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5335:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5336:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5336:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5337:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getConstraintCONSTRAINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Feature__ConstraintAssignment_111028); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getConstraintCONSTRAINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ConstraintAssignment_1"


    // $ANTLR start "rule__Enumeration__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5346:1: rule__Enumeration__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Enumeration__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5350:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5351:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5351:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5352:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Enumeration__AnnotationAssignment_011059);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__AnnotationAssignment_0"


    // $ANTLR start "rule__Enumeration__NameAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5361:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5365:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5366:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5366:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5367:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_211090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__ConstraintAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5376:1: rule__Enumeration__ConstraintAssignment_3 : ( RULE_CONSTRAINT ) ;
    public final void rule__Enumeration__ConstraintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5380:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5381:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5381:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5382:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getConstraintCONSTRAINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Enumeration__ConstraintAssignment_311121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getConstraintCONSTRAINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ConstraintAssignment_3"


    // $ANTLR start "rule__Enumeration__EnumeratorAssignment_4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5391:1: rule__Enumeration__EnumeratorAssignment_4 : ( ruleEnumerator ) ;
    public final void rule__Enumeration__EnumeratorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5395:1: ( ( ruleEnumerator ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5396:1: ( ruleEnumerator )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5396:1: ( ruleEnumerator )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5397:1: ruleEnumerator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumeratorEnumeratorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleEnumerator_in_rule__Enumeration__EnumeratorAssignment_411152);
            ruleEnumerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getEnumeratorEnumeratorParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__EnumeratorAssignment_4"


    // $ANTLR start "rule__Enumerator__NameAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5406:1: rule__Enumerator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Enumerator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5410:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5411:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5411:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5412:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumerator__NameAssignment_011183); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__NameAssignment_0"


    // $ANTLR start "rule__Enumerator__ValueAssignment_1_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5421:1: rule__Enumerator__ValueAssignment_1_1 : ( ruleImplicitValue ) ;
    public final void rule__Enumerator__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5425:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5426:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5426:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5427:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getValueImplicitValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Enumerator__ValueAssignment_1_111214);
            ruleImplicitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getValueImplicitValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__ValueAssignment_1_1"


    // $ANTLR start "rule__Enumerator__ConstraintAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5436:1: rule__Enumerator__ConstraintAssignment_2 : ( RULE_CONSTRAINT ) ;
    public final void rule__Enumerator__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5440:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5441:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5441:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5442:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getConstraintCONSTRAINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Enumerator__ConstraintAssignment_211245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumeratorAccess().getConstraintCONSTRAINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerator__ConstraintAssignment_2"


    // $ANTLR start "rule__Relationship__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5451:1: rule__Relationship__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Relationship__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5455:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5456:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5456:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5457:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Relationship__AnnotationAssignment_011276);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__AnnotationAssignment_0"


    // $ANTLR start "rule__Relationship__TypeAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5466:1: rule__Relationship__TypeAssignment_1 : ( ruleRelationshipType ) ;
    public final void rule__Relationship__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5470:1: ( ( ruleRelationshipType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5471:1: ( ruleRelationshipType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5471:1: ( ruleRelationshipType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5472:1: ruleRelationshipType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRelationshipType_in_rule__Relationship__TypeAssignment_111307);
            ruleRelationshipType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TypeAssignment_1"


    // $ANTLR start "rule__Relationship__LabelAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5481:1: rule__Relationship__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Relationship__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5485:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5486:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5486:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5487:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relationship__LabelAssignment_211338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__LabelAssignment_2"


    // $ANTLR start "rule__Relationship__HeadNavigableAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5496:1: rule__Relationship__HeadNavigableAssignment_3 : ( ( 'navigable' ) ) ;
    public final void rule__Relationship__HeadNavigableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5500:1: ( ( ( 'navigable' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5501:1: ( ( 'navigable' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5501:1: ( ( 'navigable' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5502:1: ( 'navigable' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadNavigableNavigableKeyword_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5503:1: ( 'navigable' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5504:1: 'navigable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadNavigableNavigableKeyword_3_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Relationship__HeadNavigableAssignment_311374); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadNavigableNavigableKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadNavigableNavigableKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__HeadNavigableAssignment_3"


    // $ANTLR start "rule__Relationship__HeadMultiplicityAssignment_4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5519:1: rule__Relationship__HeadMultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Relationship__HeadMultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5523:1: ( ( ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5524:1: ( ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5524:1: ( ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5525:1: ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadMultiplicityMultiplicityParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Relationship__HeadMultiplicityAssignment_411413);
            ruleMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadMultiplicityMultiplicityParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__HeadMultiplicityAssignment_4"


    // $ANTLR start "rule__Relationship__HeadAssignment_5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5534:1: rule__Relationship__HeadAssignment_5 : ( ruleExtendedID ) ;
    public final void rule__Relationship__HeadAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5538:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5539:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5539:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5540:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadExtendedIDParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Relationship__HeadAssignment_511444);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadExtendedIDParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__HeadAssignment_5"


    // $ANTLR start "rule__Relationship__HeadLabelAssignment_6"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5549:1: rule__Relationship__HeadLabelAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Relationship__HeadLabelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5553:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5554:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5554:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5555:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadLabelSTRINGTerminalRuleCall_6_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relationship__HeadLabelAssignment_611475); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getHeadLabelSTRINGTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__HeadLabelAssignment_6"


    // $ANTLR start "rule__Relationship__TailNavigableAssignment_7"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5564:1: rule__Relationship__TailNavigableAssignment_7 : ( ( 'navigable' ) ) ;
    public final void rule__Relationship__TailNavigableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5568:1: ( ( ( 'navigable' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5569:1: ( ( 'navigable' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5569:1: ( ( 'navigable' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5570:1: ( 'navigable' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailNavigableNavigableKeyword_7_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5571:1: ( 'navigable' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5572:1: 'navigable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailNavigableNavigableKeyword_7_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Relationship__TailNavigableAssignment_711511); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailNavigableNavigableKeyword_7_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailNavigableNavigableKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TailNavigableAssignment_7"


    // $ANTLR start "rule__Relationship__TailMultiplicityAssignment_8"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5587:1: rule__Relationship__TailMultiplicityAssignment_8 : ( ruleMultiplicity ) ;
    public final void rule__Relationship__TailMultiplicityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5591:1: ( ( ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5592:1: ( ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5592:1: ( ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5593:1: ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailMultiplicityMultiplicityParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Relationship__TailMultiplicityAssignment_811550);
            ruleMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailMultiplicityMultiplicityParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TailMultiplicityAssignment_8"


    // $ANTLR start "rule__Relationship__TailAssignment_9"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5602:1: rule__Relationship__TailAssignment_9 : ( ruleExtendedID ) ;
    public final void rule__Relationship__TailAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5606:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5607:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5607:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5608:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailExtendedIDParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Relationship__TailAssignment_911581);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailExtendedIDParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TailAssignment_9"


    // $ANTLR start "rule__Relationship__TailLabelAssignment_10"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5617:1: rule__Relationship__TailLabelAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Relationship__TailLabelAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5621:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5622:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5622:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5623:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailLabelSTRINGTerminalRuleCall_10_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relationship__TailLabelAssignment_1011612); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTailLabelSTRINGTerminalRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TailLabelAssignment_10"


    // $ANTLR start "rule__Multiplicity__UpperAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5632:1: rule__Multiplicity__UpperAssignment_0 : ( ruleMultiplicityValue ) ;
    public final void rule__Multiplicity__UpperAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5636:1: ( ( ruleMultiplicityValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5637:1: ( ruleMultiplicityValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5637:1: ( ruleMultiplicityValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5638:1: ruleMultiplicityValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getUpperMultiplicityValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_rule__Multiplicity__UpperAssignment_011643);
            ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityAccess().getUpperMultiplicityValueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__UpperAssignment_0"


    // $ANTLR start "rule__Multiplicity__LowerAssignment_1_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5647:1: rule__Multiplicity__LowerAssignment_1_1 : ( ruleMultiplicityValue ) ;
    public final void rule__Multiplicity__LowerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5651:1: ( ( ruleMultiplicityValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5652:1: ( ruleMultiplicityValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5652:1: ( ruleMultiplicityValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5653:1: ruleMultiplicityValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getLowerMultiplicityValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_rule__Multiplicity__LowerAssignment_1_111674);
            ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityAccess().getLowerMultiplicityValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__LowerAssignment_1_1"


    // $ANTLR start "rule__Constant__VisibilityAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5662:1: rule__Constant__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Constant__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5666:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5667:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5667:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5668:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Constant__VisibilityAssignment_011705);
            ruleVisibility();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__VisibilityAssignment_0"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5677:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5681:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5682:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5682:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5683:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_111736); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_1"


    // $ANTLR start "rule__Constant__ValueAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5692:1: rule__Constant__ValueAssignment_3 : ( ruleImplicitValue ) ;
    public final void rule__Constant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5696:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5697:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5697:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5698:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueImplicitValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Constant__ValueAssignment_311767);
            ruleImplicitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getValueImplicitValueParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment_3"


    // $ANTLR start "rule__Operation__VisibilityAssignment_0_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5707:1: rule__Operation__VisibilityAssignment_0_0 : ( ruleVisibility ) ;
    public final void rule__Operation__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5711:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5712:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5712:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5713:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_0_011798);
            ruleVisibility();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__VisibilityAssignment_0_0"


    // $ANTLR start "rule__Operation__StaticAssignment_0_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5722:1: rule__Operation__StaticAssignment_0_1 : ( ( 'static' ) ) ;
    public final void rule__Operation__StaticAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5726:1: ( ( ( 'static' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5727:1: ( ( 'static' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5727:1: ( ( 'static' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5728:1: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5729:1: ( 'static' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5730:1: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Operation__StaticAssignment_0_111834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__StaticAssignment_0_1"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5745:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5749:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5750:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5750:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5751:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_111873); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__ParameterAssignment_3_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5760:1: rule__Operation__ParameterAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Operation__ParameterAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5764:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5765:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5765:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5766:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParameterAssignment_3_011904);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParameterAssignment_3_0"


    // $ANTLR start "rule__Operation__ParameterAssignment_3_1_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5775:1: rule__Operation__ParameterAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParameterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5779:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5780:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5780:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5781:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParameterAssignment_3_1_111935);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParameterAssignment_3_1_1"


    // $ANTLR start "rule__Operation__ReturnAssignment_5_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5790:1: rule__Operation__ReturnAssignment_5_1 : ( ruleReference ) ;
    public final void rule__Operation__ReturnAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5794:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5795:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5795:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5796:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Operation__ReturnAssignment_5_111966);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ReturnAssignment_5_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5805:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5809:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5810:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5810:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5811:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_011997); if (state.failed) return ;
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


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5820:1: rule__Parameter__TypeAssignment_2 : ( ruleReference ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5824:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5825:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5825:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5826:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_212028);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Parameter__ImplicitAssignment_3_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5835:1: rule__Parameter__ImplicitAssignment_3_1 : ( ruleImplicitValue ) ;
    public final void rule__Parameter__ImplicitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5839:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5840:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5840:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5841:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Parameter__ImplicitAssignment_3_112059);
            ruleImplicitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ImplicitAssignment_3_1"


    // $ANTLR start "rule__Parameter__ImplicitAssignment_3_2_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5850:1: rule__Parameter__ImplicitAssignment_3_2_1 : ( ruleImplicitValue ) ;
    public final void rule__Parameter__ImplicitAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5854:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5855:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5855:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5856:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Parameter__ImplicitAssignment_3_2_112090);
            ruleImplicitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ImplicitAssignment_3_2_1"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_0_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5865:1: rule__Attribute__VisibilityAssignment_0_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5869:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5870:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5870:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5871:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Attribute__VisibilityAssignment_0_012121);
            ruleVisibility();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__VisibilityAssignment_0_0"


    // $ANTLR start "rule__Attribute__StaticAssignment_0_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5880:1: rule__Attribute__StaticAssignment_0_1 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5884:1: ( ( ( 'static' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5885:1: ( ( 'static' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5885:1: ( ( 'static' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5886:1: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5887:1: ( 'static' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5888:1: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Attribute__StaticAssignment_0_112157); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__StaticAssignment_0_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5903:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5907:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5908:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5908:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5909:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_112196); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5918:1: rule__Attribute__TypeAssignment_3 : ( ruleReference ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5922:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5923:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5923:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5924:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_312227);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Attribute__ImplicitAssignment_4_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5933:1: rule__Attribute__ImplicitAssignment_4_1 : ( ruleImplicitValue ) ;
    public final void rule__Attribute__ImplicitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5937:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5938:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5938:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5939:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Attribute__ImplicitAssignment_4_112258);
            ruleImplicitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ImplicitAssignment_4_1"


    // $ANTLR start "rule__Attribute__ImplicitAssignment_4_2_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5948:1: rule__Attribute__ImplicitAssignment_4_2_1 : ( ruleImplicitValue ) ;
    public final void rule__Attribute__ImplicitAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5952:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5953:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5953:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5954:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Attribute__ImplicitAssignment_4_2_112289);
            ruleImplicitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ImplicitAssignment_4_2_1"


    // $ANTLR start "rule__Reference__TypeAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5963:1: rule__Reference__TypeAssignment_0 : ( ruleExtendedID ) ;
    public final void rule__Reference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5967:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5968:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5968:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5969:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeExtendedIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Reference__TypeAssignment_012320);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getTypeExtendedIDParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5978:1: rule__Reference__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__Reference__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5982:1: ( ( ruleArray ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5983:1: ( ruleArray )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5983:1: ( ruleArray )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5984:1: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_112351);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5993:1: rule__Array__SizeAssignment_2 : ( RULE_NATURAL ) ;
    public final void rule__Array__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5997:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5998:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5998:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5999:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeNATURALTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Array__SizeAssignment_212382); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6008:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6012:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6013:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6013:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6014:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_112413);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6023:1: rule__Annotation__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6027:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6028:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6028:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6029:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_112444);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6038:1: rule__Annotation__ParameterAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6042:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6043:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6043:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6044:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_112475);
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

    // $ANTLR start synpred70_InternalClassmodel
    public final void synpred70_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4890:2: ( rule__Operation__UnorderedGroup_0__0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4890:2: rule__Operation__UnorderedGroup_0__0
        {
        pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__0_in_synpred70_InternalClassmodel9911);
        rule__Operation__UnorderedGroup_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalClassmodel

    // $ANTLR start synpred71_InternalClassmodel
    public final void synpred71_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4908:4: ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4908:4: ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) )
        {
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4908:4: ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4909:5: {...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred71_InternalClassmodel", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4909:106: ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4910:6: ( ( rule__Operation__VisibilityAssignment_0_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4916:6: ( ( rule__Operation__VisibilityAssignment_0_0 ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4918:7: ( rule__Operation__VisibilityAssignment_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getOperationAccess().getVisibilityAssignment_0_0()); 
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4919:7: ( rule__Operation__VisibilityAssignment_0_0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4919:8: rule__Operation__VisibilityAssignment_0_0
        {
        pushFollow(FOLLOW_rule__Operation__VisibilityAssignment_0_0_in_synpred71_InternalClassmodel9998);
        rule__Operation__VisibilityAssignment_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred71_InternalClassmodel

    // $ANTLR start synpred72_InternalClassmodel
    public final void synpred72_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4957:2: ( rule__Operation__UnorderedGroup_0__1 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4957:2: rule__Operation__UnorderedGroup_0__1
        {
        pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__1_in_synpred72_InternalClassmodel10151);
        rule__Operation__UnorderedGroup_0__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalClassmodel

    // $ANTLR start synpred73_InternalClassmodel
    public final void synpred73_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4986:2: ( rule__Attribute__UnorderedGroup_0__0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4986:2: rule__Attribute__UnorderedGroup_0__0
        {
        pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_synpred73_InternalClassmodel10204);
        rule__Attribute__UnorderedGroup_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalClassmodel

    // $ANTLR start synpred74_InternalClassmodel
    public final void synpred74_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5004:4: ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5004:4: ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) )
        {
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5004:4: ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5005:5: {...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred74_InternalClassmodel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5005:106: ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5006:6: ( ( rule__Attribute__VisibilityAssignment_0_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5012:6: ( ( rule__Attribute__VisibilityAssignment_0_0 ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5014:7: ( rule__Attribute__VisibilityAssignment_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0_0()); 
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5015:7: ( rule__Attribute__VisibilityAssignment_0_0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5015:8: rule__Attribute__VisibilityAssignment_0_0
        {
        pushFollow(FOLLOW_rule__Attribute__VisibilityAssignment_0_0_in_synpred74_InternalClassmodel10291);
        rule__Attribute__VisibilityAssignment_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred74_InternalClassmodel

    // $ANTLR start synpred75_InternalClassmodel
    public final void synpred75_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5053:2: ( rule__Attribute__UnorderedGroup_0__1 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5053:2: rule__Attribute__UnorderedGroup_0__1
        {
        pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_synpred75_InternalClassmodel10444);
        rule__Attribute__UnorderedGroup_0__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalClassmodel

    // Delegated rules

    public final boolean synpred75_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\125\uffff";
    static final String DFA1_eofS =
        "\125\uffff";
    static final String DFA1_minS =
        "\1\23\1\10\5\uffff\1\23\2\10\1\23\1\47\1\10\1\41\1\10\2\4\1\10"+
        "\1\23\1\41\1\51\4\41\1\4\2\41\1\47\2\4\1\10\4\41\1\4\1\41\1\17\1"+
        "\41\1\4\2\21\1\10\2\4\1\17\2\4\1\41\1\51\4\41\1\4\2\41\2\21\1\41"+
        "\4\4\3\41\1\4\2\41\1\17\1\41\1\4\2\21\1\17\2\4\2\21\1\41\2\4\1\41";
    static final String DFA1_maxS =
        "\1\52\1\10\5\uffff\1\53\2\10\1\53\1\47\1\10\1\53\1\10\1\51\1\22"+
        "\1\10\1\52\1\53\1\51\1\50\3\46\1\4\1\53\1\46\1\47\1\22\1\4\1\10"+
        "\1\47\3\46\1\4\1\53\1\46\1\53\1\4\2\22\1\10\1\51\1\22\1\46\2\4\1"+
        "\53\1\51\1\50\3\46\1\4\1\53\1\46\2\22\1\46\1\22\3\4\3\46\1\4\1\53"+
        "\1\47\2\46\1\4\2\22\1\46\2\4\2\22\1\46\2\4\1\46";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\116\uffff";
    static final String DFA1_specialS =
        "\125\uffff}>";
    static final String[] DFA1_transitionS = {
            "\6\2\3\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\6\7\uffff\1\1",
            "\1\7",
            "",
            "",
            "",
            "",
            "",
            "\6\2\3\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\6\2\uffff\1\11"+
            "\4\uffff\1\1\1\10",
            "\1\12",
            "\1\13",
            "\6\2\3\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\6\2\uffff\1\11"+
            "\4\uffff\1\1\1\10",
            "\1\14",
            "\1\15",
            "\1\21\1\uffff\1\20\2\uffff\1\22\1\uffff\1\17\2\uffff\1\16",
            "\1\23",
            "\1\24\44\uffff\1\25",
            "\1\32\1\26\1\27\1\30\1\33\11\uffff\1\31",
            "\1\34",
            "\6\2\3\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\6\7\uffff\1\1",
            "\1\21\1\uffff\1\20\2\uffff\1\22\1\uffff\1\17\2\uffff\1\16",
            "\1\25",
            "\1\21\1\uffff\1\20\2\uffff\1\22\1\uffff\1\17",
            "\1\35\4\uffff\1\22",
            "\1\35\4\uffff\1\22",
            "\1\35\4\uffff\1\22",
            "\1\32",
            "\1\35\4\uffff\1\22\4\uffff\1\36",
            "\1\35\4\uffff\1\22",
            "\1\37",
            "\1\45\1\41\1\42\1\43\1\40\11\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\35\4\uffff\1\22\1\37",
            "\1\35\4\uffff\1\22",
            "\1\35\4\uffff\1\22",
            "\1\35\4\uffff\1\22",
            "\1\45",
            "\1\35\4\uffff\1\22\4\uffff\1\50",
            "\1\51\1\52\20\uffff\1\35\4\uffff\1\22",
            "\1\21\1\uffff\1\55\2\uffff\1\22\1\uffff\1\54\2\uffff\1\53",
            "\1\56",
            "\1\57\1\60",
            "\1\57\1\60",
            "\1\61",
            "\1\62\44\uffff\1\63",
            "\1\70\1\64\1\65\1\66\1\71\11\uffff\1\67",
            "\1\72\1\73\20\uffff\1\35\4\uffff\1\22",
            "\1\74",
            "\1\74",
            "\1\21\1\uffff\1\55\2\uffff\1\22\1\uffff\1\54\2\uffff\1\53",
            "\1\63",
            "\1\21\1\uffff\1\55\2\uffff\1\22\1\uffff\1\54",
            "\1\75\4\uffff\1\22",
            "\1\75\4\uffff\1\22",
            "\1\75\4\uffff\1\22",
            "\1\70",
            "\1\75\4\uffff\1\22\4\uffff\1\76",
            "\1\75\4\uffff\1\22",
            "\1\77\1\100",
            "\1\77\1\100",
            "\1\35\4\uffff\1\22",
            "\1\105\1\101\1\102\1\103\1\106\11\uffff\1\104",
            "\1\107",
            "\1\110",
            "\1\110",
            "\1\75\4\uffff\1\22",
            "\1\75\4\uffff\1\22",
            "\1\75\4\uffff\1\22",
            "\1\105",
            "\1\75\4\uffff\1\22\4\uffff\1\111",
            "\1\75\4\uffff\1\22\1\37",
            "\1\112\1\113\20\uffff\1\75\4\uffff\1\22",
            "\1\35\4\uffff\1\22",
            "\1\114",
            "\1\115\1\116",
            "\1\115\1\116",
            "\1\117\1\120\20\uffff\1\75\4\uffff\1\22",
            "\1\121",
            "\1\121",
            "\1\122\1\123",
            "\1\122\1\123",
            "\1\75\4\uffff\1\22",
            "\1\124",
            "\1\124",
            "\1\75\4\uffff\1\22"
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
            return "831:1: rule__Element__Alternatives : ( ( ruleRelationship ) | ( ruleClassifier ) | ( rulePackage ) | ( ruleDatatype ) | ( ruleEnumeration ) );";
        }
    }
    static final String DFA2_eotS =
        "\20\uffff";
    static final String DFA2_eofS =
        "\20\uffff";
    static final String DFA2_minS =
        "\6\10\1\43\5\10\1\45\3\uffff";
    static final String DFA2_maxS =
        "\6\55\1\47\5\10\1\47\3\uffff";
    static final String DFA2_acceptS =
        "\15\uffff\1\3\1\2\1\1";
    static final String DFA2_specialS =
        "\20\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\10\uffff\1\1\1\2\6\uffff\1\3\1\4\22\uffff\1\5",
            "\1\6\10\uffff\1\7\1\10\6\uffff\1\11\1\12\22\uffff\1\13",
            "\1\6\10\uffff\1\7\1\10\6\uffff\1\11\1\12\22\uffff\1\13",
            "\1\6\10\uffff\1\7\1\10\6\uffff\1\11\1\12\22\uffff\1\13",
            "\1\6\10\uffff\1\7\1\10\6\uffff\1\11\1\12\22\uffff\1\13",
            "\1\14\10\uffff\1\7\1\10\6\uffff\1\11\1\12\22\uffff\1\13",
            "\1\15\1\uffff\1\16\1\uffff\1\17",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\16\1\uffff\1\17",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "871:1: rule__Feature__Alternatives_0 : ( ( ruleAttribute ) | ( ruleOperation ) | ( ruleConstant ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__0_in_ruleDatatype280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0_in_ruleClassifier400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_entryRuleGeneralization427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralization434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__0_in_ruleGeneralization460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_entryRuleEnumerator667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerator674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__0_in_ruleEnumerator700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__0_in_ruleMultiplicity820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityValue854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityValue__Alternatives_in_ruleMultiplicityValue880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitValue1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitValue__Alternatives_in_ruleImplicitValue1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipType__Alternatives_in_ruleRelationshipType1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Element__Alternatives1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Element__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Element__Alternatives1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Element__Alternatives1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Element__Alternatives1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Feature__Alternatives_01812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Feature__Alternatives_01829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Feature__Alternatives_01846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__MultiplicityValue__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultiplicityValue__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__ImplicitValue__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ImplicitValue__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImplicitValue__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__ImplicitValue__Alternatives1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__ImplicitValue__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImplicitValue__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Value__Alternatives2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Real__Alternatives_4_02165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Alternatives_4_02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Alternatives_4_12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Real__Alternatives_4_12240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RelationshipType__Alternatives2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RelationshipType__Alternatives2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RelationshipType__Alternatives2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RelationshipType__Alternatives2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RelationshipType__Alternatives2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RelationshipType__Alternatives2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Visibility__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Visibility__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Visibility__Alternatives2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Visibility__Alternatives2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02512 = new BitSet(new long[]{0x00000404B1F80000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2542 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl2600 = new BitSet(new long[]{0x00000404B1F80002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02635 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Import__Group__0__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__0__Impl_in_rule__Datatype__Group__02758 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_rule__Datatype__Group__1_in_rule__Datatype__Group__02761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__AnnotationAssignment_0_in_rule__Datatype__Group__0__Impl2788 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__1__Impl_in_rule__Datatype__Group__12819 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Datatype__Group__2_in_rule__Datatype__Group__12822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Datatype__Group__1__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__2__Impl_in_rule__Datatype__Group__22883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__NameAssignment_2_in_rule__Datatype__Group__2__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02946 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__AnnotationAssignment_0_in_rule__Package__Group__0__Impl2976 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__13007 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Package__Group__1__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__23071 = new BitSet(new long[]{0x00000404F1F80000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__23074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__33131 = new BitSet(new long[]{0x00000404F1F80000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__33134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ElementAssignment_3_in_rule__Package__Group__3__Impl3161 = new BitSet(new long[]{0x00000404B1F80002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__43192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Package__Group__4__Impl3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__03261 = new BitSet(new long[]{0x0000040080000000L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__03264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__AnnotationAssignment_0_in_rule__Classifier__Group__0__Impl3291 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__13322 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__13325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Classifier__Group__1__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__23386 = new BitSet(new long[]{0x0000200146060300L});
    public static final BitSet FOLLOW_rule__Classifier__Group__3_in_rule__Classifier__Group__23389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__NameAssignment_2_in_rule__Classifier__Group__2__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__3__Impl_in_rule__Classifier__Group__33446 = new BitSet(new long[]{0x0000200146060300L});
    public static final BitSet FOLLOW_rule__Classifier__Group__4_in_rule__Classifier__Group__33449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__GeneralizationAssignment_3_in_rule__Classifier__Group__3__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__4__Impl_in_rule__Classifier__Group__43507 = new BitSet(new long[]{0x0000200146060300L});
    public static final BitSet FOLLOW_rule__Classifier__Group__5_in_rule__Classifier__Group__43510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__ConstraintAssignment_4_in_rule__Classifier__Group__4__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__5__Impl_in_rule__Classifier__Group__53568 = new BitSet(new long[]{0x0000200146060300L});
    public static final BitSet FOLLOW_rule__Classifier__Group__6_in_rule__Classifier__Group__53571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__FeatureAssignment_5_in_rule__Classifier__Group__5__Impl3598 = new BitSet(new long[]{0x0000200006060102L});
    public static final BitSet FOLLOW_rule__Classifier__Group__6__Impl_in_rule__Classifier__Group__63629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Classifier__Group__6__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__0__Impl_in_rule__Generalization__Group__03702 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Generalization__Group__1_in_rule__Generalization__Group__03705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Generalization__Group__0__Impl3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__1__Impl_in_rule__Generalization__Group__13764 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Generalization__Group__2_in_rule__Generalization__Group__13767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__ClassifierAssignment_1_in_rule__Generalization__Group__1__Impl3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__2__Impl_in_rule__Generalization__Group__23824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group_2__0_in_rule__Generalization__Group__2__Impl3851 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group_2__0__Impl_in_rule__Generalization__Group_2__03888 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Generalization__Group_2__1_in_rule__Generalization__Group_2__03891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Generalization__Group_2__0__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group_2__1__Impl_in_rule__Generalization__Group_2__13950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__ClassifierAssignment_2_1_in_rule__Generalization__Group_2__1__Impl3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04011 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__VisibilityAssignment_0_in_rule__Type__Group__0__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_1_in_rule__Type__Group__1__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04133 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_0_in_rule__Feature__Group__0__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__04255 = new BitSet(new long[]{0x00000404B1F80000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__04258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__AnnotationAssignment_0_in_rule__Enumeration__Group__0__Impl4285 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__14316 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__14319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Enumeration__Group__1__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__24380 = new BitSet(new long[]{0x0000000040000300L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__24383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__2__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__34440 = new BitSet(new long[]{0x0000000040000300L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__34443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__ConstraintAssignment_3_in_rule__Enumeration__Group__3__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__44501 = new BitSet(new long[]{0x0000000040000300L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__44504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumeratorAssignment_4_in_rule__Enumeration__Group__4__Impl4531 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__54562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Enumeration__Group__5__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__0__Impl_in_rule__Enumerator__Group__04633 = new BitSet(new long[]{0x0000000800000200L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__1_in_rule__Enumerator__Group__04636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__NameAssignment_0_in_rule__Enumerator__Group__0__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__1__Impl_in_rule__Enumerator__Group__14693 = new BitSet(new long[]{0x0000000800000200L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__2_in_rule__Enumerator__Group__14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group_1__0_in_rule__Enumerator__Group__1__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__2__Impl_in_rule__Enumerator__Group__24754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__ConstraintAssignment_2_in_rule__Enumerator__Group__2__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group_1__0__Impl_in_rule__Enumerator__Group_1__04818 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Enumerator__Group_1__1_in_rule__Enumerator__Group_1__04821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Enumerator__Group_1__0__Impl4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group_1__1__Impl_in_rule__Enumerator__Group_1__14882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__ValueAssignment_1_1_in_rule__Enumerator__Group_1__1__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04943 = new BitSet(new long[]{0x0000040001F80000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__AnnotationAssignment_0_in_rule__Relationship__Group__0__Impl4973 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__15004 = new BitSet(new long[]{0x0000100006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__15007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_1_in_rule__Relationship__Group__1__Impl5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__25064 = new BitSet(new long[]{0x0000100006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__25067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__LabelAssignment_2_in_rule__Relationship__Group__2__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__35125 = new BitSet(new long[]{0x0000100006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__35128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__HeadNavigableAssignment_3_in_rule__Relationship__Group__3__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__45186 = new BitSet(new long[]{0x0000100006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__45189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__HeadMultiplicityAssignment_4_in_rule__Relationship__Group__4__Impl5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__55247 = new BitSet(new long[]{0x0000100006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__55250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__HeadAssignment_5_in_rule__Relationship__Group__5__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__65307 = new BitSet(new long[]{0x0000100006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__65310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__HeadLabelAssignment_6_in_rule__Relationship__Group__6__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__75368 = new BitSet(new long[]{0x0000100006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__8_in_rule__Relationship__Group__75371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TailNavigableAssignment_7_in_rule__Relationship__Group__7__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__8__Impl_in_rule__Relationship__Group__85429 = new BitSet(new long[]{0x0000100006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__9_in_rule__Relationship__Group__85432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TailMultiplicityAssignment_8_in_rule__Relationship__Group__8__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__9__Impl_in_rule__Relationship__Group__95490 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_rule__Relationship__Group__10_in_rule__Relationship__Group__95493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TailAssignment_9_in_rule__Relationship__Group__9__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__10__Impl_in_rule__Relationship__Group__105550 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_rule__Relationship__Group__11_in_rule__Relationship__Group__105553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TailLabelAssignment_10_in_rule__Relationship__Group__10__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__11__Impl_in_rule__Relationship__Group__115611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Relationship__Group__11__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__0__Impl_in_rule__Multiplicity__Group__05694 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__1_in_rule__Multiplicity__Group__05697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__UpperAssignment_0_in_rule__Multiplicity__Group__0__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__1__Impl_in_rule__Multiplicity__Group__15754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__0_in_rule__Multiplicity__Group__1__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__0__Impl_in_rule__Multiplicity__Group_1__05816 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__1_in_rule__Multiplicity__Group_1__05819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Multiplicity__Group_1__0__Impl5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__1__Impl_in_rule__Multiplicity__Group_1__15880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__LowerAssignment_1_1_in_rule__Multiplicity__Group_1__1__Impl5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__05941 = new BitSet(new long[]{0x0000200006060100L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__05944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__VisibilityAssignment_0_in_rule__Constant__Group__0__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__16002 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__16005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__26062 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__26065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Constant__Group__2__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__36124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__06189 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__06192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0_in_rule__Operation__Group__0__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__16249 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__16252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__26309 = new BitSet(new long[]{0x0000004000000100L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__26312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Operation__Group__2__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__36371 = new BitSet(new long[]{0x0000004000000100L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__36374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__46432 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__46435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Operation__Group__4__Impl6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__56494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__06564 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__06567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParameterAssignment_3_0_in_rule__Operation__Group_3__0__Impl6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__16624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl6651 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__06686 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__06689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_3_1__0__Impl6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__16748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParameterAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__06809 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__06812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Operation__Group_5__0__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__16871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ReturnAssignment_5_1_in_rule__Operation__Group_5__1__Impl6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06932 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16992 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Parameter__Group__1__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__27054 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__27057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__37114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Group__3__Impl7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__07180 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__07183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Parameter__Group_3__0__Impl7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__17244 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__2_in_rule__Parameter__Group_3__17247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ImplicitAssignment_3_1_in_rule__Parameter__Group_3__1__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__2__Impl_in_rule__Parameter__Group_3__27304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__Group_3__2__Impl7331 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__07368 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__07371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Parameter__Group_3_2__0__Impl7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__17430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ImplicitAssignment_3_2_1_in_rule__Parameter__Group_3_2__1__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__07491 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0_in_rule__Attribute__Group__0__Impl7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__17551 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__27611 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Attribute__Group__2__Impl7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__37673 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__47733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__07801 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__07804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Attribute__Group_4__0__Impl7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__17865 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__17868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ImplicitAssignment_4_1_in_rule__Attribute__Group_4__1__Impl7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__27925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__0_in_rule__Attribute__Group_4__2__Impl7952 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__0__Impl_in_rule__Attribute__Group_4_2__07989 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__1_in_rule__Attribute__Group_4_2__07992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Attribute__Group_4_2__0__Impl8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__1__Impl_in_rule__Attribute__Group_4_2__18051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ImplicitAssignment_4_2_1_in_rule__Attribute__Group_4_2__1__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08112 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl8199 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__08234 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__08237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__18295 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__18298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Array__Group__1__Impl8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__28357 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__28360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl8387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__38418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Array__Group__3__Impl8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__08485 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__08488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Annotation__Group__0__Impl8516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__18547 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__18550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl8577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__28607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl8634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__08671 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__08674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Annotation__Group_2__0__Impl8703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__18735 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__18738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__28795 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__28798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl8825 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__38856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Annotation__Group_2__3__Impl8884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__08923 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__08926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Annotation__Group_2_2__0__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__18985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09047 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9133 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__09168 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__09171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExtendedID__Group_1__0__Impl9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__19230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__09290 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__09293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Real__Group__0__Impl9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__19355 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__19358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl9385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__29414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Real__Group__3_in_rule__Real__Group__29417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Real__Group__2__Impl9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__39476 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Real__Group__4_in_rule__Real__Group__39479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__49535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__09603 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__09606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__19663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__19666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__29723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__09785 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__09788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Integer__Group__0__Impl9817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__19850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl9877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__0_in_rule__Operation__UnorderedGroup_09911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_0_0_in_rule__Operation__UnorderedGroup_0__Impl9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__StaticAssignment_0_1_in_rule__Operation__UnorderedGroup_0__Impl10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__010148 = new BitSet(new long[]{0x0000200006060002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__1_in_rule__Operation__UnorderedGroup_0__010151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__110176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_rule__Attribute__UnorderedGroup_010204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__VisibilityAssignment_0_0_in_rule__Attribute__UnorderedGroup_0__Impl10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__StaticAssignment_0_1_in_rule__Attribute__UnorderedGroup_0__Impl10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__010441 = new BitSet(new long[]{0x0000200006060002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_rule__Attribute__UnorderedGroup_0__010444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__110469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_010501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_110532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_110563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Datatype__AnnotationAssignment_010594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Datatype__NameAssignment_210625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Package__AnnotationAssignment_010656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_210687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Package__ElementAssignment_310718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Classifier__AnnotationAssignment_010749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__NameAssignment_210780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_rule__Classifier__GeneralizationAssignment_310811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Classifier__ConstraintAssignment_410842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Classifier__FeatureAssignment_510873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Generalization__ClassifierAssignment_110904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Generalization__ClassifierAssignment_2_110935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Type__VisibilityAssignment_010966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Type__NameAssignment_110997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Feature__ConstraintAssignment_111028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Enumeration__AnnotationAssignment_011059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_211090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Enumeration__ConstraintAssignment_311121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_rule__Enumeration__EnumeratorAssignment_411152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumerator__NameAssignment_011183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Enumerator__ValueAssignment_1_111214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Enumerator__ConstraintAssignment_211245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Relationship__AnnotationAssignment_011276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_rule__Relationship__TypeAssignment_111307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relationship__LabelAssignment_211338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Relationship__HeadNavigableAssignment_311374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Relationship__HeadMultiplicityAssignment_411413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Relationship__HeadAssignment_511444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relationship__HeadLabelAssignment_611475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Relationship__TailNavigableAssignment_711511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Relationship__TailMultiplicityAssignment_811550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Relationship__TailAssignment_911581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relationship__TailLabelAssignment_1011612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_rule__Multiplicity__UpperAssignment_011643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_rule__Multiplicity__LowerAssignment_1_111674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Constant__VisibilityAssignment_011705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_111736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Constant__ValueAssignment_311767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_0_011798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Operation__StaticAssignment_0_111834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_111873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParameterAssignment_3_011904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParameterAssignment_3_1_111935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Operation__ReturnAssignment_5_111966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_011997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_212028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Parameter__ImplicitAssignment_3_112059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Parameter__ImplicitAssignment_3_2_112090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Attribute__VisibilityAssignment_0_012121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Attribute__StaticAssignment_0_112157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_112196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_312227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Attribute__ImplicitAssignment_4_112258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Attribute__ImplicitAssignment_4_2_112289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Reference__TypeAssignment_012320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_112351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Array__SizeAssignment_212382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_112413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_112444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_112475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__0_in_synpred70_InternalClassmodel9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_0_0_in_synpred71_InternalClassmodel9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__1_in_synpred72_InternalClassmodel10151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_synpred73_InternalClassmodel10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__VisibilityAssignment_0_0_in_synpred74_InternalClassmodel10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_synpred75_InternalClassmodel10444 = new BitSet(new long[]{0x0000000000000002L});

}

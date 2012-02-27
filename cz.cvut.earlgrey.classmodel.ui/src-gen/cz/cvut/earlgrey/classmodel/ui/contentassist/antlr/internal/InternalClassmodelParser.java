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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NATURAL", "RULE_NULL", "RULE_BOOLEAN", "RULE_STRING", "RULE_ID", "RULE_CONSTRAINT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'e'", "'E'", "'+'", "'-'", "'association'", "'depency'", "'generalization'", "'realization'", "'aggregation'", "'composition'", "'#'", "'~'", "'import'", "'datatype'", "'package'", "'end'", "'class'", "'isA'", "','", "'enum'", "'='", "'interface'", "'..'", "'('", "')'", "':'", "'['", "']'", "'@'", "'.'", "'navigable'", "'static'"
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
    public static final int T__46=46;
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


    // $ANTLR start "entryRuleInterface"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:369:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:370:1: ( ruleInterface EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:371:1: ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface727);
            ruleInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:378:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:382:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:383:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:383:1: ( ( rule__Interface__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:384:1: ( rule__Interface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:385:1: ( rule__Interface__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:385:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface760);
            rule__Interface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleInterfaceFeature"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:397:1: entryRuleInterfaceFeature : ruleInterfaceFeature EOF ;
    public final void entryRuleInterfaceFeature() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:398:1: ( ruleInterfaceFeature EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:399:1: ruleInterfaceFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceFeature_in_entryRuleInterfaceFeature787);
            ruleInterfaceFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceFeatureRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceFeature794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInterfaceFeature"


    // $ANTLR start "ruleInterfaceFeature"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:406:1: ruleInterfaceFeature : ( ( rule__InterfaceFeature__Group__0 ) ) ;
    public final void ruleInterfaceFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:410:2: ( ( ( rule__InterfaceFeature__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:411:1: ( ( rule__InterfaceFeature__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:411:1: ( ( rule__InterfaceFeature__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:412:1: ( rule__InterfaceFeature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceFeatureAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:413:1: ( rule__InterfaceFeature__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:413:2: rule__InterfaceFeature__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceFeature__Group__0_in_ruleInterfaceFeature820);
            rule__InterfaceFeature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceFeatureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceFeature"


    // $ANTLR start "entryRuleRelationship"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:425:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:426:1: ( ruleRelationship EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:427:1: ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship847);
            ruleRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship854); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:434:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:438:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:439:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:439:1: ( ( rule__Relationship__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:440:1: ( rule__Relationship__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:441:1: ( rule__Relationship__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:441:2: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0_in_ruleRelationship880);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:453:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:454:1: ( ruleMultiplicity EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:455:1: ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity907);
            ruleMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity914); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:462:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:466:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:467:1: ( ( rule__Multiplicity__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:467:1: ( ( rule__Multiplicity__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:468:1: ( rule__Multiplicity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:469:1: ( rule__Multiplicity__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:469:2: rule__Multiplicity__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__0_in_ruleMultiplicity940);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:481:1: entryRuleMultiplicityValue : ruleMultiplicityValue EOF ;
    public final void entryRuleMultiplicityValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:482:1: ( ruleMultiplicityValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:483:1: ruleMultiplicityValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue967);
            ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityValue974); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:490:1: ruleMultiplicityValue : ( ( rule__MultiplicityValue__Alternatives ) ) ;
    public final void ruleMultiplicityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:494:2: ( ( ( rule__MultiplicityValue__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:495:1: ( ( rule__MultiplicityValue__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:495:1: ( ( rule__MultiplicityValue__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:496:1: ( rule__MultiplicityValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:497:1: ( rule__MultiplicityValue__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:497:2: rule__MultiplicityValue__Alternatives
            {
            pushFollow(FOLLOW_rule__MultiplicityValue__Alternatives_in_ruleMultiplicityValue1000);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:509:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:510:1: ( ruleConstant EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:511:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant1027);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant1034); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:518:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:522:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:523:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:523:1: ( ( rule__Constant__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:524:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:525:1: ( rule__Constant__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:525:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant1060);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:537:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:538:1: ( ruleOperation EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:539:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1087);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1094); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:546:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:550:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:551:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:551:1: ( ( rule__Operation__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:552:1: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:553:1: ( rule__Operation__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:553:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation1120);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:565:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:566:1: ( ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:567:1: ruleParameter EOF
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:574:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:578:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:579:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:579:1: ( ( rule__Parameter__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:580:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:581:1: ( rule__Parameter__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:581:2: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleAttribute"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:593:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:594:1: ( ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:595:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1207);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1214); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:602:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:606:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:607:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:607:1: ( ( rule__Attribute__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:608:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:609:1: ( rule__Attribute__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:609:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1240);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:621:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:622:1: ( ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:623:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1267);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1274); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:630:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:634:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:635:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:635:1: ( ( rule__Reference__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:636:1: ( rule__Reference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:637:1: ( rule__Reference__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:637:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1300);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:649:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:650:1: ( ruleArray EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:651:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1327);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1334); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:658:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:662:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:663:1: ( ( rule__Array__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:663:1: ( ( rule__Array__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:664:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:665:1: ( rule__Array__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:665:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray1360);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:677:1: entryRuleImplicitValue : ruleImplicitValue EOF ;
    public final void entryRuleImplicitValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:678:1: ( ruleImplicitValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:679:1: ruleImplicitValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicitValueRule()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue1387);
            ruleImplicitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicitValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitValue1394); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:686:1: ruleImplicitValue : ( ( rule__ImplicitValue__Alternatives ) ) ;
    public final void ruleImplicitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:690:2: ( ( ( rule__ImplicitValue__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:691:1: ( ( rule__ImplicitValue__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:691:1: ( ( rule__ImplicitValue__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:692:1: ( rule__ImplicitValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicitValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:693:1: ( rule__ImplicitValue__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:693:2: rule__ImplicitValue__Alternatives
            {
            pushFollow(FOLLOW_rule__ImplicitValue__Alternatives_in_ruleImplicitValue1420);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:705:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:706:1: ( ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:707:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1447);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1454); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:714:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:718:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:719:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:719:1: ( ( rule__Annotation__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:720:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:721:1: ( rule__Annotation__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:721:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1480);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:737:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:738:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:739:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1511);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1518); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:746:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:750:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:751:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:751:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:752:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:753:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:753:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1544);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:765:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:766:1: ( ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:767:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID1571);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID1578); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:774:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:778:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:779:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:779:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:780:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:781:1: ( rule__ExtendedID__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:781:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1604);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:793:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:794:1: ( ruleReal EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:795:1: ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal1631);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal1638); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:802:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:806:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:807:1: ( ( rule__Real__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:807:1: ( ( rule__Real__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:808:1: ( rule__Real__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:809:1: ( rule__Real__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:809:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal1664);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:821:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:822:1: ( ruleInteger EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:823:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger1691);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger1698); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:830:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:834:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:835:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:835:1: ( ( rule__Integer__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:836:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:837:1: ( rule__Integer__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:837:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger1724);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:850:1: ruleRelationshipType : ( ( rule__RelationshipType__Alternatives ) ) ;
    public final void ruleRelationshipType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:854:1: ( ( ( rule__RelationshipType__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:855:1: ( ( rule__RelationshipType__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:855:1: ( ( rule__RelationshipType__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:856:1: ( rule__RelationshipType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipTypeAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:857:1: ( rule__RelationshipType__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:857:2: rule__RelationshipType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationshipType__Alternatives_in_ruleRelationshipType1761);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:869:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:873:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:874:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:874:1: ( ( rule__Visibility__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:875:1: ( rule__Visibility__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:876:1: ( rule__Visibility__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:876:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1797);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:887:1: rule__Element__Alternatives : ( ( ruleRelationship ) | ( ruleClassifier ) | ( rulePackage ) | ( ruleDatatype ) | ( ruleEnumeration ) | ( ruleInterface ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:891:1: ( ( ruleRelationship ) | ( ruleClassifier ) | ( rulePackage ) | ( ruleDatatype ) | ( ruleEnumeration ) | ( ruleInterface ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:892:1: ( ruleRelationship )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:892:1: ( ruleRelationship )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:893:1: ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getRelationshipParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRelationship_in_rule__Element__Alternatives1832);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:898:6: ( ruleClassifier )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:898:6: ( ruleClassifier )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:899:1: ruleClassifier
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getClassifierParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleClassifier_in_rule__Element__Alternatives1849);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:904:6: ( rulePackage )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:904:6: ( rulePackage )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:905:1: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getPackageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_rulePackage_in_rule__Element__Alternatives1866);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:910:6: ( ruleDatatype )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:910:6: ( ruleDatatype )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:911:1: ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getDatatypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_rule__Element__Alternatives1883);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:916:6: ( ruleEnumeration )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:916:6: ( ruleEnumeration )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:917:1: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Element__Alternatives1900);
                    ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:922:6: ( ruleInterface )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:922:6: ( ruleInterface )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:923:1: ruleInterface
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getInterfaceParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleInterface_in_rule__Element__Alternatives1917);
                    ruleInterface();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getInterfaceParserRuleCall_5()); 
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:933:1: rule__Feature__Alternatives_0 : ( ( ruleAttribute ) | ( ruleOperation ) | ( ruleConstant ) );
    public final void rule__Feature__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:937:1: ( ( ruleAttribute ) | ( ruleOperation ) | ( ruleConstant ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:938:1: ( ruleAttribute )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:938:1: ( ruleAttribute )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:939:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Feature__Alternatives_01949);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:944:6: ( ruleOperation )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:944:6: ( ruleOperation )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:945:1: ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getOperationParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleOperation_in_rule__Feature__Alternatives_01966);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:950:6: ( ruleConstant )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:950:6: ( ruleConstant )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:951:1: ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getConstantParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleConstant_in_rule__Feature__Alternatives_01983);
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


    // $ANTLR start "rule__InterfaceFeature__Alternatives_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:961:1: rule__InterfaceFeature__Alternatives_0 : ( ( ruleOperation ) | ( ruleConstant ) );
    public final void rule__InterfaceFeature__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:965:1: ( ( ruleOperation ) | ( ruleConstant ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=17 && LA3_1<=18)||(LA3_1>=25 && LA3_1<=26)||LA3_1==46) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==35) ) {
                        alt3=2;
                    }
                    else if ( (LA3_6==38) ) {
                        alt3=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==35) ) {
                        alt3=2;
                    }
                    else if ( (LA3_6==38) ) {
                        alt3=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_2>=17 && LA3_2<=18)||(LA3_2>=25 && LA3_2<=26)||LA3_2==46) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==35) ) {
                        alt3=2;
                    }
                    else if ( (LA3_6==38) ) {
                        alt3=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_3>=17 && LA3_3<=18)||(LA3_3>=25 && LA3_3<=26)||LA3_3==46) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==RULE_ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==35) ) {
                        alt3=2;
                    }
                    else if ( (LA3_6==38) ) {
                        alt3=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_4>=17 && LA3_4<=18)||(LA3_4>=25 && LA3_4<=26)||LA3_4==46) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_6 = input.LA(2);

                if ( (LA3_6==35) ) {
                    alt3=2;
                }
                else if ( (LA3_6==38) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 6, input);

                    throw nvae;
                }
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:966:1: ( ruleOperation )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:966:1: ( ruleOperation )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:967:1: ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceFeatureAccess().getOperationParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleOperation_in_rule__InterfaceFeature__Alternatives_02015);
                    ruleOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterfaceFeatureAccess().getOperationParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:972:6: ( ruleConstant )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:972:6: ( ruleConstant )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:973:1: ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInterfaceFeatureAccess().getConstantParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleConstant_in_rule__InterfaceFeature__Alternatives_02032);
                    ruleConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInterfaceFeatureAccess().getConstantParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__InterfaceFeature__Alternatives_0"


    // $ANTLR start "rule__MultiplicityValue__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:983:1: rule__MultiplicityValue__Alternatives : ( ( RULE_NATURAL ) | ( '*' ) );
    public final void rule__MultiplicityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:987:1: ( ( RULE_NATURAL ) | ( '*' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NATURAL) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:988:1: ( RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:988:1: ( RULE_NATURAL )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:989:1: RULE_NATURAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityValueAccess().getNATURALTerminalRuleCall_0()); 
                    }
                    match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__MultiplicityValue__Alternatives2064); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityValueAccess().getNATURALTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:994:6: ( '*' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:994:6: ( '*' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:995:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityValueAccess().getAsteriskKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__MultiplicityValue__Alternatives2082); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1007:1: rule__ImplicitValue__Alternatives : ( ( RULE_NULL ) | ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleReal ) | ( RULE_ID ) );
    public final void rule__ImplicitValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1011:1: ( ( RULE_NULL ) | ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleReal ) | ( RULE_ID ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_NULL:
                {
                alt5=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==RULE_NATURAL) ) {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5==EOF||(LA5_5>=RULE_ID && LA5_5<=RULE_CONSTRAINT)||(LA5_5>=17 && LA5_5<=18)||(LA5_5>=25 && LA5_5<=26)||LA5_5==30||LA5_5==33||LA5_5==39||LA5_5==46) ) {
                        alt5=4;
                    }
                    else if ( (LA5_5==44) ) {
                        alt5=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA5_5 = input.LA(2);

                if ( (LA5_5==EOF||(LA5_5>=RULE_ID && LA5_5<=RULE_CONSTRAINT)||(LA5_5>=17 && LA5_5<=18)||(LA5_5>=25 && LA5_5<=26)||LA5_5==30||LA5_5==33||LA5_5==39||LA5_5==46) ) {
                    alt5=4;
                }
                else if ( (LA5_5==44) ) {
                    alt5=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt5=6;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1012:1: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1012:1: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1013:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getNULLTerminalRuleCall_0()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__ImplicitValue__Alternatives2116); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getNULLTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1018:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1018:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1019:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getBOOLEANTerminalRuleCall_1()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__ImplicitValue__Alternatives2133); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getBOOLEANTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1024:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1024:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1025:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImplicitValue__Alternatives2150); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImplicitValueAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1030:6: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1030:6: ( ruleInteger )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1031:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getIntegerParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__ImplicitValue__Alternatives2167);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1036:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1036:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1037:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getRealParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__ImplicitValue__Alternatives2184);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1042:6: ( RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1042:6: ( RULE_ID )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1043:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImplicitValueAccess().getIDTerminalRuleCall_5()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImplicitValue__Alternatives2201); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1053:1: rule__Value__Alternatives : ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1057:1: ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_NATURAL) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==44) ) {
                        alt6=6;
                    }
                    else if ( (LA6_2==EOF) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==44) ) {
                    alt6=6;
                }
                else if ( (LA6_2==EOF) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt6=4;
                }
                break;
            case RULE_NULL:
                {
                alt6=5;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1058:1: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1058:1: ( ruleInteger )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1059:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__Value__Alternatives2233);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1064:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1064:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1065:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives2250); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1070:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1070:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1071:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives2267);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1076:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1076:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1077:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives2284); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1082:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1082:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1083:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives2301); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1088:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1088:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1089:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__Value__Alternatives2318);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1099:1: rule__Real__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1103:1: ( ( 'e' ) | ( 'E' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1104:1: ( 'e' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1104:1: ( 'e' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1105:1: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Real__Alternatives_4_02351); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1112:6: ( 'E' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1112:6: ( 'E' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1113:1: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Real__Alternatives_4_02371); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1125:1: rule__Real__Alternatives_4_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1129:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1130:1: ( '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1130:1: ( '+' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1131:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Real__Alternatives_4_12406); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1138:6: ( '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1138:6: ( '-' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1139:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Real__Alternatives_4_12426); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1151:1: rule__RelationshipType__Alternatives : ( ( ( 'association' ) ) | ( ( 'depency' ) ) | ( ( 'generalization' ) ) | ( ( 'realization' ) ) | ( ( 'aggregation' ) ) | ( ( 'composition' ) ) );
    public final void rule__RelationshipType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1155:1: ( ( ( 'association' ) ) | ( ( 'depency' ) ) | ( ( 'generalization' ) ) | ( ( 'realization' ) ) | ( ( 'aggregation' ) ) | ( ( 'composition' ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
                {
                alt9=6;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1156:1: ( ( 'association' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1156:1: ( ( 'association' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1157:1: ( 'association' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1158:1: ( 'association' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1158:3: 'association'
                    {
                    match(input,19,FOLLOW_19_in_rule__RelationshipType__Alternatives2461); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1163:6: ( ( 'depency' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1163:6: ( ( 'depency' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1164:1: ( 'depency' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1165:1: ( 'depency' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1165:3: 'depency'
                    {
                    match(input,20,FOLLOW_20_in_rule__RelationshipType__Alternatives2482); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1170:6: ( ( 'generalization' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1170:6: ( ( 'generalization' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1171:1: ( 'generalization' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1172:1: ( 'generalization' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1172:3: 'generalization'
                    {
                    match(input,21,FOLLOW_21_in_rule__RelationshipType__Alternatives2503); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1177:6: ( ( 'realization' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1177:6: ( ( 'realization' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1178:1: ( 'realization' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1179:1: ( 'realization' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1179:3: 'realization'
                    {
                    match(input,22,FOLLOW_22_in_rule__RelationshipType__Alternatives2524); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1184:6: ( ( 'aggregation' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1184:6: ( ( 'aggregation' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1185:1: ( 'aggregation' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1186:1: ( 'aggregation' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1186:3: 'aggregation'
                    {
                    match(input,23,FOLLOW_23_in_rule__RelationshipType__Alternatives2545); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1191:6: ( ( 'composition' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1191:6: ( ( 'composition' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1192:1: ( 'composition' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1193:1: ( 'composition' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1193:3: 'composition'
                    {
                    match(input,24,FOLLOW_24_in_rule__RelationshipType__Alternatives2566); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1203:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1207:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1208:1: ( ( '+' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1208:1: ( ( '+' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1209:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1210:1: ( '+' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1210:3: '+'
                    {
                    match(input,17,FOLLOW_17_in_rule__Visibility__Alternatives2602); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1215:6: ( ( '-' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1215:6: ( ( '-' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1216:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1217:1: ( '-' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1217:3: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__Visibility__Alternatives2623); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1222:6: ( ( '#' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1222:6: ( ( '#' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1223:1: ( '#' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1224:1: ( '#' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1224:3: '#'
                    {
                    match(input,25,FOLLOW_25_in_rule__Visibility__Alternatives2644); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1229:6: ( ( '~' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1229:6: ( ( '~' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1230:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1231:1: ( '~' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1231:3: '~'
                    {
                    match(input,26,FOLLOW_26_in_rule__Visibility__Alternatives2665); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1243:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1247:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1248:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02698);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02701);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1255:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1259:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1260:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1260:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1261:1: ( rule__Model__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1262:1: ( rule__Model__ImportsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1262:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2728);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1272:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1276:1: ( rule__Model__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1277:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12759);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1283:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1287:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1288:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1288:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1289:1: ( rule__Model__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1290:1: ( rule__Model__ElementsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=19 && LA12_0<=24)||(LA12_0>=28 && LA12_0<=29)||LA12_0==31||LA12_0==34||LA12_0==36||LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1290:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl2786);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1304:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1308:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1309:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02821);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02824);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1316:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1320:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1321:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1321:1: ( 'import' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1322:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Import__Group__0__Impl2852); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1335:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1339:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1340:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12883);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1346:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1350:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1351:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1351:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1352:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1353:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1353:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2910);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1367:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1371:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1372:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group__0__Impl_in_rule__Datatype__Group__02944);
            rule__Datatype__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Datatype__Group__1_in_rule__Datatype__Group__02947);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1379:1: rule__Datatype__Group__0__Impl : ( ( rule__Datatype__AnnotationAssignment_0 )* ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1383:1: ( ( ( rule__Datatype__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1384:1: ( ( rule__Datatype__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1384:1: ( ( rule__Datatype__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1385:1: ( rule__Datatype__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1386:1: ( rule__Datatype__AnnotationAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1386:2: rule__Datatype__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Datatype__AnnotationAssignment_0_in_rule__Datatype__Group__0__Impl2974);
            	    rule__Datatype__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1396:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1400:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1401:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_rule__Datatype__Group__1__Impl_in_rule__Datatype__Group__13005);
            rule__Datatype__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Datatype__Group__2_in_rule__Datatype__Group__13008);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1408:1: rule__Datatype__Group__1__Impl : ( ( 'datatype' ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1412:1: ( ( ( 'datatype' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1413:1: ( ( 'datatype' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1413:1: ( ( 'datatype' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1414:1: ( 'datatype' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1415:1: ( 'datatype' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1416:2: 'datatype'
            {
            match(input,28,FOLLOW_28_in_rule__Datatype__Group__1__Impl3037); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1427:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1431:1: ( rule__Datatype__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1432:2: rule__Datatype__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group__2__Impl_in_rule__Datatype__Group__23069);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1438:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__NameAssignment_2 ) ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1442:1: ( ( ( rule__Datatype__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1443:1: ( ( rule__Datatype__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1443:1: ( ( rule__Datatype__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1444:1: ( rule__Datatype__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1445:1: ( rule__Datatype__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1445:2: rule__Datatype__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Datatype__NameAssignment_2_in_rule__Datatype__Group__2__Impl3096);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1461:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1465:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1466:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__03132);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__03135);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1473:1: rule__Package__Group__0__Impl : ( ( rule__Package__AnnotationAssignment_0 )* ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1477:1: ( ( ( rule__Package__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1478:1: ( ( rule__Package__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1478:1: ( ( rule__Package__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1479:1: ( rule__Package__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1480:1: ( rule__Package__AnnotationAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==43) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1480:2: rule__Package__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Package__AnnotationAssignment_0_in_rule__Package__Group__0__Impl3162);
            	    rule__Package__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1490:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1494:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1495:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__13193);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__13196);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1502:1: rule__Package__Group__1__Impl : ( ( 'package' ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1506:1: ( ( ( 'package' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1507:1: ( ( 'package' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1507:1: ( ( 'package' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1508:1: ( 'package' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1509:1: ( 'package' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1510:2: 'package'
            {
            match(input,29,FOLLOW_29_in_rule__Package__Group__1__Impl3225); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1521:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1525:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1526:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__23257);
            rule__Package__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__23260);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1533:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1537:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1538:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1538:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1539:1: ( rule__Package__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1540:1: ( rule__Package__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1540:2: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl3287);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1550:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1554:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1555:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__33317);
            rule__Package__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__33320);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1562:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1566:1: ( ( ( rule__Package__ElementAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1567:1: ( ( rule__Package__ElementAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1567:1: ( ( rule__Package__ElementAssignment_3 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1568:1: ( rule__Package__ElementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1569:1: ( rule__Package__ElementAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=19 && LA15_0<=24)||(LA15_0>=28 && LA15_0<=29)||LA15_0==31||LA15_0==34||LA15_0==36||LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1569:2: rule__Package__ElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__ElementAssignment_3_in_rule__Package__Group__3__Impl3347);
            	    rule__Package__ElementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1579:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1583:1: ( rule__Package__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1584:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__43378);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1590:1: rule__Package__Group__4__Impl : ( 'end' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1594:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1595:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1595:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1596:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getEndKeyword_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__Package__Group__4__Impl3406); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1619:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1623:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1624:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__03447);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__03450);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1631:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__AnnotationAssignment_0 )* ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1635:1: ( ( ( rule__Classifier__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1636:1: ( ( rule__Classifier__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1636:1: ( ( rule__Classifier__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1637:1: ( rule__Classifier__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1638:1: ( rule__Classifier__AnnotationAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1638:2: rule__Classifier__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Classifier__AnnotationAssignment_0_in_rule__Classifier__Group__0__Impl3477);
            	    rule__Classifier__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1648:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl rule__Classifier__Group__2 ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1652:1: ( rule__Classifier__Group__1__Impl rule__Classifier__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1653:2: rule__Classifier__Group__1__Impl rule__Classifier__Group__2
            {
            pushFollow(FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__13508);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__13511);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1660:1: rule__Classifier__Group__1__Impl : ( ( 'class' ) ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1664:1: ( ( ( 'class' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1665:1: ( ( 'class' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1665:1: ( ( 'class' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1666:1: ( 'class' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1667:1: ( 'class' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1668:2: 'class'
            {
            match(input,31,FOLLOW_31_in_rule__Classifier__Group__1__Impl3540); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1679:1: rule__Classifier__Group__2 : rule__Classifier__Group__2__Impl rule__Classifier__Group__3 ;
    public final void rule__Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1683:1: ( rule__Classifier__Group__2__Impl rule__Classifier__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1684:2: rule__Classifier__Group__2__Impl rule__Classifier__Group__3
            {
            pushFollow(FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__23572);
            rule__Classifier__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__3_in_rule__Classifier__Group__23575);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1691:1: rule__Classifier__Group__2__Impl : ( ( rule__Classifier__NameAssignment_2 ) ) ;
    public final void rule__Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1695:1: ( ( ( rule__Classifier__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1696:1: ( ( rule__Classifier__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1696:1: ( ( rule__Classifier__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1697:1: ( rule__Classifier__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1698:1: ( rule__Classifier__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1698:2: rule__Classifier__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Classifier__NameAssignment_2_in_rule__Classifier__Group__2__Impl3602);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1708:1: rule__Classifier__Group__3 : rule__Classifier__Group__3__Impl rule__Classifier__Group__4 ;
    public final void rule__Classifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1712:1: ( rule__Classifier__Group__3__Impl rule__Classifier__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1713:2: rule__Classifier__Group__3__Impl rule__Classifier__Group__4
            {
            pushFollow(FOLLOW_rule__Classifier__Group__3__Impl_in_rule__Classifier__Group__33632);
            rule__Classifier__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__4_in_rule__Classifier__Group__33635);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1720:1: rule__Classifier__Group__3__Impl : ( ( rule__Classifier__GeneralizationAssignment_3 )? ) ;
    public final void rule__Classifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1724:1: ( ( ( rule__Classifier__GeneralizationAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1725:1: ( ( rule__Classifier__GeneralizationAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1725:1: ( ( rule__Classifier__GeneralizationAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1726:1: ( rule__Classifier__GeneralizationAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGeneralizationAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1727:1: ( rule__Classifier__GeneralizationAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1727:2: rule__Classifier__GeneralizationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Classifier__GeneralizationAssignment_3_in_rule__Classifier__Group__3__Impl3662);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1737:1: rule__Classifier__Group__4 : rule__Classifier__Group__4__Impl rule__Classifier__Group__5 ;
    public final void rule__Classifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1741:1: ( rule__Classifier__Group__4__Impl rule__Classifier__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1742:2: rule__Classifier__Group__4__Impl rule__Classifier__Group__5
            {
            pushFollow(FOLLOW_rule__Classifier__Group__4__Impl_in_rule__Classifier__Group__43693);
            rule__Classifier__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__5_in_rule__Classifier__Group__43696);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1749:1: rule__Classifier__Group__4__Impl : ( ( rule__Classifier__ConstraintAssignment_4 )? ) ;
    public final void rule__Classifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1753:1: ( ( ( rule__Classifier__ConstraintAssignment_4 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1754:1: ( ( rule__Classifier__ConstraintAssignment_4 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1754:1: ( ( rule__Classifier__ConstraintAssignment_4 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1755:1: ( rule__Classifier__ConstraintAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getConstraintAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1756:1: ( rule__Classifier__ConstraintAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_CONSTRAINT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1756:2: rule__Classifier__ConstraintAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Classifier__ConstraintAssignment_4_in_rule__Classifier__Group__4__Impl3723);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1766:1: rule__Classifier__Group__5 : rule__Classifier__Group__5__Impl rule__Classifier__Group__6 ;
    public final void rule__Classifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1770:1: ( rule__Classifier__Group__5__Impl rule__Classifier__Group__6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1771:2: rule__Classifier__Group__5__Impl rule__Classifier__Group__6
            {
            pushFollow(FOLLOW_rule__Classifier__Group__5__Impl_in_rule__Classifier__Group__53754);
            rule__Classifier__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__6_in_rule__Classifier__Group__53757);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1778:1: rule__Classifier__Group__5__Impl : ( ( rule__Classifier__FeatureAssignment_5 )* ) ;
    public final void rule__Classifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1782:1: ( ( ( rule__Classifier__FeatureAssignment_5 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1783:1: ( ( rule__Classifier__FeatureAssignment_5 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1783:1: ( ( rule__Classifier__FeatureAssignment_5 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1784:1: ( rule__Classifier__FeatureAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFeatureAssignment_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1785:1: ( rule__Classifier__FeatureAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=17 && LA19_0<=18)||(LA19_0>=25 && LA19_0<=26)||LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1785:2: rule__Classifier__FeatureAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Classifier__FeatureAssignment_5_in_rule__Classifier__Group__5__Impl3784);
            	    rule__Classifier__FeatureAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1795:1: rule__Classifier__Group__6 : rule__Classifier__Group__6__Impl ;
    public final void rule__Classifier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1799:1: ( rule__Classifier__Group__6__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1800:2: rule__Classifier__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group__6__Impl_in_rule__Classifier__Group__63815);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1806:1: rule__Classifier__Group__6__Impl : ( 'end' ) ;
    public final void rule__Classifier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1810:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1811:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1811:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1812:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getEndKeyword_6()); 
            }
            match(input,30,FOLLOW_30_in_rule__Classifier__Group__6__Impl3843); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1839:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1843:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1844:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_rule__Generalization__Group__0__Impl_in_rule__Generalization__Group__03888);
            rule__Generalization__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generalization__Group__1_in_rule__Generalization__Group__03891);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1851:1: rule__Generalization__Group__0__Impl : ( 'isA' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1855:1: ( ( 'isA' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1856:1: ( 'isA' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1856:1: ( 'isA' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1857:1: 'isA'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getIsAKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Generalization__Group__0__Impl3919); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1870:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1874:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1875:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_rule__Generalization__Group__1__Impl_in_rule__Generalization__Group__13950);
            rule__Generalization__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generalization__Group__2_in_rule__Generalization__Group__13953);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1882:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__ClassifierAssignment_1 ) ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1886:1: ( ( ( rule__Generalization__ClassifierAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1887:1: ( ( rule__Generalization__ClassifierAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1887:1: ( ( rule__Generalization__ClassifierAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1888:1: ( rule__Generalization__ClassifierAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getClassifierAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1889:1: ( rule__Generalization__ClassifierAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1889:2: rule__Generalization__ClassifierAssignment_1
            {
            pushFollow(FOLLOW_rule__Generalization__ClassifierAssignment_1_in_rule__Generalization__Group__1__Impl3980);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1899:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1903:1: ( rule__Generalization__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1904:2: rule__Generalization__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Generalization__Group__2__Impl_in_rule__Generalization__Group__24010);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1910:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__Group_2__0 )* ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1914:1: ( ( ( rule__Generalization__Group_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1915:1: ( ( rule__Generalization__Group_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1915:1: ( ( rule__Generalization__Group_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1916:1: ( rule__Generalization__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1917:1: ( rule__Generalization__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1917:2: rule__Generalization__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generalization__Group_2__0_in_rule__Generalization__Group__2__Impl4037);
            	    rule__Generalization__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1933:1: rule__Generalization__Group_2__0 : rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1 ;
    public final void rule__Generalization__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1937:1: ( rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1938:2: rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1
            {
            pushFollow(FOLLOW_rule__Generalization__Group_2__0__Impl_in_rule__Generalization__Group_2__04074);
            rule__Generalization__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generalization__Group_2__1_in_rule__Generalization__Group_2__04077);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1945:1: rule__Generalization__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Generalization__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1949:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1950:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1950:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1951:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getCommaKeyword_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Generalization__Group_2__0__Impl4105); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1964:1: rule__Generalization__Group_2__1 : rule__Generalization__Group_2__1__Impl ;
    public final void rule__Generalization__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1968:1: ( rule__Generalization__Group_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1969:2: rule__Generalization__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generalization__Group_2__1__Impl_in_rule__Generalization__Group_2__14136);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1975:1: rule__Generalization__Group_2__1__Impl : ( ( rule__Generalization__ClassifierAssignment_2_1 ) ) ;
    public final void rule__Generalization__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1979:1: ( ( ( rule__Generalization__ClassifierAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1980:1: ( ( rule__Generalization__ClassifierAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1980:1: ( ( rule__Generalization__ClassifierAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1981:1: ( rule__Generalization__ClassifierAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getClassifierAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1982:1: ( rule__Generalization__ClassifierAssignment_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1982:2: rule__Generalization__ClassifierAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Generalization__ClassifierAssignment_2_1_in_rule__Generalization__Group_2__1__Impl4163);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1996:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2000:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2001:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04197);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04200);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2008:1: rule__Type__Group__0__Impl : ( ( rule__Type__VisibilityAssignment_0 )? ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2012:1: ( ( ( rule__Type__VisibilityAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2013:1: ( ( rule__Type__VisibilityAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2013:1: ( ( rule__Type__VisibilityAssignment_0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2014:1: ( rule__Type__VisibilityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getVisibilityAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2015:1: ( rule__Type__VisibilityAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=17 && LA21_0<=18)||(LA21_0>=25 && LA21_0<=26)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2015:2: rule__Type__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__VisibilityAssignment_0_in_rule__Type__Group__0__Impl4227);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2025:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2029:1: ( rule__Type__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2030:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14258);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2036:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2040:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2041:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2041:1: ( ( rule__Type__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2042:1: ( rule__Type__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2043:1: ( rule__Type__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2043:2: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_1_in_rule__Type__Group__1__Impl4285);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2057:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2061:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2062:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04319);
            rule__Feature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04322);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2069:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__Alternatives_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2073:1: ( ( ( rule__Feature__Alternatives_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2074:1: ( ( rule__Feature__Alternatives_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2074:1: ( ( rule__Feature__Alternatives_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2075:1: ( rule__Feature__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2076:1: ( rule__Feature__Alternatives_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2076:2: rule__Feature__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_0_in_rule__Feature__Group__0__Impl4349);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2086:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2090:1: ( rule__Feature__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2091:2: rule__Feature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14379);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2097:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConstraintAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2101:1: ( ( ( rule__Feature__ConstraintAssignment_1 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2102:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2102:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2103:1: ( rule__Feature__ConstraintAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getConstraintAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2104:1: ( rule__Feature__ConstraintAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_CONSTRAINT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2104:2: rule__Feature__ConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4406);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2118:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2122:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2123:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__04441);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__04444);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2130:1: rule__Enumeration__Group__0__Impl : ( ( rule__Enumeration__AnnotationAssignment_0 )* ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2134:1: ( ( ( rule__Enumeration__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2135:1: ( ( rule__Enumeration__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2135:1: ( ( rule__Enumeration__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2136:1: ( rule__Enumeration__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2137:1: ( rule__Enumeration__AnnotationAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2137:2: rule__Enumeration__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__AnnotationAssignment_0_in_rule__Enumeration__Group__0__Impl4471);
            	    rule__Enumeration__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2147:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2151:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2152:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__14502);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__14505);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2159:1: rule__Enumeration__Group__1__Impl : ( ( 'enum' ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2163:1: ( ( ( 'enum' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2164:1: ( ( 'enum' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2164:1: ( ( 'enum' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2165:1: ( 'enum' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2166:1: ( 'enum' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2167:2: 'enum'
            {
            match(input,34,FOLLOW_34_in_rule__Enumeration__Group__1__Impl4534); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2178:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2182:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2183:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__24566);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__24569);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2190:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2194:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2195:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2195:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2196:1: ( rule__Enumeration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2197:1: ( rule__Enumeration__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2197:2: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__2__Impl4596);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2207:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2211:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2212:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__34626);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__34629);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2219:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__ConstraintAssignment_3 )? ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2223:1: ( ( ( rule__Enumeration__ConstraintAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2224:1: ( ( rule__Enumeration__ConstraintAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2224:1: ( ( rule__Enumeration__ConstraintAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2225:1: ( rule__Enumeration__ConstraintAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getConstraintAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2226:1: ( rule__Enumeration__ConstraintAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_CONSTRAINT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2226:2: rule__Enumeration__ConstraintAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Enumeration__ConstraintAssignment_3_in_rule__Enumeration__Group__3__Impl4656);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2236:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2240:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2241:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__44687);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__44690);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2248:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__EnumeratorAssignment_4 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2252:1: ( ( ( rule__Enumeration__EnumeratorAssignment_4 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2253:1: ( ( rule__Enumeration__EnumeratorAssignment_4 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2253:1: ( ( rule__Enumeration__EnumeratorAssignment_4 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2254:1: ( rule__Enumeration__EnumeratorAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumeratorAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2255:1: ( rule__Enumeration__EnumeratorAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2255:2: rule__Enumeration__EnumeratorAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumeratorAssignment_4_in_rule__Enumeration__Group__4__Impl4717);
            	    rule__Enumeration__EnumeratorAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2265:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2269:1: ( rule__Enumeration__Group__5__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2270:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__54748);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2276:1: rule__Enumeration__Group__5__Impl : ( 'end' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2280:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2281:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2281:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2282:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEndKeyword_5()); 
            }
            match(input,30,FOLLOW_30_in_rule__Enumeration__Group__5__Impl4776); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2307:1: rule__Enumerator__Group__0 : rule__Enumerator__Group__0__Impl rule__Enumerator__Group__1 ;
    public final void rule__Enumerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2311:1: ( rule__Enumerator__Group__0__Impl rule__Enumerator__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2312:2: rule__Enumerator__Group__0__Impl rule__Enumerator__Group__1
            {
            pushFollow(FOLLOW_rule__Enumerator__Group__0__Impl_in_rule__Enumerator__Group__04819);
            rule__Enumerator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumerator__Group__1_in_rule__Enumerator__Group__04822);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2319:1: rule__Enumerator__Group__0__Impl : ( ( rule__Enumerator__NameAssignment_0 ) ) ;
    public final void rule__Enumerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2323:1: ( ( ( rule__Enumerator__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2324:1: ( ( rule__Enumerator__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2324:1: ( ( rule__Enumerator__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2325:1: ( rule__Enumerator__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2326:1: ( rule__Enumerator__NameAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2326:2: rule__Enumerator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Enumerator__NameAssignment_0_in_rule__Enumerator__Group__0__Impl4849);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2336:1: rule__Enumerator__Group__1 : rule__Enumerator__Group__1__Impl rule__Enumerator__Group__2 ;
    public final void rule__Enumerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2340:1: ( rule__Enumerator__Group__1__Impl rule__Enumerator__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2341:2: rule__Enumerator__Group__1__Impl rule__Enumerator__Group__2
            {
            pushFollow(FOLLOW_rule__Enumerator__Group__1__Impl_in_rule__Enumerator__Group__14879);
            rule__Enumerator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumerator__Group__2_in_rule__Enumerator__Group__14882);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2348:1: rule__Enumerator__Group__1__Impl : ( ( rule__Enumerator__Group_1__0 )? ) ;
    public final void rule__Enumerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2352:1: ( ( ( rule__Enumerator__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2353:1: ( ( rule__Enumerator__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2353:1: ( ( rule__Enumerator__Group_1__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2354:1: ( rule__Enumerator__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2355:1: ( rule__Enumerator__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2355:2: rule__Enumerator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Enumerator__Group_1__0_in_rule__Enumerator__Group__1__Impl4909);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2365:1: rule__Enumerator__Group__2 : rule__Enumerator__Group__2__Impl ;
    public final void rule__Enumerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2369:1: ( rule__Enumerator__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2370:2: rule__Enumerator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Enumerator__Group__2__Impl_in_rule__Enumerator__Group__24940);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2376:1: rule__Enumerator__Group__2__Impl : ( ( rule__Enumerator__ConstraintAssignment_2 )? ) ;
    public final void rule__Enumerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2380:1: ( ( ( rule__Enumerator__ConstraintAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2381:1: ( ( rule__Enumerator__ConstraintAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2381:1: ( ( rule__Enumerator__ConstraintAssignment_2 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2382:1: ( rule__Enumerator__ConstraintAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getConstraintAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2383:1: ( rule__Enumerator__ConstraintAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_CONSTRAINT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2383:2: rule__Enumerator__ConstraintAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Enumerator__ConstraintAssignment_2_in_rule__Enumerator__Group__2__Impl4967);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2399:1: rule__Enumerator__Group_1__0 : rule__Enumerator__Group_1__0__Impl rule__Enumerator__Group_1__1 ;
    public final void rule__Enumerator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2403:1: ( rule__Enumerator__Group_1__0__Impl rule__Enumerator__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2404:2: rule__Enumerator__Group_1__0__Impl rule__Enumerator__Group_1__1
            {
            pushFollow(FOLLOW_rule__Enumerator__Group_1__0__Impl_in_rule__Enumerator__Group_1__05004);
            rule__Enumerator__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumerator__Group_1__1_in_rule__Enumerator__Group_1__05007);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2411:1: rule__Enumerator__Group_1__0__Impl : ( ( '=' ) ) ;
    public final void rule__Enumerator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2415:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2416:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2416:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2417:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2418:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2419:2: '='
            {
            match(input,35,FOLLOW_35_in_rule__Enumerator__Group_1__0__Impl5036); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2430:1: rule__Enumerator__Group_1__1 : rule__Enumerator__Group_1__1__Impl ;
    public final void rule__Enumerator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2434:1: ( rule__Enumerator__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2435:2: rule__Enumerator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Enumerator__Group_1__1__Impl_in_rule__Enumerator__Group_1__15068);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2441:1: rule__Enumerator__Group_1__1__Impl : ( ( rule__Enumerator__ValueAssignment_1_1 ) ) ;
    public final void rule__Enumerator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2445:1: ( ( ( rule__Enumerator__ValueAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2446:1: ( ( rule__Enumerator__ValueAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2446:1: ( ( rule__Enumerator__ValueAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2447:1: ( rule__Enumerator__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getValueAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2448:1: ( rule__Enumerator__ValueAssignment_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2448:2: rule__Enumerator__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Enumerator__ValueAssignment_1_1_in_rule__Enumerator__Group_1__1__Impl5095);
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


    // $ANTLR start "rule__Interface__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2462:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2466:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2467:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__05129);
            rule__Interface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__05132);
            rule__Interface__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2474:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__AnnotationAssignment_0 )* ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2478:1: ( ( ( rule__Interface__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2479:1: ( ( rule__Interface__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2479:1: ( ( rule__Interface__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2480:1: ( rule__Interface__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2481:1: ( rule__Interface__AnnotationAssignment_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2481:2: rule__Interface__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Interface__AnnotationAssignment_0_in_rule__Interface__Group__0__Impl5159);
            	    rule__Interface__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getAnnotationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2491:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2495:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2496:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__15190);
            rule__Interface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__15193);
            rule__Interface__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2503:1: rule__Interface__Group__1__Impl : ( ( 'interface' ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2507:1: ( ( ( 'interface' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2508:1: ( ( 'interface' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2508:1: ( ( 'interface' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2509:1: ( 'interface' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2510:1: ( 'interface' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2511:2: 'interface'
            {
            match(input,36,FOLLOW_36_in_rule__Interface__Group__1__Impl5222); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2522:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2526:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2527:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__25254);
            rule__Interface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__25257);
            rule__Interface__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2534:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2538:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2539:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2539:1: ( ( rule__Interface__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2540:1: ( rule__Interface__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2541:1: ( rule__Interface__NameAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2541:2: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl5284);
            rule__Interface__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2551:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2555:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2556:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__35314);
            rule__Interface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__35317);
            rule__Interface__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2563:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__GeneralizationAssignment_3 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2567:1: ( ( ( rule__Interface__GeneralizationAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2568:1: ( ( rule__Interface__GeneralizationAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2568:1: ( ( rule__Interface__GeneralizationAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2569:1: ( rule__Interface__GeneralizationAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGeneralizationAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2570:1: ( rule__Interface__GeneralizationAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2570:2: rule__Interface__GeneralizationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Interface__GeneralizationAssignment_3_in_rule__Interface__Group__3__Impl5344);
                    rule__Interface__GeneralizationAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGeneralizationAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2580:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2584:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2585:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__45375);
            rule__Interface__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__45378);
            rule__Interface__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2592:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__ConstraintAssignment_4 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2596:1: ( ( ( rule__Interface__ConstraintAssignment_4 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2597:1: ( ( rule__Interface__ConstraintAssignment_4 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2597:1: ( ( rule__Interface__ConstraintAssignment_4 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2598:1: ( rule__Interface__ConstraintAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getConstraintAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2599:1: ( rule__Interface__ConstraintAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_CONSTRAINT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2599:2: rule__Interface__ConstraintAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Interface__ConstraintAssignment_4_in_rule__Interface__Group__4__Impl5405);
                    rule__Interface__ConstraintAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getConstraintAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2609:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2613:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2614:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__55436);
            rule__Interface__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__55439);
            rule__Interface__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2621:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__FeatureAssignment_5 )* ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2625:1: ( ( ( rule__Interface__FeatureAssignment_5 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2626:1: ( ( rule__Interface__FeatureAssignment_5 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2626:1: ( ( rule__Interface__FeatureAssignment_5 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2627:1: ( rule__Interface__FeatureAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getFeatureAssignment_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2628:1: ( rule__Interface__FeatureAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=17 && LA31_0<=18)||(LA31_0>=25 && LA31_0<=26)||LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2628:2: rule__Interface__FeatureAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Interface__FeatureAssignment_5_in_rule__Interface__Group__5__Impl5466);
            	    rule__Interface__FeatureAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getFeatureAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2638:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2642:1: ( rule__Interface__Group__6__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2643:2: rule__Interface__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__65497);
            rule__Interface__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2649:1: rule__Interface__Group__6__Impl : ( 'end' ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2653:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2654:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2654:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2655:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getEndKeyword_6()); 
            }
            match(input,30,FOLLOW_30_in_rule__Interface__Group__6__Impl5525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getEndKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__InterfaceFeature__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2682:1: rule__InterfaceFeature__Group__0 : rule__InterfaceFeature__Group__0__Impl rule__InterfaceFeature__Group__1 ;
    public final void rule__InterfaceFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2686:1: ( rule__InterfaceFeature__Group__0__Impl rule__InterfaceFeature__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2687:2: rule__InterfaceFeature__Group__0__Impl rule__InterfaceFeature__Group__1
            {
            pushFollow(FOLLOW_rule__InterfaceFeature__Group__0__Impl_in_rule__InterfaceFeature__Group__05570);
            rule__InterfaceFeature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InterfaceFeature__Group__1_in_rule__InterfaceFeature__Group__05573);
            rule__InterfaceFeature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceFeature__Group__0"


    // $ANTLR start "rule__InterfaceFeature__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2694:1: rule__InterfaceFeature__Group__0__Impl : ( ( rule__InterfaceFeature__Alternatives_0 ) ) ;
    public final void rule__InterfaceFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2698:1: ( ( ( rule__InterfaceFeature__Alternatives_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2699:1: ( ( rule__InterfaceFeature__Alternatives_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2699:1: ( ( rule__InterfaceFeature__Alternatives_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2700:1: ( rule__InterfaceFeature__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceFeatureAccess().getAlternatives_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2701:1: ( rule__InterfaceFeature__Alternatives_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2701:2: rule__InterfaceFeature__Alternatives_0
            {
            pushFollow(FOLLOW_rule__InterfaceFeature__Alternatives_0_in_rule__InterfaceFeature__Group__0__Impl5600);
            rule__InterfaceFeature__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceFeatureAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceFeature__Group__0__Impl"


    // $ANTLR start "rule__InterfaceFeature__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2711:1: rule__InterfaceFeature__Group__1 : rule__InterfaceFeature__Group__1__Impl ;
    public final void rule__InterfaceFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2715:1: ( rule__InterfaceFeature__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2716:2: rule__InterfaceFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceFeature__Group__1__Impl_in_rule__InterfaceFeature__Group__15630);
            rule__InterfaceFeature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceFeature__Group__1"


    // $ANTLR start "rule__InterfaceFeature__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2722:1: rule__InterfaceFeature__Group__1__Impl : ( ( rule__InterfaceFeature__ConstraintAssignment_1 )? ) ;
    public final void rule__InterfaceFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2726:1: ( ( ( rule__InterfaceFeature__ConstraintAssignment_1 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2727:1: ( ( rule__InterfaceFeature__ConstraintAssignment_1 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2727:1: ( ( rule__InterfaceFeature__ConstraintAssignment_1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2728:1: ( rule__InterfaceFeature__ConstraintAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceFeatureAccess().getConstraintAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2729:1: ( rule__InterfaceFeature__ConstraintAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_CONSTRAINT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2729:2: rule__InterfaceFeature__ConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__InterfaceFeature__ConstraintAssignment_1_in_rule__InterfaceFeature__Group__1__Impl5657);
                    rule__InterfaceFeature__ConstraintAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceFeatureAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceFeature__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2743:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2747:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2748:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__05692);
            rule__Relationship__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__05695);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2755:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__AnnotationAssignment_0 )* ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2759:1: ( ( ( rule__Relationship__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2760:1: ( ( rule__Relationship__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2760:1: ( ( rule__Relationship__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2761:1: ( rule__Relationship__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2762:1: ( rule__Relationship__AnnotationAssignment_0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2762:2: rule__Relationship__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Relationship__AnnotationAssignment_0_in_rule__Relationship__Group__0__Impl5722);
            	    rule__Relationship__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2772:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2776:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2777:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__15753);
            rule__Relationship__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__15756);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2784:1: rule__Relationship__Group__1__Impl : ( ( rule__Relationship__TypeAssignment_1 ) ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2788:1: ( ( ( rule__Relationship__TypeAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2789:1: ( ( rule__Relationship__TypeAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2789:1: ( ( rule__Relationship__TypeAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2790:1: ( rule__Relationship__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTypeAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2791:1: ( rule__Relationship__TypeAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2791:2: rule__Relationship__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Relationship__TypeAssignment_1_in_rule__Relationship__Group__1__Impl5783);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2801:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2805:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2806:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__25813);
            rule__Relationship__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__25816);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2813:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__LabelAssignment_2 )? ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2817:1: ( ( ( rule__Relationship__LabelAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2818:1: ( ( rule__Relationship__LabelAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2818:1: ( ( rule__Relationship__LabelAssignment_2 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2819:1: ( rule__Relationship__LabelAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLabelAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2820:1: ( rule__Relationship__LabelAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2820:2: rule__Relationship__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Relationship__LabelAssignment_2_in_rule__Relationship__Group__2__Impl5843);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2830:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2834:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2835:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__35874);
            rule__Relationship__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__35877);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2842:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__HeadNavigableAssignment_3 )? ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2846:1: ( ( ( rule__Relationship__HeadNavigableAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2847:1: ( ( rule__Relationship__HeadNavigableAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2847:1: ( ( rule__Relationship__HeadNavigableAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2848:1: ( rule__Relationship__HeadNavigableAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadNavigableAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2849:1: ( rule__Relationship__HeadNavigableAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2849:2: rule__Relationship__HeadNavigableAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Relationship__HeadNavigableAssignment_3_in_rule__Relationship__Group__3__Impl5904);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2859:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2863:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2864:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__45935);
            rule__Relationship__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__45938);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2871:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__HeadMultiplicityAssignment_4 )? ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2875:1: ( ( ( rule__Relationship__HeadMultiplicityAssignment_4 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2876:1: ( ( rule__Relationship__HeadMultiplicityAssignment_4 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2876:1: ( ( rule__Relationship__HeadMultiplicityAssignment_4 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2877:1: ( rule__Relationship__HeadMultiplicityAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadMultiplicityAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2878:1: ( rule__Relationship__HeadMultiplicityAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_NATURAL||LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2878:2: rule__Relationship__HeadMultiplicityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Relationship__HeadMultiplicityAssignment_4_in_rule__Relationship__Group__4__Impl5965);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2888:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2892:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2893:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__55996);
            rule__Relationship__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__55999);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2900:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__HeadAssignment_5 ) ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2904:1: ( ( ( rule__Relationship__HeadAssignment_5 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2905:1: ( ( rule__Relationship__HeadAssignment_5 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2905:1: ( ( rule__Relationship__HeadAssignment_5 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2906:1: ( rule__Relationship__HeadAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadAssignment_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2907:1: ( rule__Relationship__HeadAssignment_5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2907:2: rule__Relationship__HeadAssignment_5
            {
            pushFollow(FOLLOW_rule__Relationship__HeadAssignment_5_in_rule__Relationship__Group__5__Impl6026);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2917:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl rule__Relationship__Group__7 ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2921:1: ( rule__Relationship__Group__6__Impl rule__Relationship__Group__7 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2922:2: rule__Relationship__Group__6__Impl rule__Relationship__Group__7
            {
            pushFollow(FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__66056);
            rule__Relationship__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__66059);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2929:1: rule__Relationship__Group__6__Impl : ( ( rule__Relationship__HeadLabelAssignment_6 )? ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2933:1: ( ( ( rule__Relationship__HeadLabelAssignment_6 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2934:1: ( ( rule__Relationship__HeadLabelAssignment_6 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2934:1: ( ( rule__Relationship__HeadLabelAssignment_6 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2935:1: ( rule__Relationship__HeadLabelAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadLabelAssignment_6()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2936:1: ( rule__Relationship__HeadLabelAssignment_6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2936:2: rule__Relationship__HeadLabelAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Relationship__HeadLabelAssignment_6_in_rule__Relationship__Group__6__Impl6086);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2946:1: rule__Relationship__Group__7 : rule__Relationship__Group__7__Impl rule__Relationship__Group__8 ;
    public final void rule__Relationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2950:1: ( rule__Relationship__Group__7__Impl rule__Relationship__Group__8 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2951:2: rule__Relationship__Group__7__Impl rule__Relationship__Group__8
            {
            pushFollow(FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__76117);
            rule__Relationship__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__8_in_rule__Relationship__Group__76120);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2958:1: rule__Relationship__Group__7__Impl : ( ( rule__Relationship__TailNavigableAssignment_7 )? ) ;
    public final void rule__Relationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2962:1: ( ( ( rule__Relationship__TailNavigableAssignment_7 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2963:1: ( ( rule__Relationship__TailNavigableAssignment_7 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2963:1: ( ( rule__Relationship__TailNavigableAssignment_7 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2964:1: ( rule__Relationship__TailNavigableAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailNavigableAssignment_7()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2965:1: ( rule__Relationship__TailNavigableAssignment_7 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2965:2: rule__Relationship__TailNavigableAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Relationship__TailNavigableAssignment_7_in_rule__Relationship__Group__7__Impl6147);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2975:1: rule__Relationship__Group__8 : rule__Relationship__Group__8__Impl rule__Relationship__Group__9 ;
    public final void rule__Relationship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2979:1: ( rule__Relationship__Group__8__Impl rule__Relationship__Group__9 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2980:2: rule__Relationship__Group__8__Impl rule__Relationship__Group__9
            {
            pushFollow(FOLLOW_rule__Relationship__Group__8__Impl_in_rule__Relationship__Group__86178);
            rule__Relationship__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__9_in_rule__Relationship__Group__86181);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2987:1: rule__Relationship__Group__8__Impl : ( ( rule__Relationship__TailMultiplicityAssignment_8 )? ) ;
    public final void rule__Relationship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2991:1: ( ( ( rule__Relationship__TailMultiplicityAssignment_8 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2992:1: ( ( rule__Relationship__TailMultiplicityAssignment_8 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2992:1: ( ( rule__Relationship__TailMultiplicityAssignment_8 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2993:1: ( rule__Relationship__TailMultiplicityAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailMultiplicityAssignment_8()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2994:1: ( rule__Relationship__TailMultiplicityAssignment_8 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_NATURAL||LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2994:2: rule__Relationship__TailMultiplicityAssignment_8
                    {
                    pushFollow(FOLLOW_rule__Relationship__TailMultiplicityAssignment_8_in_rule__Relationship__Group__8__Impl6208);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3004:1: rule__Relationship__Group__9 : rule__Relationship__Group__9__Impl rule__Relationship__Group__10 ;
    public final void rule__Relationship__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3008:1: ( rule__Relationship__Group__9__Impl rule__Relationship__Group__10 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3009:2: rule__Relationship__Group__9__Impl rule__Relationship__Group__10
            {
            pushFollow(FOLLOW_rule__Relationship__Group__9__Impl_in_rule__Relationship__Group__96239);
            rule__Relationship__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__10_in_rule__Relationship__Group__96242);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3016:1: rule__Relationship__Group__9__Impl : ( ( rule__Relationship__TailAssignment_9 ) ) ;
    public final void rule__Relationship__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3020:1: ( ( ( rule__Relationship__TailAssignment_9 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3021:1: ( ( rule__Relationship__TailAssignment_9 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3021:1: ( ( rule__Relationship__TailAssignment_9 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3022:1: ( rule__Relationship__TailAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailAssignment_9()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3023:1: ( rule__Relationship__TailAssignment_9 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3023:2: rule__Relationship__TailAssignment_9
            {
            pushFollow(FOLLOW_rule__Relationship__TailAssignment_9_in_rule__Relationship__Group__9__Impl6269);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3033:1: rule__Relationship__Group__10 : rule__Relationship__Group__10__Impl rule__Relationship__Group__11 ;
    public final void rule__Relationship__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3037:1: ( rule__Relationship__Group__10__Impl rule__Relationship__Group__11 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3038:2: rule__Relationship__Group__10__Impl rule__Relationship__Group__11
            {
            pushFollow(FOLLOW_rule__Relationship__Group__10__Impl_in_rule__Relationship__Group__106299);
            rule__Relationship__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relationship__Group__11_in_rule__Relationship__Group__106302);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3045:1: rule__Relationship__Group__10__Impl : ( ( rule__Relationship__TailLabelAssignment_10 )? ) ;
    public final void rule__Relationship__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3049:1: ( ( ( rule__Relationship__TailLabelAssignment_10 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3050:1: ( ( rule__Relationship__TailLabelAssignment_10 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3050:1: ( ( rule__Relationship__TailLabelAssignment_10 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3051:1: ( rule__Relationship__TailLabelAssignment_10 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailLabelAssignment_10()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3052:1: ( rule__Relationship__TailLabelAssignment_10 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3052:2: rule__Relationship__TailLabelAssignment_10
                    {
                    pushFollow(FOLLOW_rule__Relationship__TailLabelAssignment_10_in_rule__Relationship__Group__10__Impl6329);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3062:1: rule__Relationship__Group__11 : rule__Relationship__Group__11__Impl ;
    public final void rule__Relationship__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3066:1: ( rule__Relationship__Group__11__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3067:2: rule__Relationship__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__11__Impl_in_rule__Relationship__Group__116360);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3073:1: rule__Relationship__Group__11__Impl : ( 'end' ) ;
    public final void rule__Relationship__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3077:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3078:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3078:1: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3079:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getEndKeyword_11()); 
            }
            match(input,30,FOLLOW_30_in_rule__Relationship__Group__11__Impl6388); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3116:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3120:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3121:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__0__Impl_in_rule__Multiplicity__Group__06443);
            rule__Multiplicity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplicity__Group__1_in_rule__Multiplicity__Group__06446);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3128:1: rule__Multiplicity__Group__0__Impl : ( ( rule__Multiplicity__UpperAssignment_0 ) ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3132:1: ( ( ( rule__Multiplicity__UpperAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3133:1: ( ( rule__Multiplicity__UpperAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3133:1: ( ( rule__Multiplicity__UpperAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3134:1: ( rule__Multiplicity__UpperAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getUpperAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3135:1: ( rule__Multiplicity__UpperAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3135:2: rule__Multiplicity__UpperAssignment_0
            {
            pushFollow(FOLLOW_rule__Multiplicity__UpperAssignment_0_in_rule__Multiplicity__Group__0__Impl6473);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3145:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3149:1: ( rule__Multiplicity__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3150:2: rule__Multiplicity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group__1__Impl_in_rule__Multiplicity__Group__16503);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3156:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__Group_1__0 )? ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3160:1: ( ( ( rule__Multiplicity__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3161:1: ( ( rule__Multiplicity__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3161:1: ( ( rule__Multiplicity__Group_1__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3162:1: ( rule__Multiplicity__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3163:1: ( rule__Multiplicity__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3163:2: rule__Multiplicity__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicity__Group_1__0_in_rule__Multiplicity__Group__1__Impl6530);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3177:1: rule__Multiplicity__Group_1__0 : rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 ;
    public final void rule__Multiplicity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3181:1: ( rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3182:2: rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__0__Impl_in_rule__Multiplicity__Group_1__06565);
            rule__Multiplicity__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__1_in_rule__Multiplicity__Group_1__06568);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3189:1: rule__Multiplicity__Group_1__0__Impl : ( ( '..' ) ) ;
    public final void rule__Multiplicity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3193:1: ( ( ( '..' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3194:1: ( ( '..' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3194:1: ( ( '..' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3195:1: ( '..' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3196:1: ( '..' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3197:2: '..'
            {
            match(input,37,FOLLOW_37_in_rule__Multiplicity__Group_1__0__Impl6597); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3208:1: rule__Multiplicity__Group_1__1 : rule__Multiplicity__Group_1__1__Impl ;
    public final void rule__Multiplicity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3212:1: ( rule__Multiplicity__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3213:2: rule__Multiplicity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__1__Impl_in_rule__Multiplicity__Group_1__16629);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3219:1: rule__Multiplicity__Group_1__1__Impl : ( ( rule__Multiplicity__LowerAssignment_1_1 ) ) ;
    public final void rule__Multiplicity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3223:1: ( ( ( rule__Multiplicity__LowerAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3224:1: ( ( rule__Multiplicity__LowerAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3224:1: ( ( rule__Multiplicity__LowerAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3225:1: ( rule__Multiplicity__LowerAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getLowerAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3226:1: ( rule__Multiplicity__LowerAssignment_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3226:2: rule__Multiplicity__LowerAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplicity__LowerAssignment_1_1_in_rule__Multiplicity__Group_1__1__Impl6656);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3240:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3244:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3245:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__06690);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__06693);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3252:1: rule__Constant__Group__0__Impl : ( ( rule__Constant__VisibilityAssignment_0 )? ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3256:1: ( ( ( rule__Constant__VisibilityAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3257:1: ( ( rule__Constant__VisibilityAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3257:1: ( ( rule__Constant__VisibilityAssignment_0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3258:1: ( rule__Constant__VisibilityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getVisibilityAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3259:1: ( rule__Constant__VisibilityAssignment_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=17 && LA42_0<=18)||(LA42_0>=25 && LA42_0<=26)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3259:2: rule__Constant__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Constant__VisibilityAssignment_0_in_rule__Constant__Group__0__Impl6720);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3269:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3273:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3274:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__16751);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__16754);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3281:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3285:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3286:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3286:1: ( ( rule__Constant__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3287:1: ( rule__Constant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3288:1: ( rule__Constant__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3288:2: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl6781);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3298:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3302:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3303:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__26811);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__26814);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3310:1: rule__Constant__Group__2__Impl : ( '=' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3314:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3315:1: ( '=' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3315:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3316:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Constant__Group__2__Impl6842); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3329:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3333:1: ( rule__Constant__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3334:2: rule__Constant__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__36873);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3340:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ValueAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3344:1: ( ( ( rule__Constant__ValueAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3345:1: ( ( rule__Constant__ValueAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3345:1: ( ( rule__Constant__ValueAssignment_3 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3346:1: ( rule__Constant__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3347:1: ( rule__Constant__ValueAssignment_3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3347:2: rule__Constant__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl6900);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3365:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3369:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3370:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__06938);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__06941);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3377:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__UnorderedGroup_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3381:1: ( ( ( rule__Operation__UnorderedGroup_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3382:1: ( ( rule__Operation__UnorderedGroup_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3382:1: ( ( rule__Operation__UnorderedGroup_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3383:1: ( rule__Operation__UnorderedGroup_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getUnorderedGroup_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3384:1: ( rule__Operation__UnorderedGroup_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3384:2: rule__Operation__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0_in_rule__Operation__Group__0__Impl6968);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3394:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3398:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3399:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__16998);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__17001);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3406:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3410:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3411:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3411:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3412:1: ( rule__Operation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3413:1: ( rule__Operation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3413:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl7028);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3423:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3427:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3428:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__27058);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__27061);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3435:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3439:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3440:1: ( '(' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3440:1: ( '(' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3441:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__Operation__Group__2__Impl7089); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3454:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3458:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3459:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__37120);
            rule__Operation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__37123);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3466:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3470:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3471:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3471:1: ( ( rule__Operation__Group_3__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3472:1: ( rule__Operation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3473:1: ( rule__Operation__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3473:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl7150);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3483:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3487:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3488:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__47181);
            rule__Operation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__47184);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3495:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3499:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3500:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3500:1: ( ')' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3501:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__Operation__Group__4__Impl7212); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3514:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3518:1: ( rule__Operation__Group__5__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3519:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__57243);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3525:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3529:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3530:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3530:1: ( ( rule__Operation__Group_5__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3531:1: ( rule__Operation__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3532:1: ( rule__Operation__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3532:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl7270);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3554:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3558:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3559:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__07313);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__07316);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3566:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__ParameterAssignment_3_0 ) ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3570:1: ( ( ( rule__Operation__ParameterAssignment_3_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3571:1: ( ( rule__Operation__ParameterAssignment_3_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3571:1: ( ( rule__Operation__ParameterAssignment_3_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3572:1: ( rule__Operation__ParameterAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParameterAssignment_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3573:1: ( rule__Operation__ParameterAssignment_3_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3573:2: rule__Operation__ParameterAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Operation__ParameterAssignment_3_0_in_rule__Operation__Group_3__0__Impl7343);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3583:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3587:1: ( rule__Operation__Group_3__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3588:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__17373);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3594:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__Group_3_1__0 )* ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3598:1: ( ( ( rule__Operation__Group_3_1__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3599:1: ( ( rule__Operation__Group_3_1__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3599:1: ( ( rule__Operation__Group_3_1__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3600:1: ( rule__Operation__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3601:1: ( rule__Operation__Group_3_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==33) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3601:2: rule__Operation__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl7400);
            	    rule__Operation__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3615:1: rule__Operation__Group_3_1__0 : rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 ;
    public final void rule__Operation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3619:1: ( rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3620:2: rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__07435);
            rule__Operation__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__07438);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3627:1: rule__Operation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3631:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3632:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3632:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3633:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Operation__Group_3_1__0__Impl7466); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3646:1: rule__Operation__Group_3_1__1 : rule__Operation__Group_3_1__1__Impl ;
    public final void rule__Operation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3650:1: ( rule__Operation__Group_3_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3651:2: rule__Operation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__17497);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3657:1: rule__Operation__Group_3_1__1__Impl : ( ( rule__Operation__ParameterAssignment_3_1_1 ) ) ;
    public final void rule__Operation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3661:1: ( ( ( rule__Operation__ParameterAssignment_3_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3662:1: ( ( rule__Operation__ParameterAssignment_3_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3662:1: ( ( rule__Operation__ParameterAssignment_3_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3663:1: ( rule__Operation__ParameterAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParameterAssignment_3_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3664:1: ( rule__Operation__ParameterAssignment_3_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3664:2: rule__Operation__ParameterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ParameterAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl7524);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3678:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3682:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3683:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__07558);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__07561);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3690:1: rule__Operation__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3694:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3695:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3695:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3696:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_5_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Operation__Group_5__0__Impl7589); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3709:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3713:1: ( rule__Operation__Group_5__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3714:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__17620);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3720:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__ReturnAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3724:1: ( ( ( rule__Operation__ReturnAssignment_5_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3725:1: ( ( rule__Operation__ReturnAssignment_5_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3725:1: ( ( rule__Operation__ReturnAssignment_5_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3726:1: ( rule__Operation__ReturnAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnAssignment_5_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3727:1: ( rule__Operation__ReturnAssignment_5_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3727:2: rule__Operation__ReturnAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Operation__ReturnAssignment_5_1_in_rule__Operation__Group_5__1__Impl7647);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3741:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3745:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3746:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__07681);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07684);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3753:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3757:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3758:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3758:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3759:1: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3760:1: ( rule__Parameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3760:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl7711);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3770:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3774:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3775:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__17741);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__17744);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3782:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3786:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3787:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3787:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3788:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Parameter__Group__1__Impl7772); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3801:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3805:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3806:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__27803);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__27806);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3813:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3817:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3818:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3818:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3819:1: ( rule__Parameter__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3820:1: ( rule__Parameter__TypeAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3820:2: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl7833);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3830:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3834:1: ( rule__Parameter__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3835:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__37863);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3841:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3845:1: ( ( ( rule__Parameter__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3846:1: ( ( rule__Parameter__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3846:1: ( ( rule__Parameter__Group_3__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3847:1: ( rule__Parameter__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3848:1: ( rule__Parameter__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3848:2: rule__Parameter__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Group__3__Impl7890);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3866:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3870:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3871:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__07929);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__07932);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3878:1: rule__Parameter__Group_3__0__Impl : ( ( '=' ) ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3882:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3883:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3883:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3884:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3885:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3886:2: '='
            {
            match(input,35,FOLLOW_35_in_rule__Parameter__Group_3__0__Impl7961); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3897:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2 ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3901:1: ( rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3902:2: rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__17993);
            rule__Parameter__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3__2_in_rule__Parameter__Group_3__17996);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3909:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__ImplicitAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3913:1: ( ( ( rule__Parameter__ImplicitAssignment_3_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3914:1: ( ( rule__Parameter__ImplicitAssignment_3_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3914:1: ( ( rule__Parameter__ImplicitAssignment_3_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3915:1: ( rule__Parameter__ImplicitAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitAssignment_3_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3916:1: ( rule__Parameter__ImplicitAssignment_3_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3916:2: rule__Parameter__ImplicitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Parameter__ImplicitAssignment_3_1_in_rule__Parameter__Group_3__1__Impl8023);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3926:1: rule__Parameter__Group_3__2 : rule__Parameter__Group_3__2__Impl ;
    public final void rule__Parameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3930:1: ( rule__Parameter__Group_3__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3931:2: rule__Parameter__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__2__Impl_in_rule__Parameter__Group_3__28053);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3937:1: rule__Parameter__Group_3__2__Impl : ( ( rule__Parameter__Group_3_2__0 )* ) ;
    public final void rule__Parameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3941:1: ( ( ( rule__Parameter__Group_3_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3942:1: ( ( rule__Parameter__Group_3_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3942:1: ( ( rule__Parameter__Group_3_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3943:1: ( rule__Parameter__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_3_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3944:1: ( rule__Parameter__Group_3_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==33) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==RULE_ID) ) {
                        int LA47_3 = input.LA(3);

                        if ( (LA47_3==EOF||LA47_3==33||LA47_3==39) ) {
                            alt47=1;
                        }


                    }
                    else if ( ((LA47_2>=RULE_NATURAL && LA47_2<=RULE_STRING)||LA47_2==18) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3944:2: rule__Parameter__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__Group_3__2__Impl8080);
            	    rule__Parameter__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3960:1: rule__Parameter__Group_3_2__0 : rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 ;
    public final void rule__Parameter__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3964:1: ( rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3965:2: rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__08117);
            rule__Parameter__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__08120);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3972:1: rule__Parameter__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Parameter__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3976:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3977:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3977:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3978:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Parameter__Group_3_2__0__Impl8148); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3991:1: rule__Parameter__Group_3_2__1 : rule__Parameter__Group_3_2__1__Impl ;
    public final void rule__Parameter__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3995:1: ( rule__Parameter__Group_3_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3996:2: rule__Parameter__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__18179);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4002:1: rule__Parameter__Group_3_2__1__Impl : ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) ) ;
    public final void rule__Parameter__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4006:1: ( ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4007:1: ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4007:1: ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4008:1: ( rule__Parameter__ImplicitAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitAssignment_3_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4009:1: ( rule__Parameter__ImplicitAssignment_3_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4009:2: rule__Parameter__ImplicitAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__ImplicitAssignment_3_2_1_in_rule__Parameter__Group_3_2__1__Impl8206);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4023:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4027:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4028:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__08240);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__08243);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4035:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__UnorderedGroup_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4039:1: ( ( ( rule__Attribute__UnorderedGroup_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4040:1: ( ( rule__Attribute__UnorderedGroup_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4040:1: ( ( rule__Attribute__UnorderedGroup_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4041:1: ( rule__Attribute__UnorderedGroup_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getUnorderedGroup_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4042:1: ( rule__Attribute__UnorderedGroup_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4042:2: rule__Attribute__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0_in_rule__Attribute__Group__0__Impl8270);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4052:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4056:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4057:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__18300);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__18303);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4064:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4068:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4069:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4069:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4070:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4071:1: ( rule__Attribute__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4071:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl8330);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4081:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4085:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4086:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__28360);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__28363);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4093:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4097:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4098:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4098:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4099:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__Attribute__Group__2__Impl8391); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4112:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4116:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4117:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__38422);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__38425);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4124:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4128:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4129:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4129:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4130:1: ( rule__Attribute__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4131:1: ( rule__Attribute__TypeAssignment_3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4131:2: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl8452);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4141:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4145:1: ( rule__Attribute__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4146:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__48482);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4152:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4156:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4157:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4157:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4158:1: ( rule__Attribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4159:1: ( rule__Attribute__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4159:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl8509);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4179:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4183:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4184:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__08550);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__08553);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4191:1: rule__Attribute__Group_4__0__Impl : ( ( '=' ) ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4195:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4196:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4196:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4197:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4198:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4199:2: '='
            {
            match(input,35,FOLLOW_35_in_rule__Attribute__Group_4__0__Impl8582); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4210:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4214:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4215:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__18614);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__18617);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4222:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__ImplicitAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4226:1: ( ( ( rule__Attribute__ImplicitAssignment_4_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4227:1: ( ( rule__Attribute__ImplicitAssignment_4_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4227:1: ( ( rule__Attribute__ImplicitAssignment_4_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4228:1: ( rule__Attribute__ImplicitAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitAssignment_4_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4229:1: ( rule__Attribute__ImplicitAssignment_4_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4229:2: rule__Attribute__ImplicitAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attribute__ImplicitAssignment_4_1_in_rule__Attribute__Group_4__1__Impl8644);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4239:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4243:1: ( rule__Attribute__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4244:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__28674);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4250:1: rule__Attribute__Group_4__2__Impl : ( ( rule__Attribute__Group_4_2__0 )* ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4254:1: ( ( ( rule__Attribute__Group_4_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4255:1: ( ( rule__Attribute__Group_4_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4255:1: ( ( rule__Attribute__Group_4_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4256:1: ( rule__Attribute__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4257:1: ( rule__Attribute__Group_4_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==33) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4257:2: rule__Attribute__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__Group_4_2__0_in_rule__Attribute__Group_4__2__Impl8701);
            	    rule__Attribute__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4273:1: rule__Attribute__Group_4_2__0 : rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 ;
    public final void rule__Attribute__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4277:1: ( rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4278:2: rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__0__Impl_in_rule__Attribute__Group_4_2__08738);
            rule__Attribute__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__1_in_rule__Attribute__Group_4_2__08741);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4285:1: rule__Attribute__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4289:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4290:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4290:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4291:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Attribute__Group_4_2__0__Impl8769); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4304:1: rule__Attribute__Group_4_2__1 : rule__Attribute__Group_4_2__1__Impl ;
    public final void rule__Attribute__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4308:1: ( rule__Attribute__Group_4_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4309:2: rule__Attribute__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__1__Impl_in_rule__Attribute__Group_4_2__18800);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4315:1: rule__Attribute__Group_4_2__1__Impl : ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) ) ;
    public final void rule__Attribute__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4319:1: ( ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4320:1: ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4320:1: ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4321:1: ( rule__Attribute__ImplicitAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitAssignment_4_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4322:1: ( rule__Attribute__ImplicitAssignment_4_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4322:2: rule__Attribute__ImplicitAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__ImplicitAssignment_4_2_1_in_rule__Attribute__Group_4_2__1__Impl8827);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4336:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4340:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4341:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08861);
            rule__Reference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08864);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4348:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__TypeAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4352:1: ( ( ( rule__Reference__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4353:1: ( ( rule__Reference__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4353:1: ( ( rule__Reference__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4354:1: ( rule__Reference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4355:1: ( rule__Reference__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4355:2: rule__Reference__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl8891);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4365:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4369:1: ( rule__Reference__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4370:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18921);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4376:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ArrayAssignment_1 )* ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4380:1: ( ( ( rule__Reference__ArrayAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4381:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4381:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4382:1: ( rule__Reference__ArrayAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4383:1: ( rule__Reference__ArrayAssignment_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==41) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4383:2: rule__Reference__ArrayAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl8948);
            	    rule__Reference__ArrayAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4397:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4401:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4402:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__08983);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__08986);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4409:1: rule__Array__Group__0__Impl : ( () ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4413:1: ( ( () ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4414:1: ( () )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4414:1: ( () )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4415:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getArrayAction_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4416:1: ()
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4418:1: 
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4428:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4432:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4433:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19044);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19047);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4440:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4444:1: ( ( '[' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4445:1: ( '[' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4445:1: ( '[' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4446:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Array__Group__1__Impl9075); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4459:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4463:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4464:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29106);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__29109);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4471:1: rule__Array__Group__2__Impl : ( ( rule__Array__SizeAssignment_2 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4475:1: ( ( ( rule__Array__SizeAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4476:1: ( ( rule__Array__SizeAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4476:1: ( ( rule__Array__SizeAssignment_2 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4477:1: ( rule__Array__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4478:1: ( rule__Array__SizeAssignment_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_NATURAL) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4478:2: rule__Array__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl9136);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4488:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4492:1: ( rule__Array__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4493:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__39167);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4499:1: rule__Array__Group__3__Impl : ( ']' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4503:1: ( ( ']' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4504:1: ( ']' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4504:1: ( ']' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4505:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,42,FOLLOW_42_in_rule__Array__Group__3__Impl9195); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4526:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4530:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4531:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__09234);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__09237);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4538:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4542:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4543:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4543:1: ( '@' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4544:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Annotation__Group__0__Impl9265); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4557:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4561:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4562:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__19296);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__19299);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4569:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4573:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4574:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4574:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4575:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4576:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4576:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl9326);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4586:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4590:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4591:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__29356);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4597:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4601:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4602:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4602:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4603:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4604:1: ( rule__Annotation__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4604:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl9383);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4620:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4624:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4625:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__09420);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__09423);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4632:1: rule__Annotation__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4636:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4637:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4637:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4638:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4639:1: ( '(' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4640:2: '('
            {
            match(input,38,FOLLOW_38_in_rule__Annotation__Group_2__0__Impl9452); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4651:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4655:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4656:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__19484);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__19487);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4663:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4667:1: ( ( ( rule__Annotation__ParameterAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4668:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4668:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4669:1: ( rule__Annotation__ParameterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4670:1: ( rule__Annotation__ParameterAssignment_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4670:2: rule__Annotation__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl9514);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4680:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4684:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4685:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__29544);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__29547);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4692:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4696:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4697:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4697:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4698:1: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4699:1: ( rule__Annotation__Group_2_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==33) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4699:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl9574);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4709:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4713:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4714:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__39605);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4720:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4724:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4725:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4725:1: ( ')' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4726:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__Annotation__Group_2__3__Impl9633); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4747:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4751:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4752:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__09672);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__09675);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4759:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4763:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4764:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4764:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4765:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Annotation__Group_2_2__0__Impl9703); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4778:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4782:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4783:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__19734);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4789:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4793:1: ( ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4794:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4794:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4795:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4796:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4796:2: rule__Annotation__ParameterAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl9761);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4811:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4815:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4816:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09796);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09799);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4823:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4827:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4828:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4828:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4829:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9826); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4840:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4844:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4845:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19855);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4851:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4855:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4856:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4856:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4857:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4858:1: ( rule__ExtendedID__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==44) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4858:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9882);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4872:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4876:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4877:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__09917);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__09920);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4884:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4888:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4889:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4889:1: ( '.' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4890:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ExtendedID__Group_1__0__Impl9948); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4903:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4907:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4908:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__19979);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4914:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4918:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4919:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4919:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4920:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl10006); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4935:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4939:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4940:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__010039);
            rule__Real__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__010042);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4947:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4951:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4952:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4952:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4953:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4954:1: ( '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4955:2: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__Real__Group__0__Impl10071); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4966:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4970:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4971:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__110104);
            rule__Real__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__110107);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4978:1: rule__Real__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4982:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4983:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4983:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4984:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl10134); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4995:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4999:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5000:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__210163);
            rule__Real__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__3_in_rule__Real__Group__210166);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5007:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5011:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5012:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5012:1: ( '.' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5013:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__Real__Group__2__Impl10194); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5026:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5030:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5031:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__310225);
            rule__Real__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__4_in_rule__Real__Group__310228);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5038:1: rule__Real__Group__3__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5042:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5043:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5043:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5044:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl10255); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5055:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5059:1: ( rule__Real__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5060:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__410284);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5066:1: rule__Real__Group__4__Impl : ( ( rule__Real__Group_4__0 )? ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5070:1: ( ( ( rule__Real__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5071:1: ( ( rule__Real__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5071:1: ( ( rule__Real__Group_4__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5072:1: ( rule__Real__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5073:1: ( rule__Real__Group_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=15 && LA56_0<=16)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5073:2: rule__Real__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl10311);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5093:1: rule__Real__Group_4__0 : rule__Real__Group_4__0__Impl rule__Real__Group_4__1 ;
    public final void rule__Real__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5097:1: ( rule__Real__Group_4__0__Impl rule__Real__Group_4__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5098:2: rule__Real__Group_4__0__Impl rule__Real__Group_4__1
            {
            pushFollow(FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__010352);
            rule__Real__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__010355);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5105:1: rule__Real__Group_4__0__Impl : ( ( rule__Real__Alternatives_4_0 ) ) ;
    public final void rule__Real__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5109:1: ( ( ( rule__Real__Alternatives_4_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5110:1: ( ( rule__Real__Alternatives_4_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5110:1: ( ( rule__Real__Alternatives_4_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5111:1: ( rule__Real__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5112:1: ( rule__Real__Alternatives_4_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5112:2: rule__Real__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl10382);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5122:1: rule__Real__Group_4__1 : rule__Real__Group_4__1__Impl rule__Real__Group_4__2 ;
    public final void rule__Real__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5126:1: ( rule__Real__Group_4__1__Impl rule__Real__Group_4__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5127:2: rule__Real__Group_4__1__Impl rule__Real__Group_4__2
            {
            pushFollow(FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__110412);
            rule__Real__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__110415);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5134:1: rule__Real__Group_4__1__Impl : ( ( rule__Real__Alternatives_4_1 ) ) ;
    public final void rule__Real__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5138:1: ( ( ( rule__Real__Alternatives_4_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5139:1: ( ( rule__Real__Alternatives_4_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5139:1: ( ( rule__Real__Alternatives_4_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5140:1: ( rule__Real__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5141:1: ( rule__Real__Alternatives_4_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5141:2: rule__Real__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl10442);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5151:1: rule__Real__Group_4__2 : rule__Real__Group_4__2__Impl ;
    public final void rule__Real__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5155:1: ( rule__Real__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5156:2: rule__Real__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__210472);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5162:1: rule__Real__Group_4__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5166:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5167:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5167:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5168:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl10499); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5185:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5189:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5190:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__010534);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__010537);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5197:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5201:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5202:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5202:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5203:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5204:1: ( '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==18) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5205:2: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__Integer__Group__0__Impl10566); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5216:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5220:1: ( rule__Integer__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5221:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__110599);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5227:1: rule__Integer__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5231:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5232:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5232:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5233:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl10626); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5249:1: rule__Operation__UnorderedGroup_0 : ( rule__Operation__UnorderedGroup_0__0 )? ;
    public final void rule__Operation__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5254:1: ( ( rule__Operation__UnorderedGroup_0__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5255:2: ( rule__Operation__UnorderedGroup_0__0 )?
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5255:2: ( rule__Operation__UnorderedGroup_0__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( LA58_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Operation__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__0_in_rule__Operation__UnorderedGroup_010660);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5265:1: rule__Operation__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) ) ;
    public final void rule__Operation__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5270:1: ( ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5271:3: ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5271:3: ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( LA59_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5273:4: ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5273:4: ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5274:5: {...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Operation__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5274:106: ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5275:6: ( ( rule__Operation__VisibilityAssignment_0_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5281:6: ( ( rule__Operation__VisibilityAssignment_0_0 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5283:7: ( rule__Operation__VisibilityAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getVisibilityAssignment_0_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5284:7: ( rule__Operation__VisibilityAssignment_0_0 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5284:8: rule__Operation__VisibilityAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Operation__VisibilityAssignment_0_0_in_rule__Operation__UnorderedGroup_0__Impl10747);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5290:4: ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5290:4: ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5291:5: {...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Operation__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5291:106: ( ( ( rule__Operation__StaticAssignment_0_1 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5292:6: ( ( rule__Operation__StaticAssignment_0_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5298:6: ( ( rule__Operation__StaticAssignment_0_1 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5300:7: ( rule__Operation__StaticAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getStaticAssignment_0_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5301:7: ( rule__Operation__StaticAssignment_0_1 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5301:8: rule__Operation__StaticAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Operation__StaticAssignment_0_1_in_rule__Operation__UnorderedGroup_0__Impl10838);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5316:1: rule__Operation__UnorderedGroup_0__0 : rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )? ;
    public final void rule__Operation__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5320:1: ( rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5321:2: rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__010897);
            rule__Operation__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5322:2: ( rule__Operation__UnorderedGroup_0__1 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( LA60_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Operation__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__1_in_rule__Operation__UnorderedGroup_0__010900);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5329:1: rule__Operation__UnorderedGroup_0__1 : rule__Operation__UnorderedGroup_0__Impl ;
    public final void rule__Operation__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5333:1: ( rule__Operation__UnorderedGroup_0__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5334:2: rule__Operation__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__110925);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5345:1: rule__Attribute__UnorderedGroup_0 : ( rule__Attribute__UnorderedGroup_0__0 )? ;
    public final void rule__Attribute__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5350:1: ( ( rule__Attribute__UnorderedGroup_0__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5351:2: ( rule__Attribute__UnorderedGroup_0__0 )?
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5351:2: ( rule__Attribute__UnorderedGroup_0__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( LA61_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Attribute__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_rule__Attribute__UnorderedGroup_010953);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5361:1: rule__Attribute__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5366:1: ( ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5367:3: ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5367:3: ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( LA62_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5369:4: ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5369:4: ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5370:5: {...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5370:106: ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5371:6: ( ( rule__Attribute__VisibilityAssignment_0_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5377:6: ( ( rule__Attribute__VisibilityAssignment_0_0 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5379:7: ( rule__Attribute__VisibilityAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5380:7: ( rule__Attribute__VisibilityAssignment_0_0 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5380:8: rule__Attribute__VisibilityAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__VisibilityAssignment_0_0_in_rule__Attribute__UnorderedGroup_0__Impl11040);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5386:4: ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5386:4: ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5387:5: {...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5387:106: ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5388:6: ( ( rule__Attribute__StaticAssignment_0_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5394:6: ( ( rule__Attribute__StaticAssignment_0_1 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5396:7: ( rule__Attribute__StaticAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getStaticAssignment_0_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5397:7: ( rule__Attribute__StaticAssignment_0_1 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5397:8: rule__Attribute__StaticAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__StaticAssignment_0_1_in_rule__Attribute__UnorderedGroup_0__Impl11131);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5412:1: rule__Attribute__UnorderedGroup_0__0 : rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )? ;
    public final void rule__Attribute__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5416:1: ( rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5417:2: rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__011190);
            rule__Attribute__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5418:2: ( rule__Attribute__UnorderedGroup_0__1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( LA63_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt63=1;
            }
            else if ( LA63_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt63=1;
            }
            else if ( LA63_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt63=1;
            }
            else if ( LA63_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt63=1;
            }
            else if ( LA63_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Attribute__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_rule__Attribute__UnorderedGroup_0__011193);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5425:1: rule__Attribute__UnorderedGroup_0__1 : rule__Attribute__UnorderedGroup_0__Impl ;
    public final void rule__Attribute__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5429:1: ( rule__Attribute__UnorderedGroup_0__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5430:2: rule__Attribute__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__111218);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5441:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5445:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5446:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5446:1: ( ruleImport )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5447:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_011250);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5456:1: rule__Model__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5460:1: ( ( ruleElement ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5461:1: ( ruleElement )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5461:1: ( ruleElement )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5462:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_111281);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5471:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5475:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5476:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5476:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5477:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111312); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5486:1: rule__Datatype__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Datatype__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5490:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5491:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5491:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5492:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Datatype__AnnotationAssignment_011343);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5501:1: rule__Datatype__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5505:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5506:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5506:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5507:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Datatype__NameAssignment_211374); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5516:1: rule__Package__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Package__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5520:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5521:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5521:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5522:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Package__AnnotationAssignment_011405);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5531:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5535:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5536:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5536:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5537:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_211436); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5546:1: rule__Package__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__Package__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5550:1: ( ( ruleElement ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5551:1: ( ruleElement )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5551:1: ( ruleElement )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5552:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Package__ElementAssignment_311467);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5561:1: rule__Classifier__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Classifier__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5565:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5566:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5566:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5567:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Classifier__AnnotationAssignment_011498);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5576:1: rule__Classifier__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Classifier__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5580:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5581:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5581:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5582:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__NameAssignment_211529); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5591:1: rule__Classifier__GeneralizationAssignment_3 : ( ruleGeneralization ) ;
    public final void rule__Classifier__GeneralizationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5595:1: ( ( ruleGeneralization ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5596:1: ( ruleGeneralization )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5596:1: ( ruleGeneralization )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5597:1: ruleGeneralization
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGeneralizationGeneralizationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGeneralization_in_rule__Classifier__GeneralizationAssignment_311560);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5606:1: rule__Classifier__ConstraintAssignment_4 : ( RULE_CONSTRAINT ) ;
    public final void rule__Classifier__ConstraintAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5610:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5611:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5611:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5612:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Classifier__ConstraintAssignment_411591); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5621:1: rule__Classifier__FeatureAssignment_5 : ( ruleFeature ) ;
    public final void rule__Classifier__FeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5625:1: ( ( ruleFeature ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5626:1: ( ruleFeature )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5626:1: ( ruleFeature )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5627:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFeatureFeatureParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_rule__Classifier__FeatureAssignment_511622);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5636:1: rule__Generalization__ClassifierAssignment_1 : ( ruleType ) ;
    public final void rule__Generalization__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5640:1: ( ( ruleType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5641:1: ( ruleType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5641:1: ( ruleType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5642:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Generalization__ClassifierAssignment_111653);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5651:1: rule__Generalization__ClassifierAssignment_2_1 : ( ruleType ) ;
    public final void rule__Generalization__ClassifierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5655:1: ( ( ruleType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5656:1: ( ruleType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5656:1: ( ruleType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5657:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Generalization__ClassifierAssignment_2_111684);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5666:1: rule__Type__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Type__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5670:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5671:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5671:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5672:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Type__VisibilityAssignment_011715);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5681:1: rule__Type__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5685:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5686:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5686:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5687:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Type__NameAssignment_111746);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5696:1: rule__Feature__ConstraintAssignment_1 : ( RULE_CONSTRAINT ) ;
    public final void rule__Feature__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5700:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5701:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5701:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5702:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getConstraintCONSTRAINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Feature__ConstraintAssignment_111777); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5711:1: rule__Enumeration__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Enumeration__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5715:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5716:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5716:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5717:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Enumeration__AnnotationAssignment_011808);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5726:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5730:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5731:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5731:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5732:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_211839); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5741:1: rule__Enumeration__ConstraintAssignment_3 : ( RULE_CONSTRAINT ) ;
    public final void rule__Enumeration__ConstraintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5745:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5746:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5746:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5747:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getConstraintCONSTRAINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Enumeration__ConstraintAssignment_311870); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5756:1: rule__Enumeration__EnumeratorAssignment_4 : ( ruleEnumerator ) ;
    public final void rule__Enumeration__EnumeratorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5760:1: ( ( ruleEnumerator ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5761:1: ( ruleEnumerator )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5761:1: ( ruleEnumerator )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5762:1: ruleEnumerator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumeratorEnumeratorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleEnumerator_in_rule__Enumeration__EnumeratorAssignment_411901);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5771:1: rule__Enumerator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Enumerator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5775:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5776:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5776:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5777:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumerator__NameAssignment_011932); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5786:1: rule__Enumerator__ValueAssignment_1_1 : ( ruleImplicitValue ) ;
    public final void rule__Enumerator__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5790:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5791:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5791:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5792:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getValueImplicitValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Enumerator__ValueAssignment_1_111963);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5801:1: rule__Enumerator__ConstraintAssignment_2 : ( RULE_CONSTRAINT ) ;
    public final void rule__Enumerator__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5805:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5806:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5806:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5807:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumeratorAccess().getConstraintCONSTRAINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Enumerator__ConstraintAssignment_211994); if (state.failed) return ;
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


    // $ANTLR start "rule__Interface__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5816:1: rule__Interface__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Interface__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5820:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5821:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5821:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5822:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Interface__AnnotationAssignment_012025);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__AnnotationAssignment_0"


    // $ANTLR start "rule__Interface__NameAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5831:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5835:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5836:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5836:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5837:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_212056); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_2"


    // $ANTLR start "rule__Interface__GeneralizationAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5846:1: rule__Interface__GeneralizationAssignment_3 : ( ruleGeneralization ) ;
    public final void rule__Interface__GeneralizationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5850:1: ( ( ruleGeneralization ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5851:1: ( ruleGeneralization )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5851:1: ( ruleGeneralization )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5852:1: ruleGeneralization
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGeneralizationGeneralizationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGeneralization_in_rule__Interface__GeneralizationAssignment_312087);
            ruleGeneralization();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGeneralizationGeneralizationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__GeneralizationAssignment_3"


    // $ANTLR start "rule__Interface__ConstraintAssignment_4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5861:1: rule__Interface__ConstraintAssignment_4 : ( RULE_CONSTRAINT ) ;
    public final void rule__Interface__ConstraintAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5865:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5866:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5866:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5867:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__Interface__ConstraintAssignment_412118); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ConstraintAssignment_4"


    // $ANTLR start "rule__Interface__FeatureAssignment_5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5876:1: rule__Interface__FeatureAssignment_5 : ( ruleInterfaceFeature ) ;
    public final void rule__Interface__FeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5880:1: ( ( ruleInterfaceFeature ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5881:1: ( ruleInterfaceFeature )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5881:1: ( ruleInterfaceFeature )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5882:1: ruleInterfaceFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getFeatureInterfaceFeatureParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleInterfaceFeature_in_rule__Interface__FeatureAssignment_512149);
            ruleInterfaceFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getFeatureInterfaceFeatureParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__FeatureAssignment_5"


    // $ANTLR start "rule__InterfaceFeature__ConstraintAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5891:1: rule__InterfaceFeature__ConstraintAssignment_1 : ( RULE_CONSTRAINT ) ;
    public final void rule__InterfaceFeature__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5895:1: ( ( RULE_CONSTRAINT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5896:1: ( RULE_CONSTRAINT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5896:1: ( RULE_CONSTRAINT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5897:1: RULE_CONSTRAINT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceFeatureAccess().getConstraintCONSTRAINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_rule__InterfaceFeature__ConstraintAssignment_112180); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceFeatureAccess().getConstraintCONSTRAINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceFeature__ConstraintAssignment_1"


    // $ANTLR start "rule__Relationship__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5906:1: rule__Relationship__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Relationship__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5910:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5911:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5911:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5912:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Relationship__AnnotationAssignment_012211);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5921:1: rule__Relationship__TypeAssignment_1 : ( ruleRelationshipType ) ;
    public final void rule__Relationship__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5925:1: ( ( ruleRelationshipType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5926:1: ( ruleRelationshipType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5926:1: ( ruleRelationshipType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5927:1: ruleRelationshipType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRelationshipType_in_rule__Relationship__TypeAssignment_112242);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5936:1: rule__Relationship__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Relationship__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5940:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5941:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5941:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5942:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relationship__LabelAssignment_212273); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5951:1: rule__Relationship__HeadNavigableAssignment_3 : ( ( 'navigable' ) ) ;
    public final void rule__Relationship__HeadNavigableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5955:1: ( ( ( 'navigable' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5956:1: ( ( 'navigable' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5956:1: ( ( 'navigable' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5957:1: ( 'navigable' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadNavigableNavigableKeyword_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5958:1: ( 'navigable' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5959:1: 'navigable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadNavigableNavigableKeyword_3_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Relationship__HeadNavigableAssignment_312309); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5974:1: rule__Relationship__HeadMultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Relationship__HeadMultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5978:1: ( ( ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5979:1: ( ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5979:1: ( ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5980:1: ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadMultiplicityMultiplicityParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Relationship__HeadMultiplicityAssignment_412348);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5989:1: rule__Relationship__HeadAssignment_5 : ( ruleExtendedID ) ;
    public final void rule__Relationship__HeadAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5993:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5994:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5994:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5995:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadExtendedIDParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Relationship__HeadAssignment_512379);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6004:1: rule__Relationship__HeadLabelAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Relationship__HeadLabelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6008:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6009:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6009:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6010:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getHeadLabelSTRINGTerminalRuleCall_6_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relationship__HeadLabelAssignment_612410); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6019:1: rule__Relationship__TailNavigableAssignment_7 : ( ( 'navigable' ) ) ;
    public final void rule__Relationship__TailNavigableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6023:1: ( ( ( 'navigable' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6024:1: ( ( 'navigable' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6024:1: ( ( 'navigable' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6025:1: ( 'navigable' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailNavigableNavigableKeyword_7_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6026:1: ( 'navigable' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6027:1: 'navigable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailNavigableNavigableKeyword_7_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Relationship__TailNavigableAssignment_712446); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6042:1: rule__Relationship__TailMultiplicityAssignment_8 : ( ruleMultiplicity ) ;
    public final void rule__Relationship__TailMultiplicityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6046:1: ( ( ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6047:1: ( ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6047:1: ( ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6048:1: ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailMultiplicityMultiplicityParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Relationship__TailMultiplicityAssignment_812485);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6057:1: rule__Relationship__TailAssignment_9 : ( ruleExtendedID ) ;
    public final void rule__Relationship__TailAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6061:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6062:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6062:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6063:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailExtendedIDParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Relationship__TailAssignment_912516);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6072:1: rule__Relationship__TailLabelAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Relationship__TailLabelAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6076:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6077:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6077:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6078:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTailLabelSTRINGTerminalRuleCall_10_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relationship__TailLabelAssignment_1012547); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6087:1: rule__Multiplicity__UpperAssignment_0 : ( ruleMultiplicityValue ) ;
    public final void rule__Multiplicity__UpperAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6091:1: ( ( ruleMultiplicityValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6092:1: ( ruleMultiplicityValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6092:1: ( ruleMultiplicityValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6093:1: ruleMultiplicityValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getUpperMultiplicityValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_rule__Multiplicity__UpperAssignment_012578);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6102:1: rule__Multiplicity__LowerAssignment_1_1 : ( ruleMultiplicityValue ) ;
    public final void rule__Multiplicity__LowerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6106:1: ( ( ruleMultiplicityValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6107:1: ( ruleMultiplicityValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6107:1: ( ruleMultiplicityValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6108:1: ruleMultiplicityValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityAccess().getLowerMultiplicityValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_rule__Multiplicity__LowerAssignment_1_112609);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6117:1: rule__Constant__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Constant__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6121:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6122:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6122:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6123:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Constant__VisibilityAssignment_012640);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6132:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6136:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6137:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6137:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6138:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_112671); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6147:1: rule__Constant__ValueAssignment_3 : ( ruleImplicitValue ) ;
    public final void rule__Constant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6151:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6152:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6152:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6153:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueImplicitValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Constant__ValueAssignment_312702);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6162:1: rule__Operation__VisibilityAssignment_0_0 : ( ruleVisibility ) ;
    public final void rule__Operation__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6166:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6167:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6167:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6168:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_0_012733);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6177:1: rule__Operation__StaticAssignment_0_1 : ( ( 'static' ) ) ;
    public final void rule__Operation__StaticAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6181:1: ( ( ( 'static' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6182:1: ( ( 'static' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6182:1: ( ( 'static' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6183:1: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6184:1: ( 'static' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6185:1: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Operation__StaticAssignment_0_112769); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6200:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6204:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6205:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6205:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6206:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_112808); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6215:1: rule__Operation__ParameterAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Operation__ParameterAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6219:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6220:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6220:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6221:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParameterAssignment_3_012839);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6230:1: rule__Operation__ParameterAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParameterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6234:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6235:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6235:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6236:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParameterAssignment_3_1_112870);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6245:1: rule__Operation__ReturnAssignment_5_1 : ( ruleReference ) ;
    public final void rule__Operation__ReturnAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6249:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6250:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6250:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6251:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Operation__ReturnAssignment_5_112901);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6260:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6264:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6265:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6265:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6266:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012932); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6275:1: rule__Parameter__TypeAssignment_2 : ( ruleReference ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6279:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6280:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6280:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6281:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_212963);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6290:1: rule__Parameter__ImplicitAssignment_3_1 : ( ruleImplicitValue ) ;
    public final void rule__Parameter__ImplicitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6294:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6295:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6295:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6296:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Parameter__ImplicitAssignment_3_112994);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6305:1: rule__Parameter__ImplicitAssignment_3_2_1 : ( ruleImplicitValue ) ;
    public final void rule__Parameter__ImplicitAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6309:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6310:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6310:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6311:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Parameter__ImplicitAssignment_3_2_113025);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6320:1: rule__Attribute__VisibilityAssignment_0_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6324:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6325:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6325:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6326:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Attribute__VisibilityAssignment_0_013056);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6335:1: rule__Attribute__StaticAssignment_0_1 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6339:1: ( ( ( 'static' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6340:1: ( ( 'static' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6340:1: ( ( 'static' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6341:1: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6342:1: ( 'static' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6343:1: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Attribute__StaticAssignment_0_113092); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6358:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6362:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6363:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6363:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6364:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113131); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6373:1: rule__Attribute__TypeAssignment_3 : ( ruleReference ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6377:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6378:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6378:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6379:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_313162);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6388:1: rule__Attribute__ImplicitAssignment_4_1 : ( ruleImplicitValue ) ;
    public final void rule__Attribute__ImplicitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6392:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6393:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6393:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6394:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Attribute__ImplicitAssignment_4_113193);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6403:1: rule__Attribute__ImplicitAssignment_4_2_1 : ( ruleImplicitValue ) ;
    public final void rule__Attribute__ImplicitAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6407:1: ( ( ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6408:1: ( ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6408:1: ( ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6409:1: ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_rule__Attribute__ImplicitAssignment_4_2_113224);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6418:1: rule__Reference__TypeAssignment_0 : ( ruleExtendedID ) ;
    public final void rule__Reference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6422:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6423:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6423:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6424:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeExtendedIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Reference__TypeAssignment_013255);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6433:1: rule__Reference__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__Reference__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6437:1: ( ( ruleArray ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6438:1: ( ruleArray )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6438:1: ( ruleArray )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6439:1: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_113286);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6448:1: rule__Array__SizeAssignment_2 : ( RULE_NATURAL ) ;
    public final void rule__Array__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6452:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6453:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6453:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6454:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeNATURALTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Array__SizeAssignment_213317); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6463:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6467:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6468:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6468:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6469:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_113348);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6478:1: rule__Annotation__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6482:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6483:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6483:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6484:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_113379);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6493:1: rule__Annotation__ParameterAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6497:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6498:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6498:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:6499:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_113410);
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

    // $ANTLR start synpred77_InternalClassmodel
    public final void synpred77_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5255:2: ( rule__Operation__UnorderedGroup_0__0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5255:2: rule__Operation__UnorderedGroup_0__0
        {
        pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__0_in_synpred77_InternalClassmodel10660);
        rule__Operation__UnorderedGroup_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_InternalClassmodel

    // $ANTLR start synpred78_InternalClassmodel
    public final void synpred78_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5273:4: ( ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5273:4: ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) )
        {
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5273:4: ({...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5274:5: {...}? => ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred78_InternalClassmodel", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5274:106: ( ( ( rule__Operation__VisibilityAssignment_0_0 ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5275:6: ( ( rule__Operation__VisibilityAssignment_0_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5281:6: ( ( rule__Operation__VisibilityAssignment_0_0 ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5283:7: ( rule__Operation__VisibilityAssignment_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getOperationAccess().getVisibilityAssignment_0_0()); 
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5284:7: ( rule__Operation__VisibilityAssignment_0_0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5284:8: rule__Operation__VisibilityAssignment_0_0
        {
        pushFollow(FOLLOW_rule__Operation__VisibilityAssignment_0_0_in_synpred78_InternalClassmodel10747);
        rule__Operation__VisibilityAssignment_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred78_InternalClassmodel

    // $ANTLR start synpred79_InternalClassmodel
    public final void synpred79_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5322:2: ( rule__Operation__UnorderedGroup_0__1 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5322:2: rule__Operation__UnorderedGroup_0__1
        {
        pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__1_in_synpred79_InternalClassmodel10900);
        rule__Operation__UnorderedGroup_0__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_InternalClassmodel

    // $ANTLR start synpred80_InternalClassmodel
    public final void synpred80_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5351:2: ( rule__Attribute__UnorderedGroup_0__0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5351:2: rule__Attribute__UnorderedGroup_0__0
        {
        pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_synpred80_InternalClassmodel10953);
        rule__Attribute__UnorderedGroup_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_InternalClassmodel

    // $ANTLR start synpred81_InternalClassmodel
    public final void synpred81_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5369:4: ( ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5369:4: ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) )
        {
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5369:4: ({...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5370:5: {...}? => ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred81_InternalClassmodel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5370:106: ( ( ( rule__Attribute__VisibilityAssignment_0_0 ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5371:6: ( ( rule__Attribute__VisibilityAssignment_0_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5377:6: ( ( rule__Attribute__VisibilityAssignment_0_0 ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5379:7: ( rule__Attribute__VisibilityAssignment_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0_0()); 
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5380:7: ( rule__Attribute__VisibilityAssignment_0_0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5380:8: rule__Attribute__VisibilityAssignment_0_0
        {
        pushFollow(FOLLOW_rule__Attribute__VisibilityAssignment_0_0_in_synpred81_InternalClassmodel11040);
        rule__Attribute__VisibilityAssignment_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred81_InternalClassmodel

    // $ANTLR start synpred82_InternalClassmodel
    public final void synpred82_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5418:2: ( rule__Attribute__UnorderedGroup_0__1 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:5418:2: rule__Attribute__UnorderedGroup_0__1
        {
        pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_synpred82_InternalClassmodel11193);
        rule__Attribute__UnorderedGroup_0__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_InternalClassmodel

    // Delegated rules

    public final boolean synpred80_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalClassmodel_fragment(); // can never throw exception
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
        "\126\uffff";
    static final String DFA1_eofS =
        "\126\uffff";
    static final String DFA1_minS =
        "\1\23\1\10\6\uffff\1\23\2\10\1\23\1\50\1\10\1\41\1\10\2\4\1\10"+
        "\1\23\1\41\1\52\4\41\1\4\2\41\1\50\2\4\1\10\3\41\1\4\2\41\1\17\1"+
        "\41\1\4\2\21\1\10\2\4\1\17\2\4\1\41\1\52\4\41\1\4\2\41\2\21\1\41"+
        "\4\4\3\41\1\4\2\41\1\17\1\41\1\4\2\21\1\17\2\4\2\21\1\41\2\4\1\41";
    static final String DFA1_maxS =
        "\1\53\1\10\6\uffff\1\54\2\10\1\54\1\50\1\10\1\54\1\10\1\52\1\22"+
        "\1\10\1\53\1\54\1\52\1\51\3\47\1\4\1\54\1\47\1\50\1\22\1\4\1\10"+
        "\3\47\1\4\1\54\1\50\1\47\1\54\1\4\2\22\1\10\1\52\1\22\1\47\2\4\1"+
        "\54\1\52\1\51\3\47\1\4\1\54\1\47\2\22\1\47\1\22\3\4\3\47\1\4\1\54"+
        "\1\50\2\47\1\4\2\22\1\47\2\4\2\22\1\47\2\4\1\47";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\116\uffff";
    static final String DFA1_specialS =
        "\126\uffff}>";
    static final String[] DFA1_transitionS = {
            "\6\2\3\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\6\1\uffff\1\7\6"+
            "\uffff\1\1",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\2\3\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\6\1\uffff\1\7\1"+
            "\uffff\1\12\4\uffff\1\1\1\11",
            "\1\13",
            "\1\14",
            "\6\2\3\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\6\1\uffff\1\7\1"+
            "\uffff\1\12\4\uffff\1\1\1\11",
            "\1\15",
            "\1\16",
            "\1\22\1\uffff\1\21\3\uffff\1\23\1\uffff\1\20\2\uffff\1\17",
            "\1\24",
            "\1\25\45\uffff\1\26",
            "\1\33\1\27\1\30\1\31\1\34\11\uffff\1\32",
            "\1\35",
            "\6\2\3\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\6\1\uffff\1\7\6"+
            "\uffff\1\1",
            "\1\22\1\uffff\1\21\3\uffff\1\23\1\uffff\1\20\2\uffff\1\17",
            "\1\26",
            "\1\22\1\uffff\1\21\3\uffff\1\23\1\uffff\1\20",
            "\1\36\5\uffff\1\23",
            "\1\36\5\uffff\1\23",
            "\1\36\5\uffff\1\23",
            "\1\33",
            "\1\36\5\uffff\1\23\4\uffff\1\37",
            "\1\36\5\uffff\1\23",
            "\1\40",
            "\1\45\1\41\1\42\1\43\1\46\11\uffff\1\44",
            "\1\47",
            "\1\50",
            "\1\36\5\uffff\1\23",
            "\1\36\5\uffff\1\23",
            "\1\36\5\uffff\1\23",
            "\1\45",
            "\1\36\5\uffff\1\23\4\uffff\1\51",
            "\1\36\5\uffff\1\23\1\40",
            "\1\52\1\53\20\uffff\1\36\5\uffff\1\23",
            "\1\22\1\uffff\1\56\3\uffff\1\23\1\uffff\1\55\2\uffff\1\54",
            "\1\57",
            "\1\60\1\61",
            "\1\60\1\61",
            "\1\62",
            "\1\63\45\uffff\1\64",
            "\1\71\1\65\1\66\1\67\1\72\11\uffff\1\70",
            "\1\73\1\74\20\uffff\1\36\5\uffff\1\23",
            "\1\75",
            "\1\75",
            "\1\22\1\uffff\1\56\3\uffff\1\23\1\uffff\1\55\2\uffff\1\54",
            "\1\64",
            "\1\22\1\uffff\1\56\3\uffff\1\23\1\uffff\1\55",
            "\1\76\5\uffff\1\23",
            "\1\76\5\uffff\1\23",
            "\1\76\5\uffff\1\23",
            "\1\71",
            "\1\76\5\uffff\1\23\4\uffff\1\77",
            "\1\76\5\uffff\1\23",
            "\1\100\1\101",
            "\1\100\1\101",
            "\1\36\5\uffff\1\23",
            "\1\106\1\102\1\103\1\104\1\107\11\uffff\1\105",
            "\1\110",
            "\1\111",
            "\1\111",
            "\1\76\5\uffff\1\23",
            "\1\76\5\uffff\1\23",
            "\1\76\5\uffff\1\23",
            "\1\106",
            "\1\76\5\uffff\1\23\4\uffff\1\112",
            "\1\76\5\uffff\1\23\1\40",
            "\1\113\1\114\20\uffff\1\76\5\uffff\1\23",
            "\1\36\5\uffff\1\23",
            "\1\115",
            "\1\116\1\117",
            "\1\116\1\117",
            "\1\120\1\121\20\uffff\1\76\5\uffff\1\23",
            "\1\122",
            "\1\122",
            "\1\123\1\124",
            "\1\123\1\124",
            "\1\76\5\uffff\1\23",
            "\1\125",
            "\1\125",
            "\1\76\5\uffff\1\23"
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
            return "887:1: rule__Element__Alternatives : ( ( ruleRelationship ) | ( ruleClassifier ) | ( rulePackage ) | ( ruleDatatype ) | ( ruleEnumeration ) | ( ruleInterface ) );";
        }
    }
    static final String DFA2_eotS =
        "\20\uffff";
    static final String DFA2_eofS =
        "\20\uffff";
    static final String DFA2_minS =
        "\6\10\1\43\5\10\1\46\3\uffff";
    static final String DFA2_maxS =
        "\6\56\1\50\5\10\1\50\3\uffff";
    static final String DFA2_acceptS =
        "\15\uffff\1\3\1\2\1\1";
    static final String DFA2_specialS =
        "\20\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\10\uffff\1\1\1\2\6\uffff\1\3\1\4\23\uffff\1\5",
            "\1\6\10\uffff\1\7\1\10\6\uffff\1\11\1\12\23\uffff\1\13",
            "\1\6\10\uffff\1\7\1\10\6\uffff\1\11\1\12\23\uffff\1\13",
            "\1\6\10\uffff\1\7\1\10\6\uffff\1\11\1\12\23\uffff\1\13",
            "\1\6\10\uffff\1\7\1\10\6\uffff\1\11\1\12\23\uffff\1\13",
            "\1\14\10\uffff\1\7\1\10\6\uffff\1\11\1\12\23\uffff\1\13",
            "\1\15\2\uffff\1\16\1\uffff\1\17",
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
            return "933:1: rule__Feature__Alternatives_0 : ( ( ruleAttribute ) | ( ruleOperation ) | ( ruleConstant ) );";
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
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceFeature_in_entryRuleInterfaceFeature787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceFeature794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceFeature__Group__0_in_ruleInterfaceFeature820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__0_in_ruleMultiplicity940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityValue974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicityValue__Alternatives_in_ruleMultiplicityValue1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitValue1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitValue__Alternatives_in_ruleImplicitValue1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal1631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipType__Alternatives_in_ruleRelationshipType1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Element__Alternatives1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Element__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Element__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Element__Alternatives1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Element__Alternatives1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Element__Alternatives1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Feature__Alternatives_01949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Feature__Alternatives_01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__Feature__Alternatives_01983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__InterfaceFeature__Alternatives_02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__InterfaceFeature__Alternatives_02032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__MultiplicityValue__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultiplicityValue__Alternatives2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__ImplicitValue__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__ImplicitValue__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImplicitValue__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__ImplicitValue__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__ImplicitValue__Alternatives2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImplicitValue__Alternatives2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Value__Alternatives2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__Alternatives2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Real__Alternatives_4_02351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Alternatives_4_02371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Alternatives_4_12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Real__Alternatives_4_12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RelationshipType__Alternatives2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RelationshipType__Alternatives2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RelationshipType__Alternatives2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RelationshipType__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RelationshipType__Alternatives2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RelationshipType__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Visibility__Alternatives2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Visibility__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Visibility__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Visibility__Alternatives2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02698 = new BitSet(new long[]{0x00000814B1F80000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2728 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl2786 = new BitSet(new long[]{0x00000814B1F80002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02821 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Import__Group__0__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__0__Impl_in_rule__Datatype__Group__02944 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_rule__Datatype__Group__1_in_rule__Datatype__Group__02947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__AnnotationAssignment_0_in_rule__Datatype__Group__0__Impl2974 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__1__Impl_in_rule__Datatype__Group__13005 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Datatype__Group__2_in_rule__Datatype__Group__13008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Datatype__Group__1__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__2__Impl_in_rule__Datatype__Group__23069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__NameAssignment_2_in_rule__Datatype__Group__2__Impl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__03132 = new BitSet(new long[]{0x0000080020000000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__03135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__AnnotationAssignment_0_in_rule__Package__Group__0__Impl3162 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__13193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__13196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Package__Group__1__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__23257 = new BitSet(new long[]{0x00000814F1F80000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__23260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__33317 = new BitSet(new long[]{0x00000814F1F80000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__33320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ElementAssignment_3_in_rule__Package__Group__3__Impl3347 = new BitSet(new long[]{0x00000814B1F80002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__43378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Package__Group__4__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__03447 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__03450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__AnnotationAssignment_0_in_rule__Classifier__Group__0__Impl3477 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__13508 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__13511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Classifier__Group__1__Impl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__23572 = new BitSet(new long[]{0x0000400146060300L});
    public static final BitSet FOLLOW_rule__Classifier__Group__3_in_rule__Classifier__Group__23575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__NameAssignment_2_in_rule__Classifier__Group__2__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__3__Impl_in_rule__Classifier__Group__33632 = new BitSet(new long[]{0x0000400146060300L});
    public static final BitSet FOLLOW_rule__Classifier__Group__4_in_rule__Classifier__Group__33635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__GeneralizationAssignment_3_in_rule__Classifier__Group__3__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__4__Impl_in_rule__Classifier__Group__43693 = new BitSet(new long[]{0x0000400146060300L});
    public static final BitSet FOLLOW_rule__Classifier__Group__5_in_rule__Classifier__Group__43696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__ConstraintAssignment_4_in_rule__Classifier__Group__4__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__5__Impl_in_rule__Classifier__Group__53754 = new BitSet(new long[]{0x0000400146060300L});
    public static final BitSet FOLLOW_rule__Classifier__Group__6_in_rule__Classifier__Group__53757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__FeatureAssignment_5_in_rule__Classifier__Group__5__Impl3784 = new BitSet(new long[]{0x0000400006060102L});
    public static final BitSet FOLLOW_rule__Classifier__Group__6__Impl_in_rule__Classifier__Group__63815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Classifier__Group__6__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__0__Impl_in_rule__Generalization__Group__03888 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Generalization__Group__1_in_rule__Generalization__Group__03891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Generalization__Group__0__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__1__Impl_in_rule__Generalization__Group__13950 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Generalization__Group__2_in_rule__Generalization__Group__13953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__ClassifierAssignment_1_in_rule__Generalization__Group__1__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__2__Impl_in_rule__Generalization__Group__24010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group_2__0_in_rule__Generalization__Group__2__Impl4037 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group_2__0__Impl_in_rule__Generalization__Group_2__04074 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Generalization__Group_2__1_in_rule__Generalization__Group_2__04077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Generalization__Group_2__0__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group_2__1__Impl_in_rule__Generalization__Group_2__14136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__ClassifierAssignment_2_1_in_rule__Generalization__Group_2__1__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04197 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__VisibilityAssignment_0_in_rule__Type__Group__0__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_1_in_rule__Type__Group__1__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04319 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_0_in_rule__Feature__Group__0__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__04441 = new BitSet(new long[]{0x0000080400000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__04444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__AnnotationAssignment_0_in_rule__Enumeration__Group__0__Impl4471 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__14502 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__14505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Enumeration__Group__1__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__24566 = new BitSet(new long[]{0x0000000040000300L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__24569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__2__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__34626 = new BitSet(new long[]{0x0000000040000300L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__34629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__ConstraintAssignment_3_in_rule__Enumeration__Group__3__Impl4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__44687 = new BitSet(new long[]{0x0000000040000300L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__44690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumeratorAssignment_4_in_rule__Enumeration__Group__4__Impl4717 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__54748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Enumeration__Group__5__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__0__Impl_in_rule__Enumerator__Group__04819 = new BitSet(new long[]{0x0000000800000200L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__1_in_rule__Enumerator__Group__04822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__NameAssignment_0_in_rule__Enumerator__Group__0__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__1__Impl_in_rule__Enumerator__Group__14879 = new BitSet(new long[]{0x0000000800000200L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__2_in_rule__Enumerator__Group__14882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group_1__0_in_rule__Enumerator__Group__1__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group__2__Impl_in_rule__Enumerator__Group__24940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__ConstraintAssignment_2_in_rule__Enumerator__Group__2__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group_1__0__Impl_in_rule__Enumerator__Group_1__05004 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Enumerator__Group_1__1_in_rule__Enumerator__Group_1__05007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Enumerator__Group_1__0__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__Group_1__1__Impl_in_rule__Enumerator__Group_1__15068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumerator__ValueAssignment_1_1_in_rule__Enumerator__Group_1__1__Impl5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__05129 = new BitSet(new long[]{0x00000814B1F80000L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__05132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__AnnotationAssignment_0_in_rule__Interface__Group__0__Impl5159 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__15190 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__15193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Interface__Group__1__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__25254 = new BitSet(new long[]{0x0000400146060300L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__25257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__35314 = new BitSet(new long[]{0x0000400146060300L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__35317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__GeneralizationAssignment_3_in_rule__Interface__Group__3__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__45375 = new BitSet(new long[]{0x0000400146060300L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__45378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__ConstraintAssignment_4_in_rule__Interface__Group__4__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__55436 = new BitSet(new long[]{0x0000400146060300L});
    public static final BitSet FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__55439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__FeatureAssignment_5_in_rule__Interface__Group__5__Impl5466 = new BitSet(new long[]{0x0000400006060102L});
    public static final BitSet FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__65497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Interface__Group__6__Impl5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceFeature__Group__0__Impl_in_rule__InterfaceFeature__Group__05570 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__InterfaceFeature__Group__1_in_rule__InterfaceFeature__Group__05573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceFeature__Alternatives_0_in_rule__InterfaceFeature__Group__0__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceFeature__Group__1__Impl_in_rule__InterfaceFeature__Group__15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceFeature__ConstraintAssignment_1_in_rule__InterfaceFeature__Group__1__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__05692 = new BitSet(new long[]{0x0000080001F80000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__05695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__AnnotationAssignment_0_in_rule__Relationship__Group__0__Impl5722 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__15753 = new BitSet(new long[]{0x0000200006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__15756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_1_in_rule__Relationship__Group__1__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__25813 = new BitSet(new long[]{0x0000200006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__25816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__LabelAssignment_2_in_rule__Relationship__Group__2__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__35874 = new BitSet(new long[]{0x0000200006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__35877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__HeadNavigableAssignment_3_in_rule__Relationship__Group__3__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__45935 = new BitSet(new long[]{0x0000200006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__45938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__HeadMultiplicityAssignment_4_in_rule__Relationship__Group__4__Impl5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__55996 = new BitSet(new long[]{0x0000200006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__55999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__HeadAssignment_5_in_rule__Relationship__Group__5__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__66056 = new BitSet(new long[]{0x0000200006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__66059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__HeadLabelAssignment_6_in_rule__Relationship__Group__6__Impl6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__76117 = new BitSet(new long[]{0x0000200006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__8_in_rule__Relationship__Group__76120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TailNavigableAssignment_7_in_rule__Relationship__Group__7__Impl6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__8__Impl_in_rule__Relationship__Group__86178 = new BitSet(new long[]{0x0000200006064190L});
    public static final BitSet FOLLOW_rule__Relationship__Group__9_in_rule__Relationship__Group__86181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TailMultiplicityAssignment_8_in_rule__Relationship__Group__8__Impl6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__9__Impl_in_rule__Relationship__Group__96239 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_rule__Relationship__Group__10_in_rule__Relationship__Group__96242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TailAssignment_9_in_rule__Relationship__Group__9__Impl6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__10__Impl_in_rule__Relationship__Group__106299 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_rule__Relationship__Group__11_in_rule__Relationship__Group__106302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TailLabelAssignment_10_in_rule__Relationship__Group__10__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__11__Impl_in_rule__Relationship__Group__116360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Relationship__Group__11__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__0__Impl_in_rule__Multiplicity__Group__06443 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__1_in_rule__Multiplicity__Group__06446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__UpperAssignment_0_in_rule__Multiplicity__Group__0__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group__1__Impl_in_rule__Multiplicity__Group__16503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__0_in_rule__Multiplicity__Group__1__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__0__Impl_in_rule__Multiplicity__Group_1__06565 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__1_in_rule__Multiplicity__Group_1__06568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Multiplicity__Group_1__0__Impl6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__1__Impl_in_rule__Multiplicity__Group_1__16629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__LowerAssignment_1_1_in_rule__Multiplicity__Group_1__1__Impl6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__06690 = new BitSet(new long[]{0x0000400006060100L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__06693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__VisibilityAssignment_0_in_rule__Constant__Group__0__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__16751 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__16754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_1_in_rule__Constant__Group__1__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__26811 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__26814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Constant__Group__2__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__36873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_3_in_rule__Constant__Group__3__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__06938 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__06941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0_in_rule__Operation__Group__0__Impl6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__16998 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__17001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl7028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__27058 = new BitSet(new long[]{0x0000008000000100L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__27061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Operation__Group__2__Impl7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__37120 = new BitSet(new long[]{0x0000008000000100L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__37123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__47181 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__47184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Operation__Group__4__Impl7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__57243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__07313 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__07316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParameterAssignment_3_0_in_rule__Operation__Group_3__0__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__17373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl7400 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__07435 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__07438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_3_1__0__Impl7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__17497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParameterAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__07558 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__07561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Operation__Group_5__0__Impl7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__17620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ReturnAssignment_5_1_in_rule__Operation__Group_5__1__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__07681 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__17741 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__17744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Parameter__Group__1__Impl7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__27803 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__27806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__37863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Group__3__Impl7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__07929 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__07932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Parameter__Group_3__0__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__17993 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__2_in_rule__Parameter__Group_3__17996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ImplicitAssignment_3_1_in_rule__Parameter__Group_3__1__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__2__Impl_in_rule__Parameter__Group_3__28053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__Group_3__2__Impl8080 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__08117 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__08120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Parameter__Group_3_2__0__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__18179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ImplicitAssignment_3_2_1_in_rule__Parameter__Group_3_2__1__Impl8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__08240 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__08243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0_in_rule__Attribute__Group__0__Impl8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__18300 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__18303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__28360 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__28363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Attribute__Group__2__Impl8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__38422 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__38425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl8452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__48482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl8509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__08550 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__08553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Attribute__Group_4__0__Impl8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__18614 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__18617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ImplicitAssignment_4_1_in_rule__Attribute__Group_4__1__Impl8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__28674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__0_in_rule__Attribute__Group_4__2__Impl8701 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__0__Impl_in_rule__Attribute__Group_4_2__08738 = new BitSet(new long[]{0x00000000000401F0L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__1_in_rule__Attribute__Group_4_2__08741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Attribute__Group_4_2__0__Impl8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__1__Impl_in_rule__Attribute__Group_4_2__18800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ImplicitAssignment_4_2_1_in_rule__Attribute__Group_4_2__1__Impl8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08861 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl8948 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__08983 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__08986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19044 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Array__Group__1__Impl9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29106 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__29109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__39167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Array__Group__3__Impl9195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__09234 = new BitSet(new long[]{0x0000000006060100L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__09237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Annotation__Group__0__Impl9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__19296 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__19299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__29356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl9383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__09420 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__09423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Annotation__Group_2__0__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__19484 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__19487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__29544 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__29547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl9574 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__39605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Annotation__Group_2__3__Impl9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__09672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__09675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Annotation__Group_2_2__0__Impl9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__19734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl9761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09796 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9882 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__09917 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__09920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExtendedID__Group_1__0__Impl9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__19979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl10006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__010039 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__010042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Real__Group__0__Impl10071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__110104 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__110107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl10134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__210163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Real__Group__3_in_rule__Real__Group__210166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Real__Group__2__Impl10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__310225 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Real__Group__4_in_rule__Real__Group__310228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__410284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl10311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__010352 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__010355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__110412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__110415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl10442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__210472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__010534 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__010537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Integer__Group__0__Impl10566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__110599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl10626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__0_in_rule__Operation__UnorderedGroup_010660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_0_0_in_rule__Operation__UnorderedGroup_0__Impl10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__StaticAssignment_0_1_in_rule__Operation__UnorderedGroup_0__Impl10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__010897 = new BitSet(new long[]{0x0000400006060002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__1_in_rule__Operation__UnorderedGroup_0__010900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__110925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_rule__Attribute__UnorderedGroup_010953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__VisibilityAssignment_0_0_in_rule__Attribute__UnorderedGroup_0__Impl11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__StaticAssignment_0_1_in_rule__Attribute__UnorderedGroup_0__Impl11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__011190 = new BitSet(new long[]{0x0000400006060002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_rule__Attribute__UnorderedGroup_0__011193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__111218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_011250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_111281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Datatype__AnnotationAssignment_011343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Datatype__NameAssignment_211374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Package__AnnotationAssignment_011405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_211436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Package__ElementAssignment_311467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Classifier__AnnotationAssignment_011498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__NameAssignment_211529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_rule__Classifier__GeneralizationAssignment_311560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Classifier__ConstraintAssignment_411591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Classifier__FeatureAssignment_511622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Generalization__ClassifierAssignment_111653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Generalization__ClassifierAssignment_2_111684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Type__VisibilityAssignment_011715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Type__NameAssignment_111746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Feature__ConstraintAssignment_111777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Enumeration__AnnotationAssignment_011808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_211839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Enumeration__ConstraintAssignment_311870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_rule__Enumeration__EnumeratorAssignment_411901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumerator__NameAssignment_011932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Enumerator__ValueAssignment_1_111963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Enumerator__ConstraintAssignment_211994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Interface__AnnotationAssignment_012025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_212056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_rule__Interface__GeneralizationAssignment_312087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__Interface__ConstraintAssignment_412118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceFeature_in_rule__Interface__FeatureAssignment_512149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_rule__InterfaceFeature__ConstraintAssignment_112180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Relationship__AnnotationAssignment_012211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_rule__Relationship__TypeAssignment_112242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relationship__LabelAssignment_212273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Relationship__HeadNavigableAssignment_312309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Relationship__HeadMultiplicityAssignment_412348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Relationship__HeadAssignment_512379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relationship__HeadLabelAssignment_612410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Relationship__TailNavigableAssignment_712446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Relationship__TailMultiplicityAssignment_812485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Relationship__TailAssignment_912516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relationship__TailLabelAssignment_1012547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_rule__Multiplicity__UpperAssignment_012578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_rule__Multiplicity__LowerAssignment_1_112609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Constant__VisibilityAssignment_012640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_112671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Constant__ValueAssignment_312702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Operation__VisibilityAssignment_0_012733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Operation__StaticAssignment_0_112769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_112808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParameterAssignment_3_012839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParameterAssignment_3_1_112870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Operation__ReturnAssignment_5_112901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_212963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Parameter__ImplicitAssignment_3_112994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Parameter__ImplicitAssignment_3_2_113025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Attribute__VisibilityAssignment_0_013056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Attribute__StaticAssignment_0_113092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_313162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Attribute__ImplicitAssignment_4_113193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_rule__Attribute__ImplicitAssignment_4_2_113224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Reference__TypeAssignment_013255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_113286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Array__SizeAssignment_213317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_113348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_113379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_113410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__0_in_synpred77_InternalClassmodel10660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__VisibilityAssignment_0_0_in_synpred78_InternalClassmodel10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__1_in_synpred79_InternalClassmodel10900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_synpred80_InternalClassmodel10953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__VisibilityAssignment_0_0_in_synpred81_InternalClassmodel11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_synpred82_InternalClassmodel11193 = new BitSet(new long[]{0x0000000000000002L});

}

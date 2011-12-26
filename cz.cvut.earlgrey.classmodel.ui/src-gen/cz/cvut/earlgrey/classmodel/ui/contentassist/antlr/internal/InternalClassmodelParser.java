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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'null'", "'*'", "'associates'", "'depends'", "'extends'", "'implements'", "'aggregates'", "'composedOf'", "'+'", "'-'", "'#'", "'~'", "'package'", "'{'", "'}'", "'import'", "'='", "'['", "']'", "'('", "')'", "':'", "','", "'..'", "'.'", "'class'", "'interface'", "'abstract'", "'enum'", "'static'"
    };
    public static final int RULE_ID=6;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

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




    // $ANTLR start "entryRuleClassmodel"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:61:1: entryRuleClassmodel : ruleClassmodel EOF ;
    public final void entryRuleClassmodel() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:62:1: ( ruleClassmodel EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:63:1: ruleClassmodel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelRule()); 
            }
            pushFollow(FOLLOW_ruleClassmodel_in_entryRuleClassmodel67);
            ruleClassmodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassmodelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassmodel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClassmodel"


    // $ANTLR start "ruleClassmodel"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:70:1: ruleClassmodel : ( ( rule__Classmodel__Group__0 ) ) ;
    public final void ruleClassmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:74:2: ( ( ( rule__Classmodel__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:75:1: ( ( rule__Classmodel__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:75:1: ( ( rule__Classmodel__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:76:1: ( rule__Classmodel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:77:1: ( rule__Classmodel__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:77:2: rule__Classmodel__Group__0
            {
            pushFollow(FOLLOW_rule__Classmodel__Group__0_in_ruleClassmodel100);
            rule__Classmodel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassmodelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:89:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:90:1: ( ruleAbstractElement EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:91:1: ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement127);
            ruleAbstractElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:98:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:102:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:103:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:103:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:104:1: ( rule__AbstractElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:105:1: ( rule__AbstractElement__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:105:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement160);
            rule__AbstractElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackage"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:117:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:118:1: ( rulePackage EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:119:1: rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage187);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage194); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:126:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:130:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:131:1: ( ( rule__Package__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:131:1: ( ( rule__Package__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:132:1: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:133:1: ( rule__Package__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:133:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage220);
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


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:145:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:146:1: ( ruleImport EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:147:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport247);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport254); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:154:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:158:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:159:1: ( ( rule__Import__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:159:1: ( ( rule__Import__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:160:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:161:1: ( rule__Import__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:161:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport280);
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


    // $ANTLR start "entryRuleEntity"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:173:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:174:1: ( ruleEntity EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:175:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity307);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:182:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:186:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:187:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:187:1: ( ( rule__Entity__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:188:1: ( rule__Entity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:189:1: ( rule__Entity__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:189:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity340);
            rule__Entity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleClass"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:201:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:202:1: ( ruleClass EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:203:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass367);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:210:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:214:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:215:1: ( ( rule__Class__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:215:1: ( ( rule__Class__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:216:1: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:217:1: ( rule__Class__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:217:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass400);
            rule__Class__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleEnum"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:229:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:230:1: ( ruleEnum EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:231:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum427);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:238:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:242:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:243:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:243:1: ( ( rule__Enum__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:244:1: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:245:1: ( rule__Enum__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:245:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum460);
            rule__Enum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumConstant"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:257:1: entryRuleEnumConstant : ruleEnumConstant EOF ;
    public final void entryRuleEnumConstant() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:258:1: ( ruleEnumConstant EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:259:1: ruleEnumConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumConstantRule()); 
            }
            pushFollow(FOLLOW_ruleEnumConstant_in_entryRuleEnumConstant487);
            ruleEnumConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumConstant494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumConstant"


    // $ANTLR start "ruleEnumConstant"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:266:1: ruleEnumConstant : ( ( rule__EnumConstant__Group__0 ) ) ;
    public final void ruleEnumConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:270:2: ( ( ( rule__EnumConstant__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:271:1: ( ( rule__EnumConstant__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:271:1: ( ( rule__EnumConstant__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:272:1: ( rule__EnumConstant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumConstantAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:273:1: ( rule__EnumConstant__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:273:2: rule__EnumConstant__Group__0
            {
            pushFollow(FOLLOW_rule__EnumConstant__Group__0_in_ruleEnumConstant520);
            rule__EnumConstant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumConstant"


    // $ANTLR start "entryRuleReference"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:285:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:286:1: ( ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:287:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference547);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference554); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:294:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:298:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:299:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:299:1: ( ( rule__Reference__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:300:1: ( rule__Reference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:301:1: ( rule__Reference__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:301:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference580);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:313:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:314:1: ( ruleArray EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:315:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray607);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray614); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:322:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:326:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:327:1: ( ( rule__Array__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:327:1: ( ( rule__Array__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:328:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:329:1: ( rule__Array__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:329:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray640);
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


    // $ANTLR start "entryRuleFeature"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:341:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:342:1: ( ruleFeature EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:343:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature667);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature674); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:350:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:354:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:355:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:355:1: ( ( rule__Feature__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:356:1: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:357:1: ( rule__Feature__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:357:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature700);
            rule__Feature__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleOperation"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:369:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:370:1: ( ruleOperation EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:371:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation727);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation734); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:378:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:382:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:383:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:383:1: ( ( rule__Operation__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:384:1: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:385:1: ( rule__Operation__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:385:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation760);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:397:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:398:1: ( ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:399:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter787);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter794); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:406:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:410:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:411:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:411:1: ( ( rule__Parameter__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:412:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:413:1: ( rule__Parameter__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:413:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter820);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:425:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:426:1: ( ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:427:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute847);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute854); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:434:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:438:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:439:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:439:1: ( ( rule__Attribute__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:440:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:441:1: ( rule__Attribute__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:441:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute880);
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


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:453:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:454:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:455:1: ruleValue EOF
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:462:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:466:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:467:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:467:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:468:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:469:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:469:2: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleIntValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:481:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:482:1: ( ruleIntValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:483:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue967);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:490:1: ruleIntValue : ( RULE_INT ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:494:2: ( ( RULE_INT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:495:1: ( RULE_INT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:495:1: ( RULE_INT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:496:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue1000); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleRelation"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:509:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:510:1: ( ruleRelation EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:511:1: ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation1026);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation1033); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:518:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:522:2: ( ( ( rule__Relation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:523:1: ( ( rule__Relation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:523:1: ( ( rule__Relation__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:524:1: ( rule__Relation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:525:1: ( rule__Relation__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:525:2: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_rule__Relation__Group__0_in_ruleRelation1059);
            rule__Relation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleCardinality"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:537:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:538:1: ( ruleCardinality EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:539:1: ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1086);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1093); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:546:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:550:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:551:1: ( ( rule__Cardinality__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:551:1: ( ( rule__Cardinality__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:552:1: ( rule__Cardinality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:553:1: ( rule__Cardinality__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:553:2: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality1119);
            rule__Cardinality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleCardinalityValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:565:1: entryRuleCardinalityValue : ruleCardinalityValue EOF ;
    public final void entryRuleCardinalityValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:566:1: ( ruleCardinalityValue EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:567:1: ruleCardinalityValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityValueRule()); 
            }
            pushFollow(FOLLOW_ruleCardinalityValue_in_entryRuleCardinalityValue1146);
            ruleCardinalityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinalityValue1153); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCardinalityValue"


    // $ANTLR start "ruleCardinalityValue"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:574:1: ruleCardinalityValue : ( ( rule__CardinalityValue__Alternatives ) ) ;
    public final void ruleCardinalityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:578:2: ( ( ( rule__CardinalityValue__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:579:1: ( ( rule__CardinalityValue__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:579:1: ( ( rule__CardinalityValue__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:580:1: ( rule__CardinalityValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:581:1: ( rule__CardinalityValue__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:581:2: rule__CardinalityValue__Alternatives
            {
            pushFollow(FOLLOW_rule__CardinalityValue__Alternatives_in_ruleCardinalityValue1179);
            rule__CardinalityValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinalityValue"


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:593:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:594:1: ( ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:595:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1206);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1213); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:602:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:606:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:607:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:607:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:608:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:609:1: ( rule__QualifiedName__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:609:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1239);
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


    // $ANTLR start "ruleRelationType"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:622:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:626:1: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:627:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:627:1: ( ( rule__RelationType__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:628:1: ( rule__RelationType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:629:1: ( rule__RelationType__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:629:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1276);
            rule__RelationType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "ruleVisibility"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:641:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:645:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:646:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:646:1: ( ( rule__Visibility__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:647:1: ( rule__Visibility__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:648:1: ( rule__Visibility__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:648:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1312);
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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:661:1: rule__AbstractElement__Alternatives : ( ( rulePackage ) | ( ruleEntity ) | ( ruleRelation ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:665:1: ( ( rulePackage ) | ( ruleEntity ) | ( ruleRelation ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:666:1: ( rulePackage )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:666:1: ( rulePackage )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:667:1: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePackage_in_rule__AbstractElement__Alternatives1349);
                    rulePackage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:672:6: ( ruleEntity )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:672:6: ( ruleEntity )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:673:1: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEntity_in_rule__AbstractElement__Alternatives1366);
                    ruleEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:678:6: ( ruleRelation )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:678:6: ( ruleRelation )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:679:1: ruleRelation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleRelation_in_rule__AbstractElement__Alternatives1383);
                    ruleRelation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_2()); 
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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Entity__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:689:1: rule__Entity__Alternatives : ( ( ( ruleClass ) ) | ( ruleEnum ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:693:1: ( ( ( ruleClass ) ) | ( ruleEnum ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=36 && LA2_0<=38)) ) {
                alt2=1;
            }
            else if ( (LA2_0==39) ) {
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:694:1: ( ( ruleClass ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:694:1: ( ( ruleClass ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:695:1: ( ruleClass )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getClassParserRuleCall_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:696:1: ( ruleClass )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:696:3: ruleClass
                    {
                    pushFollow(FOLLOW_ruleClass_in_rule__Entity__Alternatives1416);
                    ruleClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getClassParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:700:6: ( ruleEnum )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:700:6: ( ruleEnum )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:701:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getEnumParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__Entity__Alternatives1434);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getEnumParserRuleCall_1()); 
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
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__Class__Alternatives_0_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:711:1: rule__Class__Alternatives_0_0 : ( ( ( rule__Class__ClassAssignment_0_0_0 ) ) | ( ( rule__Class__InterfaceAssignment_0_0_1 ) ) | ( ( rule__Class__AbstractAssignment_0_0_2 ) ) );
    public final void rule__Class__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:715:1: ( ( ( rule__Class__ClassAssignment_0_0_0 ) ) | ( ( rule__Class__InterfaceAssignment_0_0_1 ) ) | ( ( rule__Class__AbstractAssignment_0_0_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:716:1: ( ( rule__Class__ClassAssignment_0_0_0 ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:716:1: ( ( rule__Class__ClassAssignment_0_0_0 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:717:1: ( rule__Class__ClassAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassAccess().getClassAssignment_0_0_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:718:1: ( rule__Class__ClassAssignment_0_0_0 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:718:2: rule__Class__ClassAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_rule__Class__ClassAssignment_0_0_0_in_rule__Class__Alternatives_0_01466);
                    rule__Class__ClassAssignment_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassAccess().getClassAssignment_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:722:6: ( ( rule__Class__InterfaceAssignment_0_0_1 ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:722:6: ( ( rule__Class__InterfaceAssignment_0_0_1 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:723:1: ( rule__Class__InterfaceAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassAccess().getInterfaceAssignment_0_0_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:724:1: ( rule__Class__InterfaceAssignment_0_0_1 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:724:2: rule__Class__InterfaceAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_rule__Class__InterfaceAssignment_0_0_1_in_rule__Class__Alternatives_0_01484);
                    rule__Class__InterfaceAssignment_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassAccess().getInterfaceAssignment_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:728:6: ( ( rule__Class__AbstractAssignment_0_0_2 ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:728:6: ( ( rule__Class__AbstractAssignment_0_0_2 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:729:1: ( rule__Class__AbstractAssignment_0_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassAccess().getAbstractAssignment_0_0_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:730:1: ( rule__Class__AbstractAssignment_0_0_2 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:730:2: rule__Class__AbstractAssignment_0_0_2
                    {
                    pushFollow(FOLLOW_rule__Class__AbstractAssignment_0_0_2_in_rule__Class__Alternatives_0_01502);
                    rule__Class__AbstractAssignment_0_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassAccess().getAbstractAssignment_0_0_2()); 
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
    // $ANTLR end "rule__Class__Alternatives_0_0"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:739:1: rule__Feature__Alternatives : ( ( ruleAttribute ) | ( ruleOperation ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:743:1: ( ( ruleAttribute ) | ( ruleOperation ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:744:1: ( ruleAttribute )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:744:1: ( ruleAttribute )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:745:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Feature__Alternatives1535);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:750:6: ( ruleOperation )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:750:6: ( ruleOperation )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:751:1: ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOperation_in_rule__Feature__Alternatives1552);
                    ruleOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:761:1: rule__Value__Alternatives : ( ( 'null' ) | ( RULE_STRING ) | ( ruleIntValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:765:1: ( ( 'null' ) | ( RULE_STRING ) | ( ruleIntValue ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:766:1: ( 'null' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:766:1: ( 'null' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:767:1: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNullKeyword_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Value__Alternatives1585); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNullKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:774:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:774:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:775:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives1604); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:780:6: ( ruleIntValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:780:6: ( ruleIntValue )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:781:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives1621);
                    ruleIntValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
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


    // $ANTLR start "rule__CardinalityValue__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:791:1: rule__CardinalityValue__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__CardinalityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:795:1: ( ( RULE_INT ) | ( '*' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:796:1: ( RULE_INT )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:796:1: ( RULE_INT )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:797:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCardinalityValueAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CardinalityValue__Alternatives1653); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCardinalityValueAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:802:6: ( '*' )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:802:6: ( '*' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:803:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCardinalityValueAccess().getAsteriskKeyword_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__CardinalityValue__Alternatives1671); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCardinalityValueAccess().getAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__CardinalityValue__Alternatives"


    // $ANTLR start "rule__RelationType__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:815:1: rule__RelationType__Alternatives : ( ( ( 'associates' ) ) | ( ( 'depends' ) ) | ( ( 'extends' ) ) | ( ( 'implements' ) ) | ( ( 'aggregates' ) ) | ( ( 'composedOf' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:819:1: ( ( ( 'associates' ) ) | ( ( 'depends' ) ) | ( ( 'extends' ) ) | ( ( 'implements' ) ) | ( ( 'aggregates' ) ) | ( ( 'composedOf' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:820:1: ( ( 'associates' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:820:1: ( ( 'associates' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:821:1: ( 'associates' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:822:1: ( 'associates' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:822:3: 'associates'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelationType__Alternatives1706); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:827:6: ( ( 'depends' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:827:6: ( ( 'depends' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:828:1: ( 'depends' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:829:1: ( 'depends' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:829:3: 'depends'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelationType__Alternatives1727); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:834:6: ( ( 'extends' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:834:6: ( ( 'extends' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:835:1: ( 'extends' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:836:1: ( 'extends' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:836:3: 'extends'
                    {
                    match(input,15,FOLLOW_15_in_rule__RelationType__Alternatives1748); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:841:6: ( ( 'implements' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:841:6: ( ( 'implements' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:842:1: ( 'implements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:843:1: ( 'implements' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:843:3: 'implements'
                    {
                    match(input,16,FOLLOW_16_in_rule__RelationType__Alternatives1769); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:848:6: ( ( 'aggregates' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:848:6: ( ( 'aggregates' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:849:1: ( 'aggregates' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:850:1: ( 'aggregates' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:850:3: 'aggregates'
                    {
                    match(input,17,FOLLOW_17_in_rule__RelationType__Alternatives1790); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:855:6: ( ( 'composedOf' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:855:6: ( ( 'composedOf' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:856:1: ( 'composedOf' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:857:1: ( 'composedOf' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:857:3: 'composedOf'
                    {
                    match(input,18,FOLLOW_18_in_rule__RelationType__Alternatives1811); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__RelationType__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:867:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:871:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) )
            int alt8=4;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:872:1: ( ( '+' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:872:1: ( ( '+' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:873:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:874:1: ( '+' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:874:3: '+'
                    {
                    match(input,19,FOLLOW_19_in_rule__Visibility__Alternatives1847); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:879:6: ( ( '-' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:879:6: ( ( '-' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:880:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:881:1: ( '-' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:881:3: '-'
                    {
                    match(input,20,FOLLOW_20_in_rule__Visibility__Alternatives1868); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:886:6: ( ( '#' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:886:6: ( ( '#' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:887:1: ( '#' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:888:1: ( '#' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:888:3: '#'
                    {
                    match(input,21,FOLLOW_21_in_rule__Visibility__Alternatives1889); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:893:6: ( ( '~' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:893:6: ( ( '~' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:894:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:895:1: ( '~' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:895:3: '~'
                    {
                    match(input,22,FOLLOW_22_in_rule__Visibility__Alternatives1910); if (state.failed) return ;

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


    // $ANTLR start "rule__Classmodel__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:908:1: rule__Classmodel__Group__0 : rule__Classmodel__Group__0__Impl rule__Classmodel__Group__1 ;
    public final void rule__Classmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:912:1: ( rule__Classmodel__Group__0__Impl rule__Classmodel__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:913:2: rule__Classmodel__Group__0__Impl rule__Classmodel__Group__1
            {
            pushFollow(FOLLOW_rule__Classmodel__Group__0__Impl_in_rule__Classmodel__Group__01944);
            rule__Classmodel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classmodel__Group__1_in_rule__Classmodel__Group__01947);
            rule__Classmodel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classmodel__Group__0"


    // $ANTLR start "rule__Classmodel__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:920:1: rule__Classmodel__Group__0__Impl : ( ( rule__Classmodel__ImportsAssignment_0 )* ) ;
    public final void rule__Classmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:924:1: ( ( ( rule__Classmodel__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:925:1: ( ( rule__Classmodel__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:925:1: ( ( rule__Classmodel__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:926:1: ( rule__Classmodel__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:927:1: ( rule__Classmodel__ImportsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:927:2: rule__Classmodel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Classmodel__ImportsAssignment_0_in_rule__Classmodel__Group__0__Impl1974);
            	    rule__Classmodel__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassmodelAccess().getImportsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classmodel__Group__0__Impl"


    // $ANTLR start "rule__Classmodel__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:937:1: rule__Classmodel__Group__1 : rule__Classmodel__Group__1__Impl ;
    public final void rule__Classmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:941:1: ( rule__Classmodel__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:942:2: rule__Classmodel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Classmodel__Group__1__Impl_in_rule__Classmodel__Group__12005);
            rule__Classmodel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classmodel__Group__1"


    // $ANTLR start "rule__Classmodel__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:948:1: rule__Classmodel__Group__1__Impl : ( ( rule__Classmodel__ElementsAssignment_1 )* ) ;
    public final void rule__Classmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:952:1: ( ( ( rule__Classmodel__ElementsAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:953:1: ( ( rule__Classmodel__ElementsAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:953:1: ( ( rule__Classmodel__ElementsAssignment_1 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:954:1: ( rule__Classmodel__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getElementsAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:955:1: ( rule__Classmodel__ElementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==23||(LA10_0>=36 && LA10_0<=39)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:955:2: rule__Classmodel__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Classmodel__ElementsAssignment_1_in_rule__Classmodel__Group__1__Impl2032);
            	    rule__Classmodel__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassmodelAccess().getElementsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classmodel__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:969:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:973:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:974:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02067);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02070);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:981:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:985:1: ( ( 'package' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:986:1: ( 'package' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:986:1: ( 'package' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:987:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Package__Group__0__Impl2098); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1000:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1004:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1005:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12129);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12132);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1012:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1016:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1017:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1017:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1018:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1019:1: ( rule__Package__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1019:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2159);
            rule__Package__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1029:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1033:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1034:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22189);
            rule__Package__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__22192);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1041:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1045:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1046:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1046:1: ( '{' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1047:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,24,FOLLOW_24_in_rule__Package__Group__2__Impl2220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1060:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1064:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1065:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__32251);
            rule__Package__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__32254);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1072:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1076:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1077:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1077:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1078:1: ( rule__Package__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1079:1: ( rule__Package__ElementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==23||(LA11_0>=36 && LA11_0<=39)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1079:2: rule__Package__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__ElementsAssignment_3_in_rule__Package__Group__3__Impl2281);
            	    rule__Package__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1089:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1093:1: ( rule__Package__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1094:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__42312);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1100:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1104:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1105:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1105:1: ( '}' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1106:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_25_in_rule__Package__Group__4__Impl2340); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Import__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1129:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1133:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1134:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02381);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02384);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1141:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1145:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1146:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1146:1: ( 'import' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1147:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Import__Group__0__Impl2412); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1160:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1164:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1165:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12443);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1171:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1175:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1176:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1176:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1177:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1178:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1178:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2470);
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


    // $ANTLR start "rule__Class__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1192:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1196:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1197:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02504);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02507);
            rule__Class__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1204:1: rule__Class__Group__0__Impl : ( ( rule__Class__Group_0__0 ) ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1208:1: ( ( ( rule__Class__Group_0__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1209:1: ( ( rule__Class__Group_0__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1209:1: ( ( rule__Class__Group_0__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1210:1: ( rule__Class__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1211:1: ( rule__Class__Group_0__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1211:2: rule__Class__Group_0__0
            {
            pushFollow(FOLLOW_rule__Class__Group_0__0_in_rule__Class__Group__0__Impl2534);
            rule__Class__Group_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1221:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1225:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1226:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__12564);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__12567);
            rule__Class__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1233:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1237:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1238:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1238:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1239:1: ( rule__Class__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1240:1: ( rule__Class__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1240:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl2594);
            rule__Class__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1250:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1254:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1255:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22624);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22627);
            rule__Class__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1262:1: rule__Class__Group__2__Impl : ( '{' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1266:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1267:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1267:1: ( '{' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1268:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,24,FOLLOW_24_in_rule__Class__Group__2__Impl2655); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1281:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1285:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1286:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32686);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32689);
            rule__Class__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1293:1: rule__Class__Group__3__Impl : ( ( rule__Class__FeatureAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1297:1: ( ( ( rule__Class__FeatureAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1298:1: ( ( rule__Class__FeatureAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1298:1: ( ( rule__Class__FeatureAssignment_3 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1299:1: ( rule__Class__FeatureAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getFeatureAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1300:1: ( rule__Class__FeatureAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=19 && LA12_0<=22)||LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1300:2: rule__Class__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Class__FeatureAssignment_3_in_rule__Class__Group__3__Impl2716);
            	    rule__Class__FeatureAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getFeatureAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1310:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1314:1: ( rule__Class__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1315:2: rule__Class__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42747);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1321:1: rule__Class__Group__4__Impl : ( '}' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1325:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1326:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1326:1: ( '}' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1327:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_25_in_rule__Class__Group__4__Impl2775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group_0__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1350:1: rule__Class__Group_0__0 : rule__Class__Group_0__0__Impl ;
    public final void rule__Class__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1354:1: ( rule__Class__Group_0__0__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1355:2: rule__Class__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_0__0__Impl_in_rule__Class__Group_0__02816);
            rule__Class__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_0__0"


    // $ANTLR start "rule__Class__Group_0__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1361:1: rule__Class__Group_0__0__Impl : ( ( rule__Class__Alternatives_0_0 ) ) ;
    public final void rule__Class__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1365:1: ( ( ( rule__Class__Alternatives_0_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1366:1: ( ( rule__Class__Alternatives_0_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1366:1: ( ( rule__Class__Alternatives_0_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1367:1: ( rule__Class__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAlternatives_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1368:1: ( rule__Class__Alternatives_0_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1368:2: rule__Class__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__Class__Alternatives_0_0_in_rule__Class__Group_0__0__Impl2843);
            rule__Class__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_0__0__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1380:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1384:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1385:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02875);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02878);
            rule__Enum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1392:1: rule__Enum__Group__0__Impl : ( ( rule__Enum__EnumerationAssignment_0 ) ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1396:1: ( ( ( rule__Enum__EnumerationAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1397:1: ( ( rule__Enum__EnumerationAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1397:1: ( ( rule__Enum__EnumerationAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1398:1: ( rule__Enum__EnumerationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumerationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1399:1: ( rule__Enum__EnumerationAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1399:2: rule__Enum__EnumerationAssignment_0
            {
            pushFollow(FOLLOW_rule__Enum__EnumerationAssignment_0_in_rule__Enum__Group__0__Impl2905);
            rule__Enum__EnumerationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getEnumerationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1409:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1413:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1414:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12935);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__12938);
            rule__Enum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1421:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1425:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1426:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1426:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1427:1: ( rule__Enum__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1428:1: ( rule__Enum__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1428:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl2965);
            rule__Enum__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1438:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1442:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1443:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__22995);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__22998);
            rule__Enum__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1450:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1454:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1455:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1455:1: ( '{' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1456:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,24,FOLLOW_24_in_rule__Enum__Group__2__Impl3026); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1469:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1473:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1474:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33057);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33060);
            rule__Enum__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1481:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__FeatureAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1485:1: ( ( ( rule__Enum__FeatureAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1486:1: ( ( rule__Enum__FeatureAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1486:1: ( ( rule__Enum__FeatureAssignment_3 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1487:1: ( rule__Enum__FeatureAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFeatureAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1488:1: ( rule__Enum__FeatureAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1488:2: rule__Enum__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__FeatureAssignment_3_in_rule__Enum__Group__3__Impl3087);
            	    rule__Enum__FeatureAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFeatureAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1498:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1502:1: ( rule__Enum__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1503:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43118);
            rule__Enum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1509:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1513:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1514:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1514:1: ( '}' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1515:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,25,FOLLOW_25_in_rule__Enum__Group__4__Impl3146); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__EnumConstant__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1538:1: rule__EnumConstant__Group__0 : rule__EnumConstant__Group__0__Impl rule__EnumConstant__Group__1 ;
    public final void rule__EnumConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1542:1: ( rule__EnumConstant__Group__0__Impl rule__EnumConstant__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1543:2: rule__EnumConstant__Group__0__Impl rule__EnumConstant__Group__1
            {
            pushFollow(FOLLOW_rule__EnumConstant__Group__0__Impl_in_rule__EnumConstant__Group__03187);
            rule__EnumConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumConstant__Group__1_in_rule__EnumConstant__Group__03190);
            rule__EnumConstant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__Group__0"


    // $ANTLR start "rule__EnumConstant__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1550:1: rule__EnumConstant__Group__0__Impl : ( ( rule__EnumConstant__NameAssignment_0 ) ) ;
    public final void rule__EnumConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1554:1: ( ( ( rule__EnumConstant__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1555:1: ( ( rule__EnumConstant__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1555:1: ( ( rule__EnumConstant__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1556:1: ( rule__EnumConstant__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumConstantAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1557:1: ( rule__EnumConstant__NameAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1557:2: rule__EnumConstant__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumConstant__NameAssignment_0_in_rule__EnumConstant__Group__0__Impl3217);
            rule__EnumConstant__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumConstantAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__Group__0__Impl"


    // $ANTLR start "rule__EnumConstant__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1567:1: rule__EnumConstant__Group__1 : rule__EnumConstant__Group__1__Impl ;
    public final void rule__EnumConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1571:1: ( rule__EnumConstant__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1572:2: rule__EnumConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumConstant__Group__1__Impl_in_rule__EnumConstant__Group__13247);
            rule__EnumConstant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__Group__1"


    // $ANTLR start "rule__EnumConstant__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1578:1: rule__EnumConstant__Group__1__Impl : ( ( rule__EnumConstant__Group_1__0 )? ) ;
    public final void rule__EnumConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1582:1: ( ( ( rule__EnumConstant__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1583:1: ( ( rule__EnumConstant__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1583:1: ( ( rule__EnumConstant__Group_1__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1584:1: ( rule__EnumConstant__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumConstantAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1585:1: ( rule__EnumConstant__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1585:2: rule__EnumConstant__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumConstant__Group_1__0_in_rule__EnumConstant__Group__1__Impl3274);
                    rule__EnumConstant__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumConstantAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__Group__1__Impl"


    // $ANTLR start "rule__EnumConstant__Group_1__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1599:1: rule__EnumConstant__Group_1__0 : rule__EnumConstant__Group_1__0__Impl rule__EnumConstant__Group_1__1 ;
    public final void rule__EnumConstant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1603:1: ( rule__EnumConstant__Group_1__0__Impl rule__EnumConstant__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1604:2: rule__EnumConstant__Group_1__0__Impl rule__EnumConstant__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumConstant__Group_1__0__Impl_in_rule__EnumConstant__Group_1__03309);
            rule__EnumConstant__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumConstant__Group_1__1_in_rule__EnumConstant__Group_1__03312);
            rule__EnumConstant__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__Group_1__0"


    // $ANTLR start "rule__EnumConstant__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1611:1: rule__EnumConstant__Group_1__0__Impl : ( ( '=' ) ) ;
    public final void rule__EnumConstant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1615:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1616:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1616:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1617:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumConstantAccess().getEqualsSignKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1618:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1619:2: '='
            {
            match(input,27,FOLLOW_27_in_rule__EnumConstant__Group_1__0__Impl3341); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumConstantAccess().getEqualsSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__Group_1__0__Impl"


    // $ANTLR start "rule__EnumConstant__Group_1__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1630:1: rule__EnumConstant__Group_1__1 : rule__EnumConstant__Group_1__1__Impl ;
    public final void rule__EnumConstant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1634:1: ( rule__EnumConstant__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1635:2: rule__EnumConstant__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumConstant__Group_1__1__Impl_in_rule__EnumConstant__Group_1__13373);
            rule__EnumConstant__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__Group_1__1"


    // $ANTLR start "rule__EnumConstant__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1641:1: rule__EnumConstant__Group_1__1__Impl : ( ( rule__EnumConstant__ImplicitAssignment_1_1 ) ) ;
    public final void rule__EnumConstant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1645:1: ( ( ( rule__EnumConstant__ImplicitAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1646:1: ( ( rule__EnumConstant__ImplicitAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1646:1: ( ( rule__EnumConstant__ImplicitAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1647:1: ( rule__EnumConstant__ImplicitAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumConstantAccess().getImplicitAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1648:1: ( rule__EnumConstant__ImplicitAssignment_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1648:2: rule__EnumConstant__ImplicitAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumConstant__ImplicitAssignment_1_1_in_rule__EnumConstant__Group_1__1__Impl3400);
            rule__EnumConstant__ImplicitAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumConstantAccess().getImplicitAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__Group_1__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1662:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1666:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1667:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__03434);
            rule__Reference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__03437);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1674:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__TypeAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1678:1: ( ( ( rule__Reference__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1679:1: ( ( rule__Reference__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1679:1: ( ( rule__Reference__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1680:1: ( rule__Reference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1681:1: ( rule__Reference__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1681:2: rule__Reference__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl3464);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1691:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1695:1: ( rule__Reference__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1696:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__13494);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1702:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ArrayAssignment_1 )* ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1706:1: ( ( ( rule__Reference__ArrayAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1707:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1707:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1708:1: ( rule__Reference__ArrayAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1709:1: ( rule__Reference__ArrayAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1709:2: rule__Reference__ArrayAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl3521);
            	    rule__Reference__ArrayAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1723:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1727:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1728:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__03556);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__03559);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1735:1: rule__Array__Group__0__Impl : ( () ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1739:1: ( ( () ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1740:1: ( () )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1740:1: ( () )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1741:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getArrayAction_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1742:1: ()
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1744:1: 
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1754:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1758:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1759:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__13617);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__13620);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1766:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1770:1: ( ( '[' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1771:1: ( '[' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1771:1: ( '[' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1772:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Array__Group__1__Impl3648); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1785:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1789:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1790:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__23679);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__23682);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1797:1: rule__Array__Group__2__Impl : ( ( rule__Array__SizeAssignment_2 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1801:1: ( ( ( rule__Array__SizeAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1802:1: ( ( rule__Array__SizeAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1802:1: ( ( rule__Array__SizeAssignment_2 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1803:1: ( rule__Array__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1804:1: ( rule__Array__SizeAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1804:2: rule__Array__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl3709);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1814:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1818:1: ( rule__Array__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1819:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__33740);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1825:1: rule__Array__Group__3__Impl : ( ']' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1829:1: ( ( ']' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1830:1: ( ']' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1830:1: ( ']' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1831:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__Array__Group__3__Impl3768); if (state.failed) return ;
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


    // $ANTLR start "rule__Operation__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1852:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1856:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1857:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__03807);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__03810);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1864:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__UnorderedGroup_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1868:1: ( ( ( rule__Operation__UnorderedGroup_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1869:1: ( ( rule__Operation__UnorderedGroup_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1869:1: ( ( rule__Operation__UnorderedGroup_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1870:1: ( rule__Operation__UnorderedGroup_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getUnorderedGroup_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1871:1: ( rule__Operation__UnorderedGroup_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1871:2: rule__Operation__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0_in_rule__Operation__Group__0__Impl3837);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1881:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1885:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1886:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__13867);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__13870);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1893:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1897:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1898:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1898:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1899:1: ( rule__Operation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1900:1: ( rule__Operation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1900:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl3897);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1910:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1914:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1915:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__23927);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__23930);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1922:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1926:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1927:1: ( '(' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1927:1: ( '(' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1928:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Operation__Group__2__Impl3958); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1941:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1945:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1946:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__33989);
            rule__Operation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__33992);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1953:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1957:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1958:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1958:1: ( ( rule__Operation__Group_3__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1959:1: ( rule__Operation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1960:1: ( rule__Operation__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1960:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl4019);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1970:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1974:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1975:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__44050);
            rule__Operation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__44053);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1982:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1986:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1987:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1987:1: ( ')' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1988:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__Operation__Group__4__Impl4081); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2001:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2005:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2006:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__54112);
            rule__Operation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__54115);
            rule__Operation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2013:1: rule__Operation__Group__5__Impl : ( ':' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2017:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2018:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2018:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2019:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }
            match(input,32,FOLLOW_32_in_rule__Operation__Group__5__Impl4143); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Operation__Group__6"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2032:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2036:1: ( rule__Operation__Group__6__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2037:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__64174);
            rule__Operation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2043:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__ReturnAssignment_6 ) ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2047:1: ( ( ( rule__Operation__ReturnAssignment_6 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2048:1: ( ( rule__Operation__ReturnAssignment_6 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2048:1: ( ( rule__Operation__ReturnAssignment_6 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2049:1: ( rule__Operation__ReturnAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnAssignment_6()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2050:1: ( rule__Operation__ReturnAssignment_6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2050:2: rule__Operation__ReturnAssignment_6
            {
            pushFollow(FOLLOW_rule__Operation__ReturnAssignment_6_in_rule__Operation__Group__6__Impl4201);
            rule__Operation__ReturnAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getReturnAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group_3__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2074:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2078:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2079:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__04245);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__04248);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2086:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__ParametersAssignment_3_0 ) ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2090:1: ( ( ( rule__Operation__ParametersAssignment_3_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2091:1: ( ( rule__Operation__ParametersAssignment_3_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2091:1: ( ( rule__Operation__ParametersAssignment_3_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2092:1: ( rule__Operation__ParametersAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParametersAssignment_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2093:1: ( rule__Operation__ParametersAssignment_3_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2093:2: rule__Operation__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Operation__ParametersAssignment_3_0_in_rule__Operation__Group_3__0__Impl4275);
            rule__Operation__ParametersAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParametersAssignment_3_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2103:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2107:1: ( rule__Operation__Group_3__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2108:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__14305);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2114:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__Group_3_1__0 )* ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2118:1: ( ( ( rule__Operation__Group_3_1__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2119:1: ( ( rule__Operation__Group_3_1__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2119:1: ( ( rule__Operation__Group_3_1__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2120:1: ( rule__Operation__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2121:1: ( rule__Operation__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2121:2: rule__Operation__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl4332);
            	    rule__Operation__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2135:1: rule__Operation__Group_3_1__0 : rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 ;
    public final void rule__Operation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2139:1: ( rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2140:2: rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__04367);
            rule__Operation__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__04370);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2147:1: rule__Operation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2151:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2152:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2152:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2153:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Operation__Group_3_1__0__Impl4398); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2166:1: rule__Operation__Group_3_1__1 : rule__Operation__Group_3_1__1__Impl ;
    public final void rule__Operation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2170:1: ( rule__Operation__Group_3_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2171:2: rule__Operation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__14429);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2177:1: rule__Operation__Group_3_1__1__Impl : ( ( rule__Operation__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Operation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2181:1: ( ( ( rule__Operation__ParametersAssignment_3_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2182:1: ( ( rule__Operation__ParametersAssignment_3_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2182:1: ( ( rule__Operation__ParametersAssignment_3_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2183:1: ( rule__Operation__ParametersAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParametersAssignment_3_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2184:1: ( rule__Operation__ParametersAssignment_3_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2184:2: rule__Operation__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ParametersAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl4456);
            rule__Operation__ParametersAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParametersAssignment_3_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2198:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2202:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2203:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04490);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04493);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2210:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2214:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2215:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2215:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2216:1: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2217:1: ( rule__Parameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2217:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl4520);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2227:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2231:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2232:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14550);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14553);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2239:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2243:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2244:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2244:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2245:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Parameter__Group__1__Impl4581); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2258:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2262:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2263:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24612);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24615);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2270:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2274:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2275:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2275:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2276:1: ( rule__Parameter__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2277:1: ( rule__Parameter__TypeAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2277:2: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl4642);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2287:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2291:1: ( rule__Parameter__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2292:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34672);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2298:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2302:1: ( ( ( rule__Parameter__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2303:1: ( ( rule__Parameter__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2303:1: ( ( rule__Parameter__Group_3__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2304:1: ( rule__Parameter__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2305:1: ( rule__Parameter__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2305:2: rule__Parameter__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Group__3__Impl4699);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2323:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2327:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2328:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__04738);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__04741);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2335:1: rule__Parameter__Group_3__0__Impl : ( ( '=' ) ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2339:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2340:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2340:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2341:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2342:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2343:2: '='
            {
            match(input,27,FOLLOW_27_in_rule__Parameter__Group_3__0__Impl4770); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2354:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2 ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2358:1: ( rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2359:2: rule__Parameter__Group_3__1__Impl rule__Parameter__Group_3__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__14802);
            rule__Parameter__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3__2_in_rule__Parameter__Group_3__14805);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2366:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__ImplicitAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2370:1: ( ( ( rule__Parameter__ImplicitAssignment_3_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2371:1: ( ( rule__Parameter__ImplicitAssignment_3_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2371:1: ( ( rule__Parameter__ImplicitAssignment_3_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2372:1: ( rule__Parameter__ImplicitAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitAssignment_3_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2373:1: ( rule__Parameter__ImplicitAssignment_3_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2373:2: rule__Parameter__ImplicitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Parameter__ImplicitAssignment_3_1_in_rule__Parameter__Group_3__1__Impl4832);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2383:1: rule__Parameter__Group_3__2 : rule__Parameter__Group_3__2__Impl ;
    public final void rule__Parameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2387:1: ( rule__Parameter__Group_3__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2388:2: rule__Parameter__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__2__Impl_in_rule__Parameter__Group_3__24862);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2394:1: rule__Parameter__Group_3__2__Impl : ( ( rule__Parameter__Group_3_2__0 )* ) ;
    public final void rule__Parameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2398:1: ( ( ( rule__Parameter__Group_3_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2399:1: ( ( rule__Parameter__Group_3_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2399:1: ( ( rule__Parameter__Group_3_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2400:1: ( rule__Parameter__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_3_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2401:1: ( rule__Parameter__Group_3_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    int LA20_2 = input.LA(2);

                    if ( ((LA20_2>=RULE_INT && LA20_2<=RULE_STRING)||LA20_2==11) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2401:2: rule__Parameter__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__Group_3__2__Impl4889);
            	    rule__Parameter__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2417:1: rule__Parameter__Group_3_2__0 : rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 ;
    public final void rule__Parameter__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2421:1: ( rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2422:2: rule__Parameter__Group_3_2__0__Impl rule__Parameter__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__04926);
            rule__Parameter__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__04929);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2429:1: rule__Parameter__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Parameter__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2433:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2434:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2434:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2435:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Parameter__Group_3_2__0__Impl4957); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2448:1: rule__Parameter__Group_3_2__1 : rule__Parameter__Group_3_2__1__Impl ;
    public final void rule__Parameter__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2452:1: ( rule__Parameter__Group_3_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2453:2: rule__Parameter__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__14988);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2459:1: rule__Parameter__Group_3_2__1__Impl : ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) ) ;
    public final void rule__Parameter__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2463:1: ( ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2464:1: ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2464:1: ( ( rule__Parameter__ImplicitAssignment_3_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2465:1: ( rule__Parameter__ImplicitAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitAssignment_3_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2466:1: ( rule__Parameter__ImplicitAssignment_3_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2466:2: rule__Parameter__ImplicitAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__ImplicitAssignment_3_2_1_in_rule__Parameter__Group_3_2__1__Impl5015);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2480:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2484:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2485:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05049);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05052);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2492:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__UnorderedGroup_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2496:1: ( ( ( rule__Attribute__UnorderedGroup_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2497:1: ( ( rule__Attribute__UnorderedGroup_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2497:1: ( ( rule__Attribute__UnorderedGroup_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2498:1: ( rule__Attribute__UnorderedGroup_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getUnorderedGroup_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2499:1: ( rule__Attribute__UnorderedGroup_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2499:2: rule__Attribute__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0_in_rule__Attribute__Group__0__Impl5079);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2509:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2513:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2514:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15109);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15112);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2521:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2525:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2526:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2526:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2527:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2528:1: ( rule__Attribute__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2528:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5139);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2538:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2542:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2543:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25169);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25172);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2550:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2554:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2555:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2555:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2556:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__Attribute__Group__2__Impl5200); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2569:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2573:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2574:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35231);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__35234);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2581:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2585:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2586:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2586:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2587:1: ( rule__Attribute__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2588:1: ( rule__Attribute__TypeAssignment_3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2588:2: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl5261);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2598:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2602:1: ( rule__Attribute__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2603:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__45291);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2609:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2613:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2614:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2614:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2615:1: ( rule__Attribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2616:1: ( rule__Attribute__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2616:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl5318);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2636:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2640:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2641:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__05359);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__05362);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2648:1: rule__Attribute__Group_4__0__Impl : ( ( '=' ) ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2652:1: ( ( ( '=' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2653:1: ( ( '=' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2653:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2654:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2655:1: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2656:2: '='
            {
            match(input,27,FOLLOW_27_in_rule__Attribute__Group_4__0__Impl5391); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2667:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2671:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2672:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__15423);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__15426);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2679:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__ImplicitAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2683:1: ( ( ( rule__Attribute__ImplicitAssignment_4_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2684:1: ( ( rule__Attribute__ImplicitAssignment_4_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2684:1: ( ( rule__Attribute__ImplicitAssignment_4_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2685:1: ( rule__Attribute__ImplicitAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitAssignment_4_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2686:1: ( rule__Attribute__ImplicitAssignment_4_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2686:2: rule__Attribute__ImplicitAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attribute__ImplicitAssignment_4_1_in_rule__Attribute__Group_4__1__Impl5453);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2696:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2700:1: ( rule__Attribute__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2701:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__25483);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2707:1: rule__Attribute__Group_4__2__Impl : ( ( rule__Attribute__Group_4_2__0 )* ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2711:1: ( ( ( rule__Attribute__Group_4_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2712:1: ( ( rule__Attribute__Group_4_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2712:1: ( ( rule__Attribute__Group_4_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2713:1: ( rule__Attribute__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_4_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2714:1: ( rule__Attribute__Group_4_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2714:2: rule__Attribute__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__Group_4_2__0_in_rule__Attribute__Group_4__2__Impl5510);
            	    rule__Attribute__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2730:1: rule__Attribute__Group_4_2__0 : rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 ;
    public final void rule__Attribute__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2734:1: ( rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2735:2: rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__0__Impl_in_rule__Attribute__Group_4_2__05547);
            rule__Attribute__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__1_in_rule__Attribute__Group_4_2__05550);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2742:1: rule__Attribute__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2746:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2747:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2747:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2748:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Attribute__Group_4_2__0__Impl5578); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2761:1: rule__Attribute__Group_4_2__1 : rule__Attribute__Group_4_2__1__Impl ;
    public final void rule__Attribute__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2765:1: ( rule__Attribute__Group_4_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2766:2: rule__Attribute__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4_2__1__Impl_in_rule__Attribute__Group_4_2__15609);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2772:1: rule__Attribute__Group_4_2__1__Impl : ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) ) ;
    public final void rule__Attribute__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2776:1: ( ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2777:1: ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2777:1: ( ( rule__Attribute__ImplicitAssignment_4_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2778:1: ( rule__Attribute__ImplicitAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitAssignment_4_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2779:1: ( rule__Attribute__ImplicitAssignment_4_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2779:2: rule__Attribute__ImplicitAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__ImplicitAssignment_4_2_1_in_rule__Attribute__Group_4_2__1__Impl5636);
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


    // $ANTLR start "rule__Relation__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2793:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2797:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2798:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__05670);
            rule__Relation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__05673);
            rule__Relation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2805:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__OriginAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2809:1: ( ( ( rule__Relation__OriginAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2810:1: ( ( rule__Relation__OriginAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2810:1: ( ( rule__Relation__OriginAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2811:1: ( rule__Relation__OriginAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOriginAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2812:1: ( rule__Relation__OriginAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2812:2: rule__Relation__OriginAssignment_0
            {
            pushFollow(FOLLOW_rule__Relation__OriginAssignment_0_in_rule__Relation__Group__0__Impl5700);
            rule__Relation__OriginAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getOriginAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2822:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2826:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2827:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__15730);
            rule__Relation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__15733);
            rule__Relation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2834:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__CardinalityFromAssignment_1 )? ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2838:1: ( ( ( rule__Relation__CardinalityFromAssignment_1 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2839:1: ( ( rule__Relation__CardinalityFromAssignment_1 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2839:1: ( ( rule__Relation__CardinalityFromAssignment_1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2840:1: ( rule__Relation__CardinalityFromAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getCardinalityFromAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2841:1: ( rule__Relation__CardinalityFromAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2841:2: rule__Relation__CardinalityFromAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Relation__CardinalityFromAssignment_1_in_rule__Relation__Group__1__Impl5760);
                    rule__Relation__CardinalityFromAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getCardinalityFromAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2851:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2855:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2856:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__25791);
            rule__Relation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__25794);
            rule__Relation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2863:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__TypeAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2867:1: ( ( ( rule__Relation__TypeAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2868:1: ( ( rule__Relation__TypeAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2868:1: ( ( rule__Relation__TypeAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2869:1: ( rule__Relation__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getTypeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2870:1: ( rule__Relation__TypeAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2870:2: rule__Relation__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Relation__TypeAssignment_2_in_rule__Relation__Group__2__Impl5821);
            rule__Relation__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2880:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2884:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2885:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__35851);
            rule__Relation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__35854);
            rule__Relation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2892:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__CardinalityToAssignment_3 )? ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2896:1: ( ( ( rule__Relation__CardinalityToAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2897:1: ( ( rule__Relation__CardinalityToAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2897:1: ( ( rule__Relation__CardinalityToAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2898:1: ( rule__Relation__CardinalityToAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getCardinalityToAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2899:1: ( rule__Relation__CardinalityToAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2899:2: rule__Relation__CardinalityToAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Relation__CardinalityToAssignment_3_in_rule__Relation__Group__3__Impl5881);
                    rule__Relation__CardinalityToAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getCardinalityToAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2909:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2913:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2914:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__45912);
            rule__Relation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__45915);
            rule__Relation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2921:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__DestinationAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2925:1: ( ( ( rule__Relation__DestinationAssignment_4 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2926:1: ( ( rule__Relation__DestinationAssignment_4 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2926:1: ( ( rule__Relation__DestinationAssignment_4 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2927:1: ( rule__Relation__DestinationAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getDestinationAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2928:1: ( rule__Relation__DestinationAssignment_4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2928:2: rule__Relation__DestinationAssignment_4
            {
            pushFollow(FOLLOW_rule__Relation__DestinationAssignment_4_in_rule__Relation__Group__4__Impl5942);
            rule__Relation__DestinationAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getDestinationAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2938:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2942:1: ( rule__Relation__Group__5__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2943:2: rule__Relation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__55972);
            rule__Relation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2949:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__Group_5__0 )? ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2953:1: ( ( ( rule__Relation__Group_5__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2954:1: ( ( rule__Relation__Group_5__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2954:1: ( ( rule__Relation__Group_5__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2955:1: ( rule__Relation__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2956:1: ( rule__Relation__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2956:2: rule__Relation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_5__0_in_rule__Relation__Group__5__Impl5999);
                    rule__Relation__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group_5__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2978:1: rule__Relation__Group_5__0 : rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 ;
    public final void rule__Relation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2982:1: ( rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2983:2: rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_5__0__Impl_in_rule__Relation__Group_5__06042);
            rule__Relation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_5__1_in_rule__Relation__Group_5__06045);
            rule__Relation__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__0"


    // $ANTLR start "rule__Relation__Group_5__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2990:1: rule__Relation__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Relation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2994:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2995:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2995:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2996:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getColonKeyword_5_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Relation__Group_5__0__Impl6073); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getColonKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__0__Impl"


    // $ANTLR start "rule__Relation__Group_5__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3009:1: rule__Relation__Group_5__1 : rule__Relation__Group_5__1__Impl ;
    public final void rule__Relation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3013:1: ( rule__Relation__Group_5__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3014:2: rule__Relation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_5__1__Impl_in_rule__Relation__Group_5__16104);
            rule__Relation__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__1"


    // $ANTLR start "rule__Relation__Group_5__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3020:1: rule__Relation__Group_5__1__Impl : ( ( rule__Relation__LabelAssignment_5_1 ) ) ;
    public final void rule__Relation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3024:1: ( ( ( rule__Relation__LabelAssignment_5_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3025:1: ( ( rule__Relation__LabelAssignment_5_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3025:1: ( ( rule__Relation__LabelAssignment_5_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3026:1: ( rule__Relation__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getLabelAssignment_5_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3027:1: ( rule__Relation__LabelAssignment_5_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3027:2: rule__Relation__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Relation__LabelAssignment_5_1_in_rule__Relation__Group_5__1__Impl6131);
            rule__Relation__LabelAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getLabelAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3041:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3045:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3046:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__06165);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__06168);
            rule__Cardinality__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3053:1: rule__Cardinality__Group__0__Impl : ( ruleCardinalityValue ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3057:1: ( ( ruleCardinalityValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3058:1: ( ruleCardinalityValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3058:1: ( ruleCardinalityValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3059:1: ruleCardinalityValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getCardinalityValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCardinalityValue_in_rule__Cardinality__Group__0__Impl6195);
            ruleCardinalityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getCardinalityValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3070:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3074:1: ( rule__Cardinality__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3075:2: rule__Cardinality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__16224);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3081:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3085:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3086:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3086:1: ( ( rule__Cardinality__Group_1__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3087:1: ( rule__Cardinality__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3088:1: ( rule__Cardinality__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3088:2: rule__Cardinality__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1__0_in_rule__Cardinality__Group__1__Impl6251);
                    rule__Cardinality__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group_1__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3102:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3106:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3107:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1__0__Impl_in_rule__Cardinality__Group_1__06286);
            rule__Cardinality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cardinality__Group_1__1_in_rule__Cardinality__Group_1__06289);
            rule__Cardinality__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__0"


    // $ANTLR start "rule__Cardinality__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3114:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3118:1: ( ( '..' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3119:1: ( '..' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3119:1: ( '..' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3120:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Cardinality__Group_1__0__Impl6317); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__0__Impl"


    // $ANTLR start "rule__Cardinality__Group_1__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3133:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3137:1: ( rule__Cardinality__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3138:2: rule__Cardinality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1__1__Impl_in_rule__Cardinality__Group_1__16348);
            rule__Cardinality__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__1"


    // $ANTLR start "rule__Cardinality__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3144:1: rule__Cardinality__Group_1__1__Impl : ( ruleCardinalityValue ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3148:1: ( ( ruleCardinalityValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3149:1: ( ruleCardinalityValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3149:1: ( ruleCardinalityValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3150:1: ruleCardinalityValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getCardinalityValueParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleCardinalityValue_in_rule__Cardinality__Group_1__1__Impl6375);
            ruleCardinalityValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getCardinalityValueParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3165:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3169:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3170:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06408);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06411);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3177:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3181:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3182:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3182:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3183:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6438); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3194:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3198:1: ( rule__QualifiedName__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3199:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16467);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3205:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3209:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3210:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3210:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3211:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3212:1: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3212:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6494);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3226:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3230:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3231:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06529);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06532);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3238:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3242:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3243:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3243:1: ( '.' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3244:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl6560); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3257:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3261:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3262:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16591);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3268:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3272:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3273:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3273:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3274:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6618); if (state.failed) return ;
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


    // $ANTLR start "rule__Operation__UnorderedGroup_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3290:1: rule__Operation__UnorderedGroup_0 : ( rule__Operation__UnorderedGroup_0__0 )? ;
    public final void rule__Operation__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3295:1: ( ( rule__Operation__UnorderedGroup_0__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3296:2: ( rule__Operation__UnorderedGroup_0__0 )?
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3296:2: ( rule__Operation__UnorderedGroup_0__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Operation__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__0_in_rule__Operation__UnorderedGroup_06652);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3306:1: rule__Operation__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) ) ;
    public final void rule__Operation__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3311:1: ( ( ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3312:3: ( ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3312:3: ( ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3314:4: ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3314:4: ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3315:5: {...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Operation__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3315:106: ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3316:6: ( ( rule__Operation__ModifierAssignment_0_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3322:6: ( ( rule__Operation__ModifierAssignment_0_0 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3324:7: ( rule__Operation__ModifierAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getModifierAssignment_0_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3325:7: ( rule__Operation__ModifierAssignment_0_0 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3325:8: rule__Operation__ModifierAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Operation__ModifierAssignment_0_0_in_rule__Operation__UnorderedGroup_0__Impl6739);
                    rule__Operation__ModifierAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getModifierAssignment_0_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3331:4: ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3331:4: ({...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3332:5: {...}? => ( ( ( rule__Operation__StaticAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Operation__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3332:106: ( ( ( rule__Operation__StaticAssignment_0_1 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3333:6: ( ( rule__Operation__StaticAssignment_0_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3339:6: ( ( rule__Operation__StaticAssignment_0_1 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3341:7: ( rule__Operation__StaticAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getStaticAssignment_0_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3342:7: ( rule__Operation__StaticAssignment_0_1 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3342:8: rule__Operation__StaticAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Operation__StaticAssignment_0_1_in_rule__Operation__UnorderedGroup_0__Impl6830);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3357:1: rule__Operation__UnorderedGroup_0__0 : rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )? ;
    public final void rule__Operation__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3361:1: ( rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3362:2: rule__Operation__UnorderedGroup_0__Impl ( rule__Operation__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__06889);
            rule__Operation__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3363:2: ( rule__Operation__UnorderedGroup_0__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Operation__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__1_in_rule__Operation__UnorderedGroup_0__06892);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3370:1: rule__Operation__UnorderedGroup_0__1 : rule__Operation__UnorderedGroup_0__Impl ;
    public final void rule__Operation__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3374:1: ( rule__Operation__UnorderedGroup_0__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3375:2: rule__Operation__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__16917);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3386:1: rule__Attribute__UnorderedGroup_0 : ( rule__Attribute__UnorderedGroup_0__0 )? ;
    public final void rule__Attribute__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3391:1: ( ( rule__Attribute__UnorderedGroup_0__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3392:2: ( rule__Attribute__UnorderedGroup_0__0 )?
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3392:2: ( rule__Attribute__UnorderedGroup_0__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Attribute__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_rule__Attribute__UnorderedGroup_06945);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3402:1: rule__Attribute__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) ) ;
    public final void rule__Attribute__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3407:1: ( ( ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3408:3: ( ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3408:3: ( ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3410:4: ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3410:4: ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3411:5: {...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3411:106: ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3412:6: ( ( rule__Attribute__ModifierAssignment_0_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3418:6: ( ( rule__Attribute__ModifierAssignment_0_0 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3420:7: ( rule__Attribute__ModifierAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getModifierAssignment_0_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3421:7: ( rule__Attribute__ModifierAssignment_0_0 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3421:8: rule__Attribute__ModifierAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__ModifierAssignment_0_0_in_rule__Attribute__UnorderedGroup_0__Impl7032);
                    rule__Attribute__ModifierAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getModifierAssignment_0_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3427:4: ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3427:4: ({...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3428:5: {...}? => ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Attribute__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3428:106: ( ( ( rule__Attribute__StaticAssignment_0_1 ) ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3429:6: ( ( rule__Attribute__StaticAssignment_0_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
                    selected = true;
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3435:6: ( ( rule__Attribute__StaticAssignment_0_1 ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3437:7: ( rule__Attribute__StaticAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getStaticAssignment_0_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3438:7: ( rule__Attribute__StaticAssignment_0_1 )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3438:8: rule__Attribute__StaticAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__StaticAssignment_0_1_in_rule__Attribute__UnorderedGroup_0__Impl7123);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3453:1: rule__Attribute__UnorderedGroup_0__0 : rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )? ;
    public final void rule__Attribute__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3457:1: ( rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3458:2: rule__Attribute__UnorderedGroup_0__Impl ( rule__Attribute__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__07182);
            rule__Attribute__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3459:2: ( rule__Attribute__UnorderedGroup_0__1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:0:0: rule__Attribute__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_rule__Attribute__UnorderedGroup_0__07185);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3466:1: rule__Attribute__UnorderedGroup_0__1 : rule__Attribute__UnorderedGroup_0__Impl ;
    public final void rule__Attribute__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3470:1: ( rule__Attribute__UnorderedGroup_0__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3471:2: rule__Attribute__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__17210);
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


    // $ANTLR start "rule__Classmodel__ImportsAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3482:1: rule__Classmodel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Classmodel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3486:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3487:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3487:1: ( ruleImport )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3488:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Classmodel__ImportsAssignment_07242);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassmodelAccess().getImportsImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classmodel__ImportsAssignment_0"


    // $ANTLR start "rule__Classmodel__ElementsAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3497:1: rule__Classmodel__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Classmodel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3501:1: ( ( ruleAbstractElement ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3502:1: ( ruleAbstractElement )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3502:1: ( ruleAbstractElement )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3503:1: ruleAbstractElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Classmodel__ElementsAssignment_17273);
            ruleAbstractElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassmodelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classmodel__ElementsAssignment_1"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3512:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3516:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3517:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3517:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3518:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_17304); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__ElementsAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3527:1: rule__Package__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3531:1: ( ( ruleAbstractElement ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3532:1: ( ruleAbstractElement )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3532:1: ( ruleAbstractElement )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3533:1: ruleAbstractElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Package__ElementsAssignment_37335);
            ruleAbstractElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3542:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3546:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3547:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3547:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3548:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_17366); if (state.failed) return ;
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


    // $ANTLR start "rule__Class__ClassAssignment_0_0_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3557:1: rule__Class__ClassAssignment_0_0_0 : ( ( 'class' ) ) ;
    public final void rule__Class__ClassAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3561:1: ( ( ( 'class' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3562:1: ( ( 'class' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3562:1: ( ( 'class' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3563:1: ( 'class' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassClassKeyword_0_0_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3564:1: ( 'class' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3565:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassClassKeyword_0_0_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Class__ClassAssignment_0_0_07402); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassClassKeyword_0_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassClassKeyword_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ClassAssignment_0_0_0"


    // $ANTLR start "rule__Class__InterfaceAssignment_0_0_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3580:1: rule__Class__InterfaceAssignment_0_0_1 : ( ( 'interface' ) ) ;
    public final void rule__Class__InterfaceAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3584:1: ( ( ( 'interface' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3585:1: ( ( 'interface' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3585:1: ( ( 'interface' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3586:1: ( 'interface' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getInterfaceInterfaceKeyword_0_0_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3587:1: ( 'interface' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3588:1: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getInterfaceInterfaceKeyword_0_0_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Class__InterfaceAssignment_0_0_17446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getInterfaceInterfaceKeyword_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getInterfaceInterfaceKeyword_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__InterfaceAssignment_0_0_1"


    // $ANTLR start "rule__Class__AbstractAssignment_0_0_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3603:1: rule__Class__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3607:1: ( ( ( 'abstract' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3608:1: ( ( 'abstract' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3608:1: ( ( 'abstract' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3609:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3610:1: ( 'abstract' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3611:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Class__AbstractAssignment_0_0_27490); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_0_0_2"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3626:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3630:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3631:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3631:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3632:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_17529); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__FeatureAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3641:1: rule__Class__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__Class__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3645:1: ( ( ruleFeature ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3646:1: ( ruleFeature )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3646:1: ( ruleFeature )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3647:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getFeatureFeatureParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_rule__Class__FeatureAssignment_37560);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getFeatureFeatureParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__FeatureAssignment_3"


    // $ANTLR start "rule__Enum__EnumerationAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3656:1: rule__Enum__EnumerationAssignment_0 : ( ( 'enum' ) ) ;
    public final void rule__Enum__EnumerationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3660:1: ( ( ( 'enum' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3661:1: ( ( 'enum' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3661:1: ( ( 'enum' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3662:1: ( 'enum' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumerationEnumKeyword_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3663:1: ( 'enum' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3664:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumerationEnumKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Enum__EnumerationAssignment_07596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getEnumerationEnumKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getEnumerationEnumKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__EnumerationAssignment_0"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3679:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3683:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3684:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3684:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3685:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_17635); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__FeatureAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3694:1: rule__Enum__FeatureAssignment_3 : ( ruleEnumConstant ) ;
    public final void rule__Enum__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3698:1: ( ( ruleEnumConstant ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3699:1: ( ruleEnumConstant )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3699:1: ( ruleEnumConstant )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3700:1: ruleEnumConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFeatureEnumConstantParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumConstant_in_rule__Enum__FeatureAssignment_37666);
            ruleEnumConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFeatureEnumConstantParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__FeatureAssignment_3"


    // $ANTLR start "rule__EnumConstant__NameAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3709:1: rule__EnumConstant__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumConstant__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3713:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3714:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3714:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3715:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumConstantAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumConstant__NameAssignment_07697); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumConstantAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__NameAssignment_0"


    // $ANTLR start "rule__EnumConstant__ImplicitAssignment_1_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3724:1: rule__EnumConstant__ImplicitAssignment_1_1 : ( ruleIntValue ) ;
    public final void rule__EnumConstant__ImplicitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3728:1: ( ( ruleIntValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3729:1: ( ruleIntValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3729:1: ( ruleIntValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3730:1: ruleIntValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumConstantAccess().getImplicitIntValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_rule__EnumConstant__ImplicitAssignment_1_17728);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumConstantAccess().getImplicitIntValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumConstant__ImplicitAssignment_1_1"


    // $ANTLR start "rule__Reference__TypeAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3739:1: rule__Reference__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3743:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3744:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3744:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3745:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3746:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3747:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeEntityQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Reference__TypeAssignment_07763);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getTypeEntityQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3758:1: rule__Reference__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__Reference__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3762:1: ( ( ruleArray ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3763:1: ( ruleArray )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3763:1: ( ruleArray )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3764:1: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_17798);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3773:1: rule__Array__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__Array__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3777:1: ( ( RULE_INT ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3778:1: ( RULE_INT )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3778:1: ( RULE_INT )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3779:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Array__SizeAssignment_27829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getSizeINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Operation__ModifierAssignment_0_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3788:1: rule__Operation__ModifierAssignment_0_0 : ( ruleVisibility ) ;
    public final void rule__Operation__ModifierAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3792:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3793:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3793:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3794:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getModifierVisibilityEnumRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Operation__ModifierAssignment_0_07860);
            ruleVisibility();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getModifierVisibilityEnumRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ModifierAssignment_0_0"


    // $ANTLR start "rule__Operation__StaticAssignment_0_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3803:1: rule__Operation__StaticAssignment_0_1 : ( ( 'static' ) ) ;
    public final void rule__Operation__StaticAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3807:1: ( ( ( 'static' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3808:1: ( ( 'static' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3808:1: ( ( 'static' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3809:1: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3810:1: ( 'static' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3811:1: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Operation__StaticAssignment_0_17896); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3826:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3830:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3831:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3831:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3832:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_17935); if (state.failed) return ;
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


    // $ANTLR start "rule__Operation__ParametersAssignment_3_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3841:1: rule__Operation__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3845:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3846:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3846:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3847:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParametersAssignment_3_07966);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_3_0"


    // $ANTLR start "rule__Operation__ParametersAssignment_3_1_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3856:1: rule__Operation__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3860:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3861:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3861:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3862:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Operation__ParametersAssignment_3_1_17997);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Operation__ReturnAssignment_6"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3871:1: rule__Operation__ReturnAssignment_6 : ( ruleReference ) ;
    public final void rule__Operation__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3875:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3876:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3876:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3877:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Operation__ReturnAssignment_68028);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ReturnAssignment_6"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3886:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3890:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3891:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3891:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3892:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_08059); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3901:1: rule__Parameter__TypeAssignment_2 : ( ruleReference ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3905:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3906:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3906:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3907:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_28090);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3916:1: rule__Parameter__ImplicitAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Parameter__ImplicitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3920:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3921:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3921:1: ( ruleValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3922:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitValueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Parameter__ImplicitAssignment_3_18121);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getImplicitValueParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3931:1: rule__Parameter__ImplicitAssignment_3_2_1 : ( ruleValue ) ;
    public final void rule__Parameter__ImplicitAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3935:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3936:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3936:1: ( ruleValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3937:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getImplicitValueParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Parameter__ImplicitAssignment_3_2_18152);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getImplicitValueParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__ModifierAssignment_0_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3946:1: rule__Attribute__ModifierAssignment_0_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__ModifierAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3950:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3951:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3951:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3952:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getModifierVisibilityEnumRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Attribute__ModifierAssignment_0_08183);
            ruleVisibility();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getModifierVisibilityEnumRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ModifierAssignment_0_0"


    // $ANTLR start "rule__Attribute__StaticAssignment_0_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3961:1: rule__Attribute__StaticAssignment_0_1 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3965:1: ( ( ( 'static' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3966:1: ( ( 'static' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3966:1: ( ( 'static' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3967:1: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3968:1: ( 'static' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3969:1: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Attribute__StaticAssignment_0_18219); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3984:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3988:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3989:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3989:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3990:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_18258); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3999:1: rule__Attribute__TypeAssignment_3 : ( ruleReference ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4003:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4004:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4004:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4005:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_38289);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4014:1: rule__Attribute__ImplicitAssignment_4_1 : ( ruleValue ) ;
    public final void rule__Attribute__ImplicitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4018:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4019:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4019:1: ( ruleValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4020:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Attribute__ImplicitAssignment_4_18320);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getImplicitValueParserRuleCall_4_1_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4029:1: rule__Attribute__ImplicitAssignment_4_2_1 : ( ruleValue ) ;
    public final void rule__Attribute__ImplicitAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4033:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4034:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4034:1: ( ruleValue )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4035:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getImplicitValueParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Attribute__ImplicitAssignment_4_2_18351);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getImplicitValueParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Relation__OriginAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4044:1: rule__Relation__OriginAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relation__OriginAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4048:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4049:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4049:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4050:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOriginEntityCrossReference_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4051:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4052:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOriginEntityQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Relation__OriginAssignment_08386);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getOriginEntityQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getOriginEntityCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__OriginAssignment_0"


    // $ANTLR start "rule__Relation__CardinalityFromAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4063:1: rule__Relation__CardinalityFromAssignment_1 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityFromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4067:1: ( ( ruleCardinality ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4068:1: ( ruleCardinality )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4068:1: ( ruleCardinality )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4069:1: ruleCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getCardinalityFromCardinalityParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCardinality_in_rule__Relation__CardinalityFromAssignment_18421);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getCardinalityFromCardinalityParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__CardinalityFromAssignment_1"


    // $ANTLR start "rule__Relation__TypeAssignment_2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4078:1: rule__Relation__TypeAssignment_2 : ( ruleRelationType ) ;
    public final void rule__Relation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4082:1: ( ( ruleRelationType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4083:1: ( ruleRelationType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4083:1: ( ruleRelationType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4084:1: ruleRelationType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_28452);
            ruleRelationType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAssignment_2"


    // $ANTLR start "rule__Relation__CardinalityToAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4093:1: rule__Relation__CardinalityToAssignment_3 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4097:1: ( ( ruleCardinality ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4098:1: ( ruleCardinality )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4098:1: ( ruleCardinality )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4099:1: ruleCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getCardinalityToCardinalityParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCardinality_in_rule__Relation__CardinalityToAssignment_38483);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getCardinalityToCardinalityParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__CardinalityToAssignment_3"


    // $ANTLR start "rule__Relation__DestinationAssignment_4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4108:1: rule__Relation__DestinationAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relation__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4112:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4113:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4113:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4114:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getDestinationEntityCrossReference_4_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4115:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4116:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getDestinationEntityQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Relation__DestinationAssignment_48518);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getDestinationEntityQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getDestinationEntityCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__DestinationAssignment_4"


    // $ANTLR start "rule__Relation__LabelAssignment_5_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4127:1: rule__Relation__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Relation__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4131:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4132:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4132:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4133:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relation__LabelAssignment_5_18553); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__LabelAssignment_5_1"

    // $ANTLR start synpred37_InternalClassmodel
    public final void synpred37_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3296:2: ( rule__Operation__UnorderedGroup_0__0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3296:2: rule__Operation__UnorderedGroup_0__0
        {
        pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__0_in_synpred37_InternalClassmodel6652);
        rule__Operation__UnorderedGroup_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalClassmodel

    // $ANTLR start synpred38_InternalClassmodel
    public final void synpred38_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3314:4: ( ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3314:4: ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) )
        {
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3314:4: ({...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3315:5: {...}? => ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred38_InternalClassmodel", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3315:106: ( ( ( rule__Operation__ModifierAssignment_0_0 ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3316:6: ( ( rule__Operation__ModifierAssignment_0_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3322:6: ( ( rule__Operation__ModifierAssignment_0_0 ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3324:7: ( rule__Operation__ModifierAssignment_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getOperationAccess().getModifierAssignment_0_0()); 
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3325:7: ( rule__Operation__ModifierAssignment_0_0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3325:8: rule__Operation__ModifierAssignment_0_0
        {
        pushFollow(FOLLOW_rule__Operation__ModifierAssignment_0_0_in_synpred38_InternalClassmodel6739);
        rule__Operation__ModifierAssignment_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalClassmodel

    // $ANTLR start synpred39_InternalClassmodel
    public final void synpred39_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3363:2: ( rule__Operation__UnorderedGroup_0__1 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3363:2: rule__Operation__UnorderedGroup_0__1
        {
        pushFollow(FOLLOW_rule__Operation__UnorderedGroup_0__1_in_synpred39_InternalClassmodel6892);
        rule__Operation__UnorderedGroup_0__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalClassmodel

    // $ANTLR start synpred40_InternalClassmodel
    public final void synpred40_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3392:2: ( rule__Attribute__UnorderedGroup_0__0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3392:2: rule__Attribute__UnorderedGroup_0__0
        {
        pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_synpred40_InternalClassmodel6945);
        rule__Attribute__UnorderedGroup_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalClassmodel

    // $ANTLR start synpred41_InternalClassmodel
    public final void synpred41_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3410:4: ( ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3410:4: ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) )
        {
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3410:4: ({...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3411:5: {...}? => ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred41_InternalClassmodel", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3411:106: ( ( ( rule__Attribute__ModifierAssignment_0_0 ) ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3412:6: ( ( rule__Attribute__ModifierAssignment_0_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3418:6: ( ( rule__Attribute__ModifierAssignment_0_0 ) )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3420:7: ( rule__Attribute__ModifierAssignment_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAttributeAccess().getModifierAssignment_0_0()); 
        }
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3421:7: ( rule__Attribute__ModifierAssignment_0_0 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3421:8: rule__Attribute__ModifierAssignment_0_0
        {
        pushFollow(FOLLOW_rule__Attribute__ModifierAssignment_0_0_in_synpred41_InternalClassmodel7032);
        rule__Attribute__ModifierAssignment_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred41_InternalClassmodel

    // $ANTLR start synpred42_InternalClassmodel
    public final void synpred42_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3459:2: ( rule__Attribute__UnorderedGroup_0__1 )
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:3459:2: rule__Attribute__UnorderedGroup_0__1
        {
        pushFollow(FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_synpred42_InternalClassmodel7185);
        rule__Attribute__UnorderedGroup_0__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalClassmodel

    // Delegated rules

    public final boolean synpred42_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\6\6\1\36\5\6\2\uffff";
    static final String DFA4_maxS =
        "\6\50\1\40\5\6\2\uffff";
    static final String DFA4_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\6\14\uffff\1\1\1\2\1\3\1\4\21\uffff\1\5",
            "\1\6\14\uffff\1\7\1\10\1\11\1\12\21\uffff\1\13",
            "\1\6\14\uffff\1\7\1\10\1\11\1\12\21\uffff\1\13",
            "\1\6\14\uffff\1\7\1\10\1\11\1\12\21\uffff\1\13",
            "\1\6\14\uffff\1\7\1\10\1\11\1\12\21\uffff\1\13",
            "\1\6\14\uffff\1\7\1\10\1\11\1\12\21\uffff\1\13",
            "\1\15\1\uffff\1\14",
            "\1\6",
            "\1\6",
            "\1\6",
            "\1\6",
            "\1\6",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "739:1: rule__Feature__Alternatives : ( ( ruleAttribute ) | ( ruleOperation ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleClassmodel_in_entryRuleClassmodel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassmodel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classmodel__Group__0_in_ruleClassmodel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConstant_in_entryRuleEnumConstant487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumConstant494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConstant__Group__0_in_ruleEnumConstant520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0_in_ruleRelation1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityValue_in_entryRuleCardinalityValue1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinalityValue1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CardinalityValue__Alternatives_in_ruleCardinalityValue1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__AbstractElement__Alternatives1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__AbstractElement__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__AbstractElement__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Entity__Alternatives1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Entity__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ClassAssignment_0_0_0_in_rule__Class__Alternatives_0_01466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__InterfaceAssignment_0_0_1_in_rule__Class__Alternatives_0_01484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AbstractAssignment_0_0_2_in_rule__Class__Alternatives_0_01502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Feature__Alternatives1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Feature__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Value__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CardinalityValue__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CardinalityValue__Alternatives1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationType__Alternatives1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationType__Alternatives1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelationType__Alternatives1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RelationType__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelationType__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelationType__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Visibility__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Visibility__Alternatives1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Visibility__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Visibility__Alternatives1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classmodel__Group__0__Impl_in_rule__Classmodel__Group__01944 = new BitSet(new long[]{0x000000F000800040L});
    public static final BitSet FOLLOW_rule__Classmodel__Group__1_in_rule__Classmodel__Group__01947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classmodel__ImportsAssignment_0_in_rule__Classmodel__Group__0__Impl1974 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Classmodel__Group__1__Impl_in_rule__Classmodel__Group__12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classmodel__ElementsAssignment_1_in_rule__Classmodel__Group__1__Impl2032 = new BitSet(new long[]{0x000000F000800042L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02067 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Package__Group__0__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12129 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22189 = new BitSet(new long[]{0x000000F002800040L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__22192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Package__Group__2__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__32251 = new BitSet(new long[]{0x000000F002800040L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__32254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ElementsAssignment_3_in_rule__Package__Group__3__Impl2281 = new BitSet(new long[]{0x000000F000800042L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__42312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Package__Group__4__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Import__Group__0__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02504 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_0__0_in_rule__Class__Group__0__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__12564 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__12567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22624 = new BitSet(new long[]{0x0000010002780000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class__Group__2__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32686 = new BitSet(new long[]{0x0000010002780000L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__FeatureAssignment_3_in_rule__Class__Group__3__Impl2716 = new BitSet(new long[]{0x0000010000780002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class__Group__4__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_0__0__Impl_in_rule__Class__Group_0__02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Alternatives_0_0_in_rule__Class__Group_0__0__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02875 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__EnumerationAssignment_0_in_rule__Enum__Group__0__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12935 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__12938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__22995 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__22998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Enum__Group__2__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33057 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__FeatureAssignment_3_in_rule__Enum__Group__3__Impl3087 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Enum__Group__4__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConstant__Group__0__Impl_in_rule__EnumConstant__Group__03187 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EnumConstant__Group__1_in_rule__EnumConstant__Group__03190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConstant__NameAssignment_0_in_rule__EnumConstant__Group__0__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConstant__Group__1__Impl_in_rule__EnumConstant__Group__13247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConstant__Group_1__0_in_rule__EnumConstant__Group__1__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConstant__Group_1__0__Impl_in_rule__EnumConstant__Group_1__03309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumConstant__Group_1__1_in_rule__EnumConstant__Group_1__03312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnumConstant__Group_1__0__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConstant__Group_1__1__Impl_in_rule__EnumConstant__Group_1__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumConstant__ImplicitAssignment_1_1_in_rule__EnumConstant__Group_1__1__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__03434 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__03437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl3521 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__03556 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__03559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__13617 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__13620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Array__Group__1__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__23679 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__23682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__33740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Array__Group__3__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__03807 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__03810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0_in_rule__Operation__Group__0__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__13867 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__13870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__23927 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__23930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Operation__Group__2__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__33989 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__33992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__44050 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__44053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Operation__Group__4__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__54112 = new BitSet(new long[]{0x000000F000800040L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__54115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group__5__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__64174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ReturnAssignment_6_in_rule__Operation__Group__6__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__04245 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__04248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParametersAssignment_3_0_in_rule__Operation__Group_3__0__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__14305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl4332 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__04367 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__04370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_3_1__0__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__14429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ParametersAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04490 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14550 = new BitSet(new long[]{0x000000F000800040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Parameter__Group__1__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24612 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__24615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__34672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Group__3__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__04738 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__04741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Parameter__Group_3__0__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__14802 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__2_in_rule__Parameter__Group_3__14805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ImplicitAssignment_3_1_in_rule__Parameter__Group_3__1__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__2__Impl_in_rule__Parameter__Group_3__24862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0_in_rule__Parameter__Group_3__2__Impl4889 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__0__Impl_in_rule__Parameter__Group_3_2__04926 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1_in_rule__Parameter__Group_3_2__04929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Parameter__Group_3_2__0__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_2__1__Impl_in_rule__Parameter__Group_3_2__14988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ImplicitAssignment_3_2_1_in_rule__Parameter__Group_3_2__1__Impl5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05049 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0_in_rule__Attribute__Group__0__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15109 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25169 = new BitSet(new long[]{0x000000F000800040L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Attribute__Group__2__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35231 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__35234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__45291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__05359 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__05362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Attribute__Group_4__0__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__15423 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__15426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ImplicitAssignment_4_1_in_rule__Attribute__Group_4__1__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__25483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__0_in_rule__Attribute__Group_4__2__Impl5510 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__0__Impl_in_rule__Attribute__Group_4_2__05547 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__1_in_rule__Attribute__Group_4_2__05550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Attribute__Group_4_2__0__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4_2__1__Impl_in_rule__Attribute__Group_4_2__15609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ImplicitAssignment_4_2_1_in_rule__Attribute__Group_4_2__1__Impl5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__05670 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__05673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OriginAssignment_0_in_rule__Relation__Group__0__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__15730 = new BitSet(new long[]{0x000000000007F010L});
    public static final BitSet FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__15733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__CardinalityFromAssignment_1_in_rule__Relation__Group__1__Impl5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__25791 = new BitSet(new long[]{0x000000F000801050L});
    public static final BitSet FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__25794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__TypeAssignment_2_in_rule__Relation__Group__2__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__35851 = new BitSet(new long[]{0x000000F000801050L});
    public static final BitSet FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__35854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__CardinalityToAssignment_3_in_rule__Relation__Group__3__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__45912 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__45915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__DestinationAssignment_4_in_rule__Relation__Group__4__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__55972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_5__0_in_rule__Relation__Group__5__Impl5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_5__0__Impl_in_rule__Relation__Group_5__06042 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Relation__Group_5__1_in_rule__Relation__Group_5__06045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Relation__Group_5__0__Impl6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_5__1__Impl_in_rule__Relation__Group_5__16104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__LabelAssignment_5_1_in_rule__Relation__Group_5__1__Impl6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__06165 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__06168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityValue_in_rule__Cardinality__Group__0__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__16224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__0_in_rule__Cardinality__Group__1__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__0__Impl_in_rule__Cardinality__Group_1__06286 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__1_in_rule__Cardinality__Group_1__06289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Cardinality__Group_1__0__Impl6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__1__Impl_in_rule__Cardinality__Group_1__16348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityValue_in_rule__Cardinality__Group_1__1__Impl6375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06408 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6494 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06529 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__0_in_rule__Operation__UnorderedGroup_06652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ModifierAssignment_0_0_in_rule__Operation__UnorderedGroup_0__Impl6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__StaticAssignment_0_1_in_rule__Operation__UnorderedGroup_0__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__06889 = new BitSet(new long[]{0x0000010000780002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__1_in_rule__Operation__UnorderedGroup_0__06892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__Impl_in_rule__Operation__UnorderedGroup_0__16917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_rule__Attribute__UnorderedGroup_06945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ModifierAssignment_0_0_in_rule__Attribute__UnorderedGroup_0__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__StaticAssignment_0_1_in_rule__Attribute__UnorderedGroup_0__Impl7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__07182 = new BitSet(new long[]{0x0000010000780002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_rule__Attribute__UnorderedGroup_0__07185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__Impl_in_rule__Attribute__UnorderedGroup_0__17210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Classmodel__ImportsAssignment_07242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Classmodel__ElementsAssignment_17273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_17304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Package__ElementsAssignment_37335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_17366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Class__ClassAssignment_0_0_07402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Class__InterfaceAssignment_0_0_17446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Class__AbstractAssignment_0_0_27490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_17529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Class__FeatureAssignment_37560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Enum__EnumerationAssignment_07596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_17635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConstant_in_rule__Enum__FeatureAssignment_37666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumConstant__NameAssignment_07697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__EnumConstant__ImplicitAssignment_1_17728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Reference__TypeAssignment_07763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_17798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Array__SizeAssignment_27829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Operation__ModifierAssignment_0_07860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Operation__StaticAssignment_0_17896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_17935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParametersAssignment_3_07966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Operation__ParametersAssignment_3_1_17997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Operation__ReturnAssignment_68028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_08059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_28090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Parameter__ImplicitAssignment_3_18121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Parameter__ImplicitAssignment_3_2_18152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Attribute__ModifierAssignment_0_08183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Attribute__StaticAssignment_0_18219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_18258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_38289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Attribute__ImplicitAssignment_4_18320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Attribute__ImplicitAssignment_4_2_18351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relation__OriginAssignment_08386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Relation__CardinalityFromAssignment_18421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_28452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Relation__CardinalityToAssignment_38483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relation__DestinationAssignment_48518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relation__LabelAssignment_5_18553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__0_in_synpred37_InternalClassmodel6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ModifierAssignment_0_0_in_synpred38_InternalClassmodel6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UnorderedGroup_0__1_in_synpred39_InternalClassmodel6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__0_in_synpred40_InternalClassmodel6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ModifierAssignment_0_0_in_synpred41_InternalClassmodel7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__UnorderedGroup_0__1_in_synpred42_InternalClassmodel7185 = new BitSet(new long[]{0x0000000000000002L});

}

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'associates'", "'depends'", "'extends'", "'implements'", "'aggregates'", "'composedOf'", "'+'", "'-'", "'#'", "'~'", "'class'", "'interface'", "'abstract'", "'enum'", "'package'", "'{'", "'}'", "'import'", "'<'", "'>'", "','", "']'", "'('", "')'", "':'", "'.'", "'['"
    };
    public static final int RULE_ID=4;
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
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:182:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:186:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:187:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:187:1: ( ( rule__Entity__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:188:1: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:189:1: ( rule__Entity__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:189:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity340);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleReference"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:201:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:202:1: ( ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:203:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference367);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference374); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:210:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:214:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:215:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:215:1: ( ( rule__Reference__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:216:1: ( rule__Reference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:217:1: ( rule__Reference__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:217:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference400);
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


    // $ANTLR start "entryRuleMethod"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:229:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:230:1: ( ruleMethod EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:231:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod427);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:238:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:242:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:243:1: ( ( rule__Method__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:243:1: ( ( rule__Method__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:244:1: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:245:1: ( rule__Method__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:245:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod460);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:257:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:258:1: ( ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:259:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter487);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter494); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:266:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:270:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:271:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:271:1: ( ( rule__Parameter__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:272:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:273:1: ( rule__Parameter__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:273:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter520);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:285:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:286:1: ( ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:287:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute547);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute554); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:294:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:298:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:299:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:299:1: ( ( rule__Attribute__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:300:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:301:1: ( rule__Attribute__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:301:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute580);
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


    // $ANTLR start "entryRuleRelation"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:313:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:314:1: ( ruleRelation EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:315:1: ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation607);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation614); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:322:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:326:2: ( ( ( rule__Relation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:327:1: ( ( rule__Relation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:327:1: ( ( rule__Relation__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:328:1: ( rule__Relation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:329:1: ( rule__Relation__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:329:2: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_rule__Relation__Group__0_in_ruleRelation640);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:341:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:342:1: ( ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:343:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName667);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName674); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:350:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:354:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:355:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:355:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:356:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:357:1: ( rule__QualifiedName__Group__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:357:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName700);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:370:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:374:1: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:375:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:375:1: ( ( rule__RelationType__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:376:1: ( rule__RelationType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:377:1: ( rule__RelationType__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:377:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType737);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:389:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:393:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:394:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:394:1: ( ( rule__Visibility__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:395:1: ( rule__Visibility__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:396:1: ( rule__Visibility__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:396:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility773);
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


    // $ANTLR start "ruleEntityType"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:408:1: ruleEntityType : ( ( rule__EntityType__Alternatives ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:412:1: ( ( ( rule__EntityType__Alternatives ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:413:1: ( ( rule__EntityType__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:413:1: ( ( rule__EntityType__Alternatives ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:414:1: ( rule__EntityType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:415:1: ( rule__EntityType__Alternatives )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:415:2: rule__EntityType__Alternatives
            {
            pushFollow(FOLLOW_rule__EntityType__Alternatives_in_ruleEntityType809);
            rule__EntityType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:426:1: rule__AbstractElement__Alternatives : ( ( rulePackage ) | ( ruleEntity ) | ( ruleRelation ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:430:1: ( ( rulePackage ) | ( ruleEntity ) | ( ruleRelation ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:431:1: ( rulePackage )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:431:1: ( rulePackage )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:432:1: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePackage_in_rule__AbstractElement__Alternatives844);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:437:6: ( ruleEntity )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:437:6: ( ruleEntity )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:438:1: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEntity_in_rule__AbstractElement__Alternatives861);
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:443:6: ( ruleRelation )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:443:6: ( ruleRelation )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:444:1: ruleRelation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleRelation_in_rule__AbstractElement__Alternatives878);
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


    // $ANTLR start "rule__RelationType__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:454:1: rule__RelationType__Alternatives : ( ( ( 'associates' ) ) | ( ( 'depends' ) ) | ( ( 'extends' ) ) | ( ( 'implements' ) ) | ( ( 'aggregates' ) ) | ( ( 'composedOf' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:458:1: ( ( ( 'associates' ) ) | ( ( 'depends' ) ) | ( ( 'extends' ) ) | ( ( 'implements' ) ) | ( ( 'aggregates' ) ) | ( ( 'composedOf' ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:459:1: ( ( 'associates' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:459:1: ( ( 'associates' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:460:1: ( 'associates' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:461:1: ( 'associates' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:461:3: 'associates'
                    {
                    match(input,11,FOLLOW_11_in_rule__RelationType__Alternatives911); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:466:6: ( ( 'depends' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:466:6: ( ( 'depends' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:467:1: ( 'depends' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:468:1: ( 'depends' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:468:3: 'depends'
                    {
                    match(input,12,FOLLOW_12_in_rule__RelationType__Alternatives932); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:473:6: ( ( 'extends' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:473:6: ( ( 'extends' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:474:1: ( 'extends' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:475:1: ( 'extends' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:475:3: 'extends'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelationType__Alternatives953); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:480:6: ( ( 'implements' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:480:6: ( ( 'implements' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:481:1: ( 'implements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:482:1: ( 'implements' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:482:3: 'implements'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelationType__Alternatives974); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:487:6: ( ( 'aggregates' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:487:6: ( ( 'aggregates' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:488:1: ( 'aggregates' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:489:1: ( 'aggregates' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:489:3: 'aggregates'
                    {
                    match(input,15,FOLLOW_15_in_rule__RelationType__Alternatives995); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:494:6: ( ( 'composedOf' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:494:6: ( ( 'composedOf' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:495:1: ( 'composedOf' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:496:1: ( 'composedOf' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:496:3: 'composedOf'
                    {
                    match(input,16,FOLLOW_16_in_rule__RelationType__Alternatives1016); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:506:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:510:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '~' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:511:1: ( ( '+' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:511:1: ( ( '+' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:512:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:513:1: ( '+' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:513:3: '+'
                    {
                    match(input,17,FOLLOW_17_in_rule__Visibility__Alternatives1052); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:518:6: ( ( '-' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:518:6: ( ( '-' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:519:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:520:1: ( '-' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:520:3: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__Visibility__Alternatives1073); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:525:6: ( ( '#' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:525:6: ( ( '#' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:526:1: ( '#' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:527:1: ( '#' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:527:3: '#'
                    {
                    match(input,19,FOLLOW_19_in_rule__Visibility__Alternatives1094); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:532:6: ( ( '~' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:532:6: ( ( '~' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:533:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:534:1: ( '~' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:534:3: '~'
                    {
                    match(input,20,FOLLOW_20_in_rule__Visibility__Alternatives1115); if (state.failed) return ;

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


    // $ANTLR start "rule__EntityType__Alternatives"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:544:1: rule__EntityType__Alternatives : ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) | ( ( 'enum' ) ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:548:1: ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) | ( ( 'enum' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:549:1: ( ( 'class' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:549:1: ( ( 'class' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:550:1: ( 'class' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityTypeAccess().getCLASSEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:551:1: ( 'class' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:551:3: 'class'
                    {
                    match(input,21,FOLLOW_21_in_rule__EntityType__Alternatives1151); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityTypeAccess().getCLASSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:556:6: ( ( 'interface' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:556:6: ( ( 'interface' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:557:1: ( 'interface' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityTypeAccess().getINTERFACEEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:558:1: ( 'interface' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:558:3: 'interface'
                    {
                    match(input,22,FOLLOW_22_in_rule__EntityType__Alternatives1172); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityTypeAccess().getINTERFACEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:563:6: ( ( 'abstract' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:563:6: ( ( 'abstract' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:564:1: ( 'abstract' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityTypeAccess().getABSTRACTEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:565:1: ( 'abstract' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:565:3: 'abstract'
                    {
                    match(input,23,FOLLOW_23_in_rule__EntityType__Alternatives1193); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityTypeAccess().getABSTRACTEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:570:6: ( ( 'enum' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:570:6: ( ( 'enum' ) )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:571:1: ( 'enum' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityTypeAccess().getENUMEnumLiteralDeclaration_3()); 
                    }
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:572:1: ( 'enum' )
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:572:3: 'enum'
                    {
                    match(input,24,FOLLOW_24_in_rule__EntityType__Alternatives1214); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityTypeAccess().getENUMEnumLiteralDeclaration_3()); 
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
    // $ANTLR end "rule__EntityType__Alternatives"


    // $ANTLR start "rule__Classmodel__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:584:1: rule__Classmodel__Group__0 : rule__Classmodel__Group__0__Impl rule__Classmodel__Group__1 ;
    public final void rule__Classmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:588:1: ( rule__Classmodel__Group__0__Impl rule__Classmodel__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:589:2: rule__Classmodel__Group__0__Impl rule__Classmodel__Group__1
            {
            pushFollow(FOLLOW_rule__Classmodel__Group__0__Impl_in_rule__Classmodel__Group__01247);
            rule__Classmodel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classmodel__Group__1_in_rule__Classmodel__Group__01250);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:596:1: rule__Classmodel__Group__0__Impl : ( ( rule__Classmodel__ImportsAssignment_0 )* ) ;
    public final void rule__Classmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:600:1: ( ( ( rule__Classmodel__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:601:1: ( ( rule__Classmodel__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:601:1: ( ( rule__Classmodel__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:602:1: ( rule__Classmodel__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:603:1: ( rule__Classmodel__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:603:2: rule__Classmodel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Classmodel__ImportsAssignment_0_in_rule__Classmodel__Group__0__Impl1277);
            	    rule__Classmodel__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:613:1: rule__Classmodel__Group__1 : rule__Classmodel__Group__1__Impl ;
    public final void rule__Classmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:617:1: ( rule__Classmodel__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:618:2: rule__Classmodel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Classmodel__Group__1__Impl_in_rule__Classmodel__Group__11308);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:624:1: rule__Classmodel__Group__1__Impl : ( ( rule__Classmodel__ElementsAssignment_1 )* ) ;
    public final void rule__Classmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:628:1: ( ( ( rule__Classmodel__ElementsAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:629:1: ( ( rule__Classmodel__ElementsAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:629:1: ( ( rule__Classmodel__ElementsAssignment_1 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:630:1: ( rule__Classmodel__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getElementsAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:631:1: ( rule__Classmodel__ElementsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=21 && LA6_0<=25)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:631:2: rule__Classmodel__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Classmodel__ElementsAssignment_1_in_rule__Classmodel__Group__1__Impl1335);
            	    rule__Classmodel__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:645:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:649:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:650:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01370);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01373);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:657:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:661:1: ( ( 'package' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:662:1: ( 'package' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:662:1: ( 'package' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:663:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Package__Group__0__Impl1401); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:676:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:680:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:681:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11432);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11435);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:688:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:692:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:693:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:693:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:694:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:695:1: ( rule__Package__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:695:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1462);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:705:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:709:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:710:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21492);
            rule__Package__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21495);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:717:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:721:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:722:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:722:1: ( '{' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:723:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Package__Group__2__Impl1523); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:736:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:740:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:741:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31554);
            rule__Package__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31557);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:748:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:752:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:753:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:753:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:754:1: ( rule__Package__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:755:1: ( rule__Package__ElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=21 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:755:2: rule__Package__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__ElementsAssignment_3_in_rule__Package__Group__3__Impl1584);
            	    rule__Package__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:765:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:769:1: ( rule__Package__Group__4__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:770:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41615);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:776:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:780:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:781:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:781:1: ( '}' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:782:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__Package__Group__4__Impl1643); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:805:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:809:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:810:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01684);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01687);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:817:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:821:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:822:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:822:1: ( 'import' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:823:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Import__Group__0__Impl1715); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:836:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:840:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:841:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11746);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:847:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:851:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:852:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:852:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:853:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:854:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:854:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1773);
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


    // $ANTLR start "rule__Entity__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:868:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:872:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:873:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01807);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01810);
            rule__Entity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:880:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__TypeAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:884:1: ( ( ( rule__Entity__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:885:1: ( ( rule__Entity__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:885:1: ( ( rule__Entity__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:886:1: ( rule__Entity__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:887:1: ( rule__Entity__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:887:2: rule__Entity__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Entity__TypeAssignment_0_in_rule__Entity__Group__0__Impl1837);
            rule__Entity__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:897:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:901:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:902:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11867);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11870);
            rule__Entity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:909:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:913:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:914:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:914:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:915:1: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:916:1: ( rule__Entity__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:916:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1897);
            rule__Entity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:926:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:930:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:931:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21927);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21930);
            rule__Entity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:938:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:942:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:943:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:943:1: ( '{' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:944:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Entity__Group__2__Impl1958); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:957:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:961:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:962:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31989);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31992);
            rule__Entity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:969:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributeAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:973:1: ( ( ( rule__Entity__AttributeAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:974:1: ( ( rule__Entity__AttributeAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:974:1: ( ( rule__Entity__AttributeAssignment_3 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:975:1: ( rule__Entity__AttributeAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAttributeAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:976:1: ( rule__Entity__AttributeAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        int LA8_5 = input.LA(3);

                        if ( (LA8_5==35) ) {
                            alt8=1;
                        }


                    }


                    }
                    break;
                case 18:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID) ) {
                        int LA8_5 = input.LA(3);

                        if ( (LA8_5==35) ) {
                            alt8=1;
                        }


                    }


                    }
                    break;
                case 19:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (LA8_3==RULE_ID) ) {
                        int LA8_5 = input.LA(3);

                        if ( (LA8_5==35) ) {
                            alt8=1;
                        }


                    }


                    }
                    break;
                case 20:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (LA8_4==RULE_ID) ) {
                        int LA8_5 = input.LA(3);

                        if ( (LA8_5==35) ) {
                            alt8=1;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (LA8_5==35) ) {
                        alt8=1;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:976:2: rule__Entity__AttributeAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributeAssignment_3_in_rule__Entity__Group__3__Impl2019);
            	    rule__Entity__AttributeAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAttributeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:986:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:990:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:991:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42050);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42053);
            rule__Entity__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:998:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__MethodAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1002:1: ( ( ( rule__Entity__MethodAssignment_4 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1003:1: ( ( rule__Entity__MethodAssignment_4 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1003:1: ( ( rule__Entity__MethodAssignment_4 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1004:1: ( rule__Entity__MethodAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getMethodAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1005:1: ( rule__Entity__MethodAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=17 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1005:2: rule__Entity__MethodAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__MethodAssignment_4_in_rule__Entity__Group__4__Impl2080);
            	    rule__Entity__MethodAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getMethodAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1015:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1019:1: ( rule__Entity__Group__5__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1020:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52111);
            rule__Entity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1026:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1030:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1031:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1031:1: ( '}' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1032:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,27,FOLLOW_27_in_rule__Entity__Group__5__Impl2139); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1057:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1061:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1062:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__02182);
            rule__Reference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__02185);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1069:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__TypeAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1073:1: ( ( ( rule__Reference__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1074:1: ( ( rule__Reference__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1074:1: ( ( rule__Reference__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1075:1: ( rule__Reference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1076:1: ( rule__Reference__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1076:2: rule__Reference__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl2212);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1086:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1090:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1091:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__12242);
            rule__Reference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__12245);
            rule__Reference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1098:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__Group_1__0 )? ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1102:1: ( ( ( rule__Reference__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1103:1: ( ( rule__Reference__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1103:1: ( ( rule__Reference__Group_1__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1104:1: ( rule__Reference__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1105:1: ( rule__Reference__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1105:2: rule__Reference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_1__0_in_rule__Reference__Group__1__Impl2272);
                    rule__Reference__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGroup_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Reference__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1115:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1119:1: ( rule__Reference__Group__2__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1120:2: rule__Reference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__22303);
            rule__Reference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1126:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__Group_2__0 )* ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1130:1: ( ( ( rule__Reference__Group_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1131:1: ( ( rule__Reference__Group_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1131:1: ( ( rule__Reference__Group_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1132:1: ( rule__Reference__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1133:1: ( rule__Reference__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1133:2: rule__Reference__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Reference__Group_2__0_in_rule__Reference__Group__2__Impl2330);
            	    rule__Reference__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group_1__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1149:1: rule__Reference__Group_1__0 : rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1 ;
    public final void rule__Reference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1153:1: ( rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1154:2: rule__Reference__Group_1__0__Impl rule__Reference__Group_1__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_1__0__Impl_in_rule__Reference__Group_1__02367);
            rule__Reference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group_1__1_in_rule__Reference__Group_1__02370);
            rule__Reference__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1__0"


    // $ANTLR start "rule__Reference__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1161:1: rule__Reference__Group_1__0__Impl : ( ( '<' ) ) ;
    public final void rule__Reference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1165:1: ( ( ( '<' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1166:1: ( ( '<' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1166:1: ( ( '<' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1167:1: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getLessThanSignKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1168:1: ( '<' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1169:2: '<'
            {
            match(input,29,FOLLOW_29_in_rule__Reference__Group_1__0__Impl2399); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getLessThanSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1__0__Impl"


    // $ANTLR start "rule__Reference__Group_1__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1180:1: rule__Reference__Group_1__1 : rule__Reference__Group_1__1__Impl rule__Reference__Group_1__2 ;
    public final void rule__Reference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1184:1: ( rule__Reference__Group_1__1__Impl rule__Reference__Group_1__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1185:2: rule__Reference__Group_1__1__Impl rule__Reference__Group_1__2
            {
            pushFollow(FOLLOW_rule__Reference__Group_1__1__Impl_in_rule__Reference__Group_1__12431);
            rule__Reference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group_1__2_in_rule__Reference__Group_1__12434);
            rule__Reference__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1__1"


    // $ANTLR start "rule__Reference__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1192:1: rule__Reference__Group_1__1__Impl : ( ( rule__Reference__GenericAssignment_1_1 ) ) ;
    public final void rule__Reference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1196:1: ( ( ( rule__Reference__GenericAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1197:1: ( ( rule__Reference__GenericAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1197:1: ( ( rule__Reference__GenericAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1198:1: ( rule__Reference__GenericAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGenericAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1199:1: ( rule__Reference__GenericAssignment_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1199:2: rule__Reference__GenericAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Reference__GenericAssignment_1_1_in_rule__Reference__Group_1__1__Impl2461);
            rule__Reference__GenericAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGenericAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1__1__Impl"


    // $ANTLR start "rule__Reference__Group_1__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1209:1: rule__Reference__Group_1__2 : rule__Reference__Group_1__2__Impl rule__Reference__Group_1__3 ;
    public final void rule__Reference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1213:1: ( rule__Reference__Group_1__2__Impl rule__Reference__Group_1__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1214:2: rule__Reference__Group_1__2__Impl rule__Reference__Group_1__3
            {
            pushFollow(FOLLOW_rule__Reference__Group_1__2__Impl_in_rule__Reference__Group_1__22491);
            rule__Reference__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group_1__3_in_rule__Reference__Group_1__22494);
            rule__Reference__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1__2"


    // $ANTLR start "rule__Reference__Group_1__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1221:1: rule__Reference__Group_1__2__Impl : ( ( rule__Reference__Group_1_2__0 )* ) ;
    public final void rule__Reference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1225:1: ( ( ( rule__Reference__Group_1_2__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1226:1: ( ( rule__Reference__Group_1_2__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1226:1: ( ( rule__Reference__Group_1_2__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1227:1: ( rule__Reference__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup_1_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1228:1: ( rule__Reference__Group_1_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1228:2: rule__Reference__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Reference__Group_1_2__0_in_rule__Reference__Group_1__2__Impl2521);
            	    rule__Reference__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1__2__Impl"


    // $ANTLR start "rule__Reference__Group_1__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1238:1: rule__Reference__Group_1__3 : rule__Reference__Group_1__3__Impl ;
    public final void rule__Reference__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1242:1: ( rule__Reference__Group_1__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1243:2: rule__Reference__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_1__3__Impl_in_rule__Reference__Group_1__32552);
            rule__Reference__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1__3"


    // $ANTLR start "rule__Reference__Group_1__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1249:1: rule__Reference__Group_1__3__Impl : ( '>' ) ;
    public final void rule__Reference__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1253:1: ( ( '>' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1254:1: ( '>' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1254:1: ( '>' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1255:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__Reference__Group_1__3__Impl2580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1__3__Impl"


    // $ANTLR start "rule__Reference__Group_1_2__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1276:1: rule__Reference__Group_1_2__0 : rule__Reference__Group_1_2__0__Impl rule__Reference__Group_1_2__1 ;
    public final void rule__Reference__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1280:1: ( rule__Reference__Group_1_2__0__Impl rule__Reference__Group_1_2__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1281:2: rule__Reference__Group_1_2__0__Impl rule__Reference__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_1_2__0__Impl_in_rule__Reference__Group_1_2__02619);
            rule__Reference__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group_1_2__1_in_rule__Reference__Group_1_2__02622);
            rule__Reference__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1_2__0"


    // $ANTLR start "rule__Reference__Group_1_2__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1288:1: rule__Reference__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1292:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1293:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1293:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1294:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Reference__Group_1_2__0__Impl2650); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_1_2__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1307:1: rule__Reference__Group_1_2__1 : rule__Reference__Group_1_2__1__Impl ;
    public final void rule__Reference__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1311:1: ( rule__Reference__Group_1_2__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1312:2: rule__Reference__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_1_2__1__Impl_in_rule__Reference__Group_1_2__12681);
            rule__Reference__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1_2__1"


    // $ANTLR start "rule__Reference__Group_1_2__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1318:1: rule__Reference__Group_1_2__1__Impl : ( ( rule__Reference__GenericAssignment_1_2_1 ) ) ;
    public final void rule__Reference__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1322:1: ( ( ( rule__Reference__GenericAssignment_1_2_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1323:1: ( ( rule__Reference__GenericAssignment_1_2_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1323:1: ( ( rule__Reference__GenericAssignment_1_2_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1324:1: ( rule__Reference__GenericAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGenericAssignment_1_2_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1325:1: ( rule__Reference__GenericAssignment_1_2_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1325:2: rule__Reference__GenericAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Reference__GenericAssignment_1_2_1_in_rule__Reference__Group_1_2__1__Impl2708);
            rule__Reference__GenericAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGenericAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_1_2__1__Impl"


    // $ANTLR start "rule__Reference__Group_2__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1339:1: rule__Reference__Group_2__0 : rule__Reference__Group_2__0__Impl ;
    public final void rule__Reference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1343:1: ( rule__Reference__Group_2__0__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1344:2: rule__Reference__Group_2__0__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_2__0__Impl_in_rule__Reference__Group_2__02742);
            rule__Reference__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__0"


    // $ANTLR start "rule__Reference__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1350:1: rule__Reference__Group_2__0__Impl : ( ( rule__Reference__Group_2_0__0 ) ) ;
    public final void rule__Reference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1354:1: ( ( ( rule__Reference__Group_2_0__0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1355:1: ( ( rule__Reference__Group_2_0__0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1355:1: ( ( rule__Reference__Group_2_0__0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1356:1: ( rule__Reference__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup_2_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1357:1: ( rule__Reference__Group_2_0__0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1357:2: rule__Reference__Group_2_0__0
            {
            pushFollow(FOLLOW_rule__Reference__Group_2_0__0_in_rule__Reference__Group_2__0__Impl2769);
            rule__Reference__Group_2_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGroup_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_2_0__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1369:1: rule__Reference__Group_2_0__0 : rule__Reference__Group_2_0__0__Impl rule__Reference__Group_2_0__1 ;
    public final void rule__Reference__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1373:1: ( rule__Reference__Group_2_0__0__Impl rule__Reference__Group_2_0__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1374:2: rule__Reference__Group_2_0__0__Impl rule__Reference__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_2_0__0__Impl_in_rule__Reference__Group_2_0__02801);
            rule__Reference__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group_2_0__1_in_rule__Reference__Group_2_0__02804);
            rule__Reference__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2_0__0"


    // $ANTLR start "rule__Reference__Group_2_0__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1381:1: rule__Reference__Group_2_0__0__Impl : ( ( rule__Reference__DimensionAssignment_2_0_0 ) ) ;
    public final void rule__Reference__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1385:1: ( ( ( rule__Reference__DimensionAssignment_2_0_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1386:1: ( ( rule__Reference__DimensionAssignment_2_0_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1386:1: ( ( rule__Reference__DimensionAssignment_2_0_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1387:1: ( rule__Reference__DimensionAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getDimensionAssignment_2_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1388:1: ( rule__Reference__DimensionAssignment_2_0_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1388:2: rule__Reference__DimensionAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__Reference__DimensionAssignment_2_0_0_in_rule__Reference__Group_2_0__0__Impl2831);
            rule__Reference__DimensionAssignment_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getDimensionAssignment_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2_0__0__Impl"


    // $ANTLR start "rule__Reference__Group_2_0__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1398:1: rule__Reference__Group_2_0__1 : rule__Reference__Group_2_0__1__Impl ;
    public final void rule__Reference__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1402:1: ( rule__Reference__Group_2_0__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1403:2: rule__Reference__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_2_0__1__Impl_in_rule__Reference__Group_2_0__12861);
            rule__Reference__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2_0__1"


    // $ANTLR start "rule__Reference__Group_2_0__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1409:1: rule__Reference__Group_2_0__1__Impl : ( ']' ) ;
    public final void rule__Reference__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1413:1: ( ( ']' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1414:1: ( ']' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1414:1: ( ']' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1415:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_2_0_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Reference__Group_2_0__1__Impl2889); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2_0__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1432:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1436:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1437:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02924);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02927);
            rule__Method__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1444:1: rule__Method__Group__0__Impl : ( ( rule__Method__ModifierAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1448:1: ( ( ( rule__Method__ModifierAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1449:1: ( ( rule__Method__ModifierAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1449:1: ( ( rule__Method__ModifierAssignment_0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1450:1: ( rule__Method__ModifierAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getModifierAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1451:1: ( rule__Method__ModifierAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=17 && LA13_0<=20)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1451:2: rule__Method__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Method__ModifierAssignment_0_in_rule__Method__Group__0__Impl2954);
                    rule__Method__ModifierAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getModifierAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1461:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1465:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1466:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12985);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12988);
            rule__Method__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1473:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1477:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1478:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1478:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1479:1: ( rule__Method__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1480:1: ( rule__Method__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1480:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3015);
            rule__Method__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1490:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1494:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1495:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23045);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23048);
            rule__Method__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1502:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1506:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1507:1: ( '(' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1507:1: ( '(' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1508:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Method__Group__2__Impl3076); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1521:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1525:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1526:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33107);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33110);
            rule__Method__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1533:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1537:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1538:1: ( ( rule__Method__Group_3__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1538:1: ( ( rule__Method__Group_3__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1539:1: ( rule__Method__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1540:1: ( rule__Method__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1540:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl3137);
                    rule__Method__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1550:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1554:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1555:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__43168);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__43171);
            rule__Method__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1562:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1566:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1567:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1567:1: ( ')' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1568:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,34,FOLLOW_34_in_rule__Method__Group__4__Impl3199); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1581:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1585:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1586:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__53230);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group__6_in_rule__Method__Group__53233);
            rule__Method__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1593:1: rule__Method__Group__5__Impl : ( ':' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1597:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1598:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1598:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1599:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getColonKeyword_5()); 
            }
            match(input,35,FOLLOW_35_in_rule__Method__Group__5__Impl3261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getColonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1612:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1616:1: ( rule__Method__Group__6__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1617:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__63292);
            rule__Method__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1623:1: rule__Method__Group__6__Impl : ( ( rule__Method__ReturnAssignment_6 ) ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1627:1: ( ( ( rule__Method__ReturnAssignment_6 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1628:1: ( ( rule__Method__ReturnAssignment_6 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1628:1: ( ( rule__Method__ReturnAssignment_6 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1629:1: ( rule__Method__ReturnAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnAssignment_6()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1630:1: ( rule__Method__ReturnAssignment_6 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1630:2: rule__Method__ReturnAssignment_6
            {
            pushFollow(FOLLOW_rule__Method__ReturnAssignment_6_in_rule__Method__Group__6__Impl3319);
            rule__Method__ReturnAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1654:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1658:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1659:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__03363);
            rule__Method__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__03366);
            rule__Method__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1666:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParametersAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1670:1: ( ( ( rule__Method__ParametersAssignment_3_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1671:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1671:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1672:1: ( rule__Method__ParametersAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1673:1: ( rule__Method__ParametersAssignment_3_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1673:2: rule__Method__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_0_in_rule__Method__Group_3__0__Impl3393);
            rule__Method__ParametersAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1683:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1687:1: ( rule__Method__Group_3__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1688:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__13423);
            rule__Method__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1694:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1698:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1699:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1699:1: ( ( rule__Method__Group_3_1__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1700:1: ( rule__Method__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1701:1: ( rule__Method__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1701:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__1__Impl3450);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1715:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1719:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1720:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3_1__0__Impl_in_rule__Method__Group_3_1__03485);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__03488);
            rule__Method__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1727:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1731:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1732:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1732:1: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1733:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Method__Group_3_1__0__Impl3516); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1746:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1750:1: ( rule__Method__Group_3_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1751:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3_1__1__Impl_in_rule__Method__Group_3_1__13547);
            rule__Method__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1757:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1761:1: ( ( ( rule__Method__ParametersAssignment_3_1_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1762:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1762:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1763:1: ( rule__Method__ParametersAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1764:1: ( rule__Method__ParametersAssignment_3_1_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1764:2: rule__Method__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_1_1_in_rule__Method__Group_3_1__1__Impl3574);
            rule__Method__ParametersAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1778:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1782:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1783:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03608);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03611);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1790:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1794:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1795:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1795:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1796:1: ( rule__Parameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1797:1: ( rule__Parameter__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1797:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl3638);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1807:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1811:1: ( rule__Parameter__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1812:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13668);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1818:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1822:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1823:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1823:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1824:1: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1825:1: ( rule__Parameter__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1825:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3695);
            rule__Parameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1839:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1843:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1844:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03729);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03732);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1851:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__ModifierAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1855:1: ( ( ( rule__Attribute__ModifierAssignment_0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1856:1: ( ( rule__Attribute__ModifierAssignment_0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1856:1: ( ( rule__Attribute__ModifierAssignment_0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1857:1: ( rule__Attribute__ModifierAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getModifierAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1858:1: ( rule__Attribute__ModifierAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=17 && LA16_0<=20)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1858:2: rule__Attribute__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__ModifierAssignment_0_in_rule__Attribute__Group__0__Impl3759);
                    rule__Attribute__ModifierAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getModifierAssignment_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1868:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1872:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1873:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13790);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13793);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1880:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1884:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1885:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1885:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1886:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1887:1: ( rule__Attribute__NameAssignment_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1887:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl3820);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1897:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1901:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1902:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23850);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23853);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1909:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1913:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1914:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1914:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1915:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Attribute__Group__2__Impl3881); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1928:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1932:1: ( rule__Attribute__Group__3__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1933:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33912);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1939:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1943:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1944:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1944:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1945:1: ( rule__Attribute__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1946:1: ( rule__Attribute__TypeAssignment_3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1946:2: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl3939);
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


    // $ANTLR start "rule__Relation__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1964:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1968:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1969:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__03977);
            rule__Relation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__03980);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1976:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__OriginAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1980:1: ( ( ( rule__Relation__OriginAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1981:1: ( ( rule__Relation__OriginAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1981:1: ( ( rule__Relation__OriginAssignment_0 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1982:1: ( rule__Relation__OriginAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOriginAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1983:1: ( rule__Relation__OriginAssignment_0 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1983:2: rule__Relation__OriginAssignment_0
            {
            pushFollow(FOLLOW_rule__Relation__OriginAssignment_0_in_rule__Relation__Group__0__Impl4007);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1993:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1997:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1998:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__14037);
            rule__Relation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__14040);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2005:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__CardinalityFromAssignment_1 )? ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2009:1: ( ( ( rule__Relation__CardinalityFromAssignment_1 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2010:1: ( ( rule__Relation__CardinalityFromAssignment_1 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2010:1: ( ( rule__Relation__CardinalityFromAssignment_1 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2011:1: ( rule__Relation__CardinalityFromAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getCardinalityFromAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2012:1: ( rule__Relation__CardinalityFromAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2012:2: rule__Relation__CardinalityFromAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Relation__CardinalityFromAssignment_1_in_rule__Relation__Group__1__Impl4067);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2022:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2026:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2027:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__24098);
            rule__Relation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__24101);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2034:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__TypeAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2038:1: ( ( ( rule__Relation__TypeAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2039:1: ( ( rule__Relation__TypeAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2039:1: ( ( rule__Relation__TypeAssignment_2 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2040:1: ( rule__Relation__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getTypeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2041:1: ( rule__Relation__TypeAssignment_2 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2041:2: rule__Relation__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Relation__TypeAssignment_2_in_rule__Relation__Group__2__Impl4128);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2051:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2055:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2056:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__34158);
            rule__Relation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__34161);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2063:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__CardinalityToAssignment_3 )? ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2067:1: ( ( ( rule__Relation__CardinalityToAssignment_3 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2068:1: ( ( rule__Relation__CardinalityToAssignment_3 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2068:1: ( ( rule__Relation__CardinalityToAssignment_3 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2069:1: ( rule__Relation__CardinalityToAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getCardinalityToAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2070:1: ( rule__Relation__CardinalityToAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2070:2: rule__Relation__CardinalityToAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Relation__CardinalityToAssignment_3_in_rule__Relation__Group__3__Impl4188);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2080:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2084:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2085:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__44219);
            rule__Relation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__44222);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2092:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__DestinationAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2096:1: ( ( ( rule__Relation__DestinationAssignment_4 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2097:1: ( ( rule__Relation__DestinationAssignment_4 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2097:1: ( ( rule__Relation__DestinationAssignment_4 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2098:1: ( rule__Relation__DestinationAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getDestinationAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2099:1: ( rule__Relation__DestinationAssignment_4 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2099:2: rule__Relation__DestinationAssignment_4
            {
            pushFollow(FOLLOW_rule__Relation__DestinationAssignment_4_in_rule__Relation__Group__4__Impl4249);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2109:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2113:1: ( rule__Relation__Group__5__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2114:2: rule__Relation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__54279);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2120:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__Group_5__0 )? ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2124:1: ( ( ( rule__Relation__Group_5__0 )? ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2125:1: ( ( rule__Relation__Group_5__0 )? )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2125:1: ( ( rule__Relation__Group_5__0 )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2126:1: ( rule__Relation__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_5()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2127:1: ( rule__Relation__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2127:2: rule__Relation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Relation__Group_5__0_in_rule__Relation__Group__5__Impl4306);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2149:1: rule__Relation__Group_5__0 : rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 ;
    public final void rule__Relation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2153:1: ( rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2154:2: rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_5__0__Impl_in_rule__Relation__Group_5__04349);
            rule__Relation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_5__1_in_rule__Relation__Group_5__04352);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2161:1: rule__Relation__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Relation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2165:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2166:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2166:1: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2167:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getColonKeyword_5_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Relation__Group_5__0__Impl4380); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2180:1: rule__Relation__Group_5__1 : rule__Relation__Group_5__1__Impl ;
    public final void rule__Relation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2184:1: ( rule__Relation__Group_5__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2185:2: rule__Relation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_5__1__Impl_in_rule__Relation__Group_5__14411);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2191:1: rule__Relation__Group_5__1__Impl : ( ( rule__Relation__LabelAssignment_5_1 ) ) ;
    public final void rule__Relation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2195:1: ( ( ( rule__Relation__LabelAssignment_5_1 ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2196:1: ( ( rule__Relation__LabelAssignment_5_1 ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2196:1: ( ( rule__Relation__LabelAssignment_5_1 ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2197:1: ( rule__Relation__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getLabelAssignment_5_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2198:1: ( rule__Relation__LabelAssignment_5_1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2198:2: rule__Relation__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Relation__LabelAssignment_5_1_in_rule__Relation__Group_5__1__Impl4438);
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2212:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2216:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2217:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04472);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04475);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2224:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2228:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2229:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2229:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2230:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4502); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2241:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2245:1: ( rule__QualifiedName__Group__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2246:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14531);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2252:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2256:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2257:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2257:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2258:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2259:1: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2259:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4558);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2273:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2277:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2278:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04593);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04596);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2285:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2289:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2290:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2290:1: ( '.' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2291:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__QualifiedName__Group_1__0__Impl4624); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2304:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2308:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2309:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14655);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2315:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2319:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2320:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2320:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2321:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4682); if (state.failed) return ;
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


    // $ANTLR start "rule__Classmodel__ImportsAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2337:1: rule__Classmodel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Classmodel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2341:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2342:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2342:1: ( ruleImport )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2343:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Classmodel__ImportsAssignment_04720);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2352:1: rule__Classmodel__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Classmodel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2356:1: ( ( ruleAbstractElement ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2357:1: ( ruleAbstractElement )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2357:1: ( ruleAbstractElement )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2358:1: ruleAbstractElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassmodelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Classmodel__ElementsAssignment_14751);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2367:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2371:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2372:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2372:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2373:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_14782); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2382:1: rule__Package__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2386:1: ( ( ruleAbstractElement ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2387:1: ( ruleAbstractElement )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2387:1: ( ruleAbstractElement )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2388:1: ruleAbstractElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Package__ElementsAssignment_34813);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2397:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2401:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2402:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2402:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2403:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14844); if (state.failed) return ;
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


    // $ANTLR start "rule__Entity__TypeAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2412:1: rule__Entity__TypeAssignment_0 : ( ruleEntityType ) ;
    public final void rule__Entity__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2416:1: ( ( ruleEntityType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2417:1: ( ruleEntityType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2417:1: ( ruleEntityType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2418:1: ruleEntityType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getTypeEntityTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEntityType_in_rule__Entity__TypeAssignment_04875);
            ruleEntityType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getTypeEntityTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__TypeAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2427:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2431:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2432:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2432:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2433:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributeAssignment_3"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2442:1: rule__Entity__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2446:1: ( ( ruleAttribute ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2447:1: ( ruleAttribute )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2447:1: ( ruleAttribute )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2448:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAttributeAttributeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributeAssignment_34937);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAttributeAttributeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributeAssignment_3"


    // $ANTLR start "rule__Entity__MethodAssignment_4"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2457:1: rule__Entity__MethodAssignment_4 : ( ruleMethod ) ;
    public final void rule__Entity__MethodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2461:1: ( ( ruleMethod ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2462:1: ( ruleMethod )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2462:1: ( ruleMethod )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2463:1: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getMethodMethodParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_rule__Entity__MethodAssignment_44968);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getMethodMethodParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__MethodAssignment_4"


    // $ANTLR start "rule__Reference__TypeAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2472:1: rule__Reference__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2476:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2477:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2477:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2478:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2479:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2480:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeEntityQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Reference__TypeAssignment_05003);
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


    // $ANTLR start "rule__Reference__GenericAssignment_1_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2491:1: rule__Reference__GenericAssignment_1_1 : ( ruleReference ) ;
    public final void rule__Reference__GenericAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2495:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2496:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2496:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2497:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGenericReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Reference__GenericAssignment_1_15038);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGenericReferenceParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__GenericAssignment_1_1"


    // $ANTLR start "rule__Reference__GenericAssignment_1_2_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2506:1: rule__Reference__GenericAssignment_1_2_1 : ( ruleReference ) ;
    public final void rule__Reference__GenericAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2510:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2511:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2511:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2512:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGenericReferenceParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Reference__GenericAssignment_1_2_15069);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGenericReferenceParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__GenericAssignment_1_2_1"


    // $ANTLR start "rule__Reference__DimensionAssignment_2_0_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2521:1: rule__Reference__DimensionAssignment_2_0_0 : ( ( '[' ) ) ;
    public final void rule__Reference__DimensionAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2525:1: ( ( ( '[' ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2526:1: ( ( '[' ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2526:1: ( ( '[' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2527:1: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getDimensionLeftSquareBracketKeyword_2_0_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2528:1: ( '[' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2529:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getDimensionLeftSquareBracketKeyword_2_0_0_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Reference__DimensionAssignment_2_0_05105); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getDimensionLeftSquareBracketKeyword_2_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getDimensionLeftSquareBracketKeyword_2_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__DimensionAssignment_2_0_0"


    // $ANTLR start "rule__Method__ModifierAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2544:1: rule__Method__ModifierAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2548:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2549:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2549:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2550:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getModifierVisibilityEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Method__ModifierAssignment_05144);
            ruleVisibility();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getModifierVisibilityEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ModifierAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2559:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2563:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2564:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2564:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2565:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_15175); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParametersAssignment_3_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2574:1: rule__Method__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2578:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2579:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2579:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2580:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_3_05206);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_3_0"


    // $ANTLR start "rule__Method__ParametersAssignment_3_1_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2589:1: rule__Method__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2593:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2594:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2594:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2595:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_3_1_15237);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Method__ReturnAssignment_6"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2604:1: rule__Method__ReturnAssignment_6 : ( ruleReference ) ;
    public final void rule__Method__ReturnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2608:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2609:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2609:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2610:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getReturnReferenceParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Method__ReturnAssignment_65268);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getReturnReferenceParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnAssignment_6"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2619:1: rule__Parameter__TypeAssignment_0 : ( ruleReference ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2623:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2624:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2624:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2625:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_05299);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2634:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2638:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2639:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2639:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2640:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_15330); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Attribute__ModifierAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2649:1: rule__Attribute__ModifierAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2653:1: ( ( ruleVisibility ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2654:1: ( ruleVisibility )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2654:1: ( ruleVisibility )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2655:1: ruleVisibility
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getModifierVisibilityEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVisibility_in_rule__Attribute__ModifierAssignment_05361);
            ruleVisibility();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getModifierVisibilityEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ModifierAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2664:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2668:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2669:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2669:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2670:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_15392); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2679:1: rule__Attribute__TypeAssignment_3 : ( ruleReference ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2683:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2684:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2684:1: ( ruleReference )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2685:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_35423);
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


    // $ANTLR start "rule__Relation__OriginAssignment_0"
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2694:1: rule__Relation__OriginAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relation__OriginAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2698:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2699:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2699:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2700:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOriginEntityCrossReference_0_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2701:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2702:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOriginEntityQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Relation__OriginAssignment_05458);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2713:1: rule__Relation__CardinalityFromAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Relation__CardinalityFromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2717:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2718:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2718:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2719:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getCardinalityFromSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relation__CardinalityFromAssignment_15493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getCardinalityFromSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2728:1: rule__Relation__TypeAssignment_2 : ( ruleRelationType ) ;
    public final void rule__Relation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2732:1: ( ( ruleRelationType ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2733:1: ( ruleRelationType )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2733:1: ( ruleRelationType )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2734:1: ruleRelationType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_25524);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2743:1: rule__Relation__CardinalityToAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Relation__CardinalityToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2747:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2748:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2748:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2749:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getCardinalityToSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relation__CardinalityToAssignment_35555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getCardinalityToSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2758:1: rule__Relation__DestinationAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relation__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2762:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2763:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2763:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2764:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getDestinationEntityCrossReference_4_0()); 
            }
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2765:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2766:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getDestinationEntityQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Relation__DestinationAssignment_45590);
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
    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2777:1: rule__Relation__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Relation__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2781:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2782:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2782:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:2783:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Relation__LabelAssignment_5_15625); if (state.failed) return ;
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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0_in_ruleRelation640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Alternatives_in_ruleEntityType809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__AbstractElement__Alternatives844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__AbstractElement__Alternatives861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__AbstractElement__Alternatives878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RelationType__Alternatives911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationType__Alternatives932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationType__Alternatives953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationType__Alternatives974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelationType__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RelationType__Alternatives1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Visibility__Alternatives1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Visibility__Alternatives1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Visibility__Alternatives1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Visibility__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntityType__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EntityType__Alternatives1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EntityType__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EntityType__Alternatives1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classmodel__Group__0__Impl_in_rule__Classmodel__Group__01247 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_rule__Classmodel__Group__1_in_rule__Classmodel__Group__01250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classmodel__ImportsAssignment_0_in_rule__Classmodel__Group__0__Impl1277 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Classmodel__Group__1__Impl_in_rule__Classmodel__Group__11308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classmodel__ElementsAssignment_1_in_rule__Classmodel__Group__1__Impl1335 = new BitSet(new long[]{0x0000000003E00012L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Package__Group__0__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11432 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21492 = new BitSet(new long[]{0x000000000BE00010L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Package__Group__2__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31554 = new BitSet(new long[]{0x000000000BE00010L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ElementsAssignment_3_in_rule__Package__Group__3__Impl1584 = new BitSet(new long[]{0x0000000003E00012L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Package__Group__4__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Import__Group__0__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__TypeAssignment_0_in_rule__Entity__Group__0__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11867 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21927 = new BitSet(new long[]{0x00000000081E0010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group__2__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31989 = new BitSet(new long[]{0x00000000081E0010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributeAssignment_3_in_rule__Entity__Group__3__Impl2019 = new BitSet(new long[]{0x00000000001E0012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42050 = new BitSet(new long[]{0x00000000081E0010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__MethodAssignment_4_in_rule__Entity__Group__4__Impl2080 = new BitSet(new long[]{0x00000000001E0012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group__5__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__02182 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__12242 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_1__0_in_rule__Reference__Group__1__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__22303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2__0_in_rule__Reference__Group__2__Impl2330 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_1__0__Impl_in_rule__Reference__Group_1__02367 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_rule__Reference__Group_1__1_in_rule__Reference__Group_1__02370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Reference__Group_1__0__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_1__1__Impl_in_rule__Reference__Group_1__12431 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Reference__Group_1__2_in_rule__Reference__Group_1__12434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__GenericAssignment_1_1_in_rule__Reference__Group_1__1__Impl2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_1__2__Impl_in_rule__Reference__Group_1__22491 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Reference__Group_1__3_in_rule__Reference__Group_1__22494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_1_2__0_in_rule__Reference__Group_1__2__Impl2521 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_1__3__Impl_in_rule__Reference__Group_1__32552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Reference__Group_1__3__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_1_2__0__Impl_in_rule__Reference__Group_1_2__02619 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_rule__Reference__Group_1_2__1_in_rule__Reference__Group_1_2__02622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Reference__Group_1_2__0__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_1_2__1__Impl_in_rule__Reference__Group_1_2__12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__GenericAssignment_1_2_1_in_rule__Reference__Group_1_2__1__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2__0__Impl_in_rule__Reference__Group_2__02742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2_0__0_in_rule__Reference__Group_2__0__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2_0__0__Impl_in_rule__Reference__Group_2_0__02801 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Reference__Group_2_0__1_in_rule__Reference__Group_2_0__02804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__DimensionAssignment_2_0_0_in_rule__Reference__Group_2_0__0__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2_0__1__Impl_in_rule__Reference__Group_2_0__12861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Reference__Group_2_0__1__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02924 = new BitSet(new long[]{0x00000000001E0010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ModifierAssignment_0_in_rule__Method__Group__0__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12985 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23045 = new BitSet(new long[]{0x0000000403E00010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Method__Group__2__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33107 = new BitSet(new long[]{0x0000000403E00010L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__43168 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__43171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Method__Group__4__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__53230 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_rule__Method__Group__6_in_rule__Method__Group__53233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Method__Group__5__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__63292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ReturnAssignment_6_in_rule__Method__Group__6__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__03363 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__03366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_0_in_rule__Method__Group_3__0__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__13423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__1__Impl3450 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0__Impl_in_rule__Method__Group_3_1__03485 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__03488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Method__Group_3_1__0__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1__Impl_in_rule__Method__Group_3_1__13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_1_1_in_rule__Method__Group_3_1__1__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03729 = new BitSet(new long[]{0x00000000001E0010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ModifierAssignment_0_in_rule__Attribute__Group__0__Impl3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13790 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23850 = new BitSet(new long[]{0x0000000003E00010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Attribute__Group__2__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_3_in_rule__Attribute__Group__3__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__03977 = new BitSet(new long[]{0x000000000001F820L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__03980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OriginAssignment_0_in_rule__Relation__Group__0__Impl4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__14037 = new BitSet(new long[]{0x000000000001F820L});
    public static final BitSet FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__CardinalityFromAssignment_1_in_rule__Relation__Group__1__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__24098 = new BitSet(new long[]{0x0000000003E00030L});
    public static final BitSet FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__24101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__TypeAssignment_2_in_rule__Relation__Group__2__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__34158 = new BitSet(new long[]{0x0000000003E00030L});
    public static final BitSet FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__34161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__CardinalityToAssignment_3_in_rule__Relation__Group__3__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__44219 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__44222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__DestinationAssignment_4_in_rule__Relation__Group__4__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__54279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_5__0_in_rule__Relation__Group__5__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_5__0__Impl_in_rule__Relation__Group_5__04349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Relation__Group_5__1_in_rule__Relation__Group_5__04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Relation__Group_5__0__Impl4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_5__1__Impl_in_rule__Relation__Group_5__14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__LabelAssignment_5_1_in_rule__Relation__Group_5__1__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04472 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4558 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__QualifiedName__Group_1__0__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Classmodel__ImportsAssignment_04720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Classmodel__ElementsAssignment_14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_14782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Package__ElementsAssignment_34813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__Entity__TypeAssignment_04875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributeAssignment_34937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Entity__MethodAssignment_44968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Reference__TypeAssignment_05003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Reference__GenericAssignment_1_15038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Reference__GenericAssignment_1_2_15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Reference__DimensionAssignment_2_0_05105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Method__ModifierAssignment_05144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_15175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_3_05206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_3_1_15237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Method__ReturnAssignment_65268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_05299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Attribute__ModifierAssignment_05361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_15392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Attribute__TypeAssignment_35423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relation__OriginAssignment_05458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relation__CardinalityFromAssignment_15493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_25524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relation__CardinalityToAssignment_35555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relation__DestinationAssignment_45590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Relation__LabelAssignment_5_15625 = new BitSet(new long[]{0x0000000000000002L});

}
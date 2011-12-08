package cz.cvut.earlgrey.classmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "'('", "','", "')'", "':'", "'.'", "'.*'", "'associates'", "'depends'", "'extends'", "'implements'", "'aggregates'", "'composes'", "'+'", "'-'", "'#'", "'~'", "'class'", "'interface'", "'abstract'", "'enum'"
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


        public InternalClassmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClassmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClassmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g"; }



     	private ClassmodelGrammarAccess grammarAccess;
     	
        public InternalClassmodelParser(TokenStream input, ClassmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Classmodel";	
       	}
       	
       	@Override
       	protected ClassmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleClassmodel"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:68:1: entryRuleClassmodel returns [EObject current=null] : iv_ruleClassmodel= ruleClassmodel EOF ;
    public final EObject entryRuleClassmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassmodel = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:69:2: (iv_ruleClassmodel= ruleClassmodel EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:70:2: iv_ruleClassmodel= ruleClassmodel EOF
            {
             newCompositeNode(grammarAccess.getClassmodelRule()); 
            pushFollow(FOLLOW_ruleClassmodel_in_entryRuleClassmodel75);
            iv_ruleClassmodel=ruleClassmodel();

            state._fsp--;

             current =iv_ruleClassmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassmodel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassmodel"


    // $ANTLR start "ruleClassmodel"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:77:1: ruleClassmodel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleClassmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassmodelAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleClassmodel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:99:3: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==11||(LA2_0>=31 && LA2_0<=34)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:100:1: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:100:1: (lv_elements_1_0= ruleAbstractElement )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:101:3: lv_elements_1_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassmodelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleClassmodel153);
            	    lv_elements_1_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:125:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:126:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:127:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement190);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:134:1: ruleAbstractElement returns [EObject current=null] : (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Relation_2= ruleRelation ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Relation_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:137:28: ( (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Relation_2= ruleRelation ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:138:1: (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Relation_2= ruleRelation )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:138:1: (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Relation_2= ruleRelation )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:139:5: this_Package_0= rulePackage
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackage_in_ruleAbstractElement247);
                    this_Package_0=rulePackage();

                    state._fsp--;

                     
                            current = this_Package_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:149:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleAbstractElement274);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:159:5: this_Relation_2= ruleRelation
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRelation_in_ruleAbstractElement301);
                    this_Relation_2=ruleRelation();

                    state._fsp--;

                     
                            current = this_Relation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackage"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:175:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:176:2: (iv_rulePackage= rulePackage EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:177:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage336);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:184:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:187:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:188:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:188:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:188:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage383); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:192:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:193:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:193:1: (lv_name_1_0= ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:194:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackage404);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackage416); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:214:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==11||(LA4_0>=31 && LA4_0<=34)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:215:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:215:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:216:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackage437);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePackage450); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:244:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:245:2: (iv_ruleImport= ruleImport EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:246:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport486);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:253:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:256:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:257:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:257:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:257:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport533); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:261:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:262:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:262:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:263:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport554);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleEntity"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:287:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:288:2: (iv_ruleEntity= ruleEntity EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:289:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity590);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity600); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:296:1: ruleEntity returns [EObject current=null] : ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_attribute_3_0 = null;

        EObject lv_method_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:299:28: ( ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:1: ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:1: ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:2: ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:2: ( (lv_type_0_0= ruleEntityType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:301:1: (lv_type_0_0= ruleEntityType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:301:1: (lv_type_0_0= ruleEntityType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:302:3: lv_type_0_0= ruleEntityType
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getTypeEntityTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityType_in_ruleEntity646);
            lv_type_0_0=ruleEntityType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"EntityType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:318:2: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:319:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:319:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:320:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity663); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity680); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:340:1: ( (lv_attribute_3_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_ID) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==18) ) {
                            alt5=1;
                        }


                    }


                    }
                    break;
                case 28:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==18) ) {
                            alt5=1;
                        }


                    }


                    }
                    break;
                case 29:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (LA5_3==RULE_ID) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==18) ) {
                            alt5=1;
                        }


                    }


                    }
                    break;
                case 30:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (LA5_4==RULE_ID) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==18) ) {
                            alt5=1;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA5_5 = input.LA(2);

                    if ( (LA5_5==18) ) {
                        alt5=1;
                    }


                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:341:1: (lv_attribute_3_0= ruleAttribute )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:341:1: (lv_attribute_3_0= ruleAttribute )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:342:3: lv_attribute_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributeAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity701);
            	    lv_attribute_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:358:3: ( (lv_method_4_0= ruleMethod ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=27 && LA6_0<=30)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:359:1: (lv_method_4_0= ruleMethod )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:359:1: (lv_method_4_0= ruleMethod )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:360:3: lv_method_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getMethodMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntity723);
            	    lv_method_4_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"method",
            	            		lv_method_4_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEntity736); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleMethod"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:388:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:389:2: (iv_ruleMethod= ruleMethod EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:390:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod772);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:397:1: ruleMethod returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:400:28: ( ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:401:1: ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:401:1: ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:401:2: ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:401:2: ( (lv_modifier_0_0= ruleVisibility ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=27 && LA7_0<=30)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:402:1: (lv_modifier_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:402:1: (lv_modifier_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:403:3: lv_modifier_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getModifierVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleMethod828);
                    lv_modifier_0_0=ruleVisibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"modifier",
                            		lv_modifier_0_0, 
                            		"Visibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:419:3: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:420:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:420:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:421:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod846); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMethod863); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:441:1: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:441:2: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:441:2: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:442:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:442:1: (lv_parameters_3_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:443:3: lv_parameters_3_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod885);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:459:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:459:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMethod898); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:463:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:464:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:464:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:465:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod919);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleMethod935); 

                	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleMethod947); 

                	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getColonKeyword_5());
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:489:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:490:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:490:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:491:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getReturnEntityCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethod970);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:512:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:514:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1006);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:521:1: ruleParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:524:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:525:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:525:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:525:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:525:2: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:526:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:526:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:527:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeEntityCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleParameter1064);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:540:2: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:541:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:541:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:542:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1081); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAttribute"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:566:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:567:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:568:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1122);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1132); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:575:1: ruleAttribute returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_modifier_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:578:28: ( ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:579:1: ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:579:1: ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:579:2: ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:579:2: ( (lv_modifier_0_0= ruleVisibility ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=27 && LA10_0<=30)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:580:1: (lv_modifier_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:580:1: (lv_modifier_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:581:3: lv_modifier_0_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getModifierVisibilityEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibility_in_ruleAttribute1178);
                    lv_modifier_0_0=ruleVisibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"modifier",
                            		lv_modifier_0_0, 
                            		"Visibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:597:3: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:598:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:598:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:599:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1196); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAttribute1213); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:619:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:620:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:620:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:621:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeEntityCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttribute1236);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:642:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:643:2: (iv_ruleRelation= ruleRelation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:644:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation1272);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation1282); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:651:1: ruleRelation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_cardinalityFrom_1_0=null;
        Token lv_cardinalityTo_3_0=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:654:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:655:1: ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:655:1: ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:655:2: ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:655:2: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:656:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:656:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:657:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationAccess().getOriginEntityCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelation1330);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:670:2: ( (lv_cardinalityFrom_1_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:671:1: (lv_cardinalityFrom_1_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:671:1: (lv_cardinalityFrom_1_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:672:3: lv_cardinalityFrom_1_0= RULE_STRING
                    {
                    lv_cardinalityFrom_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelation1347); 

                    			newLeafNode(lv_cardinalityFrom_1_0, grammarAccess.getRelationAccess().getCardinalityFromSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cardinalityFrom",
                            		lv_cardinalityFrom_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:688:3: ( (lv_type_2_0= ruleRelationType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:689:1: (lv_type_2_0= ruleRelationType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:689:1: (lv_type_2_0= ruleRelationType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:690:3: lv_type_2_0= ruleRelationType
            {
             
            	        newCompositeNode(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationType_in_ruleRelation1374);
            lv_type_2_0=ruleRelationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"RelationType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:706:2: ( (lv_cardinalityTo_3_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:707:1: (lv_cardinalityTo_3_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:707:1: (lv_cardinalityTo_3_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:708:3: lv_cardinalityTo_3_0= RULE_STRING
                    {
                    lv_cardinalityTo_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelation1391); 

                    			newLeafNode(lv_cardinalityTo_3_0, grammarAccess.getRelationAccess().getCardinalityToSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cardinalityTo",
                            		lv_cardinalityTo_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:724:3: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:725:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:725:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:726:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationAccess().getDestinationEntityCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelation1420);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:739:2: (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:739:4: otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleRelation1433); 

                        	newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getColonKeyword_5_0());
                        
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:743:1: ( (lv_label_6_0= RULE_STRING ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:744:1: (lv_label_6_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:744:1: (lv_label_6_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:745:3: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelation1450); 

                    			newLeafNode(lv_label_6_0, grammarAccess.getRelationAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:769:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:770:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:771:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1494);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:778:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:781:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:782:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:782:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:782:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1545); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:789:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:790:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedName1564); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1579); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:810:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:811:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:812:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1627);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1638); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:819:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:822:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:823:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:823:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:824:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1685);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:834:1: (kw= '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:835:2: kw= '.*'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedNameWithWildcard1704); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleRelationType"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:848:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composes' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:850:28: ( ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composes' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:851:1: ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composes' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:851:1: ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composes' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt16=1;
                }
                break;
            case 22:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            case 24:
                {
                alt16=4;
                }
                break;
            case 25:
                {
                alt16=5;
                }
                break;
            case 26:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:851:2: (enumLiteral_0= 'associates' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:851:2: (enumLiteral_0= 'associates' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:851:4: enumLiteral_0= 'associates'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleRelationType1760); 

                            current = grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:857:6: (enumLiteral_1= 'depends' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:857:6: (enumLiteral_1= 'depends' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:857:8: enumLiteral_1= 'depends'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleRelationType1777); 

                            current = grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:863:6: (enumLiteral_2= 'extends' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:863:6: (enumLiteral_2= 'extends' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:863:8: enumLiteral_2= 'extends'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleRelationType1794); 

                            current = grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:869:6: (enumLiteral_3= 'implements' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:869:6: (enumLiteral_3= 'implements' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:869:8: enumLiteral_3= 'implements'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_24_in_ruleRelationType1811); 

                            current = grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:875:6: (enumLiteral_4= 'aggregates' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:875:6: (enumLiteral_4= 'aggregates' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:875:8: enumLiteral_4= 'aggregates'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleRelationType1828); 

                            current = grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:881:6: (enumLiteral_5= 'composes' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:881:6: (enumLiteral_5= 'composes' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:881:8: enumLiteral_5= 'composes'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_26_in_ruleRelationType1845); 

                            current = grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "ruleVisibility"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:891:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:893:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:894:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:894:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case 29:
                {
                alt17=3;
                }
                break;
            case 30:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:894:2: (enumLiteral_0= '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:894:2: (enumLiteral_0= '+' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:894:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleVisibility1890); 

                            current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:900:6: (enumLiteral_1= '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:900:6: (enumLiteral_1= '-' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:900:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_ruleVisibility1907); 

                            current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:906:6: (enumLiteral_2= '#' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:906:6: (enumLiteral_2= '#' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:906:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleVisibility1924); 

                            current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:912:6: (enumLiteral_3= '~' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:912:6: (enumLiteral_3= '~' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:912:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_30_in_ruleVisibility1941); 

                            current = grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleEntityType"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:922:1: ruleEntityType returns [Enumerator current=null] : ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'abstract' ) | (enumLiteral_3= 'enum' ) ) ;
    public final Enumerator ruleEntityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:924:28: ( ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'abstract' ) | (enumLiteral_3= 'enum' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:925:1: ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'abstract' ) | (enumLiteral_3= 'enum' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:925:1: ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'abstract' ) | (enumLiteral_3= 'enum' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 34:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:925:2: (enumLiteral_0= 'class' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:925:2: (enumLiteral_0= 'class' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:925:4: enumLiteral_0= 'class'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleEntityType1986); 

                            current = grammarAccess.getEntityTypeAccess().getCLASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEntityTypeAccess().getCLASSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:931:6: (enumLiteral_1= 'interface' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:931:6: (enumLiteral_1= 'interface' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:931:8: enumLiteral_1= 'interface'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleEntityType2003); 

                            current = grammarAccess.getEntityTypeAccess().getINTERFACEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEntityTypeAccess().getINTERFACEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:937:6: (enumLiteral_2= 'abstract' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:937:6: (enumLiteral_2= 'abstract' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:937:8: enumLiteral_2= 'abstract'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_33_in_ruleEntityType2020); 

                            current = grammarAccess.getEntityTypeAccess().getABSTRACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEntityTypeAccess().getABSTRACTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:943:6: (enumLiteral_3= 'enum' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:943:6: (enumLiteral_3= 'enum' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:943:8: enumLiteral_3= 'enum'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_34_in_ruleEntityType2037); 

                            current = grammarAccess.getEntityTypeAccess().getENUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEntityTypeAccess().getENUMEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleClassmodel_in_entryRuleClassmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleClassmodel131 = new BitSet(new long[]{0x0000000780004812L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleClassmodel153 = new BitSet(new long[]{0x0000000780000812L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleAbstractElement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleAbstractElement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage383 = new BitSet(new long[]{0x0000000780000810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackage404 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage416 = new BitSet(new long[]{0x0000000780002810L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackage437 = new BitSet(new long[]{0x0000000780002810L});
    public static final BitSet FOLLOW_13_in_rulePackage450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport533 = new BitSet(new long[]{0x0000000780000810L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleEntity646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity663 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity680 = new BitSet(new long[]{0x0000000078002010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity701 = new BitSet(new long[]{0x0000000078002010L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntity723 = new BitSet(new long[]{0x0000000078002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleMethod828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod846 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMethod863 = new BitSet(new long[]{0x0000000780020810L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod885 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMethod898 = new BitSet(new long[]{0x0000000780000810L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod919 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleMethod935 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMethod947 = new BitSet(new long[]{0x0000000780000810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParameter1064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAttribute1178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1196 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttribute1213 = new BitSet(new long[]{0x0000000780000810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelation1330 = new BitSet(new long[]{0x0000000007E00020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelation1347 = new BitSet(new long[]{0x0000000007E00020L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleRelation1374 = new BitSet(new long[]{0x0000000780000830L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelation1391 = new BitSet(new long[]{0x0000000780000810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelation1420 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleRelation1433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelation1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1545 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedName1564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1579 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1685 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedNameWithWildcard1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRelationType1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRelationType1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRelationType1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRelationType1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRelationType1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelationType1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVisibility1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVisibility1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVisibility1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVisibility1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEntityType1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEntityType2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleEntityType2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEntityType2037 = new BitSet(new long[]{0x0000000000000002L});

}
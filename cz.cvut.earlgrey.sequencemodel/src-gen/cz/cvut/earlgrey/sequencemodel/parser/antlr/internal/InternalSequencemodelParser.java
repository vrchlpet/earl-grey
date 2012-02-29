package cz.cvut.earlgrey.sequencemodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cz.cvut.earlgrey.sequencemodel.services.SequencemodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSequencemodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NATURAL", "RULE_OPERATOR", "RULE_ANY_OTHER", "RULE_WS", "RULE_BOOLEAN", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'import'", "'sequence'", "'end'", "'def'", "'('", "','", "')'", "'if'", "'then'", "'elsif'", "'else'", "'foreach'", "'do'", "'while'", "'assert'", "'break'", "'next'", "'.'", "'new'", "'return '", "'delete '", "':'", "'['", "']'", "'in'", "'..'", "'@'", "'-'", "'e'", "'E'", "'+'"
    };
    public static final int RULE_BOOLEAN=10;
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__20=20;
    public static final int RULE_NATURAL=6;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_NULL=11;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OPERATOR=7;
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
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g"; }



     	private SequencemodelGrammarAccess grammarAccess;
     	
        public InternalSequencemodelParser(TokenStream input, SequencemodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SequencemodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_sequence_1_0= ruleSequence ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_sequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_sequence_1_0= ruleSequence ) )* ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_sequence_1_0= ruleSequence ) )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_sequence_1_0= ruleSequence ) )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_sequence_1_0= ruleSequence ) )*
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:98:3: ( (lv_sequence_1_0= ruleSequence ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==40) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:99:1: (lv_sequence_1_0= ruleSequence )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:99:1: (lv_sequence_1_0= ruleSequence )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:100:3: lv_sequence_1_0= ruleSequence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getSequenceSequenceParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSequence_in_ruleModel153);
            	    lv_sequence_1_0=ruleSequence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sequence",
            	              		lv_sequence_1_0, 
            	              		"Sequence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:136:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:137:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:137:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:137:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:141:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:142:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:142:1: (lv_importURI_1_0= RULE_STRING )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:143:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleSequence"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:167:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:168:2: (iv_ruleSequence= ruleSequence EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:169:2: iv_ruleSequence= ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence295);
            iv_ruleSequence=ruleSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence305); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:176:1: ruleSequence returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'end' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_participant_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:179:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'end'
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==40) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:181:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:181:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:182:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSequenceAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleSequence351);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotation",
            	              		lv_annotation_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:198:3: ( ( 'sequence' )=>otherlv_1= 'sequence' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:198:4: ( 'sequence' )=>otherlv_1= 'sequence'
            {
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleSequence372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getSequenceKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:203:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:204:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:204:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:205:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequence390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSequenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:221:2: ( (lv_participant_3_0= ruleParticipant ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:222:1: (lv_participant_3_0= ruleParticipant )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:222:1: (lv_participant_3_0= ruleParticipant )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:223:3: lv_participant_3_0= ruleParticipant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParticipant_in_ruleSequence416);
            	    lv_participant_3_0=ruleParticipant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"participant",
            	              		lv_participant_3_0, 
            	              		"Participant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSequence429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleParticipant"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:251:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:252:2: (iv_ruleParticipant= ruleParticipant EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:253:2: iv_ruleParticipant= ruleParticipant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParticipantRule()); 
            }
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant465);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParticipant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant475); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:260:1: ruleParticipant returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( RULE_ID ) )=> (lv_name_1_0= RULE_ID ) ) ( (lv_transition_2_0= ruleTransition ) )* ( (lv_block_3_0= ruleTransitionBlock ) )* otherlv_4= 'end' ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_transition_2_0 = null;

        EObject lv_block_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:263:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( RULE_ID ) )=> (lv_name_1_0= RULE_ID ) ) ( (lv_transition_2_0= ruleTransition ) )* ( (lv_block_3_0= ruleTransitionBlock ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:264:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( RULE_ID ) )=> (lv_name_1_0= RULE_ID ) ) ( (lv_transition_2_0= ruleTransition ) )* ( (lv_block_3_0= ruleTransitionBlock ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:264:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( RULE_ID ) )=> (lv_name_1_0= RULE_ID ) ) ( (lv_transition_2_0= ruleTransition ) )* ( (lv_block_3_0= ruleTransitionBlock ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:264:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( RULE_ID ) )=> (lv_name_1_0= RULE_ID ) ) ( (lv_transition_2_0= ruleTransition ) )* ( (lv_block_3_0= ruleTransitionBlock ) )* otherlv_4= 'end'
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:264:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==40) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:265:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:265:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:266:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParticipantAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleParticipant521);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParticipantRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotation",
            	              		lv_annotation_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:282:3: ( ( ( RULE_ID ) )=> (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:282:4: ( ( RULE_ID ) )=> (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:288:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParticipant550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParticipantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:305:2: ( (lv_transition_2_0= ruleTransition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==21||LA6_0==25||(LA6_0>=27 && LA6_0<=30)||(LA6_0>=32 && LA6_0<=34)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:306:1: (lv_transition_2_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:306:1: (lv_transition_2_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:307:3: lv_transition_2_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParticipantAccess().getTransitionTransitionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleParticipant576);
            	    lv_transition_2_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParticipantRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transition",
            	              		lv_transition_2_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:323:3: ( (lv_block_3_0= ruleTransitionBlock ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:324:1: (lv_block_3_0= ruleTransitionBlock )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:324:1: (lv_block_3_0= ruleTransitionBlock )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:325:3: lv_block_3_0= ruleTransitionBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParticipantAccess().getBlockTransitionBlockParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransitionBlock_in_ruleParticipant598);
            	    lv_block_3_0=ruleTransitionBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParticipantRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"block",
            	              		lv_block_3_0, 
            	              		"TransitionBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleParticipant611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParticipantAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:353:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:354:2: (iv_ruleTransition= ruleTransition EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:355:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition647);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition657); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:362:1: ruleTransition returns [EObject current=null] : (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Fragment_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:365:28: ( (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:366:1: (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:366:1: (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=32 && LA8_0<=34)) ) {
                alt8=1;
            }
            else if ( (LA8_0==21||LA8_0==25||(LA8_0>=27 && LA8_0<=30)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:367:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleTransition704);
                    this_Message_0=ruleMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Message_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:377:5: this_Fragment_1= ruleFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionAccess().getFragmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFragment_in_ruleTransition731);
                    this_Fragment_1=ruleFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Fragment_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTransitionBlock"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:393:1: entryRuleTransitionBlock returns [EObject current=null] : iv_ruleTransitionBlock= ruleTransitionBlock EOF ;
    public final EObject entryRuleTransitionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionBlock = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:394:2: (iv_ruleTransitionBlock= ruleTransitionBlock EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:395:2: iv_ruleTransitionBlock= ruleTransitionBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionBlockRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionBlock_in_entryRuleTransitionBlock766);
            iv_ruleTransitionBlock=ruleTransitionBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionBlock776); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransitionBlock"


    // $ANTLR start "ruleTransitionBlock"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:402:1: ruleTransitionBlock returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ( (lv_transition_7_0= ruleTransition ) )* otherlv_8= 'end' ) ;
    public final EObject ruleTransitionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;

        EObject lv_transition_7_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:405:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ( (lv_transition_7_0= ruleTransition ) )* otherlv_8= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:406:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ( (lv_transition_7_0= ruleTransition ) )* otherlv_8= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:406:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ( (lv_transition_7_0= ruleTransition ) )* otherlv_8= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:406:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ( (lv_transition_7_0= ruleTransition ) )* otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTransitionBlock813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionBlockAccess().getDefKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:410:1: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:411:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:411:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:412:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransitionBlock830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTransitionBlockAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionBlockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:428:2: ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) && (synpred3_InternalSequencemodel())) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:428:3: ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:428:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:428:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTransitionBlock856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionBlockAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:433:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) && (synpred4_InternalSequencemodel())) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:433:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:433:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:433:4: ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:438:1: (lv_parameter_3_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:439:3: lv_parameter_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTransitionBlockAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleTransitionBlock889);
                            lv_parameter_3_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTransitionBlockRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameter",
                                      		lv_parameter_3_0, 
                                      		"Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:455:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==19) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:455:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleTransitionBlock902); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getTransitionBlockAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:459:1: ( (lv_parameter_5_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:460:1: (lv_parameter_5_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:460:1: (lv_parameter_5_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:461:3: lv_parameter_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTransitionBlockAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleTransitionBlock923);
                            	    lv_parameter_5_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTransitionBlockRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameter",
                            	              		lv_parameter_5_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleTransitionBlock939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTransitionBlockAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:481:3: ( (lv_transition_7_0= ruleTransition ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==21||LA12_0==25||(LA12_0>=27 && LA12_0<=30)||(LA12_0>=32 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:482:1: (lv_transition_7_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:482:1: (lv_transition_7_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:483:3: lv_transition_7_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionBlockAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleTransitionBlock962);
            	    lv_transition_7_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transition",
            	              		lv_transition_7_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTransitionBlock975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTransitionBlockAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTransitionBlock"


    // $ANTLR start "entryRuleFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:511:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:512:2: (iv_ruleFragment= ruleFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:513:2: iv_ruleFragment= ruleFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment1011);
            iv_ruleFragment=ruleFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment1021); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:520:1: ruleFragment returns [EObject current=null] : (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        EObject this_IfElseFragment_0 = null;

        EObject this_ForeachFragment_1 = null;

        EObject this_AssertFragment_2 = null;

        EObject this_LoopFragment_3 = null;

        EObject this_BreakFragment_4 = null;

        EObject this_NextFragment_5 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:523:28: ( (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:524:1: (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:524:1: (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 29:
                {
                alt13=5;
                }
                break;
            case 30:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:525:5: this_IfElseFragment_0= ruleIfElseFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getIfElseFragmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfElseFragment_in_ruleFragment1068);
                    this_IfElseFragment_0=ruleIfElseFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfElseFragment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:535:5: this_ForeachFragment_1= ruleForeachFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getForeachFragmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForeachFragment_in_ruleFragment1095);
                    this_ForeachFragment_1=ruleForeachFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForeachFragment_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:545:5: this_AssertFragment_2= ruleAssertFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getAssertFragmentParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertFragment_in_ruleFragment1122);
                    this_AssertFragment_2=ruleAssertFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertFragment_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:555:5: this_LoopFragment_3= ruleLoopFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getLoopFragmentParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLoopFragment_in_ruleFragment1149);
                    this_LoopFragment_3=ruleLoopFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LoopFragment_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:565:5: this_BreakFragment_4= ruleBreakFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getBreakFragmentParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakFragment_in_ruleFragment1176);
                    this_BreakFragment_4=ruleBreakFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BreakFragment_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:575:5: this_NextFragment_5= ruleNextFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getNextFragmentParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNextFragment_in_ruleFragment1203);
                    this_NextFragment_5=ruleNextFragment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NextFragment_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleIfElseFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:591:1: entryRuleIfElseFragment returns [EObject current=null] : iv_ruleIfElseFragment= ruleIfElseFragment EOF ;
    public final EObject entryRuleIfElseFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:592:2: (iv_ruleIfElseFragment= ruleIfElseFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:593:2: iv_ruleIfElseFragment= ruleIfElseFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment1238);
            iv_ruleIfElseFragment=ruleIfElseFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElseFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseFragment1248); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfElseFragment"


    // $ANTLR start "ruleIfElseFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:600:1: ruleIfElseFragment returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' ) ;
    public final EObject ruleIfElseFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;

        AntlrDatatypeRuleToken lv_elseIfExpr_5_0 = null;

        EObject lv_elseIftransition_7_0 = null;

        EObject lv_elseTransition_9_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:603:28: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:604:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:604:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:604:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleIfElseFragment1285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfElseFragmentAccess().getIfKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:608:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:609:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:609:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:610:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1306);
            lv_expr_1_0=ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfElseFragmentRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"ValueWithSpaces");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleIfElseFragment1318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfElseFragmentAccess().getThenKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:630:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==21||LA14_0==25||(LA14_0>=27 && LA14_0<=30)||(LA14_0>=32 && LA14_0<=34)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:631:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:631:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:632:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1339);
            	    lv_transition_3_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfElseFragmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transition",
            	              		lv_transition_3_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:648:3: ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) && (synpred5_InternalSequencemodel())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:648:4: ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )*
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:648:4: ( ( 'elsif' )=>otherlv_4= 'elsif' )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:648:5: ( 'elsif' )=>otherlv_4= 'elsif'
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleIfElseFragment1361); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getIfElseFragmentAccess().getElsifKeyword_4_0());
            	          
            	    }

            	    }

            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:653:2: ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:654:1: (lv_elseIfExpr_5_0= ruleValueWithSpaces )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:654:1: (lv_elseIfExpr_5_0= ruleValueWithSpaces )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:655:3: lv_elseIfExpr_5_0= ruleValueWithSpaces
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseIfExprValueWithSpacesParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1383);
            	    lv_elseIfExpr_5_0=ruleValueWithSpaces();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfElseFragmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elseIfExpr",
            	              		lv_elseIfExpr_5_0, 
            	              		"ValueWithSpaces");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleIfElseFragment1395); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getIfElseFragmentAccess().getThenKeyword_4_2());
            	          
            	    }
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:675:1: ( (lv_elseIftransition_7_0= ruleTransition ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==RULE_ID||LA15_0==21||LA15_0==25||(LA15_0>=27 && LA15_0<=30)||(LA15_0>=32 && LA15_0<=34)) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:676:1: (lv_elseIftransition_7_0= ruleTransition )
            	    	    {
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:676:1: (lv_elseIftransition_7_0= ruleTransition )
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:677:3: lv_elseIftransition_7_0= ruleTransition
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseIftransitionTransitionParserRuleCall_4_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1416);
            	    	    lv_elseIftransition_7_0=ruleTransition();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getIfElseFragmentRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"elseIftransition",
            	    	              		lv_elseIftransition_7_0, 
            	    	              		"Transition");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:693:5: ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) && (synpred6_InternalSequencemodel())) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:693:6: ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )*
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:693:6: ( ( 'else' )=>otherlv_8= 'else' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:693:7: ( 'else' )=>otherlv_8= 'else'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleIfElseFragment1440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getIfElseFragmentAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:698:2: ( (lv_elseTransition_9_0= ruleTransition ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||LA17_0==21||LA17_0==25||(LA17_0>=27 && LA17_0<=30)||(LA17_0>=32 && LA17_0<=34)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:699:1: (lv_elseTransition_9_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:699:1: (lv_elseTransition_9_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:700:3: lv_elseTransition_9_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseTransitionTransitionParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1462);
                    	    lv_elseTransition_9_0=ruleTransition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIfElseFragmentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elseTransition",
                    	              		lv_elseTransition_9_0, 
                    	              		"Transition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleIfElseFragment1477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getIfElseFragmentAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfElseFragment"


    // $ANTLR start "entryRuleForeachFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:728:1: entryRuleForeachFragment returns [EObject current=null] : iv_ruleForeachFragment= ruleForeachFragment EOF ;
    public final EObject entryRuleForeachFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:729:2: (iv_ruleForeachFragment= ruleForeachFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:730:2: iv_ruleForeachFragment= ruleForeachFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment1513);
            iv_ruleForeachFragment=ruleForeachFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeachFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachFragment1523); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForeachFragment"


    // $ANTLR start "ruleForeachFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:737:1: ruleForeachFragment returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleForeachFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:740:28: ( (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:741:1: (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:741:1: (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:741:3: otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleForeachFragment1560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForeachFragmentAccess().getForeachKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:745:1: ( (lv_expr_1_0= ruleForeachExpression ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:746:1: (lv_expr_1_0= ruleForeachExpression )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:746:1: (lv_expr_1_0= ruleForeachExpression )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:747:3: lv_expr_1_0= ruleForeachExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachFragmentAccess().getExprForeachExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_ruleForeachFragment1581);
            lv_expr_1_0=ruleForeachExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForeachFragmentRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"ForeachExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleForeachFragment1593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForeachFragmentAccess().getDoKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:767:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==21||LA19_0==25||(LA19_0>=27 && LA19_0<=30)||(LA19_0>=32 && LA19_0<=34)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:768:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:768:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:769:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForeachFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleForeachFragment1614);
            	    lv_transition_3_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getForeachFragmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transition",
            	              		lv_transition_3_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleForeachFragment1627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForeachFragmentAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleForeachFragment"


    // $ANTLR start "entryRuleLoopFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:797:1: entryRuleLoopFragment returns [EObject current=null] : iv_ruleLoopFragment= ruleLoopFragment EOF ;
    public final EObject entryRuleLoopFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:798:2: (iv_ruleLoopFragment= ruleLoopFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:799:2: iv_ruleLoopFragment= ruleLoopFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment1663);
            iv_ruleLoopFragment=ruleLoopFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopFragment1673); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLoopFragment"


    // $ANTLR start "ruleLoopFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:806:1: ruleLoopFragment returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleLoopFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:809:28: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:810:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:810:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:810:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleLoopFragment1710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopFragmentAccess().getWhileKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:814:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:815:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:815:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:816:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleLoopFragment1731);
            lv_expr_1_0=ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopFragmentRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"ValueWithSpaces");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleLoopFragment1743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLoopFragmentAccess().getDoKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:836:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==21||LA20_0==25||(LA20_0>=27 && LA20_0<=30)||(LA20_0>=32 && LA20_0<=34)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:837:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:837:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:838:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLoopFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleLoopFragment1764);
            	    lv_transition_3_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLoopFragmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transition",
            	              		lv_transition_3_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleLoopFragment1777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLoopFragmentAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLoopFragment"


    // $ANTLR start "entryRuleAssertFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:866:1: entryRuleAssertFragment returns [EObject current=null] : iv_ruleAssertFragment= ruleAssertFragment EOF ;
    public final EObject entryRuleAssertFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:867:2: (iv_ruleAssertFragment= ruleAssertFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:868:2: iv_ruleAssertFragment= ruleAssertFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment1813);
            iv_ruleAssertFragment=ruleAssertFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertFragment1823); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssertFragment"


    // $ANTLR start "ruleAssertFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:875:1: ruleAssertFragment returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleAssertFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:878:28: ( (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:879:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:879:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:879:3: otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAssertFragment1860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertFragmentAccess().getAssertKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:883:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:884:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:884:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:885:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleAssertFragment1881);
            lv_expr_1_0=ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertFragmentRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"ValueWithSpaces");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAssertFragment1893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssertFragmentAccess().getThenKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:905:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==21||LA21_0==25||(LA21_0>=27 && LA21_0<=30)||(LA21_0>=32 && LA21_0<=34)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:906:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:906:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:907:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleAssertFragment1914);
            	    lv_transition_3_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssertFragmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transition",
            	              		lv_transition_3_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAssertFragment1927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssertFragmentAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertFragment"


    // $ANTLR start "entryRuleBreakFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:935:1: entryRuleBreakFragment returns [EObject current=null] : iv_ruleBreakFragment= ruleBreakFragment EOF ;
    public final EObject entryRuleBreakFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:936:2: (iv_ruleBreakFragment= ruleBreakFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:937:2: iv_ruleBreakFragment= ruleBreakFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment1963);
            iv_ruleBreakFragment=ruleBreakFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakFragment1973); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBreakFragment"


    // $ANTLR start "ruleBreakFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:944:1: ruleBreakFragment returns [EObject current=null] : ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) ;
    public final EObject ruleBreakFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_expr_2_0 = null;

        EObject lv_transition_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:947:28: ( ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:948:1: ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:948:1: ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:948:2: () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:948:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:949:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakFragmentAccess().getBreakFragmentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleBreakFragment2019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakFragmentAccess().getBreakKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:958:1: ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:958:2: ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:958:2: ( (lv_expr_2_0= ruleValueWithSpaces ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:959:1: (lv_expr_2_0= ruleValueWithSpaces )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:959:1: (lv_expr_2_0= ruleValueWithSpaces )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:960:3: lv_expr_2_0= ruleValueWithSpaces
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBreakFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleBreakFragment2041);
                    lv_expr_2_0=ruleValueWithSpaces();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBreakFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"ValueWithSpaces");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleBreakFragment2053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBreakFragmentAccess().getThenKeyword_2_1());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:980:1: ( (lv_transition_4_0= ruleTransition ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID||LA22_0==21||LA22_0==25||(LA22_0>=27 && LA22_0<=30)||(LA22_0>=32 && LA22_0<=34)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:981:1: (lv_transition_4_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:981:1: (lv_transition_4_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:982:3: lv_transition_4_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBreakFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleBreakFragment2074);
                    	    lv_transition_4_0=ruleTransition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBreakFragmentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"transition",
                    	              		lv_transition_4_0, 
                    	              		"Transition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleBreakFragment2087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBreakFragmentAccess().getEndKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBreakFragment"


    // $ANTLR start "entryRuleNextFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1010:1: entryRuleNextFragment returns [EObject current=null] : iv_ruleNextFragment= ruleNextFragment EOF ;
    public final EObject entryRuleNextFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1011:2: (iv_ruleNextFragment= ruleNextFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1012:2: iv_ruleNextFragment= ruleNextFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleNextFragment_in_entryRuleNextFragment2125);
            iv_ruleNextFragment=ruleNextFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextFragment2135); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNextFragment"


    // $ANTLR start "ruleNextFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1019:1: ruleNextFragment returns [EObject current=null] : ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) ;
    public final EObject ruleNextFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_expr_2_0 = null;

        EObject lv_transition_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1022:28: ( ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1023:1: ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1023:1: ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1023:2: () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1023:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1024:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNextFragmentAccess().getNextFragmentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleNextFragment2181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNextFragmentAccess().getNextKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1033:1: ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1033:2: ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1033:2: ( (lv_expr_2_0= ruleValueWithSpaces ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1034:1: (lv_expr_2_0= ruleValueWithSpaces )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1034:1: (lv_expr_2_0= ruleValueWithSpaces )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1035:3: lv_expr_2_0= ruleValueWithSpaces
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNextFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleNextFragment2203);
                    lv_expr_2_0=ruleValueWithSpaces();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNextFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"ValueWithSpaces");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleNextFragment2215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNextFragmentAccess().getThenKeyword_2_1());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1055:1: ( (lv_transition_4_0= ruleTransition ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==21||LA24_0==25||(LA24_0>=27 && LA24_0<=30)||(LA24_0>=32 && LA24_0<=34)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1056:1: (lv_transition_4_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1056:1: (lv_transition_4_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1057:3: lv_transition_4_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNextFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleNextFragment2236);
                    	    lv_transition_4_0=ruleTransition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNextFragmentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"transition",
                    	              		lv_transition_4_0, 
                    	              		"Transition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleNextFragment2249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNextFragmentAccess().getEndKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNextFragment"


    // $ANTLR start "entryRuleMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1085:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1086:2: (iv_ruleMessage= ruleMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1087:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2287);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2297); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1094:1: ruleMessage returns [EObject current=null] : (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_ReturnMessage_2= ruleReturnMessage | this_DeleteMessage_3= ruleDeleteMessage ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_CallMessage_0 = null;

        EObject this_NewMessage_1 = null;

        EObject this_ReturnMessage_2 = null;

        EObject this_DeleteMessage_3 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1097:28: ( (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_ReturnMessage_2= ruleReturnMessage | this_DeleteMessage_3= ruleDeleteMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1098:1: (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_ReturnMessage_2= ruleReturnMessage | this_DeleteMessage_3= ruleDeleteMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1098:1: (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_ReturnMessage_2= ruleReturnMessage | this_DeleteMessage_3= ruleDeleteMessage )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt26=1;
                }
                break;
            case 32:
                {
                alt26=2;
                }
                break;
            case 33:
                {
                alt26=3;
                }
                break;
            case 34:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1099:5: this_CallMessage_0= ruleCallMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getCallMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCallMessage_in_ruleMessage2344);
                    this_CallMessage_0=ruleCallMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CallMessage_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1109:5: this_NewMessage_1= ruleNewMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getNewMessageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewMessage_in_ruleMessage2371);
                    this_NewMessage_1=ruleNewMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewMessage_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1119:5: this_ReturnMessage_2= ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getReturnMessageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_ruleMessage2398);
                    this_ReturnMessage_2=ruleReturnMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnMessage_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1129:5: this_DeleteMessage_3= ruleDeleteMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getDeleteMessageParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteMessage_in_ruleMessage2425);
                    this_DeleteMessage_3=ruleDeleteMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeleteMessage_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleCallMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1145:1: entryRuleCallMessage returns [EObject current=null] : iv_ruleCallMessage= ruleCallMessage EOF ;
    public final EObject entryRuleCallMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1146:2: (iv_ruleCallMessage= ruleCallMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1147:2: iv_ruleCallMessage= ruleCallMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallMessageRule()); 
            }
            pushFollow(FOLLOW_ruleCallMessage_in_entryRuleCallMessage2460);
            iv_ruleCallMessage=ruleCallMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallMessage2470); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCallMessage"


    // $ANTLR start "ruleCallMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1154:1: ruleCallMessage returns [EObject current=null] : ( ( ( (lv_participant_0_0= RULE_ID ) ) otherlv_1= '.' )? ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? ) ;
    public final EObject ruleCallMessage() throws RecognitionException {
        EObject current = null;

        Token lv_participant_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameter_4_0 = null;

        EObject lv_parameter_6_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1157:28: ( ( ( ( (lv_participant_0_0= RULE_ID ) ) otherlv_1= '.' )? ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1158:1: ( ( ( (lv_participant_0_0= RULE_ID ) ) otherlv_1= '.' )? ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1158:1: ( ( ( (lv_participant_0_0= RULE_ID ) ) otherlv_1= '.' )? ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1158:2: ( ( (lv_participant_0_0= RULE_ID ) ) otherlv_1= '.' )? ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1158:2: ( ( (lv_participant_0_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1158:3: ( (lv_participant_0_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1158:3: ( (lv_participant_0_0= RULE_ID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1159:1: (lv_participant_0_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1159:1: (lv_participant_0_0= RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1160:3: lv_participant_0_0= RULE_ID
                    {
                    lv_participant_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallMessage2513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_participant_0_0, grammarAccess.getCallMessageAccess().getParticipantIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCallMessageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"participant",
                              		lv_participant_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleCallMessage2530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCallMessageAccess().getFullStopKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1180:3: ( ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1180:4: ( ( RULE_ID ) )=> (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1186:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1187:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallMessage2560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCallMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1203:2: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) && (synpred8_InternalSequencemodel())) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1203:3: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1203:3: ( ( '(' )=>otherlv_3= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1203:4: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleCallMessage2586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1208:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) && (synpred9_InternalSequencemodel())) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1208:3: ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1208:3: ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1208:4: ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1213:1: (lv_parameter_4_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1214:3: lv_parameter_4_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleCallMessage2619);
                            lv_parameter_4_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCallMessageRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameter",
                                      		lv_parameter_4_0, 
                                      		"Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1230:2: (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==19) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1230:4: otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCallMessage2632); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getCallMessageAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1234:1: ( (lv_parameter_6_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:1: (lv_parameter_6_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:1: (lv_parameter_6_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1236:3: lv_parameter_6_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleCallMessage2653);
                            	    lv_parameter_6_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getCallMessageRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameter",
                            	              		lv_parameter_6_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleCallMessage2669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCallMessage"


    // $ANTLR start "entryRuleNewMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1264:1: entryRuleNewMessage returns [EObject current=null] : iv_ruleNewMessage= ruleNewMessage EOF ;
    public final EObject entryRuleNewMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1265:2: (iv_ruleNewMessage= ruleNewMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1266:2: iv_ruleNewMessage= ruleNewMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewMessageRule()); 
            }
            pushFollow(FOLLOW_ruleNewMessage_in_entryRuleNewMessage2707);
            iv_ruleNewMessage=ruleNewMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMessage2717); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNewMessage"


    // $ANTLR start "ruleNewMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1273:1: ruleNewMessage returns [EObject current=null] : (otherlv_0= 'new' ( (lv_participant_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleNewMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_participant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1276:28: ( (otherlv_0= 'new' ( (lv_participant_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1277:1: (otherlv_0= 'new' ( (lv_participant_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1277:1: (otherlv_0= 'new' ( (lv_participant_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1277:3: otherlv_0= 'new' ( (lv_participant_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleNewMessage2754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewMessageAccess().getNewKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1281:1: ( (lv_participant_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1282:1: (lv_participant_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1282:1: (lv_participant_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1283:3: lv_participant_1_0= RULE_ID
            {
            lv_participant_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMessage2771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_participant_1_0, grammarAccess.getNewMessageAccess().getParticipantIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNewMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"participant",
                      		lv_participant_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1299:2: ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) && (synpred10_InternalSequencemodel())) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1299:3: ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1299:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1299:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleNewMessage2797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNewMessageAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1304:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) && (synpred11_InternalSequencemodel())) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1304:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1304:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1304:4: ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1309:1: (lv_parameter_3_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1310:3: lv_parameter_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleNewMessage2830);
                            lv_parameter_3_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNewMessageRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameter",
                                      		lv_parameter_3_0, 
                                      		"Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1326:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==19) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1326:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleNewMessage2843); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getNewMessageAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1330:1: ( (lv_parameter_5_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1331:1: (lv_parameter_5_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1331:1: (lv_parameter_5_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1332:3: lv_parameter_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleNewMessage2864);
                            	    lv_parameter_5_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getNewMessageRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameter",
                            	              		lv_parameter_5_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleNewMessage2880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNewMessageAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNewMessage"


    // $ANTLR start "entryRuleReturnMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1360:1: entryRuleReturnMessage returns [EObject current=null] : iv_ruleReturnMessage= ruleReturnMessage EOF ;
    public final EObject entryRuleReturnMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1361:2: (iv_ruleReturnMessage= ruleReturnMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1362:2: iv_ruleReturnMessage= ruleReturnMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnMessageRule()); 
            }
            pushFollow(FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage2918);
            iv_ruleReturnMessage=ruleReturnMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnMessage2928); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnMessage"


    // $ANTLR start "ruleReturnMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1369:1: ruleReturnMessage returns [EObject current=null] : (otherlv_0= 'return ' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleReturnMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_1_0 = null;

        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1372:28: ( (otherlv_0= 'return ' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1373:1: (otherlv_0= 'return ' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1373:1: (otherlv_0= 'return ' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1373:3: otherlv_0= 'return ' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleReturnMessage2965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnMessageAccess().getReturnKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1377:1: ( (lv_name_1_0= ruleReference ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1378:1: (lv_name_1_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1378:1: (lv_name_1_0= ruleReference )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1379:3: lv_name_1_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnMessageAccess().getNameReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleReturnMessage2986);
            lv_name_1_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnMessageRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Reference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1395:2: ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) && (synpred12_InternalSequencemodel())) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1395:3: ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1395:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1395:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleReturnMessage3007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReturnMessageAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1400:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) && (synpred13_InternalSequencemodel())) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1400:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1400:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1400:4: ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1405:1: (lv_parameter_3_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1406:3: lv_parameter_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleReturnMessage3040);
                            lv_parameter_3_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getReturnMessageRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameter",
                                      		lv_parameter_3_0, 
                                      		"Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1422:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==19) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1422:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleReturnMessage3053); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getReturnMessageAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1426:1: ( (lv_parameter_5_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1427:1: (lv_parameter_5_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1427:1: (lv_parameter_5_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1428:3: lv_parameter_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleReturnMessage3074);
                            	    lv_parameter_5_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getReturnMessageRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameter",
                            	              		lv_parameter_5_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleReturnMessage3090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReturnMessageAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReturnMessage"


    // $ANTLR start "entryRuleDeleteMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1456:1: entryRuleDeleteMessage returns [EObject current=null] : iv_ruleDeleteMessage= ruleDeleteMessage EOF ;
    public final EObject entryRuleDeleteMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1457:2: (iv_ruleDeleteMessage= ruleDeleteMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1458:2: iv_ruleDeleteMessage= ruleDeleteMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteMessageRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage3128);
            iv_ruleDeleteMessage=ruleDeleteMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteMessage3138); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeleteMessage"


    // $ANTLR start "ruleDeleteMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1465:1: ruleDeleteMessage returns [EObject current=null] : (otherlv_0= 'delete ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleDeleteMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1468:28: ( (otherlv_0= 'delete ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1469:1: (otherlv_0= 'delete ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1469:1: (otherlv_0= 'delete ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1469:3: otherlv_0= 'delete ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleDeleteMessage3175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteMessageAccess().getDeleteKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1473:1: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1474:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1474:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1475:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteMessage3192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDeleteMessageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1491:2: ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18) && (synpred14_InternalSequencemodel())) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1491:3: ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1491:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1491:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDeleteMessage3218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDeleteMessageAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1496:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) && (synpred15_InternalSequencemodel())) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1496:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1496:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1496:4: ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1501:1: (lv_parameter_3_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1502:3: lv_parameter_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleDeleteMessage3251);
                            lv_parameter_3_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDeleteMessageRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameter",
                                      		lv_parameter_3_0, 
                                      		"Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1518:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==19) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1518:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDeleteMessage3264); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getDeleteMessageAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1522:1: ( (lv_parameter_5_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1523:1: (lv_parameter_5_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1523:1: (lv_parameter_5_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1524:3: lv_parameter_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleDeleteMessage3285);
                            	    lv_parameter_5_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getDeleteMessageRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameter",
                            	              		lv_parameter_5_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleDeleteMessage3301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDeleteMessageAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeleteMessage"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1552:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1553:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1554:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3339);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3349); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1561:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1564:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1565:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1565:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1565:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1565:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1566:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1566:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1567:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1583:2: (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1583:4: otherlv_1= ':' ( (lv_type_2_0= ruleReference ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleParameter3409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1_0());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1587:1: ( (lv_type_2_0= ruleReference ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1588:1: (lv_type_2_0= ruleReference )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1588:1: (lv_type_2_0= ruleReference )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1589:3: lv_type_2_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleParameter3430);
                    lv_type_2_0=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"Reference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReference"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1613:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1614:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1615:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference3468);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference3478); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1622:1: ruleReference returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1625:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )* ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1626:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1626:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1626:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )*
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1626:2: ( (lv_type_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1627:1: (lv_type_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1627:1: (lv_type_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1628:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference3520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_0_0, grammarAccess.getReferenceAccess().getTypeIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1644:2: ( (lv_array_1_0= ruleArray ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==36) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1645:1: (lv_array_1_0= ruleArray )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1645:1: (lv_array_1_0= ruleArray )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1646:3: lv_array_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleReference3546);
            	    lv_array_1_0=ruleArray();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"array",
            	              		lv_array_1_0, 
            	              		"Array");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleArray"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1670:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1671:2: (iv_ruleArray= ruleArray EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1672:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3583);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3593); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1679:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1682:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1683:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1683:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1683:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']'
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1683:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1684:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayAccess().getArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleArray3639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1693:1: ( (lv_size_2_0= RULE_NATURAL ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_NATURAL) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1694:1: (lv_size_2_0= RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1694:1: (lv_size_2_0= RULE_NATURAL )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1695:3: lv_size_2_0= RULE_NATURAL
                    {
                    lv_size_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleArray3656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_size_2_0, grammarAccess.getArrayAccess().getSizeNATURALTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"size",
                              		lv_size_2_0, 
                              		"NATURAL");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleArray3674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleForeachExpression"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1723:1: entryRuleForeachExpression returns [String current=null] : iv_ruleForeachExpression= ruleForeachExpression EOF ;
    public final String entryRuleForeachExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForeachExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1727:2: (iv_ruleForeachExpression= ruleForeachExpression EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1728:2: iv_ruleForeachExpression= ruleForeachExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression3717);
            iv_ruleForeachExpression=ruleForeachExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeachExpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachExpression3728); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleForeachExpression"


    // $ANTLR start "ruleForeachExpression"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1738:1: ruleForeachExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleForeachExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_4=null;
        Token this_ID_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1742:28: ( (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1743:1: (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1743:1: (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1743:6: this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeachExpression3772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,38,FOLLOW_38_in_ruleForeachExpression3790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getForeachExpressionAccess().getInKeyword_1()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1756:1: ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_NATURAL) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1756:2: (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1756:2: (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1756:7: this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL
                    {
                    this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleForeachExpression3807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_2, grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_0()); 
                          
                    }
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleForeachExpression3825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getForeachExpressionAccess().getFullStopFullStopKeyword_2_0_1()); 
                          
                    }
                    this_NATURAL_4=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleForeachExpression3840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_4, grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1777:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeachExpression3867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_5, grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_2_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleForeachExpression"


    // $ANTLR start "entryRuleValueWithSpaces"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1795:1: entryRuleValueWithSpaces returns [String current=null] : iv_ruleValueWithSpaces= ruleValueWithSpaces EOF ;
    public final String entryRuleValueWithSpaces() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueWithSpaces = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1799:2: (iv_ruleValueWithSpaces= ruleValueWithSpaces EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1800:2: iv_ruleValueWithSpaces= ruleValueWithSpaces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueWithSpacesRule()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces3924);
            iv_ruleValueWithSpaces=ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueWithSpaces.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueWithSpaces3935); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleValueWithSpaces"


    // $ANTLR start "ruleValueWithSpaces"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1810:1: ruleValueWithSpaces returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )* ;
    public final AntlrDatatypeRuleToken ruleValueWithSpaces() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OPERATOR_0=null;
        Token this_ANY_OTHER_2=null;
        Token this_WS_3=null;
        AntlrDatatypeRuleToken this_Value_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1814:28: ( (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1815:1: (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )*
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1815:1: (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )*
            loop44:
            do {
                int alt44=5;
                switch ( input.LA(1) ) {
                case RULE_OPERATOR:
                    {
                    alt44=1;
                    }
                    break;
                case RULE_STRING:
                case RULE_ID:
                case RULE_NATURAL:
                case RULE_BOOLEAN:
                case RULE_NULL:
                case 41:
                    {
                    alt44=2;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt44=3;
                    }
                    break;
                case RULE_WS:
                    {
                    alt44=4;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1815:6: this_OPERATOR_0= RULE_OPERATOR
            	    {
            	    this_OPERATOR_0=(Token)match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_ruleValueWithSpaces3979); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_OPERATOR_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OPERATOR_0, grammarAccess.getValueWithSpacesAccess().getOPERATORTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1824:5: this_Value_1= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getValueWithSpacesAccess().getValueParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValueWithSpaces4012);
            	    this_Value_1=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Value_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1835:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleValueWithSpaces4038); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_2, grammarAccess.getValueWithSpacesAccess().getANY_OTHERTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1843:10: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleValueWithSpaces4064); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getValueWithSpacesAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleValueWithSpaces"


    // $ANTLR start "entryRuleAnnotation"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1861:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1862:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1863:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4114);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation4124); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1870:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1873:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1874:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1874:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1874:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleAnnotation4161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1878:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1879:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1879:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1880:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation4182);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:2: ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==18) && (synpred16_InternalSequencemodel())) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:3: ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAnnotation4203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1901:2: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1902:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1902:1: (lv_parameter_3_0= ruleParameter )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1903:3: lv_parameter_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4225);
                    lv_parameter_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameter",
                              		lv_parameter_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1919:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==19) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1919:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAnnotation4238); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1923:1: ( (lv_parameter_5_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1924:1: (lv_parameter_5_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1924:1: (lv_parameter_5_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1925:3: lv_parameter_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4259);
                    	    lv_parameter_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameter",
                    	              		lv_parameter_5_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleAnnotation4273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1957:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1958:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1959:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4316);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1966:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_BOOLEAN_3=null;
        Token this_NULL_4=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;

        AntlrDatatypeRuleToken this_ExtendedID_2 = null;

        AntlrDatatypeRuleToken this_Real_5 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1969:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1970:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1970:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt47=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_NATURAL) ) {
                    int LA47_2 = input.LA(3);

                    if ( (LA47_2==31) ) {
                        alt47=6;
                    }
                    else if ( (LA47_2==EOF||(LA47_2>=RULE_STRING && LA47_2<=RULE_NULL)||LA47_2==22||LA47_2==26||LA47_2==41) ) {
                        alt47=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==31) ) {
                    alt47=6;
                }
                else if ( (LA47_2==EOF||(LA47_2>=RULE_STRING && LA47_2<=RULE_NULL)||LA47_2==22||LA47_2==26||LA47_2==41) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt47=2;
                }
                break;
            case RULE_ID:
                {
                alt47=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt47=4;
                }
                break;
            case RULE_NULL:
                {
                alt47=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1971:5: this_Integer_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue4374);
                    this_Integer_0=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Integer_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1982:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1991:5: this_ExtendedID_2= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue4433);
                    this_ExtendedID_2=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2002:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue4459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2010:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue4485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2019:5: this_Real_5= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleValue4518);
                    this_Real_5=ruleReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Real_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleExtendedID"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2037:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2038:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2039:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID4564);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID4575); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2046:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2049:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2050:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2050:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2050:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID4615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2057:1: (kw= '.' this_ID_2= RULE_ID )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==31) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2058:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleExtendedID4634); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID4649); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleReal"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2080:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2081:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2082:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal4699);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal4710); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2089:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2092:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2093:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2093:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2093:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2093:2: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2094:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleReal4749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal4766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,31,FOLLOW_31_in_ruleReal4784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                  
            }
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal4799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2119:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=42 && LA52_0<=43)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2119:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2119:2: (kw= 'e' | kw= 'E' )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==42) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==43) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2120:2: kw= 'e'
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleReal4819); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2127:2: kw= 'E'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleReal4838); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2132:2: (kw= '+' | kw= '-' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==44) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==41) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2133:2: kw= '+'
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleReal4853); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2140:2: kw= '-'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleReal4872); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal4888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_8, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2160:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2161:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2162:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger4936);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger4947); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2169:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2172:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2173:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2173:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2173:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2173:2: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2174:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleInteger4986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger5003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInteger"

    // $ANTLR start synpred1_InternalSequencemodel
    public final void synpred1_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:198:4: ( 'sequence' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:198:6: 'sequence'
        {
        match(input,15,FOLLOW_15_in_synpred1_InternalSequencemodel364); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSequencemodel

    // $ANTLR start synpred2_InternalSequencemodel
    public final void synpred2_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:282:4: ( ( RULE_ID ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:283:1: ( RULE_ID )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:283:1: ( RULE_ID )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:284:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred2_InternalSequencemodel536); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSequencemodel

    // $ANTLR start synpred3_InternalSequencemodel
    public final void synpred3_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:428:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:428:6: '('
        {
        match(input,18,FOLLOW_18_in_synpred3_InternalSequencemodel848); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSequencemodel

    // $ANTLR start synpred4_InternalSequencemodel
    public final void synpred4_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:433:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:434:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:434:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:435:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred4_InternalSequencemodel872);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSequencemodel

    // $ANTLR start synpred5_InternalSequencemodel
    public final void synpred5_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:648:5: ( 'elsif' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:648:7: 'elsif'
        {
        match(input,23,FOLLOW_23_in_synpred5_InternalSequencemodel1353); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalSequencemodel

    // $ANTLR start synpred6_InternalSequencemodel
    public final void synpred6_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:693:7: ( 'else' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:693:9: 'else'
        {
        match(input,24,FOLLOW_24_in_synpred6_InternalSequencemodel1432); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalSequencemodel

    // $ANTLR start synpred7_InternalSequencemodel
    public final void synpred7_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1180:4: ( ( RULE_ID ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1181:1: ( RULE_ID )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1181:1: ( RULE_ID )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1182:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred7_InternalSequencemodel2546); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalSequencemodel

    // $ANTLR start synpred8_InternalSequencemodel
    public final void synpred8_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1203:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1203:6: '('
        {
        match(input,18,FOLLOW_18_in_synpred8_InternalSequencemodel2578); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalSequencemodel

    // $ANTLR start synpred9_InternalSequencemodel
    public final void synpred9_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1208:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1209:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1209:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1210:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred9_InternalSequencemodel2602);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalSequencemodel

    // $ANTLR start synpred10_InternalSequencemodel
    public final void synpred10_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1299:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1299:6: '('
        {
        match(input,18,FOLLOW_18_in_synpred10_InternalSequencemodel2789); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalSequencemodel

    // $ANTLR start synpred11_InternalSequencemodel
    public final void synpred11_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1304:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1305:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1305:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1306:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred11_InternalSequencemodel2813);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSequencemodel

    // $ANTLR start synpred12_InternalSequencemodel
    public final void synpred12_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1395:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1395:6: '('
        {
        match(input,18,FOLLOW_18_in_synpred12_InternalSequencemodel2999); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalSequencemodel

    // $ANTLR start synpred13_InternalSequencemodel
    public final void synpred13_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1400:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1401:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1401:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1402:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred13_InternalSequencemodel3023);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSequencemodel

    // $ANTLR start synpred14_InternalSequencemodel
    public final void synpred14_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1491:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1491:6: '('
        {
        match(input,18,FOLLOW_18_in_synpred14_InternalSequencemodel3210); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalSequencemodel

    // $ANTLR start synpred15_InternalSequencemodel
    public final void synpred15_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1496:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1497:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1497:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1498:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred15_InternalSequencemodel3234);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSequencemodel

    // $ANTLR start synpred16_InternalSequencemodel
    public final void synpred16_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:6: '('
        {
        match(input,18,FOLLOW_18_in_synpred16_InternalSequencemodel4195); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalSequencemodel

    // Delegated rules

    public final boolean synpred15_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA23_eotS =
        "\6\uffff";
    static final String DFA23_eofS =
        "\1\3\5\uffff";
    static final String DFA23_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\4";
    static final String DFA23_maxS =
        "\1\51\1\uffff\1\51\1\uffff\1\5\1\51";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\2\uffff";
    static final String DFA23_specialS =
        "\6\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\2\6\1\4\uffff\2\3\3\uffff\1\3\1\1\3\3\1\uffff\4\3\1"+
            "\uffff\3\3\6\uffff\1\1",
            "",
            "\1\1\1\2\6\1\4\uffff\3\3\2\uffff\1\3\1\1\3\3\1\uffff\4\3\1"+
            "\4\3\3\6\uffff\1\1",
            "",
            "\1\5",
            "\1\1\1\2\6\1\4\uffff\3\3\2\uffff\1\3\1\1\3\3\1\uffff\4\3\1"+
            "\1\3\3\6\uffff\1\1"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "958:1: ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?";
        }
    }
    static final String DFA25_eotS =
        "\6\uffff";
    static final String DFA25_eofS =
        "\1\3\5\uffff";
    static final String DFA25_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\5\1\4";
    static final String DFA25_maxS =
        "\1\51\1\uffff\1\51\1\uffff\1\5\1\51";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\2\uffff";
    static final String DFA25_specialS =
        "\6\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\2\6\1\4\uffff\2\3\3\uffff\1\3\1\1\3\3\1\uffff\4\3\1"+
            "\uffff\3\3\6\uffff\1\1",
            "",
            "\1\1\1\2\6\1\4\uffff\3\3\2\uffff\1\3\1\1\3\3\1\uffff\4\3\1"+
            "\4\3\3\6\uffff\1\1",
            "",
            "\1\5",
            "\1\1\1\2\6\1\4\uffff\3\3\2\uffff\1\3\1\1\3\3\1\uffff\4\3\1"+
            "\1\3\3\6\uffff\1\1"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1033:1: ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?";
        }
    }
    static final String DFA27_eotS =
        "\23\uffff";
    static final String DFA27_eofS =
        "\1\uffff\1\20\21\uffff";
    static final String DFA27_minS =
        "\2\5\21\uffff";
    static final String DFA27_maxS =
        "\1\5\1\42\21\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\1\20\2";
    static final String DFA27_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1",
            "\1\6\12\uffff\1\5\1\4\1\3\2\uffff\1\12\1\uffff\1\21\1\22\1"+
            "\13\1\uffff\1\15\1\14\1\16\1\17\1\2\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1158:2: ( ( (lv_participant_0_0= RULE_ID ) ) otherlv_1= '.' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_1==31) ) {s = 2;}

                        else if ( (LA27_1==18) && (synpred7_InternalSequencemodel())) {s = 3;}

                        else if ( (LA27_1==17) && (synpred7_InternalSequencemodel())) {s = 4;}

                        else if ( (LA27_1==16) && (synpred7_InternalSequencemodel())) {s = 5;}

                        else if ( (LA27_1==RULE_ID) && (synpred7_InternalSequencemodel())) {s = 6;}

                        else if ( (LA27_1==32) && (synpred7_InternalSequencemodel())) {s = 7;}

                        else if ( (LA27_1==33) && (synpred7_InternalSequencemodel())) {s = 8;}

                        else if ( (LA27_1==34) && (synpred7_InternalSequencemodel())) {s = 9;}

                        else if ( (LA27_1==21) && (synpred7_InternalSequencemodel())) {s = 10;}

                        else if ( (LA27_1==25) && (synpred7_InternalSequencemodel())) {s = 11;}

                        else if ( (LA27_1==28) && (synpred7_InternalSequencemodel())) {s = 12;}

                        else if ( (LA27_1==27) && (synpred7_InternalSequencemodel())) {s = 13;}

                        else if ( (LA27_1==29) && (synpred7_InternalSequencemodel())) {s = 14;}

                        else if ( (LA27_1==30) && (synpred7_InternalSequencemodel())) {s = 15;}

                        else if ( (LA27_1==EOF) && (synpred7_InternalSequencemodel())) {s = 16;}

                        else if ( (LA27_1==23) && (synpred7_InternalSequencemodel())) {s = 17;}

                        else if ( (LA27_1==24) && (synpred7_InternalSequencemodel())) {s = 18;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x000001000000C002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleModel153 = new BitSet(new long[]{0x0000010000008002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSequence351 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_15_in_ruleSequence372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequence390 = new BitSet(new long[]{0x0000010000010020L});
    public static final BitSet FOLLOW_ruleParticipant_in_ruleSequence416 = new BitSet(new long[]{0x0000010000010020L});
    public static final BitSet FOLLOW_16_in_ruleSequence429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleParticipant521 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParticipant550 = new BitSet(new long[]{0x000000077A230020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleParticipant576 = new BitSet(new long[]{0x000000077A230020L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_ruleParticipant598 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleParticipant611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleTransition704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_ruleTransition731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_entryRuleTransitionBlock766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionBlock776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTransitionBlock813 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransitionBlock830 = new BitSet(new long[]{0x000000077A250020L});
    public static final BitSet FOLLOW_18_in_ruleTransitionBlock856 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTransitionBlock889 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleTransitionBlock902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTransitionBlock923 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleTransitionBlock939 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTransitionBlock962 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_16_in_ruleTransitionBlock975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_ruleFragment1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_ruleFragment1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_ruleFragment1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_ruleFragment1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_ruleFragment1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_ruleFragment1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment1238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseFragment1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleIfElseFragment1285 = new BitSet(new long[]{0x0000020000400FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1306 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIfElseFragment1318 = new BitSet(new long[]{0x000000077BA10020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1339 = new BitSet(new long[]{0x000000077BA10020L});
    public static final BitSet FOLLOW_23_in_ruleIfElseFragment1361 = new BitSet(new long[]{0x0000020000400FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1383 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIfElseFragment1395 = new BitSet(new long[]{0x000000077BA10020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1416 = new BitSet(new long[]{0x000000077BA10020L});
    public static final BitSet FOLLOW_24_in_ruleIfElseFragment1440 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1462 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_16_in_ruleIfElseFragment1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment1513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachFragment1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleForeachFragment1560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_ruleForeachFragment1581 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleForeachFragment1593 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleForeachFragment1614 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_16_in_ruleForeachFragment1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopFragment1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLoopFragment1710 = new BitSet(new long[]{0x0000020004000FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleLoopFragment1731 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLoopFragment1743 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleLoopFragment1764 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_16_in_ruleLoopFragment1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment1813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertFragment1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAssertFragment1860 = new BitSet(new long[]{0x0000020000400FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleAssertFragment1881 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssertFragment1893 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAssertFragment1914 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_16_in_ruleAssertFragment1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment1963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakFragment1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBreakFragment2019 = new BitSet(new long[]{0x0000020000400FF2L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleBreakFragment2041 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBreakFragment2053 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleBreakFragment2074 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_16_in_ruleBreakFragment2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_entryRuleNextFragment2125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextFragment2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNextFragment2181 = new BitSet(new long[]{0x0000020000400FF2L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleNextFragment2203 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNextFragment2215 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleNextFragment2236 = new BitSet(new long[]{0x000000077A210020L});
    public static final BitSet FOLLOW_16_in_ruleNextFragment2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_ruleMessage2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_ruleMessage2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_ruleMessage2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_ruleMessage2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_entryRuleCallMessage2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallMessage2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallMessage2513 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCallMessage2530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallMessage2560 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleCallMessage2586 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCallMessage2619 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleCallMessage2632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCallMessage2653 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleCallMessage2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_entryRuleNewMessage2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMessage2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleNewMessage2754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMessage2771 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleNewMessage2797 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNewMessage2830 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleNewMessage2843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNewMessage2864 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleNewMessage2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage2918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnMessage2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleReturnMessage2965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleReturnMessage2986 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleReturnMessage3007 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReturnMessage3040 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleReturnMessage3053 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReturnMessage3074 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleReturnMessage3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage3128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteMessage3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDeleteMessage3175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteMessage3192 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDeleteMessage3218 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeleteMessage3251 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleDeleteMessage3264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeleteMessage3285 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleDeleteMessage3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3391 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleParameter3409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference3468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference3520 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleReference3546 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleArray3639 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleArray3656 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleArray3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression3717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachExpression3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeachExpression3772 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleForeachExpression3790 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleForeachExpression3807 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleForeachExpression3825 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleForeachExpression3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeachExpression3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces3924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueWithSpaces3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_ruleValueWithSpaces3979 = new BitSet(new long[]{0x0000020000000FF2L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueWithSpaces4012 = new BitSet(new long[]{0x0000020000000FF2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleValueWithSpaces4038 = new BitSet(new long[]{0x0000020000000FF2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleValueWithSpaces4064 = new BitSet(new long[]{0x0000020000000FF2L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAnnotation4161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation4182 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAnnotation4203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4225 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleAnnotation4238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4259 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleAnnotation4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID4564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID4615 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleExtendedID4634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID4649 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal4699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleReal4749 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal4766 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleReal4784 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal4799 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleReal4819 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_43_in_ruleReal4838 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_44_in_ruleReal4853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41_in_ruleReal4872 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger4936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInteger4986 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalSequencemodel364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred2_InternalSequencemodel536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred3_InternalSequencemodel848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred4_InternalSequencemodel872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalSequencemodel1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred6_InternalSequencemodel1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred7_InternalSequencemodel2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred8_InternalSequencemodel2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred9_InternalSequencemodel2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred10_InternalSequencemodel2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred11_InternalSequencemodel2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred12_InternalSequencemodel2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred13_InternalSequencemodel3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred14_InternalSequencemodel3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred15_InternalSequencemodel3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred16_InternalSequencemodel4195 = new BitSet(new long[]{0x0000000000000002L});

}
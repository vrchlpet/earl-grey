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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NATURAL", "RULE_OPERATOR", "RULE_ANY_OTHER", "RULE_WS", "RULE_BOOLEAN", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'import'", "'sequence'", "','", "'end'", "'if'", "'then'", "'elsif'", "'else'", "'foreach'", "'do'", "'while'", "'assert'", "'break'", "'next'", "'calls'", "'.'", "'('", "')'", "'creates'", "'returns'", "'destroys'", "'self'", "':'", "'['", "']'", "'in'", "'..'", "'@'", "'-'", "'e'", "'E'", "'+'"
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
    public static final int T__45=45;
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

                if ( (LA2_0==15||LA2_0==41) ) {
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:176:1: ruleSequence returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) (otherlv_4= ',' ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_participant_3_0 = null;

        EObject lv_participant_5_0 = null;

        EObject lv_transition_6_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:179:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) (otherlv_4= ',' ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) (otherlv_4= ',' ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) (otherlv_4= ',' ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) (otherlv_4= ',' ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==41) ) {
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:221:2: ( (lv_participant_3_0= ruleParticipant ) )
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:239:2: (otherlv_4= ',' ( (lv_participant_5_0= ruleParticipant ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:239:4: otherlv_4= ',' ( (lv_participant_5_0= ruleParticipant ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSequence429); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:243:1: ( (lv_participant_5_0= ruleParticipant ) )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:244:1: (lv_participant_5_0= ruleParticipant )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:244:1: (lv_participant_5_0= ruleParticipant )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:245:3: lv_participant_5_0= ruleParticipant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParticipant_in_ruleSequence450);
            	    lv_participant_5_0=ruleParticipant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"participant",
            	              		lv_participant_5_0, 
            	              		"Participant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:261:4: ( (lv_transition_6_0= ruleTransition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==18||LA5_0==22||(LA5_0>=24 && LA5_0<=28)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:262:1: (lv_transition_6_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:262:1: (lv_transition_6_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:263:3: lv_transition_6_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSequenceAccess().getTransitionTransitionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleSequence473);
            	    lv_transition_6_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transition",
            	              		lv_transition_6_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleSequence486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getSequenceAccess().getEndKeyword_6());
                  
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:291:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:292:2: (iv_ruleParticipant= ruleParticipant EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:293:2: iv_ruleParticipant= ruleParticipant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParticipantRule()); 
            }
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant522);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParticipant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant532); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:300:1: ruleParticipant returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:303:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:304:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:304:1: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:305:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:305:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:306:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParticipant573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParticipantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:330:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:331:2: (iv_ruleTransition= ruleTransition EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:332:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition613);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition623); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:339:1: ruleTransition returns [EObject current=null] : (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Fragment_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:342:28: ( (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:343:1: (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:343:1: (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==18||LA6_0==22||(LA6_0>=24 && LA6_0<=27)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:344:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleTransition670);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:354:5: this_Fragment_1= ruleFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionAccess().getFragmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFragment_in_ruleTransition697);
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


    // $ANTLR start "entryRuleFragment"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:370:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:371:2: (iv_ruleFragment= ruleFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:372:2: iv_ruleFragment= ruleFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment732);
            iv_ruleFragment=ruleFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment742); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:379:1: ruleFragment returns [EObject current=null] : (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:382:28: ( (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:383:1: (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:383:1: (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:384:5: this_IfElseFragment_0= ruleIfElseFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getIfElseFragmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfElseFragment_in_ruleFragment789);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:394:5: this_ForeachFragment_1= ruleForeachFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getForeachFragmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForeachFragment_in_ruleFragment816);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:404:5: this_AssertFragment_2= ruleAssertFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getAssertFragmentParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertFragment_in_ruleFragment843);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:414:5: this_LoopFragment_3= ruleLoopFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getLoopFragmentParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLoopFragment_in_ruleFragment870);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:424:5: this_BreakFragment_4= ruleBreakFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getBreakFragmentParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakFragment_in_ruleFragment897);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:434:5: this_NextFragment_5= ruleNextFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getNextFragmentParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNextFragment_in_ruleFragment924);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:450:1: entryRuleIfElseFragment returns [EObject current=null] : iv_ruleIfElseFragment= ruleIfElseFragment EOF ;
    public final EObject entryRuleIfElseFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:451:2: (iv_ruleIfElseFragment= ruleIfElseFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:452:2: iv_ruleIfElseFragment= ruleIfElseFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment959);
            iv_ruleIfElseFragment=ruleIfElseFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElseFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseFragment969); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:459:1: ruleIfElseFragment returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:462:28: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:463:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:463:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:463:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIfElseFragment1006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfElseFragmentAccess().getIfKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:467:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:468:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:468:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:469:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1027);
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleIfElseFragment1039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfElseFragmentAccess().getThenKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:489:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==18||LA8_0==22||(LA8_0>=24 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:490:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:490:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:491:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1060);
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
            	    break loop8;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:507:3: ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) && (synpred2_InternalSequencemodel())) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:507:4: ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )*
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:507:4: ( ( 'elsif' )=>otherlv_4= 'elsif' )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:507:5: ( 'elsif' )=>otherlv_4= 'elsif'
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleIfElseFragment1082); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getIfElseFragmentAccess().getElsifKeyword_4_0());
            	          
            	    }

            	    }

            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:512:2: ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:513:1: (lv_elseIfExpr_5_0= ruleValueWithSpaces )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:513:1: (lv_elseIfExpr_5_0= ruleValueWithSpaces )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:514:3: lv_elseIfExpr_5_0= ruleValueWithSpaces
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseIfExprValueWithSpacesParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1104);
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

            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleIfElseFragment1116); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getIfElseFragmentAccess().getThenKeyword_4_2());
            	          
            	    }
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:534:1: ( (lv_elseIftransition_7_0= ruleTransition ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID||LA9_0==18||LA9_0==22||(LA9_0>=24 && LA9_0<=28)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:535:1: (lv_elseIftransition_7_0= ruleTransition )
            	    	    {
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:535:1: (lv_elseIftransition_7_0= ruleTransition )
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:536:3: lv_elseIftransition_7_0= ruleTransition
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseIftransitionTransitionParserRuleCall_4_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1137);
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
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:552:5: ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) && (synpred3_InternalSequencemodel())) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:552:6: ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )*
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:552:6: ( ( 'else' )=>otherlv_8= 'else' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:552:7: ( 'else' )=>otherlv_8= 'else'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleIfElseFragment1161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getIfElseFragmentAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:557:2: ( (lv_elseTransition_9_0= ruleTransition ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==18||LA11_0==22||(LA11_0>=24 && LA11_0<=28)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:558:1: (lv_elseTransition_9_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:558:1: (lv_elseTransition_9_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:559:3: lv_elseTransition_9_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseTransitionTransitionParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1183);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleIfElseFragment1198); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:587:1: entryRuleForeachFragment returns [EObject current=null] : iv_ruleForeachFragment= ruleForeachFragment EOF ;
    public final EObject entryRuleForeachFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:588:2: (iv_ruleForeachFragment= ruleForeachFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:589:2: iv_ruleForeachFragment= ruleForeachFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment1234);
            iv_ruleForeachFragment=ruleForeachFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeachFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachFragment1244); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:596:1: ruleForeachFragment returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleForeachFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:599:28: ( (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:600:1: (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:600:1: (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:600:3: otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleForeachFragment1281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForeachFragmentAccess().getForeachKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:604:1: ( (lv_expr_1_0= ruleForeachExpression ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:605:1: (lv_expr_1_0= ruleForeachExpression )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:605:1: (lv_expr_1_0= ruleForeachExpression )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:606:3: lv_expr_1_0= ruleForeachExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachFragmentAccess().getExprForeachExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_ruleForeachFragment1302);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleForeachFragment1314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForeachFragmentAccess().getDoKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:626:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==18||LA13_0==22||(LA13_0>=24 && LA13_0<=28)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:627:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:627:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:628:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForeachFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleForeachFragment1335);
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
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleForeachFragment1348); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:656:1: entryRuleLoopFragment returns [EObject current=null] : iv_ruleLoopFragment= ruleLoopFragment EOF ;
    public final EObject entryRuleLoopFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:657:2: (iv_ruleLoopFragment= ruleLoopFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:658:2: iv_ruleLoopFragment= ruleLoopFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment1384);
            iv_ruleLoopFragment=ruleLoopFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopFragment1394); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:665:1: ruleLoopFragment returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleLoopFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:668:28: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:669:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:669:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:669:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleLoopFragment1431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopFragmentAccess().getWhileKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:673:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:674:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:674:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:675:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleLoopFragment1452);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleLoopFragment1464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLoopFragmentAccess().getDoKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:695:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==18||LA14_0==22||(LA14_0>=24 && LA14_0<=28)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:696:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:696:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:697:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLoopFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleLoopFragment1485);
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
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleLoopFragment1498); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:725:1: entryRuleAssertFragment returns [EObject current=null] : iv_ruleAssertFragment= ruleAssertFragment EOF ;
    public final EObject entryRuleAssertFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:726:2: (iv_ruleAssertFragment= ruleAssertFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:727:2: iv_ruleAssertFragment= ruleAssertFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment1534);
            iv_ruleAssertFragment=ruleAssertFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertFragment1544); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:734:1: ruleAssertFragment returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleAssertFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:737:28: ( (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:738:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:738:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:738:3: otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleAssertFragment1581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertFragmentAccess().getAssertKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:742:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:743:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:743:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:744:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleAssertFragment1602);
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAssertFragment1614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssertFragmentAccess().getThenKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:764:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==18||LA15_0==22||(LA15_0>=24 && LA15_0<=28)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:765:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:765:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:766:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleAssertFragment1635);
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
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleAssertFragment1648); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:794:1: entryRuleBreakFragment returns [EObject current=null] : iv_ruleBreakFragment= ruleBreakFragment EOF ;
    public final EObject entryRuleBreakFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:795:2: (iv_ruleBreakFragment= ruleBreakFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:796:2: iv_ruleBreakFragment= ruleBreakFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment1684);
            iv_ruleBreakFragment=ruleBreakFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakFragment1694); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:803:1: ruleBreakFragment returns [EObject current=null] : ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) ;
    public final EObject ruleBreakFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_expr_2_0 = null;

        EObject lv_transition_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:806:28: ( ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:807:1: ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:807:1: ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:807:2: () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:807:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:808:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakFragmentAccess().getBreakFragmentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleBreakFragment1740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakFragmentAccess().getBreakKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:817:1: ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||(LA17_0>=RULE_NATURAL && LA17_0<=RULE_NULL)||LA17_0==19||LA17_0==42) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                int LA17_2 = input.LA(2);

                if ( ((LA17_2>=RULE_STRING && LA17_2<=RULE_NULL)||LA17_2==19||LA17_2==29||LA17_2==42) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:817:2: ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:817:2: ( (lv_expr_2_0= ruleValueWithSpaces ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:818:1: (lv_expr_2_0= ruleValueWithSpaces )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:818:1: (lv_expr_2_0= ruleValueWithSpaces )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:819:3: lv_expr_2_0= ruleValueWithSpaces
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBreakFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleBreakFragment1762);
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

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBreakFragment1774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBreakFragmentAccess().getThenKeyword_2_1());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:839:1: ( (lv_transition_4_0= ruleTransition ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID||LA16_0==18||LA16_0==22||(LA16_0>=24 && LA16_0<=28)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:840:1: (lv_transition_4_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:840:1: (lv_transition_4_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:841:3: lv_transition_4_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBreakFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleBreakFragment1795);
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleBreakFragment1808); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:869:1: entryRuleNextFragment returns [EObject current=null] : iv_ruleNextFragment= ruleNextFragment EOF ;
    public final EObject entryRuleNextFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:870:2: (iv_ruleNextFragment= ruleNextFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:871:2: iv_ruleNextFragment= ruleNextFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleNextFragment_in_entryRuleNextFragment1846);
            iv_ruleNextFragment=ruleNextFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextFragment1856); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:878:1: ruleNextFragment returns [EObject current=null] : ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) ;
    public final EObject ruleNextFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_expr_2_0 = null;

        EObject lv_transition_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:881:28: ( ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:882:1: ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:882:1: ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:882:2: () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:882:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:883:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNextFragmentAccess().getNextFragmentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleNextFragment1902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNextFragmentAccess().getNextKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:892:1: ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING||(LA19_0>=RULE_NATURAL && LA19_0<=RULE_NULL)||LA19_0==19||LA19_0==42) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( ((LA19_2>=RULE_STRING && LA19_2<=RULE_NULL)||LA19_2==19||LA19_2==29||LA19_2==42) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:892:2: ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:892:2: ( (lv_expr_2_0= ruleValueWithSpaces ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:893:1: (lv_expr_2_0= ruleValueWithSpaces )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:893:1: (lv_expr_2_0= ruleValueWithSpaces )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:894:3: lv_expr_2_0= ruleValueWithSpaces
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNextFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleNextFragment1924);
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

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleNextFragment1936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNextFragmentAccess().getThenKeyword_2_1());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:914:1: ( (lv_transition_4_0= ruleTransition ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||LA18_0==18||LA18_0==22||(LA18_0>=24 && LA18_0<=28)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:915:1: (lv_transition_4_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:915:1: (lv_transition_4_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:916:3: lv_transition_4_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNextFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleNextFragment1957);
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
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleNextFragment1970); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:944:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:945:2: (iv_ruleMessage= ruleMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:946:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2008);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2018); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:953:1: ruleMessage returns [EObject current=null] : (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_DeleteMessage_2= ruleDeleteMessage | this_SelfMessage_3= ruleSelfMessage | this_FoundMessage_4= ruleFoundMessage ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_CallMessage_0 = null;

        EObject this_NewMessage_1 = null;

        EObject this_DeleteMessage_2 = null;

        EObject this_SelfMessage_3 = null;

        EObject this_FoundMessage_4 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:956:28: ( (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_DeleteMessage_2= ruleDeleteMessage | this_SelfMessage_3= ruleSelfMessage | this_FoundMessage_4= ruleFoundMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:957:1: (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_DeleteMessage_2= ruleDeleteMessage | this_SelfMessage_3= ruleSelfMessage | this_FoundMessage_4= ruleFoundMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:957:1: (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_DeleteMessage_2= ruleDeleteMessage | this_SelfMessage_3= ruleSelfMessage | this_FoundMessage_4= ruleFoundMessage )
            int alt20=5;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt20=3;
                    }
                    break;
                case 28:
                    {
                    alt20=1;
                    }
                    break;
                case 35:
                    {
                    alt20=4;
                    }
                    break;
                case 32:
                    {
                    alt20=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA20_0==28) ) {
                alt20=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:958:5: this_CallMessage_0= ruleCallMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getCallMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCallMessage_in_ruleMessage2065);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:968:5: this_NewMessage_1= ruleNewMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getNewMessageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewMessage_in_ruleMessage2092);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:978:5: this_DeleteMessage_2= ruleDeleteMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getDeleteMessageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteMessage_in_ruleMessage2119);
                    this_DeleteMessage_2=ruleDeleteMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeleteMessage_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:988:5: this_SelfMessage_3= ruleSelfMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getSelfMessageParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelfMessage_in_ruleMessage2146);
                    this_SelfMessage_3=ruleSelfMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfMessage_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:998:5: this_FoundMessage_4= ruleFoundMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFoundMessage_in_ruleMessage2173);
                    this_FoundMessage_4=ruleFoundMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FoundMessage_4; 
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


    // $ANTLR start "entryRuleFoundMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1014:1: entryRuleFoundMessage returns [EObject current=null] : iv_ruleFoundMessage= ruleFoundMessage EOF ;
    public final EObject entryRuleFoundMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoundMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1015:2: (iv_ruleFoundMessage= ruleFoundMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1016:2: iv_ruleFoundMessage= ruleFoundMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFoundMessageRule()); 
            }
            pushFollow(FOLLOW_ruleFoundMessage_in_entryRuleFoundMessage2208);
            iv_ruleFoundMessage=ruleFoundMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFoundMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFoundMessage2218); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFoundMessage"


    // $ANTLR start "ruleFoundMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1023:1: ruleFoundMessage returns [EObject current=null] : (otherlv_0= 'calls' ( ( (lv_targetParticipant_1_0= RULE_ID ) ) otherlv_2= '.' )? ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ) ;
    public final EObject ruleFoundMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetParticipant_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameter_5_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_return_9_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1026:28: ( (otherlv_0= 'calls' ( ( (lv_targetParticipant_1_0= RULE_ID ) ) otherlv_2= '.' )? ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1027:1: (otherlv_0= 'calls' ( ( (lv_targetParticipant_1_0= RULE_ID ) ) otherlv_2= '.' )? ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1027:1: (otherlv_0= 'calls' ( ( (lv_targetParticipant_1_0= RULE_ID ) ) otherlv_2= '.' )? ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1027:3: otherlv_0= 'calls' ( ( (lv_targetParticipant_1_0= RULE_ID ) ) otherlv_2= '.' )? ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleFoundMessage2255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFoundMessageAccess().getCallsKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1031:1: ( ( (lv_targetParticipant_1_0= RULE_ID ) ) otherlv_2= '.' )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1031:2: ( (lv_targetParticipant_1_0= RULE_ID ) ) otherlv_2= '.'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1031:2: ( (lv_targetParticipant_1_0= RULE_ID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1032:1: (lv_targetParticipant_1_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1032:1: (lv_targetParticipant_1_0= RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1033:3: lv_targetParticipant_1_0= RULE_ID
                    {
                    lv_targetParticipant_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFoundMessage2273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_targetParticipant_1_0, grammarAccess.getFoundMessageAccess().getTargetParticipantIDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFoundMessageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"targetParticipant",
                              		lv_targetParticipant_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleFoundMessage2290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFoundMessageAccess().getFullStopKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1053:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1053:4: ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1059:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1060:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFoundMessage2320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getFoundMessageAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFoundMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1076:2: ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) && (synpred5_InternalSequencemodel())) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1076:3: ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1076:3: ( ( '(' )=>otherlv_4= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1076:4: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleFoundMessage2346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1081:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) && (synpred6_InternalSequencemodel())) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1081:3: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1081:3: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1081:4: ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1086:1: (lv_parameter_5_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1087:3: lv_parameter_5_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFoundMessageAccess().getParameterParameterParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleFoundMessage2379);
                            lv_parameter_5_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFoundMessageRule());
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1103:2: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==16) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1103:4: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFoundMessage2392); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getFoundMessageAccess().getCommaKeyword_3_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1107:1: ( (lv_parameter_7_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1108:1: (lv_parameter_7_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1108:1: (lv_parameter_7_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1109:3: lv_parameter_7_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFoundMessageAccess().getParameterParameterParserRuleCall_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleFoundMessage2413);
                            	    lv_parameter_7_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFoundMessageRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameter",
                            	              		lv_parameter_7_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleFoundMessage2429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1129:3: ( (lv_return_9_0= ruleReturnMessage ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1130:1: (lv_return_9_0= ruleReturnMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1130:1: (lv_return_9_0= ruleReturnMessage )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1131:3: lv_return_9_0= ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFoundMessageAccess().getReturnReturnMessageParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_ruleFoundMessage2452);
                    lv_return_9_0=ruleReturnMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFoundMessageRule());
                      	        }
                             		set(
                             			current, 
                             			"return",
                              		lv_return_9_0, 
                              		"ReturnMessage");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleFoundMessage"


    // $ANTLR start "entryRuleCallMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1155:1: entryRuleCallMessage returns [EObject current=null] : iv_ruleCallMessage= ruleCallMessage EOF ;
    public final EObject entryRuleCallMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1156:2: (iv_ruleCallMessage= ruleCallMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1157:2: iv_ruleCallMessage= ruleCallMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallMessageRule()); 
            }
            pushFollow(FOLLOW_ruleCallMessage_in_entryRuleCallMessage2489);
            iv_ruleCallMessage=ruleCallMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallMessage2499); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1164:1: ruleCallMessage returns [EObject current=null] : ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'calls' ( ( (lv_targetParticipant_2_0= RULE_ID ) ) otherlv_3= '.' )? ( ( ( RULE_ID ) )=> (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )? ) ;
    public final EObject ruleCallMessage() throws RecognitionException {
        EObject current = null;

        Token lv_sourceParticipant_0_0=null;
        Token otherlv_1=null;
        Token lv_targetParticipant_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameter_6_0 = null;

        EObject lv_parameter_8_0 = null;

        EObject lv_return_10_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1167:28: ( ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'calls' ( ( (lv_targetParticipant_2_0= RULE_ID ) ) otherlv_3= '.' )? ( ( ( RULE_ID ) )=> (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1168:1: ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'calls' ( ( (lv_targetParticipant_2_0= RULE_ID ) ) otherlv_3= '.' )? ( ( ( RULE_ID ) )=> (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1168:1: ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'calls' ( ( (lv_targetParticipant_2_0= RULE_ID ) ) otherlv_3= '.' )? ( ( ( RULE_ID ) )=> (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1168:2: ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'calls' ( ( (lv_targetParticipant_2_0= RULE_ID ) ) otherlv_3= '.' )? ( ( ( RULE_ID ) )=> (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1168:2: ( (lv_sourceParticipant_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1169:1: (lv_sourceParticipant_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1169:1: (lv_sourceParticipant_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1170:3: lv_sourceParticipant_0_0= RULE_ID
            {
            lv_sourceParticipant_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallMessage2541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_sourceParticipant_0_0, grammarAccess.getCallMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCallMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"sourceParticipant",
                      		lv_sourceParticipant_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCallMessage2558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCallMessageAccess().getCallsKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1190:1: ( ( (lv_targetParticipant_2_0= RULE_ID ) ) otherlv_3= '.' )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1190:2: ( (lv_targetParticipant_2_0= RULE_ID ) ) otherlv_3= '.'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1190:2: ( (lv_targetParticipant_2_0= RULE_ID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1191:1: (lv_targetParticipant_2_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1191:1: (lv_targetParticipant_2_0= RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1192:3: lv_targetParticipant_2_0= RULE_ID
                    {
                    lv_targetParticipant_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallMessage2576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_targetParticipant_2_0, grammarAccess.getCallMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCallMessageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"targetParticipant",
                              		lv_targetParticipant_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCallMessage2593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCallMessageAccess().getFullStopKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1212:3: ( ( ( RULE_ID ) )=> (lv_name_4_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1212:4: ( ( RULE_ID ) )=> (lv_name_4_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1218:1: (lv_name_4_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1219:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallMessage2623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCallMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:2: ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) && (synpred8_InternalSequencemodel())) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:3: ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:3: ( ( '(' )=>otherlv_5= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:4: ( '(' )=>otherlv_5= '('
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleCallMessage2649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1240:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID) && (synpred9_InternalSequencemodel())) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1240:3: ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1240:3: ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1240:4: ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1245:1: (lv_parameter_6_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1246:3: lv_parameter_6_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleCallMessage2682);
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1262:2: (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==16) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1262:4: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                            	    {
                            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCallMessage2695); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getCallMessageAccess().getCommaKeyword_4_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1266:1: ( (lv_parameter_8_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1267:1: (lv_parameter_8_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1267:1: (lv_parameter_8_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1268:3: lv_parameter_8_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_4_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleCallMessage2716);
                            	    lv_parameter_8_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getCallMessageRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameter",
                            	              		lv_parameter_8_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleCallMessage2732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1288:3: ( (lv_return_10_0= ruleReturnMessage ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1289:1: (lv_return_10_0= ruleReturnMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1289:1: (lv_return_10_0= ruleReturnMessage )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1290:3: lv_return_10_0= ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallMessageAccess().getReturnReturnMessageParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_ruleCallMessage2755);
                    lv_return_10_0=ruleReturnMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCallMessageRule());
                      	        }
                             		set(
                             			current, 
                             			"return",
                              		lv_return_10_0, 
                              		"ReturnMessage");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleCallMessage"


    // $ANTLR start "entryRuleNewMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1314:1: entryRuleNewMessage returns [EObject current=null] : iv_ruleNewMessage= ruleNewMessage EOF ;
    public final EObject entryRuleNewMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1315:2: (iv_ruleNewMessage= ruleNewMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1316:2: iv_ruleNewMessage= ruleNewMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewMessageRule()); 
            }
            pushFollow(FOLLOW_ruleNewMessage_in_entryRuleNewMessage2792);
            iv_ruleNewMessage=ruleNewMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMessage2802); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1323:1: ruleNewMessage returns [EObject current=null] : ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'creates' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? ) ;
    public final EObject ruleNewMessage() throws RecognitionException {
        EObject current = null;

        Token lv_sourceParticipant_0_0=null;
        Token otherlv_1=null;
        Token lv_targetParticipant_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameter_4_0 = null;

        EObject lv_parameter_6_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1326:28: ( ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'creates' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1327:1: ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'creates' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1327:1: ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'creates' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1327:2: ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'creates' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1327:2: ( (lv_sourceParticipant_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1328:1: (lv_sourceParticipant_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1328:1: (lv_sourceParticipant_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1329:3: lv_sourceParticipant_0_0= RULE_ID
            {
            lv_sourceParticipant_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMessage2844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_sourceParticipant_0_0, grammarAccess.getNewMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNewMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"sourceParticipant",
                      		lv_sourceParticipant_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleNewMessage2861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNewMessageAccess().getCreatesKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1349:1: ( (lv_targetParticipant_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1350:1: (lv_targetParticipant_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1350:1: (lv_targetParticipant_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1351:3: lv_targetParticipant_2_0= RULE_ID
            {
            lv_targetParticipant_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMessage2878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_targetParticipant_2_0, grammarAccess.getNewMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNewMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"targetParticipant",
                      		lv_targetParticipant_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1367:2: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) && (synpred10_InternalSequencemodel())) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1367:3: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1367:3: ( ( '(' )=>otherlv_3= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1367:4: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleNewMessage2904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNewMessageAccess().getLeftParenthesisKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1372:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) && (synpred11_InternalSequencemodel())) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1372:3: ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1372:3: ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1372:4: ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1377:1: (lv_parameter_4_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1378:3: lv_parameter_4_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleNewMessage2937);
                            lv_parameter_4_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNewMessageRule());
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1394:2: (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==16) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1394:4: otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleNewMessage2950); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getNewMessageAccess().getCommaKeyword_3_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1398:1: ( (lv_parameter_6_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1399:1: (lv_parameter_6_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1399:1: (lv_parameter_6_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1400:3: lv_parameter_6_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleNewMessage2971);
                            	    lv_parameter_6_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getNewMessageRule());
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
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleNewMessage2987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNewMessageAccess().getRightParenthesisKeyword_3_2());
                          
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1428:1: entryRuleReturnMessage returns [EObject current=null] : iv_ruleReturnMessage= ruleReturnMessage EOF ;
    public final EObject entryRuleReturnMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1429:2: (iv_ruleReturnMessage= ruleReturnMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1430:2: iv_ruleReturnMessage= ruleReturnMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnMessageRule()); 
            }
            pushFollow(FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage3025);
            iv_ruleReturnMessage=ruleReturnMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnMessage3035); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1437:1: ruleReturnMessage returns [EObject current=null] : (otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1440:28: ( (otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1441:1: (otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1441:1: (otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1441:3: otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleReturnMessage3072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnMessageAccess().getReturnsKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1445:1: ( (lv_name_1_0= ruleReference ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1446:1: (lv_name_1_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1446:1: (lv_name_1_0= ruleReference )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1447:3: lv_name_1_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnMessageAccess().getNameReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleReturnMessage3093);
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1463:2: ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) && (synpred12_InternalSequencemodel())) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1463:3: ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1463:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1463:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleReturnMessage3114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReturnMessageAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1468:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) && (synpred13_InternalSequencemodel())) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1468:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1468:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1468:4: ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1473:1: (lv_parameter_3_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1474:3: lv_parameter_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleReturnMessage3147);
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1490:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==16) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1490:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleReturnMessage3160); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getReturnMessageAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1494:1: ( (lv_parameter_5_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1495:1: (lv_parameter_5_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1495:1: (lv_parameter_5_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1496:3: lv_parameter_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleReturnMessage3181);
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

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleReturnMessage3197); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1524:1: entryRuleDeleteMessage returns [EObject current=null] : iv_ruleDeleteMessage= ruleDeleteMessage EOF ;
    public final EObject entryRuleDeleteMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1525:2: (iv_ruleDeleteMessage= ruleDeleteMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1526:2: iv_ruleDeleteMessage= ruleDeleteMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteMessageRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage3235);
            iv_ruleDeleteMessage=ruleDeleteMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteMessage3245); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1533:1: ruleDeleteMessage returns [EObject current=null] : ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'destroys' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? ) ;
    public final EObject ruleDeleteMessage() throws RecognitionException {
        EObject current = null;

        Token lv_sourceParticipant_0_0=null;
        Token otherlv_1=null;
        Token lv_targetParticipant_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameter_4_0 = null;

        EObject lv_parameter_6_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1536:28: ( ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'destroys' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1537:1: ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'destroys' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1537:1: ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'destroys' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1537:2: ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'destroys' ( (lv_targetParticipant_2_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1537:2: ( (lv_sourceParticipant_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1538:1: (lv_sourceParticipant_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1538:1: (lv_sourceParticipant_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1539:3: lv_sourceParticipant_0_0= RULE_ID
            {
            lv_sourceParticipant_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteMessage3287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_sourceParticipant_0_0, grammarAccess.getDeleteMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"sourceParticipant",
                      		lv_sourceParticipant_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDeleteMessage3304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteMessageAccess().getDestroysKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1559:1: ( (lv_targetParticipant_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1560:1: (lv_targetParticipant_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1560:1: (lv_targetParticipant_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1561:3: lv_targetParticipant_2_0= RULE_ID
            {
            lv_targetParticipant_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteMessage3321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_targetParticipant_2_0, grammarAccess.getDeleteMessageAccess().getTargetParticipantIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"targetParticipant",
                      		lv_targetParticipant_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1577:2: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) && (synpred14_InternalSequencemodel())) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1577:3: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1577:3: ( ( '(' )=>otherlv_3= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1577:4: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDeleteMessage3347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteMessageAccess().getLeftParenthesisKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1582:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) && (synpred15_InternalSequencemodel())) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1582:3: ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1582:3: ( ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1582:4: ( ( ruleParameter ) )=> (lv_parameter_4_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1587:1: (lv_parameter_4_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1588:3: lv_parameter_4_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleDeleteMessage3380);
                            lv_parameter_4_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDeleteMessageRule());
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1604:2: (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==16) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1604:4: otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDeleteMessage3393); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getDeleteMessageAccess().getCommaKeyword_3_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1608:1: ( (lv_parameter_6_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1609:1: (lv_parameter_6_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1609:1: (lv_parameter_6_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1610:3: lv_parameter_6_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleDeleteMessage3414);
                            	    lv_parameter_6_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getDeleteMessageRule());
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
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleDeleteMessage3430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDeleteMessageAccess().getRightParenthesisKeyword_3_2());
                          
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


    // $ANTLR start "entryRuleSelfMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1638:1: entryRuleSelfMessage returns [EObject current=null] : iv_ruleSelfMessage= ruleSelfMessage EOF ;
    public final EObject entryRuleSelfMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1639:2: (iv_ruleSelfMessage= ruleSelfMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1640:2: iv_ruleSelfMessage= ruleSelfMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfMessageRule()); 
            }
            pushFollow(FOLLOW_ruleSelfMessage_in_entryRuleSelfMessage3468);
            iv_ruleSelfMessage=ruleSelfMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfMessage3478); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelfMessage"


    // $ANTLR start "ruleSelfMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1647:1: ruleSelfMessage returns [EObject current=null] : ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ) ;
    public final EObject ruleSelfMessage() throws RecognitionException {
        EObject current = null;

        Token lv_sourceParticipant_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameter_5_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_return_9_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1650:28: ( ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1651:1: ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1651:1: ( ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1651:2: ( (lv_sourceParticipant_0_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1651:2: ( (lv_sourceParticipant_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1652:1: (lv_sourceParticipant_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1652:1: (lv_sourceParticipant_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1653:3: lv_sourceParticipant_0_0= RULE_ID
            {
            lv_sourceParticipant_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelfMessage3520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_sourceParticipant_0_0, grammarAccess.getSelfMessageAccess().getSourceParticipantIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelfMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"sourceParticipant",
                      		lv_sourceParticipant_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleSelfMessage3537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfMessageAccess().getSelfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleSelfMessage3549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSelfMessageAccess().getFullStopKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1677:1: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1678:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1678:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1679:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelfMessage3566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getSelfMessageAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelfMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1695:2: ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) && (synpred16_InternalSequencemodel())) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1695:3: ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1695:3: ( ( '(' )=>otherlv_4= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1695:4: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleSelfMessage3592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSelfMessageAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1700:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) && (synpred17_InternalSequencemodel())) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1700:3: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1700:3: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1700:4: ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1705:1: (lv_parameter_5_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1706:3: lv_parameter_5_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelfMessageAccess().getParameterParameterParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleSelfMessage3625);
                            lv_parameter_5_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelfMessageRule());
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1722:2: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==16) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1722:4: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSelfMessage3638); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getSelfMessageAccess().getCommaKeyword_4_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1726:1: ( (lv_parameter_7_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1727:1: (lv_parameter_7_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1727:1: (lv_parameter_7_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1728:3: lv_parameter_7_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSelfMessageAccess().getParameterParameterParserRuleCall_4_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleSelfMessage3659);
                            	    lv_parameter_7_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSelfMessageRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameter",
                            	              		lv_parameter_7_0, 
                            	              		"Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleSelfMessage3675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelfMessageAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1748:3: ( (lv_return_9_0= ruleReturnMessage ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1749:1: (lv_return_9_0= ruleReturnMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1749:1: (lv_return_9_0= ruleReturnMessage )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1750:3: lv_return_9_0= ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelfMessageAccess().getReturnReturnMessageParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_ruleSelfMessage3698);
                    lv_return_9_0=ruleReturnMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelfMessageRule());
                      	        }
                             		set(
                             			current, 
                             			"return",
                              		lv_return_9_0, 
                              		"ReturnMessage");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleSelfMessage"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1774:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1775:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1776:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3735);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3745); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1783:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1786:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1788:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1788:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1789:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3787); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1805:2: (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==36) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1805:4: otherlv_1= ':' ( (lv_type_2_0= ruleReference ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleParameter3805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1_0());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1809:1: ( (lv_type_2_0= ruleReference ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1810:1: (lv_type_2_0= ruleReference )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1810:1: (lv_type_2_0= ruleReference )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1811:3: lv_type_2_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleParameter3826);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1835:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1836:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1837:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference3864);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference3874); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1844:1: ruleReference returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1847:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )* ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1848:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1848:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1848:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArray ) )*
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1848:2: ( (lv_type_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1849:1: (lv_type_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1849:1: (lv_type_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1850:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference3916); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1866:2: ( (lv_array_1_0= ruleArray ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==37) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1867:1: (lv_array_1_0= ruleArray )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1867:1: (lv_array_1_0= ruleArray )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1868:3: lv_array_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleReference3942);
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
            	    break loop45;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1892:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1893:2: (iv_ruleArray= ruleArray EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1894:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3979);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3989); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1901:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1904:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1905:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1905:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1905:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']'
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1905:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1906:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayAccess().getArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleArray4035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1915:1: ( (lv_size_2_0= RULE_NATURAL ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_NATURAL) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1916:1: (lv_size_2_0= RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1916:1: (lv_size_2_0= RULE_NATURAL )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1917:3: lv_size_2_0= RULE_NATURAL
                    {
                    lv_size_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleArray4052); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleArray4070); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1945:1: entryRuleForeachExpression returns [String current=null] : iv_ruleForeachExpression= ruleForeachExpression EOF ;
    public final String entryRuleForeachExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForeachExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1949:2: (iv_ruleForeachExpression= ruleForeachExpression EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1950:2: iv_ruleForeachExpression= ruleForeachExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression4113);
            iv_ruleForeachExpression=ruleForeachExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeachExpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachExpression4124); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1960:1: ruleForeachExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1964:28: ( (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1965:1: (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1965:1: (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1965:6: this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeachExpression4168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,39,FOLLOW_39_in_ruleForeachExpression4186); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getForeachExpressionAccess().getInKeyword_1()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1978:1: ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_NATURAL) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1978:2: (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1978:2: (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1978:7: this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL
                    {
                    this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleForeachExpression4203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_2, grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_0()); 
                          
                    }
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleForeachExpression4221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getForeachExpressionAccess().getFullStopFullStopKeyword_2_0_1()); 
                          
                    }
                    this_NATURAL_4=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleForeachExpression4236); if (state.failed) return current;
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1999:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeachExpression4263); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2017:1: entryRuleValueWithSpaces returns [String current=null] : iv_ruleValueWithSpaces= ruleValueWithSpaces EOF ;
    public final String entryRuleValueWithSpaces() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueWithSpaces = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2021:2: (iv_ruleValueWithSpaces= ruleValueWithSpaces EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2022:2: iv_ruleValueWithSpaces= ruleValueWithSpaces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueWithSpacesRule()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces4320);
            iv_ruleValueWithSpaces=ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueWithSpaces.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueWithSpaces4331); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2032:1: ruleValueWithSpaces returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )* ;
    public final AntlrDatatypeRuleToken ruleValueWithSpaces() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OPERATOR_0=null;
        Token this_ANY_OTHER_2=null;
        Token this_WS_3=null;
        AntlrDatatypeRuleToken this_Value_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2036:28: ( (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2037:1: (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )*
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2037:1: (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )*
            loop48:
            do {
                int alt48=5;
                switch ( input.LA(1) ) {
                case RULE_OPERATOR:
                    {
                    alt48=1;
                    }
                    break;
                case RULE_STRING:
                case RULE_ID:
                case RULE_NATURAL:
                case RULE_BOOLEAN:
                case RULE_NULL:
                case 42:
                    {
                    alt48=2;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt48=3;
                    }
                    break;
                case RULE_WS:
                    {
                    alt48=4;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2037:6: this_OPERATOR_0= RULE_OPERATOR
            	    {
            	    this_OPERATOR_0=(Token)match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_ruleValueWithSpaces4375); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_OPERATOR_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OPERATOR_0, grammarAccess.getValueWithSpacesAccess().getOPERATORTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2046:5: this_Value_1= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getValueWithSpacesAccess().getValueParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValueWithSpaces4408);
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
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2057:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleValueWithSpaces4434); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_2, grammarAccess.getValueWithSpacesAccess().getANY_OTHERTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2065:10: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleValueWithSpaces4460); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getValueWithSpacesAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2083:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2084:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2085:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4510);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation4520); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2092:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2095:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2096:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2096:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2096:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleAnnotation4557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2100:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2101:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2101:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2102:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation4578);
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2118:2: ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) && (synpred18_InternalSequencemodel())) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2118:3: ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2118:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2118:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleAnnotation4599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2123:2: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2124:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2124:1: (lv_parameter_3_0= ruleParameter )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2125:3: lv_parameter_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4621);
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

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2141:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==16) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2141:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation4634); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2145:1: ( (lv_parameter_5_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2146:1: (lv_parameter_5_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2146:1: (lv_parameter_5_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2147:3: lv_parameter_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4655);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAnnotation4669); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2179:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2180:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2181:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4712);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4723); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2188:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2191:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2192:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2192:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_NATURAL) ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2==29) ) {
                        alt51=6;
                    }
                    else if ( (LA51_2==EOF||(LA51_2>=RULE_STRING && LA51_2<=RULE_NULL)||LA51_2==19||LA51_2==23||LA51_2==42) ) {
                        alt51=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==29) ) {
                    alt51=6;
                }
                else if ( (LA51_2==EOF||(LA51_2>=RULE_STRING && LA51_2<=RULE_NULL)||LA51_2==19||LA51_2==23||LA51_2==42) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt51=2;
                }
                break;
            case RULE_ID:
                {
                alt51=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt51=4;
                }
                break;
            case RULE_NULL:
                {
                alt51=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2193:5: this_Integer_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue4770);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2204:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2213:5: this_ExtendedID_2= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue4829);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2224:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue4855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2232:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue4881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2241:5: this_Real_5= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleValue4914);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2259:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2260:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2261:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID4960);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID4971); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2268:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2271:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2272:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2272:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2272:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID5011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2279:1: (kw= '.' this_ID_2= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==29) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2280:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleExtendedID5030); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID5045); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2302:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2303:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2304:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal5095);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal5106); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2311:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2314:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2315:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2315:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2315:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2315:2: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2316:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleReal5145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,29,FOLLOW_29_in_ruleReal5180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                  
            }
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2341:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=43 && LA56_0<=44)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2341:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2341:2: (kw= 'e' | kw= 'E' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==43) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==44) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2342:2: kw= 'e'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleReal5215); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2349:2: kw= 'E'
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleReal5234); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2354:2: (kw= '+' | kw= '-' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==45) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==42) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2355:2: kw= '+'
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleReal5249); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2362:2: kw= '-'
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleReal5268); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5284); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2382:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2383:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2384:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger5332);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger5343); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2391:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2394:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2395:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2395:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2395:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2395:2: (kw= '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==42) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2396:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleInteger5382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger5399); if (state.failed) return current;
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
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:507:5: ( 'elsif' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:507:7: 'elsif'
        {
        match(input,20,FOLLOW_20_in_synpred2_InternalSequencemodel1074); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSequencemodel

    // $ANTLR start synpred3_InternalSequencemodel
    public final void synpred3_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:552:7: ( 'else' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:552:9: 'else'
        {
        match(input,21,FOLLOW_21_in_synpred3_InternalSequencemodel1153); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSequencemodel

    // $ANTLR start synpred4_InternalSequencemodel
    public final void synpred4_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1053:4: ( ( RULE_ID ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1054:1: ( RULE_ID )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1054:1: ( RULE_ID )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1055:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred4_InternalSequencemodel2306); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSequencemodel

    // $ANTLR start synpred5_InternalSequencemodel
    public final void synpred5_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1076:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1076:6: '('
        {
        match(input,30,FOLLOW_30_in_synpred5_InternalSequencemodel2338); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalSequencemodel

    // $ANTLR start synpred6_InternalSequencemodel
    public final void synpred6_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1081:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1082:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1082:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1083:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred6_InternalSequencemodel2362);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalSequencemodel

    // $ANTLR start synpred7_InternalSequencemodel
    public final void synpred7_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1212:4: ( ( RULE_ID ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1213:1: ( RULE_ID )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1213:1: ( RULE_ID )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1214:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred7_InternalSequencemodel2609); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalSequencemodel

    // $ANTLR start synpred8_InternalSequencemodel
    public final void synpred8_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:6: '('
        {
        match(input,30,FOLLOW_30_in_synpred8_InternalSequencemodel2641); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalSequencemodel

    // $ANTLR start synpred9_InternalSequencemodel
    public final void synpred9_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1240:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1241:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1241:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1242:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred9_InternalSequencemodel2665);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalSequencemodel

    // $ANTLR start synpred10_InternalSequencemodel
    public final void synpred10_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1367:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1367:6: '('
        {
        match(input,30,FOLLOW_30_in_synpred10_InternalSequencemodel2896); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalSequencemodel

    // $ANTLR start synpred11_InternalSequencemodel
    public final void synpred11_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1372:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1373:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1373:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1374:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred11_InternalSequencemodel2920);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSequencemodel

    // $ANTLR start synpred12_InternalSequencemodel
    public final void synpred12_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1463:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1463:6: '('
        {
        match(input,30,FOLLOW_30_in_synpred12_InternalSequencemodel3106); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalSequencemodel

    // $ANTLR start synpred13_InternalSequencemodel
    public final void synpred13_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1468:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1469:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1469:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1470:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred13_InternalSequencemodel3130);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSequencemodel

    // $ANTLR start synpred14_InternalSequencemodel
    public final void synpred14_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1577:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1577:6: '('
        {
        match(input,30,FOLLOW_30_in_synpred14_InternalSequencemodel3339); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalSequencemodel

    // $ANTLR start synpred15_InternalSequencemodel
    public final void synpred15_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1582:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1583:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1583:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1584:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred15_InternalSequencemodel3363);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSequencemodel

    // $ANTLR start synpred16_InternalSequencemodel
    public final void synpred16_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1695:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1695:6: '('
        {
        match(input,30,FOLLOW_30_in_synpred16_InternalSequencemodel3584); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalSequencemodel

    // $ANTLR start synpred17_InternalSequencemodel
    public final void synpred17_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1700:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1701:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1701:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1702:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred17_InternalSequencemodel3608);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalSequencemodel

    // $ANTLR start synpred18_InternalSequencemodel
    public final void synpred18_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2118:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2118:6: '('
        {
        match(input,30,FOLLOW_30_in_synpred18_InternalSequencemodel4591); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSequencemodel

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
    public final boolean synpred18_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSequencemodel_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSequencemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA21_eotS =
        "\21\uffff";
    static final String DFA21_eofS =
        "\1\uffff\1\15\17\uffff";
    static final String DFA21_minS =
        "\2\5\17\uffff";
    static final String DFA21_maxS =
        "\1\5\1\41\17\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\16\2\1\1";
    static final String DFA21_specialS =
        "\1\uffff\1\0\17\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\1\5\13\uffff\1\4\1\7\1\uffff\1\16\1\17\1\10\1\uffff\1\12"+
            "\1\11\1\13\1\14\1\6\1\20\1\2\2\uffff\1\3",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1031:1: ( ( (lv_targetParticipant_1_0= RULE_ID ) ) otherlv_2= '.' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_1==30) && (synpred4_InternalSequencemodel())) {s = 2;}

                        else if ( (LA21_1==33) && (synpred4_InternalSequencemodel())) {s = 3;}

                        else if ( (LA21_1==17) && (synpred4_InternalSequencemodel())) {s = 4;}

                        else if ( (LA21_1==RULE_ID) && (synpred4_InternalSequencemodel())) {s = 5;}

                        else if ( (LA21_1==28) && (synpred4_InternalSequencemodel())) {s = 6;}

                        else if ( (LA21_1==18) && (synpred4_InternalSequencemodel())) {s = 7;}

                        else if ( (LA21_1==22) && (synpred4_InternalSequencemodel())) {s = 8;}

                        else if ( (LA21_1==25) && (synpred4_InternalSequencemodel())) {s = 9;}

                        else if ( (LA21_1==24) && (synpred4_InternalSequencemodel())) {s = 10;}

                        else if ( (LA21_1==26) && (synpred4_InternalSequencemodel())) {s = 11;}

                        else if ( (LA21_1==27) && (synpred4_InternalSequencemodel())) {s = 12;}

                        else if ( (LA21_1==EOF) && (synpred4_InternalSequencemodel())) {s = 13;}

                        else if ( (LA21_1==20) && (synpred4_InternalSequencemodel())) {s = 14;}

                        else if ( (LA21_1==21) && (synpred4_InternalSequencemodel())) {s = 15;}

                        else if ( (LA21_1==29) ) {s = 16;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\21\uffff";
    static final String DFA26_eofS =
        "\1\uffff\1\15\17\uffff";
    static final String DFA26_minS =
        "\2\5\17\uffff";
    static final String DFA26_maxS =
        "\1\5\1\41\17\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\16\2\1\1";
    static final String DFA26_specialS =
        "\1\uffff\1\0\17\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1",
            "\1\5\13\uffff\1\4\1\7\1\uffff\1\16\1\17\1\10\1\uffff\1\12"+
            "\1\11\1\13\1\14\1\6\1\20\1\2\2\uffff\1\3",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1190:1: ( ( (lv_targetParticipant_2_0= RULE_ID ) ) otherlv_3= '.' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_1==30) && (synpred7_InternalSequencemodel())) {s = 2;}

                        else if ( (LA26_1==33) && (synpred7_InternalSequencemodel())) {s = 3;}

                        else if ( (LA26_1==17) && (synpred7_InternalSequencemodel())) {s = 4;}

                        else if ( (LA26_1==RULE_ID) && (synpred7_InternalSequencemodel())) {s = 5;}

                        else if ( (LA26_1==28) && (synpred7_InternalSequencemodel())) {s = 6;}

                        else if ( (LA26_1==18) && (synpred7_InternalSequencemodel())) {s = 7;}

                        else if ( (LA26_1==22) && (synpred7_InternalSequencemodel())) {s = 8;}

                        else if ( (LA26_1==25) && (synpred7_InternalSequencemodel())) {s = 9;}

                        else if ( (LA26_1==24) && (synpred7_InternalSequencemodel())) {s = 10;}

                        else if ( (LA26_1==26) && (synpred7_InternalSequencemodel())) {s = 11;}

                        else if ( (LA26_1==27) && (synpred7_InternalSequencemodel())) {s = 12;}

                        else if ( (LA26_1==EOF) && (synpred7_InternalSequencemodel())) {s = 13;}

                        else if ( (LA26_1==20) && (synpred7_InternalSequencemodel())) {s = 14;}

                        else if ( (LA26_1==21) && (synpred7_InternalSequencemodel())) {s = 15;}

                        else if ( (LA26_1==29) ) {s = 16;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x000002000000C002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleModel153 = new BitSet(new long[]{0x0000020000008002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSequence351 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_15_in_ruleSequence372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequence390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParticipant_in_ruleSequence416 = new BitSet(new long[]{0x000000001F470020L});
    public static final BitSet FOLLOW_16_in_ruleSequence429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParticipant_in_ruleSequence450 = new BitSet(new long[]{0x000000001F470020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleSequence473 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_17_in_ruleSequence486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParticipant573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleTransition670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_ruleTransition697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_ruleFragment789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_ruleFragment816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_ruleFragment843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_ruleFragment870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_ruleFragment897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_ruleFragment924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseFragment969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIfElseFragment1006 = new BitSet(new long[]{0x0000040000080FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1027 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIfElseFragment1039 = new BitSet(new long[]{0x000000001F760020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1060 = new BitSet(new long[]{0x000000001F760020L});
    public static final BitSet FOLLOW_20_in_ruleIfElseFragment1082 = new BitSet(new long[]{0x0000040000080FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1104 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIfElseFragment1116 = new BitSet(new long[]{0x000000001F760020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1137 = new BitSet(new long[]{0x000000001F760020L});
    public static final BitSet FOLLOW_21_in_ruleIfElseFragment1161 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1183 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_17_in_ruleIfElseFragment1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachFragment1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleForeachFragment1281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_ruleForeachFragment1302 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleForeachFragment1314 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleForeachFragment1335 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_17_in_ruleForeachFragment1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopFragment1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLoopFragment1431 = new BitSet(new long[]{0x0000040000800FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleLoopFragment1452 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLoopFragment1464 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleLoopFragment1485 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_17_in_ruleLoopFragment1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment1534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertFragment1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAssertFragment1581 = new BitSet(new long[]{0x0000040000080FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleAssertFragment1602 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertFragment1614 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAssertFragment1635 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_17_in_ruleAssertFragment1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakFragment1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBreakFragment1740 = new BitSet(new long[]{0x0000040000080FF2L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleBreakFragment1762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBreakFragment1774 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleBreakFragment1795 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_17_in_ruleBreakFragment1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_entryRuleNextFragment1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextFragment1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleNextFragment1902 = new BitSet(new long[]{0x0000040000080FF2L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleNextFragment1924 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNextFragment1936 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleNextFragment1957 = new BitSet(new long[]{0x000000001F460020L});
    public static final BitSet FOLLOW_17_in_ruleNextFragment1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_ruleMessage2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_ruleMessage2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_ruleMessage2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfMessage_in_ruleMessage2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFoundMessage_in_ruleMessage2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFoundMessage_in_entryRuleFoundMessage2208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFoundMessage2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFoundMessage2255 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFoundMessage2273 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFoundMessage2290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFoundMessage2320 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_30_in_ruleFoundMessage2346 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFoundMessage2379 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleFoundMessage2392 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFoundMessage2413 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleFoundMessage2429 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_ruleFoundMessage2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_entryRuleCallMessage2489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallMessage2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallMessage2541 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCallMessage2558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallMessage2576 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCallMessage2593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallMessage2623 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_30_in_ruleCallMessage2649 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCallMessage2682 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleCallMessage2695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCallMessage2716 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleCallMessage2732 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_ruleCallMessage2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_entryRuleNewMessage2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMessage2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMessage2844 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNewMessage2861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMessage2878 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleNewMessage2904 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNewMessage2937 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleNewMessage2950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNewMessage2971 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleNewMessage2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage3025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnMessage3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleReturnMessage3072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleReturnMessage3093 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleReturnMessage3114 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReturnMessage3147 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleReturnMessage3160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReturnMessage3181 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleReturnMessage3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage3235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteMessage3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteMessage3287 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDeleteMessage3304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteMessage3321 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleDeleteMessage3347 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeleteMessage3380 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleDeleteMessage3393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeleteMessage3414 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleDeleteMessage3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfMessage_in_entryRuleSelfMessage3468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfMessage3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelfMessage3520 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSelfMessage3537 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSelfMessage3549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelfMessage3566 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_30_in_ruleSelfMessage3592 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelfMessage3625 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleSelfMessage3638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelfMessage3659 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleSelfMessage3675 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_ruleSelfMessage3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3787 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleParameter3805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference3864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference3916 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleReference3942 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleArray4035 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleArray4052 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleArray4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression4113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachExpression4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeachExpression4168 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleForeachExpression4186 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleForeachExpression4203 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleForeachExpression4221 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleForeachExpression4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeachExpression4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces4320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueWithSpaces4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_ruleValueWithSpaces4375 = new BitSet(new long[]{0x0000040000000FF2L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueWithSpaces4408 = new BitSet(new long[]{0x0000040000000FF2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleValueWithSpaces4434 = new BitSet(new long[]{0x0000040000000FF2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleValueWithSpaces4460 = new BitSet(new long[]{0x0000040000000FF2L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnnotation4557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation4578 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAnnotation4599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4621 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation4634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4655 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleAnnotation4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID4960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID5011 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleExtendedID5030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID5045 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal5095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleReal5145 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5162 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleReal5180 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5195 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleReal5215 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_44_in_ruleReal5234 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_45_in_ruleReal5249 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42_in_ruleReal5268 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger5332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInteger5382 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalSequencemodel364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred2_InternalSequencemodel1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred3_InternalSequencemodel1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred4_InternalSequencemodel2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred5_InternalSequencemodel2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred6_InternalSequencemodel2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred7_InternalSequencemodel2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred8_InternalSequencemodel2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred9_InternalSequencemodel2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred10_InternalSequencemodel2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred11_InternalSequencemodel2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred12_InternalSequencemodel3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred13_InternalSequencemodel3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred14_InternalSequencemodel3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred15_InternalSequencemodel3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred16_InternalSequencemodel3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred17_InternalSequencemodel3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred18_InternalSequencemodel4591 = new BitSet(new long[]{0x0000000000000002L});

}
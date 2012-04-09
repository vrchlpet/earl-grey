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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NATURAL", "RULE_OPERATOR", "RULE_ANY_OTHER", "RULE_WS", "RULE_BOOLEAN", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'import'", "'sequence'", "','", "'end'", "':'", "'if'", "'then'", "'elsif'", "'else'", "'foreach'", "'do'", "'while'", "'assert'", "'break'", "'next'", "'calls'", "'.'", "'('", "')'", "'creates'", "'returns'", "'destroys'", "'self'", "'begin'", "'['", "']'", "'in'", "'..'", "'@'", "'='", "'-'", "'e'", "'E'", "'+'"
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
    public static final int T__46=46;
    public static final int T__47=47;
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

                if ( (LA2_0==15||LA2_0==42) ) {
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:176:1: ruleSequence returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) ( ( ( ',' )=>otherlv_4= ',' ) ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:179:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) ( ( ( ',' )=>otherlv_4= ',' ) ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) ( ( ( ',' )=>otherlv_4= ',' ) ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) ( ( ( ',' )=>otherlv_4= ',' ) ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'sequence' )=>otherlv_1= 'sequence' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_participant_3_0= ruleParticipant ) ) ( ( ( ',' )=>otherlv_4= ',' ) ( (lv_participant_5_0= ruleParticipant ) ) )* ( (lv_transition_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==42) ) {
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:239:2: ( ( ( ',' )=>otherlv_4= ',' ) ( (lv_participant_5_0= ruleParticipant ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) && (synpred2_InternalSequencemodel())) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:239:3: ( ( ',' )=>otherlv_4= ',' ) ( (lv_participant_5_0= ruleParticipant ) )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:239:3: ( ( ',' )=>otherlv_4= ',' )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:239:4: ( ',' )=>otherlv_4= ','
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSequence437); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getCommaKeyword_4_0());
            	          
            	    }

            	    }

            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:244:2: ( (lv_participant_5_0= ruleParticipant ) )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:245:1: (lv_participant_5_0= ruleParticipant )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:245:1: (lv_participant_5_0= ruleParticipant )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:246:3: lv_participant_5_0= ruleParticipant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParticipant_in_ruleSequence459);
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:262:4: ( (lv_transition_6_0= ruleTransition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==19||LA5_0==23||(LA5_0>=25 && LA5_0<=29)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:263:1: (lv_transition_6_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:263:1: (lv_transition_6_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:264:3: lv_transition_6_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSequenceAccess().getTransitionTransitionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleSequence482);
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

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleSequence495); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:292:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:293:2: (iv_ruleParticipant= ruleParticipant EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:294:2: iv_ruleParticipant= ruleParticipant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParticipantRule()); 
            }
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant531);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParticipant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant541); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:301:1: ruleParticipant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleExtendedID ) ) )? ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:304:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleExtendedID ) ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:305:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleExtendedID ) ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:305:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleExtendedID ) ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:305:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleExtendedID ) ) )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:305:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:306:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:306:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:307:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParticipant583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0_0()); 
              		
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:323:2: (otherlv_1= ':' ( ( ruleExtendedID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:323:4: otherlv_1= ':' ( ( ruleExtendedID ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleParticipant601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParticipantAccess().getColonKeyword_1_0());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:327:1: ( ( ruleExtendedID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:328:1: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:328:1: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:329:3: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParticipantRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParticipantAccess().getClassifierEntityCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleParticipant624);
                    ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:350:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:351:2: (iv_ruleTransition= ruleTransition EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:352:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition662);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition672); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:359:1: ruleTransition returns [EObject current=null] : (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Fragment_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:362:28: ( (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:363:1: (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:363:1: (this_Message_0= ruleMessage | this_Fragment_1= ruleFragment )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==19||LA7_0==23||(LA7_0>=25 && LA7_0<=28)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:364:5: this_Message_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionAccess().getMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleTransition719);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:374:5: this_Fragment_1= ruleFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionAccess().getFragmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFragment_in_ruleTransition746);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:390:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:391:2: (iv_ruleFragment= ruleFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:392:2: iv_ruleFragment= ruleFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment781);
            iv_ruleFragment=ruleFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment791); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:399:1: ruleFragment returns [EObject current=null] : (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:402:28: ( (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:403:1: (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:403:1: (this_IfElseFragment_0= ruleIfElseFragment | this_ForeachFragment_1= ruleForeachFragment | this_AssertFragment_2= ruleAssertFragment | this_LoopFragment_3= ruleLoopFragment | this_BreakFragment_4= ruleBreakFragment | this_NextFragment_5= ruleNextFragment )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            case 28:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:404:5: this_IfElseFragment_0= ruleIfElseFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getIfElseFragmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfElseFragment_in_ruleFragment838);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:414:5: this_ForeachFragment_1= ruleForeachFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getForeachFragmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForeachFragment_in_ruleFragment865);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:424:5: this_AssertFragment_2= ruleAssertFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getAssertFragmentParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertFragment_in_ruleFragment892);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:434:5: this_LoopFragment_3= ruleLoopFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getLoopFragmentParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLoopFragment_in_ruleFragment919);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:444:5: this_BreakFragment_4= ruleBreakFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getBreakFragmentParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakFragment_in_ruleFragment946);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:454:5: this_NextFragment_5= ruleNextFragment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFragmentAccess().getNextFragmentParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNextFragment_in_ruleFragment973);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:470:1: entryRuleIfElseFragment returns [EObject current=null] : iv_ruleIfElseFragment= ruleIfElseFragment EOF ;
    public final EObject entryRuleIfElseFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:471:2: (iv_ruleIfElseFragment= ruleIfElseFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:472:2: iv_ruleIfElseFragment= ruleIfElseFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment1008);
            iv_ruleIfElseFragment=ruleIfElseFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElseFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseFragment1018); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:479:1: ruleIfElseFragment returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:482:28: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:483:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:483:1: (otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:483:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )* ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )? otherlv_10= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleIfElseFragment1055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfElseFragmentAccess().getIfKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:487:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:488:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:488:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:489:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1076);
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleIfElseFragment1088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfElseFragmentAccess().getThenKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:509:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==19||LA9_0==23||(LA9_0>=25 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:510:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:510:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:511:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1109);
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
            	    break loop9;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:527:3: ( ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )* )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) && (synpred3_InternalSequencemodel())) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:527:4: ( ( 'elsif' )=>otherlv_4= 'elsif' ) ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) ) otherlv_6= 'then' ( (lv_elseIftransition_7_0= ruleTransition ) )*
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:527:4: ( ( 'elsif' )=>otherlv_4= 'elsif' )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:527:5: ( 'elsif' )=>otherlv_4= 'elsif'
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleIfElseFragment1131); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getIfElseFragmentAccess().getElsifKeyword_4_0());
            	          
            	    }

            	    }

            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:532:2: ( (lv_elseIfExpr_5_0= ruleValueWithSpaces ) )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:533:1: (lv_elseIfExpr_5_0= ruleValueWithSpaces )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:533:1: (lv_elseIfExpr_5_0= ruleValueWithSpaces )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:534:3: lv_elseIfExpr_5_0= ruleValueWithSpaces
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseIfExprValueWithSpacesParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1153);
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

            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleIfElseFragment1165); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getIfElseFragmentAccess().getThenKeyword_4_2());
            	          
            	    }
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:554:1: ( (lv_elseIftransition_7_0= ruleTransition ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_ID||LA10_0==19||LA10_0==23||(LA10_0>=25 && LA10_0<=29)) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:555:1: (lv_elseIftransition_7_0= ruleTransition )
            	    	    {
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:555:1: (lv_elseIftransition_7_0= ruleTransition )
            	    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:556:3: lv_elseIftransition_7_0= ruleTransition
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseIftransitionTransitionParserRuleCall_4_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1186);
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
            	    	    break loop10;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:572:5: ( ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) && (synpred4_InternalSequencemodel())) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:572:6: ( ( 'else' )=>otherlv_8= 'else' ) ( (lv_elseTransition_9_0= ruleTransition ) )*
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:572:6: ( ( 'else' )=>otherlv_8= 'else' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:572:7: ( 'else' )=>otherlv_8= 'else'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleIfElseFragment1210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getIfElseFragmentAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:577:2: ( (lv_elseTransition_9_0= ruleTransition ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==19||LA12_0==23||(LA12_0>=25 && LA12_0<=29)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:578:1: (lv_elseTransition_9_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:578:1: (lv_elseTransition_9_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:579:3: lv_elseTransition_9_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfElseFragmentAccess().getElseTransitionTransitionParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleIfElseFragment1232);
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleIfElseFragment1247); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:607:1: entryRuleForeachFragment returns [EObject current=null] : iv_ruleForeachFragment= ruleForeachFragment EOF ;
    public final EObject entryRuleForeachFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:608:2: (iv_ruleForeachFragment= ruleForeachFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:609:2: iv_ruleForeachFragment= ruleForeachFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment1283);
            iv_ruleForeachFragment=ruleForeachFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeachFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachFragment1293); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:616:1: ruleForeachFragment returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleForeachFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:619:28: ( (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:620:1: (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:620:1: (otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:620:3: otherlv_0= 'foreach' ( (lv_expr_1_0= ruleForeachExpression ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleForeachFragment1330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForeachFragmentAccess().getForeachKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:624:1: ( (lv_expr_1_0= ruleForeachExpression ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:625:1: (lv_expr_1_0= ruleForeachExpression )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:625:1: (lv_expr_1_0= ruleForeachExpression )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:626:3: lv_expr_1_0= ruleForeachExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachFragmentAccess().getExprForeachExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_ruleForeachFragment1351);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleForeachFragment1363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForeachFragmentAccess().getDoKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:646:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==19||LA14_0==23||(LA14_0>=25 && LA14_0<=29)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:647:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:647:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:648:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForeachFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleForeachFragment1384);
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
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleForeachFragment1397); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:676:1: entryRuleLoopFragment returns [EObject current=null] : iv_ruleLoopFragment= ruleLoopFragment EOF ;
    public final EObject entryRuleLoopFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:677:2: (iv_ruleLoopFragment= ruleLoopFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:678:2: iv_ruleLoopFragment= ruleLoopFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment1433);
            iv_ruleLoopFragment=ruleLoopFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopFragment1443); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:685:1: ruleLoopFragment returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleLoopFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:688:28: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:689:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:689:1: (otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:689:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'do' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleLoopFragment1480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopFragmentAccess().getWhileKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:693:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:694:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:694:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:695:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleLoopFragment1501);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLoopFragment1513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLoopFragmentAccess().getDoKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:715:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==19||LA15_0==23||(LA15_0>=25 && LA15_0<=29)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:716:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:716:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:717:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLoopFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleLoopFragment1534);
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
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleLoopFragment1547); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:745:1: entryRuleAssertFragment returns [EObject current=null] : iv_ruleAssertFragment= ruleAssertFragment EOF ;
    public final EObject entryRuleAssertFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:746:2: (iv_ruleAssertFragment= ruleAssertFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:747:2: iv_ruleAssertFragment= ruleAssertFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment1583);
            iv_ruleAssertFragment=ruleAssertFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertFragment1593); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:754:1: ruleAssertFragment returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) ;
    public final EObject ruleAssertFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;

        EObject lv_transition_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:757:28: ( (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:758:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:758:1: (otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:758:3: otherlv_0= 'assert' ( (lv_expr_1_0= ruleValueWithSpaces ) ) otherlv_2= 'then' ( (lv_transition_3_0= ruleTransition ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAssertFragment1630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertFragmentAccess().getAssertKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:762:1: ( (lv_expr_1_0= ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:763:1: (lv_expr_1_0= ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:763:1: (lv_expr_1_0= ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:764:3: lv_expr_1_0= ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleAssertFragment1651);
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAssertFragment1663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssertFragmentAccess().getThenKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:784:1: ( (lv_transition_3_0= ruleTransition ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==19||LA16_0==23||(LA16_0>=25 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:785:1: (lv_transition_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:785:1: (lv_transition_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:786:3: lv_transition_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleAssertFragment1684);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleAssertFragment1697); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:814:1: entryRuleBreakFragment returns [EObject current=null] : iv_ruleBreakFragment= ruleBreakFragment EOF ;
    public final EObject entryRuleBreakFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:815:2: (iv_ruleBreakFragment= ruleBreakFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:816:2: iv_ruleBreakFragment= ruleBreakFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment1733);
            iv_ruleBreakFragment=ruleBreakFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakFragment1743); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:823:1: ruleBreakFragment returns [EObject current=null] : ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) ;
    public final EObject ruleBreakFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_expr_2_0 = null;

        EObject lv_transition_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:826:28: ( ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:827:1: ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:827:1: ( () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:827:2: () otherlv_1= 'break' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:827:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:828:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakFragmentAccess().getBreakFragmentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleBreakFragment1789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakFragmentAccess().getBreakKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:837:1: ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING||(LA18_0>=RULE_NATURAL && LA18_0<=RULE_NULL)||LA18_0==20||LA18_0==44) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( ((LA18_2>=RULE_STRING && LA18_2<=RULE_NULL)||LA18_2==20||LA18_2==30||LA18_2==44) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:837:2: ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:837:2: ( (lv_expr_2_0= ruleValueWithSpaces ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:838:1: (lv_expr_2_0= ruleValueWithSpaces )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:838:1: (lv_expr_2_0= ruleValueWithSpaces )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:839:3: lv_expr_2_0= ruleValueWithSpaces
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBreakFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleBreakFragment1811);
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

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleBreakFragment1823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBreakFragmentAccess().getThenKeyword_2_1());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:859:1: ( (lv_transition_4_0= ruleTransition ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||LA17_0==19||LA17_0==23||(LA17_0>=25 && LA17_0<=29)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:860:1: (lv_transition_4_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:860:1: (lv_transition_4_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:861:3: lv_transition_4_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBreakFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleBreakFragment1844);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleBreakFragment1857); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:889:1: entryRuleNextFragment returns [EObject current=null] : iv_ruleNextFragment= ruleNextFragment EOF ;
    public final EObject entryRuleNextFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextFragment = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:890:2: (iv_ruleNextFragment= ruleNextFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:891:2: iv_ruleNextFragment= ruleNextFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleNextFragment_in_entryRuleNextFragment1895);
            iv_ruleNextFragment=ruleNextFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextFragment1905); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:898:1: ruleNextFragment returns [EObject current=null] : ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) ;
    public final EObject ruleNextFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_expr_2_0 = null;

        EObject lv_transition_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:901:28: ( ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:902:1: ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:902:1: ( () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:902:2: () otherlv_1= 'next' ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:902:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:903:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNextFragmentAccess().getNextFragmentAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleNextFragment1951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNextFragmentAccess().getNextKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:912:1: ( ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||(LA20_0>=RULE_NATURAL && LA20_0<=RULE_NULL)||LA20_0==20||LA20_0==44) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                int LA20_2 = input.LA(2);

                if ( ((LA20_2>=RULE_STRING && LA20_2<=RULE_NULL)||LA20_2==20||LA20_2==30||LA20_2==44) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:912:2: ( (lv_expr_2_0= ruleValueWithSpaces ) ) otherlv_3= 'then' ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= 'end'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:912:2: ( (lv_expr_2_0= ruleValueWithSpaces ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:913:1: (lv_expr_2_0= ruleValueWithSpaces )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:913:1: (lv_expr_2_0= ruleValueWithSpaces )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:914:3: lv_expr_2_0= ruleValueWithSpaces
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNextFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueWithSpaces_in_ruleNextFragment1973);
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

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleNextFragment1985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNextFragmentAccess().getThenKeyword_2_1());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:934:1: ( (lv_transition_4_0= ruleTransition ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||LA19_0==19||LA19_0==23||(LA19_0>=25 && LA19_0<=29)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:935:1: (lv_transition_4_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:935:1: (lv_transition_4_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:936:3: lv_transition_4_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNextFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleNextFragment2006);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleNextFragment2019); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:964:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:965:2: (iv_ruleMessage= ruleMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:966:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2057);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2067); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:973:1: ruleMessage returns [EObject current=null] : (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_DeleteMessage_2= ruleDeleteMessage | this_SelfMessage_3= ruleSelfMessage | this_FoundMessage_4= ruleFoundMessage ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_CallMessage_0 = null;

        EObject this_NewMessage_1 = null;

        EObject this_DeleteMessage_2 = null;

        EObject this_SelfMessage_3 = null;

        EObject this_FoundMessage_4 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:976:28: ( (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_DeleteMessage_2= ruleDeleteMessage | this_SelfMessage_3= ruleSelfMessage | this_FoundMessage_4= ruleFoundMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:977:1: (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_DeleteMessage_2= ruleDeleteMessage | this_SelfMessage_3= ruleSelfMessage | this_FoundMessage_4= ruleFoundMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:977:1: (this_CallMessage_0= ruleCallMessage | this_NewMessage_1= ruleNewMessage | this_DeleteMessage_2= ruleDeleteMessage | this_SelfMessage_3= ruleSelfMessage | this_FoundMessage_4= ruleFoundMessage )
            int alt21=5;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt21=4;
                    }
                    break;
                case 35:
                    {
                    alt21=3;
                    }
                    break;
                case 29:
                    {
                    alt21=1;
                    }
                    break;
                case 33:
                    {
                    alt21=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA21_0==29) ) {
                alt21=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:978:5: this_CallMessage_0= ruleCallMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getCallMessageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCallMessage_in_ruleMessage2114);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:988:5: this_NewMessage_1= ruleNewMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getNewMessageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewMessage_in_ruleMessage2141);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:998:5: this_DeleteMessage_2= ruleDeleteMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getDeleteMessageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteMessage_in_ruleMessage2168);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1008:5: this_SelfMessage_3= ruleSelfMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getSelfMessageParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelfMessage_in_ruleMessage2195);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1018:5: this_FoundMessage_4= ruleFoundMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMessageAccess().getFoundMessageParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFoundMessage_in_ruleMessage2222);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1034:1: entryRuleFoundMessage returns [EObject current=null] : iv_ruleFoundMessage= ruleFoundMessage EOF ;
    public final EObject entryRuleFoundMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoundMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1035:2: (iv_ruleFoundMessage= ruleFoundMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1036:2: iv_ruleFoundMessage= ruleFoundMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFoundMessageRule()); 
            }
            pushFollow(FOLLOW_ruleFoundMessage_in_entryRuleFoundMessage2257);
            iv_ruleFoundMessage=ruleFoundMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFoundMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFoundMessage2267); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1043:1: ruleFoundMessage returns [EObject current=null] : (otherlv_0= 'calls' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ) ;
    public final EObject ruleFoundMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1046:28: ( (otherlv_0= 'calls' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1047:1: (otherlv_0= 'calls' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1047:1: (otherlv_0= 'calls' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1047:3: otherlv_0= 'calls' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFoundMessage2304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFoundMessageAccess().getCallsKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1051:1: ( (otherlv_1= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1052:1: (otherlv_1= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1052:1: (otherlv_1= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1053:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFoundMessageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFoundMessage2324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getFoundMessageAccess().getTargetParticipantParticipantCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleFoundMessage2336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFoundMessageAccess().getFullStopKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1068:1: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1068:2: ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1074:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1075:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFoundMessage2364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getFoundMessageAccess().getNameIDTerminalRuleCall_3_0()); 
              		
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1091:2: ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) && (synpred6_InternalSequencemodel())) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1091:3: ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1091:3: ( ( '(' )=>otherlv_4= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1091:4: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleFoundMessage2390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFoundMessageAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1096:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) && (synpred7_InternalSequencemodel())) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1096:3: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1096:3: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1096:4: ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1101:1: (lv_parameter_5_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1102:3: lv_parameter_5_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFoundMessageAccess().getParameterParameterParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleFoundMessage2423);
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1118:2: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==16) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1118:4: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFoundMessage2436); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getFoundMessageAccess().getCommaKeyword_4_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1122:1: ( (lv_parameter_7_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1123:1: (lv_parameter_7_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1123:1: (lv_parameter_7_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1124:3: lv_parameter_7_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFoundMessageAccess().getParameterParameterParserRuleCall_4_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleFoundMessage2457);
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

                    otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleFoundMessage2473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFoundMessageAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1144:3: ( (lv_return_9_0= ruleReturnMessage ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1145:1: (lv_return_9_0= ruleReturnMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1145:1: (lv_return_9_0= ruleReturnMessage )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1146:3: lv_return_9_0= ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFoundMessageAccess().getReturnReturnMessageParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_ruleFoundMessage2496);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1170:1: entryRuleCallMessage returns [EObject current=null] : iv_ruleCallMessage= ruleCallMessage EOF ;
    public final EObject entryRuleCallMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1171:2: (iv_ruleCallMessage= ruleCallMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1172:2: iv_ruleCallMessage= ruleCallMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallMessageRule()); 
            }
            pushFollow(FOLLOW_ruleCallMessage_in_entryRuleCallMessage2533);
            iv_ruleCallMessage=ruleCallMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallMessage2543); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1179:1: ruleCallMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'calls' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )? ) ;
    public final EObject ruleCallMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1182:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'calls' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1183:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'calls' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1183:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'calls' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1183:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'calls' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ( (lv_return_10_0= ruleReturnMessage ) )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1183:2: ( (otherlv_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1184:1: (otherlv_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1184:1: (otherlv_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1185:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallMessageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallMessage2588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCallMessageAccess().getSourceParticipantCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleCallMessage2600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCallMessageAccess().getCallsKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1200:1: ( (otherlv_2= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1201:1: (otherlv_2= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1201:1: (otherlv_2= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1202:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallMessageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallMessage2620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getCallMessageAccess().getTargetParticipantCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleCallMessage2632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCallMessageAccess().getFullStopKeyword_3());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1217:1: ( (lv_name_4_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1218:1: (lv_name_4_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1218:1: (lv_name_4_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1219:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCallMessage2649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_4_0()); 
              		
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
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) && (synpred8_InternalSequencemodel())) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:3: ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:3: ( ( '(' )=>otherlv_5= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:4: ( '(' )=>otherlv_5= '('
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleCallMessage2675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_5_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1240:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) && (synpred9_InternalSequencemodel())) {
                        alt27=1;
                    }
                    switch (alt27) {
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
                               
                              	        newCompositeNode(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_5_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleCallMessage2708);
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
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==16) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1262:4: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                            	    {
                            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCallMessage2721); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getCallMessageAccess().getCommaKeyword_5_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1266:1: ( (lv_parameter_8_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1267:1: (lv_parameter_8_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1267:1: (lv_parameter_8_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1268:3: lv_parameter_8_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_5_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleCallMessage2742);
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
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleCallMessage2758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1288:3: ( (lv_return_10_0= ruleReturnMessage ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1289:1: (lv_return_10_0= ruleReturnMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1289:1: (lv_return_10_0= ruleReturnMessage )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1290:3: lv_return_10_0= ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallMessageAccess().getReturnReturnMessageParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_ruleCallMessage2781);
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
            pushFollow(FOLLOW_ruleNewMessage_in_entryRuleNewMessage2818);
            iv_ruleNewMessage=ruleNewMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMessage2828); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1323:1: ruleNewMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'creates' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) )? ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ) ;
    public final EObject ruleNewMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameter_6_0 = null;

        EObject lv_parameter_8_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1326:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'creates' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) )? ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1327:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'creates' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) )? ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1327:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'creates' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) )? ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1327:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'creates' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) )? ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1327:2: ( (otherlv_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1328:1: (otherlv_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1328:1: (otherlv_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1329:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNewMessageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMessage2873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNewMessageAccess().getSourceParticipantCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleNewMessage2885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNewMessageAccess().getCreatesKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1344:1: ( (otherlv_2= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1345:1: (otherlv_2= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1345:1: (otherlv_2= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1346:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNewMessageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMessage2905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getNewMessageAccess().getTargetParticipantCrossReference_2_0()); 
              	
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1357:2: ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) && (synpred10_InternalSequencemodel())) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1357:3: ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1357:3: ( ( '.' )=>otherlv_3= '.' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1357:4: ( '.' )=>otherlv_3= '.'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleNewMessage2926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNewMessageAccess().getFullStopKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1362:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1363:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1363:1: (lv_name_4_0= RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1364:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMessage2944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_4_0, grammarAccess.getNewMessageAccess().getNameIDTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNewMessageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1380:4: ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) && (synpred11_InternalSequencemodel())) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1380:5: ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1380:5: ( ( '(' )=>otherlv_5= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1380:6: ( '(' )=>otherlv_5= '('
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleNewMessage2972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNewMessageAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1385:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) && (synpred12_InternalSequencemodel())) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1385:3: ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1385:3: ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1385:4: ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1390:1: (lv_parameter_6_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1391:3: lv_parameter_6_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleNewMessage3005);
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1407:2: (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==16) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1407:4: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                            	    {
                            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleNewMessage3018); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getNewMessageAccess().getCommaKeyword_4_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1411:1: ( (lv_parameter_8_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1412:1: (lv_parameter_8_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1412:1: (lv_parameter_8_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1413:3: lv_parameter_8_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_4_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleNewMessage3039);
                            	    lv_parameter_8_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getNewMessageRule());
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
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleNewMessage3055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getNewMessageAccess().getRightParenthesisKeyword_4_2());
                          
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1441:1: entryRuleReturnMessage returns [EObject current=null] : iv_ruleReturnMessage= ruleReturnMessage EOF ;
    public final EObject entryRuleReturnMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1442:2: (iv_ruleReturnMessage= ruleReturnMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1443:2: iv_ruleReturnMessage= ruleReturnMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnMessageRule()); 
            }
            pushFollow(FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage3093);
            iv_ruleReturnMessage=ruleReturnMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnMessage3103); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1450:1: ruleReturnMessage returns [EObject current=null] : (otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1453:28: ( (otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1454:1: (otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1454:1: (otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1454:3: otherlv_0= 'returns' ( (lv_name_1_0= ruleReference ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleReturnMessage3140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnMessageAccess().getReturnsKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1458:1: ( (lv_name_1_0= ruleReference ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1459:1: (lv_name_1_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1459:1: (lv_name_1_0= ruleReference )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1460:3: lv_name_1_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnMessageAccess().getNameReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleReturnMessage3161);
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1476:2: ( ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) && (synpred13_InternalSequencemodel())) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1476:3: ( ( '(' )=>otherlv_2= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1476:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1476:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleReturnMessage3182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReturnMessageAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1481:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) && (synpred14_InternalSequencemodel())) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1481:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1481:3: ( ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1481:4: ( ( ruleParameter ) )=> (lv_parameter_3_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1486:1: (lv_parameter_3_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1487:3: lv_parameter_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleReturnMessage3215);
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1503:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==16) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1503:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleReturnMessage3228); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getReturnMessageAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1507:1: ( (lv_parameter_5_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1508:1: (lv_parameter_5_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1508:1: (lv_parameter_5_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1509:3: lv_parameter_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleReturnMessage3249);
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

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleReturnMessage3265); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1537:1: entryRuleDeleteMessage returns [EObject current=null] : iv_ruleDeleteMessage= ruleDeleteMessage EOF ;
    public final EObject entryRuleDeleteMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1538:2: (iv_ruleDeleteMessage= ruleDeleteMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1539:2: iv_ruleDeleteMessage= ruleDeleteMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteMessageRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage3303);
            iv_ruleDeleteMessage=ruleDeleteMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteMessage3313); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1546:1: ruleDeleteMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroys' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? )? ) ;
    public final EObject ruleDeleteMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameter_6_0 = null;

        EObject lv_parameter_8_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1549:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroys' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1550:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroys' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1550:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroys' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1550:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'destroys' ( (otherlv_2= RULE_ID ) ) ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1550:2: ( (otherlv_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1551:1: (otherlv_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1551:1: (otherlv_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1552:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteMessageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteMessage3358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDeleteMessageAccess().getSourceParticipantCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleDeleteMessage3370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteMessageAccess().getDestroysKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1567:1: ( (otherlv_2= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1568:1: (otherlv_2= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1568:1: (otherlv_2= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1569:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteMessageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteMessage3390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteMessageAccess().getTargetParticipantCrossReference_2_0()); 
              	
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1580:2: ( ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) && (synpred15_InternalSequencemodel())) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1580:3: ( ( '.' )=>otherlv_3= '.' ) ( (lv_name_4_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )?
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1580:3: ( ( '.' )=>otherlv_3= '.' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1580:4: ( '.' )=>otherlv_3= '.'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDeleteMessage3411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteMessageAccess().getFullStopKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1585:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1586:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1586:1: (lv_name_4_0= RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1587:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteMessage3429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_4_0, grammarAccess.getDeleteMessageAccess().getNameIDTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeleteMessageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1603:2: ( ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==31) && (synpred16_InternalSequencemodel())) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1603:3: ( ( '(' )=>otherlv_5= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )? otherlv_9= ')'
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1603:3: ( ( '(' )=>otherlv_5= '(' )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1603:4: ( '(' )=>otherlv_5= '('
                            {
                            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleDeleteMessage3455); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getDeleteMessageAccess().getLeftParenthesisKeyword_3_2_0());
                                  
                            }

                            }

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1608:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )* )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==RULE_ID) && (synpred17_InternalSequencemodel())) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1608:3: ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                                    {
                                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1608:3: ( ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter ) )
                                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1608:4: ( ( ruleParameter ) )=> (lv_parameter_6_0= ruleParameter )
                                    {
                                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1613:1: (lv_parameter_6_0= ruleParameter )
                                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1614:3: lv_parameter_6_0= ruleParameter
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_3_2_1_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleParameter_in_ruleDeleteMessage3488);
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

                                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1630:2: (otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) ) )*
                                    loop37:
                                    do {
                                        int alt37=2;
                                        int LA37_0 = input.LA(1);

                                        if ( (LA37_0==16) ) {
                                            alt37=1;
                                        }


                                        switch (alt37) {
                                    	case 1 :
                                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1630:4: otherlv_7= ',' ( (lv_parameter_8_0= ruleParameter ) )
                                    	    {
                                    	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleDeleteMessage3501); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_7, grammarAccess.getDeleteMessageAccess().getCommaKeyword_3_2_1_1_0());
                                    	          
                                    	    }
                                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1634:1: ( (lv_parameter_8_0= ruleParameter ) )
                                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1635:1: (lv_parameter_8_0= ruleParameter )
                                    	    {
                                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1635:1: (lv_parameter_8_0= ruleParameter )
                                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1636:3: lv_parameter_8_0= ruleParameter
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_3_2_1_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleParameter_in_ruleDeleteMessage3522);
                                    	    lv_parameter_8_0=ruleParameter();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getDeleteMessageRule());
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
                                    	    break loop37;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleDeleteMessage3538); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getDeleteMessageAccess().getRightParenthesisKeyword_3_2_2());
                                  
                            }

                            }
                            break;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1664:1: entryRuleSelfMessage returns [EObject current=null] : iv_ruleSelfMessage= ruleSelfMessage EOF ;
    public final EObject entryRuleSelfMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1665:2: (iv_ruleSelfMessage= ruleSelfMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1666:2: iv_ruleSelfMessage= ruleSelfMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfMessageRule()); 
            }
            pushFollow(FOLLOW_ruleSelfMessage_in_entryRuleSelfMessage3578);
            iv_ruleSelfMessage=ruleSelfMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfMessage3588); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1673:1: ruleSelfMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ( ( ( 'begin' )=>otherlv_10= 'begin' ) ( (lv_transition_11_0= ruleTransition ) )* otherlv_12= 'end' )? ) ;
    public final EObject ruleSelfMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_parameter_5_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_return_9_0 = null;

        EObject lv_transition_11_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1676:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ( ( ( 'begin' )=>otherlv_10= 'begin' ) ( (lv_transition_11_0= ruleTransition ) )* otherlv_12= 'end' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1677:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ( ( ( 'begin' )=>otherlv_10= 'begin' ) ( (lv_transition_11_0= ruleTransition ) )* otherlv_12= 'end' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1677:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ( ( ( 'begin' )=>otherlv_10= 'begin' ) ( (lv_transition_11_0= ruleTransition ) )* otherlv_12= 'end' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1677:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'self' otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )? ( (lv_return_9_0= ruleReturnMessage ) )? ( ( ( 'begin' )=>otherlv_10= 'begin' ) ( (lv_transition_11_0= ruleTransition ) )* otherlv_12= 'end' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1677:2: ( (otherlv_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1678:1: (otherlv_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1678:1: (otherlv_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1679:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSelfMessageRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelfMessage3633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getSelfMessageAccess().getSourceParticipantCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleSelfMessage3645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfMessageAccess().getSelfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSelfMessage3657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSelfMessageAccess().getFullStopKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1698:1: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1699:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1699:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1700:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelfMessage3674); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1716:2: ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) && (synpred18_InternalSequencemodel())) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1716:3: ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1716:3: ( ( '(' )=>otherlv_4= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1716:4: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleSelfMessage3700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSelfMessageAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1721:2: ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) && (synpred19_InternalSequencemodel())) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1721:3: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1721:3: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1721:4: ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1726:1: (lv_parameter_5_0= ruleParameter )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1727:3: lv_parameter_5_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelfMessageAccess().getParameterParameterParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameter_in_ruleSelfMessage3733);
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

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1743:2: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==16) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1743:4: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSelfMessage3746); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getSelfMessageAccess().getCommaKeyword_4_1_1_0());
                            	          
                            	    }
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1747:1: ( (lv_parameter_7_0= ruleParameter ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1748:1: (lv_parameter_7_0= ruleParameter )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1748:1: (lv_parameter_7_0= ruleParameter )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1749:3: lv_parameter_7_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSelfMessageAccess().getParameterParameterParserRuleCall_4_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleSelfMessage3767);
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
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleSelfMessage3783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelfMessageAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1769:3: ( (lv_return_9_0= ruleReturnMessage ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1770:1: (lv_return_9_0= ruleReturnMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1770:1: (lv_return_9_0= ruleReturnMessage )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1771:3: lv_return_9_0= ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelfMessageAccess().getReturnReturnMessageParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_ruleSelfMessage3806);
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:3: ( ( ( 'begin' )=>otherlv_10= 'begin' ) ( (lv_transition_11_0= ruleTransition ) )* otherlv_12= 'end' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) && (synpred20_InternalSequencemodel())) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:4: ( ( 'begin' )=>otherlv_10= 'begin' ) ( (lv_transition_11_0= ruleTransition ) )* otherlv_12= 'end'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:4: ( ( 'begin' )=>otherlv_10= 'begin' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:5: ( 'begin' )=>otherlv_10= 'begin'
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleSelfMessage3828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelfMessageAccess().getBeginKeyword_6_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1792:2: ( (lv_transition_11_0= ruleTransition ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID||LA45_0==19||LA45_0==23||(LA45_0>=25 && LA45_0<=29)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1793:1: (lv_transition_11_0= ruleTransition )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1793:1: (lv_transition_11_0= ruleTransition )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1794:3: lv_transition_11_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSelfMessageAccess().getTransitionTransitionParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleSelfMessage3850);
                    	    lv_transition_11_0=ruleTransition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSelfMessageRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"transition",
                    	              		lv_transition_11_0, 
                    	              		"Transition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleSelfMessage3863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelfMessageAccess().getEndKeyword_6_2());
                          
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1822:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1823:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1824:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3901);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3911); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1831:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1834:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1835:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1835:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1835:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1835:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1836:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1836:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1837:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3953); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1853:2: (otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==18) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1853:4: otherlv_1= ':' ( (lv_type_2_0= ruleReference ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleParameter3971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1_0());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1857:1: ( (lv_type_2_0= ruleReference ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1858:1: (lv_type_2_0= ruleReference )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1858:1: (lv_type_2_0= ruleReference )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1859:3: lv_type_2_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleParameter3992);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1883:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1884:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1885:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference4030);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference4040); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1892:1: ruleReference returns [EObject current=null] : ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1895:28: ( ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:1: ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:1: ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:2: ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )*
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1896:2: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1897:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1897:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1898:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleReference4088);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1911:2: ( (lv_array_1_0= ruleArray ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==38) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1912:1: (lv_array_1_0= ruleArray )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1912:1: (lv_array_1_0= ruleArray )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1913:3: lv_array_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleReference4109);
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleArray"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1937:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1938:2: (iv_ruleArray= ruleArray EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1939:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray4146);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray4156); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1946:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1949:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1950:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1950:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1950:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']'
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1950:2: ()
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1951:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayAccess().getArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleArray4202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1960:1: ( (lv_size_2_0= RULE_NATURAL ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_NATURAL) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1961:1: (lv_size_2_0= RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1961:1: (lv_size_2_0= RULE_NATURAL )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1962:3: lv_size_2_0= RULE_NATURAL
                    {
                    lv_size_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleArray4219); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleArray4237); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1990:1: entryRuleForeachExpression returns [String current=null] : iv_ruleForeachExpression= ruleForeachExpression EOF ;
    public final String entryRuleForeachExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForeachExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1994:2: (iv_ruleForeachExpression= ruleForeachExpression EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1995:2: iv_ruleForeachExpression= ruleForeachExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression4280);
            iv_ruleForeachExpression=ruleForeachExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeachExpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachExpression4291); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2005:1: ruleForeachExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2009:28: ( (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2010:1: (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2010:1: (this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2010:6: this_ID_0= RULE_ID kw= 'in' ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeachExpression4335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,40,FOLLOW_40_in_ruleForeachExpression4353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getForeachExpressionAccess().getInKeyword_1()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2023:1: ( (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL ) | this_ID_5= RULE_ID )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_NATURAL) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID) ) {
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2023:2: (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2023:2: (this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2023:7: this_NATURAL_2= RULE_NATURAL kw= '..' this_NATURAL_4= RULE_NATURAL
                    {
                    this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleForeachExpression4370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_2, grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_0()); 
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleForeachExpression4388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getForeachExpressionAccess().getFullStopFullStopKeyword_2_0_1()); 
                          
                    }
                    this_NATURAL_4=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleForeachExpression4403); if (state.failed) return current;
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2044:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeachExpression4430); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2062:1: entryRuleValueWithSpaces returns [String current=null] : iv_ruleValueWithSpaces= ruleValueWithSpaces EOF ;
    public final String entryRuleValueWithSpaces() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueWithSpaces = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2066:2: (iv_ruleValueWithSpaces= ruleValueWithSpaces EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2067:2: iv_ruleValueWithSpaces= ruleValueWithSpaces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueWithSpacesRule()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces4487);
            iv_ruleValueWithSpaces=ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueWithSpaces.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueWithSpaces4498); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2077:1: ruleValueWithSpaces returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )* ;
    public final AntlrDatatypeRuleToken ruleValueWithSpaces() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OPERATOR_0=null;
        Token this_ANY_OTHER_2=null;
        Token this_WS_3=null;
        AntlrDatatypeRuleToken this_Value_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2081:28: ( (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2082:1: (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )*
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2082:1: (this_OPERATOR_0= RULE_OPERATOR | this_Value_1= ruleValue | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )*
            loop51:
            do {
                int alt51=5;
                switch ( input.LA(1) ) {
                case RULE_OPERATOR:
                    {
                    alt51=1;
                    }
                    break;
                case RULE_STRING:
                case RULE_ID:
                case RULE_NATURAL:
                case RULE_BOOLEAN:
                case RULE_NULL:
                case 44:
                    {
                    alt51=2;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt51=3;
                    }
                    break;
                case RULE_WS:
                    {
                    alt51=4;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2082:6: this_OPERATOR_0= RULE_OPERATOR
            	    {
            	    this_OPERATOR_0=(Token)match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_ruleValueWithSpaces4542); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_OPERATOR_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OPERATOR_0, grammarAccess.getValueWithSpacesAccess().getOPERATORTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2091:5: this_Value_1= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getValueWithSpacesAccess().getValueParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValueWithSpaces4575);
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
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2102:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleValueWithSpaces4601); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_2, grammarAccess.getValueWithSpacesAccess().getANY_OTHERTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2110:10: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleValueWithSpaces4627); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getValueWithSpacesAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2128:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2129:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2130:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4677);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation4687); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2137:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_property_3_0 = null;

        EObject lv_property_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2140:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2141:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2141:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2141:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleAnnotation4724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2145:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2146:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2146:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2147:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation4745);
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

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2163:2: (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==31) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2163:4: otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleAnnotation4758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2167:1: ( (lv_property_3_0= ruleProperty ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2168:1: (lv_property_3_0= ruleProperty )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2168:1: (lv_property_3_0= ruleProperty )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2169:3: lv_property_3_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleAnnotation4779);
                    lv_property_3_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"property",
                              		lv_property_3_0, 
                              		"Property");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2185:2: (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==16) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2185:4: otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation4792); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2189:1: ( (lv_property_5_0= ruleProperty ) )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2190:1: (lv_property_5_0= ruleProperty )
                    	    {
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2190:1: (lv_property_5_0= ruleProperty )
                    	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2191:3: lv_property_5_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleAnnotation4813);
                    	    lv_property_5_0=ruleProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"property",
                    	              		lv_property_5_0, 
                    	              		"Property");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleAnnotation4827); if (state.failed) return current;
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


    // $ANTLR start "entryRuleProperty"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2219:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2220:2: (iv_ruleProperty= ruleProperty EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2221:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty4865);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty4875); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2228:1: ruleProperty returns [EObject current=null] : (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_AssignProperty_0 = null;

        EObject this_ValueProperty_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2231:28: ( (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2232:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2232:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2233:5: this_AssignProperty_0= ruleAssignProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getAssignPropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignProperty_in_ruleProperty4922);
                    this_AssignProperty_0=ruleAssignProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssignProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2243:5: this_ValueProperty_1= ruleValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueProperty_in_ruleProperty4949);
                    this_ValueProperty_1=ruleValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueProperty_1; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssignProperty"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2259:1: entryRuleAssignProperty returns [EObject current=null] : iv_ruleAssignProperty= ruleAssignProperty EOF ;
    public final EObject entryRuleAssignProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignProperty = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2260:2: (iv_ruleAssignProperty= ruleAssignProperty EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2261:2: iv_ruleAssignProperty= ruleAssignProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAssignProperty_in_entryRuleAssignProperty4984);
            iv_ruleAssignProperty=ruleAssignProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignProperty4994); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignProperty"


    // $ANTLR start "ruleAssignProperty"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2268:1: ruleAssignProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2271:28: ( ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2272:1: ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2272:1: ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2272:2: ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2272:2: ( (lv_name_0_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2273:1: (lv_name_0_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2273:1: (lv_name_0_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2274:3: lv_name_0_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignPropertyAccess().getNameExtendedIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAssignProperty5040);
            lv_name_0_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAssignProperty5052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignPropertyAccess().getEqualsSignKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2294:1: ( (lv_value_2_0= ruleValue ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2295:1: (lv_value_2_0= ruleValue )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2295:1: (lv_value_2_0= ruleValue )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2296:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignPropertyAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleAssignProperty5073);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleAssignProperty"


    // $ANTLR start "entryRuleValueProperty"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2320:1: entryRuleValueProperty returns [EObject current=null] : iv_ruleValueProperty= ruleValueProperty EOF ;
    public final EObject entryRuleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueProperty = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2321:2: (iv_ruleValueProperty= ruleValueProperty EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2322:2: iv_ruleValueProperty= ruleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleValueProperty_in_entryRuleValueProperty5109);
            iv_ruleValueProperty=ruleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueProperty5119); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueProperty"


    // $ANTLR start "ruleValueProperty"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2329:1: ruleValueProperty returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleValueProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2332:28: ( ( (lv_value_0_0= ruleValue ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2333:1: ( (lv_value_0_0= ruleValue ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2333:1: ( (lv_value_0_0= ruleValue ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2334:1: (lv_value_0_0= ruleValue )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2334:1: (lv_value_0_0= ruleValue )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2335:3: lv_value_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuePropertyAccess().getValueValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValueProperty5164);
            lv_value_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValuePropertyRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleValueProperty"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2359:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2360:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2361:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue5200);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue5211); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2368:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
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
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2371:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2372:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2372:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt55=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==RULE_NATURAL) ) {
                    int LA55_2 = input.LA(3);

                    if ( (LA55_2==30) ) {
                        alt55=6;
                    }
                    else if ( (LA55_2==EOF||(LA55_2>=RULE_STRING && LA55_2<=RULE_NULL)||LA55_2==16||LA55_2==20||LA55_2==24||LA55_2==32||LA55_2==44) ) {
                        alt55=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==30) ) {
                    alt55=6;
                }
                else if ( (LA55_2==EOF||(LA55_2>=RULE_STRING && LA55_2<=RULE_NULL)||LA55_2==16||LA55_2==20||LA55_2==24||LA55_2==32||LA55_2==44) ) {
                    alt55=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt55=2;
                }
                break;
            case RULE_ID:
                {
                alt55=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt55=4;
                }
                break;
            case RULE_NULL:
                {
                alt55=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2373:5: this_Integer_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue5258);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2384:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue5284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2393:5: this_ExtendedID_2= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue5317);
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2404:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue5343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2412:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue5369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2421:5: this_Real_5= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleValue5402);
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2439:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2440:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2441:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID5448);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID5459); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2448:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2451:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2452:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2452:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2452:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID5499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2459:1: (kw= '.' this_ID_2= RULE_ID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==30) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2460:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleExtendedID5518); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID5533); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2482:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2483:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2484:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal5583);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal5594); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2491:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2494:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2495:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2495:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2495:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2495:2: (kw= '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2496:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleReal5633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,30,FOLLOW_30_in_ruleReal5668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                  
            }
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2521:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=45 && LA60_0<=46)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2521:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2521:2: (kw= 'e' | kw= 'E' )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==45) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==46) ) {
                        alt58=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2522:2: kw= 'e'
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleReal5703); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2529:2: kw= 'E'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleReal5722); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2534:2: (kw= '+' | kw= '-' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==47) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==44) ) {
                        alt59=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2535:2: kw= '+'
                            {
                            kw=(Token)match(input,47,FOLLOW_47_in_ruleReal5737); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2542:2: kw= '-'
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleReal5756); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5772); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2562:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2563:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2564:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger5820);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger5831); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2571:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2574:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2575:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2575:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2575:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2575:2: (kw= '-' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==44) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:2576:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleInteger5870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger5887); if (state.failed) return current;
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
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:239:4: ( ',' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:239:6: ','
        {
        match(input,16,FOLLOW_16_in_synpred2_InternalSequencemodel429); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSequencemodel

    // $ANTLR start synpred3_InternalSequencemodel
    public final void synpred3_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:527:5: ( 'elsif' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:527:7: 'elsif'
        {
        match(input,21,FOLLOW_21_in_synpred3_InternalSequencemodel1123); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSequencemodel

    // $ANTLR start synpred4_InternalSequencemodel
    public final void synpred4_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:572:7: ( 'else' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:572:9: 'else'
        {
        match(input,22,FOLLOW_22_in_synpred4_InternalSequencemodel1202); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalSequencemodel

    // $ANTLR start synpred6_InternalSequencemodel
    public final void synpred6_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1091:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1091:6: '('
        {
        match(input,31,FOLLOW_31_in_synpred6_InternalSequencemodel2382); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalSequencemodel

    // $ANTLR start synpred7_InternalSequencemodel
    public final void synpred7_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1096:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1097:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1097:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1098:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred7_InternalSequencemodel2406);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalSequencemodel

    // $ANTLR start synpred8_InternalSequencemodel
    public final void synpred8_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1235:6: '('
        {
        match(input,31,FOLLOW_31_in_synpred8_InternalSequencemodel2667); if (state.failed) return ;

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
        pushFollow(FOLLOW_ruleParameter_in_synpred9_InternalSequencemodel2691);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalSequencemodel

    // $ANTLR start synpred10_InternalSequencemodel
    public final void synpred10_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1357:4: ( '.' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1357:6: '.'
        {
        match(input,30,FOLLOW_30_in_synpred10_InternalSequencemodel2918); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalSequencemodel

    // $ANTLR start synpred11_InternalSequencemodel
    public final void synpred11_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1380:6: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1380:8: '('
        {
        match(input,31,FOLLOW_31_in_synpred11_InternalSequencemodel2964); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalSequencemodel

    // $ANTLR start synpred12_InternalSequencemodel
    public final void synpred12_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1385:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1386:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1386:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1387:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred12_InternalSequencemodel2988);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSequencemodel

    // $ANTLR start synpred13_InternalSequencemodel
    public final void synpred13_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1476:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1476:6: '('
        {
        match(input,31,FOLLOW_31_in_synpred13_InternalSequencemodel3174); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalSequencemodel

    // $ANTLR start synpred14_InternalSequencemodel
    public final void synpred14_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1481:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1482:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1482:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1483:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred14_InternalSequencemodel3198);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalSequencemodel

    // $ANTLR start synpred15_InternalSequencemodel
    public final void synpred15_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1580:4: ( '.' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1580:6: '.'
        {
        match(input,30,FOLLOW_30_in_synpred15_InternalSequencemodel3403); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalSequencemodel

    // $ANTLR start synpred16_InternalSequencemodel
    public final void synpred16_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1603:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1603:6: '('
        {
        match(input,31,FOLLOW_31_in_synpred16_InternalSequencemodel3447); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalSequencemodel

    // $ANTLR start synpred17_InternalSequencemodel
    public final void synpred17_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1608:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1609:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1609:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1610:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred17_InternalSequencemodel3471);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalSequencemodel

    // $ANTLR start synpred18_InternalSequencemodel
    public final void synpred18_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1716:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1716:6: '('
        {
        match(input,31,FOLLOW_31_in_synpred18_InternalSequencemodel3692); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSequencemodel

    // $ANTLR start synpred19_InternalSequencemodel
    public final void synpred19_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1721:4: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1722:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1722:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1723:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred19_InternalSequencemodel3716);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSequencemodel

    // $ANTLR start synpred20_InternalSequencemodel
    public final void synpred20_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:5: ( 'begin' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:1787:7: 'begin'
        {
        match(input,37,FOLLOW_37_in_synpred20_InternalSequencemodel3820); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalSequencemodel

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
    public final boolean synpred19_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSequencemodel_fragment(); // can never throw exception
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
    public final boolean synpred20_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSequencemodel_fragment(); // can never throw exception
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


    protected DFA54 dfa54 = new DFA54(this);
    static final String DFA54_eotS =
        "\6\uffff";
    static final String DFA54_eofS =
        "\1\uffff\1\2\3\uffff\1\2";
    static final String DFA54_minS =
        "\1\4\1\20\1\uffff\1\5\1\uffff\1\20";
    static final String DFA54_maxS =
        "\1\54\1\53\1\uffff\1\5\1\uffff\1\53";
    static final String DFA54_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA54_specialS =
        "\6\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\2\1\1\1\2\3\uffff\2\2\40\uffff\1\2",
            "\1\2\15\uffff\1\3\1\uffff\1\2\12\uffff\1\4",
            "",
            "\1\5",
            "",
            "\1\2\15\uffff\1\3\1\uffff\1\2\12\uffff\1\4"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "2232:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x000004000000C002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleModel153 = new BitSet(new long[]{0x0000040000008002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSequence351 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_15_in_ruleSequence372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequence390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParticipant_in_ruleSequence416 = new BitSet(new long[]{0x000000003E8B0020L});
    public static final BitSet FOLLOW_16_in_ruleSequence437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParticipant_in_ruleSequence459 = new BitSet(new long[]{0x000000003E8B0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleSequence482 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_17_in_ruleSequence495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParticipant583 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleParticipant601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleParticipant624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleTransition719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_ruleTransition746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_ruleFragment838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_ruleFragment865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_ruleFragment892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_ruleFragment919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_ruleFragment946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_ruleFragment973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseFragment1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleIfElseFragment1055 = new BitSet(new long[]{0x0000100000100FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1076 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIfElseFragment1088 = new BitSet(new long[]{0x000000003EEA0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1109 = new BitSet(new long[]{0x000000003EEA0020L});
    public static final BitSet FOLLOW_21_in_ruleIfElseFragment1131 = new BitSet(new long[]{0x0000100000100FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleIfElseFragment1153 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIfElseFragment1165 = new BitSet(new long[]{0x000000003EEA0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1186 = new BitSet(new long[]{0x000000003EEA0020L});
    public static final BitSet FOLLOW_22_in_ruleIfElseFragment1210 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleIfElseFragment1232 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_17_in_ruleIfElseFragment1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment1283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachFragment1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleForeachFragment1330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_ruleForeachFragment1351 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForeachFragment1363 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleForeachFragment1384 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_17_in_ruleForeachFragment1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopFragment1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLoopFragment1480 = new BitSet(new long[]{0x0000100001000FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleLoopFragment1501 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLoopFragment1513 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleLoopFragment1534 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_17_in_ruleLoopFragment1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment1583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertFragment1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAssertFragment1630 = new BitSet(new long[]{0x0000100000100FF0L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleAssertFragment1651 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAssertFragment1663 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAssertFragment1684 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_17_in_ruleAssertFragment1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakFragment1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBreakFragment1789 = new BitSet(new long[]{0x0000100000100FF2L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleBreakFragment1811 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBreakFragment1823 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleBreakFragment1844 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_17_in_ruleBreakFragment1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_entryRuleNextFragment1895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextFragment1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNextFragment1951 = new BitSet(new long[]{0x0000100000100FF2L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_ruleNextFragment1973 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNextFragment1985 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleNextFragment2006 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_17_in_ruleNextFragment2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_ruleMessage2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_ruleMessage2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_ruleMessage2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfMessage_in_ruleMessage2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFoundMessage_in_ruleMessage2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFoundMessage_in_entryRuleFoundMessage2257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFoundMessage2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFoundMessage2304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFoundMessage2324 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFoundMessage2336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFoundMessage2364 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_31_in_ruleFoundMessage2390 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFoundMessage2423 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleFoundMessage2436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFoundMessage2457 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleFoundMessage2473 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_ruleFoundMessage2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_entryRuleCallMessage2533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallMessage2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallMessage2588 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCallMessage2600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallMessage2620 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCallMessage2632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCallMessage2649 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_31_in_ruleCallMessage2675 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCallMessage2708 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleCallMessage2721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCallMessage2742 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleCallMessage2758 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_ruleCallMessage2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_entryRuleNewMessage2818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMessage2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMessage2873 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleNewMessage2885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMessage2905 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleNewMessage2926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMessage2944 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleNewMessage2972 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNewMessage3005 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleNewMessage3018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNewMessage3039 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleNewMessage3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage3093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnMessage3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleReturnMessage3140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleReturnMessage3161 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleReturnMessage3182 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReturnMessage3215 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleReturnMessage3228 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReturnMessage3249 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleReturnMessage3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage3303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteMessage3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteMessage3358 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDeleteMessage3370 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteMessage3390 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleDeleteMessage3411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteMessage3429 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleDeleteMessage3455 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeleteMessage3488 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleDeleteMessage3501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeleteMessage3522 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleDeleteMessage3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfMessage_in_entryRuleSelfMessage3578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfMessage3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelfMessage3633 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSelfMessage3645 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSelfMessage3657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelfMessage3674 = new BitSet(new long[]{0x0000002480000002L});
    public static final BitSet FOLLOW_31_in_ruleSelfMessage3700 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelfMessage3733 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleSelfMessage3746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelfMessage3767 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleSelfMessage3783 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_ruleSelfMessage3806 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleSelfMessage3828 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleSelfMessage3850 = new BitSet(new long[]{0x000000003E8A0020L});
    public static final BitSet FOLLOW_17_in_ruleSelfMessage3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3953 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleParameter3971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference4030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleReference4088 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleReference4109 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray4146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleArray4202 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleArray4219 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleArray4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachExpression4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeachExpression4335 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleForeachExpression4353 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleForeachExpression4370 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleForeachExpression4388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleForeachExpression4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeachExpression4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces4487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueWithSpaces4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_ruleValueWithSpaces4542 = new BitSet(new long[]{0x0000100000000FF2L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueWithSpaces4575 = new BitSet(new long[]{0x0000100000000FF2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleValueWithSpaces4601 = new BitSet(new long[]{0x0000100000000FF2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleValueWithSpaces4627 = new BitSet(new long[]{0x0000100000000FF2L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAnnotation4724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation4745 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleAnnotation4758 = new BitSet(new long[]{0x0000100000000C70L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAnnotation4779 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation4792 = new BitSet(new long[]{0x0000100000000C70L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAnnotation4813 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleAnnotation4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty4865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignProperty_in_ruleProperty4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_ruleProperty4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignProperty_in_entryRuleAssignProperty4984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignProperty4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAssignProperty5040 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAssignProperty5052 = new BitSet(new long[]{0x0000100000000C70L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignProperty5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_entryRuleValueProperty5109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueProperty5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueProperty5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue5200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID5448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID5499 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleExtendedID5518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID5533 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal5583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleReal5633 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5650 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleReal5668 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5683 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleReal5703 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_46_in_ruleReal5722 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_47_in_ruleReal5737 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44_in_ruleReal5756 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger5820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInteger5870 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalSequencemodel364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred2_InternalSequencemodel429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred3_InternalSequencemodel1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred4_InternalSequencemodel1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred6_InternalSequencemodel2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred7_InternalSequencemodel2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred8_InternalSequencemodel2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred9_InternalSequencemodel2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred10_InternalSequencemodel2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred11_InternalSequencemodel2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred12_InternalSequencemodel2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred13_InternalSequencemodel3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred14_InternalSequencemodel3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred15_InternalSequencemodel3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred16_InternalSequencemodel3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred17_InternalSequencemodel3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred18_InternalSequencemodel3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred19_InternalSequencemodel3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred20_InternalSequencemodel3820 = new BitSet(new long[]{0x0000000000000002L});

}
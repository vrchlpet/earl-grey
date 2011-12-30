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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'sequence'", "'{'", "'}'", "'actor'", "':'", "'call'", "'.'", "'reply'", "'self'", "'create'", "'destroy'", "'('", "', '", "')'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
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
        	return "Sequencemodel";	
       	}
       	
       	@Override
       	protected SequencemodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSequencemodel"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:67:1: entryRuleSequencemodel returns [EObject current=null] : iv_ruleSequencemodel= ruleSequencemodel EOF ;
    public final EObject entryRuleSequencemodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencemodel = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:68:2: (iv_ruleSequencemodel= ruleSequencemodel EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:69:2: iv_ruleSequencemodel= ruleSequencemodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequencemodelRule()); 
            }
            pushFollow(FOLLOW_ruleSequencemodel_in_entryRuleSequencemodel75);
            iv_ruleSequencemodel=ruleSequencemodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequencemodel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequencemodel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSequencemodel"


    // $ANTLR start "ruleSequencemodel"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:76:1: ruleSequencemodel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_sequence_1_0= ruleSequence ) )* ) ;
    public final EObject ruleSequencemodel() throws RecognitionException {
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

                if ( (LA1_0==11) ) {
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
            	       
            	      	        newCompositeNode(grammarAccess.getSequencemodelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleSequencemodel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSequencemodelRule());
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

                if ( (LA2_0==12) ) {
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
            	       
            	      	        newCompositeNode(grammarAccess.getSequencemodelAccess().getSequenceSequenceParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSequence_in_ruleSequencemodel153);
            	    lv_sequence_1_0=ruleSequence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSequencemodelRule());
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
    // $ANTLR end "ruleSequencemodel"


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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport237); if (state.failed) return current;
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


    // $ANTLR start "entryRuleIdentifier"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:167:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:168:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:169:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier296);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier307); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:176:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:179:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:180:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:188:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentifier373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleSequence"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:203:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:204:2: (iv_ruleSequence= ruleSequence EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:205:2: iv_ruleSequence= ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence418);
            iv_ruleSequence=ruleSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence428); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:212:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'sequence' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_lifeline_3_0= ruleLifeline ) )+ ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= '}' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_lifeline_3_0 = null;

        EObject lv_transition_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:215:28: ( (otherlv_0= 'sequence' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_lifeline_3_0= ruleLifeline ) )+ ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= '}' ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:216:1: (otherlv_0= 'sequence' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_lifeline_3_0= ruleLifeline ) )+ ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= '}' )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:216:1: (otherlv_0= 'sequence' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_lifeline_3_0= ruleLifeline ) )+ ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= '}' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:216:3: otherlv_0= 'sequence' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_lifeline_3_0= ruleLifeline ) )+ ( (lv_transition_4_0= ruleTransition ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSequence465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:220:1: ( (lv_name_1_0= ruleIdentifier ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:221:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:221:1: (lv_name_1_0= ruleIdentifier )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:222:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequenceAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleSequence486);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSequenceRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSequence498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:242:1: ( (lv_lifeline_3_0= ruleLifeline ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==16) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:243:1: (lv_lifeline_3_0= ruleLifeline )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:243:1: (lv_lifeline_3_0= ruleLifeline )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:244:3: lv_lifeline_3_0= ruleLifeline
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSequenceAccess().getLifelineLifelineParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLifeline_in_ruleSequence519);
            	    lv_lifeline_3_0=ruleLifeline();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"lifeline",
            	              		lv_lifeline_3_0, 
            	              		"Lifeline");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:260:3: ( (lv_transition_4_0= ruleTransition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:261:1: (lv_transition_4_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:261:1: (lv_transition_4_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:262:3: lv_transition_4_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSequenceAccess().getTransitionTransitionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleSequence541);
            	    lv_transition_4_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSequenceRule());
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
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSequence554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5());
                  
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


    // $ANTLR start "entryRuleLifelineName"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:290:1: entryRuleLifelineName returns [String current=null] : iv_ruleLifelineName= ruleLifelineName EOF ;
    public final String entryRuleLifelineName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLifelineName = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:291:2: (iv_ruleLifelineName= ruleLifelineName EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:292:2: iv_ruleLifelineName= ruleLifelineName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLifelineNameRule()); 
            }
            pushFollow(FOLLOW_ruleLifelineName_in_entryRuleLifelineName591);
            iv_ruleLifelineName=ruleLifelineName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLifelineName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLifelineName602); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLifelineName"


    // $ANTLR start "ruleLifelineName"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:299:1: ruleLifelineName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleLifelineName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:302:28: (this_ID_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:303:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLifelineName641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getLifelineNameAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleLifelineName"


    // $ANTLR start "entryRuleLifeline"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:318:1: entryRuleLifeline returns [EObject current=null] : iv_ruleLifeline= ruleLifeline EOF ;
    public final EObject entryRuleLifeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLifeline = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:319:2: (iv_ruleLifeline= ruleLifeline EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:320:2: iv_ruleLifeline= ruleLifeline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLifelineRule()); 
            }
            pushFollow(FOLLOW_ruleLifeline_in_entryRuleLifeline685);
            iv_ruleLifeline=ruleLifeline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLifeline; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLifeline695); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLifeline"


    // $ANTLR start "ruleLifeline"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:327:1: ruleLifeline returns [EObject current=null] : ( ( (lv_actor_0_0= 'actor' ) )? ( (lv_name_1_0= ruleLifelineName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLifeline() throws RecognitionException {
        EObject current = null;

        Token lv_actor_0_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:330:28: ( ( ( (lv_actor_0_0= 'actor' ) )? ( (lv_name_1_0= ruleLifelineName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:331:1: ( ( (lv_actor_0_0= 'actor' ) )? ( (lv_name_1_0= ruleLifelineName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:331:1: ( ( (lv_actor_0_0= 'actor' ) )? ( (lv_name_1_0= ruleLifelineName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:331:2: ( (lv_actor_0_0= 'actor' ) )? ( (lv_name_1_0= ruleLifelineName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:331:2: ( (lv_actor_0_0= 'actor' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:332:1: (lv_actor_0_0= 'actor' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:332:1: (lv_actor_0_0= 'actor' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:333:3: lv_actor_0_0= 'actor'
                    {
                    lv_actor_0_0=(Token)match(input,15,FOLLOW_15_in_ruleLifeline738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_actor_0_0, grammarAccess.getLifelineAccess().getActorActorKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLifelineRule());
                      	        }
                             		setWithLastConsumed(current, "actor", true, "actor");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:346:3: ( (lv_name_1_0= ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:347:1: (lv_name_1_0= ruleLifelineName )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:347:1: (lv_name_1_0= ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:348:3: lv_name_1_0= ruleLifelineName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLifelineAccess().getNameLifelineNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLifelineName_in_ruleLifeline773);
            lv_name_1_0=ruleLifelineName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLifelineRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"LifelineName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleLifeline785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLifelineAccess().getColonKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:368:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:369:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:369:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:370:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLifelineRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLifelineAccess().getEntityEntityCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLifeline808);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleLifeline"


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:391:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:392:2: (iv_ruleTransition= ruleTransition EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:393:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition844);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition854); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:400:1: ruleTransition returns [EObject current=null] : ( ( ( ruleLifelineName ) ) ( (lv_statement_1_0= ruleStatement ) )+ ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:403:28: ( ( ( ( ruleLifelineName ) ) ( (lv_statement_1_0= ruleStatement ) )+ ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:404:1: ( ( ( ruleLifelineName ) ) ( (lv_statement_1_0= ruleStatement ) )+ )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:404:1: ( ( ( ruleLifelineName ) ) ( (lv_statement_1_0= ruleStatement ) )+ )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:404:2: ( ( ruleLifelineName ) ) ( (lv_statement_1_0= ruleStatement ) )+
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:404:2: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:405:1: ( ruleLifelineName )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:405:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:406:3: ruleLifelineName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getCallerLifelineCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLifelineName_in_ruleTransition902);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:419:2: ( (lv_statement_1_0= ruleStatement ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||(LA7_0>=19 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:420:1: (lv_statement_1_0= ruleStatement )
            	    {
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:420:1: (lv_statement_1_0= ruleStatement )
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:421:3: lv_statement_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getStatementStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTransition923);
            	    lv_statement_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statement",
            	              		lv_statement_1_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleStatement"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:445:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:446:2: (iv_ruleStatement= ruleStatement EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:447:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement960);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement970); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:454:1: ruleStatement returns [EObject current=null] : (this_Call_0= ruleCall | this_Reply_1= ruleReply | this_Self_2= ruleSelf | this_Create_3= ruleCreate | this_Destroy_4= ruleDestroy ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Call_0 = null;

        EObject this_Reply_1 = null;

        EObject this_Self_2 = null;

        EObject this_Create_3 = null;

        EObject this_Destroy_4 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:457:28: ( (this_Call_0= ruleCall | this_Reply_1= ruleReply | this_Self_2= ruleSelf | this_Create_3= ruleCreate | this_Destroy_4= ruleDestroy ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:458:1: (this_Call_0= ruleCall | this_Reply_1= ruleReply | this_Self_2= ruleSelf | this_Create_3= ruleCreate | this_Destroy_4= ruleDestroy )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:458:1: (this_Call_0= ruleCall | this_Reply_1= ruleReply | this_Self_2= ruleSelf | this_Create_3= ruleCreate | this_Destroy_4= ruleDestroy )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
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
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:459:5: this_Call_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleStatement1017);
                    this_Call_0=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Call_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:469:5: this_Reply_1= ruleReply
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReplyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReply_in_ruleStatement1044);
                    this_Reply_1=ruleReply();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Reply_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:479:5: this_Self_2= ruleSelf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSelfParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelf_in_ruleStatement1071);
                    this_Self_2=ruleSelf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Self_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:489:5: this_Create_3= ruleCreate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCreateParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreate_in_ruleStatement1098);
                    this_Create_3=ruleCreate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Create_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:499:5: this_Destroy_4= ruleDestroy
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDestroyParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDestroy_in_ruleStatement1125);
                    this_Destroy_4=ruleDestroy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Destroy_4; 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCall"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:515:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:516:2: (iv_ruleCall= ruleCall EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:517:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1160);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1170); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:524:1: ruleCall returns [EObject current=null] : (otherlv_0= 'call' ( ( ruleLifelineName ) ) ( ( ( '.' )=>otherlv_2= '.' ) ( (lv_message_3_0= ruleMessage ) ) ) ( ( ( ':' )=>otherlv_4= ':' ) ( (lv_reply_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_reply_5_0=null;
        EObject lv_message_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:527:28: ( (otherlv_0= 'call' ( ( ruleLifelineName ) ) ( ( ( '.' )=>otherlv_2= '.' ) ( (lv_message_3_0= ruleMessage ) ) ) ( ( ( ':' )=>otherlv_4= ':' ) ( (lv_reply_5_0= RULE_ID ) ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:528:1: (otherlv_0= 'call' ( ( ruleLifelineName ) ) ( ( ( '.' )=>otherlv_2= '.' ) ( (lv_message_3_0= ruleMessage ) ) ) ( ( ( ':' )=>otherlv_4= ':' ) ( (lv_reply_5_0= RULE_ID ) ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:528:1: (otherlv_0= 'call' ( ( ruleLifelineName ) ) ( ( ( '.' )=>otherlv_2= '.' ) ( (lv_message_3_0= ruleMessage ) ) ) ( ( ( ':' )=>otherlv_4= ':' ) ( (lv_reply_5_0= RULE_ID ) ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:528:3: otherlv_0= 'call' ( ( ruleLifelineName ) ) ( ( ( '.' )=>otherlv_2= '.' ) ( (lv_message_3_0= ruleMessage ) ) ) ( ( ( ':' )=>otherlv_4= ':' ) ( (lv_reply_5_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleCall1207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:532:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:533:1: ( ruleLifelineName )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:533:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:534:3: ruleLifelineName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCallAccess().getCalledLifelineCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLifelineName_in_ruleCall1230);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:547:2: ( ( ( '.' )=>otherlv_2= '.' ) ( (lv_message_3_0= ruleMessage ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:547:3: ( ( '.' )=>otherlv_2= '.' ) ( (lv_message_3_0= ruleMessage ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:547:3: ( ( '.' )=>otherlv_2= '.' )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:547:4: ( '.' )=>otherlv_2= '.'
            {
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleCall1251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCallAccess().getFullStopKeyword_2_0());
                  
            }

            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:552:2: ( (lv_message_3_0= ruleMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:553:1: (lv_message_3_0= ruleMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:553:1: (lv_message_3_0= ruleMessage )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:554:3: lv_message_3_0= ruleMessage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCallAccess().getMessageMessageParserRuleCall_2_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessage_in_ruleCall1273);
            lv_message_3_0=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCallRule());
              	        }
                     		set(
                     			current, 
                     			"message",
                      		lv_message_3_0, 
                      		"Message");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:570:3: ( ( ( ':' )=>otherlv_4= ':' ) ( (lv_reply_5_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) && (synpred2_InternalSequencemodel())) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:570:4: ( ( ':' )=>otherlv_4= ':' ) ( (lv_reply_5_0= RULE_ID ) )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:570:4: ( ( ':' )=>otherlv_4= ':' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:570:5: ( ':' )=>otherlv_4= ':'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleCall1295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCallAccess().getColonKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:575:2: ( (lv_reply_5_0= RULE_ID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:576:1: (lv_reply_5_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:576:1: (lv_reply_5_0= RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:577:3: lv_reply_5_0= RULE_ID
                    {
                    lv_reply_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall1313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_reply_5_0, grammarAccess.getCallAccess().getReplyIDTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCallRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"reply",
                              		lv_reply_5_0, 
                              		"ID");
                      	    
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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleReply"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:601:1: entryRuleReply returns [EObject current=null] : iv_ruleReply= ruleReply EOF ;
    public final EObject entryRuleReply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReply = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:602:2: (iv_ruleReply= ruleReply EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:603:2: iv_ruleReply= ruleReply EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReplyRule()); 
            }
            pushFollow(FOLLOW_ruleReply_in_entryRuleReply1356);
            iv_ruleReply=ruleReply();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReply; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReply1366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReply"


    // $ANTLR start "ruleReply"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:610:1: ruleReply returns [EObject current=null] : (otherlv_0= 'reply' ( ( ruleLifelineName ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleReply() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_reply_3_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:613:28: ( (otherlv_0= 'reply' ( ( ruleLifelineName ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:614:1: (otherlv_0= 'reply' ( ( ruleLifelineName ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:614:1: (otherlv_0= 'reply' ( ( ruleLifelineName ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:614:3: otherlv_0= 'reply' ( ( ruleLifelineName ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleReply1403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReplyAccess().getReplyKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:618:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:619:1: ( ruleLifelineName )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:619:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:620:3: ruleLifelineName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReplyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReplyAccess().getCalledLifelineCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLifelineName_in_ruleReply1426);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:633:2: ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) && (synpred3_InternalSequencemodel())) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:633:3: ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:633:3: ( ( ':' )=>otherlv_2= ':' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:633:4: ( ':' )=>otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleReply1447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReplyAccess().getColonKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:638:2: ( (lv_reply_3_0= RULE_ID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:639:1: (lv_reply_3_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:639:1: (lv_reply_3_0= RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:640:3: lv_reply_3_0= RULE_ID
                    {
                    lv_reply_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReply1465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_reply_3_0, grammarAccess.getReplyAccess().getReplyIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReplyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"reply",
                              		lv_reply_3_0, 
                              		"ID");
                      	    
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
    // $ANTLR end "ruleReply"


    // $ANTLR start "entryRuleSelf"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:664:1: entryRuleSelf returns [EObject current=null] : iv_ruleSelf= ruleSelf EOF ;
    public final EObject entryRuleSelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelf = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:665:2: (iv_ruleSelf= ruleSelf EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:666:2: iv_ruleSelf= ruleSelf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfRule()); 
            }
            pushFollow(FOLLOW_ruleSelf_in_entryRuleSelf1508);
            iv_ruleSelf=ruleSelf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelf1518); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelf"


    // $ANTLR start "ruleSelf"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:673:1: ruleSelf returns [EObject current=null] : (otherlv_0= 'self' ( (lv_message_1_0= ruleMessage ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_reply_3_0=null;
        EObject lv_message_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:676:28: ( (otherlv_0= 'self' ( (lv_message_1_0= ruleMessage ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:677:1: (otherlv_0= 'self' ( (lv_message_1_0= ruleMessage ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:677:1: (otherlv_0= 'self' ( (lv_message_1_0= ruleMessage ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:677:3: otherlv_0= 'self' ( (lv_message_1_0= ruleMessage ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSelf1555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelfAccess().getSelfKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:681:1: ( (lv_message_1_0= ruleMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:682:1: (lv_message_1_0= ruleMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:682:1: (lv_message_1_0= ruleMessage )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:683:3: lv_message_1_0= ruleMessage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelfAccess().getMessageMessageParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMessage_in_ruleSelf1576);
            lv_message_1_0=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelfRule());
              	        }
                     		set(
                     			current, 
                     			"message",
                      		lv_message_1_0, 
                      		"Message");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:699:2: ( ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) && (synpred4_InternalSequencemodel())) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:699:3: ( ( ':' )=>otherlv_2= ':' ) ( (lv_reply_3_0= RULE_ID ) )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:699:3: ( ( ':' )=>otherlv_2= ':' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:699:4: ( ':' )=>otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSelf1597); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSelfAccess().getColonKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:704:2: ( (lv_reply_3_0= RULE_ID ) )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:705:1: (lv_reply_3_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:705:1: (lv_reply_3_0= RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:706:3: lv_reply_3_0= RULE_ID
                    {
                    lv_reply_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelf1615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_reply_3_0, grammarAccess.getSelfAccess().getReplyIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelfRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"reply",
                              		lv_reply_3_0, 
                              		"ID");
                      	    
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
    // $ANTLR end "ruleSelf"


    // $ANTLR start "entryRuleCreate"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:730:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:731:2: (iv_ruleCreate= ruleCreate EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:732:2: iv_ruleCreate= ruleCreate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateRule()); 
            }
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate1658);
            iv_ruleCreate=ruleCreate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate1668); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:739:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'create' ( ( ruleLifelineName ) ) ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:742:28: ( (otherlv_0= 'create' ( ( ruleLifelineName ) ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:743:1: (otherlv_0= 'create' ( ( ruleLifelineName ) ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:743:1: (otherlv_0= 'create' ( ( ruleLifelineName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:743:3: otherlv_0= 'create' ( ( ruleLifelineName ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCreate1705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCreateKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:747:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:748:1: ( ruleLifelineName )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:748:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:749:3: ruleLifelineName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateAccess().getCalledLifelineCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLifelineName_in_ruleCreate1728);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleDestroy"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:770:1: entryRuleDestroy returns [EObject current=null] : iv_ruleDestroy= ruleDestroy EOF ;
    public final EObject entryRuleDestroy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroy = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:771:2: (iv_ruleDestroy= ruleDestroy EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:772:2: iv_ruleDestroy= ruleDestroy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDestroyRule()); 
            }
            pushFollow(FOLLOW_ruleDestroy_in_entryRuleDestroy1764);
            iv_ruleDestroy=ruleDestroy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDestroy; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDestroy1774); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDestroy"


    // $ANTLR start "ruleDestroy"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:779:1: ruleDestroy returns [EObject current=null] : (otherlv_0= 'destroy' ( ( ruleLifelineName ) ) ) ;
    public final EObject ruleDestroy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:782:28: ( (otherlv_0= 'destroy' ( ( ruleLifelineName ) ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:783:1: (otherlv_0= 'destroy' ( ( ruleLifelineName ) ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:783:1: (otherlv_0= 'destroy' ( ( ruleLifelineName ) ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:783:3: otherlv_0= 'destroy' ( ( ruleLifelineName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDestroy1811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDestroyAccess().getDestroyKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:787:1: ( ( ruleLifelineName ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:788:1: ( ruleLifelineName )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:788:1: ( ruleLifelineName )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:789:3: ruleLifelineName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDestroyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDestroyAccess().getCalledLifelineCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLifelineName_in_ruleDestroy1834);
            ruleLifelineName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleDestroy"


    // $ANTLR start "entryRuleMessage"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:810:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:811:2: (iv_ruleMessage= ruleMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:812:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1870);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1880); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:819:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_1= '(' ) ( ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_param_2_0=null;
        Token otherlv_3=null;
        Token lv_param_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:822:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_1= '(' ) ( ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:823:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_1= '(' ) ( ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:823:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_1= '(' ) ( ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )? )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:823:2: ( (lv_name_0_0= RULE_ID ) ) ( ( ( '(' )=>otherlv_1= '(' ) ( ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )?
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:823:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:824:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:824:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:825:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:841:2: ( ( ( '(' )=>otherlv_1= '(' ) ( ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) && (synpred5_InternalSequencemodel())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:841:3: ( ( '(' )=>otherlv_1= '(' ) ( ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )* )? otherlv_5= ')'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:841:3: ( ( '(' )=>otherlv_1= '(' )
                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:841:4: ( '(' )=>otherlv_1= '('
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleMessage1948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:846:2: ( ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:846:3: ( (lv_param_2_0= RULE_ID ) ) ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )*
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:846:3: ( (lv_param_2_0= RULE_ID ) )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:847:1: (lv_param_2_0= RULE_ID )
                            {
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:847:1: (lv_param_2_0= RULE_ID )
                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:848:3: lv_param_2_0= RULE_ID
                            {
                            lv_param_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1967); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_param_2_0, grammarAccess.getMessageAccess().getParamIDTerminalRuleCall_1_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getMessageRule());
                              	        }
                                     		addWithLastConsumed(
                                     			current, 
                                     			"param",
                                      		lv_param_2_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:864:2: ( ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==24) && (synpred6_InternalSequencemodel())) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:864:3: ( ( ', ' )=>otherlv_3= ', ' ) ( (lv_param_4_0= RULE_ID ) )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:864:3: ( ( ', ' )=>otherlv_3= ', ' )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:864:4: ( ', ' )=>otherlv_3= ', '
                            	    {
                            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleMessage1993); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getCommaSpaceKeyword_1_1_1_0());
                            	          
                            	    }

                            	    }

                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:869:2: ( (lv_param_4_0= RULE_ID ) )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:870:1: (lv_param_4_0= RULE_ID )
                            	    {
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:870:1: (lv_param_4_0= RULE_ID )
                            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:871:3: lv_param_4_0= RULE_ID
                            	    {
                            	    lv_param_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage2011); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      			newLeafNode(lv_param_4_0, grammarAccess.getMessageAccess().getParamIDTerminalRuleCall_1_1_1_1_0()); 
                            	      		
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getMessageRule());
                            	      	        }
                            	             		addWithLastConsumed(
                            	             			current, 
                            	             			"param",
                            	              		lv_param_4_0, 
                            	              		"ID");
                            	      	    
                            	    }

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

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleMessage2032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:899:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:900:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:901:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2071);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2082); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:908:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:911:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:912:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:912:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:912:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:919:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:920:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedName2141); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2156); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleQualifiedName"

    // $ANTLR start synpred2_InternalSequencemodel
    public final void synpred2_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:570:5: ( ':' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:570:7: ':'
        {
        match(input,16,FOLLOW_16_in_synpred2_InternalSequencemodel1287); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSequencemodel

    // $ANTLR start synpred3_InternalSequencemodel
    public final void synpred3_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:633:4: ( ':' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:633:6: ':'
        {
        match(input,16,FOLLOW_16_in_synpred3_InternalSequencemodel1439); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSequencemodel

    // $ANTLR start synpred4_InternalSequencemodel
    public final void synpred4_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:699:4: ( ':' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:699:6: ':'
        {
        match(input,16,FOLLOW_16_in_synpred4_InternalSequencemodel1589); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalSequencemodel

    // $ANTLR start synpred5_InternalSequencemodel
    public final void synpred5_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:841:4: ( '(' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:841:6: '('
        {
        match(input,23,FOLLOW_23_in_synpred5_InternalSequencemodel1940); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalSequencemodel

    // $ANTLR start synpred6_InternalSequencemodel
    public final void synpred6_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:864:4: ( ', ' )
        // ../cz.cvut.earlgrey.sequencemodel/src-gen/cz/cvut/earlgrey/sequencemodel/parser/antlr/internal/InternalSequencemodel.g:864:6: ', '
        {
        match(input,24,FOLLOW_24_in_synpred6_InternalSequencemodel1985); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalSequencemodel

    // Delegated rules

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


 

    public static final BitSet FOLLOW_ruleSequencemodel_in_entryRuleSequencemodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencemodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleSequencemodel131 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleSequencemodel153 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentifier373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSequence465 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSequence486 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSequence498 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleLifeline_in_ruleSequence519 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleSequence541 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_14_in_ruleSequence554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_entryRuleLifelineName591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLifelineName602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLifelineName641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifeline_in_entryRuleLifeline685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLifeline695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLifeline738 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleLifelineName_in_ruleLifeline773 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLifeline785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLifeline808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifelineName_in_ruleTransition902 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTransition923 = new BitSet(new long[]{0x00000000007A0002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleStatement1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReply_in_ruleStatement1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelf_in_ruleStatement1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_ruleStatement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroy_in_ruleStatement1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCall1207 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleLifelineName_in_ruleCall1230 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCall1251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleCall1273 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleCall1295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReply_in_entryRuleReply1356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReply1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleReply1403 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleLifelineName_in_ruleReply1426 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleReply1447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReply1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelf_in_entryRuleSelf1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelf1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSelf1555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleSelf1576 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleSelf1597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelf1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate1658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCreate1705 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleLifelineName_in_ruleCreate1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDestroy_in_entryRuleDestroy1764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDestroy1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDestroy1811 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleLifelineName_in_ruleDestroy1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1922 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleMessage1948 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1967 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleMessage1993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage2011 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleMessage2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2122 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedName2141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2156 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16_in_synpred2_InternalSequencemodel1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred3_InternalSequencemodel1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred4_InternalSequencemodel1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalSequencemodel1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred6_InternalSequencemodel1985 = new BitSet(new long[]{0x0000000000000002L});

}
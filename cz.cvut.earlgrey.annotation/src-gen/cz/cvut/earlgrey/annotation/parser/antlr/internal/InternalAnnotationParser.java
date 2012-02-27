package cz.cvut.earlgrey.annotation.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cz.cvut.earlgrey.annotation.services.AnnotationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAnnotationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_NULL", "RULE_ID", "RULE_NATURAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'('", "','", "')'", "'='", "'.'", "'-'", "'e'", "'E'", "'+'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_NULL=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalAnnotationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationParser.tokenNames; }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g"; }



     	private AnnotationGrammarAccess grammarAccess;
     	
        public InternalAnnotationParser(TokenStream input, AnnotationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Annotation";	
       	}
       	
       	@Override
       	protected AnnotationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAnnotation"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:67:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:68:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:69:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation75);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation85); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:76:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:79:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:80:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:80:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:80:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleAnnotation122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:84:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:85:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:85:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:86:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation143);
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

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:102:2: ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) && (synpred1_InternalAnnotation())) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:102:3: ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:102:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:102:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAnnotation164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:107:2: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:108:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:108:1: (lv_parameter_3_0= ruleParameter )
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:109:3: lv_parameter_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation186);
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

                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:125:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:125:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAnnotation199); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:129:1: ( (lv_parameter_5_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:130:1: (lv_parameter_5_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:130:1: (lv_parameter_5_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:131:3: lv_parameter_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation220);
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
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation234); if (state.failed) return current;
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


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:159:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:160:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:161:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter272);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter282); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:168:1: ruleParameter returns [EObject current=null] : (this_AssignParameter_0= ruleAssignParameter | this_ValueParameter_1= ruleValueParameter ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_AssignParameter_0 = null;

        EObject this_ValueParameter_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:171:28: ( (this_AssignParameter_0= ruleAssignParameter | this_ValueParameter_1= ruleValueParameter ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:172:1: (this_AssignParameter_0= ruleAssignParameter | this_ValueParameter_1= ruleValueParameter )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:172:1: (this_AssignParameter_0= ruleAssignParameter | this_ValueParameter_1= ruleValueParameter )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:173:5: this_AssignParameter_0= ruleAssignParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getAssignParameterParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignParameter_in_ruleParameter329);
                    this_AssignParameter_0=ruleAssignParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssignParameter_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:183:5: this_ValueParameter_1= ruleValueParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterAccess().getValueParameterParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueParameter_in_ruleParameter356);
                    this_ValueParameter_1=ruleValueParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueParameter_1; 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAssignParameter"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:199:1: entryRuleAssignParameter returns [EObject current=null] : iv_ruleAssignParameter= ruleAssignParameter EOF ;
    public final EObject entryRuleAssignParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignParameter = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:200:2: (iv_ruleAssignParameter= ruleAssignParameter EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:201:2: iv_ruleAssignParameter= ruleAssignParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignParameterRule()); 
            }
            pushFollow(FOLLOW_ruleAssignParameter_in_entryRuleAssignParameter391);
            iv_ruleAssignParameter=ruleAssignParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignParameter401); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignParameter"


    // $ANTLR start "ruleAssignParameter"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:208:1: ruleAssignParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:211:28: ( ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:212:1: ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:212:1: ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:212:2: ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:212:2: ( (lv_name_0_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:213:1: (lv_name_0_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:213:1: (lv_name_0_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:214:3: lv_name_0_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignParameterAccess().getNameExtendedIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAssignParameter447);
            lv_name_0_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignParameterRule());
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAssignParameter459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignParameterAccess().getEqualsSignKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:234:1: ( (lv_value_2_0= ruleValue ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:235:1: (lv_value_2_0= ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:235:1: (lv_value_2_0= ruleValue )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:236:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignParameterAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleAssignParameter480);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignParameterRule());
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
    // $ANTLR end "ruleAssignParameter"


    // $ANTLR start "entryRuleValueParameter"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:260:1: entryRuleValueParameter returns [EObject current=null] : iv_ruleValueParameter= ruleValueParameter EOF ;
    public final EObject entryRuleValueParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueParameter = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:261:2: (iv_ruleValueParameter= ruleValueParameter EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:262:2: iv_ruleValueParameter= ruleValueParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueParameterRule()); 
            }
            pushFollow(FOLLOW_ruleValueParameter_in_entryRuleValueParameter516);
            iv_ruleValueParameter=ruleValueParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueParameter526); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueParameter"


    // $ANTLR start "ruleValueParameter"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:269:1: ruleValueParameter returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleValueParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:272:28: ( ( (lv_value_0_0= ruleValue ) ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:273:1: ( (lv_value_0_0= ruleValue ) )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:273:1: ( (lv_value_0_0= ruleValue ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:274:1: (lv_value_0_0= ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:274:1: (lv_value_0_0= ruleValue )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:275:3: lv_value_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueParameterAccess().getValueValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValueParameter571);
            lv_value_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueParameterRule());
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
    // $ANTLR end "ruleValueParameter"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:299:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:300:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:301:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue607);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue618); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:308:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:311:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:312:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:312:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_NATURAL) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==18) ) {
                        alt4=6;
                    }
                    else if ( (LA4_2==EOF||(LA4_2>=15 && LA4_2<=16)) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==18) ) {
                    alt4=6;
                }
                else if ( (LA4_2==EOF||(LA4_2>=15 && LA4_2<=16)) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt4=4;
                }
                break;
            case RULE_NULL:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:313:5: this_Integer_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue665);
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
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:324:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:333:5: this_ExtendedID_2= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue724);
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
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:344:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:352:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:361:5: this_Real_5= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleValue809);
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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:379:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:380:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:381:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID855);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID866); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:388:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:391:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:392:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:392:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:392:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:399:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:400:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleExtendedID925); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID940); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:420:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:421:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:422:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal988);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal999); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:429:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:432:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:433:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:433:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:433:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:433:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:434:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleReal1038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal1055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,18,FOLLOW_18_in_ruleReal1073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                  
            }
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal1088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                  
            }
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:459:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=20 && LA9_0<=21)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:459:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:459:2: (kw= 'e' | kw= 'E' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==21) ) {
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
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:460:2: kw= 'e'
                            {
                            kw=(Token)match(input,20,FOLLOW_20_in_ruleReal1108); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:467:2: kw= 'E'
                            {
                            kw=(Token)match(input,21,FOLLOW_21_in_ruleReal1127); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:472:2: (kw= '+' | kw= '-' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==22) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==19) ) {
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
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:473:2: kw= '+'
                            {
                            kw=(Token)match(input,22,FOLLOW_22_in_ruleReal1142); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:480:2: kw= '-'
                            {
                            kw=(Token)match(input,19,FOLLOW_19_in_ruleReal1161); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal1177); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:500:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:501:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:502:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger1225);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger1236); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:509:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:512:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:513:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:513:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:513:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:513:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:514:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleInteger1275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger1292); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalAnnotation
    public final void synpred1_InternalAnnotation_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:102:4: ( '(' )
        // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:102:6: '('
        {
        match(input,14,FOLLOW_14_in_synpred1_InternalAnnotation156); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAnnotation

    // Delegated rules

    public final boolean synpred1_InternalAnnotation() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAnnotation_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\1\uffff\1\2\3\uffff\1\2";
    static final String DFA3_minS =
        "\1\4\1\17\1\uffff\1\7\1\uffff\1\17";
    static final String DFA3_maxS =
        "\1\23\1\22\1\uffff\1\7\1\uffff\1\22";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\3\2\1\1\1\2\12\uffff\1\2",
            "\2\2\1\4\1\3",
            "",
            "\1\5",
            "",
            "\2\2\1\4\1\3"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "172:1: (this_AssignParameter_0= ruleAssignParameter | this_ValueParameter_1= ruleValueParameter )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAnnotation122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation143 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAnnotation164 = new BitSet(new long[]{0x00000000000801F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation186 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleAnnotation199 = new BitSet(new long[]{0x00000000000801F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation220 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignParameter_in_ruleParameter329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueParameter_in_ruleParameter356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignParameter_in_entryRuleAssignParameter391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignParameter401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAssignParameter447 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssignParameter459 = new BitSet(new long[]{0x00000000000801F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignParameter480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueParameter_in_entryRuleValueParameter516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueParameter526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueParameter571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID906 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleExtendedID925 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID940 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleReal1038 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal1055 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReal1073 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal1088 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleReal1108 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_21_in_ruleReal1127 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleReal1142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19_in_ruleReal1161 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleInteger1275 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred1_InternalAnnotation156 = new BitSet(new long[]{0x0000000000000002L});

}
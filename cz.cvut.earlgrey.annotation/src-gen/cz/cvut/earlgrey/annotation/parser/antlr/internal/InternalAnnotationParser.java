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

@SuppressWarnings("all")
public class InternalAnnotationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_NULL", "RULE_ID", "RULE_NATURAL", "RULE_OPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'('", "','", "')'", "'='", "'.'", "'-'", "'e'", "'E'", "'+'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_NULL=6;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_OPERATOR=9;
    public static final int RULE_WS=12;

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
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation75);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation85); 

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:76:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? ) ;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:79:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:80:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:80:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:80:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAnnotation122); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:84:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:85:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:85:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:86:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation143);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


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

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:102:2: (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:102:4: otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAnnotation156); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:106:1: ( (lv_property_3_0= ruleProperty ) )
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:107:1: (lv_property_3_0= ruleProperty )
                    {
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:107:1: (lv_property_3_0= ruleProperty )
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:108:3: lv_property_3_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperty_in_ruleAnnotation177);
                    lv_property_3_0=ruleProperty();

                    state._fsp--;


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

                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:124:2: (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:124:4: otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation190); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:128:1: ( (lv_property_5_0= ruleProperty ) )
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:129:1: (lv_property_5_0= ruleProperty )
                    	    {
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:129:1: (lv_property_5_0= ruleProperty )
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:130:3: lv_property_5_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleAnnotation211);
                    	    lv_property_5_0=ruleProperty();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAnnotation225); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
                        

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleProperty"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:158:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:159:2: (iv_ruleProperty= ruleProperty EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:160:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty263);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty273); 

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:167:1: ruleProperty returns [EObject current=null] : (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_AssignProperty_0 = null;

        EObject this_ValueProperty_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:170:28: ( (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:171:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:171:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:172:5: this_AssignProperty_0= ruleAssignProperty
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getAssignPropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAssignProperty_in_ruleProperty320);
                    this_AssignProperty_0=ruleAssignProperty();

                    state._fsp--;

                     
                            current = this_AssignProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:182:5: this_ValueProperty_1= ruleValueProperty
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleValueProperty_in_ruleProperty347);
                    this_ValueProperty_1=ruleValueProperty();

                    state._fsp--;

                     
                            current = this_ValueProperty_1; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssignProperty"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:198:1: entryRuleAssignProperty returns [EObject current=null] : iv_ruleAssignProperty= ruleAssignProperty EOF ;
    public final EObject entryRuleAssignProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignProperty = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:199:2: (iv_ruleAssignProperty= ruleAssignProperty EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:200:2: iv_ruleAssignProperty= ruleAssignProperty EOF
            {
             newCompositeNode(grammarAccess.getAssignPropertyRule()); 
            pushFollow(FOLLOW_ruleAssignProperty_in_entryRuleAssignProperty382);
            iv_ruleAssignProperty=ruleAssignProperty();

            state._fsp--;

             current =iv_ruleAssignProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignProperty392); 

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:207:1: ruleAssignProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:210:28: ( ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:211:1: ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:211:1: ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:211:2: ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:211:2: ( (lv_name_0_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:212:1: (lv_name_0_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:212:1: (lv_name_0_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:213:3: lv_name_0_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getAssignPropertyAccess().getNameExtendedIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAssignProperty438);
            lv_name_0_0=ruleExtendedID();

            state._fsp--;


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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssignProperty450); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignPropertyAccess().getEqualsSignKeyword_1());
                
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:233:1: ( (lv_value_2_0= ruleValue ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:234:1: (lv_value_2_0= ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:234:1: (lv_value_2_0= ruleValue )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:235:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getAssignPropertyAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAssignProperty471);
            lv_value_2_0=ruleValue();

            state._fsp--;


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
    // $ANTLR end "ruleAssignProperty"


    // $ANTLR start "entryRuleValueProperty"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:259:1: entryRuleValueProperty returns [EObject current=null] : iv_ruleValueProperty= ruleValueProperty EOF ;
    public final EObject entryRuleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueProperty = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:260:2: (iv_ruleValueProperty= ruleValueProperty EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:261:2: iv_ruleValueProperty= ruleValueProperty EOF
            {
             newCompositeNode(grammarAccess.getValuePropertyRule()); 
            pushFollow(FOLLOW_ruleValueProperty_in_entryRuleValueProperty507);
            iv_ruleValueProperty=ruleValueProperty();

            state._fsp--;

             current =iv_ruleValueProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueProperty517); 

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:268:1: ruleValueProperty returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleValueProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:271:28: ( ( (lv_value_0_0= ruleValue ) ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:272:1: ( (lv_value_0_0= ruleValue ) )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:272:1: ( (lv_value_0_0= ruleValue ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:273:1: (lv_value_0_0= ruleValue )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:273:1: (lv_value_0_0= ruleValue )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:274:3: lv_value_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getValuePropertyAccess().getValueValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleValueProperty562);
            lv_value_0_0=ruleValue();

            state._fsp--;


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
    // $ANTLR end "ruleValueProperty"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:298:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:299:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:300:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue598);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue609); 

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:307:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:310:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:311:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:311:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_NATURAL) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==EOF||(LA4_2>=16 && LA4_2<=17)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==19) ) {
                        alt4=6;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||(LA4_2>=16 && LA4_2<=17)) ) {
                    alt4=1;
                }
                else if ( (LA4_2==19) ) {
                    alt4=6;
                }
                else {
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
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:312:5: this_Integer_0= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue656);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    		current.merge(this_Integer_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:323:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue682); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:332:5: this_ExtendedID_2= ruleExtendedID
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue715);
                    this_ExtendedID_2=ruleExtendedID();

                    state._fsp--;


                    		current.merge(this_ExtendedID_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:343:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue741); 

                    		current.merge(this_BOOLEAN_3);
                        
                     
                        newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:351:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue767); 

                    		current.merge(this_NULL_4);
                        
                     
                        newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:360:5: this_Real_5= ruleReal
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleReal_in_ruleValue800);
                    this_Real_5=ruleReal();

                    state._fsp--;


                    		current.merge(this_Real_5);
                        
                     
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleExtendedID"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:378:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:379:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:380:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
             newCompositeNode(grammarAccess.getExtendedIDRule()); 
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID846);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;

             current =iv_ruleExtendedID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID857); 

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:387:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:390:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:391:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:391:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:391:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID897); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:398:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:399:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleExtendedID916); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID931); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleReal"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:423:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:424:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:425:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal983);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal994); 

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:432:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:435:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:436:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:436:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:436:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:436:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:437:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleReal1033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal1050); 

            		current.merge(this_NATURAL_1);
                
             
                newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleReal1068); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal1083); 

            		current.merge(this_NATURAL_3);
                
             
                newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:462:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:462:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:462:2: (kw= 'e' | kw= 'E' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==22) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:463:2: kw= 'e'
                            {
                            kw=(Token)match(input,21,FOLLOW_21_in_ruleReal1103); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:470:2: kw= 'E'
                            {
                            kw=(Token)match(input,22,FOLLOW_22_in_ruleReal1122); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:475:2: (kw= '+' | kw= '-' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==20) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:476:2: kw= '+'
                            {
                            kw=(Token)match(input,23,FOLLOW_23_in_ruleReal1137); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:483:2: kw= '-'
                            {
                            kw=(Token)match(input,20,FOLLOW_20_in_ruleReal1156); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal1172); 

                    		current.merge(this_NATURAL_8);
                        
                     
                        newLeafNode(this_NATURAL_8, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
                        

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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:503:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:504:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:505:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger1220);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger1231); 

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
    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:512:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:515:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:516:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:516:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:516:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:516:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:517:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleInteger1270); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger1287); 

            		current.merge(this_NATURAL_1);
                
             
                newLeafNode(this_NATURAL_1, grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleInteger"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\1\uffff\1\2\3\uffff\1\2";
    static final String DFA3_minS =
        "\1\4\1\20\1\uffff\1\7\1\uffff\1\20";
    static final String DFA3_maxS =
        "\1\24\1\23\1\uffff\1\7\1\uffff\1\23";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\3\2\1\1\1\2\13\uffff\1\2",
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
            return "171:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAnnotation122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation143 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAnnotation156 = new BitSet(new long[]{0x00000000001001F0L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAnnotation177 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation190 = new BitSet(new long[]{0x00000000001001F0L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAnnotation211 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleAnnotation225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignProperty_in_ruleProperty320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_ruleProperty347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignProperty_in_entryRuleAssignProperty382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignProperty392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAssignProperty438 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssignProperty450 = new BitSet(new long[]{0x00000000001001F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignProperty471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_entryRuleValueProperty507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueProperty517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueProperty562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID897 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleExtendedID916 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID931 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleReal1033 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal1050 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReal1068 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal1083 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleReal1103 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_22_in_ruleReal1122 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleReal1137 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20_in_ruleReal1156 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleInteger1270 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger1287 = new BitSet(new long[]{0x0000000000000002L});

}
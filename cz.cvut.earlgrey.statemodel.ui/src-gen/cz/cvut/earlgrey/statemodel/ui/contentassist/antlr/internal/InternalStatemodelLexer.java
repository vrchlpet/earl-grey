package cz.cvut.earlgrey.statemodel.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatemodelLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_CONDITION=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalStatemodelLexer() {;} 
    public InternalStatemodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalStatemodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:11:7: ( '=>' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:11:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:12:7: ( 'goto' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:12:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:13:7: ( 'state' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:13:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:14:7: ( 'initial' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:14:9: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:15:7: ( 'final' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:15:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:16:7: ( 'statemachine' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:16:9: 'statemachine'
            {
            match("statemachine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:17:7: ( '{' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:18:7: ( '}' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:19:7: ( 'on' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:19:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:20:7: ( 'if' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:21:7: ( 'do' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:21:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:22:7: ( 'import' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:22:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:23:7: ( '.' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_CONDITION"
    public final void mRULE_CONDITION() throws RecognitionException {
        try {
            int _type = RULE_CONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1634:16: ( '(' (~ ( ( '(' | ')' | '\\n' | '\\r' | '\\t' ) ) )* ')' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1634:18: '(' (~ ( ( '(' | ')' | '\\n' | '\\r' | '\\t' ) ) )* ')'
            {
            match('('); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1634:22: (~ ( ( '(' | ')' | '\\n' | '\\r' | '\\t' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\'')||(LA1_0>='*' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1634:22: ~ ( ( '(' | ')' | '\\n' | '\\r' | '\\t' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONDITION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1636:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1636:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1636:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1636:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1636:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1638:10: ( ( '0' .. '9' )+ )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1638:12: ( '0' .. '9' )+
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1638:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1638:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1640:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1642:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1642:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1642:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1642:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:41: ( '\\r' )? '\\n'
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1646:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1646:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1646:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1648:16: ( . )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1648:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_CONDITION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=21;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:88: RULE_CONDITION
                {
                mRULE_CONDITION(); 

                }
                break;
            case 15 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:103: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:111: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:120: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:132: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:148: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:164: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1:172: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\23\4\26\2\uffff\2\26\1\uffff\2\23\2\uffff\3\23\3\uffff"+
        "\1\26\1\uffff\2\26\1\52\2\26\2\uffff\1\55\1\56\7\uffff\3\26\1\uffff"+
        "\2\26\2\uffff\1\64\4\26\1\uffff\1\72\2\26\1\75\1\26\1\uffff\1\26"+
        "\1\100\1\uffff\1\26\1\102\1\uffff\1\26\1\uffff\3\26\1\107\1\uffff";
    static final String DFA13_eofS =
        "\110\uffff";
    static final String DFA13_minS =
        "\1\0\1\76\1\157\1\164\1\146\1\151\2\uffff\1\156\1\157\1\uffff\1"+
        "\0\1\101\2\uffff\2\0\1\52\3\uffff\1\164\1\uffff\1\141\1\151\1\60"+
        "\1\160\1\156\2\uffff\2\60\7\uffff\1\157\2\164\1\uffff\1\157\1\141"+
        "\2\uffff\1\60\1\145\1\151\1\162\1\154\1\uffff\1\60\1\141\1\164\1"+
        "\60\1\141\1\uffff\1\154\1\60\1\uffff\1\143\1\60\1\uffff\1\150\1"+
        "\uffff\1\151\1\156\1\145\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\76\1\157\1\164\1\156\1\151\2\uffff\1\156\1\157\1\uffff"+
        "\1\uffff\1\172\2\uffff\2\uffff\1\57\3\uffff\1\164\1\uffff\1\141"+
        "\1\151\1\172\1\160\1\156\2\uffff\2\172\7\uffff\1\157\2\164\1\uffff"+
        "\1\157\1\141\2\uffff\1\172\1\145\1\151\1\162\1\154\1\uffff\1\172"+
        "\1\141\1\164\1\172\1\141\1\uffff\1\154\1\172\1\uffff\1\143\1\172"+
        "\1\uffff\1\150\1\uffff\1\151\1\156\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\6\uffff\1\7\1\10\2\uffff\1\15\2\uffff\1\17\1\20\3\uffff\1\24\1"+
        "\25\1\1\1\uffff\1\17\5\uffff\1\7\1\10\2\uffff\1\15\1\16\1\20\1\21"+
        "\1\22\1\23\1\24\3\uffff\1\12\2\uffff\1\11\1\13\5\uffff\1\2\5\uffff"+
        "\1\3\2\uffff\1\5\2\uffff\1\14\1\uffff\1\4\4\uffff\1\6";
    static final String DFA13_specialS =
        "\1\2\12\uffff\1\1\3\uffff\1\0\1\3\67\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\1\13\5"+
            "\23\1\12\1\21\12\16\3\23\1\1\3\23\32\15\3\23\1\14\1\15\1\23"+
            "\3\15\1\11\1\15\1\5\1\2\1\15\1\4\5\15\1\10\3\15\1\3\7\15\1\6"+
            "\1\23\1\7\uff82\23",
            "\1\24",
            "\1\25",
            "\1\27",
            "\1\31\6\uffff\1\32\1\30",
            "\1\33",
            "",
            "",
            "\1\36",
            "\1\37",
            "",
            "\11\41\2\uffff\2\41\1\uffff\32\41\1\uffff\uffd7\41",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\43",
            "\0\43",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "",
            "\1\47",
            "",
            "\1\50",
            "\1\51",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\53",
            "\1\54",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "\1\62",
            "\1\63",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\14\26\1\71\15\26",
            "\1\73",
            "\1\74",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\76",
            "",
            "\1\77",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\101",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_CONDITION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_15 = input.LA(1);

                        s = -1;
                        if ( ((LA13_15>='\u0000' && LA13_15<='\uFFFF')) ) {s = 35;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_11 = input.LA(1);

                        s = -1;
                        if ( ((LA13_11>='\u0000' && LA13_11<='\b')||(LA13_11>='\u000B' && LA13_11<='\f')||(LA13_11>='\u000E' && LA13_11<='\'')||(LA13_11>=')' && LA13_11<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='=') ) {s = 1;}

                        else if ( (LA13_0=='g') ) {s = 2;}

                        else if ( (LA13_0=='s') ) {s = 3;}

                        else if ( (LA13_0=='i') ) {s = 4;}

                        else if ( (LA13_0=='f') ) {s = 5;}

                        else if ( (LA13_0=='{') ) {s = 6;}

                        else if ( (LA13_0=='}') ) {s = 7;}

                        else if ( (LA13_0=='o') ) {s = 8;}

                        else if ( (LA13_0=='d') ) {s = 9;}

                        else if ( (LA13_0=='.') ) {s = 10;}

                        else if ( (LA13_0=='(') ) {s = 11;}

                        else if ( (LA13_0=='^') ) {s = 12;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='c')||LA13_0=='e'||LA13_0=='h'||(LA13_0>='j' && LA13_0<='n')||(LA13_0>='p' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='z')) ) {s = 13;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 14;}

                        else if ( (LA13_0=='\"') ) {s = 15;}

                        else if ( (LA13_0=='\'') ) {s = 16;}

                        else if ( (LA13_0=='/') ) {s = 17;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 18;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>=')' && LA13_0<='-')||(LA13_0>=':' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='\u0000' && LA13_16<='\uFFFF')) ) {s = 35;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
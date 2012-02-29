package cz.cvut.earlgrey.annotation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationLexer extends Lexer {
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=8;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
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

    public InternalAnnotationLexer() {;} 
    public InternalAnnotationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnnotationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:11:7: ( '@' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:11:9: '@'
            {
            match('@'); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:12:7: ( '(' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:12:9: '('
            {
            match('('); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:13:7: ( ',' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:13:9: ','
            {
            match(','); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:14:7: ( ')' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:14:9: ')'
            {
            match(')'); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:15:7: ( '=' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:15:9: '='
            {
            match('='); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:16:7: ( '.' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:16:9: '.'
            {
            match('.'); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:17:7: ( '-' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:17:9: '-'
            {
            match('-'); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:18:7: ( 'e' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:18:9: 'e'
            {
            match('e'); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:19:7: ( 'E' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:19:9: 'E'
            {
            match('E'); 

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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:20:7: ( '+' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:14: ( ( 'true' | 'false' ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:16: ( 'true' | 'false' )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:11: ( ( 'null' | 'nil' | 'NULL' ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:13: ( 'null' | 'nil' | 'NULL' )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:13: ( 'null' | 'nil' | 'NULL' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='n') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='u') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='i') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0=='N') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:14: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:21: 'nil'
                    {
                    match("nil"); 


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:27: 'NULL'
                    {
                    match("NULL"); 


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
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:
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

    // $ANTLR start "RULE_NATURAL"
    public final void mRULE_NATURAL() throws RecognitionException {
        try {
            int _type = RULE_NATURAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:543:14: ( ( '0' .. '9' )+ )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:543:16: ( '0' .. '9' )+
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:543:16: ( '0' .. '9' )+
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
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:543:17: '0' .. '9'
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
    // $ANTLR end "RULE_NATURAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:24: ( options {greedy=false; } : . )*
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
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:52: .
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:41: ( '\\r' )? '\\n'
                    {
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:41: '\\r'
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:553:16: ( . )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:553:18: .
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
        // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_NATURAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=19;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:70: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 12 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:83: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 13 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:93: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:101: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 15 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:114: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:126: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:142: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:158: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:166: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\10\uffff\1\35\1\37\1\uffff\4\36\2\uffff\3\25\15\uffff\5\36\5\uffff"+
        "\3\36\1\63\1\36\1\65\1\36\1\63\1\uffff\1\63\1\uffff\1\65";
    static final String DFA13_eofS =
        "\67\uffff";
    static final String DFA13_minS =
        "\1\0\7\uffff\2\60\1\uffff\1\162\1\141\1\151\1\125\2\uffff\2\0\1"+
        "\52\15\uffff\1\165\3\154\1\114\5\uffff\1\145\1\163\1\154\1\60\1"+
        "\114\1\60\1\145\1\60\1\uffff\1\60\1\uffff\1\60";
    static final String DFA13_maxS =
        "\1\uffff\7\uffff\2\172\1\uffff\1\162\1\141\1\165\1\125\2\uffff"+
        "\2\uffff\1\57\15\uffff\1\165\3\154\1\114\5\uffff\1\145\1\163\1\154"+
        "\1\172\1\114\1\172\1\145\1\172\1\uffff\1\172\1\uffff\1\172";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\4\uffff\1\15"+
        "\1\16\3\uffff\1\22\1\23\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\15\1"+
        "\11\1\12\5\uffff\1\16\1\17\1\20\1\21\1\22\10\uffff\1\14\1\uffff"+
        "\1\13\1\uffff";
    static final String DFA13_specialS =
        "\1\2\20\uffff\1\1\1\0\44\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\1\2\1"+
            "\4\1\25\1\12\1\3\1\7\1\6\1\23\12\20\3\25\1\5\2\25\1\1\4\17\1"+
            "\11\10\17\1\16\14\17\4\25\1\17\1\25\4\17\1\10\1\14\7\17\1\15"+
            "\5\17\1\13\6\17\uff85\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\41",
            "\1\42",
            "\1\44\13\uffff\1\43",
            "\1\45",
            "",
            "",
            "\0\47",
            "\0\47",
            "\1\50\4\uffff\1\51",
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
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\64",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\66",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36"
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_NATURAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( ((LA13_18>='\u0000' && LA13_18<='\uFFFF')) ) {s = 39;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_17 = input.LA(1);

                        s = -1;
                        if ( ((LA13_17>='\u0000' && LA13_17<='\uFFFF')) ) {s = 39;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='@') ) {s = 1;}

                        else if ( (LA13_0=='(') ) {s = 2;}

                        else if ( (LA13_0==',') ) {s = 3;}

                        else if ( (LA13_0==')') ) {s = 4;}

                        else if ( (LA13_0=='=') ) {s = 5;}

                        else if ( (LA13_0=='.') ) {s = 6;}

                        else if ( (LA13_0=='-') ) {s = 7;}

                        else if ( (LA13_0=='e') ) {s = 8;}

                        else if ( (LA13_0=='E') ) {s = 9;}

                        else if ( (LA13_0=='+') ) {s = 10;}

                        else if ( (LA13_0=='t') ) {s = 11;}

                        else if ( (LA13_0=='f') ) {s = 12;}

                        else if ( (LA13_0=='n') ) {s = 13;}

                        else if ( (LA13_0=='N') ) {s = 14;}

                        else if ( ((LA13_0>='A' && LA13_0<='D')||(LA13_0>='F' && LA13_0<='M')||(LA13_0>='O' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='m')||(LA13_0>='o' && LA13_0<='s')||(LA13_0>='u' && LA13_0<='z')) ) {s = 15;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 16;}

                        else if ( (LA13_0=='\"') ) {s = 17;}

                        else if ( (LA13_0=='\'') ) {s = 18;}

                        else if ( (LA13_0=='/') ) {s = 19;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 20;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||LA13_0=='*'||(LA13_0>=':' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='?')||(LA13_0>='[' && LA13_0<='^')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 21;}

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
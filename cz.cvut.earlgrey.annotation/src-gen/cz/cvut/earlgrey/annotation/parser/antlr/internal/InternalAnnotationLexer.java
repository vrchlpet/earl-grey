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
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=8;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=11;
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

    public InternalAnnotationLexer() {;} 
    public InternalAnnotationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnnotationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:15: ( ( '++' | '--' | '==' | '>=' | '<=' | '!=' | '<>' | '||' | '&&' | '-=' | '+=' | '=' | '>>' | '<<' | '|=' ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:17: ( '++' | '--' | '==' | '>=' | '<=' | '!=' | '<>' | '||' | '&&' | '-=' | '+=' | '=' | '>>' | '<<' | '|=' )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:17: ( '++' | '--' | '==' | '>=' | '<=' | '!=' | '<>' | '||' | '&&' | '-=' | '+=' | '=' | '>>' | '<<' | '|=' )
            int alt1=15;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:18: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:23: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:28: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:33: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:38: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:43: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 7 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:48: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 8 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:53: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 9 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:58: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 10 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:63: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 11 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:68: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 12 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:73: '='
                    {
                    match('='); 

                    }
                    break;
                case 13 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:77: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 14 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:82: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 15 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:537:87: '|='
                    {
                    match("|="); 


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
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:14: ( ( 'true' | 'false' ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:16: ( 'true' | 'false' )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:539:24: 'false'
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:11: ( ( 'null' | 'nil' | 'NULL' ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:13: ( 'null' | 'nil' | 'NULL' )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:13: ( 'null' | 'nil' | 'NULL' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='n') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='u') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='i') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0=='N') ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:14: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:21: 'nil'
                    {
                    match("nil"); 


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:541:27: 'NULL'
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:543:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:543:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:543:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:14: ( ( '0' .. '9' )+ )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:16: ( '0' .. '9' )+
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:16: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:545:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:547:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:549:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:41: ( '\\r' )? '\\n'
                    {
                    // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:551:41: '\\r'
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:553:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:553:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:553:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:555:16: ( . )
            // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:555:18: .
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
        // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_OPERATOR | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_NATURAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=20;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:70: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 12 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:84: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 13 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:97: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 14 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:107: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:115: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 16 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:128: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:140: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:156: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:172: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // ../cz.cvut.earlgrey.annotation/src-gen/cz/cvut/earlgrey/annotation/parser/antlr/internal/InternalAnnotation.g:1:180: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\3\uffff\1\16\22\uffff";
    static final String DFA1_eofS =
        "\26\uffff";
    static final String DFA1_minS =
        "\1\41\1\53\1\55\2\75\1\74\1\uffff\1\75\16\uffff";
    static final String DFA1_maxS =
        "\1\174\3\75\2\76\1\uffff\1\174\16\uffff";
    static final String DFA1_acceptS =
        "\6\uffff\1\6\1\uffff\1\11\1\1\1\13\1\2\1\12\1\3\1\14\1\4\1\15\1"+
        "\5\1\7\1\16\1\10\1\17";
    static final String DFA1_specialS =
        "\26\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\6\4\uffff\1\10\4\uffff\1\1\1\uffff\1\2\16\uffff\1\5\1\3"+
            "\1\4\75\uffff\1\7",
            "\1\11\21\uffff\1\12",
            "\1\13\17\uffff\1\14",
            "\1\15",
            "\1\17\1\20",
            "\1\23\1\21\1\22",
            "",
            "\1\25\76\uffff\1\24",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "537:17: ( '++' | '--' | '==' | '>=' | '<=' | '!=' | '<>' | '||' | '&&' | '-=' | '+=' | '=' | '>>' | '<<' | '|=' )";
        }
    }
    static final String DFA14_eotS =
        "\5\uffff\1\40\1\uffff\1\42\1\43\1\45\1\46\5\32\4\44\2\uffff\3\32"+
        "\16\uffff\5\44\5\uffff\3\44\1\71\1\44\1\73\1\44\1\71\1\uffff\1\71"+
        "\1\uffff\1\73";
    static final String DFA14_eofS =
        "\75\uffff";
    static final String DFA14_minS =
        "\1\0\4\uffff\1\75\1\uffff\1\55\2\60\1\53\1\75\1\74\2\75\1\46\1"+
        "\162\1\141\1\151\1\125\2\uffff\2\0\1\52\16\uffff\1\165\3\154\1\114"+
        "\5\uffff\1\145\1\163\1\154\1\60\1\114\1\60\1\145\1\60\1\uffff\1"+
        "\60\1\uffff\1\60";
    static final String DFA14_maxS =
        "\1\uffff\4\uffff\1\75\1\uffff\1\75\2\172\1\75\2\76\1\75\1\174\1"+
        "\46\1\162\1\141\1\165\1\125\2\uffff\2\uffff\1\57\16\uffff\1\165"+
        "\3\154\1\114\5\uffff\1\145\1\163\1\154\1\172\1\114\1\172\1\145\1"+
        "\172\1\uffff\1\172\1\uffff\1\172";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\15\uffff\1\16\1\17\3\uffff"+
        "\1\23\1\24\1\1\1\2\1\3\1\4\1\13\1\5\1\6\1\7\1\10\1\16\1\11\1\12"+
        "\5\uffff\1\17\1\20\1\21\1\22\1\23\10\uffff\1\15\1\uffff\1\14\1\uffff";
    static final String DFA14_specialS =
        "\1\1\25\uffff\1\0\1\2\45\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\15\1\26\3\32\1\17\1\27\1"+
            "\2\1\4\1\32\1\12\1\3\1\7\1\6\1\30\12\25\2\32\1\14\1\5\1\13\1"+
            "\32\1\1\4\24\1\11\10\24\1\23\14\24\4\32\1\24\1\32\4\24\1\10"+
            "\1\21\7\24\1\22\5\24\1\20\6\24\1\32\1\16\uff83\32",
            "",
            "",
            "",
            "",
            "\1\37",
            "",
            "\1\37\17\uffff\1\37",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\37\21\uffff\1\37",
            "\2\37",
            "\3\37",
            "\1\37",
            "\1\37\76\uffff\1\37",
            "\1\37",
            "\1\47",
            "\1\50",
            "\1\52\13\uffff\1\51",
            "\1\53",
            "",
            "",
            "\0\55",
            "\0\55",
            "\1\56\4\uffff\1\57",
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
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\72",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\74",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_OPERATOR | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_NATURAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFF')) ) {s = 45;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='@') ) {s = 1;}

                        else if ( (LA14_0=='(') ) {s = 2;}

                        else if ( (LA14_0==',') ) {s = 3;}

                        else if ( (LA14_0==')') ) {s = 4;}

                        else if ( (LA14_0=='=') ) {s = 5;}

                        else if ( (LA14_0=='.') ) {s = 6;}

                        else if ( (LA14_0=='-') ) {s = 7;}

                        else if ( (LA14_0=='e') ) {s = 8;}

                        else if ( (LA14_0=='E') ) {s = 9;}

                        else if ( (LA14_0=='+') ) {s = 10;}

                        else if ( (LA14_0=='>') ) {s = 11;}

                        else if ( (LA14_0=='<') ) {s = 12;}

                        else if ( (LA14_0=='!') ) {s = 13;}

                        else if ( (LA14_0=='|') ) {s = 14;}

                        else if ( (LA14_0=='&') ) {s = 15;}

                        else if ( (LA14_0=='t') ) {s = 16;}

                        else if ( (LA14_0=='f') ) {s = 17;}

                        else if ( (LA14_0=='n') ) {s = 18;}

                        else if ( (LA14_0=='N') ) {s = 19;}

                        else if ( ((LA14_0>='A' && LA14_0<='D')||(LA14_0>='F' && LA14_0<='M')||(LA14_0>='O' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='d')||(LA14_0>='g' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 20;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 21;}

                        else if ( (LA14_0=='\"') ) {s = 22;}

                        else if ( (LA14_0=='\'') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 25;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='%')||LA14_0=='*'||(LA14_0>=':' && LA14_0<=';')||LA14_0=='?'||(LA14_0>='[' && LA14_0<='^')||LA14_0=='`'||LA14_0=='{'||(LA14_0>='}' && LA14_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 45;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
package cz.cvut.earlgrey.statemodel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatemodelLexer extends Lexer {
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=12;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_NULL=10;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_ARROW=5;
    public static final int RULE_WS=8;
    public static final int RULE_LITERAL=6;

    // delegates
    // delegators

    public InternalStatemodelLexer() {;} 
    public InternalStatemodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalStatemodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:11:7: ( 'import' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:11:9: 'import'
            {
            match("import"); 


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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:12:7: ( 'statemachine' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:12:9: 'statemachine'
            {
            match("statemachine"); 


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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:13:7: ( 'end' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:13:9: 'end'
            {
            match("end"); 


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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:14:7: ( 'do' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:14:9: 'do'
            {
            match("do"); 


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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:15:7: ( 'if' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:15:9: 'if'
            {
            match("if"); 


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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:16:7: ( 'then' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:16:9: 'then'
            {
            match("then"); 


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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:17:7: ( '@' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:17:9: '@'
            {
            match('@'); 

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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:18:7: ( '(' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:18:9: '('
            {
            match('('); 

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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:19:7: ( ',' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:19:9: ','
            {
            match(','); 

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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:20:7: ( ')' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:21:7: ( '=' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:22:7: ( '.' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:22:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:23:7: ( '-' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:23:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:24:7: ( 'e' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:24:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:25:7: ( 'E' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:25:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:26:7: ( '+' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:26:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:27:7: ( 'state' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:27:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:28:7: ( 'initial' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:28:9: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:29:7: ( 'final' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:29:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_LITERAL"
    public final void mRULE_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:14: ( ( '++' | '--' | '==' | '>=' | '<=' | '!=' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:16: ( '++' | '--' | '==' | '>=' | '<=' | '!=' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:16: ( '++' | '--' | '==' | '>=' | '<=' | '!=' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt1=1;
                }
                break;
            case '-':
                {
                alt1=2;
                }
                break;
            case '=':
                {
                alt1=3;
                }
                break;
            case '>':
                {
                alt1=4;
                }
                break;
            case '<':
                {
                alt1=5;
                }
                break;
            case '!':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:17: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:22: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:27: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:32: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:37: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1214:42: '!='
                    {
                    match("!="); 


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
    // $ANTLR end "RULE_LITERAL"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1216:12: ( ( '->' | 'goto' | '=>' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1216:14: ( '->' | 'goto' | '=>' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1216:14: ( '->' | 'goto' | '=>' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case '-':
                {
                alt2=1;
                }
                break;
            case 'g':
                {
                alt2=2;
                }
                break;
            case '=':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1216:15: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1216:20: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1216:27: '=>'
                    {
                    match("=>"); 


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
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1218:14: ( ( 'true' | 'false' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1218:16: ( 'true' | 'false' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1218:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1218:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1218:24: 'false'
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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1220:11: ( ( 'null' | 'nil' | 'NULL' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1220:13: ( 'null' | 'nil' | 'NULL' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1220:13: ( 'null' | 'nil' | 'NULL' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='n') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='u') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='i') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0=='N') ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1220:14: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1220:21: 'nil'
                    {
                    match("nil"); 


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1220:27: 'NULL'
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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1222:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1222:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1222:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:
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
            	    break loop5;
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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1224:14: ( ( '0' .. '9' )+ )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1224:16: ( '0' .. '9' )+
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1224:16: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1224:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1226:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1228:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1228:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1228:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1228:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1230:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1230:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1230:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1230:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1230:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1230:41: ( '\\r' )? '\\n'
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1230:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1230:41: '\\r'
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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1232:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1232:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1232:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1234:16: ( . )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1234:18: .
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
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_LITERAL | RULE_ARROW | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_NATURAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=30;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:124: RULE_LITERAL
                {
                mRULE_LITERAL(); 

                }
                break;
            case 21 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:137: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 22 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:148: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 23 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:161: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 24 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:171: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:179: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 26 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:192: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:204: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:220: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:236: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:1:244: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\40\1\43\2\40\4\uffff\1\55\1\uffff\1\57\1\60\1\61\1\40"+
        "\3\34\3\40\2\uffff\3\34\2\uffff\1\40\1\76\1\40\1\uffff\2\40\1\uffff"+
        "\1\102\2\40\13\uffff\6\40\5\uffff\1\40\1\uffff\2\40\1\116\1\uffff"+
        "\6\40\1\125\4\40\1\uffff\1\132\1\133\2\40\1\54\1\125\1\uffff\1\125"+
        "\2\40\1\141\2\uffff\1\142\1\133\1\143\2\40\3\uffff\1\146\1\40\1"+
        "\uffff\4\40\1\154\1\uffff";
    static final String DFA15_eofS =
        "\155\uffff";
    static final String DFA15_minS =
        "\1\0\1\146\1\164\1\60\1\157\1\150\4\uffff\1\75\1\uffff\1\55\1\60"+
        "\1\53\1\141\3\75\1\157\1\151\1\125\2\uffff\2\0\1\52\2\uffff\1\160"+
        "\1\60\1\151\1\uffff\1\141\1\144\1\uffff\1\60\1\145\1\165\13\uffff"+
        "\1\156\1\154\1\164\2\154\1\114\5\uffff\1\157\1\uffff\2\164\1\60"+
        "\1\uffff\1\156\1\145\1\141\1\163\1\157\1\154\1\60\1\114\1\162\1"+
        "\151\1\145\1\uffff\2\60\1\154\1\145\2\60\1\uffff\1\60\1\164\1\141"+
        "\1\60\2\uffff\3\60\1\154\1\141\3\uffff\1\60\1\143\1\uffff\1\150"+
        "\1\151\1\156\1\145\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\156\1\164\1\172\1\157\1\162\4\uffff\1\76\1\uffff\1\76"+
        "\1\172\1\53\1\151\3\75\1\157\1\165\1\125\2\uffff\2\uffff\1\57\2"+
        "\uffff\1\160\1\172\1\151\1\uffff\1\141\1\144\1\uffff\1\172\1\145"+
        "\1\165\13\uffff\1\156\1\154\1\164\2\154\1\114\5\uffff\1\157\1\uffff"+
        "\2\164\1\172\1\uffff\1\156\1\145\1\141\1\163\1\157\1\154\1\172\1"+
        "\114\1\162\1\151\1\145\1\uffff\2\172\1\154\1\145\2\172\1\uffff\1"+
        "\172\1\164\1\141\1\172\2\uffff\3\172\1\154\1\141\3\uffff\1\172\1"+
        "\143\1\uffff\1\150\1\151\1\156\1\145\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\7\1\10\1\11\1\12\1\uffff\1\14\12\uffff\1\30\1\31\3\uffff"+
        "\1\35\1\36\3\uffff\1\30\2\uffff\1\16\3\uffff\1\7\1\10\1\11\1\12"+
        "\1\24\1\25\1\13\1\14\1\15\1\17\1\20\6\uffff\1\31\1\32\1\33\1\34"+
        "\1\35\1\uffff\1\5\3\uffff\1\4\13\uffff\1\3\6\uffff\1\27\4\uffff"+
        "\1\6\1\26\5\uffff\1\21\1\23\1\1\2\uffff\1\22\5\uffff\1\2";
    static final String DFA15_specialS =
        "\1\2\27\uffff\1\1\1\0\123\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\22\1\30\4\34\1\31\1\7\1"+
            "\11\1\34\1\16\1\10\1\14\1\13\1\32\12\27\2\34\1\21\1\12\1\20"+
            "\1\34\1\6\4\26\1\15\10\26\1\25\14\26\4\34\1\26\1\34\3\26\1\4"+
            "\1\3\1\17\1\23\1\26\1\1\4\26\1\24\4\26\1\2\1\5\6\26\uff85\34",
            "\1\36\6\uffff\1\35\1\37",
            "\1\41",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\42\14\40",
            "\1\44",
            "\1\45\11\uffff\1\46",
            "",
            "",
            "",
            "",
            "\1\53\1\54",
            "",
            "\1\53\20\uffff\1\54",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\53",
            "\1\63\7\uffff\1\62",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\64",
            "\1\66\13\uffff\1\65",
            "\1\67",
            "",
            "",
            "\0\71",
            "\0\71",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "\1\75",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\103",
            "\1\104",
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
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\134",
            "\1\135",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\136",
            "\1\137",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\14\40\1\140\15\40",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_LITERAL | RULE_ARROW | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_NATURAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_25 = input.LA(1);

                        s = -1;
                        if ( ((LA15_25>='\u0000' && LA15_25<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_24 = input.LA(1);

                        s = -1;
                        if ( ((LA15_24>='\u0000' && LA15_24<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='i') ) {s = 1;}

                        else if ( (LA15_0=='s') ) {s = 2;}

                        else if ( (LA15_0=='e') ) {s = 3;}

                        else if ( (LA15_0=='d') ) {s = 4;}

                        else if ( (LA15_0=='t') ) {s = 5;}

                        else if ( (LA15_0=='@') ) {s = 6;}

                        else if ( (LA15_0=='(') ) {s = 7;}

                        else if ( (LA15_0==',') ) {s = 8;}

                        else if ( (LA15_0==')') ) {s = 9;}

                        else if ( (LA15_0=='=') ) {s = 10;}

                        else if ( (LA15_0=='.') ) {s = 11;}

                        else if ( (LA15_0=='-') ) {s = 12;}

                        else if ( (LA15_0=='E') ) {s = 13;}

                        else if ( (LA15_0=='+') ) {s = 14;}

                        else if ( (LA15_0=='f') ) {s = 15;}

                        else if ( (LA15_0=='>') ) {s = 16;}

                        else if ( (LA15_0=='<') ) {s = 17;}

                        else if ( (LA15_0=='!') ) {s = 18;}

                        else if ( (LA15_0=='g') ) {s = 19;}

                        else if ( (LA15_0=='n') ) {s = 20;}

                        else if ( (LA15_0=='N') ) {s = 21;}

                        else if ( ((LA15_0>='A' && LA15_0<='D')||(LA15_0>='F' && LA15_0<='M')||(LA15_0>='O' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||LA15_0=='h'||(LA15_0>='j' && LA15_0<='m')||(LA15_0>='o' && LA15_0<='r')||(LA15_0>='u' && LA15_0<='z')) ) {s = 22;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 23;}

                        else if ( (LA15_0=='\"') ) {s = 24;}

                        else if ( (LA15_0=='\'') ) {s = 25;}

                        else if ( (LA15_0=='/') ) {s = 26;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 27;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='&')||LA15_0=='*'||(LA15_0>=':' && LA15_0<=';')||LA15_0=='?'||(LA15_0>='[' && LA15_0<='^')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
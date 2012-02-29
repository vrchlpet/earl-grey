package cz.cvut.earlgrey.sequencemodel.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSequencemodelLexer extends Lexer {
    public static final int RULE_BOOLEAN=8;
    public static final int T__40=40;
    public static final int RULE_ID=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=5;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_NULL=9;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int RULE_OPERATOR=4;
    public static final int RULE_WS=6;

    // delegates
    // delegators

    public InternalSequencemodelLexer() {;} 
    public InternalSequencemodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSequencemodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:11:7: ( 'e' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:11:9: 'e'
            {
            match('e'); 

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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:12:7: ( 'E' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:12:9: 'E'
            {
            match('E'); 

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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:13:7: ( '+' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:13:9: '+'
            {
            match('+'); 

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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:14:7: ( '-' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:14:9: '-'
            {
            match('-'); 

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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:15:7: ( 'import' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:15:9: 'import'
            {
            match("import"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:16:7: ( 'sequence' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:16:9: 'sequence'
            {
            match("sequence"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:17:7: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:17:9: 'end'
            {
            match("end"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:18:7: ( 'def' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:18:9: 'def'
            {
            match("def"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:19:7: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:19:9: '('
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:20:7: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:20:9: ')'
            {
            match(')'); 

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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:21:7: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:21:9: ','
            {
            match(','); 

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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:22:7: ( 'if' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:22:9: 'if'
            {
            match("if"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:23:7: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:23:9: 'then'
            {
            match("then"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:24:7: ( 'elsif' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:24:9: 'elsif'
            {
            match("elsif"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:25:7: ( 'else' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:25:9: 'else'
            {
            match("else"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:26:7: ( 'foreach' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:26:9: 'foreach'
            {
            match("foreach"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:27:7: ( 'do' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:27:9: 'do'
            {
            match("do"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:28:7: ( 'while' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:28:9: 'while'
            {
            match("while"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:29:7: ( 'assert' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:29:9: 'assert'
            {
            match("assert"); 


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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:30:7: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:30:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:31:7: ( 'new' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:31:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:32:7: ( 'return ' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:32:9: 'return '
            {
            match("return "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:33:7: ( ':' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:33:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:34:7: ( '[' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:34:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:35:7: ( ']' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:35:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:36:7: ( '..' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:36:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:37:7: ( '@' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:37:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:15: ( ( '++' | '--' | '==' | '>=' | '<=' | '!=' | '<>' | '||' | '&&' | '-=' | '+=' | '=' | '>>' | '<<' | '|=' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:17: ( '++' | '--' | '==' | '>=' | '<=' | '!=' | '<>' | '||' | '&&' | '-=' | '+=' | '=' | '>>' | '<<' | '|=' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:17: ( '++' | '--' | '==' | '>=' | '<=' | '!=' | '<>' | '||' | '&&' | '-=' | '+=' | '=' | '>>' | '<<' | '|=' )
            int alt1=15;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:18: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:23: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:28: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:33: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:38: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:43: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 7 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:48: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 8 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:53: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 9 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:58: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 10 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:63: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 11 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:68: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 12 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:73: '='
                    {
                    match('='); 

                    }
                    break;
                case 13 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:77: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 14 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:82: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 15 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:87: '|='
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5545:14: ( ( 'true' | 'false' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5545:16: ( 'true' | 'false' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5545:16: ( 'true' | 'false' )
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5545:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5545:24: 'false'
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5547:11: ( ( 'null' | 'nil' | 'NULL' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5547:13: ( 'null' | 'nil' | 'NULL' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5547:13: ( 'null' | 'nil' | 'NULL' )
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5547:14: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5547:21: 'nil'
                    {
                    match("nil"); 


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5547:27: 'NULL'
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5549:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5549:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5549:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5551:14: ( ( '0' .. '9' )+ )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5551:16: ( '0' .. '9' )+
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5551:16: ( '0' .. '9' )+
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
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5551:17: '0' .. '9'
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5553:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5555:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5555:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5555:24: ( options {greedy=false; } : . )*
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
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5555:52: .
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:41: ( '\\r' )? '\\n'
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:41: '\\r'
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5559:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5559:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5559:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:
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
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5561:16: ( . )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5561:18: .
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
        // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_OPERATOR | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_NATURAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=37;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:172: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 29 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:186: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 30 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:199: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 31 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:209: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:217: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 33 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:230: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:242: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:258: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:274: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1:282: RULE_ANY_OTHER
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
            return "5543:17: ( '++' | '--' | '==' | '>=' | '<=' | '!=' | '<>' | '||' | '&&' | '-=' | '+=' | '=' | '>>' | '<<' | '|=' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\47\1\50\1\52\1\53\3\46\3\uffff\4\46\1\73\2\46\5\uffff"+
        "\5\43\1\46\2\uffff\3\43\2\uffff\2\46\6\uffff\1\46\1\115\2\46\1\120"+
        "\3\uffff\6\46\2\uffff\4\46\4\uffff\1\46\5\uffff\1\134\2\46\1\uffff"+
        "\1\46\1\141\1\uffff\6\46\1\150\1\46\1\152\2\46\1\uffff\1\46\1\156"+
        "\2\46\1\uffff\1\161\1\162\4\46\1\uffff\1\152\1\uffff\1\46\1\152"+
        "\1\170\1\uffff\2\46\2\uffff\1\46\1\162\1\174\2\46\1\uffff\1\177"+
        "\2\46\1\uffff\1\u0082\1\46\1\uffff\1\46\1\u0085\2\uffff\1\u0086"+
        "\2\uffff";
    static final String DFA14_eofS =
        "\u0087\uffff";
    static final String DFA14_minS =
        "\1\0\2\60\1\53\1\55\1\146\2\145\3\uffff\1\150\1\141\1\150\1\163"+
        "\1\56\2\145\5\uffff\1\75\1\74\2\75\1\46\1\125\2\uffff\2\0\1\52\2"+
        "\uffff\1\144\1\163\6\uffff\1\160\1\60\1\161\1\146\1\60\3\uffff\1"+
        "\145\1\165\1\162\1\154\1\151\1\163\2\uffff\1\167\2\154\1\164\4\uffff"+
        "\1\114\5\uffff\1\60\1\145\1\157\1\uffff\1\165\1\60\1\uffff\1\156"+
        "\2\145\1\163\1\154\1\145\1\60\1\154\1\60\1\165\1\114\1\uffff\1\146"+
        "\1\60\1\162\1\145\1\uffff\2\60\1\141\2\145\1\162\1\uffff\1\60\1"+
        "\uffff\1\162\2\60\1\uffff\1\164\1\156\2\uffff\1\143\2\60\1\164\1"+
        "\156\1\uffff\1\60\1\143\1\150\1\uffff\1\60\1\40\1\uffff\1\145\1"+
        "\60\2\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\172\2\75\1\155\1\145\1\157\3\uffff\1\162\1\157\1\150"+
        "\1\163\1\56\1\165\1\145\5\uffff\2\76\1\75\1\174\1\46\1\125\2\uffff"+
        "\2\uffff\1\57\2\uffff\1\144\1\163\6\uffff\1\160\1\172\1\161\1\146"+
        "\1\172\3\uffff\1\145\1\165\1\162\1\154\1\151\1\163\2\uffff\1\167"+
        "\2\154\1\164\4\uffff\1\114\5\uffff\1\172\1\151\1\157\1\uffff\1\165"+
        "\1\172\1\uffff\1\156\2\145\1\163\1\154\1\145\1\172\1\154\1\172\1"+
        "\165\1\114\1\uffff\1\146\1\172\1\162\1\145\1\uffff\2\172\1\141\2"+
        "\145\1\162\1\uffff\1\172\1\uffff\1\162\2\172\1\uffff\1\164\1\156"+
        "\2\uffff\1\143\2\172\1\164\1\156\1\uffff\1\172\1\143\1\150\1\uffff"+
        "\1\172\1\40\1\uffff\1\145\1\172\2\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\10\uffff\1\11\1\12\1\13\7\uffff\1\27\1\30\1\31\1\33\1\34\6\uffff"+
        "\1\37\1\40\3\uffff\1\44\1\45\2\uffff\1\37\1\1\1\2\1\34\1\3\1\4\5"+
        "\uffff\1\11\1\12\1\13\6\uffff\1\32\1\24\4\uffff\1\27\1\30\1\31\1"+
        "\33\1\uffff\1\40\1\41\1\42\1\43\1\44\3\uffff\1\14\2\uffff\1\21\13"+
        "\uffff\1\7\4\uffff\1\10\6\uffff\1\25\1\uffff\1\36\3\uffff\1\17\2"+
        "\uffff\1\15\1\35\5\uffff\1\16\3\uffff\1\22\2\uffff\1\5\2\uffff\1"+
        "\23\1\26\1\uffff\1\20\1\6";
    static final String DFA14_specialS =
        "\1\2\36\uffff\1\0\1\1\146\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\31\1\37\3\43\1\33\1\40\1"+
            "\10\1\11\1\43\1\3\1\12\1\4\1\17\1\41\12\36\1\22\1\43\1\30\1"+
            "\26\1\27\1\43\1\25\4\35\1\2\10\35\1\34\14\35\1\23\1\43\1\24"+
            "\1\43\1\35\1\43\1\16\2\35\1\7\1\1\1\14\2\35\1\5\4\35\1\20\3"+
            "\35\1\21\1\6\1\13\2\35\1\15\3\35\1\43\1\32\uff83\43",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\45\1\46"+
            "\1\44\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\51\21\uffff\1\51",
            "\1\51\17\uffff\1\51",
            "\1\55\6\uffff\1\54",
            "\1\56",
            "\1\57\11\uffff\1\60",
            "",
            "",
            "",
            "\1\64\11\uffff\1\65",
            "\1\67\15\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74\3\uffff\1\76\13\uffff\1\75",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "\2\51",
            "\3\51",
            "\1\51",
            "\1\51\76\uffff\1\51",
            "\1\51",
            "\1\104",
            "",
            "",
            "\0\106",
            "\0\106",
            "\1\107\4\uffff\1\110",
            "",
            "",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\116",
            "\1\117",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\136\3\uffff\1\135",
            "\1\137",
            "",
            "\1\140",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\151",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\157",
            "\1\160",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\167",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\175",
            "\1\176",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0080",
            "\1\u0081",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0083",
            "",
            "\1\u0084",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            ""
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_OPERATOR | RULE_BOOLEAN | RULE_NULL | RULE_ID | RULE_NATURAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFF')) ) {s = 70;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 70;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='e') ) {s = 1;}

                        else if ( (LA14_0=='E') ) {s = 2;}

                        else if ( (LA14_0=='+') ) {s = 3;}

                        else if ( (LA14_0=='-') ) {s = 4;}

                        else if ( (LA14_0=='i') ) {s = 5;}

                        else if ( (LA14_0=='s') ) {s = 6;}

                        else if ( (LA14_0=='d') ) {s = 7;}

                        else if ( (LA14_0=='(') ) {s = 8;}

                        else if ( (LA14_0==')') ) {s = 9;}

                        else if ( (LA14_0==',') ) {s = 10;}

                        else if ( (LA14_0=='t') ) {s = 11;}

                        else if ( (LA14_0=='f') ) {s = 12;}

                        else if ( (LA14_0=='w') ) {s = 13;}

                        else if ( (LA14_0=='a') ) {s = 14;}

                        else if ( (LA14_0=='.') ) {s = 15;}

                        else if ( (LA14_0=='n') ) {s = 16;}

                        else if ( (LA14_0=='r') ) {s = 17;}

                        else if ( (LA14_0==':') ) {s = 18;}

                        else if ( (LA14_0=='[') ) {s = 19;}

                        else if ( (LA14_0==']') ) {s = 20;}

                        else if ( (LA14_0=='@') ) {s = 21;}

                        else if ( (LA14_0=='=') ) {s = 22;}

                        else if ( (LA14_0=='>') ) {s = 23;}

                        else if ( (LA14_0=='<') ) {s = 24;}

                        else if ( (LA14_0=='!') ) {s = 25;}

                        else if ( (LA14_0=='|') ) {s = 26;}

                        else if ( (LA14_0=='&') ) {s = 27;}

                        else if ( (LA14_0=='N') ) {s = 28;}

                        else if ( ((LA14_0>='A' && LA14_0<='D')||(LA14_0>='F' && LA14_0<='M')||(LA14_0>='O' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='c')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='q')||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 29;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 30;}

                        else if ( (LA14_0=='\"') ) {s = 31;}

                        else if ( (LA14_0=='\'') ) {s = 32;}

                        else if ( (LA14_0=='/') ) {s = 33;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 34;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='%')||LA14_0=='*'||LA14_0==';'||LA14_0=='?'||LA14_0=='\\'||LA14_0=='^'||LA14_0=='`'||LA14_0=='{'||(LA14_0>='}' && LA14_0<='\uFFFF')) ) {s = 35;}

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
package cz.cvut.earlgrey.classmodel.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassmodelLexer extends Lexer {
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_FALSE=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CONSTRAINT=10;
    public static final int RULE_INT=4;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_NULL=5;
    public static final int RULE_TRUE=7;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=13;

    // delegates
    // delegators

    public InternalClassmodelLexer() {;} 
    public InternalClassmodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalClassmodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:11:7: ( '*' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:11:9: '*'
            {
            match('*'); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:12:7: ( 'association' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:12:9: 'association'
            {
            match("association"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:13:7: ( 'depency' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:13:9: 'depency'
            {
            match("depency"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:14:7: ( 'generalization' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:14:9: 'generalization'
            {
            match("generalization"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:15:7: ( 'realization' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:15:9: 'realization'
            {
            match("realization"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:16:7: ( 'aggregation' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:16:9: 'aggregation'
            {
            match("aggregation"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:17:7: ( 'composition' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:17:9: 'composition'
            {
            match("composition"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:18:7: ( '+' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:18:9: '+'
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

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:19:7: ( '-' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:19:9: '-'
            {
            match('-'); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:20:7: ( '#' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:20:9: '#'
            {
            match('#'); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:21:7: ( '~' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:21:9: '~'
            {
            match('~'); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:22:7: ( 'import' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:22:9: 'import'
            {
            match("import"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:23:7: ( 'datatype' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:23:9: 'datatype'
            {
            match("datatype"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:24:7: ( 'package' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:24:9: 'package'
            {
            match("package"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:25:7: ( 'end' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:25:9: 'end'
            {
            match("end"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:26:7: ( 'class' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:26:9: 'class'
            {
            match("class"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:27:7: ( '@' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:27:9: '@'
            {
            match('@'); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:28:7: ( '(' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:28:9: '('
            {
            match('('); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:29:7: ( ')' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:29:9: ')'
            {
            match(')'); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:30:7: ( 'isA' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:30:9: 'isA'
            {
            match("isA"); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:31:7: ( ',' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:31:9: ','
            {
            match(','); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:32:7: ( ':' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:32:9: ':'
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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:33:7: ( '..' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:33:9: '..'
            {
            match(".."); 


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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:34:7: ( '=' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:34:9: '='
            {
            match('='); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:35:7: ( '[' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:35:9: '['
            {
            match('['); 

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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:36:7: ( ']' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:36:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:37:7: ( '.' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:37:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:38:7: ( 'navigable' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:38:9: 'navigable'
            {
            match("navigable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:39:7: ( 'static' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:39:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_CONSTRAINT"
    public final void mRULE_CONSTRAINT() throws RecognitionException {
        try {
            int _type = RULE_CONSTRAINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4883:17: ( '{' ( options {greedy=false; } : . )* '}' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4883:19: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4883:23: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='}') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='|')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4883:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONSTRAINT"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4885:11: ( 'true' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4885:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4887:11: ( 'null' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4887:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4889:12: ( 'false' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4889:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4891:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4891:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4891:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4891:11: '^'
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

            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4891:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:
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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4893:10: ( ( '0' .. '9' )+ )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4893:12: ( '0' .. '9' )+
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4893:12: ( '0' .. '9' )+
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
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4893:13: '0' .. '9'
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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4895:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4897:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4897:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4897:24: ( options {greedy=false; } : . )*
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
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4897:52: .
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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4899:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4899:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4899:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4899:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4899:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4899:41: ( '\\r' )? '\\n'
                    {
                    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4899:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4899:41: '\\r'
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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4901:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4901:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4901:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:
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
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4903:16: ( . )
            // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:4903:18: .
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
        // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_CONSTRAINT | RULE_TRUE | RULE_NULL | RULE_FALSE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=40;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:184: RULE_CONSTRAINT
                {
                mRULE_CONSTRAINT(); 

                }
                break;
            case 31 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:200: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 32 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:210: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 33 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:220: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 34 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:231: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:239: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:248: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:260: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:276: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:292: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // ../cz.cvut.earlgrey.classmodel.ui/src-gen/cz/cvut/earlgrey/classmodel/ui/contentassist/antlr/internal/InternalClassmodel.g:1:300: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\2\uffff\5\47\4\uffff\3\47\5\uffff\1\74\3\uffff\2\47\1\43\2\47"+
        "\1\43\2\uffff\3\43\3\uffff\2\47\1\uffff\6\47\4\uffff\4\47\12\uffff"+
        "\3\47\1\uffff\2\47\5\uffff\11\47\1\145\1\47\1\147\16\47\1\uffff"+
        "\1\47\1\uffff\1\47\1\170\1\47\1\172\10\47\1\u0083\3\47\1\uffff\1"+
        "\47\1\uffff\1\u0088\7\47\1\uffff\1\u0090\2\47\1\u0093\1\uffff\2"+
        "\47\1\u0096\4\47\1\uffff\1\u009b\1\47\1\uffff\2\47\1\uffff\1\u009f"+
        "\3\47\1\uffff\3\47\1\uffff\3\47\1\u00a9\5\47\1\uffff\1\u00af\1\u00b0"+
        "\1\47\1\u00b2\1\u00b3\2\uffff\1\47\2\uffff\1\47\1\u00b6\1\uffff";
    static final String DFA13_eofS =
        "\u00b7\uffff";
    static final String DFA13_minS =
        "\1\0\1\uffff\1\147\1\141\2\145\1\154\4\uffff\1\155\1\141\1\156"+
        "\5\uffff\1\56\3\uffff\1\141\1\164\1\0\1\162\1\141\1\101\2\uffff"+
        "\2\0\1\52\3\uffff\1\163\1\147\1\uffff\1\160\1\164\1\156\1\141\1"+
        "\155\1\141\4\uffff\1\160\1\101\1\143\1\144\12\uffff\1\166\1\154"+
        "\1\141\1\uffff\1\165\1\154\5\uffff\1\157\1\162\1\145\1\141\1\145"+
        "\1\154\1\160\1\163\1\157\1\60\1\153\1\60\1\151\1\154\1\164\1\145"+
        "\1\163\1\143\1\145\1\156\1\164\1\162\1\151\1\157\1\163\1\162\1\uffff"+
        "\1\141\1\uffff\1\147\1\60\1\151\1\60\1\145\1\151\1\147\1\143\1\171"+
        "\1\141\1\172\1\163\1\60\1\164\1\147\1\141\1\uffff\1\143\1\uffff"+
        "\1\60\2\141\1\171\1\160\1\154\1\141\1\151\1\uffff\1\60\1\145\1\142"+
        "\1\60\1\uffff\2\164\1\60\1\145\1\151\2\164\1\uffff\1\60\1\154\1"+
        "\uffff\2\151\1\uffff\1\60\1\172\2\151\1\uffff\1\145\2\157\1\uffff"+
        "\1\141\2\157\1\60\2\156\1\164\2\156\1\uffff\2\60\1\151\2\60\2\uffff"+
        "\1\157\2\uffff\1\156\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\uffff\1\163\3\145\1\157\4\uffff\1\163\1\141\1\156\5"+
        "\uffff\1\56\3\uffff\1\165\1\164\1\uffff\1\162\1\141\1\172\2\uffff"+
        "\2\uffff\1\57\3\uffff\1\163\1\147\1\uffff\1\160\1\164\1\156\1\141"+
        "\1\155\1\141\4\uffff\1\160\1\101\1\143\1\144\12\uffff\1\166\1\154"+
        "\1\141\1\uffff\1\165\1\154\5\uffff\1\157\1\162\1\145\1\141\1\145"+
        "\1\154\1\160\1\163\1\157\1\172\1\153\1\172\1\151\1\154\1\164\1\145"+
        "\1\163\1\143\1\145\1\156\1\164\1\162\1\151\1\157\1\163\1\162\1\uffff"+
        "\1\141\1\uffff\1\147\1\172\1\151\1\172\1\145\1\151\1\147\1\143\1"+
        "\171\1\141\1\172\1\163\1\172\1\164\1\147\1\141\1\uffff\1\143\1\uffff"+
        "\1\172\2\141\1\171\1\160\1\154\1\141\1\151\1\uffff\1\172\1\145\1"+
        "\142\1\172\1\uffff\2\164\1\172\1\145\1\151\2\164\1\uffff\1\172\1"+
        "\154\1\uffff\2\151\1\uffff\2\172\2\151\1\uffff\1\145\2\157\1\uffff"+
        "\1\141\2\157\1\172\2\156\1\164\2\156\1\uffff\2\172\1\151\2\172\2"+
        "\uffff\1\157\2\uffff\1\156\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\5\uffff\1\10\1\11\1\12\1\13\3\uffff\1\21\1\22\1\23"+
        "\1\25\1\26\1\uffff\1\30\1\31\1\32\6\uffff\1\42\1\43\3\uffff\1\47"+
        "\1\50\1\1\2\uffff\1\42\6\uffff\1\10\1\11\1\12\1\13\4\uffff\1\21"+
        "\1\22\1\23\1\25\1\26\1\27\1\33\1\30\1\31\1\32\3\uffff\1\36\2\uffff"+
        "\1\43\1\44\1\45\1\46\1\47\32\uffff\1\24\1\uffff\1\17\20\uffff\1"+
        "\40\1\uffff\1\37\10\uffff\1\20\4\uffff\1\41\7\uffff\1\14\2\uffff"+
        "\1\35\2\uffff\1\3\4\uffff\1\16\3\uffff\1\15\11\uffff\1\34\5\uffff"+
        "\1\2\1\6\1\uffff\1\5\1\7\2\uffff\1\4";
    static final String DFA13_specialS =
        "\1\2\30\uffff\1\0\5\uffff\1\1\1\3\u0096\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\1\11\3\43\1\40\1"+
            "\17\1\20\1\1\1\7\1\21\1\10\1\23\1\41\12\36\1\22\2\43\1\24\2"+
            "\43\1\16\32\35\1\25\1\43\1\26\1\34\1\35\1\43\1\2\1\35\1\6\1"+
            "\3\1\15\1\33\1\4\1\35\1\13\4\35\1\27\1\35\1\14\1\35\1\5\1\30"+
            "\1\32\6\35\1\31\2\43\1\12\uff81\43",
            "",
            "\1\46\13\uffff\1\45",
            "\1\51\3\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\55\2\uffff\1\54",
            "",
            "",
            "",
            "",
            "\1\62\5\uffff\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\73",
            "",
            "",
            "",
            "\1\100\23\uffff\1\101",
            "\1\102",
            "\0\103",
            "\1\104",
            "\1\105",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\107",
            "\0\107",
            "\1\110\4\uffff\1\111",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
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
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\146",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "",
            "\1\167",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\171",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0091",
            "\1\u0092",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0094",
            "\1\u0095",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u00b4",
            "",
            "",
            "\1\u00b5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_CONSTRAINT | RULE_TRUE | RULE_NULL | RULE_FALSE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( ((LA13_25>='\u0000' && LA13_25<='\uFFFF')) ) {s = 67;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_31 = input.LA(1);

                        s = -1;
                        if ( ((LA13_31>='\u0000' && LA13_31<='\uFFFF')) ) {s = 71;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='*') ) {s = 1;}

                        else if ( (LA13_0=='a') ) {s = 2;}

                        else if ( (LA13_0=='d') ) {s = 3;}

                        else if ( (LA13_0=='g') ) {s = 4;}

                        else if ( (LA13_0=='r') ) {s = 5;}

                        else if ( (LA13_0=='c') ) {s = 6;}

                        else if ( (LA13_0=='+') ) {s = 7;}

                        else if ( (LA13_0=='-') ) {s = 8;}

                        else if ( (LA13_0=='#') ) {s = 9;}

                        else if ( (LA13_0=='~') ) {s = 10;}

                        else if ( (LA13_0=='i') ) {s = 11;}

                        else if ( (LA13_0=='p') ) {s = 12;}

                        else if ( (LA13_0=='e') ) {s = 13;}

                        else if ( (LA13_0=='@') ) {s = 14;}

                        else if ( (LA13_0=='(') ) {s = 15;}

                        else if ( (LA13_0==')') ) {s = 16;}

                        else if ( (LA13_0==',') ) {s = 17;}

                        else if ( (LA13_0==':') ) {s = 18;}

                        else if ( (LA13_0=='.') ) {s = 19;}

                        else if ( (LA13_0=='=') ) {s = 20;}

                        else if ( (LA13_0=='[') ) {s = 21;}

                        else if ( (LA13_0==']') ) {s = 22;}

                        else if ( (LA13_0=='n') ) {s = 23;}

                        else if ( (LA13_0=='s') ) {s = 24;}

                        else if ( (LA13_0=='{') ) {s = 25;}

                        else if ( (LA13_0=='t') ) {s = 26;}

                        else if ( (LA13_0=='f') ) {s = 27;}

                        else if ( (LA13_0=='^') ) {s = 28;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='h'||(LA13_0>='j' && LA13_0<='m')||LA13_0=='o'||LA13_0=='q'||(LA13_0>='u' && LA13_0<='z')) ) {s = 29;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 30;}

                        else if ( (LA13_0=='\"') ) {s = 31;}

                        else if ( (LA13_0=='\'') ) {s = 32;}

                        else if ( (LA13_0=='/') ) {s = 33;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 34;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>=';' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='?')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='|' && LA13_0<='}')||(LA13_0>='\u007F' && LA13_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFF')) ) {s = 71;}

                        else s = 35;

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
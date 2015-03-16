// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g 2015-03-11 20:32:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class testLexer extends Lexer {
    public static final int VAL=7;
    public static final int T__50=50;
    public static final int ARRAY=15;
    public static final int LoE=31;
    public static final int VAR=6;
    public static final int IDF=33;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int ELSE=26;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int TYPE=8;
    public static final int IF=23;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int ARRAY_ACCESS=18;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int FOR=22;
    public static final int BLOCK=27;
    public static final int FUNCTION=10;
    public static final int NAME=9;
    public static final int READ=29;
    public static final int FUNC_CALL=19;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int CONDITION=24;
    public static final int THEN=25;
    public static final int T__69=69;
    public static final int PARAMS=13;
    public static final int T__62=62;
    public static final int GoE=32;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RANGE=16;
    public static final int T__70=70;
    public static final int ARGS=20;
    public static final int DECLARATIONS=4;
    public static final int WRITE=30;
    public static final int RETURN=28;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int CST_INT=34;
    public static final int WS=36;
    public static final int EOF=-1;
    public static final int CELLS=17;
    public static final int VAR_AFFECTATION=21;
    public static final int PROTOTYPE=12;
    public static final int INSTRUCTIONS=5;
    public static final int PARAM=14;
    public static final int CST_STRING=35;
    public static final int PROC=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public testLexer() {;} 
    public testLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public testLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g"; }

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:7:7: ( 'do' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:7:9: 'do'
            {
            match("do"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:8:7: ( 'end' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:8:9: 'end'
            {
            match("end"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:9:7: ( 'function' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:9:9: 'function'
            {
            match("function"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:10:7: ( '(' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:10:9: '('
            {
            match('('); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:11:7: ( ')' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:11:9: ')'
            {
            match(')'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:12:7: ( 'procedure' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:12:9: 'procedure'
            {
            match("procedure"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:13:7: ( ':' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:14:7: ( ',' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:15:7: ( 'integer' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:15:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:16:7: ( 'boolean' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:16:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:17:7: ( 'array' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:17:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:18:7: ( '[' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:19:7: ( '..' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:19:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:20:7: ( ']' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:21:7: ( '()' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:21:9: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:22:7: ( '=' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:23:7: ( 'begin' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:23:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:24:7: ( 'for' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:24:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:25:7: ( 'in' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:25:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:26:7: ( 'if' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:26:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:27:7: ( 'then' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:27:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:28:7: ( 'else' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:28:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:29:7: ( 'fi' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:29:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:30:7: ( 'read' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:30:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:31:7: ( 'write' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:31:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:32:7: ( 'return' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:32:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:33:7: ( '<' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:33:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:34:7: ( '>' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:34:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:35:7: ( '==' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:35:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:36:7: ( '!=' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:36:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:37:7: ( '+' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:37:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:38:7: ( '-' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:38:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:39:7: ( '*' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:39:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:40:7: ( '/' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:40:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:111:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:111:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:111:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF"

    // $ANTLR start "CST_INT"
    public final void mCST_INT() throws RecognitionException {
        try {
            int _type = CST_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:112:8: ( ( '0' .. '9' )+ )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:112:10: ( '0' .. '9' )+
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:112:10: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:112:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CST_INT"

    // $ANTLR start "CST_STRING"
    public final void mCST_STRING() throws RecognitionException {
        try {
            int _type = CST_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:113:11: ( '\"' (~ ( '\"' ) )* '\"' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:113:13: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:113:17: (~ ( '\"' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:113:18: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
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

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CST_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:114:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )* )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:114:6: ( ' ' | '\\t' | '\\n' | '\\r' )*
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:114:6: ( ' ' | '\\t' | '\\n' | '\\r' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:
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
            	    break loop4;
                }
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | IDF | CST_INT | CST_STRING | WS )
        int alt5=38;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:10: T__37
                {
                mT__37(); 

                }
                break;
            case 2 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:16: T__38
                {
                mT__38(); 

                }
                break;
            case 3 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:22: T__39
                {
                mT__39(); 

                }
                break;
            case 4 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:28: T__40
                {
                mT__40(); 

                }
                break;
            case 5 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:34: T__41
                {
                mT__41(); 

                }
                break;
            case 6 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:40: T__42
                {
                mT__42(); 

                }
                break;
            case 7 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:46: T__43
                {
                mT__43(); 

                }
                break;
            case 8 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:52: T__44
                {
                mT__44(); 

                }
                break;
            case 9 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:58: T__45
                {
                mT__45(); 

                }
                break;
            case 10 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:64: T__46
                {
                mT__46(); 

                }
                break;
            case 11 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:70: T__47
                {
                mT__47(); 

                }
                break;
            case 12 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:76: T__48
                {
                mT__48(); 

                }
                break;
            case 13 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:82: T__49
                {
                mT__49(); 

                }
                break;
            case 14 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:88: T__50
                {
                mT__50(); 

                }
                break;
            case 15 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:94: T__51
                {
                mT__51(); 

                }
                break;
            case 16 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:100: T__52
                {
                mT__52(); 

                }
                break;
            case 17 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:106: T__53
                {
                mT__53(); 

                }
                break;
            case 18 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:112: T__54
                {
                mT__54(); 

                }
                break;
            case 19 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:118: T__55
                {
                mT__55(); 

                }
                break;
            case 20 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:124: T__56
                {
                mT__56(); 

                }
                break;
            case 21 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:130: T__57
                {
                mT__57(); 

                }
                break;
            case 22 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:136: T__58
                {
                mT__58(); 

                }
                break;
            case 23 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:142: T__59
                {
                mT__59(); 

                }
                break;
            case 24 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:148: T__60
                {
                mT__60(); 

                }
                break;
            case 25 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:154: T__61
                {
                mT__61(); 

                }
                break;
            case 26 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:160: T__62
                {
                mT__62(); 

                }
                break;
            case 27 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:166: T__63
                {
                mT__63(); 

                }
                break;
            case 28 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:172: T__64
                {
                mT__64(); 

                }
                break;
            case 29 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:178: T__65
                {
                mT__65(); 

                }
                break;
            case 30 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:184: T__66
                {
                mT__66(); 

                }
                break;
            case 31 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:190: T__67
                {
                mT__67(); 

                }
                break;
            case 32 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:196: T__68
                {
                mT__68(); 

                }
                break;
            case 33 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:202: T__69
                {
                mT__69(); 

                }
                break;
            case 34 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:208: T__70
                {
                mT__70(); 

                }
                break;
            case 35 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:214: IDF
                {
                mIDF(); 

                }
                break;
            case 36 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:218: CST_INT
                {
                mCST_INT(); 

                }
                break;
            case 37 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:226: CST_STRING
                {
                mCST_STRING(); 

                }
                break;
            case 38 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\test.g:1:237: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\35\3\32\1\45\1\uffff\1\32\2\uffff\3\32\3\uffff\1\55\3\32\13"+
        "\uffff\1\61\4\32\1\66\2\uffff\1\32\1\71\1\72\3\32\2\uffff\3\32\1"+
        "\uffff\1\102\2\32\1\105\1\uffff\2\32\2\uffff\7\32\1\uffff\1\117"+
        "\1\32\1\uffff\5\32\1\126\1\127\2\32\1\uffff\4\32\1\136\1\137\2\uffff"+
        "\1\32\1\141\4\32\2\uffff\1\146\1\uffff\2\32\1\151\1\152\1\uffff"+
        "\1\153\1\32\3\uffff\1\155\1\uffff";
    static final String DFA5_eofS =
        "\156\uffff";
    static final String DFA5_minS =
        "\1\41\1\157\1\154\1\151\1\51\1\uffff\1\162\2\uffff\1\146\1\145"+
        "\1\162\3\uffff\1\75\1\150\1\145\1\162\13\uffff\1\101\1\144\1\163"+
        "\1\156\1\162\1\101\2\uffff\1\157\2\101\1\157\1\147\1\162\2\uffff"+
        "\1\145\1\141\1\151\1\uffff\1\101\1\145\1\143\1\101\1\uffff\1\143"+
        "\1\145\2\uffff\1\154\1\151\1\141\1\156\1\144\1\165\1\164\1\uffff"+
        "\1\101\1\164\1\uffff\1\145\1\147\1\145\1\156\1\171\2\101\1\162\1"+
        "\145\1\uffff\1\151\1\144\1\145\1\141\2\101\2\uffff\1\156\1\101\1"+
        "\157\1\165\1\162\1\156\2\uffff\1\101\1\uffff\1\156\1\162\2\101\1"+
        "\uffff\1\101\1\145\3\uffff\1\101\1\uffff";
    static final String DFA5_maxS =
        "\1\172\1\157\1\156\1\165\1\51\1\uffff\1\162\2\uffff\1\156\1\157"+
        "\1\162\3\uffff\1\75\1\150\1\145\1\162\13\uffff\1\172\1\144\1\163"+
        "\1\156\1\162\1\172\2\uffff\1\157\2\172\1\157\1\147\1\162\2\uffff"+
        "\1\145\1\164\1\151\1\uffff\1\172\1\145\1\143\1\172\1\uffff\1\143"+
        "\1\145\2\uffff\1\154\1\151\1\141\1\156\1\144\1\165\1\164\1\uffff"+
        "\1\172\1\164\1\uffff\1\145\1\147\1\145\1\156\1\171\2\172\1\162\1"+
        "\145\1\uffff\1\151\1\144\1\145\1\141\2\172\2\uffff\1\156\1\172\1"+
        "\157\1\165\1\162\1\156\2\uffff\1\172\1\uffff\1\156\1\162\2\172\1"+
        "\uffff\1\172\1\145\3\uffff\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\5\uffff\1\5\1\uffff\1\7\1\10\3\uffff\1\14\1\15\1\16\4\uffff\1"+
        "\33\1\34\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\6\uffff\1"+
        "\17\1\4\6\uffff\1\35\1\20\3\uffff\1\1\4\uffff\1\27\2\uffff\1\23"+
        "\1\24\7\uffff\1\2\2\uffff\1\22\11\uffff\1\26\6\uffff\1\25\1\30\6"+
        "\uffff\1\21\1\13\1\uffff\1\31\4\uffff\1\32\2\uffff\1\11\1\12\1\3"+
        "\1\uffff\1\6";
    static final String DFA5_specialS =
        "\156\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\25\1\34\5\uffff\1\4\1\5\1\30\1\26\1\10\1\27\1\15\1\31\12"+
            "\33\1\7\1\uffff\1\23\1\17\1\24\2\uffff\32\32\1\14\1\uffff\1"+
            "\16\1\uffff\1\32\1\uffff\1\13\1\12\1\32\1\1\1\2\1\3\2\32\1\11"+
            "\6\32\1\6\1\32\1\21\1\32\1\20\2\32\1\22\3\32",
            "\1\36",
            "\1\40\1\uffff\1\37",
            "\1\43\5\uffff\1\42\5\uffff\1\41",
            "\1\44",
            "",
            "\1\46",
            "",
            "",
            "\1\50\7\uffff\1\47",
            "\1\52\11\uffff\1\51",
            "\1\53",
            "",
            "",
            "",
            "\1\54",
            "\1\56",
            "\1\57",
            "\1\60",
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
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\67",
            "\32\32\4\uffff\1\32\1\uffff\23\32\1\70\6\32",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\77\22\uffff\1\100",
            "\1\101",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\103",
            "\1\104",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\140",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\147",
            "\1\150",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\154",
            "",
            "",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | IDF | CST_INT | CST_STRING | WS );";
        }
    }
 

}
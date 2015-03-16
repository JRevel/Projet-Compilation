// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g 2015-03-11 14:38:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MessyCompilLexer extends Lexer {
    public static final int IDF=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int CST_INT=5;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__10=10;
    public static final int T__32=32;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int CST_STRING=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public MessyCompilLexer() {;} 
    public MessyCompilLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MessyCompilLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:7:6: ( 'do' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:7:8: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:8:6: ( 'end' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:8:8: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:9:7: ( 'function' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:9:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:10:7: ( '(' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:11:7: ( ')' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:11:9: ')'
            {
            match(')'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:12:7: ( 'procedure' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:12:9: 'procedure'
            {
            match("procedure"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:13:7: ( '()' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:13:9: '()'
            {
            match("()"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:14:7: ( ':' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:14:9: ':'
            {
            match(':'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:15:7: ( ',' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:15:9: ','
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:16:7: ( 'integer' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:16:9: 'integer'
            {
            match("integer"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:17:7: ( 'boolean' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:17:9: 'boolean'
            {
            match("boolean"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:18:7: ( 'array' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:18:9: 'array'
            {
            match("array"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:19:7: ( '[' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:19:9: '['
            {
            match('['); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:20:7: ( '..' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:20:9: '..'
            {
            match(".."); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:21:7: ( ']' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:21:9: ']'
            {
            match(']'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:22:7: ( '=' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:22:9: '='
            {
            match('='); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:23:7: ( 'begin' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:23:9: 'begin'
            {
            match("begin"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:24:7: ( 'for' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:24:9: 'for'
            {
            match("for"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:25:7: ( 'in' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:25:9: 'in'
            {
            match("in"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:26:7: ( 'if' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:26:9: 'if'
            {
            match("if"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:27:7: ( 'then' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:27:9: 'then'
            {
            match("then"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:28:7: ( 'else' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:28:9: 'else'
            {
            match("else"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:29:7: ( 'fi' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:29:9: 'fi'
            {
            match("fi"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:30:7: ( 'read' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:30:9: 'read'
            {
            match("read"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:31:7: ( 'write' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:31:9: 'write'
            {
            match("write"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:32:7: ( 'return' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:32:9: 'return'
            {
            match("return"); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:33:7: ( '>' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:33:9: '>'
            {
            match('>'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:34:7: ( '<' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:34:9: '<'
            {
            match('<'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:35:7: ( '==' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:35:9: '=='
            {
            match("=="); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:36:7: ( '!=' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:36:9: '!='
            {
            match("!="); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:37:7: ( '+' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:37:9: '+'
            {
            match('+'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:38:7: ( '-' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:38:9: '-'
            {
            match('-'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:39:7: ( '*' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:39:9: '*'
            {
            match('*'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:40:7: ( '/' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:40:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:90:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:90:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:90:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
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
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:91:8: ( ( '0' .. '9' )+ )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:91:10: ( '0' .. '9' )+
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:91:10: ( '0' .. '9' )+
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
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:91:10: '0' .. '9'
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:92:11: ( '\"' (~ ( '\"' ) )* '\"' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:92:13: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:92:17: (~ ( '\"' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:92:18: ~ ( '\"' )
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:93:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )* )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:93:6: ( ' ' | '\\t' | '\\n' | '\\r' )*
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:93:6: ( ' ' | '\\t' | '\\n' | '\\r' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:
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
        // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | IDF | CST_INT | CST_STRING | WS )
        int alt5=38;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:146: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:152: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:158: T__33
                {
                mT__33(); 

                }
                break;
            case 27 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:164: T__34
                {
                mT__34(); 

                }
                break;
            case 28 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:170: T__35
                {
                mT__35(); 

                }
                break;
            case 29 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:176: T__36
                {
                mT__36(); 

                }
                break;
            case 30 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:182: T__37
                {
                mT__37(); 

                }
                break;
            case 31 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:188: T__38
                {
                mT__38(); 

                }
                break;
            case 32 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:194: T__39
                {
                mT__39(); 

                }
                break;
            case 33 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:200: T__40
                {
                mT__40(); 

                }
                break;
            case 34 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:206: T__41
                {
                mT__41(); 

                }
                break;
            case 35 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:212: IDF
                {
                mIDF(); 

                }
                break;
            case 36 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:216: CST_INT
                {
                mCST_INT(); 

                }
                break;
            case 37 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:224: CST_STRING
                {
                mCST_STRING(); 

                }
                break;
            case 38 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\MessyCompil.g:1:235: WS
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
        "\5\uffff\1\5\1\uffff\1\10\1\11\3\uffff\1\15\1\16\1\17\4\uffff\1"+
        "\33\1\34\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\6\uffff\1"+
        "\7\1\4\6\uffff\1\35\1\20\3\uffff\1\1\4\uffff\1\27\2\uffff\1\23\1"+
        "\24\7\uffff\1\2\2\uffff\1\22\11\uffff\1\26\6\uffff\1\25\1\30\6\uffff"+
        "\1\21\1\14\1\uffff\1\31\4\uffff\1\32\2\uffff\1\12\1\13\1\3\1\uffff"+
        "\1\6";
    static final String DFA5_specialS =
        "\156\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\25\1\34\5\uffff\1\4\1\5\1\30\1\26\1\10\1\27\1\15\1\31\12"+
            "\33\1\7\1\uffff\1\24\1\17\1\23\2\uffff\32\32\1\14\1\uffff\1"+
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
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | IDF | CST_INT | CST_STRING | WS );";
        }
    }
 

}
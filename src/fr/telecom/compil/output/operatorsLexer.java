// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g 2015-03-11 20:27:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class operatorsLexer extends Lexer {
    public static final int LoE=6;
    public static final int IDF=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int CST_INT=8;
    public static final int WS=10;
    public static final int EOF=-1;
    public static final int CST_STRING=9;
    public static final int OPERATION=4;
    public static final int GoE=5;
    public static final int T__20=20;

    // delegates
    // delegators

    public operatorsLexer() {;} 
    public operatorsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public operatorsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:7:7: ( '<' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:7:9: '<'
            {
            match('<'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:8:7: ( '=' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:8:9: '='
            {
            match('='); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:9:7: ( '>' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:9:9: '>'
            {
            match('>'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:10:7: ( '==' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:10:9: '=='
            {
            match("=="); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:11:7: ( '!=' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:11:9: '!='
            {
            match("!="); 


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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:12:7: ( '+' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:12:9: '+'
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:13:7: ( '-' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:13:9: '-'
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:14:7: ( '*' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:14:9: '*'
            {
            match('*'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:15:7: ( '/' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:15:9: '/'
            {
            match('/'); 

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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:16:7: ( ',' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:45:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:45:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:45:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
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
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:46:8: ( ( '0' .. '9' )+ )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:46:10: ( '0' .. '9' )+
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:46:10: ( '0' .. '9' )+
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
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:46:10: '0' .. '9'
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:47:11: ( '\"' (~ ( '\"' ) )* '\"' )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:47:13: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:47:17: (~ ( '\"' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:47:18: ~ ( '\"' )
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
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:48:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )* )
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:48:6: ( ' ' | '\\t' | '\\n' | '\\r' )*
            {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:48:6: ( ' ' | '\\t' | '\\n' | '\\r' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:
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
        // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | IDF | CST_INT | CST_STRING | WS )
        int alt5=14;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:70: IDF
                {
                mIDF(); 

                }
                break;
            case 12 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:74: CST_INT
                {
                mCST_INT(); 

                }
                break;
            case 13 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:82: CST_STRING
                {
                mCST_STRING(); 

                }
                break;
            case 14 :
                // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:1:93: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\15\1\uffff\1\17\15\uffff";
    static final String DFA5_eofS =
        "\20\uffff";
    static final String DFA5_minS =
        "\1\41\1\uffff\1\75\15\uffff";
    static final String DFA5_maxS =
        "\1\172\1\uffff\1\75\15\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\4\1\2";
    static final String DFA5_specialS =
        "\20\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\1\14\7\uffff\1\7\1\5\1\11\1\6\1\uffff\1\10\12\13\2\uffff"+
            "\1\1\1\2\1\3\2\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "\1\16",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | IDF | CST_INT | CST_STRING | WS );";
        }
    }
 

}
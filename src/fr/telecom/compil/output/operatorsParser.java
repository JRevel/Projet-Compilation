// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g 2015-03-11 20:27:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class operatorsParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OPERATION", "GoE", "LoE", "IDF", "CST_INT", "CST_STRING", "WS", "'<'", "'='", "'>'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "','"
    };
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "val_list", "prog", "oper_low", "oper_high", "operchar_high", 
        "operchar_low", "operchar_high_bis", "oper_mid", "simple_val", "val", 
        "operchar_mid"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public operatorsParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public operatorsParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public operatorsParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return operatorsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:13:1: prog : val ;
    public final operatorsParser.prog_return prog() throws RecognitionException {
        operatorsParser.prog_return retval = new operatorsParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operatorsParser.val_return val1 = null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:13:5: ( val )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:13:7: val
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(13,7);
            pushFollow(FOLLOW_val_in_prog52);
            val1=val();

            state._fsp--;

            adaptor.addChild(root_0, val1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(13, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    public static class val_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "val"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:15:1: val : oper_low ;
    public final operatorsParser.val_return val() throws RecognitionException {
        operatorsParser.val_return retval = new operatorsParser.val_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operatorsParser.oper_low_return oper_low2 = null;



        try { dbg.enterRule(getGrammarFileName(), "val");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:15:4: ( oper_low )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:15:6: oper_low
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(15,6);
            pushFollow(FOLLOW_oper_low_in_val59);
            oper_low2=oper_low();

            state._fsp--;

            adaptor.addChild(root_0, oper_low2.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(15, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "val");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "val"

    public static class oper_low_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper_low"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:17:1: oper_low : ( oper_mid -> oper_mid ) ( operchar_low oper_low -> ^( operchar_low oper_mid oper_low ) )? ;
    public final operatorsParser.oper_low_return oper_low() throws RecognitionException {
        operatorsParser.oper_low_return retval = new operatorsParser.oper_low_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operatorsParser.oper_mid_return oper_mid3 = null;

        operatorsParser.operchar_low_return operchar_low4 = null;

        operatorsParser.oper_low_return oper_low5 = null;


        RewriteRuleSubtreeStream stream_operchar_low=new RewriteRuleSubtreeStream(adaptor,"rule operchar_low");
        RewriteRuleSubtreeStream stream_oper_low=new RewriteRuleSubtreeStream(adaptor,"rule oper_low");
        RewriteRuleSubtreeStream stream_oper_mid=new RewriteRuleSubtreeStream(adaptor,"rule oper_mid");
        try { dbg.enterRule(getGrammarFileName(), "oper_low");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:17:9: ( ( oper_mid -> oper_mid ) ( operchar_low oper_low -> ^( operchar_low oper_mid oper_low ) )? )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:17:11: ( oper_mid -> oper_mid ) ( operchar_low oper_low -> ^( operchar_low oper_mid oper_low ) )?
            {
            dbg.location(17,11);
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:17:11: ( oper_mid -> oper_mid )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:17:12: oper_mid
            {
            dbg.location(17,12);
            pushFollow(FOLLOW_oper_mid_in_oper_low67);
            oper_mid3=oper_mid();

            state._fsp--;

            stream_oper_mid.add(oper_mid3.getTree());


            // AST REWRITE
            // elements: oper_mid
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 17:20: -> oper_mid
            {
                dbg.location(17,22);
                adaptor.addChild(root_0, stream_oper_mid.nextTree());

            }

            retval.tree = root_0;
            }

            dbg.location(17,32);
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:17:32: ( operchar_low oper_low -> ^( operchar_low oper_mid oper_low ) )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=15)) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:17:33: operchar_low oper_low
                    {
                    dbg.location(17,33);
                    pushFollow(FOLLOW_operchar_low_in_oper_low73);
                    operchar_low4=operchar_low();

                    state._fsp--;

                    stream_operchar_low.add(operchar_low4.getTree());
                    dbg.location(17,46);
                    pushFollow(FOLLOW_oper_low_in_oper_low75);
                    oper_low5=oper_low();

                    state._fsp--;

                    stream_oper_low.add(oper_low5.getTree());


                    // AST REWRITE
                    // elements: oper_mid, oper_low, operchar_low
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 17:55: -> ^( operchar_low oper_mid oper_low )
                    {
                        dbg.location(17,58);
                        // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:17:58: ^( operchar_low oper_mid oper_low )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(17,60);
                        root_1 = (Object)adaptor.becomeRoot(stream_operchar_low.nextNode(), root_1);

                        dbg.location(17,73);
                        adaptor.addChild(root_1, stream_oper_mid.nextTree());
                        dbg.location(17,82);
                        adaptor.addChild(root_1, stream_oper_low.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(17, 93);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oper_low");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oper_low"

    public static class operchar_low_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operchar_low"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:19:1: operchar_low : ( ( '<' -> '<' ) ( '=' -> LoE )? | ( '>' -> '>' ) ( '=' -> GoE )? | '==' | '!=' );
    public final operatorsParser.operchar_low_return operchar_low() throws RecognitionException {
        operatorsParser.operchar_low_return retval = new operatorsParser.operchar_low_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal6=null;
        Token char_literal7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token string_literal10=null;
        Token string_literal11=null;

        Object char_literal6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        Object string_literal10_tree=null;
        Object string_literal11_tree=null;
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");

        try { dbg.enterRule(getGrammarFileName(), "operchar_low");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:19:13: ( ( '<' -> '<' ) ( '=' -> LoE )? | ( '>' -> '>' ) ( '=' -> GoE )? | '==' | '!=' )
            int alt4=4;
            try { dbg.enterDecision(4);

            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:19:15: ( '<' -> '<' ) ( '=' -> LoE )?
                    {
                    dbg.location(19,15);
                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:19:15: ( '<' -> '<' )
                    dbg.enterAlt(1);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:19:16: '<'
                    {
                    dbg.location(19,16);
                    char_literal6=(Token)match(input,11,FOLLOW_11_in_operchar_low99);  
                    stream_11.add(char_literal6);



                    // AST REWRITE
                    // elements: 11
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 19:19: -> '<'
                    {
                        dbg.location(19,21);
                        adaptor.addChild(root_0, stream_11.nextNode());

                    }

                    retval.tree = root_0;
                    }

                    dbg.location(19,26);
                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:19:26: ( '=' -> LoE )?
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2);

                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==12) ) {
                        alt2=1;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:19:27: '='
                            {
                            dbg.location(19,27);
                            char_literal7=(Token)match(input,12,FOLLOW_12_in_operchar_low105);  
                            stream_12.add(char_literal7);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 19:31: -> LoE
                            {
                                dbg.location(19,34);
                                adaptor.addChild(root_0, (Object)adaptor.create(LoE, "LoE"));

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:20:4: ( '>' -> '>' ) ( '=' -> GoE )?
                    {
                    dbg.location(20,4);
                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:20:4: ( '>' -> '>' )
                    dbg.enterAlt(1);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:20:5: '>'
                    {
                    dbg.location(20,5);
                    char_literal8=(Token)match(input,13,FOLLOW_13_in_operchar_low117);  
                    stream_13.add(char_literal8);



                    // AST REWRITE
                    // elements: 13
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 20:8: -> '>'
                    {
                        dbg.location(20,10);
                        adaptor.addChild(root_0, stream_13.nextNode());

                    }

                    retval.tree = root_0;
                    }

                    dbg.location(20,15);
                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:20:15: ( '=' -> GoE )?
                    int alt3=2;
                    try { dbg.enterSubRule(3);
                    try { dbg.enterDecision(3);

                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==12) ) {
                        alt3=1;
                    }
                    } finally {dbg.exitDecision(3);}

                    switch (alt3) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:20:16: '='
                            {
                            dbg.location(20,16);
                            char_literal9=(Token)match(input,12,FOLLOW_12_in_operchar_low123);  
                            stream_12.add(char_literal9);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 20:20: -> GoE
                            {
                                dbg.location(20,23);
                                adaptor.addChild(root_0, (Object)adaptor.create(GoE, "GoE"));

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(3);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:21:4: '=='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(21,4);
                    string_literal10=(Token)match(input,14,FOLLOW_14_in_operchar_low134); 
                    string_literal10_tree = (Object)adaptor.create(string_literal10);
                    adaptor.addChild(root_0, string_literal10_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:22:4: '!='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(22,4);
                    string_literal11=(Token)match(input,15,FOLLOW_15_in_operchar_low139); 
                    string_literal11_tree = (Object)adaptor.create(string_literal11);
                    adaptor.addChild(root_0, string_literal11_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(23, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operchar_low");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operchar_low"

    public static class operchar_high_bis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operchar_high_bis"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:25:1: operchar_high_bis : ( '=' | );
    public final operatorsParser.operchar_high_bis_return operchar_high_bis() throws RecognitionException {
        operatorsParser.operchar_high_bis_return retval = new operatorsParser.operchar_high_bis_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal12=null;

        Object char_literal12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operchar_high_bis");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:25:18: ( '=' | )
            int alt5=2;
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:25:20: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(25,20);
                    char_literal12=(Token)match(input,12,FOLLOW_12_in_operchar_high_bis148); 
                    char_literal12_tree = (Object)adaptor.create(char_literal12);
                    adaptor.addChild(root_0, char_literal12_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:25:26: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(25, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operchar_high_bis");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operchar_high_bis"

    public static class oper_mid_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper_mid"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:27:1: oper_mid : ( oper_high -> oper_high ) ( operchar_mid oper_mid -> ^( operchar_mid oper_high oper_mid ) )? ;
    public final operatorsParser.oper_mid_return oper_mid() throws RecognitionException {
        operatorsParser.oper_mid_return retval = new operatorsParser.oper_mid_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operatorsParser.oper_high_return oper_high13 = null;

        operatorsParser.operchar_mid_return operchar_mid14 = null;

        operatorsParser.oper_mid_return oper_mid15 = null;


        RewriteRuleSubtreeStream stream_operchar_mid=new RewriteRuleSubtreeStream(adaptor,"rule operchar_mid");
        RewriteRuleSubtreeStream stream_oper_high=new RewriteRuleSubtreeStream(adaptor,"rule oper_high");
        RewriteRuleSubtreeStream stream_oper_mid=new RewriteRuleSubtreeStream(adaptor,"rule oper_mid");
        try { dbg.enterRule(getGrammarFileName(), "oper_mid");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:27:9: ( ( oper_high -> oper_high ) ( operchar_mid oper_mid -> ^( operchar_mid oper_high oper_mid ) )? )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:27:11: ( oper_high -> oper_high ) ( operchar_mid oper_mid -> ^( operchar_mid oper_high oper_mid ) )?
            {
            dbg.location(27,11);
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:27:11: ( oper_high -> oper_high )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:27:12: oper_high
            {
            dbg.location(27,12);
            pushFollow(FOLLOW_oper_high_in_oper_mid159);
            oper_high13=oper_high();

            state._fsp--;

            stream_oper_high.add(oper_high13.getTree());


            // AST REWRITE
            // elements: oper_high
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:21: -> oper_high
            {
                dbg.location(27,23);
                adaptor.addChild(root_0, stream_oper_high.nextTree());

            }

            retval.tree = root_0;
            }

            dbg.location(27,34);
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:27:34: ( operchar_mid oper_mid -> ^( operchar_mid oper_high oper_mid ) )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:27:35: operchar_mid oper_mid
                    {
                    dbg.location(27,35);
                    pushFollow(FOLLOW_operchar_mid_in_oper_mid165);
                    operchar_mid14=operchar_mid();

                    state._fsp--;

                    stream_operchar_mid.add(operchar_mid14.getTree());
                    dbg.location(27,48);
                    pushFollow(FOLLOW_oper_mid_in_oper_mid167);
                    oper_mid15=oper_mid();

                    state._fsp--;

                    stream_oper_mid.add(oper_mid15.getTree());


                    // AST REWRITE
                    // elements: oper_high, operchar_mid, oper_mid
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 27:57: -> ^( operchar_mid oper_high oper_mid )
                    {
                        dbg.location(27,60);
                        // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:27:60: ^( operchar_mid oper_high oper_mid )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(27,62);
                        root_1 = (Object)adaptor.becomeRoot(stream_operchar_mid.nextNode(), root_1);

                        dbg.location(27,75);
                        adaptor.addChild(root_1, stream_oper_high.nextTree());
                        dbg.location(27,85);
                        adaptor.addChild(root_1, stream_oper_mid.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(27, 96);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oper_mid");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oper_mid"

    public static class operchar_mid_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operchar_mid"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:29:1: operchar_mid : ( '+' | '-' );
    public final operatorsParser.operchar_mid_return operchar_mid() throws RecognitionException {
        operatorsParser.operchar_mid_return retval = new operatorsParser.operchar_mid_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set16=null;

        Object set16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operchar_mid");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:29:13: ( '+' | '-' )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(29,13);
            set16=(Token)input.LT(1);
            if ( (input.LA(1)>=16 && input.LA(1)<=17) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set16));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(30, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operchar_mid");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operchar_mid"

    public static class oper_high_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper_high"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:32:1: oper_high : ( simple_val -> simple_val ) ( operchar_high oper_high -> ^( operchar_high simple_val oper_high ) )? ;
    public final operatorsParser.oper_high_return oper_high() throws RecognitionException {
        operatorsParser.oper_high_return retval = new operatorsParser.oper_high_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operatorsParser.simple_val_return simple_val17 = null;

        operatorsParser.operchar_high_return operchar_high18 = null;

        operatorsParser.oper_high_return oper_high19 = null;


        RewriteRuleSubtreeStream stream_simple_val=new RewriteRuleSubtreeStream(adaptor,"rule simple_val");
        RewriteRuleSubtreeStream stream_operchar_high=new RewriteRuleSubtreeStream(adaptor,"rule operchar_high");
        RewriteRuleSubtreeStream stream_oper_high=new RewriteRuleSubtreeStream(adaptor,"rule oper_high");
        try { dbg.enterRule(getGrammarFileName(), "oper_high");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:32:10: ( ( simple_val -> simple_val ) ( operchar_high oper_high -> ^( operchar_high simple_val oper_high ) )? )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:32:12: ( simple_val -> simple_val ) ( operchar_high oper_high -> ^( operchar_high simple_val oper_high ) )?
            {
            dbg.location(32,12);
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:32:12: ( simple_val -> simple_val )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:32:13: simple_val
            {
            dbg.location(32,13);
            pushFollow(FOLLOW_simple_val_in_oper_high204);
            simple_val17=simple_val();

            state._fsp--;

            stream_simple_val.add(simple_val17.getTree());


            // AST REWRITE
            // elements: simple_val
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:23: -> simple_val
            {
                dbg.location(32,25);
                adaptor.addChild(root_0, stream_simple_val.nextTree());

            }

            retval.tree = root_0;
            }

            dbg.location(32,37);
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:32:37: ( operchar_high oper_high -> ^( operchar_high simple_val oper_high ) )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:32:38: operchar_high oper_high
                    {
                    dbg.location(32,38);
                    pushFollow(FOLLOW_operchar_high_in_oper_high210);
                    operchar_high18=operchar_high();

                    state._fsp--;

                    stream_operchar_high.add(operchar_high18.getTree());
                    dbg.location(32,52);
                    pushFollow(FOLLOW_oper_high_in_oper_high212);
                    oper_high19=oper_high();

                    state._fsp--;

                    stream_oper_high.add(oper_high19.getTree());


                    // AST REWRITE
                    // elements: oper_high, operchar_high, simple_val
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 32:62: -> ^( operchar_high simple_val oper_high )
                    {
                        dbg.location(32,65);
                        // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:32:65: ^( operchar_high simple_val oper_high )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(32,67);
                        root_1 = (Object)adaptor.becomeRoot(stream_operchar_high.nextNode(), root_1);

                        dbg.location(32,81);
                        adaptor.addChild(root_1, stream_simple_val.nextTree());
                        dbg.location(32,92);
                        adaptor.addChild(root_1, stream_oper_high.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(32, 104);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oper_high");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oper_high"

    public static class operchar_high_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operchar_high"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:34:1: operchar_high : ( '*' | '/' );
    public final operatorsParser.operchar_high_return operchar_high() throws RecognitionException {
        operatorsParser.operchar_high_return retval = new operatorsParser.operchar_high_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operchar_high");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:34:14: ( '*' | '/' )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(34,14);
            set20=(Token)input.LT(1);
            if ( (input.LA(1)>=18 && input.LA(1)<=19) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set20));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(36, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operchar_high");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operchar_high"

    public static class simple_val_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_val"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:40:1: simple_val : ( IDF | CST_INT );
    public final operatorsParser.simple_val_return simple_val() throws RecognitionException {
        operatorsParser.simple_val_return retval = new operatorsParser.simple_val_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set21=null;

        Object set21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "simple_val");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:40:11: ( IDF | CST_INT )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(40,11);
            set21=(Token)input.LT(1);
            if ( (input.LA(1)>=IDF && input.LA(1)<=CST_INT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set21));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(41, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "simple_val");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "simple_val"

    public static class val_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "val_list"
    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:43:1: val_list : val ( ',' val )* -> ( val )+ ;
    public final operatorsParser.val_list_return val_list() throws RecognitionException {
        operatorsParser.val_list_return retval = new operatorsParser.val_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal23=null;
        operatorsParser.val_return val22 = null;

        operatorsParser.val_return val24 = null;


        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val");
        try { dbg.enterRule(getGrammarFileName(), "val_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:43:9: ( val ( ',' val )* -> ( val )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:43:11: val ( ',' val )*
            {
            dbg.location(43,11);
            pushFollow(FOLLOW_val_in_val_list261);
            val22=val();

            state._fsp--;

            stream_val.add(val22.getTree());
            dbg.location(43,15);
            // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:43:15: ( ',' val )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Doubi\\Documents\\Programmation\\antlr\\operators.g:43:16: ',' val
            	    {
            	    dbg.location(43,16);
            	    char_literal23=(Token)match(input,20,FOLLOW_20_in_val_list264);  
            	    stream_20.add(char_literal23);

            	    dbg.location(43,20);
            	    pushFollow(FOLLOW_val_in_val_list266);
            	    val24=val();

            	    state._fsp--;

            	    stream_val.add(val24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}



            // AST REWRITE
            // elements: val
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 43:26: -> ( val )+
            {
                dbg.location(43,29);
                if ( !(stream_val.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_val.hasNext() ) {
                    dbg.location(43,29);
                    adaptor.addChild(root_0, stream_val.nextTree());

                }
                stream_val.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(43, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "val_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "val_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_val_in_prog52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_low_in_val59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_mid_in_oper_low67 = new BitSet(new long[]{0x000000000000E802L});
    public static final BitSet FOLLOW_operchar_low_in_oper_low73 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_oper_low_in_oper_low75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_operchar_low99 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_operchar_low105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_operchar_low117 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_operchar_low123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_operchar_low134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_operchar_low139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_operchar_high_bis148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_high_in_oper_mid159 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_operchar_mid_in_oper_mid165 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_oper_mid_in_oper_mid167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operchar_mid0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_val_in_oper_high204 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_operchar_high_in_oper_high210 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_oper_high_in_oper_high212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operchar_high0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_simple_val0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_val_in_val_list261 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_val_list264 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_val_in_val_list266 = new BitSet(new long[]{0x0000000000100002L});

}
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class JuicyBoysANTLRErrorListener implements ANTLRErrorListener {

    String output = "";
    ArrayList<Integer> lineErrors = new ArrayList<Integer>();
    Recognizer<?, ?> recognizer;
    Object o;
    int i; int i1; String s; RecognitionException e;


    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int lineNumber, int charPositionInLine, String msg, RecognitionException e) {

        List<String> stack;

        lineErrors.add(lineNumber);
    try {
        //for parser
        stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);

        output = output + "---------------------------------------------------- \n";

        output = output + "Parser Error: ";

        output = output + "Rule stack: " + stack + "\n";

        output = output + "You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;
        output = output + " \n \nSpecific Error: " + msg.toString() + "\n\n";
    }catch (Exception e2){
        //for lexer

        output = output + "----------------------------------------------------\n";
        output = output + "Lexer Error: ";
        output = output + "\nYou have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;
        output = output + " \n \nSpecific Error: " + msg.toString() + "\n\n";


    }


/*    System.out.println();
        offendingSymbol = msg.split("input")[1];

        System.out.println(offendingSymbol.toString());
        */
        /*System.out.println("Rule stack: " + stack);
        System.out.println("You have a syntax error at line: " + i);
        System.out.println("At character position: " + i1);*/




      /*  JDialog dialog = new JDialog();
        Container contentPane = dialog.getContentPane();
        contentPane.add(new JLabel(msg.toString()));
        contentPane.setBackground(Color.white);
        dialog.setTitle("Syntax error");
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);*/

        /*underlineError(recognizer,(Token)offendingSymbol,
                lineNumber, charPositionInLine);*/
    }





    protected void underlineError(Recognizer recognizer,
                                  Token offendingToken, int line,
                                  int charPositionInLine) {
        CommonTokenStream tokens =
                (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if ( start>=0 && stop>=0 ) {
            for (int i=start; i<=stop; i++) System.err.print("^");
        }
        System.err.println();
    }


    public ArrayList<Integer> getLineErrors() {
        return lineErrors;
    }

    public Recognizer<?, ?> getRecognizer() {
        return recognizer;
    }

    public Object getO() {
        return o;
    }

    public int getI() {
        return i;
    }

    public int getI1() {
        return i1;
    }

    public String getS() {
        return s;
    }

    public RecognitionException getE() {
        return e;
    }

    public String getOutput(){
        return output;
    }


    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int lineNumber, int charPositionInLine, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
        output = output + "\n\n-------------------------------------------\n\n";


        output = output + "You have an ambiguity: ";
        output = output + "\n You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int lineNumber, int charPositionInLine, BitSet bitSet, ATNConfigSet atnConfigSet) {


        output = output + "\n\n-------------------------------------------\n\n ";

        output = output + "Error: Attempting Full Context: ";
        output = output + "\n You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int lineNumber, int charPositionInLine, int i2, ATNConfigSet atnConfigSet) {
        output = output + "\n\n-------------------------------------------\n\n";

        output = output + "Error:  Context Sensitivity: ";
        output = output + "\n You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;


    }
}

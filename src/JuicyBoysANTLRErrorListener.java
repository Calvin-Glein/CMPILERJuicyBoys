import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import javax.swing.*;
import java.awt.*;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JuicyBoysANTLRErrorListener implements ANTLRErrorListener {

    String output = "";
    Recognizer<?, ?> recognizer;
    Object o;
    int i; int i1; String s; RecognitionException e;


    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int lineNumber, int charPositionInLine, String msg, RecognitionException e) {
        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        /*System.out.println("Rule stack: " + stack);
        System.out.println("You have a syntax error at line: " + i);
        System.out.println("At character position: " + i1);*/

        output = "";
        output = output + "Rule stack: " + stack + "\n";
        output = output + "You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;
        output = output + " \n \n Specific Error: " + msg;


        JDialog dialog = new JDialog();
        Container contentPane = dialog.getContentPane();
        contentPane.add(new JLabel(msg.toString()));
        contentPane.setBackground(Color.white);
        dialog.setTitle("Syntax error");
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
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
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
        System.out.println("You have an ambiguity");

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
        System.out.println("Error: Attempting Full Context");

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
        System.out.println("Error: Context Sensitivity");

    }
}

import org.antlr.v4.runtime.*;
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



    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String message, RecognitionException e) {
        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        /*System.out.println("Rule stack: " + stack);
        System.out.println("You have a syntax error at line: " + i);
        System.out.println("At character position: " + i1);*/

        output = "";
        output = output + "Rule stack: " + stack + "\n";
        output = output + "You have a syntax error at line: " + line + "\n";
        output = output + "At character position: " + charPositionInLine;
        output = output + " \n \n Specific Error: " + message;

        JDialog dialog = new JDialog();
        Container contentPane = dialog.getContentPane();
        contentPane.add(new JLabel(message.toString()));
        contentPane.setBackground(Color.white);
        dialog.setTitle("Syntax error");
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);


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

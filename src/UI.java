import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UI {
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton button1;
    private JPanel panel;
    private ArrayList<String> TokenTypes= new ArrayList<String>();


    private String code = "";


    public UI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run();
            }
        });


        //Add token types to array

    }

    public static void main (String[] args){
        JFrame frame = new JFrame("IDE");
        frame.setContentPane(new UI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);


    }

    public void run() {
        code = textArea1.getText();
        ANTLRInputStream input = new ANTLRInputStream(code);

        JuicyBoysLexer lexer = new JuicyBoysLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JuicyBoysParser parser = new JuicyBoysParser(tokens);


        tokens.fill();
        for (Token tok : tokens.getTokens()) {
            textArea2.setText(textArea2.getText() + tok.getText() + " -> ");
            textArea2.setText(textArea2.getText() + lexer.VOCABULARY.getSymbolicName(tok.getType())+ "\n");
        }


    }
}

/*

String code = "boyd simula () { numero baryabol counter ;istop }";
        ANTLRInputStream input = new ANTLRInputStream(code);

        JuicyBoysLexer lexer = new JuicyBoysLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JuicyBoysParser parser = new JuicyBoysParser(tokens);

        //print tokens
            tokens.fill();
            for (Object tok : tokens.getTokens()) {
            System.out.println(tok);
        }

        ParseTree tree = parser.start();
 */

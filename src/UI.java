import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UI {
    private JTextArea textAreaCodeInput;
    private JTextArea textArea2Output;
    private JButton button1;
    private JPanel panel;
    private JTextArea textAreaTokenTypes;
    private JTextArea textAreaTree;
    public JTextArea textAreaError;
    private JScrollPane scrollPaneCodeInput;

    private ArrayList<String> TokenTypes= new ArrayList<String>();

    private String code = "";
    private ArrayList<String> autocompleteWords = new ArrayList<String>();

    public UI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run();
            }
        });
    }

    public void initializeUI(){

        JFrame frame = new JFrame("IDE");
        frame.setContentPane(new UI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);

    }

    public void run() {
        textAreaError.setText("");
        textArea2Output.setText("");
        textAreaTree.setText("");
        textAreaTokenTypes.setText("");

        code = textAreaCodeInput.getText();
        ANTLRInputStream input = new ANTLRInputStream(code);

        JuicyBoysLexer lexer = new JuicyBoysLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JuicyBoysParser parser = new JuicyBoysParser(tokens);
        JuicyBoysANTLRErrorListener errorListener = new JuicyBoysANTLRErrorListener();

       // parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        //System.out.print(parser.getErrorListeners().get(0).syntaxError(errorListener.getRecognizer(), errorListener.getO(), errorListener.getI(), errorListener.getI1(), errorListener.getS(), errorListener.getE()));


        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new JuicyBoysWalker(), tree );


        tokens.fill();

        for (Token tok : tokens.getTokens()) {
            textArea2Output.setText(textArea2Output.getText() + tok.getText() + " -> " + lexer.VOCABULARY.getSymbolicName(tok.getType())+ "\n");
            textAreaTokenTypes.setText(textAreaTokenTypes.getText() + lexer.VOCABULARY.getSymbolicName(tok.getType())+ "\n");
        }


        textAreaTree.setText(tree.toStringTree(parser));
        textAreaError.setText(errorListener.getOutput());


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

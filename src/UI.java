import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
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
    private TextLineNumber textLineNumber;

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

        textLineNumber = new TextLineNumber(textAreaCodeInput);
        scrollPaneCodeInput.setRowHeaderView(textLineNumber);
    }

    public void initializeUI(){

        JFrame frame = new JFrame("IDE");
        frame.setContentPane(new UI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);

    }

    public static class BailSimpleLexer extends JuicyBoysLexer  {
        public BailSimpleLexer(CharStream input) { super(input); }
        public void recover(LexerNoViableAltException e) {
            throw new RuntimeException(e); // Bail out
        }
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
        BailErrorStrategy bailErrorStrategy = new BailErrorStrategy();
        JuicyBoysDefaultErrorStrategy defaultErrorStrategy =  new JuicyBoysDefaultErrorStrategy();
        ExceptionErrorStrategy exceptionErrorStrategy = new ExceptionErrorStrategy();

        //remove the ConsoleErrorListeners
        parser.removeErrorListeners();

        //add our custom errorListener
       // parser.addErrorListener(errorListener);


        //remove lexer errorlistener
        lexer.removeErrorListeners();
        //lexer.addErrorListener(errorListener);




        parser.addErrorListener(new DiagnosticErrorListener());

        //make parser report all ambiguities
        parser.getInterpreter()
                .setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);


        //add the bailerrorstrategy
       // parser.setErrorHandler(bailErrorStrategy);

        //add the defaultErrorStrategy
       // parser.setErrorHandler(defaultErrorStrategy);

        //add Exceptionerrorstrategy in the parser
        parser.setErrorHandler(exceptionErrorStrategy);

        //add a custom handler
      //  parser.setErrorHandler(new JuicyBoysANTLRErrorStrategy());

        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new JuicyBoysWalker(), tree );


        tokens.fill();

        for (Token tok : tokens.getTokens()) {
            textArea2Output.setText(textArea2Output.getText() + tok.getText() + " -> " + lexer.VOCABULARY.getSymbolicName(tok.getType())+ "\n");
            textAreaTokenTypes.setText(textAreaTokenTypes.getText() + lexer.VOCABULARY.getSymbolicName(tok.getType())+ "\n");
        }


        textAreaTree.setText(tree.toStringTree(parser));
        textAreaError.setText(errorListener.getOutput() + "Exceptions: "  + exceptionErrorStrategy.getErrors().toString());


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

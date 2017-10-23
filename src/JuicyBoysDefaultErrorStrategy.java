import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.Pair;

import javax.swing.*;
import java.awt.*;

public class JuicyBoysDefaultErrorStrategy extends DefaultErrorStrategy {
    public void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "missing " + expecting.toString(recognizer.getVocabulary()) + " at " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);

            JDialog dialog = new JDialog();
            Container contentPane = dialog.getContentPane();
            contentPane.add(new JLabel(tokenText.toString()));
            contentPane.setBackground(Color.white);
            dialog.setTitle("Syntax error");
            dialog.pack();
            dialog.setLocationRelativeTo(null);
            dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        }
    }
    public Token getMissingSymbol(Parser recognizer) {
        Token currentSymbol = recognizer.getCurrentToken();
        IntervalSet expecting = this.getExpectedTokens(recognizer);
        int expectedTokenType = 0;
        if (!expecting.isNil()) {
            expectedTokenType = expecting.getMinElement();
        }

        String tokenText;
        if (expectedTokenType == -1) {
            tokenText = "<missing EOF>";
        } else {
            tokenText = "<missing " + recognizer.getVocabulary().getDisplayName(expectedTokenType) + ">";
        }




        Token current = currentSymbol;
        Token lookback = recognizer.getInputStream().LT(-1);
        if (currentSymbol.getType() == -1 && lookback != null) {
            current = lookback;
        }

        return recognizer.getTokenFactory().create(new Pair(current.getTokenSource(), current.getTokenSource().getInputStream()), expectedTokenType, tokenText, 0, -1, -1, current.getLine(), current.getCharPositionInLine());
    }


}

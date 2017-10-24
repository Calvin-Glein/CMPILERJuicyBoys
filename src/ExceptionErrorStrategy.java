import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;

public class ExceptionErrorStrategy extends DefaultErrorStrategy {

    ArrayList<String> error = new ArrayList<String>();

    public ArrayList<String> getErrors()
    {
        return error;
    }
    public int getESize()
    {
        return error.size();
    }

    //  @Override
    // public void recover(Parser recognizer, RecognitionException e) {
    // 	throw e;
    //}



    @Override
    public void reportNoViableAlternative(Parser recognizer, NoViableAltException e)
    {
        List<String> stack;

        stack = (recognizer).getRuleInvocationStack();
        Collections.reverse(stack);

        String msg = "No Viable Alternative " + getTokenErrorDisplay(e.getOffendingToken());
        msg += " expecting one of "+e.getExpectedTokens().toString(recognizer.getTokenNames());
        //   RecognitionException ex = new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
        //  ex.initCause(e);
        // throw ex;
        msg += " \n \n Stack: " + stack;

        System.out.println("report no viable alt: " +msg);

        error.add(msg);
    }

    @Override
    public void reportInputMismatch(Parser recognizer, InputMismatchException e) throws RecognitionException {

        String msg = "Mismatched input " + getTokenErrorDisplay(e.getOffendingToken());
        msg += " expecting one of "+e.getExpectedTokens().toString(recognizer.getTokenNames());
        //RecognitionException ex = new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
        //ex.initCause(e);
        //throw ex;
        System.out.println("mismatched input" + msg);

        error.add(msg);

    }

    @Override
    public void reportMissingToken(Parser recognizer) {
        beginErrorCondition(recognizer);
        Token t = recognizer.getCurrentToken();
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = "Missing "+expecting.toString(recognizer.getTokenNames()) + " at " + getTokenErrorDisplay(t);
        //   throw new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
        System.out.println("mismatched tokens" + msg);

        error.add(msg);
    }



}
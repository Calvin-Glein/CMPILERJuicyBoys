import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

import java.util.Collections;
import java.util.List;

public class JuicyBoysANTLRErrorStrategy implements ANTLRErrorStrategy {
    @Override
    public void reset(Parser var1) {

    }


    @Override
    public Token recoverInline(Parser var1) throws RecognitionException {
        return null;
    }

    @Override
    public void recover(Parser var1, RecognitionException var2) throws RecognitionException {

    }

    @Override
    public void sync(Parser var1) throws RecognitionException {
    }


    @Override
    public boolean inErrorRecoveryMode(Parser var1) {
        return true;
    }

    @Override
    public void reportMatch(Parser var1) {

    }

    @Override
    public void reportError(Parser var1, RecognitionException var2) {
        System.out.println(var2.getOffendingToken());
        System.out.println(var2.getExpectedTokens());
        System.out.println(var2.getOffendingState());
        System.out.print("POTA1" + var1.getExpectedTokens());
        System.out.print("POTA2" + var1.getRuleInvocationStack().toString());

        List<String> stack;

        stack = var1.getRuleInvocationStack();
        Collections.reverse(stack);

        System.out.println("Stack"  + stack);

        System.out.print("POTA3" + var1.getExpectedTokensWithinCurrentRule());
        System.out.print("POTA2" + var1.getParseInfo().toString());

        System.out.println("SHit: " + var1.getErrorHeader(var2));
    }
}
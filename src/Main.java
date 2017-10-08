import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main (String args[]){

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

		System.out.println("next");

        // Print tokens AFTER filtering
		for (Object tok : tokens.getTokens()) {
			System.out.println(tok);
		}

        ParseTree tree = parser.start();


    }
    }
package tool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;


import workAntlr.mileLexer;
import workAntlr.mileParseParser;

@SuppressWarnings("deprecation")
public class Tool {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try
    	{
			System.out.println("Scanning file...");
			mileLexer lexer = new mileLexer(new ANTLRInputStream(new FileInputStream("code.txt")));
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	    	mileParseParser parser = new mileParseParser(tokens);
	    	parser.program();
    	}
    	catch (Exception ex)
    	{
    		System.err.println("Error: " + ex.toString());
    	}
	}

}

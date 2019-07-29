package antlr4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import Lexer.*;
import java.io.*;

import org.antlr.runtime.CharStreamState;
import org.antlr.v4.runtime.*;

import Lexer.SimpsonLexer;


public class SimpsonMain {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			try{
				FileInputStream stream = new FileInputStream(new File("codigo.txt"));
				CharStream input = CharStreamState.fromStream(stream);
				SimpsonLexer lexer = new SimpsonLexer(input);
				SimpsonParser parser = new SimpsonParser(new CommonTokenStream(lexer));
				//parser.addParseListener(new SimpsonListener());
				parser.program();
			}
			catch(IOException ioexc){
				// TODO
			}
			
	
		}

	}



grammar SimpsonParse;
import Simpson;

program: PROGRAM ID BRACKET_OPEN
		sentence*
 		BRACKET_CLOSE;
		
 		//int real char boolean if else while for 
 		sentence:  declaracion |maggie| luann |kirk | alegria | elena|operaciones|condiciones|funcionesmat ;
		condiciones:ID (EQ | GT | LT | GEQ | LEQ) ;

		operaciones:(ID|tipo_valores) (( SUMA | RESTA | DIVISION | MULTIPLICACION )(ID|tipo_valores))*;
	
		
		
		elena:FOR_RW NUMBER condiciones (NUMBER | VAR) SEMICOLON ID ASSING ID SUMA NUMBER BRACKET_OPEN sentence* BRACKET_CLOSE SEMICOLON;
		//WHILE
		alegria:WHILE_RW VAR condiciones (NUMBER| BOOL_TYPE) BRACKET_OPEN sentence* BRACKET_CLOSE SEMICOLON ;
		
		kirk:WHILE_RW PAR_OPEN condiciones NUMBER PAR_CLOSE BRACKET_OPEN sentence* BRACKET_CLOSE SEMICOLON ;
		
		luann: IF_RW PAR_OPEN condiciones (ID | NUMBER ) PAR_CLOSE BRACKET_OPEN sentence* BRACKET_CLOSE SEMICOLON ;
		
		maggie:PRINTLN (ID|VAR) SEMICOLON ;
		
		//homero:BOOL_TYPE ID ASSING(TRUE_LITERAL|FALSE_LITERAL)SEMICOLON;
		
		//marge:STRING_TYPE (VAR|ID) ASSING TEXT SEMICOLON;
		
		//lisa: REAL_TYPE ID ASSING ID SEMICOLON;
		
		//bart:INT_TYPE ID ASSING NUMBER SEMICOLON;

		funcionesmat:ID ASSING PAR_OPEN (SIN| COS) ID PAR_CLOSE SEMICOLON;
		
		declaracion:VAR ID (ASSING operaciones)? SEMICOLON;
		
		tipo_valores: TEXT| TRUE_LITERAL | FALSE_LITERAL | NUMBER;
 		
 		
 		
 		

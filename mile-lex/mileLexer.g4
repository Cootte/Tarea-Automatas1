/**
 * Define a grammar called Hello
 */
lexer grammar mileLexer;

/*
 * op
 */

PLUS : '+';
//
EXP : '^';


/*
 * structures
 */

fragment TRUE : 'true';
fragment FALSE: 'false';
FOR : 'for';
START_T : 'start';


//

UNARY : '-'|'+';
fragment NAT : [0-9];
NUMBER :  NAT+;


//
ID : [a-z]+ ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines


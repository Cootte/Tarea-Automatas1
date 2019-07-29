/**
 * Define a grammar

 */
 
lexer grammar Simpson;

PROGRAM: 'program';
PRINTLN:'maggie' ;
READ: 'springfield';
ASSING: '=';
VAR :INT_TYPE|BOOL_TYPE| REAL_TYPE|STRING_TYPE;



// Números
NUMBER	: (([0-9]+)('.'[0-9]+)*)|('.'[0-9]+);

// Texto
TEXT	: ('\''([a-zA-Z _0-9.])+'\'');

/*
 * structures
 */


//

UNARY : '-'|'+';
fragment NAT : [0-9];

 // TIPO DE variables
INT_TYPE : 'bart';
REAL_TYPE : 'lisa';
BOOL_TYPE : 'homero';
STRING_TYPE : 'marge';
 
 
BRACKET_OPEN : '{';
BRACKET_CLOSE : '}';

PAR_OPEN:'(';
PAR_CLOSE:')';

SEMICOLON:';';

//ciclos
IF_RW : 'luann';
ELSE_RW : 'kirk'; 
WHILE_RW : 'alegria'; 
FOR_RW : 'elena';

//funciones matematicas

SIN:'kwik' ;
COS:'mark';
SUMA: 'apu';
RESTA:'manjula';
DIVISION : 'ayudante_de_santa';
MULTIPLICACION:'bola_de_nieve';
GT:'>';
LT:'<';
EQ:'==';
GEQ:'>=';
LEQ:'<=';

 
TRUE_LITERAL : 'true';
FALSE_LITERAL : 'false';

AND: 'almeida';
OR: 'krabappel';
NOT: 'skinner';



//
ID : [a-zA-Z][a-zA-Z0-9_]* ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines


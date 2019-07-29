/**
 * Define a grammar called Hello
 */
grammar mileParser;
import mileLexer;

/*
 * op
 */
 
s : operation EOF ;

program: START_T stat+;

stat : assign
    |  operation
    |  declaration
    |  print_block
    ;
  
print_block: PRINT LPAR (STRING|ID)+ RPAR ;
grammar lenglangrammar;

INT : [0-9]+;
CHAR    :[a-zA-Z.!?'<>{},\\-];
BOOL    : 'True'|'False';
PLUS : '+';
MINUS : '-';
DIV : '/';
MULT : '*'|'X'|'x';
RBRACK  : ')';
LBRACK  : '(';
EQUALS  : '=';
PERIOD  : '.';
MODULO  : '%';

RCAR    : '\r'|'\n';

operator : PLUS|MINUS|MULT|DIV|MODULO;

decimal: INT PERIOD INT;

number : decimal|INT|CHAR;

operatorChain : (number|container|variable) (' 'operator' '(variable|number|container))+;

equationSide : operatorChain| variable | number | container;

equation : equationSide (EQUALS equationSide)+;

container : LBRACK' ' mathstatement ' ' RBRACK;

mathstatement : (equationSide | container | operatorChain);

IF  :   'IF';
NOT : '!'|'NOT';
AND :   'AND'|'&';
OR : 'OR'|'|';
XOR :   'XOR'|'*|';
ASSERT : '==';
WHILE: 'WHILE';
LESSTHAN: '<';
GREATERTHAN: '>';
LESSTHANEQTO: '<=';
GREATERTHANEQTO: '>=';


logicstatements : IF|NOT|AND|OR|XOR|ASSERT;

stringchars : (CHAR)+;

QUOTATIONS : ['"];

variable :  'var'stringchars|BOOL;

string : QUOTATIONS (stringchars|' ')+ QUOTATIONS;

type : INT|CHAR|string|decimal;

typenames : 'INT'|'CHAR'|'STRING'|'DECIMAL'|'BOOL';

assignment : variable EQUALS typenames LBRACK (mathstatement|type) RBRACK;

LOGICALSTART : 'LOGIC(';

codechunk : '{'seqentialstatement';}';

SOL : '#';

EOL : ';'(RCAR)*;

logic : LOGICALSTART (IF|WHILE) (variable| mathstatement ) (ASSERT|ASSERT NOT|LESSTHANEQTO|GREATERTHANEQTO|LESSTHAN|GREATERTHAN|XOR|AND|AND NOT) (variable| mathstatement ) RBRACK ':'codechunk;

else : 'ELSE:'codechunk;

statement : logic|else|assignment|print|mathstatement|iterator;

seqentialstatement : SOL statement ('--'statement)* EOL;

print : 'PRINT'LBRACK(variable|INT|string)*RBRACK;

iterator : 'ITERATE'LBRACK(variable|INT|string)RBRACK':'codechunk;

SOP: '</'(RCAR)*;

EOP: '/3';

script : SOP (seqentialstatement)+ EOP;

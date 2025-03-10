grammar compilador;
// $antlr-format on

@header {
package compiladores;
}

fragment LETRA:[A-Za-z];
fragment DIGITO:[0-9];
fragment NUMERO:(DIGITO)+;

PA:		'(';
PC:		')';
LLA:	'{';
LLC:	'}';
PYC:	';';
IGU:	'=';
COM:	',';

SUMA:	'+';
MULT:	'*';
DIFF:	'-';
DIVI:	'/';
MOD:	'%';

INC_OP:	'++';
DEC_OP:	'--';

MUL_ASIGN:	'*=';
DIV_ASIGN:	'/=';
MOD_ASIGN:	'%=';
ADD_ASIGN:	'+=';
SUB_ASIGN:	'-=';

AND_OP:	'&&';
OR_OP:	'||';
EQ_OP:	'==';
NE_OP:	'!=';
GE_OP:	'>=';
LE_OP:	'<=';
LT_OP:	'<';
GT_OP:	'>';

INT:	'int'; // lo pongo ante de ID si no me lo captura!!!
DOUBLE:	'double';
VOID:	'void';

IF:		'if';
ELSE:	'else';
WHILE:	'while';
DO:		'do';
FOR:	'for';

CONTINUE:	'continue';
BREAK:		'break';
RETURN:		'return';

ID: (LETRA | '_') (LETRA | DIGITO | '_')*;

NUMERO_INT:		(NUMERO);
NUMERO_FLOAT:	(NUMERO '.' NUMERO);

WS:				[ \t\n\r] -> skip;
COMMENT:		'/*' .*? '*/' -> skip;
LINE_COMMENT:	'//' ~[\r\n]* -> skip;
OTRO:			.;

/* ****************************************************************************** COMPILADOR C ****************************************************************************** */

programa: instrucciones_externa EOF;

instrucciones_externa
	: instruccion_externa instrucciones_externa
	|;

instruccion_externa: definicion_funcion | declaracion | PYC;

definicion_funcion: specificador_tipo init_declarador bloque;

bloque: LLA LLC | LLA instrucciones LLC;

instrucciones: instruccion instrucciones |;

instruccion: declaracion | statement | PYC;

/* EXPRESIONES */
expresiones: expresion PYC;

expresion
	: expresion_asignacion
	| expresion COM expresion_asignacion;

operador_multiplicacion: MULT | DIVI | MOD;

expresion_multiplicativa
	: expresion_postfija
	| expresion_multiplicativa operador_multiplicacion expresion_postfija;

operador_adicion: SUMA | DIFF;

expresion_aditiva
	: expresion_multiplicativa
	| expresion_aditiva operador_adicion expresion_multiplicativa;

operador_relacional: LE_OP | GE_OP | LT_OP | GT_OP;

expresion_relacional
	: expresion_aditiva
	| expresion_relacional operador_relacional expresion_aditiva;

operador_igualdad: EQ_OP | NE_OP;

expresion_igualdad
	: expresion_relacional
	| expresion_igualdad operador_igualdad expresion_relacional;

expresion_logica_and
	: expresion_igualdad
	| expresion_logica_and AND_OP expresion_igualdad;

expresion_logica_or
	: expresion_logica_and
	| expresion_logica_or OR_OP expresion_logica_and;

expresion_asignacion
	: expresion_logica_or
	| ID operador_asignacion expresion_asignacion;

operador_asignacion
	: IGU
	| MUL_ASIGN
	| DIV_ASIGN
	| MOD_ASIGN
	| ADD_ASIGN
	| SUB_ASIGN;

expresion_primaria
	: ID
	| PA expresion PC
	| NUMERO_INT
	| NUMERO_FLOAT;

lista_parametros_expresiones
	: expresion_asignacion
	| lista_parametros_expresiones COM expresion_asignacion
	|;

operador_prefijo: INC_OP | DEC_OP | DIFF | SUMA;

operador_postfijo: INC_OP | DEC_OP;

expresion_postfija
	: expresion_primaria
	// | operador_prefijo ID
	| operador_prefijo expresion_primaria
	| ID operador_postfijo
	| ID PA lista_parametros_expresiones PC;

/* INSTRUCCIONES  */

/* declaraciones  */

declaracion
	: //specificador_tipo PYC| 
	specificador_tipo init_lista_declarador PYC;

init_lista_declarador
	: init_declarador
	| init_lista_declarador COM init_declarador;

init_declarador
	: declarador
	| declarador IGU expresion_asignacion;

specificador_tipo: INT | VOID | DOUBLE;

declarador
	: ID
	| declarador PA lista_parametros PC; // | declarador PA PC

lista_parametros
	: declaracion_parametro
	| lista_parametros COM declaracion_parametro
	|;

declaracion_parametro
	: specificador_tipo declarador
	| specificador_tipo;

/* Statements */

statement
	: seleccion
	| iteracion
	| expression_statement
	| bloque
	| salto;

expression_statement: PYC | expresion PYC;

seleccion
	: IF PA expresion PC statement					# seleccion_if
	| IF PA expresion PC statement ELSE statement	# seleccion_if_else;

iteracion
	: WHILE PA expresion PC statement
	| DO statement WHILE PA expresion PC PYC
	| FOR PA expression_statement expression_statement PC statement
	| FOR PA expression_statement expression_statement expresion PC statement;

salto
	: CONTINUE PYC
	| BREAK PYC
	| RETURN PYC
	| RETURN expresion PYC;

/* ****************************************************************************** ARITMETICA ****************************************************************************** */

/* ****************************************************************************** OTRO ****************************************************************************** */

// si: s EOF;

// s : PA s PC s | ;

// s : ID { System.out.println("ID ->" + $ID.getText() + "<--"); } s | NUMERO {
// System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s | OTRO {
// System.out.println("Otro ->" + $OTRO.getText() + "<--"); } s | EOF ;

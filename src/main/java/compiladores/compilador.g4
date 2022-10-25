grammar compilador;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;
fragment NUMERO : (DIGITO)+ ;




PA : '(' ;
PC : ')' ;
LLA: '{' ;
LLC: '}' ;
PYC: ';';
IGU: '=';
COM: ',';

SUMA : '+' ;
MULT : '*' ;
DIFF : '-' ;
DIVI : '/' ;

AND : '&&';
OR  : '||';
EQ  : '==';
GE : '>=';
LE : '<=';
LT  : '<';
GT  : '>';
   
INT: 'int' ; // lo pongo ante de ID si no me lo captura!!!
DOUBLE: 'double' ;
VOID: 'void';


ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

NUMERO_INT : ('-')*(NUMERO);


WS : [ \t\n\r] -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip;
OTRO : . ;


/* ****************************************************************************** COMPILADOR C ****************************************************************************** */

programa: instrucciones_externa EOF ;

instrucciones_externa: | instruccion_externa instrucciones_externa
                       |
                       ;

instruccion_externa: definicion_funcion
  | declaracion
  ;

          
/* DECLARACIONES */ 

declaracion
      : //specificador_tipo PYC| 
        specificador_tipo init_lista_declarador PYC
      ;

init_lista_declarador
                : init_declarador
                | init_lista_declarador COM init_declarador
                ;

init_declarador 
          : declarador
          | declarador IGU NUMERO_INT /* TODO: NMERO_INT ==> expression */ 
          ;

specificador_tipo : INT 
                  | VOID
                  | DOUBLE
                  ;

declarador
	: ID #identificador
	| declarador PA lista_parametros PC #declarador_funcion 
	// | declarador PA PC
	;

lista_parametros
	: declaracion_parametro
	| lista_parametros COM declaracion_parametro
  |
  ;


declaracion_parametro
	: specificador_tipo declarador 
	| specificador_tipo
	;


definicion_funcion
	: specificador_tipo declarador bloque	;


bloque
	: LLA instrucciones LLC 
  ;

lista_elem_bloque:
	| lista_elem_bloque elem_bloque
  |
	;

elem_bloque
	: declaracion
	| statement
	;

statement
	: bloque
	// | expression_statement
	// | selection_statement
	// | iteration_statement
	;

instrucciones : instruccion instrucciones
              |  
              ;
//terminamos cuando no està mas instrucciones (regla vacia)

instruccion : bloque
            | declaracion
            | asignacion
            // | inst_return
            // | inst_if 
            // | inst_for
            // | inst_while
            ;  

// expresion : ';'
//           | exp ';'
//           ;

expresion  : //asignacion COM exp
     //| asignacion
     NUMERO_INT
     ;

asignacion
	: //expresion_condicional 
	  lista_asignacion PYC
	;

lista_asignacion: ID IGU expresion COM lista_asignacion
  | ID IGU expresion
  ;


/* ****************************************************************************** ARITMETICA ****************************************************************************** */



term_log : term t ;

term : factor f ;

tl: AND term_log tl
  |
  ;

t : SUMA term t
  | DIFF term t
  |
  ;

f : MULT factor f
  | DIVI factor f
  |
  ;
 
factor : NUMERO_INT
       | ID // <- podria ser una funcion !!!
       | PA expresion PC
       ;


/* ****************************************************************************** OTRO ****************************************************************************** */


// si: s EOF;

// s : PA s PC s
//    | 
//    ;




// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;

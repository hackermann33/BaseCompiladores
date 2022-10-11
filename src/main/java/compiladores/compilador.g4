grammar compilador;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

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
   
INT: 'int' ; // lo pongo ante de ID si no me lo captura!!!
DOUBLE: 'double' ;
VOID: 'void';


ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
NUMERO : ('-')*(DIGITO)+ ;

NUMERO_INT : NUMERO;


WS : [ \t\n\r] -> skip;
OTRO : . ;


/* ****************************************************************************** COMPILADOR C ****************************************************************************** */

programa: instrucciones EOF ;

instrucciones : instruccion instrucciones
              |  
              ;
//terminamos cuando no està mas instrucciones (regla vacia)

instruccion : bloque
            | declaracion_var
            | declaracion_func
            | implementacion_func
            // | asignacion
            // | inst_return
            // | inst_if 
            // | inst_for
            // | inst_while
            ;
//si la llamo con un istrucion del java (problema porque seran funciones)
            
bloque : LLA instrucciones LLC ;


/* VARIABLES */ 
declaracion_var : INT lista_declaracion PYC;

lista_declaracion : bloque_declaracion bd ;
                   
bd  : COM bloque_declaracion bd
    |
    ;

bloque_declaracion : ID    
                   | ID IGU NUMERO
                   ;



/* FUNCIONES */ 

declaracion_func : INT ID PA lista_params PC PYC;

lista_params : param p
             |
             ;

p : COM param p
  |
  ;

param : INT ID
      | INT
      ;

implementacion_func: INT ID PA lista_params_impl PC bloque;

lista_params_impl : param_impl pi
                  |
                  ;

pi : COM param_impl 
   |
   ;

param_impl : INT ID
           ;

/* ****************************************************************************** ARITMETICA ****************************************************************************** */
opar  : exp opar
      | EOF
      ;

exp : term_log tl ;

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
 
factor : NUMERO 
       | ID // <- podria ser una funcion !!!
       | PA exp PC
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

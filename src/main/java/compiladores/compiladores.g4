grammar compiladores;

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

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
NUMERO : ('-')*(DIGITO)+ ;

WS : [ \t\n\r] -> skip;
OTRO : . ;


/* ****************************************************************************** COMPILADOR C ****************************************************************************** */

programa: instrucciones EOF ;

instrucciones : instruccion instrucciones
              |  
              ;
//terminamos cuando no està mas instrucciones (regla vacia)

instruccion : bloque
            | declaracion
            // | asignacion
            // | inst_return
            // | inst_if 
            // | inst_for
            // | inst_while
            ;
//si la llamo con un istrucion del java (problema porque seran funciones)
            
bloque : LLA instrucciones LLC ;

declaracion : INT lista_declaracion PYC;

lista_declaracion : bloque_declaracion bd ;

bloque_declaracion : ID    
                   | ID IGU NUMERO
                   ;
                   
bd  : COM bloque_declaracion bd
    |
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

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

   

INT: 'int' ; // lo pongo ante de ID si no me lo captura!!!
DOUBLE: 'double' ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
NUMERO : ('-')*(DIGITO)+ ;

WS : [ \t\n\r] -> skip;
OTRO : . ;

programa: instrucciones EOF ;

instrucciones : instruccion instrucciones
              |  
              ;
//terminamos cuando no està mas instrucciones (regla vacia)

funcion_sin_param: INT ID PA PC;

instruccion : bloque
            | declaracion
            | funcion_sin_param
            // | asignacion
            // | inst_return
            // | inst_if 
            // | inst_for
            // | inst_while
               ;
//si la llamo con un istrucion del java (problema porque seran funciones)
            
bloque : LLA instrucciones LLC ;

declaracion : INT bloque_declaracion PYC;

bloque_declaracion : COM bloque_declaracion b ;
                   
b  : ID 
   | ID IGU NUMERO
   |
   ;





opar  : exp opar
      | EOF
      ;

exp : term t ;

term : factor f ;

t : SUMA term t
  |
  ;
 
f : MULT factor f
  |
  ;
 
factor : NUMERO 
       | ID // <- podria ser una funcion !!!
       | PA exp PC
       ;


// si: s EOF;

// s : PA s PC s
//    | 
//    ;




// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;

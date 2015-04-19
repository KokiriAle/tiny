Programa -----> bloque
bloque -------> decl-funct cp | cp
cp -----------> BEGIN stmt-seq END
stmt-seq ----> stmt-seq stmt | stmt
stmt ---------> stmt-decl PUNTO_COMA | assign_stmt PUNTO_COMA | call-funct PUNTO_COMA | decl-funct PUNTO_COMA | if_stmt PUNTO_COMA | for_stmt | write_stmt PUNTO_COMA | read_stmt PUNTO_COMA
stmt-decl ----> tipo list-var | tipo assign_stmt | tipo vector
tipo ---------> INT | BOOLEAN | VOID
list-var -----> list-var COMA var | var
var ----------> ID | vector
vector -------> ID corchA ID corchC | ID corchA DIGITO corchC
assign_stmt ----> var IGUAL term | var IGUAL exp
term ---------> var | literal
literal -------> DIGITO | bool
bool ---------> TRUE | FALSE
exp ----------> expI | expB | parA exp parC
expI ---------> expI opI expI | DIGITO | ID | call-funct
expB ---------> expB opB expB | bool | ID | call-funt
opI ----------> MAS | MENOS | MULTI | DIVI
opB ----------> AND | OR
call-funct ---> ID parA parC | ID parA list-parm parC
list-parm ----> list-parm COMA parm | parm
parm ---------> literal | ID | exp
decl-funct ---> tipo ID parA parC bloquef | tipo ID parA list-defparm parC bloquef | decl-funct decl-funct
bloquef ------> BEGIN stmt-seq RETURN exp PUNTO_COMA END | cp
list-defparm--> list-defparm | COMA tipo parm | tipo parm

if_stmt ------> IF parA exp-if parC stmt-seq END | if parA exp-if parC stmt-seq ELSE stmt-seq END
exp-if -------> exp-comp | expB
exp-comp -----> expI op-comp expI
op-comp ------> MAYOR | MENOR | MAYOR-IGUAL | MENOR-IGUAL | IGUAL-IGUAL | DIFERENTE
for_stmt -----> FOR parA assign_stmt PUNTO_COMA exp-comp PUNTO_COMA assign_stmt parC stmt-seq END
write_stmt --------> WRITE var
read_stmt ---------> READ var 

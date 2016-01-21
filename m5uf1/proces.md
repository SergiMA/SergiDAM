#1. Desenvolupament de programari ('software')
##1.7. Procés d'obtenció de codi executable a partir del codi font; eines implicades

###Llenguatges compilats
Existeixen compiladors que es dediquen a compilar certs llenguatges. Aquest **procés de compilació** consisteix en passar el codi introduit pel programador a codi objecte. El codi objecte és el mateix codi traduit a un llenguatge que sí entengui el nostre equip informàtic (en aquest cas, binari). Seguidament, amb un **linker**, a partir del codi objecte, es realitza un encapçalat cap a un codi executable per tal d'executar el programa.

###Llenguatges interpretats
Hi ha llenguatges que no necessiten un compilador i que, per tant, utilitzen un **intèrpret**. Aquest intèrpret tradueix, al mateix instant que llegeix el codi, a codi bytes, el qual ja entén la màquina i, a través d'una **màquina virtual**, executar el programa. Aquest procés és més lent que amb els compiladors ja que aquí, la "compilació" s'ha de realitzar cada vegada que es vol executar el programa. Per contrapart, els codis interpretats són més lleugers tant per espai com per transportar-los.

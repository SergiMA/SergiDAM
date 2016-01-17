#1. Desenvolupament de programari ('software')
##1.2. Codi font, codi objecte i codi executable: màquines virtuals

Per crear un programa el que es farà serà crear un arxiu i escriure a un fitxer el seguit d'instruccions que es vol que l'ordinador executi. Aquestes instruccions hauran de seguir unes pautes determinades en funció del llenguatge de programació escollit. A més, haurien de seguir un ordre determinat que donarà sentit al programa escrit. Per començar n'hi haurà prou amb un editor de text simple.

> Un cop s'ha acabat d'escriure el programa, el conjunt de fitxers de text resultants, on es troben les instruccions, es diu que contenen el **codi font**.
Aquest codi font pot ser des d'un nivell molt alt, molt a prop del llenguatge humà, fins a un de nivlel més baix, més proper al codi de les màquines, com ara el codi assemblador.

La tendència acutal és fer ús de llenguatges d'alt nivell, és a dir, propers al llenguatge humà. Però això fa aparèixer un problema, i és que els fitxers de codi font no contenen el llenguatge màquina que entendrà l'ordinador. Per tant, resulten incomprensibles per al processador. Per poder generar codi màquina cal fer un procés de traducció des dels mnemotècnics que conté cada fitxer a les seqüències binàries que entén el processador.

El procés anomenat **compilació** és la traducció del codi font dels fitxers del progrmaa en fitxers en format binari que contenen les instruccions en un format que el processador pot entendre. El contingut d'aquests fitxers s'anomena **codi objecte**. El programa que fa aquest procés s'anomena **compilador**.

> El **codi objecte** és el codi font traduït (pel compilador) a codi màquina, però aquest codi encara no pot ser executat per l'ordinador.

> El **codi executable** és la traducció completa a codi màquina, duta a terme per l'enllaçador (en anglès, _linker_). El codi exectable és interpretat directament per l'ordinador.

**L'enllaçador** és l'encarregat d'inserir al codi objecte les funcions de les llibreries que són necessàries per al programa i de dur a terme el procés de muntatge generant un arxiu executable.

Una **llibreria** és una col·lecció de codi predefinit que facilita la tasca del programador a l'hora de codificar un programa.

###1.2.1. Màquina virtual
El concepte de màquina virtual sorgeix amb l'objectiu de facilitar el desenvolupament de compiladors que generen codi per a diferents processadors.

La **compilació** consta de dues fases:
* La primera parteix del codi font a un llenguatge intermedi obtenint un programa equivalent amb un menor nivell d'abstracció que l'original i que no pot ser directament executat.

* La segona fase tradueix el llenguatge intermedi a un llenguatge comprensible per la màquina.

Arribat aquest punt es podria plantejar la pregunta: per què dividir la compilació en dues fases? L'objectiu és que el codi de la primera fase, el codi intermedi, sigui comú per a qualsevol processador, i que el codi generat en la segona fase sigui l'específic per a cada processador. De fet, la traducció del llenguatge intermedi al llenguatge màquina no se sol fer mitjançant compilació sinó mitjançant un intèrpret.






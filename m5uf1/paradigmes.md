#1. Desenvolupament de programari ('software')
##1.4. Paradigmes de programació

És difícil establir una classificació general dels llenguatges de programació, ja que existeix un gran nombre de llenguatges i, de vegades, diferents versions d’un mateix llenguatge. Això provocarà que en qualsevol classificació que es faci un mateix llenguatge pertanyi a més d’un dels grups establerts. Una classificació molt estesa, atenent a la forma de treballar dels programes i a la filosofia amb què van ser concebuts, és la següent:
* Paradigma imperatiu/estructurat.
* Paradigma d’objectes.
* Paradigma funcional.
* Paradigma lògic.

> El **paradigma imperatiu/estructurat** deu el seu nom al paper dominant que exerceixen les sentències imperatives, és a dir aquelles que indiquen dur a terme una determinada operació que modifica les dades guardades en memòria.

Alguns dels llenguatges imperatius són C, Basic, Pascal, Cobol...
La tècnica seguida en la programació imperativa és la **programació estructurada**. La idea és que qualsevol programa, per complex i gran que sigui, pot ser representat mitjançant tres tipus d’estructures de control:

* Seqüència.
* Selecció.
* Iteració.

D’altra banda, també es proposa desenvolupar el programa amb la tècnica de disseny descendent (_top-down_). És a dir, modular el programa creant porcions més petites de programes amb tasques específiques, que se subdivideixen en altres subprogrames, cada vegada més petits.  La idea és que aquests subprogrames típicament anomenats funcions o procediments han de resoldre un únic objectiu o tasca.

D’altra banda, també es proposa desenvolupar el programa amb la tècnica de disseny descendent (top-down). És a dir, modular el programa creant porcions més petites de programes amb tasques específiques, que se subdivideixen en altres subprogrames, cada vegada més petits. La idea és que aquests subprogrames típicament anomenats funcions o procediments han de resoldre un únic objectiu o tasca.

Imaginem que hem de fer una aplicació que registri les dades bàsiques del personal d’una escola, dades com poden ser el nom, el DNI, i que calculi el salari dels professors així com el dels administratius, on el salari dels administratius és el sou base (SOU_BASE) * 10 mentre que el salari dels professors és el sou base (SOU_BASE) + nombre d'hores imperatides (numHores) * 12

> El **paradigma d’objectes**, típicament conegut com a Programació Orientada a Objectes (POO, o OOP en anglès), és un paradigma de construcció de programes basat en una abstracció del món real. En un programa orientat a objectes, l’abstracció no són procediments ni funcions sinó els objectes. Aquests objectes són una representació directa d’alguna cosa del món real, com ara un llibre, una persona, una comanda, un empleat...

Alguns dels llenguatges de programació orientada a objectes són C++, Java, C#... 

Un objecte és una combinació de dades (anomenades atributs) i mètodes (funcions i procediments) que ens permeten interactuar amb ell. En aquest tipus de
programació, per tant, els programes són conjunts d’objectes que interactuen entre ells a través de missatges (crides a mètodes).

La programació orientada a objectes es basa en la integració de 5 conceptes: abstracció, encapsulació, modularitat, jerarquia i polimorfisme, que és necessari
comprendre i seguir de manera absolutament rigorosa. No seguir-los sistemàticament, ometre’ls puntualment per pressa o altres raons fa perdre tot el valor i els beneficis que ens aporta l’orientació a objectes.

> El paradigma funcional està basat en un model matemàtic. La idea és que el resultat d’un càlcul és l’entrada del següent, i així successivament fins que una composició produeixi el resultat desitjat.

Els creadors dels primers llenguatges funcionals pretenien convertir-los en llenguatges d’ús universal per al processament de dades en tot tipus d’aplicacions, però, amb el pas del temps, s’ha utilitzat principalment en àmbits d’investigació científica i aplicacions matemàtiques.

> El paradigma lògic té com a característica principal l’aplicació de les regles de la lògica per inferir conclusions a partir de dades.

Un programa lògic conté una base de coneixement sobre la que es duen a terme consultes. La base de coneixement està formada per fets, que representen la informació del sistema expressada com a relacions entre les dades i regles lògiques que permeten deduir conseqüències a partir de combinacions entre els fets i, en general, altres regles.

El paradigma és àmpliament utilitzat en les aplicacions que tenen a veure amb la Intel·ligència Artificial, particularment en el camp de sistemes experts i processament del llenguatge humà. Un sistema expert és un programa que imita el comportament d’un expert humà. Per tant conté informació (és a dir una base de
coneixements) i una eina per comprendre les preguntes i trobar la resposta correcta examinant la base de dades (un motor d’inferència).

També és útil en problemes combinatoris o que requereixin una gran quantitat oamplitud de solucions alternatives, d’acord amb la naturalesa del mecanisme de tornada enrere (_backtracking_).

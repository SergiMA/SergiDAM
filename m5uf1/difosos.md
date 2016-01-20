#1. Desenvolupament de programari ('software')
##1.5. Característiques dels llenguatges més difosos

Existeixen molts llenguatges de programació diferents,fins al punt que moltestecnologies tenen el seu llenguatge propi. Cada un d’aquests llenguatges té un seguit de particularitats que el fan diferent de la resta.

Els llenguatges de programació més difosos són aquells que més es fan servir en cadascun dels diferents àmbits de la informàtica. En l’àmbit educatiu, per exemple, es considera un llenguatge de programació molt difós aquell que es fa
servir a moltes universitats o centres educatius per a la docència de la iniciació a la programació.

Els llenguatges de programació més difosos corresponents a diferents àmbits, a diferents tecnologies o a diferents tipus de programació tenen una sèrie de característiques en comú que són les que marquen les similituds entre tots ells.

###1.5.1 Característiques de la programació estructurada
La programació estructurada va ser desenvolupada pel neerlandès Edsger W. Dijkstra i es basa en el denominat teorema de l’estructura. Per això utilitza únicament tres estructures:  seqüència, selecció i iteració, essent innecessari l’ús de la instrucció o instruccions de transferència incondicional (GOTO, EXIT, FUNCTION, EXIT SUB, o múltiples RETURN)

D'aquesta forma les característiques de la programació estructurada són les claredat, el teorema de l'estructura i el disseny descendent.

#### Claredat
Hi haurà d'haver prou informació al codi per tal que el programa pugui ser entès i verificat: comentaris, noms de variables comprensibles i procediments entendors... Tot programa estructurat pot ser llegit des del principi a la fi sense interrupcions en la seqüència normal de lectura.

#### Teorema de l'estructura
Demostra que tot programa es pot escriure utilitzant únicament les tres estructures bàsiques de control:
* Seqüència: instruccions executades successivament, una darrere l'altra.

* Selecció: la instrucció condicional amb doble alternativa, de la forma "si condició, llavors SentènciaA, sinó SentènciaB"

* Iteració: el bucle condicional "mentre condició, fes SentènciaA", que executa les instruccions repetidament mentre la condició es compleixi.

####Disseny descendent
El disseny descendent és una tècnica que es basa en el concepte de "divideix i venceràs" per tal de resoldre un problema en l'àmbit de la programació. Es tracta de la resolució del proglema al llarg de diferents nivells d'abstracció partitn d'un nivell més abstracte i finalitzant en un nivell de detall.

La visió moderna de la programació estructurada introdueix les característiques de programació modular i tipus abstractes de dades (TAD)

####Programació modular
La realització d'un programa sense seguir una tècnica de programació modular produeix sovint un conjunt enorme de sentències
l'execució de les quals és complexa de seguir, i d'entendre, amb la qual cosa es fa gairebé impossible la depuració d'errors i la introducció de millores. Fins i tot, es pot donar el cas d'haver d'abandonar el codi preexistent perquè resulta més fàcil començar de nou.

Quan es parla de programació modular, ens referim a la divisió d'un programa en parts més maqnejables i independents. Una regla pràctica per aconseguir aquest propòsit és establir que cada segment del programa no excedeixi, en longitud, d'un pam de codificació.

En la majoria de llenguatges, els mòduls es tradueixen a:
* Procediments: són subprogramesq ue duen a terme una tasca determinada i retornen () o més d'un valor. S'utilitzen per estructurar un programa i millorar la seva claredat.

* Funcions: són subprogrames que duen a terme una determinada tasca i retornen un únic resultat o valor. S'utilitzen per crear operacions noves que no ofereix el llenguatge.

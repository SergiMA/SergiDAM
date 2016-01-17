#1. Desenvolupament de programari ('software')
##1.3. Tipus de llenguatges de programació

Establert el concepte de progrmaa informàtic i els conceptes de codi font, el codi objecte i codi executable (així com el de màquina virtual), cal ara establir les diferències entre els diversos tipus de codi font existents, a través dels quals s'arriba a obtenir un programa informàtic.

> Un **llenguatge de programació** és un llenguatge que permet establir una comunicació entre l'home i la màquina. El llenguatge de programació identificarà el codi font, que el programador desenvoluparà per indicar a la màquina, una vegada aquest codi s'hagi convertit en codi executable, quins passos ha de donar.

Al llarg dels darrers anys ha existit una evolució en el llenguatge de programació. S'ha establert una creixent evolució en la qual es van incorporant elements que permeten crear programes cada vegada més sòlids i eficients. Això facilita molt la tasca del programador per al desenvolupament del programari, el seu manteniment i l'adaptació. Avui en dia, existeixen, fins i tot, llenguatges de programació que permeten la creació d'aplicacions informàtiques a persones sense coneixements tècnis d'informàtica, pel fet d'existir una creació pràcticament automàtica del codi a partir d'unes preguntes.

Els diferents tipus de llenguatges són:
* Llenguatge de primera generació o llenguatge de màquina.
* Llenguatges de segona generació o llenguatges d'assemblador.
* Llenguatges de tercera generació o llenguatges d'alt nivell.
* Llenguatges de quarta generació o llenguatges de propòsit específic.
* Llenguatges de cinquena generació.

> El primer tipus de llenguatge que es va desenvolupar és l'anomenat **llenguatge de primera generació o llenguatge de màquina**. És l'únic llenguatge que entén l'ordinador directament.

La seva estructura està totalment adaptada als cricuits impresos dels ordinadors o processadors electrònics i molt allunyada de la forma d'expressió i anàlisi dels problemes propis dels humans (les instruccions s'expressen en codi binari). Això fa que la programació en aquest llenguatge resulti tediosa i complicada, ja que es requereix un coneixement profund de l'arquetectura física de l'ordinador. A més, s'ha de valorar que el codi màquina fa possible que el programador utilitzi la totalitat de recursos del maquinari, amb la qual cosa es poden obtenir programes molt eficients.

> 10110000 01100001
Aquesta línia conté una instrucció que mou un valor al registre del processador.

Actualment, a causa de la complexitat del desenvolupament d'aquest tipus de llenguatge, està prpàcticament en desús. Només es farà servir en processadors molt concrets  o per a funcionalitats molt específiques.

> El segon tipus de llenguatge de programació són els **llenguatges de segona generació o llenguatges d'assemblador**. Es tracta del primer llenguatge de programació que utilitza codis mnemotècnics per indicar a la màquina les operacions que ha de dur a terme. Aquestes operacions, molt bàsiques, han estat dissenyades a partir de la coneixença de l'estructura interna de la pròpia màquina.

Cada instrucció en llenguatge d'assemblador correspon a una instrucció en llenguatge màquina. Aquests tipus de llenguatges depenen totalment del processador que utilitzi la màquina, per això es diu que estan orientats a les màquines.

En general s'utilitza aquest tipus de llenguatges per programar controladors (_drivers_) o aplicacions de temps real, ja que requereix un ús molt eficient de la velocitat i de la memòria.

###1.3.1. Característiques dels llenguatges de primera i segona generació
Com a avantatges dels llenguatges de primera i segona generació es poden establir:
* Permeten escriure programes molt optimitzats que aprofiten al màquim el maquinari (hardware) disponible.
* Permeten al programador especificar exactament quines evolucions vol que s'executin.

Els inconvenients són els següents:
* Els programes escrits en llenguatges de baix nivell estan completament lligats al maquinari on s'executaran i no es poden traslladar fàcilment a altres sistemes amb un maquinari diferent.
* Cal conèixer a fons l'arquitectura del sistema i del processador per escriure bons programes.
* No permeten expressar de forma directa conceptes habituals a nivell d'algorisme.
* Són difícils de codificar, documentar i mantenir.

> El següent grup de llenguatges es coneix com a **llenguatges de tercera generació o llenguatges d'alt nivell**. Aquests llenguatges, més evolucionats, utilitzen paraules i frases relativament fàcils d'entendre i proporcionen també facilitats per expressar alteracions del flux de control d'una forma bastant senzilla i intuïtiva.

Els llenguatges de tercera generació o d'alt nivell s'utilitzen quan es vol desenvolupar aplicacions grans i complexes, on es prioritza el fet de facilitar i comprendre com fer les coses (llenguatge humà) per sobre del rendiment del programari o del seu ús del a memòria.

Els esforços encaminats a fer la tasca de programació independent de la màquina on s'executaran van donar com a resultat l'aaparició dels llenguatges de programació d'alt nivell.

Els llenguatges d'alt nivell són normalment fàcils d'aprendre perquè estan formats per elements de llenguatges naturals, com ara l'anglès.

Com a conseqüència d'aquest allunyament de la màquina o acostament a les persones, els programes escrits en llenguatges de programació de tercera generació no poden ser interpretats directament per l'ordinador, sinó que és necessari dur a terme prèviament la seva traducció a llenguatge màquina. Hi ha dos tipus de traductors: els compiladors i els intèrprets.

#### Compiladors
Són programes que tradueixen el programa escrit amb un llenguatge d'alt nivell al llenguatge màquina. El compilador detectarà els possibles errors del programa font per aconseguir un programa executable depurat.

Alguns exemples de codis de programació que hauran de passar per un compilador són: Pascal, C, C++, .NET, ...

El procediment que haurà de seguir un programador és el següent:
* Crear el codi font.
* Crear el codi executable fent ús de compiladors i enllaçadors.
* El codi executable depèn de cada sistema operatiu. Per a cada sistema hi ha un compilador, és a dir, si es vol executar el codi amb un altre sistema operatiu s'ha de recompilar el codi font.
* El programa resultant s'executa directament des del sistema operatiu.

#### Els intèrprets
L'intèrpret és un programa que tradueix el codi d'alt nivell a codi de bytes, però, a diferència del compilador, ho fa en temps d'execució. És a dir, no es fa un procés previ de traducció de tot el programa font a codi de bytes, sinó que es va traduint i executant instrucció per instrucció.

Alguns exemples de codis de programació que hauran de passar per un intèrpret són: Java, Javascript, PHP, ASP...
* El codi interpretat no és executat directament pel sistema operatiu, sinó que fa ús d'un intèrpret.
* Cada sistema té el seu propi intèrpret.

#### Compiladros davant intèrprets
L'intèrpret és notablement més lent que el compilador, ja que du a terme la traducció alhora que l'execució. A més, aquesta traducció es fa sempre que s'executa el programa, mentre que el compilador només la du a terme una vegada. L'avantatge dels intèrprets és que fan que els programes siguin més portables. Així, un programa compilat en un ordinador amb sistema operatiu Windows no funcionarà en un Macintosh, o en un ordinador amb un sistema operatiu Linux, a menys que es torni a compilar el programa font en el nou sistema.

### 1.3.2. Caracterísitiques dels llenguatges de tercera, quarta i cinquena generació
Els llenguatges de tercera generació són aquells que són capaços de contenir i executar, en una sola instrucció, l'equivalent a diverses instruccions d'un llenguatge de segona generació.

Els avantatges dels llenguatges de tercera generació són:
* El codi dels programes és molt més senzill i comprensible.
* Són independents del maquinari (no hi fan cap referència). Per aquest motiu és possible "portar" el programa entre diferents ordinadors /arquitectures / sistemes operatius (sempre que en el sistema de destinació existeixi un compilador per a aquest llenguatge d'alt nivell)
* És més fàcil i ràpid escriure els programes i més fàcils mantenir-los.

Els inconvenients dels llenguatges de tercera generació són:
* La seva execució en un ordinador pot resultar més lenta que el mateix programa escrit en llenguatge de baix nivell, tot i que això depèn molt de la qualitat del compilador que faci la traducció.

Exemples de llenguatges de programació de tercera generació: C, C++, Java, Pascal...

> Els **llenguatges de quarta generació o llenguatges de propòsit específic**. Aporten un nivell molt alt d'abstracció en la progrmaació, permentent desenvolupar aplicacions sofisticades en un espai curt de temps, molt inferior al necessari per als llenguatges de 3a generació.

S'automatitzen certs aspectes que abans calia fer a mà. Inclouen eines orientades al desenvolupament d'aplicacions (IDE) que permeten definir i gestionar bases de dades, dur a terme informes (p.ex.: Oracle reports), consultes (p.ex.: informix 4GL), mòduls... , escrivint molt poques línies de codi o cap.

Permeten la creació de prototipus d'una aplicació ràpidament. Els prototipus permeten tenir una idea de l'aspecte i del funcionament de l'aplicació abans que el codi estigui acabat. Això facilita l'obtenció d'un programa que reuneixi les necessitats i expectatives del client.

Alguns dels aspectes positius que mostren aquest tipus de llenguatges de programació són:
* Major abstracció.
* Menor esforç de programació.
* Menor cost de desenvolupament del programari.
* Basats en generació de coid a partir d'especificacions de nivell molt alt.
* Es poden dur a terme aplicacions sense ser un expert en el llenguatge.
* Solen tenir un conjunt d'instruccions limitat.
* Són específics del producte que els ofereix.

Aquests llenguatges de programació de quarta generació estan orientats, bàsicament, a les aplicacions de negoci i al maneig de bases de dades.

Alguns exemples de llenguatges de quarta generació són: Visual Basic, Visual Basic .NET, ABAP de SAP, FileMaker, PHP, ASP, 4D...

> Els **llenguatges de cinquena generació** són els llenguatges específics per al tractament de problemes relacionats amb la intel·ligència artificial i els sistemes experts.

En lloc d'executar només un conjunt d'ordres, l'objectiu d'aquests sistemes és "pensar" i anticipar les necessitats dels usuaris. Aquests sistemes es troben encara en desenvolupament. Es tractaria un paradigma lògic.

Alguns exemples de llenguatges de cinquena generació són Lisp o Prolog.











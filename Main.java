/**
 * Aquest programa és un joc. És el joc del penjat. Consisteix en, en una sèrie de paraules que hi ha predefinides en el mateix codi
 * l'usuari haurà d'endevinar la paraula. La dificultat està en que només hi ha un límit d'errades que podem fer a l'hora d'endevinar.
 * L'usuari, per endevinar una paraula, haurà d'anar introduïnt lletres fins a completar la paraula.
 * 
 * @author Sergi Monzó Aresté
 * (Tot i que no ha escrit el codi, és qui entrega l'examen)
 * 
 * @version 1.0
 * (Si fem modificacions, com ara optimitzacions, ja modificarem el número de versió)
 * 
 * @category Penjat
 * 
 * Opinió personal: No haurien d'haver accents en el penjat, ja que dificulta el joc quan la lletra, tècnicament, és correcta. Per exemple, "ó" hauria de ser "o". 
 */


import java.util.Scanner;
import java.util.Random;
/**
 * Aquesta és la classe única que s'ha utilitzat en aquest programa.
 */
public class Main {
/* Es declaren els atributs */
    static protected String paraules[] = {"hola","programació","casa"};
    static protected int index;
    static protected String p;
/**
 * Aquest és el mètode Main. Tot el programa, tota la resta de mètodes es basen en aquest. Com bé indica el seu nom, aquest és el mètode principal i
 * el programa funcionarà en funció d'aquest. Aquest mètode anirà cridant a altres mètodes per realitzar tasques específiques (o inclús majors), però
 * tot programa començarà per aquest mètode i acabarà amb aquest mètode, tal com és el cas d'aquest programa concret.
 * El main principal serveix per definir l'esquelet d'un programa.
 * 
 * En aquest cas, executa una part important del codi. També es pot fer així, però, per a programes més grans, no seria recomanable ja que dificultaria
 * la recerca d'una part concreta del codi. En aquest cas, tot, a excepció de comprovar si la lletra està o no està dins de la paraula, es fa en aquest mètode.
 * @param args
 */
    public static void main(String[] args) {
        System.out.println("Comença el joc!");

        /* Utilitzant l'atribut "p" ("paraula" que es mostrarà a l'usuari), li assignem una mida igual a la paraula que representa i posem tots els seus
         * caràcters a "_", de manera que l'usuari només pugui veure "_" en comptes de la paraula. (Obviament, l'ha d'endevinar, no ho pot veure)
         */
        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i=0; i<paraules[index].length(); i++) {
            p += "_";
        }

        System.out.println(p);

        Scanner reader = new Scanner(System.in);
        
        int num_errors = 0;

        while (!p.equals(paraules[index]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(p);
        }
   }

    /**
     * Mètode que s'encarregarà de comprovar si, quan l'usuari introdueix lletra, si aquesta està dins de la paraula o no. 
     * 
     * @param nova 		Paràmetre rebut del mètode principal (main). Conté una lletra introduïda per l'usuari 
     * @return trobada 	Retorna un booleà que dirà si la lletra introduïda s'ha trobat o no dins de la paraula.
     */
    static public boolean nova_lletra(char nova) {
        boolean trobada = false;
        String paraula_old = p;
        p = "";
        for (int i=0; i<paraules[index].length(); i++) {
            if (paraules[index].charAt(i) == nova) {
                p += paraules[index].charAt(i);
                trobada = true;
            }
            else {
                p += paraula_old.charAt(i);
            }
        }
        return trobada;
    }

}


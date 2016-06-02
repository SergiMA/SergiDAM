/**
 * Aquest programa �s un joc. �s el joc del penjat. Consisteix en, en una s�rie de paraules que hi ha predefinides en el mateix codi
 * l'usuari haur� d'endevinar la paraula. La dificultat est� en que nom�s hi ha un l�mit d'errades que podem fer a l'hora d'endevinar.
 * L'usuari, per endevinar una paraula, haur� d'anar introdu�nt lletres fins a completar la paraula.
 * 
 * @author Sergi Monz� Arest�
 * (Tot i que no ha escrit el codi, �s qui entrega l'examen)
 * 
 * @version 1.0
 * (Si fem modificacions, com ara optimitzacions, ja modificarem el n�mero de versi�)
 * 
 * @category Penjat
 * 
 * Opini� personal: No haurien d'haver accents en el penjat, ja que dificulta el joc quan la lletra, t�cnicament, �s correcta. Per exemple, "�" hauria de ser "o". 
 */


import java.util.Scanner;
import java.util.Random;
/**
 * Aquesta �s la classe �nica que s'ha utilitzat en aquest programa.
 */
public class Main {
/* Es declaren els atributs */
    static protected String paraules[] = {"hola","programaci�","casa"};
    static protected int index;
    static protected String p;
/**
 * Aquest �s el m�tode Main. Tot el programa, tota la resta de m�todes es basen en aquest. Com b� indica el seu nom, aquest �s el m�tode principal i
 * el programa funcionar� en funci� d'aquest. Aquest m�tode anir� cridant a altres m�todes per realitzar tasques espec�fiques (o incl�s majors), per�
 * tot programa comen�ar� per aquest m�tode i acabar� amb aquest m�tode, tal com �s el cas d'aquest programa concret.
 * El main principal serveix per definir l'esquelet d'un programa.
 * 
 * En aquest cas, executa una part important del codi. Tamb� es pot fer aix�, per�, per a programes m�s grans, no seria recomanable ja que dificultaria
 * la recerca d'una part concreta del codi. En aquest cas, tot, a excepci� de comprovar si la lletra est� o no est� dins de la paraula, es fa en aquest m�tode.
 * @param args
 */
    public static void main(String[] args) {
        System.out.println("Comen�a el joc!");

        /* Utilitzant l'atribut "p" ("paraula" que es mostrar� a l'usuari), li assignem una mida igual a la paraula que representa i posem tots els seus
         * car�cters a "_", de manera que l'usuari nom�s pugui veure "_" en comptes de la paraula. (Obviament, l'ha d'endevinar, no ho pot veure)
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
     * M�tode que s'encarregar� de comprovar si, quan l'usuari introdueix lletra, si aquesta est� dins de la paraula o no. 
     * 
     * @param nova 		Par�metre rebut del m�tode principal (main). Cont� una lletra introdu�da per l'usuari 
     * @return trobada 	Retorna un boole� que dir� si la lletra introdu�da s'ha trobat o no dins de la paraula.
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


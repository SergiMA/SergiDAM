


import java.util.Scanner;
import java.util.Random;

public class Main {

    static protected String paraules[] = {"hola","programació","casa"};
    static protected int index;
    static protected String p;

    public static void main(String[] args) {
        System.out.println("Comença el joc!");

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



package alkoholkalkulator;

import java.util.Scanner;


public class Ital {
    Scanner sc = new Scanner(System.in);
    String nev;
    double szazalek;
    int ml;

   

    public double getAlkoholGramm() {
        double getAlkoholGramm = 0.8 * ml * szazalek / 100.0;

        return getAlkoholGramm;
    }

}


package alkoholkalkulator;

import java.util.Scanner;


public class Ember {
    
    String nev;
    int kilogramm;
    double alkoholGramm;

  

    public void megiszik(Ital ital) {
        alkoholGramm = alkoholGramm + ital.getAlkoholGramm();
    }

    public void pihen(double ora) {
        alkoholGramm = alkoholGramm - 9 * ora;
          if (alkoholGramm < 0) {
            alkoholGramm = 0;
             }
    }

    public double alkoholGramm() {
        alkoholGramm = alkoholGramm;
        if (alkoholGramm < 0) {
            alkoholGramm = 0;
        }
        return alkoholGramm;
    }

    public double veralkoholEzrelek() {
        double veralkoholEzrelek = alkoholGramm / kilogramm;
        if (veralkoholEzrelek < 0) {
            veralkoholEzrelek = 0;
        }
        return veralkoholEzrelek;
    }

    public double getJozanIdo() {
        double getJozanIdo = alkoholGramm / 9;
        if (getJozanIdo < 0) {
            getJozanIdo = 0;
        }
        return getJozanIdo;

    }

}

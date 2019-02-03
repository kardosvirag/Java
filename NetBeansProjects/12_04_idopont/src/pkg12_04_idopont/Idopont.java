
package pkg12_04_idopont;


public class Idopont {

    int ora;
    int perc;
    int masodperc;

    public void kiir() {

        if (ora < 10) {
            System.out.print("0" + ora);
        } else {
            System.out.print(ora);
        }
        if (perc < 10) {
            System.out.print(":0" + perc);
        } else {
            System.out.print(":" + perc);
        }

        if (masodperc < 10) {
            System.out.print(":0" + masodperc);
        } else {
            System.out.print(":" + masodperc);
        }
        System.out.println("");

       
    }

    public void novel(int mp) {

        int pluszMasodperc = masodperc + mp;
        int pluszPerc = pluszMasodperc / 60;

        if (pluszPerc >= 1) {
            perc = perc + pluszPerc;
            masodperc = pluszMasodperc - pluszPerc * 60;
        } else {
            masodperc = masodperc + mp;
        }

        if (perc >= 60) {
            int pluszOra = perc / 60;

            if (pluszOra >= 1) {
                ora = ora + pluszOra;
                perc = perc - pluszOra * 60;
            }
        }

        if (ora >= 24) {
            ora = ora - 24;
        }
    }


}



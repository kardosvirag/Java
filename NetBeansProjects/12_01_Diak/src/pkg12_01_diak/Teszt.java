
package pkg12_01_diak;

import java.util.Scanner;


public class Teszt {

   
    public static void main(String[] args) {
     
        Diak jozsi = new Diak();
        jozsi.nev = "Nagy Jozsef";
        jozsi.szuletesiEv = 1999;
        jozsi.atlag = 4.5;

        jozsi.kiir();
        
        Diak bekert = new Diak();

        bekert.beker();
        bekert.kiir();

}
}
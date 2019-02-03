
package pkg12_01_diak;

import java.util.Scanner;


public class Diak {
    
    String nev;
    int szuletesiEv;
    double atlag;

    public void kiir() {
        System.out.println(nev + " (" + szuletesiEv + "; " + atlag + ")");
    }

    public void beker() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a diák nevét!");
        nev = sc.nextLine();
        System.out.println("Kérem a diák születési évét!");
        szuletesiEv = sc.nextInt();
        System.out.println("Kérem a diák átlagát!");
        atlag = sc.nextDouble();

    }
}

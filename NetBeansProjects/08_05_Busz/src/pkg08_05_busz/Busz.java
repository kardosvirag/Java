/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_05_busz;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Busz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int felszallok = 0;
        int leszallok = 0;
        int osszeg = 0;
        int i = 1;
        int negyedik = 0;
        int minimum = 0;
        int minimumhely = 1;
        double atlag = 0;
        int maximum = 0;
        int maximumhely = 1;

        System.out.print("Kérem a(z) 1. megállónál felszálló utasok számát! ");
        felszallok = sc.nextInt();

        osszeg += felszallok;
        minimum = felszallok;

        atlag += osszeg;
        maximum = osszeg;

        if (osszeg > 40) {
            System.out.println("Túl sok utas a(z) " + i + ". megállónál.");
        } else if (osszeg < 0) {
            System.out.println("Negatív utasszám a(z) " + i + ". megállónál.");
        } else if (osszeg <= 40 && osszeg >= 0) {

            for (i = 2; i < 5; i++) {

                if (osszeg <= 40 && osszeg >= 0) {

                    System.out.print("Kérem a(z) " + i + ". megállónál leszálló utasok számát! ");
                    leszallok = sc.nextInt();

                    System.out.print("Kérem a(z) " + i + ". megállónál felszálló utasok számát! ");
                    felszallok = sc.nextInt();

                    osszeg -= leszallok;
                    osszeg += felszallok;

                    if (i == 4) {
                        negyedik = osszeg;
                    }

                    if (felszallok < minimum) {
                        minimum = felszallok;
                        minimumhely = i;
                    }

                    atlag += osszeg;

                    if (osszeg > maximum) {
                        maximum = osszeg;
                        maximumhely = i;
                    }

                } else if (osszeg > 40) {
                    System.out.println("Túl sok utas a(z) " + i + ". megállónál.");
                    break;
                } else if (osszeg < 0) {
                    System.out.println("Negatív utasszám a(z) " + (i - 1) + ". megállónál.");
                    break;
                }

            }

            if (osszeg <= 40 && osszeg >= 0) {
                System.out.print("Kérem a(z) 5. megállónál leszálló utasok számát! ");
                leszallok = sc.nextInt();

                osszeg -= leszallok;
                atlag = atlag / 4;

                if (osszeg > 0) {
                    System.out.println("Fennmaradó utas a végállomás után.");
                } else {
                    System.out.println("A 4. megálló elhagyása után " + negyedik + " utas volt a buszon.");
                    System.out.println("Az adatok helyesek.");
                    System.out.println("A(z) " + minimumhely + ". megállónál volt a legkevesebb a felszállók száma: " + minimum + " utas.");
                    System.out.println("A buszon átlagosan " + atlag + " utas tartózkodott.");
                    System.out.println("A legtöbb utas a(z) " + maximumhely + ". megálló után volt: " + maximum);
                }

            }
        }
    }

}

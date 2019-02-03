/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_01_katikonyvei;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class KatiKonyvei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double osszeg = 0;
        double oraszam = 0;
        double napszam = 0;
        int minimum = 0;
        int szazhuszold = 0;

        System.out.println("Szia Kati!");

        System.out.print("Kérlek írd be, hány könyvet szeretnél elolvasni! ");
        int konyvekszama = sc.nextInt();

        for (int i = 0; konyvekszama <= i; i++) {
            if (konyvekszama < 1) {
                System.out.println("Kati, a projekted biztosan legalább 1 könyvet tartalmaz!");
                System.out.print("Kérlek írd be, hány könyvet szeretnél elolvasni! ");
                konyvekszama = sc.nextInt();
            }
        }
        System.out.print("A(z) 1. könyv hány oldalas? ");
        int oldalszam = sc.nextInt();
        minimum = oldalszam;
        osszeg += oldalszam;
        oraszam = osszeg / 20;
        napszam = oraszam / 2.5;

        if (oldalszam < minimum) {
            minimum = oldalszam;
        }

        if (oldalszam < 120) {
            ++szazhuszold;
        }

        for (int k = 2; k <= konyvekszama; k++) {
            System.out.print("A(z) " + k + ". könyv hány oldalas? ");
            oldalszam = sc.nextInt();

            osszeg += oldalszam;
            oraszam = osszeg / 20;
            napszam = oraszam / 2.5;

            if (oldalszam < minimum) {
                minimum = oldalszam;
            }

            if (oldalszam < 120) {
                ++szazhuszold;
            }
        }

        System.out.println("Összesen " + (int) osszeg + " oldalt akarsz elolvasni.");
        System.out.print("A projekt ");
        System.out.printf("%.1f", oraszam);
        System.out.print(" óráig fog tartani, és ");
        System.out.printf("%.2f", napszam);
        System.out.println(" napot vesz igénybe.");
        System.out.println("A legrövidebb könyv " + minimum + " oldalas.");
        System.out.println("A könyvek között " + szazhuszold + " db. 120 oldalnál rövidebb könyv van.");

    }
}

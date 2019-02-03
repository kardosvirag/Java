/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_02_homerseklet;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Homerseklet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hely = -1;
        int osszeg = 0;
        double atlag = 0;
        int huszonotfok = 0;
        int i = 1;
        int maximum = 0;
        int maximumhely = 1;

        System.out.print("Kérem a(z) 1. nap középhőmérsékletét: ");
        int homerseklet = sc.nextInt();

        if (homerseklet < 0) {
            hely = i;
        }

        osszeg += homerseklet;
        atlag = (double) osszeg / 7;

        if (homerseklet > 25) {
            ++huszonotfok;
        }

        maximum = homerseklet;

        for (i = 2; i <= 7; i++) {
            System.out.print("Kérem a(z) " + i + ". nap középhőmérsékletét: ");
            homerseklet = sc.nextInt();

            if (homerseklet < 0) {
                hely = i;

            }

            osszeg += homerseklet;
            atlag = (double)osszeg / 7;

            if (homerseklet > 25) {
                ++huszonotfok;
            }

            if (homerseklet > maximum) {
                maximum = homerseklet;
                maximumhely = i;
            }

        }

        if (hely == -1) {
            System.out.println("Nem volt 0 fok alatti középhőmérsékletű nap.");
        } else {
            System.out.println("Volt 0 fok alatti középhőmérsékletű nap.");
        }

        System.out.print("A heti átlaghőmérséklet ");
        System.out.printf("%.2f", atlag);
        System.out.println(" fok volt.");
        System.out.println("A héten " + huszonotfok + " olyan nap volt, amikor 25 foknál melegebb volt.");
        System.out.println("A legmelegebb nap a(z) " + maximumhely + ". volt, amikor " + maximum + " fok volt.");
    }

}

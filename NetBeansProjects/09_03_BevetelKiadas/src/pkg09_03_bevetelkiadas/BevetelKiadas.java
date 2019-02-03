/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_03_bevetelkiadas;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class BevetelKiadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int osszeg = 0;
        int minusz = 0;

        System.out.print("Hány tétel szerepeljen a tömbben? ");
        int dbTetel = sc.nextInt();

        if (dbTetel <= 0) {
            System.out.println("A tételek száma pozitív kell legyen!");
        }

        System.out.println("Kérem a tételeket!");
        int tetel = 0;
        int[] tombTetel = new int[dbTetel];

        for (int i = 0; i < tombTetel.length; i++) {
            tetel = sc.nextInt();
            tombTetel[i] = tetel;
            osszeg += tetel;

            if (osszeg < 0) {
                minusz = i;
            }

        }
        if (minusz > 0) {
            System.out.println("Volt olyan pillanat, amikor negatívba csúsztunk.");
        } else {
            System.out.println("Minden rendben volt.");
        }

    }

}

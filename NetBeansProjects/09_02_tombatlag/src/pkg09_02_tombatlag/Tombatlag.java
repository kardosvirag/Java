/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_02_tombatlag;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Tombatlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double szamok = 0;
        double osszeadas = 0;
        double atlag = 0;

        System.out.print("Hány szám lesz? ");
        int db = sc.nextInt();

        while (db < 0) {
            System.out.println("A számok darabszáma negatív.");
            System.out.print("Hány szám lesz? ");
            db = sc.nextInt();
        }

        if (db > 0) {
            System.out.println("Kérem, írja be a számokat:");

            double[] tombSzamok = new double[db];

            for (int i = 0; i < db; i++) {
                szamok = sc.nextDouble();
                tombSzamok[i] = szamok;
                osszeadas += szamok;
            }

            atlag = osszeadas / db; 

            System.out.print("Az átlag feletti számok: ");

            for (int i = 0; i < tombSzamok.length; i++) {
               
                if (atlag < tombSzamok[i]) {
                    System.out.print(tombSzamok[i] + " ");

                }
            }

        }

    }
}

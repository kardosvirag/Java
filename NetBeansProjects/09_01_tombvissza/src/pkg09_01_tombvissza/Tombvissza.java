/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_01_tombvissza;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Tombvissza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double szamok = 0;
        

        System.out.print("Hány szám lesz? ");
        int db = sc.nextInt();

        while (db < 0) {
            System.out.println("A számok darabszáma negatív.");
            System.out.print("Hány szám lesz? ");
            db = sc.nextInt();
        }

        if (db > 0) {
            System.out.println("Kérem írja be a számokat:");

            double[] szamokTomb = new double[db];

            for (int i = 0; i < db; i++) {
                szamok = sc.nextDouble();
                szamokTomb[i] = szamok;
            }

            int dbTomb = db - 1;

            System.out.println("A számok fordított sorrendben:");

            for (int i = dbTomb; 0 <= i; i--) {
                System.out.print(szamokTomb[i] + " ");
            }
        }

    }
}

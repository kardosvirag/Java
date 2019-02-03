/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_10_fenyofarajzolo;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Fenyofa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fenyőfarajzoló program.");

        System.out.print("Kérem a magasságot: ");
        int magassag = sc.nextInt();

        if (magassag <= 2) {
            System.out.println("A magasság csak 2-nél nagyobb lehet.");
        } else {

            System.out.print("Kérem a szintek számát: ");
            int szint = sc.nextInt();
            if (szint <= 0) {
                System.out.println("A szintek száma csak pozitív lehet.");

            } else {
                for (int sz = 1; sz <= szint; sz++) {

                    for (int i = 1; i <= magassag; i++) {
                        for (int j = magassag; j > 1; j--) {
                            if (i < j) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }

                        }

                        for (int j = 1; j <= magassag; j++) {
                            if (j <= i) {
                                System.out.print("*");
                            } else {
                                System.out.print("");
                            }

                        }
                        System.out.println("");
                    }
                }
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= magassag+1; j++) {
                        if ((j != magassag + 1) && (j != magassag) && (j != magassag - 1)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
            }

        }
    }

}

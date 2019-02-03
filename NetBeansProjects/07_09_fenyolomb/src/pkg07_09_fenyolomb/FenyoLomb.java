/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_09_fenyolomb;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class FenyoLomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fenyőfalomb rajzoló program.");

        System.out.print("Kérem a magasságot: ");
        int magassag = sc.nextInt();

        if (magassag <= 0) {
            System.out.println("A magasság csak pozitív lehet.");
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

            }

        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_02_prim;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Prim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a számot, amiről el kell döntenem, hogy prím-e: ");
        int szam = sc.nextInt();

        boolean prim = prim(szam);
        
        if (prim) {
             System.out.print("A szám prím.");
        }else{
             System.out.print("A szám nem prím.");
        }

    }

    public static boolean prim(int szam) {

       for (int i = 2; i < szam; i++) {
            if (szam % i == 0) {
                return false;
            }
        }
        return true;

    }

}

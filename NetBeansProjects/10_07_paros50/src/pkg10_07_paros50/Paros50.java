/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_07_paros50;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Paros50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a tömb elemszámát: ");
        int db = sc.nextInt();

        System.out.print("Kérem a tömb elemeit: ");
        int elemszamok;
        int szamok[] = new int[db];

        for (int i = 0; i < db; i++) {
            elemszamok = sc.nextInt();
            szamok[i] = elemszamok;
        }

        boolean parosNagyobb50 = parosNagyobb50(szamok);

        if (parosNagyobb50) {
            System.out.println("igen");
        } else {
            System.out.println("nem");
        }

    }

    private static boolean parosNagyobb50(int[] szamok) {

        for (int i = 0; i < szamok.length; i++) {

            if (szamok[i] > 50 && szamok[i] % 2 == 0) {
                
                return true;
            } 

        }
                return false;
    }
    
    

}


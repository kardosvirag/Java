/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_09_tomtombbekerekit;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class TombTombbeKerekit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem az összegek számát: ");
        int db = sc.nextInt();
        int[] osszegek = new int[db];

        System.out.print("Kérem az összegeket: ");
        int osszeg;

        for (int i = 0; i < db; i++) {
            osszeg = sc.nextInt();
            osszegek[i] = osszeg;
        }

        // 1. variáció
      /**  kerekit(osszegek);
        System.out.println("Kerekítve: ");
        for (int i = 0; i < osszegek.length; i++) {
            System.out.println(osszegek[i]);
        }**/

        // 2.variacio
        int[] ujTomb = kerekitUj(osszegek);

        System.out.print("Kerekítve: ");

        for (int i = 0; i < ujTomb.length; i++) {
            System.out.print(ujTomb[i] + " ");
        }

    }

    private static int kerekit(int osszeg) {

        int utolsoszamjegy = osszeg % 10;
        int kerekit;

        if (utolsoszamjegy >= 0 && utolsoszamjegy <= 2) {
            kerekit = osszeg - utolsoszamjegy;
        } else if (utolsoszamjegy >= 3 && utolsoszamjegy <= 7) {
            kerekit = (osszeg - utolsoszamjegy) + 5;
        } else {
            kerekit = (osszeg - utolsoszamjegy) + 10;
        }

        return kerekit;
    }

    private static int[] kerekitUj(int[] osszegek) {

        int[] ujTomb = new int[osszegek.length];

        for (int i = 0; i < osszegek.length; i++) {
            ujTomb[i] = kerekit(osszegek[i]);
        }

        return ujTomb;

    }

    private static void kerekit(int[] osszegek) {

        for (int i = 0; i < osszegek.length; i++) {
            osszegek[i] = kerekit(osszegek[i]);
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_06_tombmaxindex;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class TombMaxIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a tömb elemszámát: ");
        int db = sc.nextInt();

        double elemek;
        double[] tombElemek = new double[db];

        System.out.print("Kérem a tömb elemeit: ");
        for (int i = 0; i < db; i++) {
            elemek = sc.nextDouble();
            tombElemek[i] = elemek;
        }

        int maxIndex = maxIndex(tombElemek);

        System.out.println("A tömb legnagyobb elemének indexe: " + maxIndex);

    }

    private static int maxIndex(double[] tombElemek) {

        double max = 0;
        int maxIndex = 0;

        for (int i = 0; i < tombElemek.length; i++) {
            if (tombElemek[i] > max) {
                max = tombElemek[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

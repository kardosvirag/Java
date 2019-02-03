/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_02_faktor;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Faktor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Faktoriális számítás.");
        System.out.print("n=");
        int szam = sc.nextInt();
        int faktorialis = 1;

        for (int i = 1; i <= szam; i++) {
            faktorialis *= i;

        }
        if (!(szam < 0)) {
            System.out.println(szam + "!=" + faktorialis);
        } else {
            System.out.println(szam + " faktoriálisát nem értelmezzük.");
        }
    }
}



    






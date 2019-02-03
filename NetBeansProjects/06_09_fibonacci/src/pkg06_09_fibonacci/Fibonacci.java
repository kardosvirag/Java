/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_09_fibonacci;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A Fibonacci-számsorozatot meddig írjam ki? ");
        int szam = sc.nextInt();

        int a = 0;
        int b = 1;
        int i = 1;

        while (b < szam) {
            System.out.print(b + " ");
            b = b + a;
            a = b - a;
            i++;
        }
    }

}

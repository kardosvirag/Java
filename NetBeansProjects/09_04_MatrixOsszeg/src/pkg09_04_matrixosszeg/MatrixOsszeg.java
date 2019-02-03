/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_04_matrixosszeg;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class MatrixOsszeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] elsoMatrix = new int[2][2];
        int[][] masodikMatrix = new int[2][2];
        int[][] osszeg = new int[2][2];

        System.out.println("Kérem az első mátrix elemeit:");

        for (int i = 0; i < elsoMatrix.length; i++) {
            for (int j = 0; j < elsoMatrix[i].length; j++) {
                elsoMatrix[i][j] = sc.nextInt();
                

            }

        }

        System.out.println("Kérem a második mátrix elemeit:");

        for (int i = 0; i < masodikMatrix.length; i++) {
            for (int j = 0; j < masodikMatrix[i].length; j++) {
                masodikMatrix[i][j] = sc.nextInt();
               
            }

        }

        System.out.println("Az eredmény:");

        for (int i = 0; i < osszeg.length; i++) {
            for (int j = 0; j < osszeg.length; j++) {
                osszeg[i][j] = elsoMatrix[i][j] + masodikMatrix[i][j];
              
                if(!(j==1)){
                System.out.print(osszeg[i][j]+" ");
                }else{
                System.out.print(osszeg[i][j]);    
                }
            }
            System.out.println("");
        }

    }

}

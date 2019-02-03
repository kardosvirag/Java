/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_06_matrixoszlop;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class MatrixOszlop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {{1, 4, 7, 5, 3}, {3, 7, 9, 10, 1}, {4, -3, 2, -4, 1}, {5, 9, 6, 4, 3}, {1, 2, 3, 4, 5}};

        System.out.print("Melyik oszlopát szeretnéd kiíratni (0-4)? ");
        int oszlop = sc.nextInt();

        while (oszlop >= 5 || oszlop < 0) {
            System.out.println("Nem jó index.");
            System.out.print("Melyik oszlopát szeretnéd kiíratni (0-4)? ");
            oszlop = sc.nextInt();
        }

        if (oszlop <= 4 && oszlop >= 0) {

            System.out.println("A mátrix " + oszlop + ". indexű oszlopa:");

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < 1; j++) {

                   j = oszlop;
                    System.out.println(matrix[i][j]);
                   
                }
            }
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_05_matrixsor;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class MatrixSor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {{1, 4, 7, 5, 3}, {3, 7, 9, 10, 1}, {4, -3, 2, -4, 1}, {5, 9, 6, 4, 3}, {1, 2, 3, 4, 5}};

        System.out.print("Melyik sorát szeretnéd kiíratni (0-4)? ");
        int sor = sc.nextInt();

        while (sor >= 5 || sor < 0) {
            System.out.println("Nem jó index.");
            System.out.print("Melyik sorát szeretnéd kiíratni (0-4)? ");
            sor = sc.nextInt();
        }

        if (sor <= 4 && sor >= 0) {

            System.out.print("A mátrix " + sor +". indexű sora: ");
            
           //for (int i = 0; i < 1; i++) {
                for (int j = 0; j < matrix[sor].length; j++) {

                   // i = sor;
                    System.out.print(matrix[sor][j] + " ");
                }
           // }

        }
    }

}

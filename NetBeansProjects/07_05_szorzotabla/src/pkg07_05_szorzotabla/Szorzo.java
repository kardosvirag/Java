/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_05_szorzotabla;

/**
 *
 * @author virag
 */
public class Szorzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int j = 1; j <= 9; j++) {
            for (int k = 1; k <= 9; k++) {
                if (!(k == 9)) {
                    System.out.print(j * k + " ");
                } else {
                    System.out.print(j * k);
                }
            }
            System.out.println();

        }
    }
}
    


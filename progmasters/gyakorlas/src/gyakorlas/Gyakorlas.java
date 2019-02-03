/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Gyakorlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[][]  myArray = new int [6][6];
       Scanner scanner = new Scanner(System.in);
      
         for(int i = 0; i < myArray.length; i++){
             for(int y = 0; y < myArray[i].length; y++){
             myArray[i][y] = scanner.nextInt();
             }
             System.out.println();
         }
    }
    
}

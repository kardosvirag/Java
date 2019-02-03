/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadruples;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Quadruples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Test
            We'll say that a "quadruple" in a string is a char appearing four times in a row. 
            Print the number of quadruples in the given string. The quadruples may overlap.

            HINT: Watch out for spaces!

            Input Format
            A single line with a string.

            Output Format
            A number.
        */
       
       Scanner scanner = new Scanner(System.in);
       String myString = scanner.nextLine();
       int sumOfQuadruples = 0;
       
       for(int i = 0; i < myString.length() - 3; i++ ){
           if(myString.charAt(i) == myString.charAt(i+1)
           && myString.charAt(i) == myString.charAt(i+2) 
           && myString.charAt(i) == myString.charAt(i+3)){
               sumOfQuadruples = sumOfQuadruples + 1;
           }
       }
       
       System.out.print(sumOfQuadruples);
    }
    
}

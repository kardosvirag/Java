/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagestblock;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class LagestBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
        Test
        We call a sequence of identical characters a 'block'. Print the length of the largest 'block' in the given string.

        HINT: Watch out for spaces!

        Input Format
        A single line with a string.

        Output Format
        A number.
        */
        
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        int firstBlock = 0;
        int secondBlock = 0;
        String newString = ""; 
              
        for (int i = 0; i < myString.length()-1; i++){
             if (myString.charAt(i) == myString.charAt(i+1)){
                 firstBlock = firstBlock + 1;
                 newString = newString + myString.charAt(i);
             }else if (myString.charAt(i) != myString.charAt(i+1) && secondBlock <= firstBlock){
                secondBlock = firstBlock + 1;
                firstBlock = 0;
             }else if (myString.charAt(i) != myString.charAt(i+1)){
                firstBlock = 0;
             }
          }
               
        if(firstBlock >= secondBlock){
            System.out.print(firstBlock + 1);
        } else{
            System.out.print(secondBlock);
        }
           

    }
    
}

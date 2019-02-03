/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* TASK
        "A palindrome is a word, phrase, number, or other sequence of characters 
        which reads the same backward or forward." (Wikipedia)

        Task
        Given a string A, print 'Yes' if it is a palindrome, print 'No' otherwise.

        Constraints

        A will consist at most lower case english letters.
        */
        
        
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        original = original.toLowerCase();
        int length = original.length();
        String reverse = "";
        
        
        for(int i = length - 1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        
        
        if (original.equals(reverse)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}

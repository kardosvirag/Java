/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeat_end;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Repeat_end {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Task
    Given a string and an int n, print a string made of n+1 repetitions of 
    the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

        HINT: Watch out for spaces!

        Input Format
        There are two lines of input:
        The first line contains a string.
        The second line contains an integer.

        Output Format
        A single String.
        */
        
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();    
        int n = scanner.nextInt();
        String repeatEnd = "";
       
        for (int i = myString.length()-n ; i < myString.length(); i++){
            repeatEnd = repeatEnd + myString.charAt(i);
        }
        
         for (int y = 0; y < n+1; y++){
            System.out.print(repeatEnd);
        }
        
    }
    
}

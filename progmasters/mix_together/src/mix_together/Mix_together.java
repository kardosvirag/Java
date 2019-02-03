/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mix_together;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Mix_together {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Task
        Given two strings, a and b, create a bigger string made of the first char of b, 
        the first char of a, the second char of b, the second char of a, and so on. 
        Any leftover chars go to the end of the result.

        HINT: Watch out for spaces!

        Input Format
        There are two lines of input, both contain a String.

        Output Format
        A single String.

        */
        
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();    
        String b = scanner.nextLine();
        String newString = "";
        String endOfNewString = "";
        int length;
        
        if (a.length() > b.length()){
            length = b.length();
            for (int y = b.length(); y < a.length(); y++){
                endOfNewString = endOfNewString + a.charAt(y);
            }
        }else{
            length = a.length();
            for (int x = a.length(); x < b.length(); x++){
                endOfNewString = endOfNewString + b.charAt(x);
            }
        }
        
        for(int i = 0; i < length ; i++){
            newString = newString + b.charAt(i) + a.charAt(i);
        }
        
        System.out.print(newString);
        System.out.print(endOfNewString);
    }
}

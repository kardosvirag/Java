/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substring;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author virag
 */
public class Substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Task
Given a string, s, and two indices, start and end, print a substring consisting 
        of all characters in the inclusive range from start to end - 1. 
        You'll find the String class's substring method helpful in completing this challenge.

Input Format
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.

Constraints

1 <= |s| <= 100
0 <= start <= end <= n
String s consists of letters of the Hungarian alphabet and punctuation marks

Output Format
Print the substring in the inclusive range from start to end - 1.
        */
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[]  nums = new int[2];
        
        
        int start = scanner.nextInt();
        int end = scanner.nextInt();
     
        System.out.print(s.substring(start, end));
          
    }
    
}

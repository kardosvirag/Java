/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsi;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class LoopsI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Task
Given an integer, n , print its first 10 multiples. Each multiple n x i 
        (where 1 <= i <= 10) should be printed on a new line in the form: 'n x i = result'.

Input Format
A single integer, n.

Constraints
0 <= n <= 50

Output Format
Print 10 lines of output; each line i (where 1 <= i <= 10) 
        contains the result of n x i in the form: 'n x i = result'.Ω
        */
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m;
        
        for(int i = 1; i <= 10; i++){
            m = i * n;
            System.out.println(n + " x " + i + " = " + m);
        }
    }
    
}

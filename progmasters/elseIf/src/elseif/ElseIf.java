/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseif;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class ElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     /** 
        Task
Given an integer, n, perform the following conditional actions:

If n is odd, print 'Weird'. - > paratlan 
If n is even -> paros  and in the inclusive range of 2 to 5 -> 2-4, print 'Not Weird'.
If n is even and in the inclusive range of 6 to 20 -> 6-19, print 'Weird'.
If n is even and greater than 20, print 'Not Weird'.
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format
A single line containing a positive integer, n.

Output Format
Print 'Weird' if the number is weird; otherwise, print 'Not Weird'.

       */
        
        
        
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        
        if(n % 2 == 0 && 2 <= n && n < 5){
            System.out.print("Not Weird");
        }
        else if(n % 2 == 0 &&  6 <= n && n < 20){
            System.out.print("Weird");
        }else if(n % 2 == 0 && 20 < n){
            System.out.print("Not Weird");
        }
        else{
            System.out.print("Weird");
        }
    }
}
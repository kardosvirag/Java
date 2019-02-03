/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /*  Task
Create an array, a, capable of holding n integers.
Using a loop, save each sequential value to its corresponding location in the array.
        For example, the first value must be stored in a0, the second value must be stored in a1, and so on.
Good luck!

Input Format
The first line contains a single integer, n, denoting the size of the array. 
Each line i of the n subsequent lines contains a single integer denoting the value of element ai.

Output Format
Loop through array a and print each sequential element on a new line.*/
      
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]  myArray = new int[n];
        
          for (int i = 0; i<n; i++){
              myArray[i] = scanner.nextInt();
          }
          
          for (int y = 0; y < myArray.length; y++){
              System.out.println(myArray[y]);
          }
         
    }
    
}

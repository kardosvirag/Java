/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2d;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Task
//            You are given a 6x6 2D array. An hourglass in an array is a portion shaped like this:
//
//
//                 a b c
//                   d
//                 e f g
//            For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
//
//
//                 1 1 1 0 0 0
//                 0 1 0 0 0 0
//                 1 1 1 0 0 0
//                 0 0 0 0 0 0
//                 0 0 0 0 0 0
//                 0 0 0 0 0 0
//            Actually, there are many hourglasses in the array above. The three upper leftmost hourglasses are the following:
//
//
//                 1 1 1     1 1 0     1 0 0
//                   1         0         0
//                 1 1 1     1 1 0     1 0 0
//
//            The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
//
//            In this problem you have to print the largest sum among all the hourglasses in the array.
//
//            Input Format
//            There will be exactly 6 lines, each containing 6 integers separated by spaces. Each integer will be between -9 and 9 inclusive.
//
//            Output Format
//            Print the answer to this problem on a single line.
        
//        int[][]  myArray = new int [][]{
//            {0,1,2,3,4,5},
//            {0,1,2,3,4,5},
//            {0,1,2,3,4,5},
//            {0,1,2,3,4,5},
//            {0,1,2,3,4,5},
//            {0,1,2,3,4,5},
//        };
     
         int[][]  myArray = new int [6][6];
         Scanner scanner = new Scanner(System.in);
        
         
       //  System.out.print(myArray.length);
         for(int i = 0; i < myArray.length; i++){
             for(int y = 0; y < myArray[i].length; y++){
               //  myArray[i][y] = scanner.nextInt();
                 
                 if(y == myArray.length-1){
                      System.out.print(y);
                     // myArray[i][y] = scanner.nextInt(y);
                  }else{
                     System.out.print(y + " ");
                 }
             }
             System.out.println();
         }
         
         
         
         
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feweronethanfour;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class FewerOnethanFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Task
            Given an array of ints, print 'true' if the number of '1's is fewer than the number of '4's.

            Input Format
            The first line contains a single integer, n, denoting the size of the array. 
            Each line i of the n subsequent lines contains a single integer denoting the value of the array at position i.

            Output Format
            Simply the word 'true' or 'false'.
        */
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]  myArray = new int[n];
        int sumOfOne = 0;
        int sumOfFour = 0;

        
        for(int i = 0; i < myArray.length ; i++){
          myArray[i] = scanner.nextInt();  
          if(myArray[i] == 1){
              sumOfOne = sumOfOne + 1;
          } else if(myArray[i] == 4){
              sumOfFour = sumOfFour + 1;
          }     
        }

        if(sumOfOne < sumOfFour){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    } 
}

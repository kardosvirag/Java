/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decreasingscores;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class DecreasingScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
//        Task
//            Given an array of scores, print 'true' if each score is equal to or lower than the one preceding it.
//
//            Input Format
//            The first line contains a single integer, n, denoting the size of the array. 
//            Each of the subsequent n lines contains a single integer denoting the value of the array at the next position.
//
//            Constraint
//            The length of the array will be 2 or more.
//
//            Output
//            Simply the word 'true' or 'false'.


    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] myArray = new int[n];
    int sumOfTrue = 0;

        for(int i=0; i < n; i++){
            myArray[i] = scanner.nextInt();
        }
    
        for(int y = 0; y< n-1; y++){
           if (myArray[y] >= myArray[y+1] ){
               sumOfTrue = sumOfTrue + 1;
           }
        }
        
        if(sumOfTrue == n-1){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    
    }
}

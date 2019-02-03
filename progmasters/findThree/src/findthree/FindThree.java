/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthree;

import java.util.Scanner; 



/**
 *
 * @author virag
 */
public class FindThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Task
            Given an array of ints, print 'false' if the value '3' appears 
            in the array exactly 3 times and no '3's are next to each other. Otherwise print 'true'.

            Input Format
            The first line contains a single integer, n, denoting the size of the array. 
            Each line i of the n subsequent lines contains a single integer denoting the value of the array at position i.

            Output Format
            Simply the word 'true' or 'false'.
        */
        
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]  myArray = new int[n];
        int sumOfThree = 0;
        
        for (int i = 0; i<n; i++){
            myArray[i] = scanner.nextInt();
        }
        
        if (myArray[0] == 3 && myArray[0 + 1] != 3){
            sumOfThree = sumOfThree + 1;
        }
        
        for(int y = 1; y < myArray.length-1; y++){ 
            if (myArray[y] == 3 && myArray[y + 1] != 3 && myArray[y - 1] != 3){
                sumOfThree = sumOfThree + 1;
            }
        }
          
        if (myArray[n-1] == 3 && myArray[n - 2] != 3){
            sumOfThree = sumOfThree + 1;
        }
          
        
        if (sumOfThree == 3){
            System.out.print("false");
        }else{
            System.out.print("true");
        }     
    }
}

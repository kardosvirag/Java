/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirror;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Mirror {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];


        for(int i=0; i < n; i++){
            myArray[i] = scanner.nextInt();
        }
    
        for (int x = 0; x < myArray.length; x++) {
        for (int j = x+1; j < myArray.length; j++) 
        {
            if(myArray[x] == myArray[j])
            {
                System.out.println("Duplicate Element : "+myArray[x]);
            }
        }
    }
       
        
       

    }
    
}

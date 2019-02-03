/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_07_negyzetszamok;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Negyzetszamok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        int i = 1;
     
        System.out.print("Az első hány négyzetszámot írjam ki? ");
        int szam = sc.nextInt();
     
        while (i <= szam){
         System.out.print((int)Math.pow(i, 2) + " "); 
         i++;
         
     }
       
    }
    
}

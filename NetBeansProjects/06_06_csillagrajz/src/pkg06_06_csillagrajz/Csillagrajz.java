/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_06_csillagrajz;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Csillagrajz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int proba = 0;

        System.out.print("Hány csillagot rajzoljak? ");
        int szam = sc.nextInt();
        
       while (proba < szam ){
        System.out.print("*"); 
         proba++;
            }
}
}


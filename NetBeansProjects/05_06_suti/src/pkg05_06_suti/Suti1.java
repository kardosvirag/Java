/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_06_suti;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Suti1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hány deka liszt kell a sütihez? ");
        int lisztkell = sc.nextInt();
        
         System.out.print("Hány tojás kell a sütihez? ");
        int tojaskell = sc.nextInt();
        
         System.out.print("Hány deka cukor kell a sütihez? ");
        int cukorkell = sc.nextInt();
        
         System.out.print("Hány deka liszt van otthon? ");
        int lisztvan = sc.nextInt();
        
         System.out.print("Hány tojás van otthon? ");
        int tojasvan = sc.nextInt();
        
        System.out.print("Hány deka cukor van otthon? ");
        int cukorvan = sc.nextInt();
        
        double liszt = (double) lisztvan / (double) lisztkell;
        double tojas = (double) tojasvan / (double) tojaskell;
        double cukor = (double) cukorvan / (double) cukorkell;
        
        if (liszt<tojas && liszt<cukor){
            System.out.println("A megadott mennyiségekből " + liszt +" adag készülhet el.");
        }
        else if (tojas<liszt && tojas < cukor){
            System.out.println("A megadott mennyiségekből " + tojas +" adag készülhet el.");
        }
        else{
            System.out.println("A megadott mennyiségekből " + cukor +" adag készülhet el.");
        }
    }
    
}

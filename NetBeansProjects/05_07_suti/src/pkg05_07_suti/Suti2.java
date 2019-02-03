/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_07_suti;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Suti2 {

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
        
         liszt = Math.ceil(liszt);
         tojas = Math.ceil(tojas);   
         cukor = Math.ceil(cukor);
         
      
        
       if (liszt>tojas && liszt>cukor){
            System.out.println("Összesen " + (int) liszt + " adagot készítünk.");
            System.out.println("Venni kell még " + (int) (liszt*lisztkell -lisztvan) + " deka lisztet, " + (int) (liszt * tojaskell - tojasvan) + " db. tojást és "+ (int) (liszt * cukorkell - cukorvan) + " deka cukrot.");
        }
        else if (tojas>liszt && tojas>cukor){
            System.out.println("Összesen " + (int) tojas + " adagot készítünk.");
            System.out.println("Venni kell még " + (int) (tojas*lisztkell -lisztvan) + " deka lisztet, " + (int) (tojas * tojaskell - tojasvan) + " db. tojást és "+ (int) (tojas * cukorkell - cukorvan) + " deka cukrot.");
        }
        else{
            System.out.println("Összesen " + (int) cukor + " adagot készítünk.");
            System.out.println("Venni kell még " + (int) (cukor*lisztkell -lisztvan) + " deka lisztet, " + (int) (cukor * tojaskell - tojasvan) + " db. tojást és "+ (int) (cukor * cukorkell - cukorvan) + " deka cukrot.");
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anasztazia;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Anasztazia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String nev = "";
       // String yourname = ("Virag");
        int db = 0;
       
        System.out.println("Kerem a neveket.");
                
        for (int i = 0; i < 3; i++) {
             nev = sc.next();
             
            if (nev != "Anastasius") {
                System.out.println("gewonnen");
            }
        }
    /* while (nev != ("Anastasia")) {
             nev = sc.next();
             db+=db;
        }
        
        System.out.println(db +"db nev van.");*/
    }
    
}

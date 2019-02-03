/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_01_csempe;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Csempe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         System.out.print("A szoba magassága: ");
           double magassag = sc.nextDouble();
         
        System.out.print("A szoba szélessége: ");
           double szelesseg = sc.nextDouble();
        
        System.out.print("A szoba hosszúsága: ");
            double hosszusag =sc.nextDouble();
            
            magassag = magassag*100;
            szelesseg = szelesseg*100;
            hosszusag = hosszusag*100;
          
          double csempemeret = 25;
          double csempeszam1 = magassag/csempemeret;
          double csempeszam2 = szelesseg/csempemeret;
          double csempeszam3 = hosszusag/csempemeret;
          
         double csempeszam = 2 * ((Math.ceil(csempeszam1))*(Math.ceil(csempeszam2))+(Math.ceil(csempeszam1))* (Math.ceil(csempeszam3)));
            
         System.out.println("A szoba kicsempézéséhez " + (int) csempeszam + " csempe kell.");
            
          
       //     A szoba kicsempézéséhez 378 csempe kell.
            
    }
    
}

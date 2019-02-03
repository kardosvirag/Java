/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_05_szamolo;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Szamolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.) összeadás");       
        System.out.println("2.) kivonás");
        System.out.println("3.) szorzás");
        System.out.println("4.) osztás");
         
       
        System.out.print("Melyik műveletet hajtsam végre? ");
        int szam = sc.nextInt();
        
        int egyikszam = 0;
        int masikszam = 0;
        
        if (szam >= 1 && szam <= 4){
           System.out.print("Kérem az egyik számot: ");
           egyikszam = sc.nextInt();
        
           System.out.print("Kérem a másik számot: ");
           masikszam = sc.nextInt();
        }
        
        int osszeadas = egyikszam + masikszam;
        int kivonas = egyikszam - masikszam;
        int szorzas = egyikszam * masikszam;
        double osztas = (double)egyikszam / (double) masikszam;
        
       
        switch (szam){
            case 1: System.out.println("Az eredmény: " + osszeadas);
            break;
            case 2: System.out.println("Az eredmény: " + kivonas);
            break;
            case 3: System.out.println("Az eredmény: " + szorzas);
            break;
            case 4: 
                        if (masikszam == 0){
                            System.out.println("Nullával való osztás.");
                             }
                        else {
                            System.out.println("Az eredmény: " + osztas);
                        }
            break;
            default: System.out.println("Hibás művelet.");
            break;
        }
     
      
  
       
    }
    
}

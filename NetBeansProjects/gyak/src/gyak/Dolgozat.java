/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Dolgozat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a dolgozat max. pontszámát:");
        double maxpontszam = sc.nextDouble();
        
        System.out.println("Kérem a dolgozat aktuális pontszámát:");
        double aktualispontszam = sc.nextDouble();
        
        double szazalek = 100 / maxpontszam * aktualispontszam;
        System.out.println("A dolgozat " + szazalek + " % lett.");
       
        
     
    }
    
}

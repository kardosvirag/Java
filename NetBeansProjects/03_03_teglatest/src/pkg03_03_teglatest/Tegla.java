/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_03_teglatest;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Tegla {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Téglatest térfogat- és felszínszámoló");
        
        System.out.print("a=");
        double a = sc.nextDouble();
        
        System.out.print("b=");
        double b = sc.nextDouble();
        
        System.out.print("c=");
        double c = sc.nextDouble();
        
   
    
         double felszin = 2*(a*b + b*c + a*c);
         System.out.print("Felszín: ");
         System.out.printf("%.1f%n", felszin);
         
         
         double terfogat = a*b*c;
         System.out.print("Térfogat: ");
         System.out.printf("%.1f", terfogat);
         
        
        
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_01_haromszogkerulet;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class HaromszogKerulet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Kérem a háromszög \"a\" oldalát: ");
        double a = sc.nextDouble();
        
        System.out.print("Kérem a háromszög \"b\" oldalát: ");
        double b = sc.nextDouble();
         
        System.out.print("Kérem a háromszög \"c\" oldalát: ");
        double c = sc.nextDouble();
         
        double kerulet = kerulet(a,b,c);
        
        System.out.println("A háromszög kerülete: " + kerulet);
        
    }
    public static double kerulet (double a, double b, double c ) {
        double kerulet = a+b+c;
        return kerulet;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_02_fahrenheit;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kérem a Celsius-fok értéket: ");
        double celsiusfok = sc.nextDouble();
        
        double fahrenheit = (9 * celsiusfok) / 5 + 32;
      
        
        System.out.print("Fahrenheitben: ");
        System.out.printf("%.1f" ,fahrenheit);
        System.out.print(" fok.");
        
    }
    
}

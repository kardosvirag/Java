/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_04_szamatlag;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Szamatlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        double osszeg = 0;
        int probalkozas = 0;
        double atlag = 1;
      
         System.out.println("Kérem a számokat (-1-re kilép):");
          double szam = sc.nextDouble();
        
        while (szam != -1 ) {
            osszeg += szam;
            szam = sc.nextDouble();
            probalkozas++;
        }
            atlag = osszeg/ probalkozas;
            System.out.print("Az átlag: " + "%.2f" + ".");
          
            /*System.out.print("Az átlag: ");
            System.out.printf("%.2f",atlag);
            System.out.print(".");*/
           
    }
    
}

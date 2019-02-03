/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_03_szamosszeg;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Szamosszeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int osszeg = 0;
       System.out.println("Kérem a számokat (-1-re kilép):");
       int szam = sc.nextInt();
       
     while ( szam != -1) {
         osszeg += szam;
         szam = sc.nextInt();
     }
      System.out.println("Az összeg: " + osszeg  + ".");
    }
       
    }
      
        
        
        
        
      
       
        

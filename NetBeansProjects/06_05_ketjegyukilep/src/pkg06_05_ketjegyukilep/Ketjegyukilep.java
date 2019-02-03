/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_05_ketjegyukilep;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Ketjegyukilep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Írj be számokat! Ha kétjegyű, kilép!");
        int szam = sc.nextInt();
        
        while (!(szam > 9 && szam < 100) && !( szam < -9 && szam > -100)){
             System.out.println("jó szám");
             szam = sc.nextInt();
             
        }
    }
    
}

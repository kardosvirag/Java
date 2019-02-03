/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_04_natlag;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Natlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        double atlag = 0;
        
        System.out.println("Átlagszámoló.");
        System.out.print("Hány számot ad be? n=");
        int szam = sc.nextInt();
       
        
        if ( szam <= 0){
            System.out.println("Az \"n\" értékének pozitívnak kell lennie.");
        }else{
            System.out.println("Kérem a számokat!");
        for (int i = 1; i <= szam; i++) {
            System.out.print(i + ". szám: ");
            int nszam = sc.nextInt();
            atlag += nszam;  
        }
        atlag /= szam; 
        System.out.println("A beírt számok átlaga " + atlag + ".");
    }
    }
    
}

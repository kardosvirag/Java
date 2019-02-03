/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_03_nszorzat;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Nszorzat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int szorzat = 1;
        
        System.out.println("Szorzatszámoló.");
        System.out.println("Hány számot ad be?");
        int szam = sc.nextInt();
        if ( szam <= 0){
            System.out.println("Az 'n' értékének pozitívnak kell lennie.");
        }else{
        
        for (int i = 1; i <= szam; i++) {
            System.out.print(i + ". szám: ");
            int nszam = sc.nextInt();
            szorzat *= nszam;
        }
        System.out.println("A beírt számok szorzata " + szorzat + ".");
    }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_04_telefondij;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class TelefonDij {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Meddig tartott a hívás?");
        System.out.print("óra: ");
        int ora = sc.nextInt();
        
        System.out.print("perc: ");
        int perc = sc.nextInt();
        
        System.out.print("másodperc: ");
        int masodperc = sc.nextInt();
        
        System.out.print("Mennyi a percdíj? ");
        int percdij = sc.nextInt();
        
        int hivasDij = hivasDij (ora, perc, masodperc, percdij);
        
        System.out.print("A hívás díja: " + hivasDij + " Ft volt.");
        
    }

    private static int hivasDij(int ora, int perc, int masodperc, int percdij) {
       
        ora = ora * 60;
        
        if (masodperc > 0) {
            masodperc = 1;  
        }
        
       int hivasDij = (ora+perc+masodperc) * percdij;
       return hivasDij;
    }
    
    
    
}

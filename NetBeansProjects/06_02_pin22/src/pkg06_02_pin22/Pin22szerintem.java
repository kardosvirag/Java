/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_02_pin22;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Pin22szerintem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
          
          int helyeskod = 5936;
          int probalkozas = 1;
         
         
         while (probalkozas <= 3){
             System.out.print("PIN: ");
                int kod = sc.nextInt();
             
                   if (kod != helyeskod){
                        System.out.println("Hibás PIN.");
                       if (probalkozas == 3){
                           System.out.println("Nincs több próbálkozási lehetőség!");
                       }
                   }
                   else {
                       System.out.println("Titkos információ");
                       break;
                   }
                    probalkozas++;
   
         
       }
    }
    
}

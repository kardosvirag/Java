/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_02_pin2;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Pin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
       int helyeskod = 5936;
       int probalkozas = 0;
      
       System.out.print("PIN: ");
       int kod = sc.nextInt();
       probalkozas++;
      
      while (kod != helyeskod && probalkozas < 3){
          
        System.out.println("Hibás PIN.");
        System.out.print("PIN: ");
         kod = sc.nextInt();
          probalkozas++;
                   
                }
             
      if (kod == helyeskod){
         System.out.println("Titkos információ");
                }
      else {
                 System.out.println("Hibás PIN.");
                 System.out.println("Nincs több próbálkozási lehetőség!");
      
    }
    
}
}
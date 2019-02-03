/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_01_pin1;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Pin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int helyeskod = 5936;
      
      
      System.out.print("PIN: ");
      int kod = sc.nextInt();
      
      while (kod != helyeskod){
         System.out.println("Hibás PIN.");
         System.out.print("PIN: ");
          kod = sc.nextInt();
                }
         System.out.println("Titkos információ");
                    
                }
                
      }
        
        
        
        
    
    


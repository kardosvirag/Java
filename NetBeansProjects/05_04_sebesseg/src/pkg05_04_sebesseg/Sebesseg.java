/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_04_sebesseg;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Sebesseg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hány km/h-val ment? ");
        int sebesseg = sc.nextInt();
        
        if (sebesseg < 51){
            System.out.println("Ön szabályosan hajtott.");
        }
        else if (sebesseg <= 65){
            System.out.println("Az Ön büntetése 0,- Ft.");
        }
        else if (sebesseg <= 75){
         System.out.println("Az Ön büntetése 30000,- Ft.");
        }
        else if (sebesseg <= 85){
            System.out.println("Az Ön büntetése 45000,- Ft.");
        }
         else if (sebesseg <= 95){
            System.out.println("Az Ön büntetése 60000,- Ft.");
        }
         else if (sebesseg <= 105){
            System.out.println("Az Ön büntetése 90000,- Ft.");
        }
         else if (sebesseg <= 115){
            System.out.println("Az Ön büntetése 130000,- Ft.");
        }
         else if (sebesseg <= 125){
            System.out.println("Az Ön büntetése 200000,- Ft.");
        }
       
          else {
            System.out.println("Az Ön büntetése 300000,- Ft.");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_01_palacsinta;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Palacsinta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.print("Mennyi ideig sült a palacsinta? ");
        int ido = sc.nextInt();
        
        if (ido <= 2){
        System.out.print("A palacsinta nyers.");}
        else if (ido>=3 && ido<=4){
         System.out.print("A palacsinta jó.");}
        else {
            System.out.print("A palacsinta égett.");
          
    }
    }
    
}

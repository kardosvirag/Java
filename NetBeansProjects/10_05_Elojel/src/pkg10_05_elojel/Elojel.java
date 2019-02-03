/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_05_elojel;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Elojel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kérem a számot: ");
        int szam = sc.nextInt();
        
        int elojel = elojel (szam);
        if(szam<=0){
            System.out.print("A szám signuma: "+ elojel);
        }
        else{
            System.out.print("A szám signuma: +"+ elojel);
        }
    }
    

    private static int elojel(int szam) {
        
        int elojel;
        
        if  (szam<0){
            elojel = -1;
    }
        else if(szam == 0){
            elojel = 0;
    }
        else {
            elojel = +1;    
                }
        
        return elojel;
    
}
}

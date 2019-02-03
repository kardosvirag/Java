/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_08_kerekit;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Kerekit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kérem az összeget: ");
        int osszeg = sc.nextInt();
        
        int kerekites = kerekit(osszeg);
        
        System.out.println("Kerekítve: " + kerekites);
    }

    private static int kerekit(int osszeg) {
       
        
      int utolsoszamjegy = osszeg % 10;
      int kerekit;
      
        if (utolsoszamjegy >= 0 && utolsoszamjegy <=2) {
           kerekit = osszeg - utolsoszamjegy;
        }
        else if (utolsoszamjegy >=3 && utolsoszamjegy <=7) {
           kerekit = (osszeg - utolsoszamjegy) +5;
        } else {
           kerekit = (osszeg- utolsoszamjegy) + 10;
        }
        
        return kerekit;
    } 
    
}

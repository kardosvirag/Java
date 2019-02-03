
package pkg0gyak;


import java.util.Arrays;
import java.util.Scanner;


public class Gyak1 {

    
    public static void main(String[] args) {
       
   int sor = 2;
   int oszlop = 1;
   int mezo = 2;
   int jatekosegy = 1;
   int jatekosketto=2;
   int üres = 0;
   int[][] lepes = new int [3][3];
   
        System.out.println(helyes(sor, oszlop, mezo));
    }
    
    public static boolean helyes (int sor, int oszlop,int mezo){
        
        
     if (sor < -1 || sor > 3 || oszlop < -1 || oszlop > 3 || mezo != 0)
            return false;
     
        return true; 
    }
    
      public int getMezo(int [][] lepes, int jatekosegy, int jatekosketto, int üres, int sor,int oszlop) {
          
       lepes [sor][oszlop] = 1; 
            if (lepes[sor)][oszlop] == jatekosegy) {
                return jatekosegy;
            } else if (lepes[sor][oszlop] == jatekosketto) {
                return jatekosketto;
            }
        

        return üres;

    }
    
}

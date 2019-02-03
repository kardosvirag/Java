/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_03_penztargep;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Penztargep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int osszeg = 0;
        double atlag = 0;
        int i = 1;
        int maximum = 0;
        double dragabbszazalek = 0;
        int olcsobbotszaz = 0;
        

        System.out.println("Pénztárgép program. Kérem a tételeket, a vége 0.");
        int tetelek = sc.nextInt();

        osszeg += tetelek;
        atlag = (double) osszeg / i;
        maximum = tetelek;

        if (tetelek < 500) {
            ++olcsobbotszaz;
           
        }

        for (i = 2; tetelek != 0; i++) {
            tetelek = sc.nextInt();

            osszeg += tetelek;
            atlag = (double) osszeg / (i - 1);

            if (tetelek > maximum) {
                maximum = tetelek;
            }

            dragabbszazalek = ((double) maximum - atlag) / atlag * 100;

            if (tetelek < 500) {
                ++olcsobbotszaz;
               

            }

        }

        
        System.out.println("Összesen " + osszeg + " Ft.");
        System.out.print("Átlag ");
        System.out.printf("%.2f", atlag);
        System.out.println(" Ft.");
        System.out.println("Legdrágább " + maximum + " Ft.");
        System.out.print("A legdrágább ");
        System.out.printf("%.2f", dragabbszazalek);
        System.out.println("%-kal volt drágább az átlagnál.");

        olcsobbotszaz -= 1;
        System.out.println("Összesen " + olcsobbotszaz + " db. 500 Ft-nál olcsóbb termék volt az áruk közt.");
       
    }

}

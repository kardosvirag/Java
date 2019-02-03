/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_02_tornasz;

import java.util.Scanner;
import static pkg11_02_tornasz.Tornasz.tablaKirajzolas;

/**
 *
 * @author virag
 */
public class Tornasz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] tabla;
        int lepesSzam = 0;
        char eredmeny;
        int[] lepes;
        tabla = tablaInicializalas();
        tabla[0] = 'x'; tabla[1] = 'x'; tabla[2] = 'x'; tabla[3] = 'x'; 
        tabla[4] = ' ';
        tabla[5] = 'o'; tabla[6] = 'o'; tabla[7] = 'o'; tabla[8] = 'o'; 

        do {
            lepesSzamKiirasa(lepesSzam);
            tablaKirajzolas(tabla,lepesSzam);
            lepes = ervenyesLepes(sc, tabla);
            lepesElvegzese(lepes, tabla);
            eredmeny = (char) nyertesVizsgalat(tabla);
            lepesSzam = lepesSzamSzamitasa(lepesSzam);
        } while (eredmeny != 1);
         lepesSzamKiirasa(lepesSzam);
         tablaKirajzolas(tabla,lepesSzam);
         nyertesKiirasa(eredmeny);

    }

    private static char[] tablaInicializalas() {
        return new char [9];
        
    }
    private static void lepesSzamKiirasa(int lepesSzam) {
        
        System.out.println("Lépésszám: " + lepesSzam);
    }
      
    public static void tablaKirajzolas(char[] tabla, int lepesSzam) {
     
    
        System.out.println("------------------");
        System.out.println("|" + tabla[0] + "|" + tabla[1] + "|" + tabla[2] + "|" +tabla[3] + 
                           "|" + tabla[4] + "|"
                               + tabla[5] + "|" + tabla[6] + "|" + tabla[7] + "|" +tabla[8] + "|");
        System.out.println("------------------");
        
    }
    

    public static int[] ervenyesLepes(Scanner sc, char[]tabla) {
        
        System.out.println("Melyik mezővel lépsz? (0-8)");
        int mezovel = sc.nextInt();
        if (mezovel == -1) {
            System.exit(0);
        }
        System.out.println("Melyik mezőre lépsz? (0-8)");
        int mezore = sc.nextByte();
        if (mezore == -1) {
            System.exit(0);
        }

        int igaze = 0; // = 1 igaz , = 2 hamis
       
        if (mezovel < 0 || mezovel > 8 || mezore < 0 || mezore > 8 || tabla[mezore] == 'o' || tabla[mezore] == 'x') {
            igaze = 2;
        } else if (!(Math.abs(mezovel - mezore) == 1 || Math.abs(mezovel - mezore) == 2)) {
            igaze = 2;
        } else if (Math.abs(mezovel - mezore) == 2) {
            int szomszed = (mezovel + mezore) / 2;
            if (tabla[szomszed] != tabla[mezovel]) {
                igaze = 1;
            } else {
                igaze = 2;
            }
        } else {
            igaze = 1;
        }

        while (igaze != 1) {
            System.out.println("Érvénytelen lépés!");
            System.out.println("Melyik mezővel lépsz? (0-8)");
            mezovel = sc.nextInt();
            if (mezovel == -1 || mezore == -1) {
                System.exit(0);
            }
            System.out.println("Melyik mezőre lépsz? (0-8)");
            mezore = sc.nextByte();
            if (mezovel == -1 || mezore == -1) {
                System.exit(0);
            }

            if (mezovel < 0 || mezovel > 8 || mezore < 0 || mezore > 8 || tabla[mezore] == 'o' || tabla[mezore] == 'x') {
                igaze = 2;
            } else if (!(Math.abs(mezovel - mezore) == 1 || Math.abs(mezovel - mezore) == 2)) {
                igaze = 2;
            } else if (Math.abs(mezovel - mezore) == 2) {
                int szomszed = (mezovel + mezore) / 2;
                if (tabla[szomszed] != tabla[mezovel]) {
                    igaze = 1;
                } else {
                    igaze = 2;
                }
            } else {
                igaze = 1;
            }

        }

        int[] lepes = {mezovel, mezore};
        return lepes;

    }
    public static void lepesElvegzese(int[] lepes, char[] tabla) {
      
        int mezorol = 0;
        int mezore = 0;
        
        for (int i = 0; i < lepes.length-1; i++) {
            mezorol = lepes[i];
        }
        for (int i = 1; i < lepes.length; i++) {
            mezore = lepes[i];
        }
        
        char csere = tabla[mezorol];
        tabla[mezorol] = tabla[mezore];
        tabla[mezore] = csere;
        
    }

    public static int nyertesVizsgalat(char[] tabla) {
        int eredmeny;
        
        if (tabla[0] == 'o' && tabla[1] == 'o' && tabla[2] == 'o' && tabla[3] == 'o' && tabla[4] == ' ' && 
            tabla[5] == 'x' && tabla[6] == 'x' && tabla[7] == 'x' && tabla[8] == 'x'){
            eredmeny = 1;
        }else{
            eredmeny = 0;
        }
        return eredmeny;
    }

    public static void nyertesKiirasa(int eredmeny) {
        
        if(eredmeny == 1){
        System.out.println("Gratulálok, vége a játéknak!");
        }
    }

    public static int lepesSzamSzamitasa(int lepesSzam) {
        
       lepesSzam = lepesSzam + 1;
      
        return lepesSzam;
    }
    

}

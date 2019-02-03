/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_01_amoba;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Amoba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] tabla; 
        int aktualisJatekos = 1; 
        int eredmeny; 
        int[] lepes; 
        tabla = tablaInicializalas(); 
        Scanner sc = new Scanner(System.in);

        do {
            tabalaKirajzolas(tabla);
            lepes = ervenyesLepes(sc, tabla, aktualisJatekos);
            lepesElvegzes(tabla, lepes, aktualisJatekos);
            eredmeny = nyertesVizsgalat(tabla, aktualisJatekos);
            aktualisJatekos = kovetkezoJatekos(aktualisJatekos);
        } while (eredmeny == 0);
        tabalaKirajzolas(tabla);
        nyertesKiiras(eredmeny);
    }

    public static int[][] tablaInicializalas() {
        return new int[3][3];
    }

    public static void tabalaKirajzolas(int[][] tabla) {

        System.out.println("+-+-+-+");
        System.out.println("|" + tabla[0][0] + "|" + tabla[0][1] + "|" + tabla[0][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + tabla[1][0] + "|" + tabla[1][1] + "|" + tabla[1][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + tabla[2][0] + "|" + tabla[2][1] + "|" + tabla[2][2] + "|");
        System.out.println("+-+-+-+");
    }

    public static int[] ervenyesLepes(Scanner sc, int[][] tabla, int aktualisJatekos) {

        System.out.println("A(z) " + aktualisJatekos + "-es játékos következik.");
        System.out.println("Melyik sor?");
        int sor = sc.nextInt();
        System.out.println("Melyik oszlop?");
        int oszlop = sc.nextInt();

        //feltetel, hogy a täblän belül legyen a lepes.
        while (oszlop < 0 || sor < 0 || oszlop > 2 || sor > 2) {
            System.out.println("Hibás mezőszám!");
            System.out.println("Melyik sor?");
            sor = sc.nextInt();
            System.out.println("Melyik oszlop?");
            oszlop = sc.nextInt();
        }

        //feltetel, hogy a mezo üres legyen
        while (tabla[sor][oszlop] == 1 || tabla[sor][oszlop] == 2) {
            System.out.println("Melyik sor?");
            sor = sc.nextInt();
            System.out.println("Melyik oszlop?");
            oszlop = sc.nextInt();
        }

        int[] lepes = {sor, oszlop};

        return lepes;

    }

    public static void lepesElvegzes(int[][] tabla, int[] lepes, int aktualisJatekos) {
        // szam felhelyezese

        // tabla[lepes[0][lepes[1] = aktualisJatekos;
        
        int sor = 0;
        int oszlop = 0;

        for (int i = 0; i < lepes.length - 1; i++) {
            sor = lepes[i];
        }

        for (int i = 1; i < lepes.length; i++) {
            oszlop = lepes[i];
        }

        tabla[sor][oszlop] = aktualisJatekos;

    }

    public static int nyertesVizsgalat(int[][] tabla, int aktualisJatekos) {

        int eredmeny;

        if ((tabla[0][0] == aktualisJatekos && tabla[0][1] == aktualisJatekos && tabla[0][2] == aktualisJatekos)
                || (tabla[1][0] == aktualisJatekos && tabla[1][1] == aktualisJatekos && tabla[1][2] == aktualisJatekos)
                || (tabla[2][0] == aktualisJatekos && tabla[2][1] == aktualisJatekos && tabla[2][2] == aktualisJatekos)
                || (tabla[0][0] == aktualisJatekos && tabla[1][0] == aktualisJatekos && tabla[2][0] == aktualisJatekos)
                || (tabla[0][1] == aktualisJatekos && tabla[1][1] == aktualisJatekos && tabla[2][1] == aktualisJatekos)
                || (tabla[0][2] == aktualisJatekos && tabla[1][2] == aktualisJatekos && tabla[2][2] == aktualisJatekos)
                || (tabla[0][0] == aktualisJatekos && tabla[1][1] == aktualisJatekos && tabla[2][2] == aktualisJatekos)
                || (tabla[0][2] == aktualisJatekos && tabla[1][1] == aktualisJatekos && tabla[2][0] == aktualisJatekos)) {

            eredmeny = aktualisJatekos; //nyert

        } else if (tabla[0][0] != 0 && tabla[0][1] != 0 && tabla[0][2] != 0
                && tabla[1][0] != 0 && tabla[1][1] != 0 && tabla[1][2] != 0
                && tabla[2][0] != 0 && tabla[2][1] != 0 && tabla[2][2] != 0) {

            eredmeny = 3;              //döntetlen

        } else {
            eredmeny = 0;            //megy tovabb a jatek
        }

        return eredmeny;
    }

    private static int kovetkezoJatekos(int aktualisJatekos) {

        if (aktualisJatekos == 1) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void nyertesKiiras(int eredmeny) {

        if (eredmeny == 1) {
            System.out.print("Az 1-es játékos győzött.");
        } else if (eredmeny == 2) {
            System.out.print("A 2-es játékos győzött.");
        } else {
            System.out.print("Döntetlen!");
        }
    }

}

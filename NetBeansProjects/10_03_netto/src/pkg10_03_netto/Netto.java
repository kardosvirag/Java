/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_03_netto;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Netto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a bruttó árat: ");
        double bruttoOsszeg = sc.nextDouble();

        System.out.print("Kérem az ÁFA-kulcsot: ");
        int afaKulcsSzazalek = sc.nextInt();

        double netto = afaNetto(bruttoOsszeg, afaKulcsSzazalek);

        System.out.print("Nettó ár: ");
        System.out.printf("%.2f",netto);

    }

    private static double afaNetto(double bruttoOsszeg, int afaKulcsSzazalek) {
       
        double afaNetto =  bruttoOsszeg / ((double) afaKulcsSzazalek / 100 + 1) ;
        return afaNetto;
    }

}

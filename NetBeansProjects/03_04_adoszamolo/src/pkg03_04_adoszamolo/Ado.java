/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_04_adoszamolo;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Ado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Bevétel: ");
        int bevetel = sc.nextInt();
        
        System.out.print("Kiadás: ");
        int kiadas = sc.nextInt();
        
        int iparuzesiado = bevetel / 100 * 2; // a bevetel 2%-a
        System.out.println("Iparűzési adó: " + iparuzesiado + " Ft");
        
        int nyereseg = bevetel - kiadas; //az adózás előtti nyereség 25%-os ÁFÁ-t tartalmaz (a nyereség 20%-a az ÁFA)
        System.out.println("Nyereség: " + nyereseg + " Ft");
         
        int afa = nyereseg / 100 * 20; //Az ÁFA a nyereség (300) 20%-a: 60
        System.out.println("ÁFA: " + afa + " Ft");
        
        int nettonyereseg = nyereseg - afa; //Nettó nyereség: nyereség - ÁFA (300-60 = 240)
        System.out.println("Nettó nyereség: " + nettonyereseg + " Ft");
        
        int tarsasagiado = nettonyereseg * 15 /100; //Társasági adó a nettó nyereség (240) 15%-a: 36
        System.out.println("Társasági adó: " + tarsasagiado + " Ft");
        
    }
    
}

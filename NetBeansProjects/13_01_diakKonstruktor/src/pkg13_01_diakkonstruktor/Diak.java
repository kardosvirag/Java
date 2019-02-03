
package pkg13_01_diakkonstruktor;

import java.util.Scanner;

public class Diak {
    
    private String nev;
    private int szuletesiEv;
    private double atlag;

    
    public void kiir() {
        System.out.println(nev + " (" + szuletesiEv + "; " + atlag + ")");
    }

    public void beker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a diák nevét!");
        nev = sc.nextLine();
        System.out.println("Kérem a diák születési évét!");
        szuletesiEv = sc.nextInt();
        System.out.println("Kérem a diák átlagát!");
        atlag = sc.nextDouble();
    }
    
     public Diak (String nev, int szuletesiEv, double atlag){
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.atlag = atlag;
    }
     
    public String getNev (){
        return nev;
    }
    
    public void setNev(String nev){
        this.nev = nev;
    }
    
    public int getSzuletesiEv(){
        return szuletesiEv;
    }
    
    public void setSzuletesiEv (int szuletesiEv){
        this.szuletesiEv = szuletesiEv;
    }
    
    public double getAtlag (){
        return atlag;
    }
    
    public void setAtlag (double atlag){
        this.atlag = atlag;
    }
}

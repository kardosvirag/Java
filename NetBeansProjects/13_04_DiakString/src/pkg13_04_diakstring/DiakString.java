
package pkg13_04_diakstring;

import java.util.Scanner;

public class DiakString {

    private String nev;
    private int szuletesiEv;
    private double atlag;

    public DiakString(String getVezetekNev, String[] getKeresztNevek, int szuletesiEv, double atlag) {

        String keresztNev = "";
        for (String keresztNevek : getKeresztNevek) {
            keresztNev += " " + keresztNevek;
        }
        
        this.nev = getVezetekNev + keresztNev;
        this.szuletesiEv = szuletesiEv;
        this.atlag = atlag;
    }

    public String getVezetekNev() {
        return nev.substring(0, nev.indexOf(" "));
    }

    public String[] getKeresztNevek() {
        String ujNev = nev.substring(nev.indexOf(" ") + 1);
        return ujNev.split(" ");
    }

    public String getNev() {
        return this.nev;
    }

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

    public DiakString(String nev, int szuletesiEv, double atlag) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.atlag = atlag;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public void setSzuletesiEv(int szuletesiEv) {
        this.szuletesiEv = szuletesiEv;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

}


package pkg13_04_diakstring;


public class Teszt {

  
    public static void main(String[] args) {
        DiakString jozsi = new DiakString("Nagy József Péter", 1999, 4.5);
        System.out.println(jozsi.getVezetekNev());
        for (String nev : jozsi.getKeresztNevek()) {
            System.out.println(nev);
        }
        System.out.println(jozsi.getNev());
        
        
        
        String[] ker = {"András", "Leopold", "Jocika"};
        DiakString feri = new DiakString("Kovács", ker, 2000, 4.99);
        System.out.println(feri.getNev());
        System.out.println(feri.getVezetekNev());
        
        for (String nev: feri.getKeresztNevek()){
            System.out.println(nev);
        }
        String[] pistiker = {"Janos", "Bela"};
        DiakString pisti = new DiakString("Nagy", pistiker, 2000, 6.2);
        
            System.out.println(pisti.getNev());
            System.out.println(pisti.getVezetekNev());
        
    }
}

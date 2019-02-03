
package pkg12_04_idopont;


public class Teszt {

    
    public static void main(String[] args) {
        
        Idopont ip = new Idopont();
        
        ip.ora = 23;
        ip.perc = 58;
        ip.masodperc = 50;
        
        ip.kiir();
        ip.novel(5);
        ip.kiir();
        ip.novel(5);
        ip.kiir();
        ip.novel(65);
        ip.kiir();
        ip.novel(65);
        ip.kiir();
        ip.novel(18000);
        ip.kiir();
    }
    
}

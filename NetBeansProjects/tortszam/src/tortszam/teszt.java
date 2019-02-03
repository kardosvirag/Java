
package tortszam;

public class teszt {

    public static void main(String[] args) {
       
     Tortszam tort = new Tortszam ( 4,0);
     Tortszam reci = tort.reciprok();
     if (reci == null){
         System.out.println("nem sikerült a reciprokkepzes");
     }else{
         System.out.println(tort.getnevezo());
     }
     
    
    /**    egy.kiir();
        System.out.println(egy.ertek());
        ketto.kiir();
        System.out.println(ketto.ertek());**/
        
        
    }
    
}

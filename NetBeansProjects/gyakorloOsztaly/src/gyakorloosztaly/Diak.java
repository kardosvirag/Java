
package gyakorloosztaly;

public class Diak {
    
    String nev;
    public static int ERETTSEGI_ELETKOR;
    
    public Diak ( String nev){
        this.nev = nev;
           
    }
    
    public void kiir (){
        System.out.println("valami");
    }
    
     public static void erettsegi(int erettsegieredmeny){
         ERETTSEGI_ELETKOR = erettsegieredmeny;
         
     }
    
}


package gyakorloosztaly;


public class GyakorloOsztalyteszt {

    
    public static void main(String[] args) {
        Diak jozsi = new Diak ( "Kovacs Jozsi");
        int erettsegieredmeny = 2;
        
        System.out.println(jozsi.ERETTSEGI_ELETKOR);
        jozsi.ERETTSEGI_ELETKOR = 18;
        System.out.println(jozsi.ERETTSEGI_ELETKOR);
        System.out.println(Diak.erettsegi());
    }
    
}

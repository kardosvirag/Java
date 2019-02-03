
package gyake;

import java.util.Arrays;
import java.util.Scanner;


public class Gyake {

    
    public static void main(String[] args) {
        
        String[] tlds = {null};
        String email = "a@b.asdacom";
        String domain = "com";
        
        int k = 0;
        
                for (int i = 0; i < tlds.length; i++) {
                if( tlds[i] == ""){
                    k = 1;
                }
            }
              if ( k == 1)  {
            System.out.println("false");
        }
        
        
              
              
         
       // System.out.println(email.lastIndexOf("."));
        //System.out.println(email.substring(email.lastIndexOf(".")+1));
        
        //System.out.println(email.endsWith(domain));
       
      /** for (int i = 0; i < tlds.length; i++) {
            if (email.endsWith("." + tlds[i]) == true){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
       }**/
       
       
        
    }
}

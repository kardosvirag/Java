
package pkg13_05_stringutils;


public class StringUtils {
    
    public static String reverse (String source){
        if (source == null){
        return null;
    }
    return new StringBuffer(source).reverse().toString();
    
    }
    
    public static String reverseWords (String source){ 
        if (source == null){
        return null;
        }
        String[] szavak = source.split(" ");
        String forditott = "";
        
        for (int i = szavak.length-1; i >= 0; i--) {
           if (i > 0){
               forditott += szavak[i] + " ";
           }else{
               forditott += szavak[i];
           }
        }
       
        
       return forditott;
    }
    
    public static boolean isValidEmail(String email){
        if (email == null){
            return false;
        }
        return email.contains(".") && email.contains("@");
        
    }
    
    public static boolean isValidGmail (String email){
        if (email == null){
            return false;
        }
        return email.endsWith("@gmail.com");
    }
    
    public static boolean isValidEmail (String email, String[] tlds){
       
       if (email == null || tlds == null || tlds.length == 0) {

           return false;

        }
        if (!(email.contains("."))) {
            return false;
        }
        if (!(email.contains("@"))) {
            return false;
        }
        

        for (int i = 0; i < tlds.length; i++) {
            if (email.endsWith("." + tlds[i]) == true) {
                return true;
            }
        }
        
        return false;
  
    }
    
}


package pkg13_05_stringutils;


public class StringUtilsTeszt {

    
    public static void main(String[] args) {
      System.out.println(StringUtils.reverse("megfordit")); // tidrofgem
System.out.println(StringUtils.reverseWords("szo meg fordit")); // fordit meg szo
System.out.println(StringUtils.isValidEmail("a@b.c")); // true
System.out.println(StringUtils.isValidEmail("gaborgabor@.hu")); // true
System.out.println(StringUtils.isValidEmail("gabor@gabor")); // false
System.out.println(StringUtils.isValidEmail("a.b.c")); // false
System.out.println(StringUtils.isValidEmail(null)); // false
System.out.println(StringUtils.isValidGmail("a@gmail.com")); // true
System.out.println(StringUtils.isValidGmail("a@freemail.hu")); // false
System.out.println(StringUtils.isValidGmail(null)); // false
String[] tlds = {"hu", "com", "edu", "at", "au"};
System.out.println(StringUtils.isValidEmail("a@b.c", tlds)); // false
System.out.println(StringUtils.isValidEmail("a@b.com", tlds)); // true
System.out.println(StringUtils.isValidEmail("a.b.c", tlds)); // false 
System.out.println(StringUtils.isValidEmail("a.b.c", null)); // false
String[] ures = {};
System.out.println(StringUtils.isValidEmail("a.b.c", ures)); // false
System.out.println(StringUtils.isValidEmail("gabor.gabor@com", tlds)); // false
    }
    
}


package pkg13_02_teglatestkonstruktor;


public class teszt {
    
  public static void main(String[] args) {
   
      Teglatest kocka = new Teglatest(10);
      System.out.println(kocka.terfogat());
      Teglatest negyzetesOszlop = new Teglatest(10, 20);
      System.out.println(negyzetesOszlop.terfogat());
      Teglatest tegla = new Teglatest(10, 20, 30);
      System.out.println(tegla.terfogat());
      System.out.println(tegla.getA()); // 10.0
      System.out.println(tegla.getB()); // 20.0
      System.out.println(tegla.getC()); // 30.0
      
}
}
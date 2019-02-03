
package pkg12_03_homero;


public class Teszt {

    
    public static void main(String[] args) {
       
        Homero ho = new Homero();
        ho.setCelsius(42);
        System.out.println(ho.getFahrenheit());
        System.out.println(ho.getCelsius());
        ho.setFahrenheit(212);
        System.out.println(ho.getFahrenheit());
        System.out.println(ho.getCelsius());

    }

}

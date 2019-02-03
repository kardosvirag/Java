
package pkg13_06_homero;


public class Homero {

    private double celsius;
    public static double FAGYASPONT = 0;
    public static double FORRASPONT = 100;

    public static Homero fagypont() {
          return new Homero(FAGYASPONT);
    }
      
    public static Homero forraspont() {
         return new Homero (FORRASPONT);
    }
    
    public Homero(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double ho) {
        celsius = ((ho - 32) * 5) / 9;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return (celsius * 9) / 5 + 32;
    }
    
}

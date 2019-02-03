
package pkg12_03_homero;

public class Homero {

    double celsius;
    
    

    public void setCelsius(double ho) {
        celsius = ho;
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
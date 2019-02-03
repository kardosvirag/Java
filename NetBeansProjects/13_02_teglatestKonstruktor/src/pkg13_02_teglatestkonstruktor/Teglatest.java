
package pkg13_02_teglatestkonstruktor;


public class Teglatest {

    private double a;
    private double b;
    private double c;

    public Teglatest(double a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public Teglatest(double a, double b) {
        this.a = a;
        this.b = a;
        this.c = b;
    }

    public Teglatest(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double terfogat() {
       /** if (b == 0 && c == 0){
            this.b = a;
            this.c = a;
        } else if (c == 0){
            this.c = a;
        }**/
        double terfogat = a * b * c;
        return terfogat;
    }

    public double felszin() {
        double felszin = 2 * (a * b + a * c + b * c);
        return felszin;
    }

}

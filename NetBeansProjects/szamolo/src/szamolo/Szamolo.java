
package szamolo;


public class Szamolo {

    public int operation(int egyik, int masik, String muvjel) throws SzamoloException {
        switch (muvjel) {
            case "+":
            case "plus":
                return plus(egyik, masik);
            case "-":
            case "minus":
                return minus(egyik, masik);
            case "/":
            case "div":
                return div(egyik, masik);
            case "*":
            case "mul":
                return mul(egyik, masik);

            default:
                throw new SzamoloException("muvjel nem ertelmezheto");
        }
    }

    public int plus(int egyik, int masik) {
        return egyik + masik;
    }

    public int minus(int egyik, int masik) {
        return egyik - masik;
    }

    public int mul(int egyik, int masik) {
        return egyik * masik;
    }

    public int div(int egyik, int masik) throws SzamoloException {
        if (masik == 0) {
            throw new SzamoloException("nullaval valo osztas");
        } else {
            return egyik / masik;
        }
    }

}

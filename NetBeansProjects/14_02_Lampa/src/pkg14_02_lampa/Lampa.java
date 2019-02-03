
package pkg14_02_lampa;

public class Lampa {

    private boolean piros = true;
    private boolean sarga = false;
    private boolean zold = false;

    public void kovetkezo() {
        if (piros) {
            sarga = !sarga;
        }
        if (piros && sarga) {
            piros = false;
            sarga = false;
            zold = !zold;
        }
        if (zold) {
            zold = !zold;
            sarga = !sarga;
        }
        if (sarga) {
            piros = true;
            sarga = false;
        }
    }

    public boolean isPiros() {
        return piros;
    }

    public boolean isSarga() {
        return sarga;
    }

    public boolean isZold() {
        return zold;
    }

}

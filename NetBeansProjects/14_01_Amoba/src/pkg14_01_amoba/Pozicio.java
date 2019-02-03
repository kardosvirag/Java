
package pkg14_01_amoba;


public class Pozicio {
    
    private int sor;
    private int oszlop;
    
    public Pozicio(int sor, int oszlop) {
        this.sor = sor;
        this.oszlop = oszlop;        
    }

   

    public void setSor(int sor){
        this.sor = sor;
    }
    
    public int getSor() { 
        return this.sor;
    }

    public void setOszlop(int oszlop){
        this.oszlop = oszlop;
    }
    
    public int getOszlop() {
        return this.oszlop;
    }
    
    
}

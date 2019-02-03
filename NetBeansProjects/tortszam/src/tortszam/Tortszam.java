
package tortszam;


public class Tortszam {
    
    private int szamlalo;
    private int nevezo;

    
       
   public Tortszam (int szamlalo, int nevezo){
       this.szamlalo = szamlalo;
       if (nevezo == 0){
           this.nevezo = 1;
       }else{
       this.nevezo = nevezo;
   }
   }
     
  
   public int getSzamlalo (){
       return szamlalo;
   }
    public void setSzamlalo(int szamlalo){
        this.szamlalo = szamlalo;
    }  
     
   public int getnevezo(){
       return nevezo;
   }  
     
   
   public void setnevezo (int nevezo){
       if (nevezo != 0){
       this.nevezo = nevezo;
   }
   }
   
   public Tortszam reciprok(){
       if (this.szamlalo != 0){
           return new Tortszam(this.nevezo, this.szamlalo);
       }else {
           return null;
       }
       
   }
   
  /**  public Tortszam() {
        this.szamlalo = 0;
        this.nevezo = 1;
    }

    public Tortszam(int szamlalo, int nevezo) {
        this.szamlalo = szamlalo;
        if (nevezo == 0) {
            this.nevezo = 1;
        } else {
            this.nevezo = nevezo;
        }
    }**/

   
   
    
    
   
  /** public double ertek(){
       return (double)szamlalo /nevezo;
   }
   
   public void kiir(){
       System.out.println(this.szamlalo + " " + this.nevezo);
   }**/
    

}

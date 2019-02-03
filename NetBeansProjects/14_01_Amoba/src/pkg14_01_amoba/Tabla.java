
package pkg14_01_amoba;


public class Tabla {

    public static final int JATEKOS_1 = 1;
    public static final int JATEKOS_2 = 2;
    public static final int URES = 0;
    
    public boolean helyes(Pozicio lepes) { 
      
      //  if(lepes.getSor() < -1 || lepes.getSor() > 3 || lepes.getOszlop() < -1 || lepes.getOszlop() > 3 || this.getMezo(lepes) != URES)
       //     return false;
          
        return true; 
    }
    
    public void feltesz(Pozicio lepes, int jatekos) { 
        
    //int [][] feltesz = new int[3][3];
   // feltesz [lepes.getSor()][lepes.getOszlop()]= jatekos;
    
       // System.out.println(lepes.getSor()+ ", "+ lepes.getOszlop() + " jatekos: " + jatekos);
     
    
    }
    
    public boolean nyert(int jatekos) { 
        
      
        
        if(this.getMezo(new Pozicio (0,0)) == jatekos && this.getMezo(new Pozicio (1,1)) == jatekos &&
           this.getMezo(new Pozicio (2,2)) == jatekos) 
                return true;
        
        if(this.getMezo(new Pozicio (0,2)) == jatekos && this.getMezo(new Pozicio(1,1)) == jatekos &&
           this.getMezo(new Pozicio (2,0)) == jatekos) 
                return true;
            
        if(this.getMezo(new Pozicio (0,0)) == jatekos && this.getMezo(new Pozicio (0,1)) == jatekos && 
           this.getMezo(new Pozicio (0,2)) == jatekos) 
                return true;
           
        if(this.getMezo(new Pozicio (1,0)) == jatekos && this.getMezo(new Pozicio (1,1)) == jatekos &&
           this.getMezo(new Pozicio (1,2)) == jatekos) 
                return true;
        
        if(this.getMezo(new Pozicio (2,0)) == jatekos && this.getMezo(new Pozicio (2,1)) == jatekos &&
           this.getMezo(new Pozicio (2,2)) == jatekos) 
                return true;
        
        if(this.getMezo(new Pozicio(0,0)) == jatekos && this.getMezo(new Pozicio(1,0)) == jatekos &&
           this.getMezo(new Pozicio (2,0)) == jatekos)  
                return true;
        
        if(this.getMezo(new Pozicio (0,1)) == jatekos && this.getMezo(new Pozicio(1,1)) == jatekos &&
           this.getMezo(new Pozicio (2,1)) == jatekos) 
                return true;
                
        if(this.getMezo(new Pozicio (0,2)) == jatekos && this.getMezo(new Pozicio (1,2)) == jatekos &&
           this.getMezo(new Pozicio(2,2)) == jatekos)
                return true;
        
        return false; 
    }
    public boolean dontetlen() { 
        
      if(this.getMezo(new Pozicio(0,0)) != URES && this.getMezo(new Pozicio(0,1)) != URES &&
              this.getMezo(new Pozicio(0,2)) != URES)  
          return true;
      
      if(this.getMezo(new Pozicio(1,0)) != URES && this.getMezo(new Pozicio(1,1)) != URES &&
              this.getMezo(new Pozicio(1,2)) != URES)
          return true;
      
      if(this.getMezo(new Pozicio(2,0)) != URES && this.getMezo(new Pozicio(2,1)) != URES &&
              this.getMezo(new Pozicio(2,2)) != URES)
          return true;
    
          return false; 
    }
    public int getMezo(Pozicio lepes) {
        
        
            return URES; 
    }
}

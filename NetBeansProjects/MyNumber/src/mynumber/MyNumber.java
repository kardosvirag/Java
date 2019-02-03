
package mynumber;


public class MyNumber {
    
    private int number;
    
   

    public MyNumber(int number) {
        this.number = number;
    }

   
    
    public boolean isPrime(){
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public void setNumber (int number){
        this.number = number;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public String toString(){
      //  System.out.println("A szam a " + number + ", ami " + (isPrime() ? "" : "nem ") + "prim.");
      
      return "A szam a " + number + ", ami " + (isPrime() ?"" : "nem ") + "prim.";
    }
}

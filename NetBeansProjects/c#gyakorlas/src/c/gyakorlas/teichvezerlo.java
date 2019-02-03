/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.gyakorlas;

/**
 *
 * @author virag
 */
public class teichvezerlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Fisch goldfisch = new Fisch("Goldi","Goldfisch");
        Teich teich = new Teich();
        //teich.AddFisch(goldfisch);
        System.out.println(teich.AddFisch(goldfisch));
    }
    
}

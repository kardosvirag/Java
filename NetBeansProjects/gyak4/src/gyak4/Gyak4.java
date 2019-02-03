/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak4;

import java.util.Scanner;

/**
 *
 * @author virag
 */
public class Gyak4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int primo = 5;
        int secondo = 10;
        int osszeadas = 0;
        
        for (int i = primo; i <= secondo; i++) {
            osszeadas+= i;
            System.out.println("osszeadas" + osszeadas);
        }
        System.out.println("osszeadas:" + osszeadas);
        
    }
    }

 
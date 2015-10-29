/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package math;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Math {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        String string = myScanner.next();
        
        System.out.println(string);
        
        for (int n = 1; n < 1000; n++) {
            for (int d = 1; d < 1000; d++) {
                if ((n%d == 7) && (5*n)%d == 10) {
                    System.out.println("n: " + n);
                    System.out.println("d: " + d);
                }
            }
        }
    }
    
}

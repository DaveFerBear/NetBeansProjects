/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ferris_david_euler21.pkg40;

import java.util.ArrayList;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Euler2140 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PROBLEM #21
        int a = 0, b = 0, sum = 0;
        
        for (int x = 0; x < 10000; x++) {
           a = getDivisors(x);
           b = getDivisors(a);
           if (a == b) {
               sum += a;
               sum += b;
           }
        } 
        System.out.println(sum);
    }
    
    public static int getDivisors(int num) {
        ArrayList arr = new ArrayList<>();
        for (int a = 2; a < num/2.0; a++) {
            if (num % a == 0)
                arr.add(a);
        }
        
        int sum = 0;
        for (int c = 0; c < arr.size(); c++) {
            sum += (int)arr.get(c);
        }
        return sum;
    }
    
}

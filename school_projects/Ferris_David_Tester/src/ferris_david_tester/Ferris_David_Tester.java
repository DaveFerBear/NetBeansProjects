/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_tester;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Tester {

    public static void main(String[] args) {
        long x = 0;
        long y = 1;
        long z = 0;
        System.out.println("Fibonacci Sequence: \n-----------");
        System.out.println("0");

        while (x < 4000000 && y < 4000000) {
            
            y+=x;
            x+=y;
            System.out.println(y);
            System.out.println(x);
            
            if (x%2 == 0)
            {
                z+=x;
            }
            else if (y%2 == 0)
            {
                z+=y;
            }
        }

        System.out.println("---\n");
        System.out.println(z);

    }
}
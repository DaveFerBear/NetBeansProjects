/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_pi;

/**
 *
 * @author davidferris
 */
public class Ferris_David_pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double digits = 2147483647;
        double calculator = 1;

        for (double i = 3; i <= digits; i += 4) 
        {
            calculator -= (1/(i));
        }
        
        for (double i = 5; i <= digits; i += 4) 
        {
            calculator += (1/(i));
        }
        
        System.out.println(4*calculator);
    }
}
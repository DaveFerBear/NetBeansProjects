/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page67_question4;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page67_Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number = 8;
        int x = 0;

        while (Math.pow(2, x) < number)
        {
            x++;
            
        }
            System.out.print("2^");
            System.out.print(x);
            System.out.print(" = ");
            System.out.println((int) Math.pow(2, x));
    }
}

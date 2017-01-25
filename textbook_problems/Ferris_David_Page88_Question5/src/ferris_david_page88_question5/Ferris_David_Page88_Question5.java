/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page88_question5;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page88_Question5 {

    /**
     * @param args the command line arguments
     */
    
    public static double getDollarAmount(int pennies, int nickels, int dimes, int quarters)
    {
        double Amount = pennies*.01 + nickels*.05 + dimes*.1 + quarters *.25;
        return Amount;
    }
    public static void main(String[] args) {
        
        
        System.out.println("$" + getDollarAmount(3,1,6,1));
        
    }
}

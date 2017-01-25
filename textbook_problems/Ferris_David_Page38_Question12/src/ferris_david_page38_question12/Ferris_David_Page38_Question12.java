/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page38_question12;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page38_Question12
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        double Bearing = 17.90;
        double Runway = (Math.round(Bearing / 10));
        
        
        if (Bearing > 360) {
            System.out.println("Invalid Bearing");
        } else if (Bearing >= 5) {
            System.out.print("Runway Number: ");
            System.out.println((int)Runway);
        } else if (Bearing > 0) {
            System.out.println("Runway Number: 36");
        } else {
            System.out.println("Invalid Bearing");
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page38_questions13;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page38_Questions13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double Hours = 12.5;
       
        double Minutes = (Hours - Math.floor(Hours));
        double Seconds = (Minutes - Math.floor(Minutes));
        
        System.out.print(Hours);
        System.out.print(" = ");
        System.out.print(Hours);
        System.out.print(" hours, ");
        System.out.print(Minutes);
        System.out.print(" minutes, ");
        System.out.print(Seconds);
        System.out.println(" seconds");
    }
}

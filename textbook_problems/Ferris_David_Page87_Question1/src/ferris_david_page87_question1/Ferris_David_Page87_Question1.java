/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page87_question1;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page87_Question1 {

    /**
     * @param args the command line arguments
     */
    
    public static void AddRoof()
    {
        System.out.println("   /\\   ");
        System.out.println("  /  \\  ");
        System.out.println(" /    \\ ");
        System.out.println("/______\\");
    }
    
    public static void AddWalls()
    {
        for (int i = 0; i < 3; i++)
            System.out.println("|      |");
    }
    
    public static void AddBase()
    {
        System.out.println("|______|");
    }
    
    public static void AddWalk()
    {
        System.out.println("   **");
        System.out.println("   *********");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AddRoof();
        AddWalls();
        AddBase();
        AddWalk();
    }
}

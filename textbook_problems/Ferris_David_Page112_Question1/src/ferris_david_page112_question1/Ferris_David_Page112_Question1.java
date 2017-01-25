/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page112_question1;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page112_Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nonalphabet = 0;
        Scanner userin = new Scanner(System.in);
        String UserString = userin.nextLine();

        char[] newArray = new char[UserString.length()];
        newArray = UserString.toCharArray();

        for (int q = 0; q <= (UserString.length() - 1); q++) {
                    if (newArray[q] == ' ')
                    {
                        nonalphabet++;
                    }
        }
    }
}
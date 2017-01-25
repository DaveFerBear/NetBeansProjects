/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page87_question4;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page87_Question4 {

    /**
     * @param args the command line arguments
     */
    public static void addSpaces(int currentline, int totallines) {
        for (int i = 0; i < (totallines - currentline); i++) {
            System.out.print(" ");
        }
    }

    public static void drawBar(int totallines) {
        int currentline = 1;

        for (int i = 0; i < (totallines); i++) {
            addSpaces(currentline, totallines);

            for (int d = 0; d < currentline; d++) {
                System.out.print("*");
            }
            for (int x = 1; x < currentline; x++) {
                System.out.print("*");
            }

            System.out.println();
            currentline++;

        }


    }

    public static void main(String[] args) {
        
        int inputint;
        
        System.out.print("How large would you like your triangle: ");
        
        Scanner input = new Scanner(System.in);
        inputint = input.nextInt();
        
        drawBar(inputint);
    }
}

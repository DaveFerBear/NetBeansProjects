/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page67_question5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page67_Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        {

            int userInput1;
            int userInput2;
            int counter = 0;

            Scanner input = new Scanner(System.in);

            System.out.print("Type in a list of numbers, ending with 0: ");

            userInput1 = input.nextInt();
            userInput2 = input.nextInt();

            while (userInput2 != 0) {
                if (userInput1 == userInput2) {
                    counter++;
                }

                userInput1 = userInput2;
                userInput2 = input.nextInt();
            }

            System.out.println("There were " + counter + " duplicate numbers");
        }
    }
}
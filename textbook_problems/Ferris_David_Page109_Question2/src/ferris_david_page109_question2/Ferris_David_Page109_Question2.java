/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page109_question2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page109_Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declare all variables used
        int[] outcomes = new int[19];
        Scanner input = new Scanner(System.in);
        int numRolls;
        Random rand = new Random();
        int outcome;
        Scanner dicenum = new Scanner(System.in);
        Scanner facenum = new Scanner(System.in);

        //prompts user for # of rolls
        System.out.print("How many rolls? ");
        numRolls = input.nextInt();

        System.out.println("How many die are you using?");
        int dicenumber = dicenum.nextInt(); //prompts user for # of rolls



        //Generates data for every roll
        for (int roll = 0; roll < numRolls; roll++) {
            for (int f = 0; f < dicenumber; f++) //loops once for every roll
            {
                System.out.println("How many face on this die?");
                int facenumber = facenum.nextInt();

                outcome = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1); //randomly 
                outcomes[outcome]++;
            }
        }
        //prints the information in the array (greater than 3)
        for (int i = 3; i <= 18; i++) {
            System.out.println(i + ": " + outcomes[i]);
        }
    }
}
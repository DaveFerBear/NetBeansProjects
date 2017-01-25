/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page60_wordguess2;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page60_WordGuess2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        String theWord = "anti";
        String userInput;
        String dashedWord = "";

        Scanner myScanner = new Scanner(System.in);

        while (!dashedWord.equals(theWord)) {
            for (int i = 0; i < theWord.length(); i++) {
                dashedWord += "-";
            }
            System.out.println(dashedWord);
            System.out.print("Choose a letter: (enter \"!\"to guess the word)");
            userInput = myScanner.nextLine();

            if (userInput.equals("!")) {
                //ask for the entire word
            } else {
                for (int i = 0; i < theWord.length(); i++) {
                    //check if current letter matcges user's guess
                    if (theWord.charAt(i) == userInput.charAt(0)) {
                        //replace dash with the chosen letter
                        dashedWord = dashedWord.substring(0, i)
                                + userInput.charAt(0)
                                + dashedWord.substring(i, theWord.length());
                    }

                }
            }

        }
    }
}

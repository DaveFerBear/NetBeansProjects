/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page60_wordguess;

import javax.swing.JOptionPane;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page60_WordGuess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declare the five dashes as individual strings
        String letter1 = "-";
        String letter2 = "-";
        String letter3 = "-";
        String letter4 = "-";
        String letter5 = "-";
        String str_input; //Declare the JOptionPane variable as a string
        String WordGuess; // Declare the complete word input (!) as a string

        //Set two integers for counting the guesses
        //NOTE: for this program, I only counted them together, not how many were right/wrong
        int Right = 1;
        int Wrong = 1;

        System.out.println("-----"); //I begin by printing 5 dashes, to show the viewer how many letters 

        //Runs loop forever, until the user guesses correctly and the program ends

        while (true) {
            str_input = JOptionPane.showInputDialog("Enter a Letter:\n(Use ! to guess entire word)"); //Letter Input Box


            {

                if (str_input.equalsIgnoreCase("B")) { //If the letter B is guessed, convert first dash to a B

                    letter1 = "B"; 
                    Right++; //adds 1 to the guess counter
                    String Guess = "B" + letter2 + letter3 + letter4 + letter5; //Changes the variable Guess to include B

                } else if (str_input.equalsIgnoreCase("R")) { //If the letter R is guessed, convert second dash to an R

                    (letter2) = "R";
                    Right++; //adds 1 to the guess counter
                    
                    String Guess = letter1 + "R" + letter3 + letter4 + letter5; //Changes the variable Guess to include R

                } else if (str_input.equalsIgnoreCase("A")) { //If the letter A is guessed, convert third dash to an A

                    letter3 = "A";
                    Right++; //adds 1 to the guess counter
                    String Guess = letter1 + letter2 + "A" + letter4 + letter5;//Changes the variable Guess to include A

                } else if (str_input.equalsIgnoreCase("I")) { //If the letter I is guessed, convert fourth dash to an I

                    letter4 = "I";
                    Right++; //adds 1 to the guess counter
                    String Guess = letter1 + letter2 + letter3 + "I" + letter5; //Changes the variable Guess to include I

                } else if (str_input.equalsIgnoreCase("N")) { //If the letter N is guessed, convert fifth dash to an N

                    letter5 = "N";
                    Right++; //adds 1 to the guess counter
                    String Guess = letter1 + letter2 + letter3 + letter4 + "N"; //Changes the variable Guess to include N

                } else if (str_input.equalsIgnoreCase("!")) { //If the ENTIRE WORD COUNTER is selected (!)

                    WordGuess = JOptionPane.showInputDialog("Guess Word:"); //Display a "Guess Word" Box

                    
                    if (WordGuess.equalsIgnoreCase("BRAIN")) { //If the guessed word is brain, display winning info, else run loop
                        System.out.println("You won!\nThe secret word is BRAIN");
                        System.out.print("You made ");
                        System.out.print(Right + Wrong);
                        System.out.println(" guesses");

                        System.exit(0); //If the player wins, end the program
                    }


                } else { //If the player is wrong (letter or word) give an error and repeat

                    System.out.println("Guess Again");
                    Wrong++;
                    String Guess = letter1 + letter2 + letter3 + letter4 + letter5;
                }

                String Guess = letter1 + letter2 + letter3 + letter4 + letter5; //Declares what the Guess for that turn is

                System.out.print(letter1); //Prints out the known information

                System.out.print(letter2);

                System.out.print(letter3);

                System.out.print(letter4);

                System.out.println(letter5);

                if (Guess.equals("BRAIN")) { //If the player gets all five letters correct, display winning info
                    System.out.println("You won!");
                    System.out.println("The secret word is BRAIN");
                    System.out.print("You made ");
                    System.out.print(Right + Wrong);
                    System.out.println(" guesses");

                    System.exit(0); //end program if the player wins
                }
            }
        }
    }
}
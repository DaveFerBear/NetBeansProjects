package ferris_david_stonesgame;

import javax.swing.JOptionPane;

/**
 * @author davidferris
 */
public class Ferris_David_StonesGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int StoneCounter = 25; //Declare the number of stones as 25

        while (StoneCounter > 1) { //Runs until there is only one stone left
            //Declare all input/output variables
            String input;
            String outputstring = "";
            int inputInt = 0;

            for (int i = StoneCounter / 5; i > 0; i--) { //Divides by 5, and trunkates the current number of stones
                outputstring += "*****\n";
            }

            for (int i = StoneCounter % 5; i > 0; i--) { //Finds the remainder of Stones "missed" by the trunkation and prints * for them
                outputstring += ("*");
            }
            //Aesthitics for the JOptionPane
            input = JOptionPane.showInputDialog("The Stones Game:\n"
                    + "---------------\n"
                    + outputstring //Displays the current number of stones
                    + "\nHow many stones would you like to take?");
            //attempts to convert the user input to a int
            try {
                inputInt = Integer.parseInt(input);
            } catch (NumberFormatException e) { //if input is not an int, gives an error, but doesn't crash
                System.out.println("Invalid Input\n");
            }
            if (inputInt == 1 || inputInt == 2 || inputInt == 3) { //For all "legal" situations
                StoneCounter -= inputInt; //Decrement Stonecounter by the input
            } else {
                System.out.println("Please enter 1, 2, or 3");
            }

            if (inputInt == 1) { //If the input is one, decrement stonecounter by 3
                StoneCounter--; StoneCounter--; StoneCounter--;
                System.out.println("You take one stone!\nI take three stones!"); //"Stone Tally" message
            } else if (inputInt == 2) { //If the input is two, decrement stonecounter by 2
                StoneCounter--; StoneCounter--;
                System.out.println("You take two stones!\nI take two stones!");
            } else if (inputInt == 3) { //If the input is three, decrement stonecounter by 1
                StoneCounter--;
                System.out.println("You take three stones!\nI take one stone!");
            } else {
                System.out.println(""); //Do nothing except provide indentation if there is an invalid number chosen
            }

            System.out.println("\n");
        }

        while (true) { //Continually runs until force program close

            String laststone = JOptionPane.showInputDialog("The Stones Game:\n" //Displays the final stone as before
                    + "---------------\n"
                    + "*\n"
                    + "^ Press 1 to take the last stone."); //message to take the final stone

            if (laststone.equals("1")) { //Final message and end program if the use "takes" the final stone
                System.out.println("You have been crushed.  Thank you, come again.");
                System.exit(0);
            } else {
                System.out.println("Please enter 1.\n"); //Else run the loop again, and check for the number 1
            }
        }
    }
}
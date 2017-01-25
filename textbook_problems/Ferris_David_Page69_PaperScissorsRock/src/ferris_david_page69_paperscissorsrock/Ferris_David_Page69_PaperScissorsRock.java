 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page69_paperscissorsrock;
//random
import javax.swing.JOptionPane;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page69_PaperScissorsRock {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String CounterInput = JOptionPane.showInputDialog("How many games would you like to play?");
        try { //Attempts to run the program (assumed input is an integer)
            int gameNumber = Integer.parseInt(CounterInput);

            int GameCounter = 0, WinCounter = 0, TieCounter = 0, LoseCounter = 0; //Declare all the counters for stats

            while (GameCounter < gameNumber) { //Runs until the set gameNumber is reached

                String UserInput = JOptionPane.showInputDialog("Rock: 1\nPaper: 2\nScissors: 3"); //takes an input
                int InputInt = Integer.parseInt(UserInput); //converts the input to an integer
                int random = (int) Math.ceil(Math.random() * 3); //Creates a random number from 1-3

                switch (InputInt) {
                    case 1: { //While the input is 1
                        switch (random) {
                            case 1: { //While the input is 1 and random is 1
                                System.out.println("Tie\n");
                                TieCounter++;
                                break;
                            }
                            case 2: { //While the input is 1 and random is 2
                                System.out.println("Win\n");
                                WinCounter++;
                                break;
                            }
                            case 3: { //While the input is 1 and random is 3
                                System.out.println("Lose\n");
                                LoseCounter++;
                                break;
                            }
                            default: { //If for some reason a number is generated, which isn't 1,2, or 3
                                System.out.println("Number Generation Error.  Please Restart Program.\n");
                                System.exit(0);
                            }
                            break;
                        }
                        break; //If the input was one, skip everything else
                    }
                    case 2: {
                        switch (random) {
                            case 1: { //While the input is 2 and random is 1
                                System.out.println("Lose\n");
                                LoseCounter++;
                                break;
                            }
                            case 2: { //While the input is 2 and random is 2
                                System.out.println("Tie\n");
                                TieCounter++;
                                break;
                            }
                            case 3: { //While the input is 2 and random is 3
                                System.out.println("Win\n");
                                WinCounter++;
                                break;
                            }
                            default: {
                                System.out.println("Number Generation Error.  Please Restart Program.\n");
                                System.exit(0);
                            }
                            break;
                        }
                        break; //If the input was two, skip everything else
                    }
                    case 3: {
                        switch (random) {
                            case 1: { //While the input is 3 and random is 1
                                System.out.println("Win\n");
                                WinCounter++;
                                break;
                            }
                            case 2: { //While the input is 3 and random is 2
                                System.out.println("Lose\n");
                                LoseCounter++;
                                break;
                            }
                            case 3: { //While the input is 3 and random is 3
                                System.out.println("Tie\n");
                                TieCounter++;
                                break;
                            }
                            default: {
                                System.out.println("Number Generation Error.  Please Restart Program.\n");
                                System.exit(0);
                            }
                            break;
                        }
                        break; //If the input was three, skip everything else
                    }
                    default: {
                        System.out.println("Invalid Input\nEnter a Value 1-3\n");
                        GameCounter--; //Account for the game lost for an "Invalid Input"
                    }
                }
                GameCounter++; //Increase the counter every time the loop runs

                while (GameCounter == gameNumber) { //When the final number of games has been reached, print the stats

                    System.out.println("ROUND STATS:\n");
                    System.out.format("%4s %3s %3s", "Win", "Lose", "Tie\n");
                    System.out.println(" ------------");
                    System.out.format("%4s %3s %3s %s", WinCounter, LoseCounter, TieCounter, "\n\n"); //print out the wins, losses, and ties
                    System.exit(0); //end the program
                }
            }
        } catch (NumberFormatException e) { //If the input is not an integer
            System.out.println("You have not entered an Integer.  Please Restart Program.");
        }
    }
}
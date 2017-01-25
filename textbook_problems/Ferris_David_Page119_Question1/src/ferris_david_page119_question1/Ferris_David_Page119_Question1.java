/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page119_question1;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page119_Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] myArray = new int[25]; //Create new array of 25 integers

        for (int x = 0; x < 25; x++) {
            myArray[x] = (int) ((Math.random() * 100) + 1);
        }

        System.out.println("ODD:"); //Title for odd numbers

        for (int i = 0; i < 25; i++) { //Runs through matrix
            if (myArray[i] % 2 == 1) { //print if number is odd
                System.out.print(myArray[i] + " ");
            }
        }
        
        System.out.println("\nEVEN:"); //Title for even numbers

        for (int i = 0; i < 25; i++) { //Runs through matrix
            if (myArray[i] % 2 == 0) { //print if number is even
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println(); //Sets build successful on new line
    }
}
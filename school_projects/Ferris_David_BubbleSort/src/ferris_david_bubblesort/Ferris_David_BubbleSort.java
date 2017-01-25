/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_bubblesort;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int changer;
        
        System.out.println("How many items would you like to be sorted?"); //Prompt for length of array
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] buble = new int[length];
        
        System.out.println("Please list the numbers:"); //Prompt for items
        for(int x = 0; x < buble.length; x++)
        {
            buble[x] = scan.nextInt();
        }
        
        //The actual sorting shenanigans
        for(int qwert = 0; qwert < buble.length; qwert++)
        {
            for(int werty = 0; werty < buble.length-1; werty++)
            {
             if (buble[werty] > buble[werty + 1])
             {
                 changer = buble[werty];
                 buble[werty] = buble[werty + 1];
                 buble[werty+1] = changer;
             }
            }
        }
        
        //Prints out the array
        for(int x = 0; x < buble.length; x++)
        {
            System.out.println(buble[x]);
        }
        
    }
}
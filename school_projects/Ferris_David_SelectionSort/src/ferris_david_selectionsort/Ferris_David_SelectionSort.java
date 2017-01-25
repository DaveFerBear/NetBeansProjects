/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_selectionsort;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("How many items would you like to be sorted?"); //Prompt for length of array
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] select = new int[length];

        //Input into array
        for (int x = 0; x < length; x++) {
            select[x] = scan.nextInt();
        }
        for (int j = length; j > 0; j--) {
            //Sorting Process
            int biggest = -1;
            int biggestIndex = -1;

            for (int r = 0; r < length; r++) {
                if (biggest < select[r]) {
                    biggest = select[r];
                    biggestIndex = r;
                }
            }

            //Swag biggest with end of list
            int changer;

            for (int x = 0; x < length; x++) {
                changer = select[select.length - 1];
                select[select.length - 1] = biggest;
                select[biggestIndex] = changer;
            }

            for (int k = 0; k < length; k++) {
                System.out.println(select[k]);
            }
        }
    }
}
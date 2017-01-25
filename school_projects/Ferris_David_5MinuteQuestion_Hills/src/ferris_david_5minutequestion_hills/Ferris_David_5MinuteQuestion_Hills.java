/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_5minutequestion_hills;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_5MinuteQuestion_Hills {

    public static void addDots(int currentline, int totallines) {
        for (int i = 0; i < (totallines - currentline); i++) {
            System.out.print(".");
        }
    }

    public static void drawBack(int totallines) {
        int currentline = 1;
        for (int m = 0; m < (5 - totallines); m++) {
            for (int q = 1; q < ((totallines*2)); q++) {

                System.out.print(".");
            }
            System.out.println();
        }

        for (int i = 0; i < (totallines); i++) {
            addDots(currentline, totallines);

            for (int d = 0; d < currentline; d++) {
                System.out.print("*");
            }
            for (int x = 1; x < currentline; x++) {
                System.out.print("*");
            }
            for (int c = 0; c < (totallines - currentline); c++) {
                System.out.print(".");
            }

            System.out.println();
            currentline++;

        }
    }

    public static void main(String[] args) {

        int inputint;

        System.out.print("Enter Value 1-5: ");

        Scanner input = new Scanner(System.in);
        inputint = input.nextInt();

        if (inputint <= 5 && inputint >= 0) {
            drawBack(inputint);
        }
        else if (inputint == 0)
        {
            for (int l = 0; l < 5; l++)
            System.out.println(".");
        }
       
    }
}

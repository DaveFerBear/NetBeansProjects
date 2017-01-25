/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page107_question1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page107_Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int NumberIn; //declare student number int
        Scanner numberinput = new Scanner(System.in); //declare student number scanner
        Scanner nameinput = new Scanner(System.in); //declare student name scanner
        
        System.out.print("Enter total students: "); //Student # prompt
        NumberIn = numberinput.nextInt(); //scanner for students
        System.out.println("\nEnter Student name(s): "); //student name prompt
        
        String [] classpeople = new String [NumberIn];
        
        for (int r = 0; r < NumberIn; r++) //runs once for every value < student #
        {
            classpeople[r] = nameinput.nextLine(); //declares class as input from scanner
        }
        
        System.out.println(); //Indents One Line
        
        System.out.println("\nStudent Roster:"); //Student list
        for (int x = 0; x < classpeople.length; x++)
        {
            System.out.println((x+1) + " - " + classpeople[x]); //Prints the class with student names
        }
    }
}
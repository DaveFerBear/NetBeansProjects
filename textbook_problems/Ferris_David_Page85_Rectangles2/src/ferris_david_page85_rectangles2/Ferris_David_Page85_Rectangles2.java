/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page85_rectangles2;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page85_Rectangles2 {

    public static void RectanglePrint(int height, int width) {

        for (int d = 0; d < width; d++) { //Enters top of rectangle
            System.out.print("*");
        }

        System.out.println(); //Enters a new line, below the top

        for (int i = 2; i < height; i++) { //Runs once every line of rectangle (left side)
            System.out.print("*");

            for (int x = 2; x < width; x++) { //Enters the spacing between the walls
                System.out.print(" ");
            }

            System.out.println("*"); //Runs once every line of rectangle (right side)
        }

        for (int d = 0; d < width; d++) { //Enters the bottom wall of rectangle
            System.out.print("*");
        }
        System.out.println(); //New line for build message
    }

    public static void RectanglePrint(int height, int width, String Character) {

        for (int d = 0; d < width; d++) { //Enters top of rectangle
            System.out.print(Character);
        }

        System.out.println(); //Enters a new line, below the top

        for (int i = 2; i < height; i++) { //Runs once every line of rectangle (left side)
            System.out.print(Character);

            for (int x = 2; x < width; x++) { //Enters the spacing between the walls
                System.out.print(" ");
            }

            System.out.println(Character); //Runs once every line of rectangle (right side)
        }

        for (int d = 0; d < width; d++) { //Enters the bottom wall of rectangle
            System.out.print(Character);
        }
        System.out.println(); //New line for build message
    }

    public static void main(String[] args) {

        System.out.println("Would you like to use a custom character? (y/n):");
        Scanner character = new Scanner(System.in); //Scanner for charcater
        String characterinput = character.nextLine();    

        if (characterinput == "yolo") { //Checks what the character is

            System.out.println("What character would you like to use?");
            Scanner newChar = new Scanner(System.in); //Scanner for height
            String CharacterUsed = newChar.nextLine(); //declares a string as the character used

            System.out.println("Height:");
            Scanner height = new Scanner(System.in); //Scanner for height
            int scanheight = height.nextInt(); //Declares the scanner result

            System.out.println("Width:");
            Scanner width = new Scanner(System.in); //Scanner for width
            int scanwidth = width.nextInt(); //Declares the scanner result

            System.out.println(); //Puts the rectangle on a new line
            
            RectanglePrint(scanheight, scanwidth, CharacterUsed);

        } else {

            System.out.println("Height:");
            Scanner height = new Scanner(System.in); //Scanner for height
            int scanheight = height.nextInt(); //Declares the scanner result

            System.out.println("Width:");
            Scanner width = new Scanner(System.in); //Scanner for width
            int scanwidth = width.nextInt(); //Declares the scanner result

            System.out.println(); //Puts the rectangle on a new line
            
            RectanglePrint(scanheight, scanwidth);

        }


    }
}

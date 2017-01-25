/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_ccc_1;

import java.util.Scanner;

/**
 *
 * @author davidferris
 */
public class Ferris_David_CCC_1 {
    
    public static int linear(int[] array, int numToFind)
    {
        int index = 0;
        
        while ((array[index] != numToFind) && (index <array.length-1));
        {
            index++;
        }
        
        if (array[index] == numToFind)
        {
            return index;
        }
        else{
            return -1;
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();
    
    System.out.println(input);
    
    
    
    
    int[] myNums = {75,80,13,-10,-50};
    
    System.out.println("Index is: " + linear(myNums, 13));
    }
}

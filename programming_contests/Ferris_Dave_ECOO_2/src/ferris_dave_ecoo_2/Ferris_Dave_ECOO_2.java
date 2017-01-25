/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_dave_ecoo_2;

/**
 *
 * @author davidferris
 */
import java.io.*;
import java.util.Scanner;

public class Ferris_Dave_ECOO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String test = "qwert";

        char[][] array = new char[test.length()][15];

        for (int x = 0; x < test.length(); x++) {
            for (int d = 0; d < 15; d++) {
                array[x][d] = test.charAt(x);
            }
        }

        for (int x = 0; x < test.length(); x++) {

            for (int d = 0; d < 15; d++) {
                System.out.print(array[x][d]);
            }
        }

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_page72_question6b;

import javax.swing.JOptionPane;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Page72_Question6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;

        input = JOptionPane.showInputDialog("New Input");

        int number = Integer.parseInt(input);

        System.out.format("%3s %20s %10s %20s %s", "#", "Square Root", "Square", "Reciprocal", "\n\n");

        for (int i = 1; i <= number; i++) {
            if ((i % 5) == 0) {
                System.out.format("%3s %20s %10s %20s %s", i, (Math.sqrt((double) i)), i * i, (1 / (double) i), "\n\n");
            } else {
                System.out.format("%3s %20s %10s %20s %s", i, (Math.sqrt((double) i)), i * i, (1 / (double) i), "\n");
            }
        }
    }
}
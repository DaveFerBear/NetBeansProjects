/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_bestfit;

import java.awt.geom.Point2D;
import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author davidferris
 */
public class Ferris_David_BestFit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        //SET UP GUI
        Cartesian myPanel = new Cartesian();
        JFrame cartesianFrame = new JFrame();
        cartesianFrame.setContentPane(myPanel);
        cartesianFrame.setSize(myPanel.width, myPanel.height + 20);
        cartesianFrame.setVisible(true);
        cartesianFrame.setResizable(false);
        cartesianFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

     
        while (true) {
            myPanel.repaint();
        }
    }
}

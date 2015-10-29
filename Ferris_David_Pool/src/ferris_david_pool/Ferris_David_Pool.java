/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_pool;

import java.awt.Point;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author davidferris
 */
public class Ferris_David_Pool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int width = 500;
        int length = 750;

        PoolTable myTable = new PoolTable(width, length);
        JFrame tableFrame = new JFrame();
        tableFrame.setContentPane(myTable);
        tableFrame.setSize(width, length);
        tableFrame.setVisible(true);
        tableFrame.setResizable(false);
        tableFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (int x = 0; x < myTable.list.size(); x++) {
            myTable.list.get(x).setLocation(new Point((int) (Math.random() * width), (int) (Math.random() * length)));
        }
        myTable.list.get(1).setVelocity(2);
        myTable.list.get(1).setDirection(1);

        while (true) {
            myTable.updatePosition();
            tableFrame.repaint();
            Thread.sleep(17);
        }

    }
}

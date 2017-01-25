/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ferris_david_visualsort_submission5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author davidferris
 */
public class BarPanel extends JPanel{
    
    int height = 600;
    int width = 1000;
    
    BarPanel() {
        
        //sets the panel to be focused and of specific heigh
        setSize(height, width);
        setVisible(true);
        setFocusable(true);
        requestFocus();

        repaint(); //draws the panel
    }
    
        public void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, width, height);
            for (int z = 0; z < SortBar.sortList.size(); z++) {
                g.setColor(SortBar.sortList.get(z).getColor());
                g.fillRect(800*z/SortBar.sortList.size()+100,500-(int)SortBar.sortList.get(z).getValue(), 10, (int)(SortBar.sortList.get(z).getValue()));
            }
        }
}

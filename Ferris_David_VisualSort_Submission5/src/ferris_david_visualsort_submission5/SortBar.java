/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_visualsort_submission5;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author davidferris
 */
public class SortBar {

    public static ArrayList<SortBar> sortList = new ArrayList<>();
    //variables describing bar
    private double sortValue;
    private Color color = Color.BLACK;

    public SortBar(double value) {
        this.sortValue = value;
    }

    public void setValue(double value) {
        this.sortValue = value;
    }

    public double getValue() {
        return this.sortValue;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return this.color;
        
    }
}

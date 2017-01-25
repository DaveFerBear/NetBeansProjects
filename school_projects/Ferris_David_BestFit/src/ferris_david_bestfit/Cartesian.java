/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferris_david_bestfit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author davidferris
 */
public class Cartesian extends JPanel implements KeyListener, MouseMotionListener, MouseListener {

    ArrayList<Point2D> points = new ArrayList<Point2D>();

    double averageSlope = 0;
    double averageIntercept = 0;
    double statSlope = -1;
    double statIntercept = 0;

    public int height = 500;
    public int width = height;
    int margins = 20;

    int mouseX;
    int mouseY;

    Cartesian() {

        //sets the panel to be focused and of specific heigh
        setSize(500, 500);
        setVisible(true);
        setFocusable(true);
        requestFocus();
        repaint(); //draws the panel

        addMouseMotionListener(this);
        addMouseListener(this);
        addKeyListener(this);

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(margins, width / 2, width - margins, width / 2);
        g.drawLine(height / 2, margins, height / 2, height - margins);

        //DRAW POINTS
        for (Point2D point : points) {
            g.setColor(Color.black);
            //Line2D.Double.
            g.drawRect((int) point.getX(), (int) point.getY(), 1, 1);
        }
        for (Point2D point1 : points) {
            for (Point2D point2 : points) {
                //g.drawLine((int)point1.getX(), (int)point1.getY(), (int)point2.getX(), (int)point2.getY());                
            }
        }

        //CALCULATE LINES
        averageLine();
        statLine();
        
        //TESTING
        System.out.println(averageSlope);
        System.out.println("stat" + statSlope);
        
        //DRAW LINES
        g.setColor(Color.BLUE);
        g.drawLine(250, 250 + (int) averageIntercept, 250 + width / 2, 250 + (int) (width * averageSlope) / 2 + (int) averageIntercept);
        g.drawLine(250, 250 + (int) averageIntercept, 250 - width / 2, 250 - (int) (width * averageSlope) / 2 + (int) averageIntercept);
        g.setColor(Color.RED);
        g.drawLine(0, (int)(250 + statIntercept), 500, (int)(500*statSlope + statIntercept));
        //g.drawLine(250,(int) statIntercept - 250, 250 + width / 2,(int) (width * statSlope) / 2 + (int) statSlope);
        //g.drawLine(250,(int) statIntercept - 250, 250 - width / 2, 250 - (int) (width * statSlope) / 2 + (int) statSlope);

        //DRAW LEGEND
        g.setColor(Color.BLUE);
        Font myFont = new Font("Helvetica", Font.BOLD, 14);
        g.setFont(myFont);
        g.drawString("Average Method", 375, 450);
        g.setColor(Color.RED);
        g.drawString("Stats Method", 375, 470);
    }
    
    public void averageLine() {
        //SLOPE
        ArrayList<Line2D> lines = new ArrayList<Line2D>();
        averageSlope = 0;
        lines.clear();
        for (int r = 0; r < points.size(); r++) {
            for (int a = 0; a < points.size(); a++) {
                double deltaX = points.get(r).getX() - points.get(a).getX();
                double deltaY = points.get(r).getY() - points.get(a).getY();

                if (deltaX != 0) { //catches the condition where the slope is infinite (deltaX = 0)                 
                    lines.add(new Line2D.Double(points.get(r), points.get(a))); //finds the slope
                }
            }
        }

        double tempSlope;
        double tempIntercept = 0;
        for (int z = 0; z < lines.size(); z++) {

            if (lines.get(z).getX1() - lines.get(z).getX2() != 0) { //under condition that line is not vertical
                //CACLULATE AVERAGE SLOPE
                tempSlope = (lines.get(z).getY1() - lines.get(z).getY2()) / (lines.get(z).getX1() - lines.get(z).getX2());
                averageSlope += tempSlope;
            }
        }

        if (lines.size() > 0) {
            averageSlope /= lines.size();
        }
        
        //INTERCEPT
        int belowLine = 0;
        int aboveLine = 0;

        for (Point2D point : points) {
            if (isAboveLine(point)) {
                aboveLine++;
            } else {
                belowLine++;
            }
        }

        while (Math.abs(aboveLine - belowLine) > 2) {
            for (Point2D point : points) {
                if (isAboveLine(point)) {
                    aboveLine++;
                } else {
                    belowLine++;
                }
            }
            if (aboveLine > belowLine) {
                averageIntercept++;
            } else {
                averageIntercept--;
            }
            belowLine = 0;
            aboveLine = 0;
        }
    }
    public void statLine() {
        //SLOPE
        statSlope = (meanX()*meanY() - meanXY())/(meanX()*meanX() - meanXsquared());
        
        //INTERCEPT
        statIntercept = meanY() - statSlope*meanX();
    }
    
    public double meanXsquared() {
        double mean = 0;
        for (Point2D point : points) {
            mean+=(point.getX()*point.getX());
        }
        mean/=points.size();
        return mean;
    }
    public double meanXY() {
        double mean = 0;
        for (Point2D point : points) {
            mean+=(point.getX() * point.getY());
        }
        mean/=points.size();
        return mean;
    }
    
    public double meanX() {
        double mean = 0;
        for (Point2D point : points) {
            mean+=point.getX();
        }
        mean/=points.size();
        return mean;
    }
    public double meanY() {
        double mean = 0;
        for (Point2D point : points) {
            mean+=point.getY();
        }
        mean/=points.size();
        return mean;
    }

    public boolean isAboveLine(Point2D point) { //returns true if a point is above the line
        double y = averageSlope * (point.getX() - 250) + averageIntercept; //y = mx + b
        if (point.getY() - 250 > y) {
            return true;
        } else {
            return false;
        }
    }

    public void setPoint(int x, int y) {
        points.add(new Point2D.Double(x, y));
    }

    public void mouseMoved(MouseEvent e) { //pass mouse coordinate into mouse X,Y
        mouseX = e.getX();
        mouseY = e.getY();
    }

    public void mouseDragged(MouseEvent e) { //pass mouse coordinate into mouse X,Y
        mouseX = e.getX();
        mouseY = e.getY();
        setPoint(mouseX, mouseY);
    }

    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();

    }

    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();

    }

    public void mouseReleased(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        setPoint(mouseX, mouseY);

    }

    public void keyTyped(KeyEvent e) {
        switch  (e.getKeyChar())
        {        case 'r' : //Use R to reset the lines
            points.clear();
        }     
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
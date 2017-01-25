/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ferris_david_pool;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author davidferris
 */
public class PoolTable extends JPanel implements MouseMotionListener, MouseListener {
    
    int mouseX, mouseY;
    int width, length;
    
    Ball b1 = new Ball(new Point(0,0), Color.YELLOW, true);
    Ball b2 = new Ball(new Point(0,0), Color.blue, true);
    Ball b3 = new Ball(new Point(0,0), Color.red, true);
    Ball b4 = new Ball(new Point(0,0), new Color(100,0,40), true);
    Ball b5 = new Ball(new Point(0,0), Color.orange, true);
    Ball b6 = new Ball(new Point(0,0), Color.green, true);
    Ball b7 = new Ball(new Point(0,0), Color.blue, true);
    Ball b8 = new Ball(new Point(0,0), Color.black, true);
    Ball b9 = new Ball(new Point(0,0), Color.YELLOW, false);
    Ball b10 = new Ball(new Point(0,0), Color.blue, false);
    Ball b11 = new Ball(new Point(0,0), Color.red, false);
    Ball b12 = new Ball(new Point(0,0), new Color(100,0,40), false);
    Ball b13 = new Ball(new Point(0,0), Color.orange, false);
    Ball b14 = new Ball(new Point(0,0), Color.green, false);
    Ball b15 = new Ball(new Point(0,0), Color.blue, false);
    
    ArrayList<Ball> list = new ArrayList<Ball>();
    
    PoolTable (int width0, int length0) {
        width = width0;
        length = length0;
        
        setSize(500, 500);
        setVisible(true);
        setFocusable(true);
        requestFocus();
        repaint(); //draws the panel

        addMouseMotionListener(this);
        addMouseListener(this);
        
        list.add(0, b1);
        list.add(1, b2);
        list.add(2, b3);
        list.add(3, b4);
        list.add(4, b5);
        list.add(5, b6);
        list.add(6, b7);
        list.add(7, b8);
        list.add(8, b9);
        list.add(9, b10);
        list.add(10, b11);
        list.add(11, b12);
        list.add(12, b13);
        list.add(13, b14);
        list.add(14, b15);
    }
    
    public void paintComponent (Graphics g) {
        g.setColor(new Color(5,100,50));
        g.fillRect(0, 0, width, length);
        for (int x = 0; x < list.size(); x++) {
            g.setColor(Color.black);
            g.drawOval(list.get(x).getLocation().x, list.get(x).getLocation().y, 20, 20);
            g.setColor(list.get(x).getColor());
            g.fillOval(list.get(x).getLocation().x, list.get(x).getLocation().y, 20, 20);
        }
    }
    
    public void updatePosition() {
        for (int x = 0; x < list.size(); x++) {
            list.get(x).updateLocation();
        }
        //CHECK FOR COLLISIONS
            for (int a = 0; a < list.size(); a++) {
                for (int b = 0; b < list.size(); b++) {
                    if ((Math.abs(list.get(a).getLocation().getX() - list.get(b).getLocation().getX()) <= 10)
                        && (Math.abs(list.get(a).getLocation().getY() - list.get(b).getLocation().getY()) <= 10)) {
                        resolveCollision(list.get(a), list.get(b));
                    }
        }
    }
    }
    void resolveCollision(Ball b1, Ball b2) {
        double phi = b1.getDirection() - b2.getDirection();//impact angle
        
        double x1 = b2.getVelocity()*Math.cos(b2.getDirection()-phi)*Math.cos(phi) + b1.getVelocity()*Math.sin(b1.getDirection() - phi)*Math.cos(phi + Math.PI/2);
        double y1 = b2.getVelocity()*Math.cos(b2.getDirection()-phi)*Math.sin(phi) + b1.getVelocity()*Math.sin(b1.getDirection() - phi)*Math.sin(phi + Math.PI/2);
        b1.setVelocity(Math.sqrt(x1*x1 + y1*y1));
        b1.setDirection(Math.atan2(y1,x1));
        
        double x2 = b1.getVelocity()*Math.cos(b1.getDirection()-phi)*Math.cos(phi) + b2.getVelocity()*Math.sin(b2.getDirection() - phi)*Math.cos(phi + Math.PI/2);
        double y2 = b1.getVelocity()*Math.cos(b1.getDirection()-phi)*Math.sin(phi) + b2.getVelocity()*Math.sin(b2.getDirection() - phi)*Math.sin(phi + Math.PI/2);
        b2.setVelocity(Math.sqrt(x2*x2 + y2*y2));
        b2.setDirection(Math.atan2(y2,x2));
        
        b1.updateLocation();
        
        b2.updateLocation();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getX();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getX();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getX();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getX();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getX();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getX();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getX();
    }   
}
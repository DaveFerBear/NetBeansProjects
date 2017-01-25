
package ferris_david_pool;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author davidferris
 */
public class Ball {

    private Point location;
    private double direction, velocity;
    private Color color;
    private boolean solid, pocketed;

    Ball(Point p0, Color color0, boolean solid0) {
        location = p0;
        direction = 0;
        velocity = 0;
        color = color0;
        solid = solid0;
        pocketed = false;

    }

    public void setLocation(Point location) {
        this.location = location;
    }
    public Point getLocation() {
        return this.location;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getVelocity() {
        return velocity;
    }
    public Color getColor() {
        return color;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public boolean isSolid() {
        return solid;
    }

    public boolean isPocketed() {
        return pocketed;
    }

    public void setPocketed(boolean pocketed) {
        this.pocketed = pocketed;
    }
    
    void updateLocation() {
        //CHECK FOR WALLS
         if (location.x <= 0) {
                setDirection((-1)*getDirection());
            }
            else if (location.x >= 480) {
                setDirection((-1)*getDirection());
            }
         if (location.y <= 0) {
                setDirection(Math.PI - getDirection());
            }
            else if (location.y >= 710) {
                setDirection(Math.PI - getDirection());
            }
        location.x += velocity*Math.sin(direction);
        location.y += velocity*Math.cos(direction);
    }
}
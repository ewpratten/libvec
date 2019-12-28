package ca.retrylife.libvec;

import ca.retrylife.libvec.Vector3;
import java.awt.Point;

/**
 * A 2D floating point. Replacement for javax.vecmath.Point2f
 */
public class Point2 extends Vector3 {

    /**
     * Create a 2D point represented as a 3D vector
     * 
     * @param x X component
     * @param y Y component
     */
    public Point2(double x, double y) {
        super(x, y, 0);
    }

    /**
     * Create a Point2 from a Point. Useful for higher-precision points
     * 
     * @param p Point to create from
     */
    public Point2(Point p) {
        this(p.x, p.y);
    }

    /**
     * Get the Point2 as a Point. This will cast components down to ints
     * 
     * @return Point
     */
    public Point toPoint() {
        return new Point((int) x, (int) y);
    }
}
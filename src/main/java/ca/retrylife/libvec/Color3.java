package ca.retrylife.libvec;

import ca.retrylife.libvec.Vector3;

import java.awt.Color;

/**
 * A replacement for javax.vecmath.Color3f (incomplete)
 */
public class Color3 extends Vector3 {

    /**
     * Create an RGB color
     * 
     * @param r Red channel [0.0-1.0]
     * @param g Green channel [0.0-1.0]
     * @param b Blue channel [0.0-1.0]
     */
    public Color3(float r, float g, float b) {
        super(r, g, b);
    }

    /**
     * Create a vector from a color.
     * 
     * This will convert RGB to XYZ components with ranges [0.0-1.0]
     * 
     * @param c Color
     */
    public Color3(Color c) {
        super(c.getRed() / 255, c.getGreen() / 255, c.getBlue() / 255);
    }

    /**
     * Get the vector as a color. All values are clamped and rounded
     * 
     * @return Color
     */
    public Color toColor() {

        // Clamp, round, and cast each component to an RGB value
        int r = (int) Math.round(VecUtil.clamp(x, 0, 1) * 255);
        int g = (int) Math.round(VecUtil.clamp(y, 0, 1) * 255);
        int b = (int) Math.round(VecUtil.clamp(z, 0, 1) * 255);

        return new Color(r, g, b);
    }

}
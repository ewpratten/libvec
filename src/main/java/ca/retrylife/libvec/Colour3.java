package ca.retrylife.libvec;

/**
 * A replacement for javax.vecmath.Color3f (incomplete)
 */
public class Colour3 extends Vector3 {

    /**
     * Create an RGB colour
     * 
     * @param r Red channel
     * @param g Green channel
     * @param b Blue channel
     */
    public Colour3(float r, float g, float b) {
        super(r, g, b);
    }

}
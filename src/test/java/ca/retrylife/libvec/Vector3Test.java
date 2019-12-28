package ca.retrylife.libvec;

import java.awt.Color;

import org.junit.Test;

/**
 * Tests for Vector3
 */
public class Vector3Test {

    /**
     * Test the creation of standard vectors, and ensure their components are
     * correct
     */
    @Test
    public void vectorCreationTest() {

        // Create a vector at 1,3,8
        Vector3 a = new Vector3(1, 3, 8);

        // Ensure components are correct
        assert a.x == 1;
        assert a.y == 3;
        assert a.z == 8;

        // Create a zero vector
        Vector3 b = new Vector3();

        // Ensure components are all 0
        assert (b.x + b.y + b.y) == 0;

        // Create a one vector at 5
        Vector3 c = new Vector3(5);

        // Ensure components are all 5
        assert c.x == 5;
        assert c.y == 5;
        assert c.z == 5;

        // Clone a
        Vector3 d = new Vector3(a);

        // Ensure components are equal
        assert d.x == a.x;
        assert d.y == a.y;
        assert d.z == a.z;
    }

    /**
     * Test Vector3 <-> Color conversions
     */
    @Test
    public void vectorColorTest() {

        // Create a vector for the color blue
        Vector3 blue = new Vector3(Color.BLUE);

        // Ensure the blue vector has the correct components
        assert blue.x == 0;
        assert blue.y == 0;
        assert blue.z == 1;

        // Convert color vector back to a Color object
        Color blue2 = blue.toColor();

        // Ensure blue2's components are correct
        assert blue2.getRed() == 0;
        assert blue2.getGreen() == 0;
        assert blue2.getBlue() == 255;

    }

}
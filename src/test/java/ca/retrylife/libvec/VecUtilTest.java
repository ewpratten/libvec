package ca.retrylife.libvec;

import org.junit.Test;

/**
 * Tests for VecUtil
 */
public class VecUtilTest {

    /**
     * Ensure that values within a clamp will be passed through
     */
    @Test
    public void clampPassTest() {

        // Check value in middle of clamp
        assert VecUtil.clamp(5, 0, 10) == 5;

        // Check value at bottom of clamp
        assert VecUtil.clamp(0.1, 0, 10) == 0.1;

        // Check value at top of clamp
        assert VecUtil.clamp(9.9, 0, 10) == 9.9;
        
    }

    /**
     * Ensure the values outside the clamp are clamped
     */
    @Test
    public void clampOutsideTest() {

        // Check value below clamp
        assert VecUtil.clamp(-1, 0, 10) == 0;

        // Check value above clamp
        assert VecUtil.clamp(11, 0, 10) == 10;
        
    }
}
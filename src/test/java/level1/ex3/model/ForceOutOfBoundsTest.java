package level1.ex3.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceOutOfBoundsTest {
    @Test
    public void testForceException(){
        ForceOutOfBounds force = new ForceOutOfBounds();
        try {
            force.forceException();
            fail();
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }
}
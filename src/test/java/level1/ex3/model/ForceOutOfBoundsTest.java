package level1.ex3.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceOutOfBoundsTest {
    @Test
    public void testForceException(){
        ForceOutOfBounds force = new ForceOutOfBounds();
        assertThrows(ArrayIndexOutOfBoundsException.class, force::forceException);

    }
}
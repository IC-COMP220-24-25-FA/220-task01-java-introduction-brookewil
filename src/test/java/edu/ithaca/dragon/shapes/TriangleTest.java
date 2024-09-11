package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void checkTriangle(){
        Triangle myTriangle = new Triangle(3, 5, 7);
        assertTrue(myTriangle.checkTriangle());

        Triangle myTriangle2 = new Triangle(1, 2, 3);
        assertFalse(myTriangle2.checkTriangle());
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }
}

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
    public void checkTriangleTest(){
        Triangle myTriangle = new Triangle(3, 5, 7);
        assertTrue(myTriangle.checkTriangle());

        Triangle myTriangle2 = new Triangle(1, 2, 3);
        assertFalse(myTriangle2.checkTriangle());
    }

    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(3, 5, 7);
        assertEquals(6.50, myTriangle.calcArea(), 0.01);
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3, 5, 7);
        myTriangle.doubleSize();
        // should be 6, 10, 14 now
        assertEquals(25.98, myTriangle.calcArea(), 0.01);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(3, 5, 7);
        assertEquals(7, myTriangle.longestLineWithin());
    }


    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }
}

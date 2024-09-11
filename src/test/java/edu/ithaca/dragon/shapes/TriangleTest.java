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
        Triangle myScaleneTriangle = new Triangle(3, 5, 7);
        assertEquals(6.50, myScaleneTriangle.calcArea(), 0.01);

        Triangle myIsoscelesTriangle = new Triangle(7, 7, 4);
        assertEquals(13.42, myIsoscelesTriangle.calcArea(), 0.01);
    }

    @Test
    public void doubleSizeTest(){
        Triangle myScaleneTriangle = new Triangle(3, 5, 7);
        myScaleneTriangle.doubleSize();
        // should be 6, 10, 14 now
        assertEquals(25.98, myScaleneTriangle.calcArea(), 0.01);

        Triangle myIsoscelesTriangle = new Triangle(7, 7, 4);
        myIsoscelesTriangle.doubleSize();
        // 14, 14, 7
        assertEquals(53.67, myIsoscelesTriangle.calcArea(), 0.01);

    }

    @Test
    public void longestLineWithinTest(){
        Triangle myScaleneTriangle = new Triangle(3, 5, 7);
        assertEquals(7, myScaleneTriangle.longestLineWithin());

        Triangle myIsoscelesTriangle = new Triangle(7, 7, 4);
        assertEquals(7, myIsoscelesTriangle.longestLineWithin(), 0.01);
    }


    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }
}

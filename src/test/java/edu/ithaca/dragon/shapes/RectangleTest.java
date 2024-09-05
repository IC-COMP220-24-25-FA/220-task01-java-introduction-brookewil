package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(2, 5);
        assertEquals(10, myRectangle.calcArea());
        
        myRectangle = new Rectangle(2.7, 3.1);
        assertEquals(8.37, myRectangle.calcArea(), 0.01);

        myRectangle = new Rectangle(0.01, 2);
        assertEquals(0.02, myRectangle.calcArea());
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }
}

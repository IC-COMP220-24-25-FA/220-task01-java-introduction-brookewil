package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.ithaca.dragon.shapes.Triangle;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }
    

    @Test
    public void calcSalePriceTest(){
        assertEquals(36.38, FunctionPractice.calcSalePrice(40, 15, 7));

    }

    @Test
    public void isGoodDogTest(){
        assertTrue(FunctionPractice.isGoodDog(2, 20, true));
        
        assertFalse(FunctionPractice.isGoodDog(4, 0, false));
        assertFalse(FunctionPractice.isGoodDog(5, 0, true));
        assertFalse(FunctionPractice.isGoodDog(7, 20, false));

    }

    @Test
    public void findFirstLargestTest(){
        ArrayList<Integer> testList1 = new ArrayList();
        testList1.add(1);
        testList1.add(2);
        testList1.add(3);
        testList1.add(4);
        assertEquals(4, FunctionPractice.findFirstLargest(testList1));

        ArrayList<Integer> testList2 = new ArrayList();
        testList2.add(2);
        testList2.add(3);
        testList2.add(2);
        testList2.add(1);
        assertEquals(3, FunctionPractice.findFirstLargest(testList2));

        ArrayList<Integer> testList3 = new ArrayList();
        assertEquals(-1, FunctionPractice.findFirstLargest(testList3));

    }
}

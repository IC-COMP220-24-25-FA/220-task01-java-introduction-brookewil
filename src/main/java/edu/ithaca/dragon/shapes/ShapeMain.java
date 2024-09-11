package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(3, 5));
        rectangles.add(new Rectangle(7, 4));
        rectangles.add(new Rectangle(12.7, 10));
        rectangles.add(new Rectangle(23, 31.2));
        rectangles.add(new Rectangle(17.7, 23.9));

        for (int i = 0; i < rectangles.size(); i++){
            Rectangle element = rectangles.get(i);
            System.out.println("Rectangle " + (i + 1) + " Area: " + element.calcArea());
            System.out.println("Rectangle " + (i + 1) + " Longest Line: " + element.longestLineWithin());
        }

        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
    }
}

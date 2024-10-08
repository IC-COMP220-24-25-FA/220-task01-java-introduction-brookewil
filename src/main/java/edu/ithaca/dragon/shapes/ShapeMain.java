package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class ShapeMain {
    
    public static void main(String[] args){

        // Create a list that holds shapes

        List<Shape> shapes = new ArrayList<>();

        // Create a loop that adds 10 shapes to the list, choosing randomly between whether each shape is a Circle, Rectangle, or triangle.
        
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            int shapeType = rand.nextInt(3);

            if (shapeType == 1){
                shapes.add(new Circle(Math.round(rand.nextDouble() * 1000.0) / 10.00));
            } if (shapeType == 2){
                shapes.add(new Rectangle((Math.round(rand.nextDouble() * 1000.00) / 10.00), (Math.round(rand.nextDouble() * 1000.00) / 10.00)));
            } else {
                shapes.add(new Triangle((Math.round(rand.nextDouble() * 1000.00) / 10.00), (Math.round(rand.nextDouble() * 1000.00) / 10.00), (Math.round(rand.nextDouble() * 1000.00) / 10.00)));
            }

        }

        // Print each shape (by calling toString on the Shape).

        for (int i = 0; i < shapes.size(); i++){
            System.out.println(shapes.get(i).toString());
        }

        // Then, write a loop that doubles the size of each shape and prints them again.

        for (int i = 0; i < shapes.size(); i++){
            shapes.get(i).doubleSize();
            System.out.println(shapes.get(i).toString());
        }


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

        for (int i = 0; i < 5; i++){
            Scanner userRectangle = new Scanner(System.in);
            System.out.println("Choose a Rectangle: ");
            int rectanglePick = userRectangle.nextInt();
        
            Rectangle pick = rectangles.get(rectanglePick - 1);
            pick.doubleSize();
            rectangles.set(rectanglePick, pick);


            for (int j = 0; j < rectangles.size(); j++){
                Rectangle element = rectangles.get(j);
                System.out.println("Rectangle " + (j + 1) + " Area: " + element.calcArea());
                System.out.println("Rectangle " + (j + 1) + " Longest Line: " + element.longestLineWithin());
            }
        }
    }
}

package edu.ithaca.dragon.shapes;

public class Triangle {
    double side1;
    double side2;
    double side3;

    // sum of the length of any two sides must be greater than the third side

    public Triangle(double sideLength1, double sideLength2, double sideLength3){
        side1 = sideLength1;
        side2 = sideLength2;
        side3 = sideLength3;
    }

    public double calcArea(){
        double area = (side1 * side2 * side3) / 2;
        return area
    }

    public double doubleSize(){
        throw new RuntimeException("Not Implemented");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not Implemented");
    }
}

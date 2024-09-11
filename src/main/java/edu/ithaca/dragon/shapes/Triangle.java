package edu.ithaca.dragon.shapes;

public class Triangle {
    double sideLength1;
    double sideLength2;
    double sideLength3;

    // sum of the length of any two sides must be greater than the third side

    public Triangle(double side1, double side2, double side3){
        sideLength1 = side1;
        sideLength2 = side2;
        sideLength3 = side3;
    }

    public double calcArea(){
        double area = (sideLength1 * side2 * side3) / 2;
        return area
    }

    public double doubleSize(){
        throw new RuntimeException("Not Implemented");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not Implemented");
    }
}

package edu.ithaca.dragon.shapes;

public class Triangle {
    double sideLength1;
    double sideLength2;
    double sideLength3;

    public Triangle(double side1, double side2, double side3){
        double sideLength1 = side1;
        double sideLength2 = side2;
        double sideLength3 = side3;
    }

    public double calcArea(){
        throw new RuntimeException("Not Implemented");
    }

    public double doubleSize(){
        throw new RuntimeException("Not Implemented");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not Implemented");
    }
}

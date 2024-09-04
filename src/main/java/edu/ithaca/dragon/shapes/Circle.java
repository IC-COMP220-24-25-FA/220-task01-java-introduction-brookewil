package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /* @return the radius */
    public double getRadius(){
        return radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area = radius * radius * Math.PI;
        return area;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        double size = radius * 2;
        radius = size;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
}

package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;
    
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       double area = length * width;
       return area;
    }

    public void doubleSize(){
       double updatedLength = length * 2;
       double updatedWidth = width * 2;
       length = updatedLength;
       width = updatedWidth;
    }

    public double longestLineWithin(){
        // length ^ 2 + width ^2
        double longest = (length * length) + (width * width);
        return longest;
    }
    
}

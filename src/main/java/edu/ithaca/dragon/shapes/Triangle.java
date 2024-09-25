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

    public boolean checkTriangle(){
        boolean isTriangle = side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;

        if (isTriangle){
            System.out.println("Is a triangle");
        } else {
            System.out.println("Not a triangle");
        }
        return isTriangle;
    }

    public double calcArea(){
        double semiperim = (side1 + side2 + side3) / 2;
        double heron = semiperim * ((semiperim - side1) * (semiperim - side2) * (semiperim - side3));
        double area = Math.sqrt(heron);
        return area;
    }

    public void doubleSize(){
        side1 *= 2;
        side2 *= 2;
        side3 *= 2;
    }

    public double longestLineWithin(){
        if (side1 >= side2 && side1 >= side3){
            return side1;
        } else {
            if (side2 >= side1 && side2 >= side3){
                return side2;
            } else {
                return side3;
            }
        }
    }

    public String toString(){
        return "This is a Triangle. Side 1 is " + side1 + ", Side 2 is " + side2 + ", and Side 3 is " + side3;
    }
}

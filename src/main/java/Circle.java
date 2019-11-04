import java.util.*;

//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
    // add your instances here
    private double x, y, radius; // declaration of private doubles needed
    // constructors
    // default constructor - to be modified
    public Circle() {} //does nothing

    // customized constructor - to be modified
    public Circle(double xV, double yV, double radiusV) {
        setX(xV); //sets parameter values to the private variables
        setY(yV);
        setRadius(radiusV);
        getX(); //gets the value that was declared with set method
        getY();
        getRadius();
    }
    
    //--------------------------------------------------------
    // toString - return a String representation of
    //            this circle in the following format:
    //            center:(x,y)
    //            radius: r
    //--------------------------------------------------------
    public String toString() {
        String strC = "center: (" + x + ", " + y + ")"; //string for center
        String strR = "Radius: " + radius; //string for radius
        return strC + "\n" + strR; //returns in format
    }

    //----------------------------------------------
    // getX - returns the value of x
    //----------------------------------------------
    public double getX() {
        return round(x); //gets x from input and rounds

    }
    

    //----------------------------------------------
    // getY - returns the value of y
    //----------------------------------------------
    public double getY() {
        return round(y); //gets y from input and rounds
    }
    
    //----------------------------------------------
    // getRadius - returns the value of radius
    //----------------------------------------------
    public double getRadius() {
        return round(radius); //get radius from inpus and rounds
    }

    //----------------------------------------------
    // setX - assigns a new value to x
    //----------------------------------------------
    public void setX(double xV) {
        x = xV; //sets the private x to input
    }
    

    //----------------------------------------------
    // setY - assigns a new value to y
    //----------------------------------------------
    public void setY(double yV) {
         y = yV; //sets the private y to input
    }   
    
    
    //----------------------------------------------
    // setRadius - assigns a new value to radius
    //----------------------------------------------
    public void setRadius(double radiusV) {
         if (radiusV >= 0) //only sets value if its valid, if not it will stay the same
            radius = radiusV; //sets the private radius to input
    }
    
    //--------------------------------------------------------
    // diameter - calculates the diameter of the circle
    //--------------------------------------------------------
    public double diameter() {
        return round(2 * radius); //returns diameter and rounds
    }
    

    //--------------------------------------------------------
    // area - returns the area of the circle
    //--------------------------------------------------------
    public double area() {
        return round(Math.PI * Math.pow(radius, 2.0)); //pi times radius^2 and rounds
    }

    //--------------------------------------------------------
    // perimeter - returns the perimeter of the circle
    //--------------------------------------------------------
    public double perimeter() {
        return round(2.0 * Math.PI * radius); //double 2 times pi times radius and rounds
    }
    
    //--------------------------------------------------------
    // isUnitCircle - return true if the radius of this circle
    //                is 1 and its center is (0,0) and false
    //                otherwise.
    //--------------------------------------------------------
    public boolean isUnitCircle() {
        if (radius == 1 && x == 0 && y == 0) //unit circle: r = 1 and center is at (0,0) 
            return true;
        return false;
    }

    public boolean equals(Circle anotherCircle) {
        if (anotherCircle.getX() == this.x && anotherCircle.getY() == this.y && anotherCircle.getRadius() == this.radius) //if each variable is the same
            return true;
        return false;
    }

    public boolean isConcentric(Circle anotherCircle) {
        if (anotherCircle.getX() == this.x && anotherCircle.getY() == this.y && anotherCircle.getRadius() != this.radius) // center is the same radius is not
            return true;
        return false;
    }

    public double distance(Circle anotherCircle) {
        double inner = Math.pow(this.x - anotherCircle.getX() , 2) + Math.pow(this.y - anotherCircle.getY() , 2); // (x-xa)^2 + (y-ya)^2
        double outter = Math.pow(inner, 0.5); //sqare roots number
        return round(outter); //rounds
    }

    public boolean intersects(Circle anotherCircle) {
        if (distance(anotherCircle) < this.radius + anotherCircle.getRadius()) // center is less than the tqo radi
            return true;
        return false;
    }

    // you are welcome to add more helper methods if needed
    public double round(double num) {
         return Math.round(num * 100.000) / 100.000; //rounds to 3 decimal places
    }
}

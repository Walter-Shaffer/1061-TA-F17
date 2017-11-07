/*
* [Circle].java
* Author: [Anthony Frazier]
* Submission Date: [10/27/17]
*
* Purpose:Creates the object circle and then does several operation on the object.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	

	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y
	
	//----------------------------------------------
	// Class Constructor: set the initial values of
	//                    the instance variables
	//                    for this circle
	//----------------------------------------------	
	public Circle(double x, double y,double  radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;  	   	
	}
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		return x;
		// Your code goes here	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return y;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return radius;
		// Your code goes here	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		this.x = newX;
		// Your code goes here	
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		this.y = newY;
		// Your code goes here	
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public double setRadius(double newRadius) {
		if(newRadius >= 0){
		radius = newRadius;
		}
		return radius;
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = 2 * radius;
		return diameter;
		// Your code goes here	
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = Math.PI* radius * radius;
		return area;
		// Your code goes here	
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = Math.PI * 2 * radius;
		return perimeter;
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		boolean isUnitCircle;
		if(radius == 1 && x == 0 && y == 0){
			isUnitCircle = true;
		}
		else{
			isUnitCircle = false;
		}
		return isUnitCircle;
		// Your code goes here	
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String center = "Center:(" + (x + y) + ")";
		String radius = "radius:" + this.radius;
		return center + radius;
	}
	public boolean equales(Circle anotherCircle){
		if(radius == anotherCircle.radius && x == anotherCircle.x && y == anotherCircle.y){
		return true;	
		}
		else{ return false;}
	}
	public boolean isConcentric(Circle anotherCircle){
		if(radius != anotherCircle.radius && x == anotherCircle.x && y == anotherCircle.y){
		return true;	
		}
		else{ return false;}
	}
	public double distance(Circle anotherCircle){
		return Math.sqrt(Math.pow(x-anotherCircle.x, 2)+Math.pow(y-anotherCircle.y, 2));
	}
	public boolean intersects(Circle anotherCircle){
		if(distance(anotherCircle) < (radius + anotherCircle.radius)){
		return true;	
		}
		else{ return false;}
	}
}

/**
* Circle.java
* Author: Ethan Coppenbarger
* Submission Date: 10/26/2017
*
* Purpose: Represent a circle with center and radius, contain methods to change the center and radius
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
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
	

	double radius;       // declare the private double instance  radius
	double x;      		 // declare the private double instance  x
	double y;      		 // declare the private double instance  y
	
	//----------------------------------------------
	// Class Constructor: set the initial values of
	//                    the instance variables
	//                    for this circle
	//----------------------------------------------	
	public Circle(double x, double y, double  radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;  	   	
	}
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		return x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return radius;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public double setX(double x) {
		this.x = x;
		return this.x;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public double setY(double y) {
		this.y = y;
		return this.y;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public double setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
		return radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = 2 * radius;
		return diameter;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		boolean isUnitCircle = false;
		if ((radius == 1) && (x == 0) && (y == 0)) {
			isUnitCircle = true;
		}
		return isUnitCircle;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String circleParameters = "center: (" + x + "," + y + ")\nradius: " + radius;
		return circleParameters;
	}
	
	
	//--------------------------------------------------------
	// equals - return true if the circles center and radius 
	//			equal that of another
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return (this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius == anotherCircle.radius);
	}
	
	
	//--------------------------------------------------------
	// equals - return true if the circles center 
	// 			equals that of another
	//--------------------------------------------------------
	public boolean isConcentric(Circle anotherCircle) {
		return (this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius != anotherCircle.radius);
	}
	
	
	//--------------------------------------------------------
	// distance - return the distance between the centers
	//			  of two circles
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y = anotherCircle.y, 2));
	}
	
	
	//--------------------------------------------------------
	// intersects - return true if the circles have an 
	//				overlapping radius (the distance between
	//				the centers is less than the radius)
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return distance(anotherCircle) < (this.radius + anotherCircle.radius);
	}
}

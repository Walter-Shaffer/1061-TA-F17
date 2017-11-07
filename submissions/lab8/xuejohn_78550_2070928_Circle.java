/*
 * Circle.java
 * Author: John Xue
 * Submission Date: Oct. 26, 2017
 *
 * Purpose: Use a class to represent and manipulate a circle
 * 
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

import java.lang.Math;
public class Circle {
	final double EPSILON = 1E-14; // declare a set interval for comparing doubles

	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;    // declare the private double instance  y
	
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
	public void setX(double x) {
			this.x = x;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
			this.y = y;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return 2 * radius;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.PI * radius * radius;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return Math.PI * this.diameter();
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (this.x == 0 && this.y == 0 && this.radius == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	//--------------------------------------------------------
	// equals - return true if the this circle and
	//          another circle have the same x, y, and radius
	//          values
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(this.getX() - anotherCircle.getX()) < EPSILON 
				&& Math.abs(this.getY() - anotherCircle.getY()) < EPSILON 
				&& Math.abs(this.getRadius() - anotherCircle.getRadius()) < EPSILON){
			return true;
		} else {
			return false;
		}
	}
	
	//--------------------------------------------------------
	// isConcentric - return true if the this circle and
	//                another circle have the same x, and y 
	//                values, but different radius values
	//--------------------------------------------------------
	public boolean isConcentric(Circle anotherCircle) {
		if (Math.abs(this.getX() - anotherCircle.getX()) < EPSILON 
				&& Math.abs(this.getY() - anotherCircle.getY()) < EPSILON 
				&& !(Math.abs(this.getRadius() - anotherCircle.getRadius()) < EPSILON)){
			return true;
		} else {
			return false;
		}
	}
	
	//--------------------------------------------------------
	// distance - return distance between this circle's and
	//            another circle's center
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.getX() - anotherCircle.getX(), 2) + 
				Math.pow(this.getY() - anotherCircle.getY(), 2));
	}
	
	//--------------------------------------------------------
	// intersects - returns true if this circle and
	//              another circle's distance from each other
	//              is less than the sum of their radii
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		if(this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius())) {
			return true;
		} else {
			return false;
		}
	}
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return "center: (" + x + "," + y + ")\nradius: " + radius;
	}

}

//*******************************************************
// Circle.java
//
// 
//*******************************************************
/*
* Circle.java
* Author: Jack Maggard
* Submission Date: 10/24/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program allows the user to create dimensions of two circles and includes a series
* of methods to be tested by the user.
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
public class Circle {

	private double radius; // declare the private double instance radius
	private double x; // declare the private double instance x
	private double y; // declare the private double instance y
	private double PI = Math.PI;

	// ----------------------------------------------
	// Class Constructor: set the initial values of
	// the instance variables
	// for this circle
	// ----------------------------------------------
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {//get the x value
		return x;
		// Your code goes here
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {//get the y value
		return y;
		// Your code goes here
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {//get the radius
		return radius;
		// Your code goes here
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double z) {//set the x value
		x = z;
		// Your code goes here
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double z) {//set the y value
		y = z;
		// Your code goes here
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double z) {//set the radius
		if (z > 0) {
			radius = z;
		}

		// Your code goes here
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {//calculate diameter
		return 2 * radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {//calculate area
		return PI * radius * radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {//calculate perimeter
		return 2 * PI * radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {//tell whether the circle is the unit circle
		if (radius == 1 && x == 0 && y == 0) {
			return true;
		} else
			return false;
		// Your code goes here
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {//converts values to string 
		return "Center: " + x + ", " + y + "\n" + "radius: " + radius;
		// Your code goes here
	}

	public boolean equals(Circle anotherCircle) {//if radius and center match
		if (anotherCircle.radius == this.radius && this.x == anotherCircle.x && this.y == anotherCircle.y)
			return true;
		else
			return false;

	}

	public boolean isConcentric(Circle anotherCircle) {//if only centers match
		if (anotherCircle.radius != this.radius && this.x == anotherCircle.x && this.y == anotherCircle.y)
			return true;
		else
			return false;
	}

	public double distance(Circle anotherCircle) {//calculate the distance between 2 circles
		double dist = Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));
		return dist;
	}
	public boolean intersects(Circle anotherCircle){//tell if circles intersect
		if (this.distance(anotherCircle)<this.radius+anotherCircle.radius)
			return true;
		else
			return false;
	}

}

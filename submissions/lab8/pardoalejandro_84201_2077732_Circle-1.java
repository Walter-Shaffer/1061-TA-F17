/*
* Circle.java
* Author:  Alejandro Pardo
* Submission Date:  October 27
* Purpose: This program introduces Object Oriented Programming
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
	public double getX() {
		return x;

	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {
		return y;

	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		return radius;

	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double x) {
		this.x = x;

	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double y) {
		this.y = y;

	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;

		}
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {
		return 2 * radius;
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		return Math.PI * (radius * radius);

	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		return 2 * Math.PI * radius;

	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {
		return (radius == 1) && (x == 0) && (y == 0);

	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {

		return "center: (" + x + "," + y + ")\nradius: " + radius;

	}

	public boolean equals(Circle anotherCircle) {
		return (this.x == anotherCircle.x) && (this.y == anotherCircle.y) && (this.radius == anotherCircle.radius);
	}

	public boolean isConcentric(Circle anotherCircle) {
		return (this.x == anotherCircle.x) && (this.y == anotherCircle.y)&&(this.radius!=anotherCircle.radius);
	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));
	}

	public boolean intersects(Circle anotherCircle) {
		return this.distance(anotherCircle)<(this.radius+anotherCircle.radius);
	}
}

/** 
 * 
 * Circle.java
 * Author: Jacky Wong
 * Submission Date: 10/26/2017
 * 
 * Purpose: A class that allows another to receive various data
 * on one or two different circles.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 *
 */

public class Circle {

	/** Declare instance variables */
	private double x;
	private double y;
	private double radius;
	
	/** Constructor: Sets initial values of instance variables */
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/** Returns value of x */
	public double getX() {
		return x;
	}
	
	/** Returns value of y */
	public double getY() {
		return y;
	}
	
	/** Returns value of radius */
	public double getRadius() {
		return radius;
	}
	
	/** Assigns new value to x */
	public void setX(double x) {
		this.x = x;
	}
	
	/** Assigns new value to y */
	public void setY(double y) {
		this.y = y;
	}
	
	/** Assigns new value to radius */
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
	}
	
	/** Calculates diameter of circle */
	public double diameter() {
		return 2 * radius;
	}
	
	/** Returns area of circle */
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	/** Returns perimeter of circle */
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	/** Whether circle is a unit circle */
	public boolean isUnitCircle() {
		if ((radius == 1) && (x == 0) && (y == 0)) {		// If radius equals 1 and (x,y)=(0,0)
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Returns string of circle's center and radius */
	public String toString() {								// Overrides default toString() method
		return "center: (" + x + "," + y + ")" + "\n" + "radius: " + radius;
	}
	
	/** Whether circles are equal */
	public boolean equals(Circle anotherCircle) {
		if (anotherCircle.radius == this.radius) {			// If radii of circles are equal
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Whether circles have same center */
	public boolean isConcentric(Circle anotherCircle) {
		if ((anotherCircle.x == this.x) && (anotherCircle.y == this.y)
										&& (anotherCircle.radius != this.radius)) {			// If circles are concentric as per lab instructions
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Returns distance between centers of circle */
	public double distance(Circle anotherCircle) { 
		double distance = Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));
		return distance;
	}
	
	/** Whether circles have intersecting area */
	public boolean intersects(Circle anotherCircle, Circle secondCircle) {
		if (anotherCircle.distance(secondCircle) < (anotherCircle.radius + secondCircle.radius)) {	// If distance between centers is less than sum of radii
			return true;
		}
		else {
			return false;
		}
	}
	
}

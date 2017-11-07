/*
* Circle.java
* Author: Heather Wright
* Submission Date: October 27, 2017
*
* Purpose: This purpose of this program is to test the methods
* written in circle.java. It has methods to measure the distance
* between the two circles, to test if they are equal, if they
* intersect, and if they are concentric. It also has methods to assign 
* values to the data of each circle.
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
public class Circle {
	
	private double radius;
	private double x;       
	private double y;      
	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;  	   	
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}	
	
	public void setRadius(double radius) {
		if(radius >= 0) {
			this.radius = radius;
		}
	}
	
	public double diameter() {
		return radius * 2;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public boolean isUnitCircle() {
		if(radius == 1 && x == 0 && y == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String center = "\ncenter: (" + x + ", " + y + ")\n";
		String stringRadius = "radius: " + radius;
		return center + stringRadius;
	}
	
	public boolean equals(Circle anotherCircle) {
		if(this.radius == anotherCircle.radius 
				&& this.x == anotherCircle.x
				&& this.y == anotherCircle.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isConcentric(Circle anotherCircle) {
		if(this.x == anotherCircle.x
				&& this.y == anotherCircle.y
				&& this.radius != anotherCircle.radius) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double distance(Circle anotherCircle) {
		double xDistance = this.x - anotherCircle.x;
		double yDistance = this.y - anotherCircle.y;
		return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
	}
	
	public boolean intersects(Circle anotherCircle) {
		if(anotherCircle.distance(anotherCircle) < (this.radius + anotherCircle.radius)) {
			return true;
		}
		else {
			return false;
		}
	}
}

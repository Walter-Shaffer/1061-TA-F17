/* 
LinkExtractor.java
Author: Sean Meade
Submission Date: 10/26
Purpose: Creates the class Circle with the variables necessary 
to find different kinds of information about any circles on a 
two-dimensional x,y plane. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
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
	public void setX(double newX) {
		this.x = newX;
	}
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		this.y = newY;
	}	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius >= 0){
			this.radius = newRadius;
		}
	}
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter(double diameter) {
		diameter = radius * 2;
		return diameter;
	}
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area(double area) {
		area = Math.PI * radius * radius;
		return area;
	}
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter(double perimeter) {
		perimeter = 2 * Math.PI * radius;
		return perimeter;	
	}
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle(boolean isUnitCircle) {
		if ((radius == 1) & (x == 0) & (y == 0)){
			isUnitCircle = true;
		}
		else
			isUnitCircle = false;
			return isUnitCircle;
	}
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() { 
		String circleValues = ("center: (" + x + "," + y + ")\nradius: " + radius);
		return circleValues;
	}
	
	//Returns true when the the circle executing the method has all the same values as anotherCircle.
	public boolean equals(Circle anotherCircle){ 
		if ((anotherCircle.radius == this.radius) & (anotherCircle.x == this.x) & (anotherCircle.y == this.y)){
			return true;
		}
		else
			return false;
	}
	
	//Returns true when the circle executing the method has the same center as anotherCircle but their radius is different. 
	public boolean isConcentric(Circle anotherCircle){ 
		if ((anotherCircle.radius != this.radius) & (anotherCircle.x == this.x) & (anotherCircle.y == this.y)){
			return true;
		}
		else
			return false;
	}
	
	//Computes the distance between the circle executing the method and anotherCircle.
	public double distance(Circle anotherCircle){ 
		double distance = Math.sqrt(Math.pow((this.x - anotherCircle.x),2) - Math.pow((this.y - anotherCircle.y),2));
		return distance;
	}
	
	//Returns true if the distance between the circle executing the method and anootherCircle is less than the sum of their radiuses. 
	public boolean intersects(Circle anotherCircle){ 
		if (this.distance(anotherCircle) < (this.radius + anotherCircle.radius)){
			return true;
		}
		else
			return false;
	}

}
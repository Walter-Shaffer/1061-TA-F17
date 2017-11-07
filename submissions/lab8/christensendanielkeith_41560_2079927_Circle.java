/*
* Circle.java
* Author: Daniel Christensen
* Submission Date: 10/27/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
	

	private double radius;     // declare the private double instance  radius
	private double x;     // declare the private double instance  x
	private double y;      // declare the private double instance  y
	
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
		x = newX;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		y = newY;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius>=0) {
			radius = newRadius;
		}//leaves radius unchanged if newRadius is invalid
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return 2*radius;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = Math.PI*radius*radius;
		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if(radius==1 && x==0 && y==0) {
			return true;
		}
		else {
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
		
		
		String output = String.format("center: ("+x+","+y+")%nradius: "+radius) ;
		return output;
	}
	
	public boolean equals(Circle anotherCircle) {
		return  (x == anotherCircle.getX() && y == anotherCircle.getY() && radius == anotherCircle.getRadius()); 
	}
	
	public boolean isConcentric(Circle anotherCircle) {
		return (x == anotherCircle.getX() && y == anotherCircle.getY() && radius != anotherCircle.getRadius());
	}
	
	public double distance(Circle anotherCircle) {
		return Math.sqrt((this.x-anotherCircle.getX())*(this.x-anotherCircle.getX()) + (this.y-anotherCircle.getY())*(this.y-anotherCircle.getY()));
	}
	
	public boolean intersects(Circle anotherCircle) {
		return this.radius+anotherCircle.getRadius()>=Math.sqrt((this.x-anotherCircle.getX())*(this.x-anotherCircle.getX()) + (this.y-anotherCircle.getY())*(this.y-anotherCircle.getY()));
	}

}

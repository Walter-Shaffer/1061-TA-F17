/*
* Circle.java
* Author: Andrew Padgett
* Submission Date: 10/26/17
*
* Purpose: Contains methods that calculate various aspects of
* 		   of circles (such as area, diameter, and perimeter) 
* 		   and compares two chosen circles (distance, concentric,
* 		   equal, intersects) 
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
	

	private double x;       // declare the private double instance  radius
	private double y;		// declare the private double instance  x
	private double radius;  // declare the private double instance  y
	
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
		if (newRadius >= 0)
			radius = newRadius;
		else;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return radius * 2;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.PI * (radius * radius);
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (radius == 1 && x == 0 && y == 0)
			return true;
		else
			return false;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String output = "center: (" + x + "," + y + ")\nradius:  " + radius;
		return output;
		
	}
	
	//--------------------------------------------------------
	// equals - return true if the radius, x value, and y
	//			value of this circle and anotherCircle are
	//			equal
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle){
		if (radius == anotherCircle.radius && x == anotherCircle.x && y == anotherCircle.y)
			return true;
		else
			return false;
	}
	
	//--------------------------------------------------------
	// isConcentric - return true the radius of this circle
	//				  and another Circle are equal but their
	//				  x and y values are different
	//--------------------------------------------------------	
	public boolean isConcentric(Circle anotherCircle){
		if (x == anotherCircle.x && y == anotherCircle.y && radius != anotherCircle.radius)
			return true;
		else
			return false;
	}
	
	//--------------------------------------------------------
	// distance - return distance between the center of this
	//			  circle and anotherCircle
	//--------------------------------------------------------	
	public double distance(Circle anotherCircle){
		return Math.sqrt(Math.pow((x - anotherCircle.x), 2) + Math.pow((y - anotherCircle.y), 2));
	}
	
	//--------------------------------------------------------
	// intersects - return true if the distance between the
	//			    circles are less than the sum of their
	//			    radius
	//--------------------------------------------------------	
	public boolean intersects(Circle anotherCircle){
		if(distance(anotherCircle) < (radius + anotherCircle.radius))
				return true;
		else
			return false;
	}
	
	//--------------------------------------------------------
	// writeOutput - prints the results of the equals method,
	//				 isConcentric method, distance method, and
	//				 intersects method using this circle and
	//				 anotherCircle
	//--------------------------------------------------------
	public void writeOutput(Circle circle, Circle anotherCircle){
		System.out.println("Circles are equal: \t\t" + circle.equals(anotherCircle) + 
		"\nCircles are concentric: \t" + circle.isConcentric(anotherCircle) +
		"\nDistance between circles: \t" + circle.distance(anotherCircle) +
		"\nCircles intersect: \t\t" + circle.intersects(anotherCircle) + "\n");
	}

}
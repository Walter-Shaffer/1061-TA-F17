/*
 Circle.java
 Author: Hunter Singletary
 Submission Date: 10/27/2017

 Purpose: Sets up circles for testing with CircleTester.java

 Statement of Academic Honesty:

 The following code represents my own work. I have neither
 received nor given inappropriate assistance. I have not copied
 or modified code from any source other than the course webpage
 or the course textbook. I recognize that any unauthorized
 assistance or plagiarism will be handled in accordance
 with the policies at Clemson University and the
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
	

	private double radius;      // declare the private double instance  radius
	private double x;	        // declare the private double instance  x
	private double y;	        // declare the private double instance  y
	
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
		if (radius >= 0)
		this.radius = radius;
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
		double area = Math.PI * (radius * radius);
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
		if (x == 0 && y == 0 && radius == 1)
			return true;
		else return false;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String toReturn = "";
		toReturn += "center: (" + x + ','  + y + ")\n";
		toReturn += "radius: " + radius;
		return toReturn;
	}

	/*
	 * equals - returns a value of true or false depending on if 
	 * the circles have the same values or not
	 */
	
	public boolean equals(Circle anotherCircle){
		if (this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius == anotherCircle.radius)
		return true;
		else return false;
	}
	
	/*
	 * isConcentric - returns a boolean value of true or false if the circles have
	 * the same center but different radii
	 */
	public boolean isConcentric(Circle anotherCircle){
		if (this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius != anotherCircle.radius)
			return true;
		else return false;
	}
	/*
	 * distance - calculates the distance between the radii of two circles 
	 * and returns it as a double
	 */
	public double distance(Circle anotherCircle){
		double distance = Math.sqrt(Math.pow((this.x - anotherCircle.x), 2) + Math.pow((this.y - anotherCircle.y),2));
		return distance;
	}
	
	/*
	 * intersects - returns true if two circles intersect and false if they do not.
	 */
	public boolean intersects(Circle anotherCircle){
		if (this.distance(anotherCircle) < this.radius + anotherCircle.radius)
			return true;
		else return false;
	}
}



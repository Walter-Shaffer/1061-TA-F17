//*******************************************************
// Circle.java
//
// 	
/*
	* Circle.java
	* Author: Taylor Hennessy
	* Submission Date: 10/24/2017
	*
	* Purpose: This program creates a circle class that makes
	* circle objects with necessary methods and properties.
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
public class Circle {
	

	private double x;       // declare the private double instance  radius
	private double y;       // declare the private double instance  x
	private double radius;       // declare the private double instance  y
	
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
		
		// return the x variable
		return this.x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		//return the y variable
		return this.y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		// return the radius value
		return this.radius;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		
		//set this x to the new x
		this.x = newX;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		
		//set this y to the new y
		this.y = newY;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRad) {
		
		//if the new radius is greater than or equal to zero
		if (newRad >= 0)
		{
			//set the radius to the new radius
			this.radius = newRad;
		}
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		//compute and return the diameter
		return (2 * radius);
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		//compute and return the area
		return (Math.PI * (radius * radius));
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		//compute and return the perimeter
		return (Math.PI * 2 * radius);
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		// if the radius is 1 and x and y are 0
		if ((radius == 1.0) && (x == 0.0) && (y == 0.0))
		{
			return true;
		}
		else
		{
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
		
		//return the string of things
		return "center: (" + this.x + "," + this.y + ") \nradius: " + this.radius;
	}
	
	//--------------------------------------------------------
	// equals - return true if the 2 circles have the same center
	//          and radius. Otherwise, returns false.
	//--------------------------------------------------------

	public boolean equals(Circle anotherCircle) {
		//if all these things are equal, return true, otherwise, return false
		if ((this.radius == anotherCircle.getRadius()) && (this.x == anotherCircle.getX()) && (this.y == anotherCircle.getY()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//--------------------------------------------------------
	// isConcentric - return true if the 2 circles have the same center
	//          	and different radius. Otherwise, returns false.
	//--------------------------------------------------------

	public boolean isConcentric(Circle anotherCircle) {
		//if all these things are equal, other than radius, return true, otherwise, return false
		if (!(this.radius == anotherCircle.radius) && (this.x == anotherCircle.getX()) && (this.y == anotherCircle.getY()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//--------------------------------------------------------
	// distance - calculates the distance between the two centers
	//            of the two circles.
	//--------------------------------------------------------

	public double distance(Circle anotherCircle) {

		//return the distance by calculating it
		return Math.sqrt(Math.pow((this.x - anotherCircle.getX()), 2)+Math.pow((this.y - anotherCircle.getY()), 2));

	}
	
	//--------------------------------------------------------
	// intersects - return true if the 2 circles have an intersecting area
	//--------------------------------------------------------

	public boolean intersects(Circle anotherCircle) {
		//if all these things are equal, other than radius, return true, otherwise, return false
		if (this.distance(anotherCircle) < (this.radius + anotherCircle.getRadius()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

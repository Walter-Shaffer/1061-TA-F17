/*
* Circle.java
* Author: Andrew Bare
* Submission Date: 10/27/17
*
* Purpose: 
* 
* This class is a circle class that contains the characteristics
* of a circle, and contains methods to manipulate those characteristics
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
		this.setRadius(radius);  	   	
	}
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return this.x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return this.y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return this.radius;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double replace) {
		
		this.x=replace;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double replace) {
		
		this.y=replace;	
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double replace) {
		//checks for correct input
		if (replace >=0)		
		this.radius = replace;
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
		
		return Math.PI*radius*radius;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return 2*Math.PI*radius;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		//checks if center and radius is ok
		if (radius == 1 && this.x == 0 && this.y == 0)
		{
			return true;
		}
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
		return "center: (" + this.x + ", " +this.y + ")\nradius: "+ this.radius; 		
	}
	
	//checks to see if the given circle is equal to the called circle
	public boolean equals(Circle anotherCircle){
		//checks to make sure ALL is correct
		if (this.x == anotherCircle.getX()&&
				this.y == anotherCircle.getY() &&
				this.radius == anotherCircle.getRadius())
		{
			return true;
		}
		else
			return false;
	}
	
	//checks to see if the given circles are concentric
	public boolean isConcentric(Circle anotherCircle)
	{
		//checks to make sure ALL is correct
		if (this.x == anotherCircle.getX()&&
				this.y == anotherCircle.getY() &&
				this.radius != anotherCircle.getRadius())
		{
			return true;
		}
		else
			return false;
	}
	
	//calculates the distance between the centers
	public double distance(Circle anotherCircle)
	{
		return Math.sqrt(Math.pow((this.x-anotherCircle.x), 2)+ Math.pow((this.y-anotherCircle.y), 2));
	}
	
	//checks as to whether or not the circles intersect
	public boolean intersects(Circle anotherCircle)
	{
		if (this.distance(anotherCircle)<this.radius+anotherCircle.radius)
			return true;
		else
			return false;
	}

}

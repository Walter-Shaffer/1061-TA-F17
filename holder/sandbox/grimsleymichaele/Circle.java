/*
* Circle.java
* Author: Michael Grimsley
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
//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	

	private double radius;
	private double y;
	private double x;
	
	public Circle(double x, double y,double  radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;  	   	
	}
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX(){
		return this.x;
		// Your code goes here	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return this.y;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return this.radius;
		// Your code goes here	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		this.x = x;
		// Your code goes here	
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		 this.y=y;
		// Your code goes here	
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if (radius > 0)
		this.radius = radius;
		
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return 2*this.radius;
		// Your code goes here	
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.PI*(this.radius*this.radius);
		// Your code goes here	
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return 2*Math.PI*radius;
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		return radius == 1 && x == 0 && y == 0;
		// Your code goes here	
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return "Center: " +x+ +y+ "\nRadius: " +radius;
	}
	
	public boolean equals(Circle anotherCircle){
    return this.radius == anotherCircle.getRadius() && this.y == anotherCircle.getY() && this.x == anotherCircle.getX() ;  
	}
	public boolean isCocentric(Circle anotherCircle){
	return this.radius != anotherCircle.getRadius() && this.y == anotherCircle.getY() && this.x == anotherCircle.getX() ;  
	 
	}
	public double distance(Circle anotherCircle){
		return Math.sqrt((Math.pow(this.x-anotherCircle.getX(),2)) + (Math.pow(this.y-anotherCircle.getY(),2))); 
	}
	public boolean intersects(Circle anotherCircle){
		return radius + anotherCircle.getRadius() > this.distance(anotherCircle) && (this.isCocentric(anotherCircle)==false || this.equals(anotherCircle) == true);
	}
	
}

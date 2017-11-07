//*******************************************************
// Circle.java
//
// 
//*******************************************************
/*
* Author: Lydia Shealy
* Submission Date: 10/27/17
*
* Purpose: A client to test the functionality of objects
* of the class Circle
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
	

	private double radius;       // declare the private double instance  radius
	private double x;      		 // declare the private double instance  x
	private double y;       	 // declare the private double instance  y
	
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
		else 
			System.out.println("Radius can't be negative.");
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return 2 * radius; 
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * radius * radius; 
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return Math.PI * 2 * radius; 
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if (radius > 0 && x == 0 && y == 0)
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
		
		//System.out.println("center: " + "(" + x + "," + y + ")");
		//System.out.println("radius: " + radius); 
		return ("center: " + "(" + x + "," + y + ")" + 
				"radius: " + radius);
				
		
	}
	
	public boolean equals(Circle anotherCircle){
		/*if (this.radius == 1 ){
			return true; 
		}
		else{
			return false; 
		}*/
		return (radius == anotherCircle.radius) &&
				(x == anotherCircle.x) &&
				(y == anotherCircle.y); 
	}
	
	public boolean isConcentric(Circle anotherCircle){
		return (x == anotherCircle.x) &&
				(y == anotherCircle.y) &&
				(radius != anotherCircle.radius); 
				
	}
	
	public double distance(Circle anotherCircle){
		double distance; 
		distance = Math.sqrt(Math.pow((x-anotherCircle.x), 2)+Math.pow(y-anotherCircle.y, 2));
		return distance; 
	}
	
	
	//////////need to do this one and then perform other tests, format it so it looks less acoustic 
	public boolean intersects(Circle anotherCircle){
		return (this.distance(anotherCircle) < this.radius + anotherCircle.radius); 
	}

}
/*
* [Circle].java
* Author: [Jason Battaglini]
* Submission Date: [10/27/17]
*
* Purpose: Calculates various measurements and properties of two circles.
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
	

	private double radius;// declare the private double instance  radius
	private double x;// declare the private double instance  x
	private double y;// declare the private double instance  y
	
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
		
		this.x=x;
		//x=0;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		this.y=y;	
		//y=0;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		
		this.radius=radius;	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return radius*2;	
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
		
		return Math.PI*radius*2;	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if ((radius==1)&&(x==0)&&(y==0))
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
		return ("center: ("+ getX() + "," + getY()+ ")\nradius: " + getRadius());
		
		
		// Your code goes here	
	
	}
	
	public boolean isConcentric(Circle anotherCircle){ 
		if ((this.getX() == anotherCircle.getX())&&(this.getY()==anotherCircle.getY())
				&&(this.getRadius()>anotherCircle.getRadius())||(this.getRadius()<anotherCircle.getRadius())) 
			return true;
		else
		return false;
	}
	
	public double distance(Circle anotherCircle){
		
		
		return Math.sqrt((Math.pow((this.getX()-anotherCircle.getX()),2) + Math.pow((this.getY()-anotherCircle.getY()),2)));
		
		

}
	
	public boolean equals(Circle anotherCircle){
		return (this.getRadius()==anotherCircle.getRadius())&&(this.getY()==anotherCircle.getY())&&(this.getX()==anotherCircle.getX());
	}
	
	public boolean intersects(Circle anotherCircle){
		if(this.distance(anotherCircle)<(this.getRadius()+ anotherCircle.getRadius())) 
			return true; 
		else 
			return false;
	}
}
//}


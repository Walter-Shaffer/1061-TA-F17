/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: October 27, 2017
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
		// Your code goes here	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return y;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return radius;
		// Your code goes here	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		x = newX;
		// Your code goes here	
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		y = newY;
		// Your code goes here	
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius <=0){
			System.out.println("Error: Radius must greater than 0.");
		}
		else{
			radius = newRadius;
		}
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = radius *2;
		return diameter;
		// Your code goes here	
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = Math.PI*radius*radius;
		return area;
		// Your code goes here	
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = radius*2*Math.PI;
		return perimeter;
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		boolean isUnitCircle;
		if(radius ==1 && x == 0 && y ==0){
			isUnitCircle = true;
		}
		else{
			isUnitCircle = false;
		}
		return isUnitCircle;
		// Your code goes here	
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String output = new String("center: ("+this.x+","+y+")\nradius: "+radius);
		return output;
		// Your code goes here	
	}
	public boolean equals(Circle anotherCircle){
		boolean isEqual;
		if(anotherCircle.getX()==this.x && anotherCircle.getY()==this.y && anotherCircle.getRadius()==this.radius){
			isEqual = true;
		}
		else{
			isEqual = false;
		}
		return isEqual;
	}
	public boolean isConcentric(Circle anotherCircle){
		boolean isConcentric;
		if(anotherCircle.getRadius()!=this.radius && anotherCircle.getX()==this.x && anotherCircle.getY()==this.y){
			isConcentric = true;
		}
		else{
			isConcentric = false;
		}
		return isConcentric;
	}
	public double distance(Circle anotherCircle){
		return Math.sqrt(Math.pow(anotherCircle.getX()-this.x,2)+Math.pow(anotherCircle.getY()-this.y, 2));
	}
	public boolean intersects(Circle anotherCircle){
		return this.distance(anotherCircle) > (this.radius+anotherCircle.getRadius());
	}

}

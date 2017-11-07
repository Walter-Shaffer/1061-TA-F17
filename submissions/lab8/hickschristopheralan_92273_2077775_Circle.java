/*
 * Circle.java
 * Author: Christopher Hicks
 * Submission Date 10/23/2017
 * 
 * Purpose: To be able to access modifiers, instance variables, and methods.
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
	

	private double radius;	// declare the private double instance  radius
	private double x; 		// declare the private double instance  x
	private double y;		// declare the private double instance  y
	private double setRadius; // declares the private double for setRadius
	private double distance;  // declares the private double for distance
	
	//Constructor for Public class Circle
	public Circle(double x, double y,double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;  	   	
	}
	
	
	// Gets and returns x
	public double getX() {
		
		return x;
	}
	

	// Gets and returns y
	public double getY() {
		
		return y;
	}
	
	// Gets and returns radius 
	public double getRadius() {
		
		return radius;
	}

	// Sets x so it can be used 
	public void setX(double x) {
		
		this.x = x;
	}
	

	// Sets y so it can be used 
	public void setY(double y) {
		
		this.y = y;
	}	
	
	
	// Sets radius so it can be used 
	public void setRadius(double radius) {
		
	if (radius > 0){
		 this.radius = radius;
		}
		else{}
	}
	
	// Computes diameter 
	public double diameter( ) {
		
		double diameter = 2 * radius; 
		return diameter;
	}
	

	// Computes area 
	public double area( ) {
		
		double area = Math.PI * (radius * radius);
		return area;
	}

	// Computes perimeter
	public double perimeter( ) {
		
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	// Computes if circle is unit circle
	public boolean isUnitCircle() {
		boolean UnitCircle;
		if (y == 0 && x == 0 && radius ==1) 
			UnitCircle = true;
	
		else 
			UnitCircle = false;
		return UnitCircle;
	}
	// Puts the circles values in a string for use in printing 
	public String toString() {
		
		return "center:	" + "(" + x + "," + y + ")" + "\nradius:	" + radius;
	}
	// Tests to see if 2 circles are equal
	public boolean equals(Circle anotherCircle){
		boolean equal;
		if (x == anotherCircle.x && y == anotherCircle.y && radius == anotherCircle.radius)
			equal = true;
		else
			equal = false;
		return equal;
			
	}
	// Tests to see if 2 circles are Concentric
	public boolean isConcentric(Circle anotherCircle){
		boolean isConcentric;
		if (x == anotherCircle.x && y == anotherCircle.y && radius!= anotherCircle.radius)
			isConcentric = true;
		else 
			isConcentric = false;
		return isConcentric;
	}
	// Computes the distance between 2 circles
	public double distance(Circle anotherCircle){
		distance = Math.sqrt( Math.pow(anotherCircle.x - x,2)
				+ Math.pow(anotherCircle.y - y, 2));
		
		return distance;
	}
	// Tests to see if 2 circles are intersecting
	public boolean intersects(Circle anotherCircle){
		boolean intersects;
		
		if (radius + anotherCircle.radius > distance + anotherCircle.distance)
			intersects = true;
		else 
			intersects = false;
		return intersects;
	}
		
	
}


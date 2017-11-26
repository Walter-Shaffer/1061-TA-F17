/* CircleTester.java 
 * Author:  Alex Dobrenen 
 * Submission Date:   October 27 
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Make circles
 * Statement of Academic Honesty:  
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
	

	double radius;       // declare the private double instance  radius
	double x;       // declare the private double instance  x
	double y;       // declare the private double instance  y
	
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
	public void setX(double c) {
		
		this.x = c;	
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double c) {
		
		this.y = c;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double c) {
		if(c >= 0)
			this.radius = c;	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double c;
		c = 2 * radius;
		return c;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double c;
		c = Math.PI * (radius * radius);
		return c;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double c;
		c = 2 * Math.PI * radius;
		return c;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if((radius == 1) && (x == 0) && (y == 0))
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
		
		String c = "";
		c = "Center: (" + x + ", " + y + ") \n" + "Radius: " + radius + "\n";
		return c;
	}
	
	//Compares radius of circles
	public boolean equals(Circle anotherCircle)
	{
		if(this.getRadius() == anotherCircle.getRadius())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Opposite of equals
	public boolean isConcentric(Circle anotherCircle)
	{
		if(this.getRadius() != anotherCircle.getRadius())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Calculate distance from the centers of each circle
	public double distance(Circle anotherCircle)
	{
		double c = Math.sqrt(Math.pow(this.getX() - anotherCircle.getX(), 2) +
				Math.pow(this.getY() - anotherCircle.getY(), 2));
		return c;
	}
	
	//Check if 2 circles intersect
	public boolean intersects(Circle anotherCircle)
	{
		if(this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

//*******************************************************
////Submission Date: 10/26/2017
//Purpose: Sets and returns various values and tests if circles are equal, concentric, and calculates distance between and if they intersect.
//Statement of Academic Honesty:
//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance
//with the policies at Clemson University and the
//policies of this course. I recognize that my work is based
//on an assignment created by the School of Computing
//at Clemson University. Any publishing or posting
//of source code for this project is strictly prohibited
//unless you have written consent from the instructor.
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
	public void setX(double x) {
		this.x = x;
		// Your code goes here	
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		this.y = y;
		// Your code goes here	
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
		else {
			System.out.println("The radius is invalid");
		}
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = this.radius * 2;
		return diameter;
		// Your code goes here	
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = this.radius * this.radius * Math.PI;
		return area;
		// Your code goes here	
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = this.radius * 2 * Math.PI;
		return perimeter;
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (this.radius == 1 && this.x == 0 && this.y == 0) {
			return true;
		}
		else {
			return false;
		}
		// Your code goes here	
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String circleString = ("center: (" + this.x + ", " + this.y + ")\nradius: " + this.radius);
		return circleString;	
	}
	public boolean equals(Circle anotherCircle) {
		if (this.radius == anotherCircle.radius && this.x == anotherCircle.x && this.y == anotherCircle.y) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isConcentric(Circle anotherCircle) {
		if (this.radius != anotherCircle.radius && this.x == anotherCircle.x && this.y == anotherCircle.y) {
			return true;
		}
		else {
			return false;
		}
	}
	public double distance(Circle anotherCircle) {
		double distance = (Math.sqrt((this.x-anotherCircle.x) * (this.x-anotherCircle.x) + (this.y-anotherCircle.y) * (this.y-anotherCircle.y)));
		return distance;
	}
	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < (this.radius + anotherCircle.radius)) {
			return true;
		}
		else {
			return false;
		}
	}

}

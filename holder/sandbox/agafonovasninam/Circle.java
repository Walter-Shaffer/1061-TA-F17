/*
* Circle.java
* Author:  Nina Agafonovas
* Submission Date:  October 26, 2017
* Purpose:  Practice using access modifiers, instance variables,  methods calling other methods, and accessor and mutator methods.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
	

	private double radius;      // declare the private double instance  radius
	private double x;			// declare the private double instance  x
	private double y;      		// declare the private double instance  y
	
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
	public void setX(double x) {
		this.x = x ;

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
		
		if (radius > 0){
			this.radius = radius;
			}
		}
		
		// Your code goes here	
	
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = 2 * radius;
		return diameter;
		
		// Your code goes here	
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.PI * (radius * radius);
		// Your code goes here	
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return 2 * Math.PI * radius;
		
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
			// Your code goes here
		
		
		if (this.radius == 1 && x == 0 && y == 0){
			return true;
		} 
		else {
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
		// Your code goes here
		
		return String.format("center: (" + x +" , "+ y + ")" +
				"\tradius:" + radius);
			
	}
	
	
	
		//this method returns true when the radius and both centers are equal
	public boolean equals(Circle anotherCircle){
		if ( this.radius == anotherCircle.getRadius() && this.x == anotherCircle.getX() && this.y == anotherCircle.getY()){
			return true;
		}
		else {
			return false;
	}
	}
		//this method returns true when the centers are the same, but the radius are not.
		
		
		public boolean isConcentric(Circle anotherCircle) {
			if ( this.x == anotherCircle.getX() && this.y == anotherCircle.getY() && this.radius != anotherCircle.getRadius()){
				return true;
			}
			else {
				return false;
			}
		}
		public double distance(Circle anotherCircle){
			
			double changeX = Math.pow(this.x - anotherCircle.getX(), 2);
			double changeY = Math.pow(this.y - anotherCircle.getY(), 2);
			double distance =  Math.sqrt(changeX +changeY);
			return distance;
		}
			
		public boolean intersects(Circle anotherCircle){
			if (this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius()) && (this.isConcentric(anotherCircle) == false)){
				return true;
			}
			else 
			{
				return false;
			}
			
					
		}

					
	
				
			
		}



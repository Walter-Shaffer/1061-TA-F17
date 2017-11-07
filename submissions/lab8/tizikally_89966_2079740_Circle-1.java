/* Circle.Java
* Author: Allison Tizik
* Submission Date: 10/26/17
* Purpose: The program takes input from circleTester and through
* methods stores x values, y values, and radius. From the values 
* it finds the circles permiter, diameter and area. After that 
* it then compares the circles. Compares if they are equal, if
* they are concentric, how far their distance is to each other, 
* and if they intersect. It also checks if they are unit circles,
* and all these answers are returned to be printed out in
* the circleTester.
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
	

	private double radius;   // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;      // declare the private double instance  y
	
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
	public double  getRadius() {
		return radius;
		
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
			this.x= x;	
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		this.y = y;
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if (radius <= 0){
			radius = this.radius;
		}else{
			this.radius = radius;
		}
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return Math.pow(radius, 2);
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * Math.pow(radius, 2);
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
		
		if (radius == 1){
		return true;
		}else{
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
		
		return "center:" + "(" + this.x + "," + this.y + ")" 
				+ "\nradius:" + this.radius;
		
	
	}
	
	//checking if the circles equal each other by seeing if the x and y values and radius are equal.
	//returning true or false
	public boolean equals(Circle anotherCircle){
		if (this.x == anotherCircle.getX() && this.y == anotherCircle.getY() && this.radius == anotherCircle.getRadius()) {
			return true;
					
		}else{
			return false;
		}
	}
	
	//checking if the circles are concentric. 
	// x and y are equal but the radius is not.
	//returning true or false
	public boolean isConcentric(Circle anotherCircle){
		if (x == anotherCircle.getX() && y == anotherCircle.getY() && (radius != anotherCircle.getRadius())){
			return true;
		}else{
			return false;
		}
	}
	
	//math equation to return the distance between the circles.
	public double distance(Circle anotherCircle){
		return Math.sqrt((Math.pow((this.x - anotherCircle.getX()), 2)+ Math.pow(this.y - anotherCircle.getY(), 2)));
				
		 
	}
	
	//checking if the circles intersect by the distance between the circles and how 
	//big the radius is.
	public boolean intersects(Circle anotherCircle){
		if (distance(anotherCircle) < this.radius + anotherCircle.getRadius() ){
			return true;
		}else{
			return false;
		}
	}
}

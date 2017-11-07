/*
*Circle.java
* Author:  David McDonough
* Submission Date:  October 27th
* Purpose: Calculates the amount of months needed to pay off credit card debt with interest.
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
		private double x;      // declare the private double instance  x
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
		public double setX(double x) {
			if(x >= 0){
				return this.x = x;
			}
			else{
			return this.x;	
			}
		
		}
		

		//----------------------------------------------
		// setY - assigns a new value to y
		//----------------------------------------------
		public double setY(double y) {
			if(y >= 0){
				return this.y = y;
			}
			else{
			return this.y;
			}
		}	
		
		
		//----------------------------------------------
		// setRadius - assigns a new value to radius
		//----------------------------------------------
		public double setRadius(double radius) {
			
			if (radius >= 0){
			return this.radius = radius;
			}
			else{
				return this.radius;
			}
		}
		
		//--------------------------------------------------------
		// diameter - calculates the diameter of the circle
		//--------------------------------------------------------
		public double diameter() {
			
			double diameter;
			diameter = radius * 2;
			return diameter;
		}
		

		//--------------------------------------------------------
		// area - returns the area of the circle
		//--------------------------------------------------------
		public double area() {
		
			double area;
			area = Math.PI * (radius * radius); 
			return area;
		}

		//--------------------------------------------------------
		// perimeter - returns the perimeter of the circle
		//--------------------------------------------------------
		public double perimeter() {
			
			double perimeter;
			perimeter = 2 * Math.PI * radius;
			return perimeter;
		}
		
		//--------------------------------------------------------
		// isUnitCircle - return true if the radius of this circle
		//                is 1 and its center is (0,0) and false
		//      	      otherwise.
		//--------------------------------------------------------
		public boolean isUnitCircle() {
			
			if (radius == 1 && x == 0 && y == 0){
				return true;
		}
			else{
				return false;
			}
		}
		
		//--------------------------------------------------------
		// toString - return a String representation of
		//            this circle in the following format:
		//            center:(x,y)
		//            radius: r
		//--------------------------------------------------------
		public String toString(){
			return "center: " + x + "," + y + "\n" + "radius: " + radius;
			
		}

		//method that compares two circles and tests if they have the same center and radius
		public boolean equals(Circle anotherCircle){
			
			if(radius == anotherCircle.getRadius() && x == anotherCircle.getRadius() && y == anotherCircle.getRadius()){
			return true;
		}
			else{
				return false;
			}
		}
		
		//method that tests if two circles are have the same center
		public boolean isConcentric(Circle anotherCircle){
			if(x == anotherCircle.getX() && y == anotherCircle.getY()){
				return true;
			}
			else{
				return false;
			}
		}
		
		//method that calculates the distance between two circles
		public double distance(Circle anotherCircle){
			return Math.sqrt(Math.pow(this.getX() - anotherCircle.getX(), 2) + Math.pow(this.getY() - anotherCircle.getY(), 2));
		}

		//method that tests if two circles intersect
		public boolean intersects(Circle anotherCircle){
			if (this.distance(anotherCircle) < this.getRadius() + anotherCircle.getRadius()){
				return true;
			}
			else{
				return false;
			}
		}
	}
	




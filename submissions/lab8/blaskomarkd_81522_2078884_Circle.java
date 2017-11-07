/*
* Circle.java
* Author: Mark Blasko
* Submission Date: 10/26/17
* Purpose: The purpose of this program is to set and manipulate values of Circle objects.
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

	private double radius;
	private double x;
	private double y;
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

			return this.x;
		}


	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {

		return this.y;
	}

	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {

		return this.radius;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {

		this.x = x;
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

		if (radius > 0) { //for invalid user input
		this.radius = radius;
		}
	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {

		double diameter = 2 * this.radius;
		return diameter;

	}


	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		double area = Math.PI * this.radius;
		return area;

	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		double perimeter = (2 * Math.PI * this.radius);
		return perimeter;
	}

	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		boolean unitCircleStatement;

		if (this.radius == 1 && x == 0 && y == 0) {
			unitCircleStatement = true;
		}
		else {
			unitCircleStatement = false;
		}
		return unitCircleStatement;

	}


	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {


			return "(" + x + "," + y + ")";
		}

		public boolean equals(Circle anotherCircle) {

			if (this.x == anotherCircle.getX() && this.y == anotherCircle.getY() && this.radius == anotherCircle.getRadius()) {

				return true;
			}

			else {
				return false;

			}

		} // end of equals method

		public boolean isConcentric(Circle anotherCircle) {
			//System.out.println(anotherCircle.getX());
			//System.out.println(this.x);
			if (this.x == anotherCircle.getX() && this.x == anotherCircle.getY() && this.radius != anotherCircle.getRadius()) {
				return true;
			}
			else {
				return false;
			}
		}

			public double distance(Circle anotherCircle) {
				double distance = Math.sqrt(Math.pow((this.x - anotherCircle.getX()), 2) + Math.pow((this.y - anotherCircle.getY()), 2));
				return distance;
			}

			public boolean intersects(Circle anotherCircle) {
				//Value testers
				//System.out.println(this.distance(anotherCircle));
				//System.out.println(this.getRadius());
				//System.out.println(anotherCircle.getRadius());
				if (this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius()) && (this.isConcentric(anotherCircle) == false)) {
					return true;
				}
				else {
					return false;
				}

			}



} //end of class

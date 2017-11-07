/*
* Circle.java
* Author: Julia Owens
* Submission Date: 10/27/2017
*
* Purpose: A program to calculate and analyze the characteristics
* of a circle. 
*
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
	
	private double radius;
	private double x;
	private double y;
	
	
	public Circle(double x, double y, double  radius) {
		
		this.x = x;
		this.y = y;
		this.radius = radius;  	   	
	}
	
	public double getX() {
		
		return x;
	}
	
	public double getY() {
		
		return y;	
	}
	
	public double getRadius() {
		
		return radius;
	}


	public void setX (double x) {
		
		this.x= x;
	}


	public void setY (double y) {
		
		this.y= y;
	}	
	

	public void setRadius (double radius) {
		
		if (radius< 0) {
			this.radius= this.radius;
		}
		else {
			this.radius= radius;
		}
	}
	

	public void diameter() {
		
		double diameter= radius * 2;
	}
	

	public void area() {
		
		double area= Math.PI * Math.pow(radius, 2);	
	}


	public void perimeter() {
		
		double perimeter= 2 * Math.PI * radius;	
	}
	
	public void isUnitCircle() {
		
		boolean isUnitCircle;
		if (radius== 1 && x== 0 && y== 0) {
			isUnitCircle= true;
		}
		else {
			isUnitCircle= false;
		}
	}
	
	
	public String toString() {
		return("center: (" + x + ", " + y + ")");
	}
}

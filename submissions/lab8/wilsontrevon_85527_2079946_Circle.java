/*
* [Circle].java
* Author: [Trevon Wilson]
* Submission Date: [10/27/2017]
*
* Purpose: To use methods to find the value of a circle.
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
	private double x;
	private double y;
	private double radius;
	// instance variables
	
	public Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		//returns the value of x
		return x;
	}
	
	public double getY() {
		//returns the value of y
		return y;
	}
	
	public double getRadius() {
		//returns the value of radius
		return radius;
	}
	
	public void setX(double newX){
		//assigns a new value to x
		this.x =x;
	}
	
	public void setY(double newY){
		//assigns a new value to y
		this.y =y;
	}
	
	public void setRadius(double newRadius){
		//assigns a new value to radius
		if (newRadius >= 0)
			radius = newRadius;
	}
	
	public double area(){
		//returns the area of the circle
		return Math.PI * radius * radius;
	}
	
	public double perimeter(){
		//returns the permeter of the circle
		return 2 * Math.PI * radius;
	}
	
	public double diameter(){
		//calculates the diameter of the circle
		return 2 * radius;
	}
	
	public boolean isUnitCircle(){
		boolean isUnitCircle = true;
		if (radius == 1 && this.x == 0 && this.y == 0){
			isUnitCircle = true;
		}
		else {isUnitCircle = false;}
			return isUnitCircle;
	}
	
	public String toString(){
		return String.format("center: (%f,%f) \n		radius: %f", x, y, radius);
	}
	
	public boolean equals(Circle anotherCircle){
		boolean isEquals = false;
		if(anotherCircle != null){
			Circle other = anotherCircle;
			return this.radius == other.getRadius() && this.x == other.getX() && this.y == other.getY();
		}
		return isEquals;
	}
	
	public boolean isConcentric(Circle anotherCircle){
		boolean isEquals = false;
		if(anotherCircle.getRadius() != this.getRadius()){
			Circle other = anotherCircle;
			return this.x == other.getX() && this.y == other.getY();
		}
		return isEquals;
	}
	
	public double distance(Circle anotherCircle){
		double temp = Math.pow((this.x - anotherCircle.x), 2);
		double temp2 = Math.pow((this.y - anotherCircle.y), 2);
		double add = temp + temp2;
		double sqrt = Math.sqrt(add);
		return sqrt;
	}
	
	public boolean intersects(Circle anotherCircle){
		boolean isEquals = false;
		if(this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius()));{
			isEquals = true;
		}
		return isEquals;
	}



}

	


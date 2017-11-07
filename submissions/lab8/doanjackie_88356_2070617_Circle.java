/* 
 * Circle.java 
 * Author:  Jackie Doan  
 * Submission Date:  10/26/17 
 * 
 * Purpose:
 * This program is used as the base to determine
 * necessary values and information concerning a
 * circle from CircleTester.java
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
	
	private double radius;
	private double x;
	private double y;
	private double area;
	private double diameter;
	private double perimeter;
	private boolean isUnitCircle;
	private boolean equals;
	private boolean isConcentric;
	private double distance;
	private boolean intersects;
	
	/*set the initial values
	 * of the instance variables
	 * for this circle
	 */
	public Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	//returns value of x
	public double getX(){
		return x;
	}
	//returns value of y
	public double getY(){
		return y;
	}
	//returns value of radius
	public double getRadius(){
		return radius;
	}
	//assigns a new value to x
	public double setX(double x){
		this.x = x;
		return x;
	}
	//assigns a new value to y
	public double setY(double y){
		this.y = y;
		return y;
	}
	//assigns a new value to radius
	public double setRadius(double radius){
		if (radius >= 0){
			this.radius = radius;
		}
		return radius;
	}
	//calculates the diameter of circle
	public double diameter(){
		diameter = radius * 2;
		return diameter;
	}
	//returns the area of the circle
	public double area(){
		area = (Math.PI) * radius * radius;
		return area;
	}
	//return the perimeter of the circle
	public double perimeter(){
		perimeter = 2 * (Math.PI) * radius;
		return perimeter;
	}
	/* 
	 * return true if the radius of this
	 * circle is 1 and its center is (0,0)
	 * and false otherwise
	 */
	public boolean isUnitCircle(){
		if (x == 0 && y == 0 && radius == 1){
			isUnitCircle = true;
		}
		else {
			isUnitCircle = false;
		}
		return isUnitCircle;
	}
	/*
	 * Return a String representation of this
	 * Circle in the following format:
	 * center: (x,y)
	 * radius: r
	 */
	public String toString(){
		return "\ncenter: (" + x + "," + y + ")\n" + "radius: " + radius;
	}
	/*
	 * return true if radius of current
	 * circle is equal to another circle
	 * in terms of center and radius
	 */
	public boolean equals(Circle anotherCircle){
		if (this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius == anotherCircle.radius){
			equals = true;
		}
		else {
			equals = false;
		}
		return equals;
	}
	public boolean isConcentric(Circle anotherCircle){
		if (this.x == anotherCircle.x && this.y == anotherCircle.y){
			isConcentric = true;
		}
		else {
			isConcentric = false;
		}
		return isConcentric;
	}
	public double distance(Circle anotherCircle){
		distance = Math.sqrt((Math.pow(this.x - anotherCircle.x, 2)) + (Math.pow(this.y - anotherCircle.y, 2)));
		return distance;
	}
	public boolean intersects(Circle anotherCircle){
		distance = this.distance(anotherCircle);
		if (distance < (this.getRadius() + anotherCircle.getRadius())){
			intersects = true;
		}
		else {
			intersects = false;
		}
		return intersects;
	}
}

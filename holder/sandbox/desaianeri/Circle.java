//package lab8;				
				
/*				
 * [Circle].java 				
 * Author: [Aneri Desai]				
 * Submission Date: [10/27/2017]				
 * 				
 * Purpose: In the lab we learned how to do object oriented programming. Declare instance variables, get method,
 *  set method, how to call on other methods and we also learned about the accessor and mutator methods.			
 * 				
 *  Statement of Academic Honesty:				
 *  				
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 				
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.				
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies				
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 				
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 				
 *  project is strictly prohibited unless you have written consent from the instructor.  				
 */				
public class Circle {				
				
				
	private double radius;  // declare the private double instance  radius			
	private double x;			
	private double y;  // declare the private double instance  y			
				
				
	public Circle(double x, double y,double  radius) {			//contractor 
		this.x = x;		
		this.y = y;		
		this.radius = radius;  	   	
	}			
				
	public double getX() {			//get method
				
			return x;	
	}			
				
	public double getY() {			
			return y;	
				
	}			
				
				
	public double getRadius() {			
			return radius;	
	}			
				
				
	public void setX(double x) {			//set method 
			this.x=x;	
	}			
				
				
				
	public void setY(double y) {			
		this.y=y;		
	}			
				
				
				
	public void setRadius(double radius) {			
		if(radius>=0)		
		this.radius=radius;		
	}			
				
				
	public double diameter() {			//diameter formula 
		double diameter = 2*radius;		
		return diameter;		
	}			
				
				
				
	public double area() {			//area formula 
		double area = Math.PI * (radius)*(radius);		
		return area;		
	}			
				
				
	public double perimeter() {			//perimeter formula 
		double permiter = 2 * Math.PI * radius;		
		return permiter;		
	}			
				
	public boolean isUnitCircle() {			//asking for unit circle
			if(radius==1 && x==0 && y ==0) {
				System.out.println("Is circle a unit circle?");
				return true;
			}else {
			System.out.println("Is circle a unit circle?");	
			return false;
			}
	}			
				
				
	String center="center="+"("+x+","+y+")";			
				
	public String toString() {			
		return "center:" + "("+x+","+y+")" + "\nradius:" + radius;		
				
	}	
	
	public boolean equals(Circle anotherCircle) { //method given in the labs
		if(this.radius==anotherCircle.radius && this.x==anotherCircle.x && this.y==anotherCircle.y)
			return true;
		else 
			return false;
	}
	
	public boolean isConcentric(Circle anotherCircle) {
	   if(this.radius!=anotherCircle.radius && this.x==anotherCircle.x && this.y==anotherCircle.y)
	   		return true;
	   	else 
	   		return false;
	}
	
	public double distance(Circle anotherCircle){
		double distance = Math.sqrt(Math.pow((this.x-anotherCircle.x), 2) + Math.pow((this.y-anotherCircle.y), 2));
		if(distance>=0) {
			//System.out.println("Distance is:" + distance);
			//return distance;
		}else {
			System.out.println("Cordinates are invalid" );
		}
		return distance;
	}
	
	public boolean intersects(Circle anotherCircle) {
		double t = this.radius + anotherCircle.radius;
		double distance = Math.sqrt(Math.pow((this.x-anotherCircle.x), 2) + Math.pow((this.y-anotherCircle.y), 2));
		
		if(distance<t) 
			return true;
		else
			return false;
	}
	

	
}

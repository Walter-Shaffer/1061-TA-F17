 //*******************************************************
 // Circle.java
 //
 // Zachary Smith
 // 10-27-17
 // This program takes the radius, x-value, and y-value of circles
 // and calculates specific questions about the circles.
 //
 // Statement of Academic Honesty:
 // 
 // The following code represents my own work. I have neither
 // received nor given inappropriate assistance. I have not 
 // copied or modified code from any other source other than 
 // the course webpage or the course textbook. I recognize that 
 // any unauthorized assistance or plagiarism will be handled in
 // accordance with the policies at Clemson University and the
 // policies of this course, I recognize that my work is based
 // on an assignment created by the School of Computing at 
 // Clemson University. Any publishing or posting of source
 // code for this project is strictly prohibited unless
 // you have written consent from the instructor.
 // 
 //*******************************************************
public class Circle {
	

	double radius;      // declare the private double instance  radius
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
		
		if(radius >= 0)
		{
			this.radius = radius;
		}
		else
		{
			return;
		}
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter(double radius) {
		
		double diameter = 2 * radius;	
		
		return diameter;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area(double radius) {
		
		double area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter(double radius) {
		
		double perimeter = 2 * Math.PI * radius;	
		
		return perimeter;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle(double radius, double x, double y) {
		
		if(radius == 1 && x == 0 && y == 0)
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
		
		return ("center: (" + x + ", " + y + ")\nradius: " + radius);
	}
	
	public boolean equals(Circle anotherCircle)
	{
		if(radius == anotherCircle.radius && x == anotherCircle.x && y == anotherCircle.y)
		{
			return true;
		}
		else
			return false;
	}
	public boolean isCoencentric(Circle anotherCircle)
	{
		if(x == anotherCircle.x && y == anotherCircle.y && radius != anotherCircle.radius)
		{
			return true;
		}
		else
			return false;
	}
	public double distance(Circle anotherCircle)
	{
		double distance = Math.sqrt(Math.pow((x - anotherCircle.x), 2) + Math.pow((y - anotherCircle.y), 2));
		return distance;
	}
	public boolean intersects(Circle anotherCircle)
	{
		double sum = radius + anotherCircle.radius;
		
		double distance = Math.sqrt(Math.pow((x - anotherCircle.x), 2) + Math.pow((y - anotherCircle.y), 2));
		
		if(distance < sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

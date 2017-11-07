//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	

	private double radius;       // declare the private double instance  radius
	private double x;			// declare the private double instance  x
	private double y;		   // declare the private double instance  y
	
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
	// equals - returns true if the radii are equal
	//----------------------------------------------
	public boolean equals(Circle anotherCircle){
		if (this.radius == anotherCircle.radius){
			return true;}
		else {return false;}
	}
	
	//----------------------------------------------
	// isConcentric - returns true if the circles are concentric
	//----------------------------------------------
	
	public boolean isConcentric(Circle anotherCircle){
		if ((this.x == anotherCircle.x) && (this.y == anotherCircle.y) && (this.radius != anotherCircle.radius)){
			return true;}
		else {
			return false;}
	
	}
	//----------------------------------------------
	// distance - returns the distance between the two circles
	//----------------------------------------------
	public double distance(Circle anotherCircle){
		double xminusxa =  Math.pow((this.x - anotherCircle.x), 2);
		double yminusya =  Math.pow((this.y - anotherCircle.y), 2);
		double distance = Math.sqrt(xminusxa + yminusya);
		return distance;}
	//------------------------------------------------
	// intersects - returns true if the circles intersect
	//------------------------------------------------
	public boolean intersects(Circle anotherCircle){
		if (this.distance(anotherCircle) < this.radius + anotherCircle.radius){
			return true;}
		else {
			return false;}
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
		
		if (radius >= 0){
			this.radius = radius;
		}
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return radius * 2;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return radius * radius * Math.PI;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return 2 * radius * Math.PI;	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if ((radius == 1) && (x == 0) && (y == 0)){
			return true;}
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
		
		return "center: (" + x + "," + y + ")\nradius: " + radius;}
	
	
	
	
		
		
		
		}
			
		
		
		
		
	



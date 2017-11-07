//*******************************************************
// Circle.java
//
// 
//*******************************************************
import java.lang.Math;
public class Circle {
	

	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
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
	public void setX(double d) {
		
		this.x = d;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double d) {
		
		this.y = d;	
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double d) {
		if(d>0){
		this.radius = d;
		}else{
			//do nothing
		}
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return radius*2;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI*Math.pow(radius, 2.0);	
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
		
		if(this.x==0&&this.y==0&&this.radius==1){
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
		
		return "center: ("+this.x+","+this.y+")\n\nradius: "+this.radius;	
	}
	
	//--------------------------------------------------------
	// equals - returns a boolean representation of
	// if the input circle is identical to the host
	// circle.
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle){
		if(this.radius==anotherCircle.radius&&this.x==anotherCircle.x&&this.y==anotherCircle.y){
			return true;
		}else{
			return false;
		}
	}
	
	//--------------------------------------------------------
	// isConcentric - returns a boolean representation
	// of whether two circles have the same centre but
	// not the same radius.
	//--------------------------------------------------------
	public boolean isConcentric(Circle anotherCircle){
		if(this.radius!=anotherCircle.radius&&this.x==anotherCircle.x&&this.y==anotherCircle.y){
			return true;
		}else{
			return false;
		}
	}
	
	//--------------------------------------------------------
	// distance - returns the distance between the
	// centres of two circles.
	//--------------------------------------------------------
	public double distance(Circle anotherCircle){
		return Math.sqrt(Math.pow(this.x-anotherCircle.x,2)+Math.pow(this.y-anotherCircle.y, 2));
	}
	
	//--------------------------------------------------------
	// intersects - returns a boolean if two circles
	// intersect
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle){
		if(distance(anotherCircle)<(this.radius+anotherCircle.radius)){
			return true;
		}else{
			return false;
		}
	}
}

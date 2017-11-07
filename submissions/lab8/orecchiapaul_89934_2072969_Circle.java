/* 
 * 
 * Circle.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/23/17 
 * 
 * Purpose: The purpose of this program is to compute the coordinates given by CircleTester 
 * and run them through the program and return the outputs.
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
	public void setX(double setX) {
		
		x=setX;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double setY) {
		
		y=setY;
	}	
		
		
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double setRadius) {
			
		if (setRadius>=0){
			radius=setRadius;
		}else {
			
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

		return radius*radius*Math.PI;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
	
			return  2*radius*Math.PI;
	}
		
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if ((radius==1)&&(x==0)&&(y==0)){
			return true;
		}else {
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
		return "center:("+getX()+","+getY()+")"+ "\n\tradius: "+getRadius()+"\n";
	}		
	public boolean equals(Circle anotherCircle){	
		if ((getX()==anotherCircle.getX())&&(getY()==anotherCircle.getY())&&(getRadius()==anotherCircle.getRadius())){
			return true;
		}else{
			return false;
		}
	}
	public boolean isConcentric(Circle anotherCircle){
		if ((getX()==anotherCircle.getX())&&(getY()==anotherCircle.getY())&&(getRadius()!=anotherCircle.getRadius())){
			return true;
		}else{
			return false;
		}
	}
	public double distance(Circle anotherCircle){ //???????????????????????????create methods???????????????????
		return Math.sqrt(Math.pow((getX()-anotherCircle.getX()),2)+Math.pow((getY()-anotherCircle.getY()),2));

	}
	public boolean intersects(Circle anotherCircle){
		if (distance(anotherCircle)<(getRadius()+anotherCircle.getRadius())){
			return true;
		}else {
			return false;
			
		}
	}
}
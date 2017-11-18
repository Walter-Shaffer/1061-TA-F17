/*
* [CircleTester].java
* Author: [Jason Battaglini]
* Submission Date: [10/27/17]
*
* Purpose: Tests the Circle class.
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


//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester{
	
	public static void main(String[] args) {
		
		Circle circle1= new Circle(0.0,0.0,2);
		Circle circle2= new Circle(2.0,1.0,1);
		Circle circle3 = new Circle(-3.0,4.0,2);
		
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(2.0); 
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		// print circle1 characteristics (center and radius), use a statement similar 
				// to the previous println statements. Note that is not necessary to call
				//the method toString, why?
		if (circle1.getRadius()<=0){
			System.out.println("The radius must be a value greater than or equal to 0" );
		//System.exit(0);
		}
		else
		System.out.println("circle1: " + circle1.toString());
		
		
		//System.out.println(circle1.toString());
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		if (circle2.getRadius()<=0){
			System.out.println("The radius must be a value greater than or equal to 0 ");
			//System.exit(0);
		}
		System.out.println("circle2 : " + circle2.toString());
		
		//System.out.println(circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 Diameter: " + circle2.diameter());
		System.out.println("circle2 Area: " + circle2.area());
		System.out.println("circle 2 Perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println(circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		
		System.out.println(circle2.isUnitCircle());
		// your additional tests should be placed below here
		System.out.println(circle2.distance(circle1));
		System.out.println(circle2.distance(circle3));
		System.out.println(circle1.distance(circle3));
		//3 distance tests
		
		System.out.println(circle2.isConcentric(circle3));
		System.out.println(circle2.isConcentric(circle1));
		System.out.println(circle1.isConcentric(circle3));
		//3 concentric tests
		
		System.out.println(circle2.intersects(circle1));
		System.out.println(circle2.intersects(circle3));
		System.out.println(circle1.intersects(circle3));
		//3 intersects tests
		
		
		System.out.println(circle2.equals(circle1));
		System.out.println(circle2.equals(circle3));
		System.out.println(circle1.equals(circle3));
		//3 equals tests
				
	}
	
}

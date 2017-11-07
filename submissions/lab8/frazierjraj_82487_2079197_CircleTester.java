/*
* [CircleTester].java
* Author: [Anthony Frazier]
* Submission Date: [10/27/17]
*
* Purpose:Creates the object circle and then does several operation on the object.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
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
		
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		System.out.println("Circle1="+circle1);
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		// print circle1 diameter, area and perimeter
		System.out.println(""+circle1.diameter()+" "+ circle1.area()+" "+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println(""+circle2.diameter()+" "+ circle2.area()+" "+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println(""+ circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println(""+ circle2.isUnitCircle());
		// your additional tests should be placed below here
		//equals tests
		circle1.setRadius(1);
		circle1.setX(0);
		circle1.setY(0);
		circle2.setRadius(1);
		circle2.setX(0);
		circle2.setY(0);
		System.out.println(circle1.equals(circle2));
		circle1.setRadius(4);
		System.out.println(circle1.equals(circle2));
		circle1.setRadius(8.4);
		circle1.setX(3.6);
		circle1.setY(4.5);
		circle2.setRadius(8.4);
		circle2.setX(3.6);
		circle2.setY(4.5);
		System.out.println(circle1.equals(circle2));
		//Concentric tests
		System.out.println(circle1.isConcentric(circle2));
		circle1.setRadius(6);
		System.out.println(circle1.isConcentric(circle2));
		circle1.setRadius(-4);
		circle2.setRadius(-4);
		System.out.println(circle1.isConcentric(circle2));
		//distance tests
		circle1.setX(1);
		circle1.setY(2);
		circle2.setX(-1);
		circle2.setY(-2);
		System.out.println(circle1.distance(circle2));
		circle1.setX(4);
		circle1.setY(6);
		circle2.setX(-8);
		circle2.setY(0);
		System.out.println(circle1.distance(circle2));
		circle1.setX(5);
		circle1.setRadius(7);
		System.out.println(circle1.distance(circle2));
		//intersects tests
		System.out.println(circle1.getRadius() + ""+ circle2.getRadius());
		System.out.println(circle1.intersects(circle2));
		circle2.setRadius(4);
		System.out.println(circle1.intersects(circle2));
		circle2.setRadius(8);
		circle2.setRadius(-9);
		System.out.println(circle1.intersects(circle2));
	}
	
}

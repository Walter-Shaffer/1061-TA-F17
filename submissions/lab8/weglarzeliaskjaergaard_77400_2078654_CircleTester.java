//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
/*
* CircleTester.java
* Author: Elias Weglarz
* Submission Date: 10/27/17
*
* Purpose: Use the Circle.java class to input x, y and radius values of a circle to compute differernt things
* about a circle.
* 
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
		
		System.out.println("center: " + "(" + circle1.getX() + "," + circle1.getY() + ")" );
		System.out.println("radius: " + circle1.getRadius());
		
		circle2.setRadius(5.3);
		
		
		System.out.println("center: " + "(" + circle2.getX() + "," + circle2.getY() + ")" );
		System.out.println("radius: " + circle2.getRadius());
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("Circle1 diameter: " + circle1.diameter());
		System.out.println("Circle1 perimeter: " + circle1.perimeter());
		System.out.println("Circle1 area: " + circle1.area());

		System.out.println("Circle1 diameter: " + circle2.diameter());
		System.out.println("Circle1 perimeter: " + circle2.perimeter());
		System.out.println("Circle1 area: " + circle2.area());
	
		
		System.out.println("Circle1 Unit Circle?: " + circle1.isUnitCircle());
		System.out.println("Circle2 Unit Circle?: " + circle2.isUnitCircle());
		//test cases below
		
		//test case 1
		circle1.setRadius(1.0);
		circle1.setX(1.0);
		circle1.setY(1.0);
		
		circle2.setRadius(1.0);
		circle2.setX(1.0);
		circle2.setY(1.0);
		
		System.out.println("Circle1 = Circle2?: " + circle1.equals(circle2));
		System.out.println("Is Circle1 concentric with Circle2?: " + circle1.isConcentric(circle2));
		System.out.println("Distance between Circle1 and Circle2: " + circle1.distance(circle2));
		System.out.println("Distance between Circle1 and Circle2: " + circle1.distance(circle2));
		
		//test case 2
		circle1.setRadius(2.0);
		circle1.setX(2.0);
		circle1.setY(2.0);
		
		circle2.setRadius(1.0);
		circle2.setX(1.0);
		circle2.setY(1.0);
		
		System.out.println("Circle1 = Circle2?: " + circle1.equals(circle2));
		System.out.println("Is Circle1 concentric with Circle2?: " + circle1.isConcentric(circle2));
		System.out.println("Distance between Circle1 and Circle2: " + circle1.distance(circle2));
		System.out.println("Does Circle1 intersect with Circle 2?: " + circle1.intersects(circle2));
		
		//test case 3
		circle1.setRadius(2.0);
		circle1.setX(1.0);
		circle1.setY(1.0);
		
		circle2.setRadius(1.0);
		circle2.setX(1.0);
		circle2.setY(1.0);
		
		System.out.println("Circle1 = Circle2: " + circle1.equals(circle2));
		System.out.println("Is Circle1 concentric with Circle2?: " + circle1.isConcentric(circle2));
		System.out.println("Distance between Circle1 and Circle2: " + circle1.distance(circle2));
		System.out.println("Distance between Circle1 and Circle2: " + circle1.distance(circle2));
		
		
		
	}
	
}

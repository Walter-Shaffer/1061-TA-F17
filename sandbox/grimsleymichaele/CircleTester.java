/*
* CircleTester.java
* Author: Michael Grimsley
* Submission Date: 10/27/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
		Circle testCircle1= new Circle(2.0,1.0,3);
		Circle testCircle2= new Circle(2.0,1.0,5.3);
		Circle testCircle3= new Circle(2.0,1.0,3);
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
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println(circle1.getRadius());
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(circle2.toString());
		// print circle1 diameter, area and perimeter
		System.out.println(circle1.perimeter() +circle1.area() +circle1.diameter());
		// print circle2 diameter, area and perimeter
		System.out.println(circle2.perimeter() +circle2.area() +circle2.diameter());
		// display whether circle1 is a unit circle
		System.out.println("Is unit circle: " +circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Is unit circle: " +circle2.isUnitCircle());
		// your additional tests should be placed below here
		
		System.out.println("Test For .intersects method\nDoes Circle1 intersect Circle2: " +circle1.intersects(circle2)); // expected out come: true
		System.out.println("Do cocenteric circles intersect?: " +testCircle2.intersects(testCircle3)); // expected out come: false
		System.out.println("Does the same circle intersect?: " +testCircle2.intersects(circle2)+"\n"); // expected out come: true
		
		System.out.println("Test For .isCocentric method\nAre cocentric circles cocnetric?: " +testCircle2.isCocentric(testCircle3)); // expected out come: true
		System.out.println("Are the same circles cocntric?: " +testCircle2.isCocentric(testCircle2)); // expected out come: true
		System.out.println("Are non cocnetric circles...not cocnetric?: " +circle1.isCocentric(circle2)+"\n"); // expected out come: false
		
		System.out.println("Test for .distance method\nDistance between Circle1 and Circle2?: " +circle1.distance(testCircle3)); // expected out come: >0
		System.out.println("Distance between testCircle1 and testCircle2?: " +testCircle2.distance(testCircle1)); // expected out come: 0.0
		System.out.println("Distance between testCircle2 and testCircle2? the same circle?!: " +testCircle2.distance(circle2)+"\n"); // expected out come: 0.0
		
		System.out.println(" Test for .equals method\nIs circle1 == circle2?: " +circle1.equals(circle2)); // expected out come: false
		System.out.println("Is circle2 == testCircle2?: " +circle2.equals(testCircle2)); // expected out come: true
		System.out.println("Is circle1 == testCircle3?: " +circle1.equals(testCircle3)); // expected out come: false

	}
	
}

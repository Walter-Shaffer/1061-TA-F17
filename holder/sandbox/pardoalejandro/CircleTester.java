/*
* CircleTester.java
* Author:  Alejandro Pardo
* Submission Date:  October 27
* Purpose: This program introduces Object Oriented Programming
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
//  A client to test the functionality of objects
//  of the class Circle

public class CircleTester {

	public static void main(String[] args) {

		Circle circle1 = new Circle(0.0, 0.0, 2);
		Circle circle2 = new Circle(2.0, 1.0, 1);

		System.out.println("circle1=\n" + circle1);
		System.out.println("");
		System.out.println("circle2=\n" + circle2);
		System.out.println("");

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

		// print circle1 characteristics (center and radius), use a statement
		// similar
		// to the previous println statements. Note that is not necessary to
		// call
		// the method toString, why?
		System.out.println("circle1=\n" + circle1 + "\n");

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement
		// similar to the first and
		// second println statements
		System.out.println("circle2=\n" + circle2 + "\n");

		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1=");
		System.out.println("diameter: " + circle1.diameter());
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + circle1.perimeter() + "\n");

		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2=");
		System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter() + "\n");
		
		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle()) {
			System.out.println("circle1 is a unit circle");
		} else
			System.out.println("circle1 is not a unit circle");
		
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()) {
			System.out.println("circle2 is a unit circle");
		} else
			System.out.println("circle2 is not a unit circle" + "\n");
		
		// your additional tests should be placed below here

		Circle circle3 = new Circle(2.0, 2.0, 4.0);
		Circle circle4 = new Circle(2.0, 2.0, 4.0);
		Circle circle5 = new Circle(2.0, 2.0, 7.0);
		Circle circle6 = new Circle(10.0, 13.0, 5.0);
		Circle circle7 = new Circle(13.0,6.0,8.6);
		
		System.out.println("circle3=\n" + circle3 + "\n");
		System.out.println("circle4=\n" + circle4 + "\n");
		System.out.println("circle5=\n" + circle5 + "\n");
		System.out.println("circle6=\n" + circle6 + "\n");
		System.out.println("circle7=\n" + circle7 + "\n");
		
		// equals
		System.out.println("equals=");
		if (circle3.equals(circle4)) {
			System.out.println("circle3 equals circle4");
		} else
			System.out.println("circle3 does not equal circle4");

		if (circle4.equals(circle5)) {
			System.out.println("circle4 equals circle5");
		} else
			System.out.println("circle4 does not equal circle5");

		if (circle3.equals(circle6)) {
			System.out.println("circle3 equals circle6");
		} else
			System.out.println("circle3 does not equal circle6" + "\n");

		
		// isConcentric
		System.out.println("isConcentric=");
		if (circle3.isConcentric(circle4)) {
			System.out.println("circle3 and circle4 are concentric");
		} else
			System.out.println("circle3 and circle4 are not concentric");

		if (circle4.isConcentric(circle5)) {
			System.out.println("circle4 and circle5 are concentric");
		} else
			System.out.println("circle4 and circle5 are not concentric");

		if (circle5.isConcentric(circle6)) {
			System.out.println("circle5 and circle6 are concentric");
		} else
			System.out.println("circle5 and circle6 are not concentric" + "\n");

		
		// distance
		System.out.println("distance=");
		System.out.println("The distance between circle3 and circle4 is " + circle3.distance(circle6) + " units");
		System.out.println("The distance between circle6 and circle7 is " + circle6.distance(circle7) + " units");
		System.out.println("The distance between circle5 and circle7 is " + circle5.distance(circle7) + " units" + "\n");

		
		// intersects
		System.out.println("intersects=");
		if (circle3.intersects(circle4)) {
			System.out.println("circle3 and circle4 intersect each other");
		} else
			System.out.println("circle3 and circle4 do not intersect each other");

		if (circle4.intersects(circle5)) {
			System.out.println("circle4 and circle5 intersect each other");
		} else
			System.out.println("circle4 and circle5 do not intersect each other");

		if (circle3.intersects(circle6)) {
			System.out.println("circle3 and circle6 intersect each other");
		} else
			System.out.println("circle3 and circle6 do not intersect each other" + "\n");

	}

}

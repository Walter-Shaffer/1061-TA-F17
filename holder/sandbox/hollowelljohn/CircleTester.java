/** @formatter:off
* CircleTester.java
* Author: John Hollowell
* Submission Date: 10/25/2017
*
* Purpose: A client to test the functionality of objects of the class Circle
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
* @formatter:on
*/
// *******************************************************
// CircleTester.java
//
//
// A client to test the functionality of objects
// of the class Circle
//
// *******************************************************
public class CircleTester {

	public static void main(String[] args) {

		Circle circle1 = new Circle(0.0, 0.0, 2);
		Circle circle2 = new Circle(2.0, 1.0, 1);

		System.out.println("circle1=\n" + circle1);
		System.out.println();
		System.out.println("circle2=\n" + circle2);

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
		// the method toString, why?
		System.out.println("\ncircle1=\n" + circle1 + "\n");

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("circle2=\n" + circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("\ncircle1:");
		System.out.println("Diameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("\ncircle2:");
		System.out.println("Diameter: " + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());
		System.out.println();

		// display whether circle1 is a unit circle
		System.out.printf("circle1 is %sa unit circle.\n", circle1.isUnitCircle() ? "" : "not ");

		// display whether circle2 is a unit circle
		System.out.printf("circle2 is %sa unit circle.\n", circle2.isUnitCircle() ? "" : "not ");

		Circle circle3 = new Circle(0, 0, 1);
		Circle circle4 = new Circle(0, 0, 7);
		Circle circle5 = new Circle(10, 0, 2);
		Circle circle6 = new Circle(10, 0, 2);

		System.out.println("circle3:\n" + circle3);
		System.out.println("circle4:\n" + circle4);
		System.out.println("circle5:\n" + circle5);
		System.out.println("circle6:\n" + circle6);
		System.out.println();


		// your additional tests should be placed below here
		// Unit Tests
		System.out.printf("circle3 is %sa unit circle.\n", circle3.isUnitCircle() ? "" : "not ");
		System.out.println();

		// Equals Tests
		System.out.printf("circle1 %s circle2.\n", circle1.equals(circle2) ? "equals" : "does not equal");
		System.out.printf("circle3 %s circle4.\n", circle3.equals(circle4) ? "equals" : "does not equal");
		System.out.printf("circle5 %s circle6.\n", circle5.equals(circle6) ? "equals" : "does not equal");
		System.out.printf("circle6 %s circle5.\n", circle6.equals(circle5) ? "equals" : "does not equal");
		System.out.println();

		// Intersect Tests
		System.out.printf("circle1 %s circle2.\n", circle1.intersects(circle2) ? "intersects" : "does not intersect");
		System.out.printf("circle3 %s circle4.\n", circle3.intersects(circle4) ? "intersects" : "does not intersect");
		System.out.printf("circle4 %s circle5.\n", circle4.intersects(circle5) ? "intersects" : "does not intersect");
		System.out.println();


		// Concentric Tests
		System.out.printf("circle1 and circle2 are %sconcentric.\n", circle1.isConcentric(circle2) ? "" : "not ");
		System.out.printf("circle3 and circle4 are %sconcentric.\n", circle3.isConcentric(circle4) ? "" : "not ");
		System.out.printf("circle5 and circle6 are %sconcentric.\n", circle5.isConcentric(circle6) ? "" : "not ");
		System.out.println();

		// Distance Tests
		System.out.println("circle1 is " + circle1.distance(circle2) + " units from circle2.");
		System.out.println("circle2 is " + circle2.distance(circle3) + " units from circle3.");
		System.out.println("circle3 is " + circle3.distance(circle4) + " units from circle4.");
		System.out.println("circle4 is " + circle4.distance(circle5) + " units from circle5.");
		System.out.println("circle6 is " + circle6.distance(circle5) + " units from circle5.");
	}

}

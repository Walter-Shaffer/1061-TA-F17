/** 
 *
 * CircleTester.java
 * Author: Jacky Wong
 * Submission Date: 10/26/2017
 * 
 * Purpose: A class that accompanies Circle.java. This class actually
 * performs the actions that require the methods Class.java creates,
 * and outputs the information gathered.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 *
 */

public class CircleTester {

	public static void main(String[] args) {
		Circle circle1 = new Circle(0.0, 0.0, 2);
		Circle circle2 = new Circle(2.0, 1.0, 1);
		
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);
		
		circle1.setRadius(-2.0);
		
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		/** Print circle 1 characteristics */
		System.out.println("\nCircle 1 Characteristics:");
		System.out.println("X:" + circle1.getX() + "\tY: " + circle1.getY());
		System.out.println("Radius: " + circle1.getRadius());
		
		circle2.setRadius(5.3);
		
		/** Print circle 2 characteristics */
		System.out.println("Circle 2 Characteristics:");
		System.out.println("X:" + circle2.getX() + "\tY: " + circle2.getY());
		System.out.println("Radius: " + circle2.getRadius());
		
		System.out.println("\n");
		
		/** Print diameter, area, and perimeter for both circles */
		System.out.println("Circle 1:");
		System.out.println("Diameter: " + circle1.diameter() + " Area: " + circle1.area() + " Perimeter: " + circle1.perimeter());
		System.out.println("Circle 2:");
		System.out.println("Diameter: " + circle2.diameter() + " Area: " + circle2.area() + " Perimeter: " + circle2.perimeter());
		System.out.println("\n");
		
		/** Tests whether circles are unit */
		if (circle1.isUnitCircle()) {
			System.out.println("Circle 1 is a unit circle.");
		}
		else {
			System.out.println("Circle 1 is not a unit circle.");
		}
		if (circle2.isUnitCircle()) {
			System.out.println("Circle 2 is a unit circle.");
		}
		else {
			System.out.println("Circle 2 is not a unit circle.");
		}
		
		System.out.println("\n");
		
		/** Tests whether circles 1 and 2 are equal */
		if (circle1.equals(circle2)) {
			System.out.println("Circle 1 does equal Circle 2.");
		}
		else {
			System.out.println("Circle 1 does not equal Circle 2.");
		}
		if (circle2.equals(circle1)) {
			System.out.println("Circle 2 does equal Circle 1.");
		}
		else {
			System.out.println("Circle 2 does not equal Circle 1.");
		}
		if (circle1.equals(circle1)) {
			System.out.println("Circle 1 does equal Circle 1.");
		}
		else {
			System.out.println("Circle 1 does not equal cirlce 1.");
		}
		
		System.out.println("\n");
		
		/** Tests whether circles 1 and 2 are concentric */
		if (circle1.isConcentric(circle2)) {
			System.out.println("Circle 1 is concentric to 2");
		}
		else {
			System.out.println("Circle 1 is not concentric to circle 2.");
		}
		if (circle2.isConcentric(circle1)) {
			System.out.println("Circle 2 is concentric to circle 1.");
		}
		else {
			System.out.println("Circle 2 is not concentric to circle 1.");
		}
		if (circle1.isConcentric(circle1)) {
			System.out.println("Circle 1 is concentric to circle 1.");
		}
		else {
			System.out.println("Circle 1 is not concentric to circle 1.");
		}
		
		System.out.println("\n");
		
		/** Prints the distance between the circles' centers */
		System.out.println("Distance from circle 1 to 2: " + circle1.distance(circle2));
		System.out.println("Distance from circle 2 to 1: " + circle2.distance(circle1));
		System.out.println("Distance from circle 1 to 1: " + circle1.distance(circle1));
		
		System.out.println("\n");
		
		/** Tests whether circles 1 and 2 intersect each other */
		if (circle1.intersects(circle1, circle2)) {
			System.out.println("Circle 1 does intersect circle 2.");
		}
		else {
			System.out.println("Circle 1 does not intersect circle 2.");
		}
		if (circle2.intersects(circle2, circle1)) {
			System.out.println("Circle 2 does intersect circle 1.");
		}
		else {
			System.out.println("Circle 2 does not intersect circle 1.");
		}
		if (circle1.intersects(circle1, circle1)) {
			System.out.println("Circle 1 does intersect circle 1.");
		}
		else {
			System.out.println("Circle 1 does not intersect circle 1.");
		}
	}
}

/*
* CircleTester.java
* Author: Joshua Williams
* Submission Date: 10/27/17
*
* Purpose: 
* 	 A client to test the functionality of objects
* of the class Circle
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
		
		System.out.println("circle1="+circle1);
		circle2.setRadius(5.3);
		System.out.println("circle2="+circle2);
		System.out.println("Circle1 Diameter: " + circle1.diameter());
		System.out.println("Circle1 Area: " + circle1.area());
		System.out.println("Circle1 Perimeter: " + circle1.perimeter());
		System.out.println("Circle2 Diameter: " + circle2.diameter());
		System.out.println("Circle2 Area: " + circle2.area());
		System.out.println("Circle2 Perimeter: " + circle2.perimeter());
		System.out.println("Circle1 is a unit circle: " + circle1.isUnitCircle());
		System.out.println("Circle2 is a unit circle: " + circle2.isUnitCircle());
		
		System.out.println("\nTest 1");
		circle1.setRadius(7);
		circle2.setRadius(7);
		circle1.setX(6.0);
		circle1.setY(6.0);
		circle2.setX(6.0);
		circle2.setY(6.0);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is equal to circle 2: " + circle1.equals(circle2));
		
		System.out.println("\nTest 2");
		circle1.setRadius(5);
		circle2.setRadius(7);
		circle1.setX(5.0);
		circle1.setY(6.0);
		circle2.setX(3.0);
		circle2.setY(6.0);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is equal to circle 2: " + circle1.equals(circle2));
		
		System.out.println("\nTest 3");
		circle1.setRadius(9);
		circle2.setRadius(9);
		circle1.setX(8.4);
		circle1.setY(6.3);
		circle2.setX(8.4);
		circle2.setY(6.3);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is equal to circle 2: " + circle1.equals(circle2));
		
		System.out.println("\nTest 4");
		circle1.setRadius(3);
		circle2.setRadius(9);
		circle1.setX(8.4);
		circle1.setY(6.3);
		circle2.setX(8.4);
		circle2.setY(6.3);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is concentric to circle 2: " + circle1.isConcentric(circle2));
		
		System.out.println("\nTest 5");
		circle1.setRadius(5);
		circle2.setRadius(7);
		circle1.setX(5.0);
		circle1.setY(6.0);
		circle2.setX(3.0);
		circle2.setY(6.0);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is concentric to circle 2: " + circle1.isConcentric(circle2));
		
		System.out.println("\nTest 6");
		circle1.setRadius(9);
		circle2.setRadius(9);
		circle1.setX(4);
		circle1.setY(2);
		circle2.setX(4);
		circle2.setY(2);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is concentric to circle 2: " + circle1.isConcentric(circle2));
		
		System.out.println("\nTest 7");
		circle1.setRadius(9);
		circle2.setRadius(3);
		circle1.setX(4);
		circle1.setY(2);
		circle2.setX(9);
		circle2.setY(10);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("distance from circle 1 to 2: " + circle1.distance(circle2));
		
		System.out.println("\nTest 8");
		circle1.setRadius(99);
		circle2.setRadius(99);
		circle1.setX(5);
		circle1.setY(3);
		circle2.setX(4);
		circle2.setY(7);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("distance from circle 1 to 2: " + circle1.distance(circle2));
		
		System.out.println("\nTest 9");
		circle1.setRadius(1);
		circle2.setRadius(1);
		circle1.setX(99);
		circle1.setY(88);
		circle2.setX(99);
		circle2.setY(88);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("distance from circle 1 to 2: " + circle1.distance(circle2));
		
		System.out.println("\nTest 10");
		circle1.setRadius(1);
		circle2.setRadius(1);
		circle1.setX(3);
		circle1.setY(4);
		circle2.setX(3);
		circle2.setY(4);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is intersecting circle 2: " + circle1.intersects(circle2));
		
		System.out.println("\nTest 11");
		circle1.setRadius(1);
		circle2.setRadius(1);
		circle1.setX(99);
		circle1.setY(99);
		circle2.setX(0);
		circle2.setY(0);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is intersecting circle 2: " + circle1.intersects(circle2));
		
		System.out.println("\nTest 12");
		circle1.setRadius(6);
		circle2.setRadius(7);
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(6);
		circle2.setY(6);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		System.out.println("circle 1 is intersecting circle 2: " + circle1.intersects(circle2));
	}

}

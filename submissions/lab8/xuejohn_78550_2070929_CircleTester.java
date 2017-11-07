/*
 * Circle.java
 * Author: John Xue
 * Submission Date: Oct. 26, 2017
 *
 * Purpose: Create objects and test various methods under the Circle class
 * 
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
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
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("circle1="+circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		String tester = "";
		if(!(circle1.isUnitCircle())) {
			tester = "not";
		}
		System.out.println("circle1 is " + tester + " a unit circle.");
		
		// display whether circle2 is a unit circle
		tester = "";
		if(!(circle2.isUnitCircle())) {
			tester = "not";
		}
		System.out.println("circle2 is " + tester + " a unit circle.");
		
		// your additional tests should be placed below here
		// testing equals method
		circle1 = new Circle(2.2,-3.3,1.0);
		circle2 = new Circle(2.2,-3.3,1.0);
		// values should both be true
		System.out.println(circle1.equals(circle2)); //1
		System.out.println(circle2.equals(circle1)); //2
		// testing epsilon definition (should be false)
		circle1 = new Circle(2.2,-3.3,1.0000000001);
		System.out.println(circle1.equals(circle2)); //3
		
		// testing isConcentric method
		circle1 = new Circle(2.2,-3.3,1.0);
		circle2 = new Circle(2.2,-3.3,1.0);
		// values should both be false
		System.out.println(circle1.isConcentric(circle2)); //1
		System.out.println(circle2.isConcentric(circle1)); //2
		// should be true
		circle2.setRadius(1.4);
		System.out.println(circle1.isConcentric(circle2)); //3
		
		// testing distance method
		// same x and y values (should return 0)
		System.out.println(circle1.distance(circle2)); //1
		circle2.setX(5.3);
		circle2.setY(2);
		// both should return same value
		System.out.println(circle1.distance(circle2)); //2
		System.out.println(circle2.distance(circle1)); //3

		// testing intersects method
		circle1 = new Circle(-1, -1, 0.1);
		circle2 = new Circle(5, 6, 20);
		// both should return true
		System.out.println(circle1.intersects(circle2)); //1
		System.out.println(circle2.intersects(circle1)); //2
		// testing when edges touch (should be false)
		circle1 = new Circle(-1, 0, 1);
		circle2 = new Circle(1, 0, 1);
		System.out.println(circle1.intersects(circle2)); //3

	}
	
}

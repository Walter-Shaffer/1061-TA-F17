/* 
 * File name: CircleTester.java
 * Author: Monica Hart
 * Submission Date: 10/26/2017
 *
 * This program does the following: displays data for a Circle
 * object using methods from Circle.java
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
 *
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
		
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);
		
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
		System.out.println("circle1=" + circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2=" + circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1=" +
			"\ndiameter: " + circle1.diameter() +
			"\narea: " + circle1.area() +
			"\nperimeter: " + circle1.perimeter()
		);
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2=" +
			"\ndiameter: " + circle2.diameter() +
			"\narea: " + circle2.area() +
			"\nperimeter: " + circle2.perimeter()
		);
		
		// display whether circle1 is a unit circle
		System.out.println("circle1 is a unit circle: " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("circle2 is a unit circle: " + circle2.isUnitCircle());
		
		
		// your additional tests should be placed below here		
		
		//equals tests
		Circle circle3= new Circle(0.0,0.0,1);
		Circle circle4= new Circle(0.0,0.0,1);
		Circle circle5= new Circle(0.0,0.0,2);
		System.out.println("\nequals tests:");
		
			//test 1
			System.out.println("\ncircle3=" + circle3);
			System.out.println("circle4=" + circle4);
			System.out.println("circle3 equals circle4: " + circle3.equals(circle4));
			
			//test 2
			System.out.println("\ncircle3=" + circle3);
			System.out.println("circle5=" + circle5);
			System.out.println("circle3 equals circle5: " + circle3.equals(circle5));
			
			//test 3
			circle3.setRadius(2);
			System.out.println("\ncircle3=" + circle3);
			System.out.println("circle5=" + circle5);
			System.out.println("circle3 equals circle5: " + circle3.equals(circle5));
		
		//isConcentric tests
		Circle circle6= new Circle(5.0,10.0,7);
		Circle circle7= new Circle(5.0,10.0,2);
		Circle circle8= new Circle(10.0,5.0,3);
		System.out.println("\nisConcentric tests:");
		
			//test 1
			System.out.println("\ncircle6=" + circle6);
			System.out.println("circle7=" + circle7);
			System.out.println("circle6 and circle7 are concentric: " + circle6.isConcentric(circle7));
		
			//test 2
			System.out.println("\ncircle6=" + circle6);
			System.out.println("circle8=" + circle8);
			System.out.println("circle6 and circle8 are concentric: " + circle6.isConcentric(circle8));
			
		
			//test 3
			circle7.setRadius(7);
			System.out.println("\ncircle6=" + circle6);
			System.out.println("circle7=" + circle7);
			System.out.println("circle6 and circle7 are concentric: " + circle6.isConcentric(circle7));
			
		//distance tests
		Circle circle9= new Circle(1,2,3);
		Circle circle10= new Circle(-9,-8,100);
		Circle circle11= new Circle(100,100,100);
		System.out.println("\ndistance tests:");
		
			//test 1
			System.out.println("\ncircle9=" + circle9);
			System.out.println("circle10=" + circle10);
			System.out.println("The distance between circle9 and circle10: " + circle9.distance(circle10));
			
			//test 2
			System.out.println("\ncircle9=" + circle9);
			System.out.println("circle11=" + circle11);
			System.out.println("The distance between circle9 and circle11: " + circle9.distance(circle11));
			
			//test 3
			System.out.println("\ncircle10=" + circle10);
			System.out.println("circle11=" + circle11);
			System.out.println("The distance between circle10 and circle11: " + circle10.distance(circle11));
			
		//intersects tests
		Circle circle12= new Circle(0.0,0.0,0);
		Circle circle13= new Circle(10,0,10);
		Circle circle14= new Circle(11,0.0,11.000001);
		System.out.println("\nintersects tests:");
		
			//test 1
			System.out.println("\ncircle12=" + circle12);
			System.out.println("circle13=" + circle13);
			System.out.println("circle12 and circle13 intersect: " + circle12.intersects(circle13));
		
			//test 2
			System.out.println("\ncircle12=" + circle12);
			System.out.println("circle14=" + circle14);
			System.out.println("circle12 and circle14 intersect: " + circle12.intersects(circle14));
		
			//test 3
			System.out.println("\ncircle13=" + circle13);
			System.out.println("circle14=" + circle14);
			System.out.println("circle13 and circle14 intersect: " + circle13.intersects(circle14));
			
		
	}
	
}

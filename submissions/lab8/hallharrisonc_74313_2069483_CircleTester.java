/*
* CircleTester.java
* Author: Harrison C Hall
* Submission Date: September 26, 2017
*
* Purpose: A client to test the functionality of objects of the 
* class Circle
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
		
		//sets circles
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
		System.out.println("circle1="+circle1+circle1.getRadius());
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2.getRadius());
		System.out.println("circle1="+circle1.getRadius());
		// print circle1 diameter, area and perimeter
		System.out.println("circle1="+circle1.diameter()+","+circle1.area()+","+circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("circle2="+circle2.diameter()+","+circle2.area()+","+circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("circle1 is a unit circle?: " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("circle2 is a unit circle?: " + circle2.isUnitCircle());
		
		
		
		
		// your additional tests should be placed below here
		System.out.println("\nMy Tests\n");
		Circle circle3 = new Circle(0,0,0);
		Circle circle4 = new Circle(0,0,0);
		System.out.println(circle3.equals(circle4)); //should be true
		System.out.println(circle4.equals(circle3)); //should be true
		System.out.println(circle3.isConcentric(circle4)); //should be false
		System.out.println(circle4.isConcentric(circle3)); //should be false
		circle3.setRadius(5);
		System.out.println(circle4.isConcentric(circle3)); //should be true
		System.out.println(circle3.distance(circle4));
		System.out.println(circle4.intersects(circle3));
		System.out.println(circle4.toString());
		Circle circle5 = new Circle(0,0,1);
		System.out.println(circle5.isUnitCircle());
		System.out.println(circle5.equals(circle3));
		System.out.println(circle5.distance(circle3));
		System.out.println(circle5.intersects(circle3));
		System.out.println(circle5.distance(circle2));
		System.out.println(circle5.intersects(circle2));
	}
	
}

/* 
LinkExtractor.java
Author: Sean Meade
Submission Date: 10/26
Purpose: This program creates two circles of different values 
and uses theme to test all the methods of Circle.java in various
ways. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
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
		
		System.out.println("circle1=\n" + circle1);
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
		//the method toString, why?
		System.out.println("\ncircle1=\n" + circle1);		
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2=\n" + circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("\nDiameter 1: " + circle1.diameter(0));
		System.out.println("Area 1: " + circle1.area(0));
		System.out.println("Perimeter 1: " + circle1.perimeter(0));
		
		// print circle2 diameter, area and perimeter
		System.out.println("\nDiameter 2: " + circle2.diameter(0));
		System.out.println("Area 2: " + circle2.area(0));
		System.out.println("Perimeter 2: " + circle2.perimeter(0));
		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle(false) == true){
			System.out.println("\ncircle1 is a unit circle.");
		}
		else
			System.out.println("\ncircle1 is not a unit circle.");
		
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle(false) == true){
			System.out.println("\ncircle2 is a unit circle.");
		}
		else
			System.out.println("\ncircle2 is not a unit circle.");
		
		// your additional tests should be placed below here
		
		//equals tests
		System.out.println("");
		if (circle1.equals(circle2)){ //Checks whether circle1 is equal to circle2.
			System.out.println("\nThe two circles are equal.");			
		}
		else
			System.out.println("\nThe two circles are not equal.");
		
		if (circle2.equals(circle1)){ //Checks whether circle2 is equal to circle1 by the same method.
			System.out.println("The two circles are equal.");			
		}
		else
			System.out.println("The two circles are not equal.");
		
		if (circle1.equals(new Circle(0.0,0.0,2))){ //Checks whether circle1 is equal to how it was declared, which it shouldn't be.  
			System.out.println("circle1 has not changed.");
		}
		else
			System.out.println("circle1 has changed.");
		
		//isConcentric tests
		System.out.println("");
		if (circle1.isConcentric(circle2)){ //Checks whether circle1 is concentric with circle2.
			System.out.println("The two circles are concentric.");			
		}
		else
			System.out.println("The two circles are not concentric.");
		
		if (circle1.isConcentric(new Circle(0.0,0.0,1))){ //Checks to see if circle1 is concentric with a unit circle. 
			System.out.println("circle1 is concentric with a unit circle.");
		}
		else
			System.out.println("circle1 is not concentric with a unit circle.");
		
		if (circle2.isConcentric(new Circle(0.0,0.0,1))){ //Checks to see if circle2 is concentric with a unit circle. 
			System.out.println("circle2 is concentric with a unit circle.");
		}
		else
			System.out.println("circle2 is not concentric with a unit circle.");
		
		
		//distance tests
		System.out.println("");
		System.out.println("The distance between circle1 and circle2 is: " + circle1.distance(circle2)); //Displays the distance between circle1 and circle2.
		
		System.out.println("The distance between circle1 and a unit circle is: " + circle1.distance(new Circle(0.0,0.0,1))); //Displays the distance between circle1 and a unit circle. 
		
		System.out.println("The distance between circle2 and a unit circle is: " + circle2.distance(new Circle(0.0,0.0,1))); //Displays the distance between circle2 and a unit circle. 
		
		//intersects tests
		System.out.println("");
		if (circle1.intersects(circle2)){ //Checks whether circle1 and circle2 have intersecting areas.
			System.out.println("The two circles intersect.");			
		}
		else
			System.out.println("The two circles do not intersect.");
		
		if (circle1.intersects(new Circle(0.0,0.0,1))){ //Checks to see if circle1 intersects with a unit circle. 
			System.out.println("circle1 intersects with a unit circle.");
		}
		else
			System.out.println("circle1 does not intersect with a unit circle.");
		
		if (circle2.intersects(new Circle(0.0,0.0,1))){ //Checks to see if circle2 intersects with a unit circle. 
			System.out.println("circle2 intersects with a unit circle.");
		}
		else
			System.out.println("circle2 does not intersect with a unit circle.");
		
	}
	
}
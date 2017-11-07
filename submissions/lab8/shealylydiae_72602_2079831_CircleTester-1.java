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


* Author: Lydia Shealy
* Submission Date: 10/27/17
*
* Purpose: A client to test the functionality of objects
* of the class Circle
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
		Circle circle2= new Circle(2.0,1.0,1);//test values to make the circles equal
		//test values for equals  //comment out the circle2.setradius
		//Circle circle2 = new Circle(-3.0, 4.0, 2); 
		//test values for Concentric //needs same X/Y but diff radi
		//Circle circle2 = new Circle(0.0, 0.0, 1); 
		
		
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
		System.out.println("Circle1 Characteristics");
		System.out.println("center: " + "(" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("radius: " + circle1.getRadius()); 
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("Circle2 Characteristics"); 
		System.out.println("center: " + "(" + circle2.getX() + "," + circle2.getY() + ")");
		System.out.println("radius: " + circle2.getRadius()); 
		
		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1");
		System.out.println("Diameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2");
		System.out.println("Diameter: " + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());
		
		//sets the circles as a unit circle 
		//circle1.setX(0);
		//circle1.setY(0);
		//circle2.setX(0);
		//circle2.setY(0);
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 unit circle: " + circle1.isUnitCircle());		
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 unit circle: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here
		
		//equals tests
		//test 1
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(2); //-> true
		System.out.println("Circle 1 and 2 are equal is: " + circle1.equals(circle2)); 
		//test 2 
		circle1.setX(2.0);
		circle1.setY(1.0);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle1.setRadius(5.3);
		circle2.setRadius(5.3);//-> true
		System.out.println("Circle 1 and 2 are equal is: " + circle1.equals(circle2)); 
		//test 3 
		circle2.setX(7.0);
		circle2.setY(7.0);
		//circle2.setRadius(5.3); //-> false	 
		System.out.println("Circle 1 and 2 are equal is: " + circle1.equals(circle2)); 
		
		//concentric tests
		//test 1 
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(2.0);//-> true
		System.out.println("Circle 1 and 2 are Concentric: " + circle1.isConcentric(circle2));
		//test 2 
		circle1.setX(2.0);
		circle1.setY(1.0); 
		circle2.setX(2.0);
		circle2.setY(1.0);//-> true
		System.out.println("Circle 1 and 2 are Concentric: " + circle1.isConcentric(circle2));
		//test 3
		circle1.setX(-3.0);
		circle1.setY(4.0); 
		circle1.setRadius(5.3); //->false		
		System.out.println("Circle 1 and 2 are Concentric: " + circle1.isConcentric(circle2));
		
		//distance testing
		//test 1 
		circle2.setX(7.0);
		circle2.setY(7.0);
		System.out.println("The distance between the centers of Circle 1 and 2 is: "+ circle1.distance(circle2));

		//test 2 
		circle2.setX(12);
		circle2.setY(3);
		System.out.println("The distance between the centers of Circle 1 and 2 is: "+ circle1.distance(circle2));

		//test 3 
		circle2.setX(3);
		circle2.setY(-4);			
		//distance
		System.out.println("The distance between the centers of Circle 1 and 2 is: "+ circle1.distance(circle2));
		
		//intersect testing 
		//test 1
		circle1.setX(5);
		circle1.setY(5);
		circle2.setX(-5);
		circle2.setY(-5); //->false
		System.out.println("The cirlces intersect: " + circle1.intersects(circle2));

		//test 2
		circle1.setX(1);
		circle1.setY(1);
		circle2.setX(-2);
		circle2.setY(-2);
		circle1.setRadius(3);
		circle2.setRadius(3); //-> true
		
		System.out.println("The cirlces intersect: " + circle1.intersects(circle2));

		//test 3
		circle1.setRadius(10);
		circle2.setRadius(10); //->true
			//intersects
		System.out.println("The cirlces intersect: " + circle1.intersects(circle2));
		
		System.exit(0);
	}
	
}
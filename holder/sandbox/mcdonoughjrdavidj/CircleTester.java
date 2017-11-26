/*
*CircleTester.java
* Author:  David McDonough
* Submission Date:  October 27th, 2017
* Purpose: Calculates the amount of months needed to pay off credit card debt with interest.
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
		Circle circle3= new Circle(4.0,1.0,3);//added circle3 for additional testing
		Circle circle4= new Circle(6.0,3.0,4);//added circle4 for additional testing
		
		System.out.println("circle1 = "+ circle1 + "\n");
		System.out.println("circle2 = "+ circle2 + "\n");
		System.out.println("circle3 = "+ circle3 + "\n");
		System.out.println("circle4 = "+ circle4 + "\n");
		
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
		System.out.println("circle1 center: " + circle1.getX() + "," + circle1.getY());
		System.out.println("circle1 radius: " + circle1.getRadius());
		
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2 center: " + circle2.getX() + "," + circle2.getY());
		System.out.println("circle2 radius: " + circle2.getRadius());
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter: " + circle1.diameter());
		System.out.println("circle1 area: " + circle1.area());
		System.out.println("circle1 perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter: " + circle2.diameter());
		System.out.println("circle2 area: " + circle2.area());
		System.out.println("circle2 perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("Is Circle 1 Unit Circle? " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("Is Circle 2 Unit Circle? " + circle2.isUnitCircle());
		
		System.out.println("Do circle 1 and circle 2 have the ame radius and center?: " + circle1.equals(circle2));
		
		System.out.println("Are circle 1 and circle 2 concentric?: " + circle1.isConcentric(circle2));
		
		System.out.println("Distance between circle 1 and circle 2: " + circle1.distance(circle2));
		
		System.out.println("Do circle 1 and circle 2 intersect?: " + circle1.intersects(circle2));
		
		// your additional tests should be placed below here
		//further testing the equals method
		System.out.println("Do circle 1 and circle 3 have the same radius and center?: " + circle1.equals(circle3));
		
		
		System.out.println("Do circle 1 and circle 4 have the same radius and center?: " + circle1.equals(circle4));
		
	
		System.out.println("Do circle 3 and circle 4 have the same radius and center?: " + circle3.equals(circle4));
		
		//further testing the isConcentric method
		System.out.println("Are circle 1 and circle 3 concentric?: " + circle1.isConcentric(circle3));
	
		System.out.println("Are circle 1 and circle 4 concentric?: " + circle1.isConcentric(circle4));
		
		System.out.println("Are circle 3 and circle 4 concentric?: " + circle3.isConcentric(circle4));
		
		//further testing the distance method
		System.out.println("The distance between circle 1 and circle 3: " + circle1.distance(circle3));
		
		System.out.println("The distance between circle 1 and circle 4: " + circle1.distance(circle4));
		
		System.out.println("The distance between circle 3 and circle 4: " + circle3.distance(circle4));
		
		//further testing intersects method
		System.out.println("Do circle 1 and circle 3 intersect?: " + circle1.intersects(circle3));
		
		System.out.println("Do circle 1 and circle 4 intersect?: " + circle1.intersects(circle4));
		
		System.out.println("Do circle 3 and circle 4 intersect?: " + circle3.intersects(circle4));
}
}



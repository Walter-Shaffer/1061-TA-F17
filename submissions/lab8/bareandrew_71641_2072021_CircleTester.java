//import java.util.Scanner;
/*
* CircleTester.java
* Author: Andrew Bare
* Submission Date: 10/27/17
*
* Purpose: 
* 
* This class contains the main method of our circle program
* it features calls to a circle class to define parts of a circle
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
		System.out.println("");	//spacer
		System.out.println("circle1 diameter: " + circle1.diameter());
		System.out.println("circle1 area: " + circle1.area());
		System.out.println("circle1 perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("");	//spacer
		System.out.println("circle2 diameter: " + circle2.diameter());
		System.out.println("circle2 area: " + circle2.area());
		System.out.println("circle2 perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("");	//spacer
		System.out.println("circle1 unit Circle?: " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("");	//spacer
		System.out.println("circle2 unit Circle?: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here
		
		//3 new circles to test
		Circle c1 = new Circle (0,0,2);
		Circle c2 = new Circle (3,4,3);
		Circle c3 = new Circle (3,4,5);
		
		//Print New Circles
		System.out.println("");//Spacer
		System.out.println("Circle 1:");
		System.out.println(c1);
		
		System.out.println("");//Spacer
		System.out.println("Circle 2:");
		System.out.println(c2);
		
		System.out.println("");//Spacer
		System.out.println("Circle 3:");
		System.out.println(c3);
		
		System.out.println("");//Spacer
		System.out.println("Test 1 All new Comparisons");
		System.out.println("Equal to Test 1?: " + c1.equals(c1));
		System.out.println("Equal to Test 2?: " + c1.equals(c2));
		System.out.println("Equal to Test 3?: " + c1.equals(c3));
		System.out.println("Concentric to Test 1?: " + c1.isConcentric(c1));
		System.out.println("Concentric to Test 2?: " + c1.isConcentric(c2));
		System.out.println("Concentric to Test 3?: " + c1.isConcentric(c3));
		System.out.println("Distance to Test 1?: " + c1.distance(c1));
		System.out.println("Distance to Test 2?: " + c1.distance(c2));
		System.out.println("Distance to Test 3?: " + c1.distance(c3));
		System.out.println("Intersects Test 1?: " + c1.isConcentric(c1));
		System.out.println("Intersects Test 2?: " + c1.isConcentric(c2));
		System.out.println("Intersects Test 3?: " + c1.isConcentric(c3));
		
		System.out.println("");//Spacer
		System.out.println("Test 2 All new Comparisons");
		System.out.println("Equal to Test 1?: " + c2.equals(c1));
		System.out.println("Equal to Test 2?: " + c2.equals(c2));
		System.out.println("Equal to Test 3?: " + c2.equals(c3));
		System.out.println("Concentric to Test 1?: " + c2.isConcentric(c1));
		System.out.println("Concentric to Test 2?: " + c2.isConcentric(c2));
		System.out.println("Concentric to Test 3?: " + c2.isConcentric(c3));
		System.out.println("Distance to Test 1?: " + c2.distance(c1));
		System.out.println("Distance to Test 2?: " + c2.distance(c2));
		System.out.println("Distance to Test 3?: " + c2.distance(c3));
		System.out.println("Intersects Test 1?: " + c2.isConcentric(c1));
		System.out.println("Intersects Test 2?: " + c2.isConcentric(c2));
		System.out.println("Intersects Test 3?: " + c2.isConcentric(c3));
		
		System.out.println("");//Spacer
		System.out.println("Test 3 All new Comparisons");
		System.out.println("Equal to Test 1?: " + c3.equals(c1));
		System.out.println("Equal to Test 2?: " + c3.equals(c2));
		System.out.println("Equal to Test 3?: " + c3.equals(c3));
		System.out.println("Concentric to Test 1?: " + c3.isConcentric(c1));
		System.out.println("Concentric to Test 2?: " + c3.isConcentric(c2));
		System.out.println("Concentric to Test 3?: " + c3.isConcentric(c3));
		System.out.println("Distance to Test 1?: " + c3.distance(c1));
		System.out.println("Distance to Test 2?: " + c3.distance(c2));
		System.out.println("Distance to Test 3?: " + c3.distance(c3));
		System.out.println("Intersects Test 1?: " + c3.isConcentric(c1));
		System.out.println("Intersects Test 2?: " + c3.isConcentric(c2));
		System.out.println("Intersects Test 3?: " + c3.isConcentric(c3));
		
		
		//Tests-Apparently not done correctly------------------------------------------------------
//		//Get Input for test case
//		Scanner kb = new Scanner(System.in);
//		
//		System.out.println("");//Spacer
//		System.out.println("First Circle: Input all the parts of a circle in this order:\n"
//				+ "x location, y location, radius");
//		Circle test1 = new Circle(kb.nextDouble(), kb.nextDouble(), kb.nextDouble());
//		System.out.println("");//Spacer
//		System.out.println(test1);
//		System.out.println("");//Spacer
//		
//		System.out.println("Second Circle: Input all the parts of a circle in this order:\n"
//				+ "x location, y location, radius");
//		Circle test2 = new Circle(kb.nextDouble(), kb.nextDouble(), kb.nextDouble());
//		System.out.println("");//Spacer		
//		System.out.println(test2);
//		System.out.println("");//Spacer
//		
//		System.out.println("Are they equal?");//Spacer
//		System.out.println(test1.equals(test2));
//		System.out.println("");//Spacer
//		
//		System.out.println("Are they concentric?");//Spacer
//		System.out.println(test1.isConcentric(test2));
//		System.out.println("");//Spacer
//		
//		System.out.println("This is the distance between the two Circles");//Spacer
//		System.out.println(test1.distance(test2));
//		System.out.println("");//Spacer
//		
//		System.out.println("whether or not they intersect");//Spacer
//		System.out.println(test1.intersects(test2));
//		System.out.println("");//Spacer
		
	}
	
}

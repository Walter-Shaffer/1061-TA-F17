/*
* CircleTester.java
* Author: Heather Wright
* Submission Date: October 27, 2017
*
* Purpose: This purpose of this program is to test the methods
* written in circle.java. It has methods to measure the distance
* between the two circles, to test if they are equal, if they
* intersect, and if they are concentric. It also has methods to assign 
* values to the data of each circle.
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
		
		System.out.println("circle1=" + circle1); //prints circle1
		System.out.println("circle2=" + circle2); //prints circle2
		
		circle1.setRadius(-2.0); //negative value doesn't change the radius of circle1
		circle1.setX(-3.0); //sets x values of circle 1 to -3.0
		circle1.setY(4.0); //sets y values of circle 1 to 4.0
		
		System.out.println(circle1); //prints the x,y, and radius values of circle1

		circle2.setRadius(5.3); // sets radius of circle2 to 5.3
		
		System.out.println(circle2); //prints x, y, and radius for circle2
		
		System.out.println("\ndiameter of circle1: " + circle1.diameter());
		System.out.println("area of circle1: " + circle1.area());
		System.out.println("perimeter of circle1: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("diameter of circle2: " + circle2.diameter());
		System.out.println("area of circle2: " + circle2.area());
		System.out.println("perimete of circle2: " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("circle1 is unit circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("circle2 is unit circle: " + circle2.isUnitCircle());
		
		//test1
		System.out.println("\nTest 1");
		System.out.println(circle1.equals(circle2));
		System.out.println(circle1.isConcentric(circle2));
		System.out.println(circle1.distance(circle2));
		System.out.println(circle1.intersects(circle2));
		
		//test 2
		System.out.println("\nTest 2");
		Circle circle3 = new Circle(0.0,0.0,1); //create new variable of circle called circle3
		Circle circle4 = new Circle(0.0,0.0,1); //create new variable of circle called circle4
		System.out.println(circle3.equals(circle4));
		System.out.println(circle3.isConcentric(circle4));
		System.out.println(circle3.distance(circle4));
		System.out.println(circle3.intersects(circle4));
		
		//test 3
		System.out.println("\nTest 3");
		Circle circle5 = new Circle(2.0,3.5,4); //create new variable of circle called circle5
		Circle circle6 = new Circle(3.5,7,10); //create new variable of circle called circle6
		System.out.println(circle5.equals(circle6));
		System.out.println(circle5.isConcentric(circle6));
		System.out.println(circle5.distance(circle6));
		System.out.println(circle5.intersects(circle5));
	}
	
}

//*******************************************************
/*
 CircleTester.java
 Author: Hunter Singletary
 Submission Date: 10/27/2017

 Purpose: Contains tests for the Circle class.
 Statement of Academic Honesty:

 The following code represents my own work. I have neither
 received nor given inappropriate assistance. I have not copied
 or modified code from any source other than the course webpage
 or the course textbook. I recognize that any unauthorized
 assistance or plagiarism will be handled in accordance
 with the policies at Clemson University and the
 policies of this course. I recognize that my work is based
 on an assignment created by the School of Computing
 at Clemson University. Any publishing or posting
 of source code for this project is strictly prohibited
 unless you have written consent from the instructor.

*/
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
		System.out.println("\ncircle2="+circle2);
		
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
		
		System.out.println("\ncircle1=" + circle1);
		
		// set the circle2 radius to 5.3
		
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("\ncircle2=" + circle2);
		
		// print circle1 diameter, area and perimeter

		
		System.out.println("\nCircle1 diameter= " + circle1.diameter());
		System.out.println("Circle1 area= " + circle1.area());
		System.out.println("Circle1 perimeter= " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		
		System.out.println("\nCircle2 diameter= " + circle2.diameter());
		System.out.println("Circle2 area= " + circle2.area());
		System.out.println("Circle2 perimeter+ " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		
		System.out.println("\nCircle1 is a unit circle = " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		
		System.out.println("Circle2 is a unit circle = " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here
	
	
		// This series of tests will test if the circles I create are equal to one another
		System.out.println("\nTests for Equality:\n");
		Circle circle3= new Circle(0.0,0.0,5);
		Circle circle4= new Circle(0.0,0.0,5);
		System.out.println("\ncircle3=" + circle3);
		System.out.println("\ncircle4=" + circle4);
		System.out.println("\nCircle3 is equal to Circle4 = "+circle3.equals(circle4));
		
		Circle circle5= new Circle(-2.0,7.0, 6);
		Circle circle6= new Circle(-2.0,7.0,4);
		System.out.println("\ncircle5=" + circle5);
		System.out.println("\ncircle6=" + circle6);
		System.out.println("\nCircle5 is equal to Circle6 = "+circle5.equals(circle6));
		
		Circle circle7= new Circle(3.0,5.0,5);
		Circle circle8= new Circle(3.0,5.0,6);
		System.out.println("\ncircle7=" + circle7);
		System.out.println("\ncircle8=" + circle8);
		System.out.println("\nCircle7 is equal to Circle8 = " + circle7.equals(circle8));
		
		// This series of tests will test to see if the circles are concentric
		System.out.println("\nTests for Concentrism:\n");
		
		Circle circle9= new Circle(3.0,-4.0,5);
		Circle circle10= new Circle(0.0,0.0,2);
		System.out.println("\ncircle9=" + circle9);
		System.out.println("\ncircle10=" + circle10);
		System.out.println("\nCircle9 and Circle10 are concentric = "+circle9.isConcentric(circle10));
		
		Circle circle11= new Circle(-10.0,0.0,9);
		Circle circle12= new Circle(-10.0,0.0,2);
		System.out.println("\ncircle11=" + circle11);
		System.out.println("\ncircle12=" + circle12);
		System.out.println("\nCircle11 and Circle12 are concentric = "+circle11.isConcentric(circle12));
		
		Circle circle13= new Circle(-1.0,2.0,6);
		Circle circle14= new Circle(-1.0,2.0,6);
		System.out.println("\ncircle13=" + circle13);
		System.out.println("\ncircle14=" + circle14);
		System.out.println("\nCircle13 and Circle14 are concentric = "+circle13.isConcentric(circle14));
		
		// Tests to see if circles intersect
		System.out.println("\nTests for intersection:\n");
		
		Circle circle15= new Circle(3.0,5.0,10);
		Circle circle16= new Circle(1.0,6.0,5);
		System.out.println("\ncircle15=" + circle15);
		System.out.println("\ncircle16=" + circle16);
		System.out.println("\nCircle15 and Circle 16 intersect = "+circle15.intersects(circle16));
		
		Circle circle17= new Circle(10.0,7.0,2);
		Circle circle18= new Circle(2.0,0.0,4);
		System.out.println("\ncircle17=" + circle17);
		System.out.println("\ncircle18=" + circle18);
		System.out.println("\nCircle17 and Circle18 intersect = "+circle17.intersects(circle18));
		
		Circle circle19= new Circle(-7.0,-6.0,9);
		Circle circle20= new Circle(-4.0,-6.0,4);
		System.out.println("\ncircle19=" + circle19);
		System.out.println("\ncircle20=" + circle20);
		System.out.println("\nCircle19 and Circle20 intersect = "+circle19.intersects(circle20));
	
		//Displays the distance between two circle's radii
		System.out.println("\nTests for Distance:\n");
		
		System.out.println("The distance between Circle9 and Circle5 = "+circle5.distance(circle9));
		System.out.println("The distance between Circle7 and Circle20 = "+circle7.distance(circle20));
		System.out.println("The distance between Circle1 and Circle6 = "+circle1.distance(circle6));
	}
	
}

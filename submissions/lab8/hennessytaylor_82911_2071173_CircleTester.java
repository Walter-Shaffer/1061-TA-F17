//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
/*
	* CircleTester.java
	* Author: Taylor Hennessy
	* Submission Date: 10/24/2017
	*
	* Purpose: A client to test the functionality of objects 
	* of the class Circle.
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
public class CircleTester{
	
	public static void main(String[] args) {
		
		Circle circle1= new Circle(0.0,0.0,2);
		Circle circle2= new Circle(2.0,1.0,1);
		
		//my test circles
		Circle circle3= new Circle(0.0, 0.0, 6.0);
		Circle circle4= new Circle(0.0, 5.0, 3.0);
		Circle circle5= new Circle(0.0,0.0, 1.0);
		Circle circle6= new Circle(0.0,187, 1.0);
		Circle circle7= new Circle(0.0,187, 1.0);
		
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
		System.out.println("center: ("+ circle1.getX() + "," + circle1.getY() +")");
		System.out.println("radius: "+ circle1.getRadius());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(circle2.toString());
		
		// print circle1 diameter, area and perimeter
		System.out.println(circle1.diameter());
		System.out.println(circle1.area());
		System.out.println(circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println(circle2.diameter());
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("circle1 is a unit circle: " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("circle2 is a unit circle: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here
		
		//test IS CONCENTRIC
		// only circles 3 and 5 are concentric - test
		System.out.println("circle3 and circle5 are concentric: " + circle3.isConcentric(circle5));
		System.out.println("circle5 and circle3 are concentric: " + circle5.isConcentric(circle3));
		System.out.println("circle4 and circle3 are concentric: " + circle4.isConcentric(circle3));
				
		// circles 3 and 5 intersect, but circles 4 and 6 do not - test
		System.out.println("circle3 and circle5 are intersecting: " + circle3.intersects(circle5));
		System.out.println("circle5 and circle4 are intersecting: " + circle5.intersects(circle4));
		System.out.println("circle6 and circle4 are intersecting: " + circle6.intersects(circle4));
			
		//find distance between the circles to ensure intersects method is correct
		System.out.println("distance between circle3 and circle5: " + circle3.distance(circle5));
		System.out.println("distance between circle5 and circle4: " + circle5.distance(circle4));
		System.out.println("distance between circle6 and circle4: " + circle6.distance(circle4));
		
		//only circles 6 and 7 are equal - test
		System.out.println("circle3 and circle5 are equal: " + circle3.equals(circle5));
		System.out.println("circle5 and circle4 are equal: " + circle5.equals(circle4));
		System.out.println("circle6 and circle7 are equal: " + circle6.equals(circle7));
	

	
	}
	
}

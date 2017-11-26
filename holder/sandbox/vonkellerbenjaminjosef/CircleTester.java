//*******************************************************
// Author: Benjamin VonKeller
//Submission Date: 10/26/2017
//Purpose: Sets and returns various values and tests if circles are equal, concentric, and calculates distance between and if they intersect.
//Statement of Academic Honesty:
//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance
//with the policies at Clemson University and the
//policies of this course. I recognize that my work is based
//on an assignment created by the School of Computing
//at Clemson University. Any publishing or posting
//of source code for this project is strictly prohibited
//unless you have written consent from the instructor.
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
		System.out.println("Center: (" + circle1.getX() + ", " + circle1.getY() + ")\nradius: " + circle1.getRadius());
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("Center: (" + circle2.getX() + ", " + circle2.getY() + ")\nradius: " + circle2.getRadius());
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("The circle is a unit circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("The circle is a unit circle: " + circle2.isUnitCircle());
		// your additional tests should be placed below here
		System.out.println("Circle 1 and 2 equal?" + circle1.equals(circle2));
		circle1 = new Circle(0, 0, 1);
		circle2 = new Circle(0, 0, 1);
		System.out.println("Circle 1 and 2 equal?" + circle1.equals(circle2));
		circle1.setRadius(5);
		System.out.println("Circle 1 and 2 equal?" + circle1.equals(circle2));
		System.out.println("Circle 1 and 2 concentric? " + circle1.isConcentric(circle2));
		circle1 = new Circle(1,0,1);
		circle2 = new Circle(1,4,1);
		System.out.println("Circle 1 and 2 concentric? " + circle1.isConcentric(circle2));
		circle1.setY(0);
		System.out.println("Circle 1 and 2 concentric? " + circle1.isConcentric(circle2));
		System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
		circle1 = new Circle(0,0,1);
		System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
		circle2 = new Circle(0,0,1);
		System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
		circle1 = new Circle(1423,0,42);
		System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
		System.out.println("Do the circles intersect? " + circle1.intersects(circle2));
		circle1 = new Circle(0,0,5);
		circle2 = new Circle(1,0,5);
		System.out.println("Do the circles intersect? " + circle1.intersects(circle2));
		circle1 = new Circle(20,0,5);
		System.out.println("Do the circles intersect? " + circle1.intersects(circle2));
		
	}
	
}

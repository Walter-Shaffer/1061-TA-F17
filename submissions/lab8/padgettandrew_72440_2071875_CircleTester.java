/*
* CircleTester.java
* Author: Andrew Padgett
* Submission Date: 10/26/17
*
* Purpose: Creates circle objects with a center and radius that 
* 		   calls on methods in Circle.java to perform calculations
* 		   on the circles and compare them to each other.
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
		
		Circle circle1 = new Circle(0.0,0.0,2);
		Circle circle2 = new Circle(2.0,1.0,1);
		
		System.out.println("Circle 1\n" + circle1 + "\n");
		System.out.println("Circle 2\n" + circle2 + "\n");
		
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
		
		System.out.println("Circle 1\n" + circle1 + "\n");
		
		circle2.setRadius(5.3);
		
		System.out.println("Circle 2\n" + circle2 + "\n");
		
		//Prints diameter, area, and perimeter of circle 1
		System.out.println("Circle 1\n" + "Diameter = \t" + circle1.diameter() + 
		"\nArea = \t\t" + circle1.area() + "\nPerimeter = \t" + circle1.perimeter() + "\n");
		
		//Prints diameter, area, and perimeter of circle 2
		System.out.println("Circle 2\n" + "Diameter = \t" + circle2.diameter() + 
		"\nArea = \t\t" + circle2.area() + "\nPerimeter = \t" + circle2.perimeter());
		
		//Displays whether or not circle 1 and circle 2
		//are unit circles
		System.out.println("Circle 1 is a Unit Circle: \t" + circle1.isUnitCircle());		
		System.out.println("Circle 2 is a Unit Circle: \t" + circle2.isUnitCircle() + "\n");
		
		//writeOutput method calls on equals method,
		//isConentric method, distance method, and intersect
		//method then prints out results of circle 1 and 2
		System.out.println("Circle 1 and Circle 2");
		circle1.writeOutput(circle1, circle2);
		
		//compares circle 2 and circle 3 using writeOutput
		Circle circle3 = new Circle(2, 1, 5.3);
		System.out.println("Circle 2 and Circle 3");
		circle2.writeOutput(circle2, circle3);
		
		//compares circle 3 and circle 4 using writeOutput
		Circle circle4 = new Circle(10, 7, 2.8);
		System.out.println("Circle 3 and Circle 4");
		circle3.writeOutput(circle3, circle4);
		
		//compares circle 4 and circle 5 using writeOutput
		Circle circle5 = new Circle(10, 7, 7.2);
		System.out.println("Circle 4 and Circle 5");
		circle4.writeOutput(circle4, circle5);
		

	}
	
}
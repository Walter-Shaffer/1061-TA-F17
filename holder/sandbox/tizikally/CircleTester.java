/* circleTester.Java
* Author: Allison Tizik
* Submission Date: 10/26/17
* Purpose: The program recieves methds from the circle
* and prints out the answers that are asked. It prints 
* out the x and y values, radius, area, permiter, diameter,
* the distance, if they are unit circles, if they are equal 
* circles, if they are intersect, and if they are concentric.
* By the circles declared in this program and the numbers they 
* are declared it runs through the Circle program and produces
* they necessary answers.
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
		Circle circle3 = new Circle (4.0,2.0,1);
		
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
		System.out.println("\nCircle 1\n" + circle1.toString());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("\nCircle 2\n" + circle2.toString());
		
		// print circle3 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("\nCircle 3\n" + circle3.toString());
		
		// print circle1 diameter, area and perimeter
		System.out.println("\nCircle 1\n" +("Diameter: ")  + circle1.diameter() + 
				("\nArea: ") + circle1.area() + "\nPerimeter: " +circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("\nCircle 2\n" +("Diameter: ")  + circle2.diameter() + 
				("\nArea: ") + circle2.area() + "\nPerimeter: " +circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("\nCircle 1 is a unit circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is a unit circle: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here
				
		System.out.println("\nCircle 1 is equal to Circle 2: " + circle2.equals(circle1));
		System.out.println("Circle 1 is concentric to Circle 2: " + circle1.isConcentric(circle2));
		System.out.println("Distance between Circle 1 to Circle 2: " +circle1.distance(circle2));
		System.out.println("Circle 1 intersects Circle 2:" + circle1.intersects(circle2));
		
		System.out.println("\nCircle 1 is equal to Circle 3: " + circle1.equals(circle3));
		System.out.println("Circle 1 is concentric to Circle 3: " + circle1.isConcentric(circle3));
		System.out.println("Distance between Circle 1 to Circle 3: " +circle1.distance(circle3));
		System.out.println("Circle 1 intersects Circle 3: " + circle1.intersects(circle3));
		
		System.out.println("\nCircle 2 is equal to Circle 3: " + circle2.equals(circle3));
		System.out.println("Circle 2 is concentric to Circle 3: " + circle2.isConcentric(circle3));
		System.out.println("Distance between Circle 2 to Circle 3: " +circle2.distance(circle3));
		System.out.println("Circle 2 intersects Circle 3: " + circle2.intersects(circle3));
	}
	
}
 
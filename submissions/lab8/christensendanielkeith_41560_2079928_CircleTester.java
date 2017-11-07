/*
* CircleTester.java
* Author: Daniel Christensen
* Submission Date: 10/27/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
		
		System.out.println("circle1="+circle1+"\n");
		System.out.println("circle2="+circle2+"\n");
		
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
		
		System.out.println("circle1 =");
		System.out.println(circle1.toString()+"\n");
		
		// set the circle2 radius to 5.3
		
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("circle2 =");
		System.out.println(circle2.toString()+"\n");
		
		// print circle1 diameter, area and perimeter
		
		System.out.println("circle1 has the following characteristics:\n");
		System.out.printf("diameter\t= %2.2f%nperimeter\t= %2.2f%narea\t\t= %2.2f%n", circle2.diameter(), circle2.perimeter(), circle2.area());
		
		if (circle1.isUnitCircle()) {
			System.out.println("circle1 is a unit circle.");
		}
		else {
			System.out.println("circle1 is not a unit circle.");
		}
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()) {
			System.out.println("circle2 is a unit circle.");
		}
		else {
			System.out.println("circle2 is not a unit circle.\n");
		}
		// your additional tests should be placed below here
		//.equals tests
		Circle unitCircle = new Circle(0,0,1);
		Circle unitCircle1 = new Circle(0,0,1);
		
		System.out.println("Tests:\n");
		
		System.out.println(unitCircle.equals(unitCircle1));//returns true
		
		unitCircle1.setRadius(2);
		
		System.out.println(unitCircle.equals(unitCircle1));//returns false
		
		unitCircle1.setX(3);
		unitCircle1.setY(4);
		
		System.out.println(unitCircle.equals(unitCircle1)+"\n");//returns false
		
		//.isConcentric test
		
		unitCircle1.setRadius(1);
		unitCircle1.setY(0);
		unitCircle1.setX(0);
		
		System.out.println(unitCircle.isConcentric(unitCircle1));//returns false
		
		unitCircle1.setRadius(2);
		
		System.out.println(unitCircle.isConcentric(unitCircle1));//returns true
		
		unitCircle1.setRadius(1);
		unitCircle1.setX(3);
		
		System.out.println(unitCircle.isConcentric(unitCircle1) + "\n");//returns false
		
		//distance test
		
		unitCircle1.setX(0);
		
		System.out.println(unitCircle.distance(unitCircle1));//returns 0
		
		unitCircle1.setX(3);
		unitCircle1.setY(4);
		
		System.out.println(unitCircle.distance(unitCircle1));//returns 5
		
		unitCircle1.setX(3000000);
		unitCircle1.setY(4000000);
		
		System.out.println(unitCircle.distance(unitCircle1)+"\n");//returns 5000000
		
		//.intersects test
		
		unitCircle1.setX(0);
		unitCircle1.setY(0);
		
		System.out.println(unitCircle.intersects(unitCircle1));//returns true
		
		unitCircle1.setX(3000000);
		unitCircle1.setY(4000000);
		
		System.out.println(unitCircle.intersects(unitCircle1));//returns false
		
		unitCircle1.setRadius(5000000);
		
		System.out.println(unitCircle.intersects(unitCircle1));//returns true
		
	}
	
}

/* CircleTester.java 
 * Author:  Alex Dobrenen 
 * Submission Date:   October 27 
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Test the Functionality of the Circle Class
 * Statement of Academic Honesty:  
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
		System.out.println("Circle 1 =" + circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("Circle 2 =" + circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter());
		System.out.println("Perimeter: " +circle1.perimeter());
		System.out.println("Area: " +circle1.area());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter());
		System.out.println("Perimeter: " +circle2.perimeter());
		System.out.println("Area: " +circle2.area());
		// display whether circle1 is a unit circle
		System.out.println("Is it a unit Circle?: " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("Is it a unit Circle?: " + circle2.isUnitCircle());
		// your additional tests should be placed below here
		Circle circle3= new Circle(11.5,11.0,12);
		Circle circle4= new Circle(1.0,1.0,1.0);
		Circle circle5= new Circle(22.5, 13.1, 9);
		Circle circle6= new Circle(11.5,11.0,12);
		
		//Equals Testing
		System.out.println("Equals 3 & 5: " + circle3.equals(circle5));
		System.out.println("Equals 3 & 6: " + circle3.equals(circle6));
		System.out.println("Equals 5 & 4: " + circle5.equals(circle4));
		
		//isConcentric Testing
		System.out.println("Is it Concentric?  3 & 5?: " + circle3.isConcentric(circle5));
		System.out.println("Is it Concentric? 3 & 6" + circle3.isConcentric(circle6));
		System.out.println("Is it Concentric? 5 & 4" + circle5.isConcentric(circle4));
		
		////Distance testing
		System.out.println("Distance? 3 & 5: " + circle3.distance(circle5));
		System.out.println("Distance? 3 & 6: " + circle3.distance(circle6));
		System.out.println("Distance? 5 & 4: " + circle5.distance(circle4));
		
		//Intersects Testing
		System.out.println("Does it Intersect? 3 & 5: " + circle3.intersects(circle5));
		System.out.println("Does it Intersect? 3 & 6: " + circle3.intersects(circle6));
		System.out.println("Does it Intersect? 5 & 4: " + circle5.intersects(circle4));
		
	}
	
}

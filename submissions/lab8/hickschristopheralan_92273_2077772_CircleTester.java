/*
 * Circle.java
 * Author: Christopher Hicks
 * Submission Date 10/23/2017
 * 
 * Purpose: A client to test the functionality of objects of the class Circle.
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
		Circle circle3= new Circle(0.0,0.0,2);
		
		circle1.setX(-3.0);
		circle1.setRadius(-2.0); 
		circle1.setY(4.0);
		circle2.setRadius(5.3);
		
		
		// Prints out Center,and radius of Circles
		System.out.println("Circle 1 \n" +circle1 + "\n");
		System.out.println("Circle 2 \n" +circle2 + "\n");
		System.out.println("Circle 3 \n" +circle3 + "\n");
		//Prints out the Diameter, Area, and Perimeter of Circles
		System.out.println("Circle 1 \n" + "Diameter: " + circle1.diameter() + "\nArea: " + circle1.area() + "\nPerimeter: " +  circle1.perimeter()+ "\n");
		System.out.println("Circle 2 \n" + "Diameter: " + circle2.diameter() + "\nArea: " + circle2.area() + "\nPerimeter: " +  circle2.perimeter()+ "\n");
		System.out.println("Circle 3 \n" + "Diameter: " + circle3.diameter() + "\nArea: " + circle3.area() + "\nPerimeter: " +  circle3.perimeter()+ "\n");

			// Prints out true or false for unit circle
		
			if (circle1.isUnitCircle() == true){
				System.out.println("Circle 1 is a unit circle.");
			}else {System.out.println("Circle 1 is not a unit circle.");
			}
	
			if (circle2.isUnitCircle() == true){
				System.out.println("Circle 2 is a unit circle.");
			}else {System.out.println("Circle 2 is not a unit circle.");
			}

			if (circle3.isUnitCircle() == true){
				System.out.println("Circle 3 is a unit circle. \n");
			}else {System.out.println("Circle 3 is not a unit circle. \n");
			}
			
			//Prints to see if 2 circles are equal in size
			if (circle1.equals(circle2)== true){
				System.out.println("Circle 1 is equal to Circle 2.");
			}else {System.out.println("Circle 1 is not equal to Circle 2.");
			}
			
			if (circle2.equals(circle3)== true){
				System.out.println("Circle 2 is equal to Circle 3.");
			}else {System.out.println("Circle 2 is not equal to Circle 3.");
			}

			if (circle1.equals(circle3)== true){
				System.out.println("Circle 1 is equal to Circle 3.\n");
			}else {System.out.println("Circle 1 is not equal to Circle 3.\n");
			}
			
			//prints out if 2 circles are concentric
			if (circle1.isConcentric(circle2) == true){
				System.out.println("Circle 1 is concentric to Circle 2.");
			}else {System.out.println("Circle 1 is not concentric to Circle 2.");
			}
			if (circle2.isConcentric(circle3) == true){
				System.out.println("Circle 2 is concentric to Circle 3.");
			}else {System.out.println("Circle 2 is not concentric to Circle 3.");
			}
			if (circle1.isConcentric(circle3) == true){
				System.out.println("Circle 1 is concentric to Circle 3.\n");
			}else {System.out.println("Circle 1 is not concentric to Circle 3.\n");
			}
			// distance of 2 circles centers from one another
			System.out.println("Circle 1 is " + circle1.distance(circle2) + " units away from circle 2" );
			System.out.println("Circle 2 is " + circle2.distance(circle3) + " units away from circle 3" );
			System.out.println("Circle 1 is " + circle1.distance(circle3) + " units away from circle 3\n" );
			
			// Intersection of the circles
			if (circle1.intersects(circle2) == true){
				System.out.println("Circle 1 intersects with Circle 2.");
			}else {System.out.println("Circle 1 does not intersect with  Circle 2.");
			}
			if (circle2.intersects(circle3) == true){
				System.out.println("Circle 2 intersects with Circle 3.");
			}else {System.out.println("Circle 1 does not intersect with Circle 2.");
			}
			if (circle1.intersects(circle3) == true){
				System.out.println("Circle 1 intersects with  Circle 3.");
			}else {System.out.println("Circle 1 does not intersect with Circle 3.");
			}
	}
	
	
}


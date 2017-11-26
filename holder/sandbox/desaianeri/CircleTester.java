//package lab8;
/*				
 * [CircleTester].java 				
 * Author: [Aneri Desai]				
 * Submission Date: [10/24/2017]				
 * 				
 * Purpose: In the lab we learned how to do object oriented programming. Declare instance variables, get method,
 *  set method, how to call on other methods and we also learned about the accessor and mutator methods. 				
 * 				
 *  Statement of Academic Honesty:				
 *  				
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 				
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.				
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies				
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 				
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 				
 *  project is strictly prohibited unless you have written consent from the instructor.  				
 */	
public class CircleTester{			
			
	public static void main(String[] args) {		
			
		Circle circle1= new Circle(0.0,0.0,2);	
		Circle circle2= new Circle(2.0,1.0,1);
		//Circle Circle2 = new Circle(0.0,0.0,2);
		System.out.println("Circle1="+circle1);	
		System.out.println("Circle2="+circle2);
		
		circle1.setRadius(-2.0);
		//circle1.setRadius(1); 	
		System.out.println("Circle1="+circle1);
		
		circle1.setX(-3.0);	
		circle1.setY(4.0);	
		circle2.setRadius(5.3); 	
		System.out.println("Circle2="+circle2);
		System.out.println();
		
		System.out.println("Diameter of circle1="+circle1.diameter()); //print statements for method in the circle class 
		System.out.println();
		System.out.println("Area of circle1="+circle1.area());
		System.out.println();
		System.out.println("Perimeter of circle1="+circle1.perimeter());
		System.out.println();
		System.out.println("Diameter of circle2="+circle2.diameter());
		System.out.println();
		System.out.println("Area of circle2="+circle2.area());
		System.out.println();
		System.out.println("Perimeter of circle2="+circle2.perimeter());
		System.out.println();
		
		System.out.println(circle1.isUnitCircle());	
		System.out.println(circle2.isUnitCircle());
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("Tests for equal method-"); //3 tests and print statements for each method 
		circle1.setRadius(5.0);
		circle2.setRadius(5.0);
		circle1.setX(3.0);	
		circle1.setY(4.0);
		circle2.setX(3.0);	
		circle2.setY(4.0);
		System.out.println("The method is:" + circle1.equals(circle2));
		circle1.setRadius(2.0);
		circle2.setRadius(5.0);
		circle1.setX(3.0);	
		circle1.setY(4.0);
		circle2.setX(3.0);	
		circle2.setY(4.0);
		System.out.println("The method is:" +circle1.equals(circle2));
		circle1.setRadius(5.0);
		circle2.setRadius(5.0);
		circle1.setX(7.0);	
		circle1.setY(3.0);
		circle1.setX(8.0);	
		circle1.setY(6.0);
		System.out.println("The method is:" +circle1.equals(circle2));
		circle1.setRadius(5.0);
		circle2.setRadius(4.0);
		circle1.setX(7.0);	
		circle1.setY(3.0);
		circle2.setX(8.0);	
		circle2.setY(6.0);
		System.out.println("The method is:" +circle1.equals(circle2));
		System.out.println();
		
		System.out.println("Tests for Concentric method-");
		circle1.setX(3.0);	
		circle1.setY(4.0);
		circle2.setX(3.0);	
		circle2.setY(4.0);
		System.out.println("The method is:" +circle1.isConcentric(circle2));
		circle1.setX(7.0);	
		circle1.setY(3.0);
		circle1.setX(8.0);	
		circle1.setY(6.0);
		System.out.println("The method is:" +circle1.isConcentric(circle2));
		circle1.setX(7.0);	
		circle1.setY(7.0);
		circle2.setX(7.0);	
		circle2.setY(7.0);
		System.out.println("The method is:" +circle1.isConcentric(circle2));
		System.out.println();
		
		System.out.println("Tests for distance method-");
		circle1.setX(4.0);	
		circle1.setY(0.0);
		circle2.setX(2.0);	
		circle2.setY(0.0);
		System.out.println("The distance is:" + circle1.distance(circle2));
		circle1.setX(32.0);	
		circle1.setY(60.0);
		circle2.setX(30.0);	
		circle2.setY(16.0);
		System.out.println("The distance is:"+ circle1.distance(circle2));
		circle1.setX(6.0);	
		circle1.setY(0.0);
		circle2.setX(3.0);	
		circle2.setY(0.0);
		System.out.println("The distance is:"+circle1.distance(circle2));
		System.out.println();
		
		System.out.println("Tests for intersects method-");
		circle1.setRadius(5.0);
		circle2.setRadius(4.0);
		circle1.setX(4.0);	
		circle1.setY(0.0);
		circle2.setX(2.0);	
		circle2.setY(0.0);
		System.out.println("The method is:"+ circle1.intersects(circle2));
		circle1.setRadius(5.0);
		circle2.setRadius(4.0);
		circle1.setX(32.0);	
		circle1.setY(60.0);
		circle2.setX(30.0);	
		circle2.setY(16.0);
		System.out.println("The method is:"+ circle1.intersects(circle2));
		circle1.setRadius(2.0);
		circle2.setRadius(1.0);
		circle1.setX(6.0);	
		circle1.setY(0.0);
		circle2.setX(3.0);	
		circle2.setY(0.0);
		System.out.println("The method is:"+ circle1.intersects(circle2));
		}		
			
}				

/* 
 * 
 * CircleTester.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/23/17 
 * 
 * Purpose: The purpose of this program is to set the coordinates and the radius in order to test the Circle class.
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
		System.out.println("Circle1=center: ("+circle1.getX()+","+circle1.getY()+")");
		System.out.println("\tradius: "+circle1.getRadius()+"\n");
		
		circle2.setRadius(5.3);  // set the circle2 radius to 5.3
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("Circle2=center: ("+circle2.getX()+","+circle2.getY()+")");
		System.out.println("\tradius: "+circle2.getRadius()+"\n");
		
		// print circle1 diameter, area and perimeter
		System.out.println("diameter: "+circle1.diameter());
		System.out.println("area: "+circle1.area());
		System.out.println("perimeter: "+circle1.perimeter()+"\n");
		// print circle2 diameter, area and perimeter
		System.out.println("diameter: "+circle2.diameter());
		System.out.println("area: "+circle2.area());
		System.out.println("perimeter: "+circle2.perimeter()+"\n");
		// display whether circle1 is a unit circle
		System.out.println("circle1 is a unit circle: "+circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("circle2 is a unit circle: "+circle2.isUnitCircle());
		// your additional tests should be placed below here
		System.out.println("does circle1 equal circle2: "+circle1.equals(circle2));
		System.out.println("is circle1 concentric: "+circle1.isConcentric(circle2));
		System.out.println("distance between circle1 and circle2: "+circle1.distance(circle2));
		System.out.println("the circles intercect: "+circle1.intersects(circle2)+"\n");
		
		System.out.println("Test 1");
		circle1.setX(0);
		circle1.setY(0);
		circle1.setRadius(1);
		circle2.setX(0);
		circle2.setY(0);
		circle2.setRadius(1);
		System.out.println("does circle1 equal circle2: "+circle1.equals(circle2));
		System.out.println("is circle1 concentric: "+circle1.isConcentric(circle2));
		System.out.println("distance between circle1 and circle2: "+circle1.distance(circle2));
		System.out.println("the circles intercect: "+circle1.intersects(circle2)+"\n");
		
		System.out.println("Test 2");
		circle1.setX(3);
		circle1.setY(3);
		circle1.setRadius(7);
		circle2.setX(3);
		circle2.setY(3);
		circle2.setRadius(2);
		System.out.println("does circle1 equal circle2: "+circle1.equals(circle2));
		System.out.println("is circle1 concentric: "+circle1.isConcentric(circle2));
		System.out.println("distance between circle1 and circle2: "+circle1.distance(circle2));
		System.out.println("the circles intercect: "+circle1.intersects(circle2));
		
		System.out.println("Test 3");
		circle1.setX(6);
		circle1.setY(2);
		circle1.setRadius(3);
		circle2.setX(4);
		circle2.setY(1);
		circle2.setRadius(3);
		System.out.println("does circle1 equal circle2: "+circle1.equals(circle2));
		System.out.println("is circle1 concentric: "+circle1.isConcentric(circle2));
		System.out.println("distance between circle1 and circle2: "+circle1.distance(circle2));
		System.out.println("the circles intercect: "+circle1.intersects(circle2)+"\n");
	}
	
}
